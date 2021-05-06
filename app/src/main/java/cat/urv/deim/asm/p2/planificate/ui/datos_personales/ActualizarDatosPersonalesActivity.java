package cat.urv.deim.asm.p2.planificate.ui.datos_personales;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

import cat.urv.deim.asm.p2.planificate.MainActivity;
import cat.urv.deim.asm.p2.planificate.R;
import cat.urv.deim.asm.p2.planificate.entidades.Usuaria;

public class ActualizarDatosPersonalesActivity extends AppCompatActivity  {
    EditText nombre, email,telefono;

    RequestQueue request;
    JsonObjectRequest jsonObjectRequest;
    StringRequest stringRequest;//SE MODIFICA

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actualizar_datos_personales);
        nombre=findViewById(R.id.nombre);
        email=findViewById(R.id.email);
        telefono=findViewById(R.id.telefono);

        request= Volley.newRequestQueue(getApplicationContext());

        SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);

        if(preferences.getBoolean("signup_google",true)){

            cargarDatos();

        }
        else{

            cargarDatosGoogle();

        }
    }

    private void cargarDatosGoogle() {

        SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);

        String url="http://192.168.0.100/usuarias/consultarUsuaria.php?email="+preferences.getString("email_usuaria","");
        jsonObjectRequest=new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {

                Usuaria miUsuaria=new Usuaria();

                JSONArray json=response.optJSONArray("usuarias");
                JSONObject jsonObject=null;

                try {
                    assert json != null;
                    jsonObject=json.getJSONObject(0);
                    miUsuaria.setNombre(jsonObject.optString("nombre"));
                    miUsuaria.setTelefono(jsonObject.optString("telefono"));
                    miUsuaria.setEmail(jsonObject.optString("email"));

                }
                catch (JSONException e) {
                    e.printStackTrace();
                }

                nombre.setText(miUsuaria.getNombre());
                email.setText(miUsuaria.getEmail());
                email.setFocusable(false);  //para NO modificar
              //  nombre.setFocusable(false);  //para NO modificar
                telefono.setText(miUsuaria.getTelefono());

                // nombre.setText(Objects.requireNonNull(firebaseAuth.getCurrentUser()).getDisplayName());
                //  email.setText(firebaseAuth.getCurrentUser().getEmail());

                // telefono.setText(preferences.getString("telefono_usuaria", "")); // por defecto es true


            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(),"No se pudo consultar"+error.toString(),Toast.LENGTH_LONG).show();

            }
        });

        request.add(jsonObjectRequest);

    }

    private void cargarDatos() {

        SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);

        String url="http://192.168.0.100/usuarias/consultarUsuaria.php?email="+preferences.getString("email_usuaria","");
        jsonObjectRequest=new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {

                Usuaria miUsuaria=new Usuaria();

                JSONArray json=response.optJSONArray("usuarias");
                JSONObject jsonObject=null;

                try {
                    assert json != null;
                    jsonObject=json.getJSONObject(0);
                    miUsuaria.setNombre(jsonObject.optString("nombre"));
                    miUsuaria.setTelefono(jsonObject.optString("telefono"));
                    miUsuaria.setEmail(jsonObject.optString("email"));

                }
                catch (JSONException e) {
                    e.printStackTrace();
                }

                nombre.setText(miUsuaria.getNombre());
                email.setText(miUsuaria.getEmail());
                email.setFocusable(false);  //para NO modificar
                telefono.setText(miUsuaria.getTelefono());


            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(),"No se pudo consultar"+error.toString(),Toast.LENGTH_LONG).show();

            }
        });

        request.add(jsonObjectRequest);

            /*nombre.setText(preferences.getString("nombre_usuaria", "")); // por defecto es true
            email.setText(preferences.getString("email_usuaria", "")); // por defecto es true
            telefono.setText(preferences.getString("telefono_usuaria", "")); // por defecto es true*/
    }


    public void actualizar(View view) {
        SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);
        SharedPreferences.Editor objEditor = preferences.edit();

        String url="http://192.168.0.100/usuarias/actualizarUsuaria.php";
        //CONTROL DE ACTUALIZACION/VALIDACION DE DATOS PERSONALES
        if (preferences.getBoolean("signup_google", true)) {
            if (!preferences.getString("nombre_usuaria", "").isEmpty() && !preferences.getString("email_usuaria", "").isEmpty()) {
                if (telefono.length() == 9) {


                    stringRequest = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            Toast.makeText(getApplicationContext(), "Se ha Actualizado con exito", Toast.LENGTH_SHORT).show();

                        }
                    }, new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {
                            Toast.makeText(getApplicationContext(), "No se ha podido conectar", Toast.LENGTH_SHORT).show();

                        }
                    }){
                        @Override
                        protected Map<String, String> getParams() throws AuthFailureError {
                            String email2=email.getText().toString();
                            String nombre2=nombre.getText().toString();
                            String telefono2=telefono.getText().toString();


                            Map<String,String> parametros=new HashMap<>();
                            parametros.put("email",email2);
                            parametros.put("nombre",nombre2);
                            parametros.put("telefono",telefono2);

                            return parametros;
                        }
                    };

                    request.add(stringRequest);


                    objEditor.putString("nombre_usuaria", nombre.getText().toString()); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
                    objEditor.apply();

                    objEditor.putString("email_usuaria", email.getText().toString());
                    objEditor.apply();

                    objEditor.putString("telefono_usuaria", telefono.getText().toString());
                    objEditor.apply();
                    Intent i = new Intent(this, MainActivity.class);
                    startActivity(i);
                    finish();
                } else {
                    Toast.makeText(this, "¡Revisa tus datos, son erroneos!", Toast.LENGTH_SHORT).show();
                }
            }
        } else {
            if (!preferences.getString("nombre_usuaria", "").isEmpty() && !preferences.getString("email_usuaria", "").isEmpty()) {

          /*  FirebaseAuth firebaseAuth=FirebaseAuth.getInstance();
            nombre.setText(Objects.requireNonNull(firebaseAuth.getCurrentUser()).getDisplayName());
            objEditor.putString("nombre_usuaria", nombre.getText().toString());
            objEditor.apply();

            email.setText(firebaseAuth.getCurrentUser().getEmail());
            objEditor.putString("email_usuaria", email.getText().toString());
            objEditor.apply();

            nombre.setFocusable(false);  //para NO modificar*/
            email.setFocusable(false);  //para NO modificar
                if (telefono.length() == 9&& nombre.getText().toString() != null) {


                    stringRequest=new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {

                            Toast.makeText(getApplicationContext(), "Se ha Actualizado con exito", Toast.LENGTH_SHORT).show();
                        }
                    }, new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {
                            Toast.makeText(getApplicationContext(),"No se ha podido conectar",Toast.LENGTH_SHORT).show();
                        }
                    }){
                        @Override
                        protected Map<String, String> getParams() throws AuthFailureError {
                            String email2=email.getText().toString();
                            String nombre2=nombre.getText().toString();
                            String telefono2=telefono.getText().toString();


                            Map<String,String> parametros=new HashMap<>();
                            parametros.put("email",email2);
                            parametros.put("nombre",nombre2);
                            parametros.put("telefono",telefono2);

                            return parametros;
                        }
                    };

                    request.add(stringRequest);

                    objEditor.putString("nombre_usuaria", nombre.getText().toString());
                    objEditor.apply();
                    objEditor.putString("telefono_usuaria", telefono.getText().toString());
                    objEditor.apply();
                    Intent i = new Intent(this, MainActivity.class);
                    startActivity(i);
                    finish();

                } else {
                    Toast.makeText(this, "¡Tu móvil es incorrecto!", Toast.LENGTH_SHORT).show();
                }
            }
        }
    }

}