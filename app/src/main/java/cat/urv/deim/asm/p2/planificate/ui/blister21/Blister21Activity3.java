package cat.urv.deim.asm.p2.planificate.ui.blister21;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import cat.urv.deim.asm.p2.planificate.Popup;
import cat.urv.deim.asm.p2.planificate.Popup3;
import cat.urv.deim.asm.p2.planificate.R;

public class Blister21Activity3 extends AppCompatActivity {
    ImageButton cargarBlisterSiguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blister32);
        cargarBlisterSiguiente = findViewById(R.id.boton_blister32);

        SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);
        SharedPreferences.Editor objEditor = preferences.edit();
        objEditor.putBoolean("primeravez_blister3", false); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
        objEditor.apply();
    }


    public void cargarBlister(View view) {
        if (cargarBlisterSiguiente.isClickable()) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-M-dd", Locale.getDefault()); //Cambiado para que concuerde con la fecha que me proporciona el Calendar
            Date date = new Date();

            String fecha = dateFormat.format(date);

            SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);

            if (fecha.equals(preferences.getString("tomaBlister_3", ""))) {
                Intent i = new Intent(this, Popup3.class);
                startActivity(i);
                finish();
            } else {
                Intent x = new Intent(this, Blister21Activity4.class);
                startActivity(x);
                finish();

                Intent i = new Intent(this, Popup.class);
                startActivity(i);
                finish();

                // TOMA 4 DIA DE LA PILDRA

                SharedPreferences.Editor objEditor = preferences.edit();
                objEditor.putString("tomaBlister_4", fecha); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
                objEditor.apply();
                objEditor.putInt("dia_4", 4); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
                objEditor.apply();
            }

        }
    }
}