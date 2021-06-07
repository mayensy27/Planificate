package cat.urv.deim.asm.p2.planificate;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import cat.urv.deim.asm.p2.planificate.ui.datos_personales.RegistroUsuariaActivity;


public class SegudaPreguntaActivity extends AppCompatActivity {

    private Button siguiente;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seguda_pregunta);

        Spinner spinner2 = findViewById(R.id.tipo_comprimidos);
        siguiente = findViewById(R.id.siguiente);


        //Desplegable comprimidos
        ArrayAdapter<CharSequence> adapter_comprimidos = ArrayAdapter.createFromResource(this,
                R.array.tipos_comprimidos, R.layout.spinner_item); // //opciones_comprimidos
        spinner2.setAdapter(adapter_comprimidos);


        SharedPreferences tipos_pildoras_comprimidos = getSharedPreferences("tipos_pildoras_comprimidos", Context.MODE_PRIVATE);
        SharedPreferences.Editor tipos = tipos_pildoras_comprimidos.edit();


        //GUARDAR DATO COMPRIMIDOS

        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                tipos.putString("tipo_comprimidos", parent.getItemAtPosition(position).toString());
                tipos.apply();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }


    public void onClick(View view) {

        if (siguiente.isClickable()) {

            //SE QUITA SI SE EMPLEA LA ALARMA
            SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);

            if (preferences.getBoolean("registrada", true)) {

                Intent intent = new Intent(SegudaPreguntaActivity.this, RegistroUsuariaActivity.class);
                startActivity(intent);
            } else {
                Intent intent = new Intent(SegudaPreguntaActivity.this, MainActivity.class);
                startActivity(intent);
            }

        }
    }

}
