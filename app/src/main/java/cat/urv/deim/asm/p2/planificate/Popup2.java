package cat.urv.deim.asm.p2.planificate;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Popup2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup2);

        DisplayMetrics medidasVentana= new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(medidasVentana);

        int ancho=medidasVentana.widthPixels;
        int alto=medidasVentana.heightPixels;

        getWindow().setLayout((int) (ancho*0.85),(int)(alto*0.5));
        MainActivity.contador_blsiter28=28;
        SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);
        SharedPreferences.Editor objEditor = preferences.edit();
        objEditor.putInt("contador_blister28", 28); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
        objEditor.apply();
        objEditor.putBoolean("final", false); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
        objEditor.apply();

    }


    public void onClick(View view) {

  /* if(MainActivity.contador_blsiter28==28) {*/

       Intent i = new Intent(this, EstadoDeAnimoActivity.class);
       startActivity(i);
       finish();
  /* }*/
    }
}