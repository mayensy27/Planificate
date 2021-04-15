package cat.urv.deim.asm.p2.planificate.ui.datos_personales;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

import java.util.Objects;

import cat.urv.deim.asm.p2.planificate.MainActivity;
import cat.urv.deim.asm.p2.planificate.R;

public class ActualizarDatosPersonalesActivity extends AppCompatActivity {
    EditText nombre, email,telefono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actualizar_datos_personales);
        nombre=findViewById(R.id.nombre);
        email=findViewById(R.id.email);
        telefono=findViewById(R.id.telefono);

        SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);


        if(!preferences.getString("nombre_usuaria","").isEmpty()){
            nombre.setText(preferences.getString("nombre_usuaria", "")); // por defecto es true
            email.setText(preferences.getString("email_usuaria", "")); // por defecto es true
            telefono.setText(preferences.getString("telefono_usuaria", "")); // por defecto es true

        }
        else{
            FirebaseAuth firebaseAuth=FirebaseAuth.getInstance();
            nombre.setText(Objects.requireNonNull(firebaseAuth.getCurrentUser()).getDisplayName());
            email.setText(firebaseAuth.getCurrentUser().getEmail());
            email.setFocusable(false);  //para NO modificar
            nombre.setFocusable(false);  //para NO modificar
        }
    }


    public void actualizar(View view) {
        SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);
        SharedPreferences.Editor objEditor = preferences.edit();

        //CONTROL DE ACTUALIZACION/VALIDACION DE DATOS PERSONALES
        if(!preferences.getString("nombre_usuaria","").isEmpty()){
                objEditor.putString("nombre_usuaria", nombre.getText().toString()); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
                objEditor.apply();

                objEditor.putString("email_usuaria", email.getText().toString());
                objEditor.apply();

                objEditor.putString("telefono_usuaria", telefono.getText().toString());
                objEditor.apply();
                Intent i = new Intent(this, MainActivity.class);
                startActivity(i);
                finish();
        }else{
            FirebaseAuth firebaseAuth=FirebaseAuth.getInstance();
            nombre.setText(Objects.requireNonNull(firebaseAuth.getCurrentUser()).getDisplayName());
            objEditor.putString("nombre_usuaria", email.getText().toString());
            objEditor.apply();

            email.setText(firebaseAuth.getCurrentUser().getEmail());
            objEditor.putString("email_usuaria", email.getText().toString());
            objEditor.apply();

            email.setFocusable(false);  //para NO modificar
            nombre.setFocusable(false);  //para NO modificar

            objEditor.putString("telefono_usuaria", telefono.getText().toString());
            objEditor.apply();
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
            finish();
        }
    }

}