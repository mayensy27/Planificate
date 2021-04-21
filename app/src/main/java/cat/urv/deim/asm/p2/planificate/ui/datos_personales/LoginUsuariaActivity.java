package cat.urv.deim.asm.p2.planificate.ui.datos_personales;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.GoogleAuthProvider;

import cat.urv.deim.asm.p2.planificate.MainActivity;
import cat.urv.deim.asm.p2.planificate.R;

public class LoginUsuariaActivity extends AppCompatActivity {
    EditText email,telefono;

    private static final int SIGN_IN_CODE=777;
    private GoogleSignInClient mGoogleSignInClient;
    private FirebaseAuth firebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_usuaria);


        email = findViewById(R.id.email);
        telefono = findViewById(R.id.telefono);

        firebaseAuth=FirebaseAuth.getInstance();
        SignInButton signInButton = findViewById(R.id.signInButton);

        //Configuracion de sesion en google
        GoogleSignInOptions gso=new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestIdToken(getString(R.string.default_web_client_id))
                .requestEmail() //para correo autenticado
                .build();

        // Build a GoogleSignClient with the options specified by gso.
        mGoogleSignInClient= GoogleSignIn.getClient(this,gso);

        GoogleSignInAccount signInAccount=GoogleSignIn.getLastSignedInAccount(this);


        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);
                SharedPreferences.Editor objEditor = preferences.edit();

                objEditor.putBoolean("primeravez", false); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
                objEditor.apply();

                objEditor.putBoolean("registrada", false);
                objEditor.apply();

                objEditor.putBoolean("signup_google", false);
                objEditor.apply();

                //si una vez cerrada sesion, se abre nuevamente se pasa de splash-main
                objEditor.putBoolean("login", true);
                objEditor.apply();

                Intent intent =mGoogleSignInClient.getSignInIntent();
                startActivityForResult(intent,SIGN_IN_CODE);



            }
        });
    }
    public void iniciar_sesion(View view) {
        SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);
        SharedPreferences.Editor objEditor = preferences.edit();

        //VALIDACION DE DATOS EN REGISTRO
        if (!email.getText().toString().isEmpty() || !telefono.getText().toString().isEmpty()) {
            if(!email.getText().toString().isEmpty()){
                if (email.getText().toString().equals(preferences.getString("email_usuaria", ""))) {
                    objEditor.putBoolean("login", true);
                    objEditor.apply();
                    Intent i = new Intent(this, MainActivity.class);
                    startActivity(i);
                } else {
                    Toast.makeText(this, "Comprueba tu correo electrónico", Toast.LENGTH_SHORT).show();
                }
            }else{
                if(!telefono.getText().toString().isEmpty()) {
                    if (telefono.getText().toString().equals(preferences.getString("telefono_usuaria", ""))) {
                        objEditor.putBoolean("login", true);
                        objEditor.apply();
                        Intent i = new Intent(this, MainActivity.class);
                        startActivity(i);

                    } else {
                        Toast.makeText(this, "Comprueba tu número de telefono", Toast.LENGTH_SHORT).show();
                    }
                }
                }
            }
        else{
            Toast.makeText(this, "Introduce alguno de tus datos", Toast.LENGTH_SHORT).show();

        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == SIGN_IN_CODE) {
            Task<GoogleSignInAccount> signInTask= GoogleSignIn.getSignedInAccountFromIntent(data);
            try {
                GoogleSignInAccount signInAccount=signInTask.getResult(ApiException.class);

                AuthCredential authCredential= GoogleAuthProvider.getCredential(signInAccount.getIdToken(),null);
                firebaseAuth.signInWithCredential(authCredential).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        Toast.makeText(getApplicationContext(),"Your Google Account is Connected to Our Application.",Toast.LENGTH_SHORT).show();
                        Intent intent=new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(intent);
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {

                    }
                });

            } catch (ApiException e) {
                e.printStackTrace();
            }
        }
    }
}