package cat.urv.deim.asm.p2.planificate.ui.datos_personales;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import cat.urv.deim.asm.p2.planificate.R;
import cat.urv.deim.asm.p2.planificate.entidades.Usuaria;

public class DatosPersonalesUsuariaActivity extends AppCompatActivity implements Response.Listener<JSONObject>,Response.ErrorListener {

    TextView nombre_u,email_u,telefono_u;
   // Button logout;
    RequestQueue request;
    JsonObjectRequest jsonObjectRequest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos_personales_usuaria);

        nombre_u=findViewById(R.id.text_nombre);
        email_u=findViewById(R.id.text_email);
        telefono_u=findViewById(R.id.text_telefono);
      //  logout=findViewById(R.id.log_out);
        request= Volley.newRequestQueue(getApplicationContext());


        SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);

        if(preferences.getBoolean("signup_google",true)){

            cargarWebService();
            

            /*nombre_u.setText(preferences.getString("nombre_usuaria","")); // por defecto es true
            email_u.setText(preferences.getString("email_usuaria", "")); // por defecto es true
            telefono_u.setText(preferences.getString("telefono_usuaria", "")); // por defecto es true*/
        }else {

            cargarWebServiceGoogle();

           /* FirebaseAuth firebaseAuth=FirebaseAuth.getInstance();
            Log.d("tag","onCreate"+ Objects.requireNonNull(firebaseAuth.getCurrentUser()).getDisplayName()); //el log.d se utiliza para ver mediante el logcat el valor de ese paramentro
            Log.d("tag","onCreate"+ firebaseAuth.getCurrentUser().getEmail());

            nombre_u.setText(firebaseAuth.getCurrentUser().getDisplayName());
            email_u.setText(firebaseAuth.getCurrentUser().getEmail());
            telefono_u.setText(preferences.getString("telefono_usuaria", "")); // por defecto es true
            SharedPreferences.Editor objEditor = preferences.edit();
            objEditor.putString("nombre_usuaria", Objects.requireNonNull(firebaseAuth.getCurrentUser()).getDisplayName()); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putString("email_usuaria", firebaseAuth.getCurrentUser().getEmail()); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();*/
        }



        /*logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor objEditor = preferences.edit();

                //fuerzo a que al iniciar la app, me vaya desde la splah a Login
                objEditor.putBoolean("primeravez",false); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
                objEditor.apply();

                //fuerzo a que al iniciar la app, me vaya desde la splah a Login (cerrado de sesion)
                objEditor.putBoolean("login",false); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
                objEditor.apply();

                Intent i=new Intent(getApplicationContext(), LoginUsuariaActivity.class);
                startActivity(i);
                finish();
            }
        });*/

    }

    private void cargarWebService() {
        SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);
        String url="https://pillplan.000webhostapp.com/consultarUsuaria.php?email="+preferences.getString("email_usuaria","");
        jsonObjectRequest=new JsonObjectRequest(Request.Method.GET,url,null,this,this);
        request.add(jsonObjectRequest);

    }
    private void cargarWebServiceGoogle() {
        SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);
        String url="https://pillplan.000webhostapp.com/consultarUsuaria.php?email="+preferences.getString("email_usuaria","");
        jsonObjectRequest=new JsonObjectRequest(Request.Method.GET,url,null,this,this);
        request.add(jsonObjectRequest);

    }

    @Override
    public void onErrorResponse(VolleyError error) {
        Toast.makeText(this,"No se pudo consultar"+error.toString(),Toast.LENGTH_LONG).show();

    }

    @Override
    public void onResponse(JSONObject response) {
        //Toast.makeText(this,"Mensaje "+response,Toast.LENGTH_LONG).show();

        Usuaria miUsuaria=new Usuaria();
        JSONArray json=response.optJSONArray("usuarias");
        JSONObject jsonObject;

        try {
            assert json != null;
            jsonObject=json.getJSONObject(0);
            miUsuaria.setNombre(jsonObject.optString("nombre"));
            miUsuaria.setTelefono(jsonObject.optString("telefono"));
            miUsuaria.setEmail(jsonObject.optString("email"));


        } catch (JSONException e) {
            e.printStackTrace();
        }
            nombre_u.setText(miUsuaria.getNombre());
            telefono_u.setText(miUsuaria.getTelefono());
            email_u.setText(miUsuaria.getEmail());
    }
}