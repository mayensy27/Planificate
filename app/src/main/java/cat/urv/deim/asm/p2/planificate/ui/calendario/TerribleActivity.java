package cat.urv.deim.asm.p2.planificate.ui.calendario;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import cat.urv.deim.asm.p2.planificate.R;

public class TerribleActivity extends AppCompatActivity {

    TextView dia_animo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terrible);


        int dia=getIntent().getIntExtra("dia",0);
        dia_animo=findViewById(R.id.dia_animo);

        dia_animo.setText(dia);
    }
}