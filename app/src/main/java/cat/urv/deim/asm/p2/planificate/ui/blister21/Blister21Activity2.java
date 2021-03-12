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
import cat.urv.deim.asm.p2.planificate.R;

public class Blister21Activity2 extends AppCompatActivity {
    ImageButton cargarBlisterSiguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blister31);
        cargarBlisterSiguiente=findViewById(R.id.boton_blister31);

        SharedPreferences preferences=getSharedPreferences("datos", Context.MODE_PRIVATE);
        SharedPreferences.Editor objEditor = preferences.edit();
        objEditor.putBoolean("primeravez_blister2", false); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
        objEditor.apply();
    }

    public void cargarBlister(View view) {
        if(cargarBlisterSiguiente.isClickable()){


            Intent x = new Intent(this, Blister21Activity3.class);
            startActivity(x);
            finish();
            Intent i = new Intent(this, Popup.class);
            startActivity(i);
            finish();



            // TOMA 3 DIA DE LA PILDRA

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-M-dd", Locale.getDefault()); //Cambiado para que concuerde con la fecha que me proporciona el Calendar
            Date date = new Date();

            String fecha = dateFormat.format(date);

            SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);
            SharedPreferences.Editor objEditor = preferences.edit();
            objEditor.putString("tomaBlister_3", fecha); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putInt("dia_3", 3); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();

        }
    }
}