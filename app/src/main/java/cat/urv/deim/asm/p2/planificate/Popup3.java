package cat.urv.deim.asm.p2.planificate;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Popup3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup3);



        DisplayMetrics medidasVentana= new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(medidasVentana);

        int ancho=medidasVentana.widthPixels;
        int alto=medidasVentana.heightPixels;

        getWindow().setLayout((int) (ancho*0.85),(int)(alto*0.5));


    }

    public void onClick(View view) {

        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
        finish();

    }
}