package cat.urv.deim.asm.p2.planificate.ui.blister28;

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

public class BlisterActivity8 extends AppCompatActivity {
    ImageButton cargarBlisterSiguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blister8);

        cargarBlisterSiguiente=findViewById(R.id.boton_blister8);

        SharedPreferences preferences=getSharedPreferences("datos", Context.MODE_PRIVATE);
        SharedPreferences.Editor objEditor = preferences.edit();
        objEditor.putBoolean("primeravez_blister8", false); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
        objEditor.apply();

    }
    public void cargarBlister(View view) {
        if(cargarBlisterSiguiente.isClickable()){


            Intent x = new Intent(this, BlisterActivity9.class);
            startActivity(x);
            finish();
            Intent i = new Intent(this, Popup.class);
            startActivity(i);
            finish();

            /// TOMA 9 DIA DE LA PILDRA

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-M-dd", Locale.getDefault()); //Cambiado para que concuerde con la fecha que me proporciona el Calendar
            Date date = new Date();

            String fecha = dateFormat.format(date);

            SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);
            SharedPreferences.Editor objEditor = preferences.edit();
            objEditor.putString("tomaBlister_9", fecha); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putInt("dia_9", 9); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
        }
    }
}