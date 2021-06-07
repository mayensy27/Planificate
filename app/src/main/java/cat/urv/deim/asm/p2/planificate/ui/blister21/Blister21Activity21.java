package cat.urv.deim.asm.p2.planificate.ui.blister21;

import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import cat.urv.deim.asm.p2.planificate.R;

public class Blister21Activity21 extends AppCompatActivity {
    ImageButton cargarBlisterSiguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blister50);
        cargarBlisterSiguiente = findViewById(R.id.boton_blister50);


    }
}