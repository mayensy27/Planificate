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

public class DatosPersonalesUsuariaActivity extends AppCompatActivity implements Response.Listener<JSONObject>, Response.ErrorListener {

    TextView edad_u, email_u;
    RequestQueue request;
    JsonObjectRequest jsonObjectRequest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos_personales_usuaria);

        edad_u = findViewById(R.id.text_edad);
        email_u = findViewById(R.id.text_email);
        request = Volley.newRequestQueue(getApplicationContext());


        SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);

        if (preferences.getBoolean("signup_google", true)) {

            cargarWebService();


        } else {

            cargarWebServiceGoogle();


        }


    }

    private void cargarWebService() {
        SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);
        String url = "https://pillplanusuarias.000webhostapp.com/consultarUsuaria.php?email=" + preferences.getString("email_usuaria", "");
        jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, url, null, this, this);
        request.add(jsonObjectRequest);

    }

    private void cargarWebServiceGoogle() {
        SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);
        String url = "https://pillplanusuarias.000webhostapp.com/consultarUsuaria.php?email=" + preferences.getString("email_usuaria", "");
        jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, url, null, this, this);
        request.add(jsonObjectRequest);

    }

    @Override
    public void onErrorResponse(VolleyError error) {
        Toast.makeText(this, "No se pudo consultar" + error.toString(), Toast.LENGTH_LONG).show();

    }

    @Override
    public void onResponse(JSONObject response) {

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
        edad_u.setText(miUsuaria.getEdad());
        email_u.setText(miUsuaria.getEmail());
    }
}