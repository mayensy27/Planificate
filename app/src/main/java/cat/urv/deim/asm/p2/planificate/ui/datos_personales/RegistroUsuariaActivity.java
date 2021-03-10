package cat.urv.deim.asm.p2.planificate.ui.datos_personales;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import cat.urv.deim.asm.p2.planificate.MainActivity;
import cat.urv.deim.asm.p2.planificate.R;

public class RegistroUsuariaActivity extends AppCompatActivity {
    EditText nombre, email,telefono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_usuaria);

        nombre=findViewById(R.id.nombre);
        email=findViewById(R.id.email);
        telefono=findViewById(R.id.telefono);



    }


    public void registrar(View view) {
        if (!nombre.getText().toString().isEmpty() && !email.getText().toString().isEmpty() && !telefono.getText()
                .toString().isEmpty()) {
            if(telefono.length()==9) {
                SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);
                SharedPreferences.Editor objEditor = preferences.edit();
                objEditor.putString("nombre_usuaria", nombre.getText().toString()); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
                objEditor.apply();

                objEditor.putString("email_usuaria", email.getText().toString());
                objEditor.apply();

                objEditor.putString("telefono_usuaria", telefono.getText().toString());
                objEditor.apply();


                Intent i = new Intent(this, MainActivity.class);
                startActivity(i);
            }
            else {
                Toast.makeText(this,"Tu movil es erroneo",Toast.LENGTH_SHORT).show();
                            }
        }else{
            Toast.makeText(this, "Introduce tus datos para posibles notificaciones", Toast.LENGTH_SHORT).show();
        }
    }


    }
