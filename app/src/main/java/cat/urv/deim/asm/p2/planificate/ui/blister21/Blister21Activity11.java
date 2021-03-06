package cat.urv.deim.asm.p2.planificate.ui.blister21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import cat.urv.deim.asm.p2.planificate.Popup;
import cat.urv.deim.asm.p2.planificate.R;
import cat.urv.deim.asm.p2.planificate.ui.blister28.BlisterActivity12;

public class Blister21Activity11 extends AppCompatActivity {
    ImageButton cargarBlisterSiguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blister40);
        cargarBlisterSiguiente=findViewById(R.id.boton_blister40);

        SharedPreferences preferences=getSharedPreferences("datos", Context.MODE_PRIVATE);
        SharedPreferences.Editor objEditor = preferences.edit();
        objEditor.putBoolean("primeravez_blister11", false); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
        objEditor.apply();

    }
    public void cargarBlister(View view) {
        if(cargarBlisterSiguiente.isClickable()){


            Intent x = new Intent(this, BlisterActivity12.class);
            startActivity(x);
            finish();
            Intent i = new Intent(this, Popup.class);
            startActivity(i);
            finish();
        }
    }
}