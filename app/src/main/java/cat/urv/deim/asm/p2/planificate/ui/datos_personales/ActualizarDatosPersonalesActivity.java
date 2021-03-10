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
        nombre.setText(preferences.getString("nombre_usuaria","")); // por defecto es true
        email.setText(preferences.getString("email_usuaria","")); // por defecto es true
        telefono.setText(preferences.getString("telefono_usuaria","")); // por defecto es true

    }


    public void actualizar(View view) {
        if (!nombre.getText().toString().isEmpty() && !email.getText().toString().isEmpty() && !telefono.getText()
                .toString().isEmpty()) {
            if (telefono.length() == 9) {
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
                finish();
            } else {
                Toast.makeText(this, "Tu móvil es erroneo", Toast.LENGTH_SHORT).show();
            }
        }
    }

}