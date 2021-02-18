package cat.urv.deim.asm.p2.planificate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class SegudaPreguntaActivity extends AppCompatActivity {

    private Spinner spinner1;
    private Spinner spinner2;
    private TextView tipos;
    private TextView comprimidos;
    private Button siguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seguda_pregunta);

        spinner1= findViewById(R.id.tipo_pildoras);
        spinner2= findViewById(R.id.tipo_comprimidos);
        tipos= findViewById(R.id.pildoras);
        comprimidos=findViewById(R.id.comprimidos);
        siguiente=findViewById(R.id.siguiente);

        //Desplegable pildoras
        String [] tipos_pildoras ={"Píldoras DIM (Diindolilmetano) 120 Caps.","Píldoras Prenavant Concepción Ella 30 Caps."};
        ArrayAdapter <String> adapter_pildoras = new ArrayAdapter<>(this, R.layout.spinner_item, tipos_pildoras);
        spinner1.setAdapter(adapter_pildoras);

        //Desplegable comprimidos
        String [] tipos_comprimidos ={"Blister 27+1.","Blister 28."}; //Desplegable
        ArrayAdapter <String> adapter_comprimidos = new ArrayAdapter<>(this, R.layout.spinner_item, tipos_comprimidos);
        spinner2.setAdapter(adapter_comprimidos);

    }

    public void onClick(View view) {

        Intent intent= new Intent(SegudaPreguntaActivity.this,MainActivity.class);
        startActivity(intent);
    }
}