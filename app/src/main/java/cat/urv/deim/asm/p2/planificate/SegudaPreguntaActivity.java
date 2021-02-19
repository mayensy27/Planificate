package cat.urv.deim.asm.p2.planificate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;


public class SegudaPreguntaActivity extends AppCompatActivity {

    private Spinner spinner1;
    private Spinner spinner2;
    private Button siguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seguda_pregunta);

        spinner1= findViewById(R.id.tipo_pildoras);
        spinner2= findViewById(R.id.tipo_comprimidos);
        siguiente=findViewById(R.id.siguiente);



  /*      Desplegable pildoras
        String [] tipos_pildoras ={"Píldoras DIM (Diindolilmetano) 120 Caps.","Píldoras Prenavant Concepción Ella 30 Caps."};
        ArrayAdapter <String> adapter_pildoras = new ArrayAdapter<>(this, R.layout.spinner_item, tipos_pildoras);
        spinner1.setAdapter(adapter_pildoras);

        Desplegable comprimidos
        String [] tipos_comprimidos ={"Blister 27+1.","Blister 28."}; //Desplegable
        ArrayAdapter <String> adapter_comprimidos = new ArrayAdapter<>(this, R.layout.spinner_item, tipos_comprimidos);
        spinner2.setAdapter(adapter_comprimidos);*/


        //Desplegable pildoras
        ArrayAdapter <CharSequence> adapter_pildoras =ArrayAdapter.createFromResource(this,
                R.array.tipos_pildoras,R.layout.spinner_item);  //opciones_pildoras
        spinner1.setAdapter(adapter_pildoras);

        //Desplegable comprimidos
        ArrayAdapter <CharSequence> adapter_comprimidos =ArrayAdapter.createFromResource(this,
                R.array.tipos_comprimidos,R.layout.spinner_item); // //opciones_comprimidos
        spinner2.setAdapter(adapter_comprimidos);

///////////////////////////////////////////////////////////////////////////////////////////////////////////////
        SharedPreferences tipos_pildoras_comprimidos = getSharedPreferences("tipos_pildoras_comprimidos", Context.MODE_PRIVATE);
        SharedPreferences.Editor tipos = tipos_pildoras_comprimidos.edit();

        //GUARDAR DATO PILDORA
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                tipos.putString("tipo_pildora",parent.getItemAtPosition(position).toString());
                tipos.apply();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        //GUARDAR DATO COMPRIMIDOS

        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                tipos.putString("tipo_comprimidos",parent.getItemAtPosition(position).toString());
                tipos.apply();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    }

    public void onClick(View view) {

        if(siguiente.isClickable()) {
            SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);
            SharedPreferences.Editor objEditor = preferences.edit();
            objEditor.putBoolean("primeravez", false); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();

           Intent intent = new Intent(SegudaPreguntaActivity.this, MainActivity.class);
           startActivity(intent);
        }
    }
    }
