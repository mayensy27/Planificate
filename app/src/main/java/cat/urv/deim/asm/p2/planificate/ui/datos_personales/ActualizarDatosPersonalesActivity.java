package cat.urv.deim.asm.p2.planificate.ui.datos_personales;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
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

public class ActualizarDatosPersonalesActivity extends AppCompatActivity {
    EditText edad, email;

    RequestQueue request;
    JsonObjectRequest jsonObjectRequest;
    StringRequest stringRequest;//SE MODIFICA

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actualizar_datos_personales);
        edad = findViewById(R.id.edad);
        email = findViewById(R.id.email);

        request = Volley.newRequestQueue(getApplicationContext());

        SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);

        if (preferences.getBoolean("signup_google", true)) {

            cargarDatos();

        } else {

            cargarDatosGoogle();

        }
    }

    private void cargarDatosGoogle() {

        SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);

        String url = "https://pillplanusuarias.000webhostapp.com/consultarUsuaria.php?email=" + preferences.getString("email_usuaria", "");
        jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, url, null, response -> {

            Usuaria miUsuaria = new Usuaria();

            JSONArray json = response.optJSONArray("usuarias");
            JSONObject jsonObject;

            try {
                assert json != null;
                jsonObject = json.getJSONObject(0);
                miUsuaria.setEdad(jsonObject.optString("edad"));
                miUsuaria.setEmail(jsonObject.optString("email"));

            } catch (JSONException e) {
                e.printStackTrace();
            }

            edad.setText(miUsuaria.getEdad());
            email.setText(miUsuaria.getEmail());
            email.setFocusable(false);  //para NO modificar


        }, error -> Toast.makeText(getApplicationContext(), "No se pudo consultar" + error.toString(), Toast.LENGTH_LONG).show());

        request.add(jsonObjectRequest);

    }

    private void cargarDatos() {

        SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);

        String url = "https://pillplanusuarias.000webhostapp.com/consultarUsuaria.php?email=" + preferences.getString("email_usuaria", "");
        jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, url, null, response -> {

            Usuaria miUsuaria = new Usuaria();

            JSONArray json = response.optJSONArray("usuarias");
            JSONObject jsonObject;

            try {
                assert json != null;
                jsonObject = json.getJSONObject(0);
                miUsuaria.setEdad(jsonObject.optString("edad"));
                miUsuaria.setEmail(jsonObject.optString("email"));

            } catch (JSONException e) {
                e.printStackTrace();
            }

            edad.setText(miUsuaria.getEdad());
            email.setText(miUsuaria.getEmail());
            email.setFocusable(false);  //para NO modificar


        }, error -> Toast.makeText(getApplicationContext(), "No se pudo consultar" + error.toString(), Toast.LENGTH_LONG).show());

        request.add(jsonObjectRequest);


    }


    public void actualizar(View view) {
        SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);
        SharedPreferences.Editor objEditor = preferences.edit();

        String url = "https://pillplanusuarias.000webhostapp.com/actualizarUsuaria.php";
        //CONTROL DE ACTUALIZACION/VALIDACION DE DATOS PERSONALES
        if (preferences.getBoolean("signup_google", true)) {
            if (!preferences.getString("edad_usuaria", "").isEmpty() && !preferences.getString("email_usuaria", "").isEmpty()) {
                if (edad.length() == 2) {
                    stringRequest = new StringRequest(Request.Method.POST, url, response -> Toast.makeText(getApplicationContext(), "Se ha actualizado con exito.", Toast.LENGTH_SHORT).show(), error -> Toast.makeText(getApplicationContext(), "No se ha podido conectar.", Toast.LENGTH_SHORT).show()) {
                        @Override
                        protected Map<String, String> getParams() {
                            String email2 = email.getText().toString();
                            String edad2 = edad.getText().toString();


                            Map<String, String> parametros = new HashMap<>();
                            parametros.put("email", email2);
                            parametros.put("edad", edad2);

                            return parametros;
                        }
                    };

                    request.add(stringRequest);


                    objEditor.putString("edad_usuaria", edad.getText().toString()); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
                    objEditor.apply();

                    objEditor.putString("email_usuaria", email.getText().toString());
                    objEditor.apply();


                    Intent i = new Intent(this, MainActivity.class);
                    startActivity(i);
                    finish();
                } else {
                    Toast.makeText(this, "Tu edad es errónea", Toast.LENGTH_SHORT).show();
                }
            }
        } else {
            if (!preferences.getString("email_usuaria", "").isEmpty()) {


                email.setFocusable(false);  //para NO modificar
                if (!edad.getText().toString().equals("")) {


                    stringRequest = new StringRequest(Request.Method.POST, url, response -> Toast.makeText(getApplicationContext(), "Se ha actualizado con exito.", Toast.LENGTH_SHORT).show(), error -> Toast.makeText(getApplicationContext(), "No se ha podido conectar.", Toast.LENGTH_SHORT).show()) {
                        @Override
                        protected Map<String, String> getParams() {
                            String email2 = email.getText().toString();
                            String edad2 = edad.getText().toString();


                            Map<String, String> parametros = new HashMap<>();
                            parametros.put("email", email2);
                            parametros.put("edad", edad2);

                            return parametros;
                        }
                    };

                    request.add(stringRequest);

                    objEditor.putString("edad_usuaria", edad.getText().toString());
                    objEditor.apply();

                    Intent i = new Intent(this, MainActivity.class);
                    startActivity(i);
                    finish();

                } else {
                    Toast.makeText(this, "¡Hay datos en blanco!", Toast.LENGTH_SHORT).show();
                }
            }
        }
    }

}