package cat.urv.deim.asm.p2.planificate.ui.datos_personales;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import cat.urv.deim.asm.p2.planificate.R;

public class DatosPersonalesUsuariaActivity extends AppCompatActivity {
TextView nombre_u,email_u,telefono_u;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos_personales_usuaria);

        nombre_u=findViewById(R.id.text_nombre);
        email_u=findViewById(R.id.text_email);
        telefono_u=findViewById(R.id.text_telefono);


        SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);
       /* SharedPreferences.Editor objEditor = preferences.edit();
        objEditor.putBoolean("x", false); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
        objEditor.apply();

*/
        nombre_u.setText(preferences.getString("nombre_usuaria","")); // por defecto es true
        email_u.setText(preferences.getString("email_usuaria","")); // por defecto es true
        telefono_u.setText(preferences.getString("telefono_usuaria","")); // por defecto es true
    }
}