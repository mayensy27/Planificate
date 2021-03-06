package cat.urv.deim.asm.p2.planificate.ui.blister21;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import cat.urv.deim.asm.p2.planificate.Popup;
import cat.urv.deim.asm.p2.planificate.R;

public class Blister21Activity extends AppCompatActivity {
    ImageButton cargarBlisterSiguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blister29);
        cargarBlisterSiguiente=findViewById(R.id.boton_blister29);


    }

    public void cargarBlister(View view) {
        if(cargarBlisterSiguiente.isClickable()) {

            Intent x = new Intent(this, Blister21Activity1.class);
            startActivity(x);
            finish();
            Intent i = new Intent(this, Popup.class);
            startActivity(i);
            finish();

        }

    }
}