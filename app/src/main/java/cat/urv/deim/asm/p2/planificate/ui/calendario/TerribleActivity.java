package cat.urv.deim.asm.p2.planificate.ui.calendario;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import cat.urv.deim.asm.p2.planificate.R;

public class TerribleActivity extends AppCompatActivity {

    TextView dia_animo,estado_animo,efecto_animo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terrible);

        //Recepcion del dia
        dia_animo=findViewById(R.id.dia_animo);
        estado_animo=findViewById(R.id.estado_animo);
        efecto_animo=findViewById(R.id.efecto);

        Bundle  dia=this.getIntent().getExtras();
        Bundle estado=this.getIntent().getExtras();
        Bundle efecto=this.getIntent().getExtras();

        if(dia!=null && estado!=null && efecto!=null){

            String x=dia.getString("dia");
            dia_animo.setText(x);
            String x2=dia.getString("estado");
            estado_animo.setText(x2);
            String x3=efecto.getString("efecto");
            efecto_animo.setText("Ademas has tenido:\n "+"    "+x3);
        }

    }
}