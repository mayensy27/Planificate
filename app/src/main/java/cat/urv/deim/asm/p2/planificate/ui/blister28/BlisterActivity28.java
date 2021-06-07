package cat.urv.deim.asm.p2.planificate.ui.blister28;

import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import cat.urv.deim.asm.p2.planificate.R;

public class BlisterActivity28 extends AppCompatActivity {
    ImageButton cargarBlisterSiguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blister28);
        cargarBlisterSiguiente = findViewById(R.id.boton_blister28);


    }

}