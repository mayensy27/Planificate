package cat.urv.deim.asm.p2.planificate.ui.datos_personales;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.GoogleAuthProvider;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Objects;

import cat.urv.deim.asm.p2.planificate.MainActivity;
import cat.urv.deim.asm.p2.planificate.R;
import cat.urv.deim.asm.p2.planificate.entidades.Usuaria;

public class RegistroUsuariaActivity extends AppCompatActivity implements Response.Listener<JSONObject>, Response.ErrorListener {

    EditText edad, email;
    RequestQueue request;
    JsonObjectRequest jsonObjectRequest;

    private static final int SIGN_IN_CODE = 777;
    private GoogleSignInClient mGoogleSignInClient;
    private FirebaseAuth firebaseAuth;

    Boolean consulta = true;
    Boolean duplicado = true;

    String boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_usuaria);


        //INICIALIZACION VARIABLES
        edad = findViewById(R.id.edad);
        email = findViewById(R.id.email);

        request = Volley.newRequestQueue(getApplicationContext());

        firebaseAuth = FirebaseAuth.getInstance();
        SignInButton signInButton = findViewById(R.id.signInButton);

        //Configuracion de sesion en google
        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestIdToken(getString(R.string.default_web_client_id))
                .requestEmail() //para correo autenticado
                .build();

        // Build a GoogleSignClient with the options specified by gso.
        mGoogleSignInClient = GoogleSignIn.getClient(this, gso);


        signInButton.setOnClickListener(v -> {
            boton = "google";

            Intent intent = mGoogleSignInClient.getSignInIntent();
            startActivityForResult(intent, SIGN_IN_CODE);


        });

    }

    public void registrar(View view) {
        //VALIDACION DE DATOS EN REGISTRO
        if (!edad.getText().toString().isEmpty() && !email.getText().toString().isEmpty()) {
            if (edad.length() == 2) {
                boton = "manual";
                cargarDatos();

            } else {
                Toast.makeText(this, "Tu edad es errónea", Toast.LENGTH_SHORT).show();
            }

        } else {
            Toast.makeText(this, "Introduce tus datos para posibles notificaciones", Toast.LENGTH_SHORT).show();
        }
    }

    private void cargarDatos() {
        consulta = false;

        String url = "https://pillplanusuarias.000webhostapp.com/consultarUsuaria.php?email=" + email.getText().toString();
        jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, url, null, this, this);
        request.add(jsonObjectRequest);
    }

    private void cargarDatosGoolgle() {
        consulta = false;
        String url = "https://pillplanusuarias.000webhostapp.com/consultarUsuaria.php?email=" + Objects.requireNonNull(firebaseAuth.getCurrentUser()).getEmail();
        jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, url, null, this, this);
        request.add(jsonObjectRequest);
    }


    private void cargarWebService() {
        duplicado = false;
        String url = "https://pillplanusuarias.000webhostapp.com/conexion.php?email=" + email.getText().toString() +
                "&edad=" + edad.getText().toString();

        url = url.replace(" ", "%20");

        jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, url, null, this, this);
        request.add(jsonObjectRequest);

    }

    private void cargarWebServiceGoogle() {
        duplicado = false;
        String url = "https://pillplanusuarias.000webhostapp.com/conexion.php?email=" + Objects.requireNonNull(firebaseAuth.getCurrentUser()).getEmail() +
                "&edad=" + edad.getText().toString();

        url = url.replace(" ", "%20");

        jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, url, null, this, this);
        request.add(jsonObjectRequest);

    }


    @Override
    public void onErrorResponse(VolleyError error) {
        Toast.makeText(this, "No se pudo registrar" + error.toString(), Toast.LENGTH_SHORT).show();


    }

    @Override
    public void onResponse(JSONObject response) {

        if (!consulta && duplicado) {
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
            if (miUsuaria.getEmail().equals("0")) {
                SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);
                SharedPreferences.Editor objEditor = preferences.edit();


                if (boton.equals("manual")) {

                    objEditor.putString("edad_usuaria", edad.getText().toString()); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
                    objEditor.apply();

                    objEditor.putString("email_usuaria", email.getText().toString());
                    objEditor.apply();


                    objEditor.putBoolean("primeravez", false); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
                    objEditor.apply();
                    objEditor.putBoolean("registrada", false);
                    objEditor.apply();
                    cargarWebService();
                }

                if (boton.equals("google")) {


                    objEditor.putString("email_usuaria", Objects.requireNonNull(firebaseAuth.getCurrentUser()).getEmail());
                    objEditor.apply();

                    objEditor.putBoolean("primeravez", false); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
                    objEditor.apply();

                    objEditor.putBoolean("registrada", false);
                    objEditor.apply();

                    objEditor.putBoolean("signup_google", false);
                    objEditor.apply();


                    cargarWebServiceGoogle();


                }


            } else {
                Toast.makeText(this, "DUPLICADO", Toast.LENGTH_SHORT).show();
                email.setText("");
                edad.setText("");
                Intent i = new Intent(this, RegistroUsuariaActivity.class);
                startActivity(i);
                // finish();
            }
        }
        if (!consulta && !duplicado) {
            Toast.makeText(this, "Se ha registrado exitosamente", Toast.LENGTH_SHORT).show();
            email.setText("");
            edad.setText("");

            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
            finish();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == SIGN_IN_CODE) {
            Task<GoogleSignInAccount> signInTask = GoogleSignIn.getSignedInAccountFromIntent(data);
            try {
                GoogleSignInAccount signInAccount = signInTask.getResult(ApiException.class);

                assert signInAccount != null;
                AuthCredential authCredential = GoogleAuthProvider.getCredential(signInAccount.getIdToken(), null);
                firebaseAuth.signInWithCredential(authCredential).addOnCompleteListener(task -> cargarDatosGoolgle()).addOnFailureListener(e -> {

                });

            } catch (ApiException e) {
                e.printStackTrace();
            }
        }
    }

}