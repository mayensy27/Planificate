package cat.urv.deim.asm.p2.planificate.ui.datos_personales;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;

import java.util.Objects;

import cat.urv.deim.asm.p2.planificate.R;

public class DatosPersonalesUsuariaActivity extends AppCompatActivity {

TextView nombre_u,email_u,telefono_u;
Button logout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos_personales_usuaria);

        nombre_u=findViewById(R.id.text_nombre);
        email_u=findViewById(R.id.text_email);
        telefono_u=findViewById(R.id.text_telefono);
        logout=findViewById(R.id.log_out);


        SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);
       /* SharedPreferences.Editor objEditor = preferences.edit();
        objEditor.putBoolean("x", false); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
        objEditor.apply();

*/
            if(!preferences.getString("nombre_usuaria","").equals("")){

                nombre_u.setText(preferences.getString("nombre_usuaria","")); // por defecto es true
                email_u.setText(preferences.getString("email_usuaria", "")); // por defecto es true
                telefono_u.setText(preferences.getString("telefono_usuaria", "")); // por defecto es true
          }else {
                FirebaseAuth firebaseAuth=FirebaseAuth.getInstance();
                Log.d("tag","onCreate"+ Objects.requireNonNull(firebaseAuth.getCurrentUser()).getDisplayName()); //el log.d se utiliza para ver mediante el logcat el valor de ese paramentro
                Log.d("tag","onCreate"+ firebaseAuth.getCurrentUser().getEmail());

                nombre_u.setText(firebaseAuth.getCurrentUser().getDisplayName());
                email_u.setText(firebaseAuth.getCurrentUser().getEmail());
                telefono_u.setText(preferences.getString("telefono_usuaria", "")); // por defecto es true

            }



        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();

               GoogleSignIn.getClient(getApplicationContext(), new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).build()).signOut()
                       .addOnSuccessListener(new OnSuccessListener<Void>() {
                           @Override
                           public void onSuccess(Void aVoid) {
                               Intent i=new Intent(getApplicationContext(),RegistroUsuariaActivity.class);
                               startActivity(i);
                           }
                       }).addOnFailureListener(new OnFailureListener() {
                   @Override
                   public void onFailure(@NonNull Exception e) {
                       Toast.makeText(getApplicationContext(),"Signout Failed",Toast.LENGTH_SHORT).show();
                   }
               });
            }
        });

    }


}