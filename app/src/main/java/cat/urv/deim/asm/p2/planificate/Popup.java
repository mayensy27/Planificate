package cat.urv.deim.asm.p2.planificate;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Popup extends AppCompatActivity {
    Button boton_si,boton_no;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup);

        DisplayMetrics medidasVentana= new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(medidasVentana);

        int ancho=medidasVentana.widthPixels;
        int alto=medidasVentana.heightPixels;

        getWindow().setLayout((int) (ancho*0.85),(int)(alto*0.5));

    }


    public void onClick(View view) {
        Intent i = new Intent(this, PrimeraPreguntaActivity.class);
        startActivity(i);
        finish();
    }
}