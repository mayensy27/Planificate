package cat.urv.deim.asm.p2.planificate;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class EstadoDeAnimoActivity extends AppCompatActivity {

    TextView estadoAnimo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estado_de_animo);

        estadoAnimo=findViewById(R.id.estadoAnimo);
        SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);
        
        estadoAnimo= preferences.getInt("contador_blister28", 0);

    }
}