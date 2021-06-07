package cat.urv.deim.asm.p2.planificate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class PrimeraPreguntaActivity extends AppCompatActivity {

    RadioButton r1, r2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primera_pregunta);

        r1 = findViewById(R.id.decision_propia); //Referenciar
        r2 = findViewById(R.id.recomendacion_sanitaria);


    }

    public void onclick(View view) {


        if (r1.isChecked()) {

            Intent miIntent2 = new Intent(PrimeraPreguntaActivity.this,
                    SegudaPreguntaActivity.class);
            startActivity(miIntent2);
            Intent miIntent = new Intent(PrimeraPreguntaActivity.this,
                    WebDecisionesCompartidas.class);
            startActivity(miIntent);

        }

        if (r2.isChecked()) {


            Intent miIntent = new Intent(PrimeraPreguntaActivity.this,
                    SegudaPreguntaActivity.class);
            startActivity(miIntent);


        }

    }


}