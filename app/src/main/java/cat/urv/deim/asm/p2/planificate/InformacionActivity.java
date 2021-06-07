package cat.urv.deim.asm.p2.planificate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class InformacionActivity extends AppCompatActivity {

    Button boton_adelante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);

        boton_adelante = findViewById(R.id.adelante);
    }

    public void eventoBotonAdelante(View view) {
        Intent miIntent = new Intent(InformacionActivity.this,
                PrimeraPreguntaActivity.class);
        startActivity(miIntent);

    }

}