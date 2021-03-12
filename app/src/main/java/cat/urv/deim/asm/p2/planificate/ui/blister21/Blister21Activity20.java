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

import cat.urv.deim.asm.p2.planificate.MainActivity;
import cat.urv.deim.asm.p2.planificate.Popup2;
import cat.urv.deim.asm.p2.planificate.R;

public class Blister21Activity20 extends AppCompatActivity {
    ImageButton cargarBlisterSiguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blister49);
        cargarBlisterSiguiente=findViewById(R.id.boton_blister49);

        SharedPreferences preferences=getSharedPreferences("datos", Context.MODE_PRIVATE);
        SharedPreferences.Editor objEditor = preferences.edit();
        objEditor.putBoolean("primeravez_blister20", false); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
        objEditor.apply();
        objEditor.putBoolean("primeravez_blister21", false); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
        objEditor.apply();
    }
    public void cargarBlister(View view) {
        if(cargarBlisterSiguiente.isClickable()){


            Intent x2 = new Intent(this, MainActivity.class);
            startActivity(x2);
            finish();Intent x = new Intent(this, Blister21Activity21.class);
            startActivity(x);
            finish();
            Intent i = new Intent(this, Popup2.class);
            startActivity(i);
            finish();

            // TOMA 21 DIA DE LA PILDRA

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-M-dd", Locale.getDefault()); //Cambiado para que concuerde con la fecha que me proporciona el Calendar
            Date date = new Date();

            String fecha = dateFormat.format(date);

            SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);
            SharedPreferences.Editor objEditor = preferences.edit();
            objEditor.putString("tomaBlister_21", fecha); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putInt("dia_21", 21); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();



            //INICIALIZACION DE LAS VARIABLES

            objEditor.putBoolean("primeravez_blister1", true); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putBoolean("primeravez_blister2", true); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putBoolean("primeravez_blister3", true); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putBoolean("primeravez_blister4", true); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putBoolean("primeravez_blister5", true); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putBoolean("primeravez_blister6", true); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putBoolean("primeravez_blister7", true); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putBoolean("primeravez_blister8", true); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putBoolean("primeravez_blister9", true); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putBoolean("primeravez_blister10", true); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putBoolean("primeravez_blister11", true); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putBoolean("primeravez_blister12", true); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putBoolean("primeravez_blister13", true); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putBoolean("primeravez_blister14", true); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putBoolean("primeravez_blister15", true); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putBoolean("primeravez_blister16", true); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putBoolean("primeravez_blister17", true); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putBoolean("primeravez_blister18", true); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putBoolean("primeravez_blister19", true); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putBoolean("primeravez_blister20", true); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();



            objEditor.putString("tomaBlister_1", ""); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putInt("dia_1", 0); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();

            objEditor.putString("tomaBlister_2", ""); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putInt("dia_2", 0); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();

            objEditor.putString("tomaBlister_3", ""); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putInt("dia_3", 0); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();

            objEditor.putString("tomaBlister_4", ""); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putInt("dia_4", 0); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();

            objEditor.putString("tomaBlister_5", ""); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putInt("dia_5", 0); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();

            objEditor.putString("tomaBlister_6", ""); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putInt("dia_6", 0); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();

            objEditor.putString("tomaBlister_7", ""); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putInt("dia_7", 0); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();

            objEditor.putString("tomaBlister_8", ""); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putInt("dia_8", 0); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();

            objEditor.putString("tomaBlister_9", ""); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putInt("dia_9", 0); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();

            objEditor.putString("tomaBlister_10", ""); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putInt("dia_10", 0); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();

            objEditor.putString("tomaBlister_11", ""); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putInt("dia_11", 0); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();

            objEditor.putString("tomaBlister_12", ""); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putInt("dia_12", 0); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();

            objEditor.putString("tomaBlister_13", ""); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putInt("dia_13", 0); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();

            objEditor.putString("tomaBlister_14", ""); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putInt("dia_14", 0); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();

            objEditor.putString("tomaBlister_15", ""); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putInt("dia_15", 0); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();

            objEditor.putString("tomaBlister_16", ""); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putInt("dia_16", 0); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();

            objEditor.putString("tomaBlister_17", ""); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putInt("dia_17", 0); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();

            objEditor.putString("tomaBlister_18", ""); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putInt("dia_18", 0); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();


            objEditor.putString("tomaBlister_19", ""); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putInt("dia_19", 0); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();

            objEditor.putString("tomaBlister_20", ""); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putInt("dia_20", 0); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();


            objEditor.putString("tomaBlister_22", ""); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putInt("dia_22", 0); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();

            objEditor.putString("tomaBlister_23", ""); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putInt("dia_23", 0); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();

            objEditor.putString("tomaBlister_24", ""); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putInt("dia_24", 0); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();

            objEditor.putString("tomaBlister_25", ""); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putInt("dia_25", 0); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();

            objEditor.putString("tomaBlister_26", ""); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putInt("dia_25", 0); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();

            objEditor.putString("tomaBlister_27", ""); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putInt("dia_27", 0); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();

            objEditor.putString("tomaBlister_28", ""); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putInt("dia_28", 0); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();

            objEditor.putString("tomaBlister_29", ""); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putInt("dia_29", 0); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();


        }
    }
}