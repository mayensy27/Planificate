package cat.urv.deim.asm.p2.planificate.ui.calendario;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import cat.urv.deim.asm.p2.planificate.R;

public class VerEstadosActivity extends AppCompatActivity {
    ListView registro_dias;
    //Spinner spinner;
    int nivel;
    String efecto;
    ArrayList<String> lista_estados; //estos vectores deben tener la misma longitud.*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_estados);

        registro_dias = findViewById(R.id.registro_estados);
        // spinner = findViewById(R.id.estados);
        SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);
     //   SharedPreferences.Editor estados = preferences.edit();
/*
        //Desplegable comprimidos
        ArrayAdapter<CharSequence> adapter_estados = ArrayAdapter.createFromResource(this,
                R.array.desplegable_estados, R.layout.spinner_item); // //opciones_comprimidos
        spinner.setAdapter(adapter_estados);

        //GUARDAR DATO estado
        //  SharedPreferences.Editor estados = preferences.edit();

        SharedPreferences.Editor estados = preferences.edit();

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                estados.putString("registro_estado", parent.getItemAtPosition(position).toString());
                estados.apply();



            }
            //  if (parent.getItemAtPosition(position).toString().equals("Estado:Terrible.")) {


            //   }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

   */
        if (preferences.getString("registro_estado", "").equals("Estado:Terrible.")) {
            nivel = 1;
            lista_estados = new ArrayList<>();

            if (preferences.getInt("nivel_animo_1", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_1", "") + " Día de píldora: 1");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }

            //TOMA 2 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_2", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_2", "") + " Día de píldora: 2");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }

            //TOMA 3 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_3", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_3", "") + " Día de píldora: 3");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 4 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_4", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_4", "") + " Día de píldora: 4");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 5 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_5", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_5", "") + " Día de píldora: 5");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 6 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_6", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_6", "") + " Día de píldora: 6");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }

            //TOMA 7 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_7", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_7", "") + " Día de píldora: 7");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 8 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_8", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_8", "") + " Día de píldora: 8");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 9 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_9", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_9", "") + " Día de píldora: 9");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 10 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_10", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_10", "") + " Día de píldora: 10");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 11 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_11", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister11", "") + " Día de píldora: 11");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 12 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_12", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_12", "") + " Día de píldora: 12");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 13 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_13", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_13", "") + " Día de píldora: 13");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 14 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_14", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_14", "") + " Día de píldora: 14");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 15 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_15", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_15", "") + " Día de píldora: 15");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 16 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_16", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_16", "") + " Día de píldora: 16");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 17 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_17", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_17", "") + " Día de píldora: 17");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 18 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_18", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_18", "") + " Día de píldora: 18");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 19 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_19", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_19", "") + " Día de píldora: 19");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 20 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_20", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_20", "") + " Día de píldora: 20");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 21 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_21", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_21", "") + " Día de píldora: 21");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 22 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_22", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_22", "") + " Día de píldora: 22");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 23 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_23", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_23", "") + " Día de píldora: 23");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 24 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_24", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_24", "") + " Día de píldora: 24");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 25 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_25", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_25", "") + " Día de píldora: 25");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 26 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_26", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_26", "") + " Día de píldora: 26");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 27 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_27", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_27", "") + " Día de píldora: 27");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 28 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_28", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_28", "") + " Día de píldora: 28");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
        }
        if (preferences.getString("registro_estado", "").equals("Estado:Mal.")) {
            nivel = 2;
            lista_estados = new ArrayList<>();

            if (preferences.getInt("nivel_animo_1", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_1", "") + " Día de píldora: 1");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }

            //TOMA 2 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_2", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_2", "") + " Día de píldora: 2");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }

            //TOMA 3 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_3", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_3", "") + " Día de píldora: 3");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 4 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_4", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_4", "") + " Día de píldora: 4");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 5 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_5", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_5", "") + " Día de píldora: 5");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 6 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_6", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_6", "") + " Día de píldora: 6");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }

            //TOMA 7 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_7", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_7", "") + " Día de píldora: 7");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 8 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_8", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_8", "") + " Día de píldora: 8");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 9 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_9", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_9", "") + " Día de píldora: 9");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 10 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_10", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_10", "") + " Día de píldora: 10");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 11 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_11", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister11", "") + " Día de píldora: 11");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 12 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_12", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_12", "") + " Día de píldora: 12");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 13 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_13", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_13", "") + " Día de píldora: 13");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 14 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_14", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_14", "") + " Día de píldora: 14");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 15 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_15", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_15", "") + " Día de píldora: 15");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 16 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_16", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_16", "") + " Día de píldora: 16");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 17 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_17", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_17", "") + " Día de píldora: 17");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 18 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_18", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_18", "") + " Día de píldora: 18");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 19 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_19", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_19", "") + " Día de píldora: 19");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 20 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_20", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_20", "") + " Día de píldora: 20");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 21 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_21", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_21", "") + " Día de píldora: 21");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 22 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_22", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_22", "") + " Día de píldora: 22");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 23 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_23", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_23", "") + " Día de píldora: 23");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 24 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_24", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_24", "") + " Día de píldora: 24");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 25 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_25", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_25", "") + " Día de píldora: 25");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 26 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_26", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_26", "") + " Día de píldora: 26");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 27 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_27", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_27", "") + " Día de píldora: 27");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 28 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_28", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_28", "") + " Día de píldora: 28");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }

        }
        if (preferences.getString("registro_estado", "").equals("Estado:Bien.")) {
            nivel = 3;
            lista_estados = new ArrayList<>();

            if (preferences.getInt("nivel_animo_1", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_1", "") + " Día de píldora: 1");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }

            //TOMA 2 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_2", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_2", "") + " Día de píldora: 2");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }

            //TOMA 3 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_3", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_3", "") + " Día de píldora: 3");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 4 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_4", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_4", "") + " Día de píldora: 4");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 5 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_5", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_5", "") + " Día de píldora: 5");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 6 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_6", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_6", "") + " Día de píldora: 6");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }

            //TOMA 7 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_7", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_7", "") + " Día de píldora: 7");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 8 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_8", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_8", "") + " Día de píldora: 8");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 9 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_9", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_9", "") + " Día de píldora: 9");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 10 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_10", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_10", "") + " Día de píldora: 10");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 11 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_11", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister11", "") + " Día de píldora: 11");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 12 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_12", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_12", "") + " Día de píldora: 12");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 13 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_13", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_13", "") + " Día de píldora: 13");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 14 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_14", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_14", "") + " Día de píldora: 14");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 15 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_15", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_15", "") + " Día de píldora: 15");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 16 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_16", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_16", "") + " Día de píldora: 16");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 17 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_17", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_17", "") + " Día de píldora: 17");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 18 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_18", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_18", "") + " Día de píldora: 18");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 19 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_19", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_19", "") + " Día de píldora: 19");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 20 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_20", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_20", "") + " Día de píldora: 20");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 21 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_21", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_21", "") + " Día de píldora: 21");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 22 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_22", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_22", "") + " Día de píldora: 22");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 23 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_23", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_23", "") + " Día de píldora: 23");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 24 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_24", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_24", "") + " Día de píldora: 24");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 25 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_25", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_25", "") + " Día de píldora: 25");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 26 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_26", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_26", "") + " Día de píldora: 26");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 27 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_27", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_27", "") + " Día de píldora: 27");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 28 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_28", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_28", "") + " Día de píldora: 28");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }

        }
        if (preferences.getString("registro_estado", "").equals("Estado:Muy Bien.")) {
            nivel = 4;
            lista_estados = new ArrayList<>();

            if (preferences.getInt("nivel_animo_1", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_1", "") + " Día de píldora: 1");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }

            //TOMA 2 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_2", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_2", "") + " Día de píldora: 2");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }

            //TOMA 3 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_3", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_3", "") + " Día de píldora: 3");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 4 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_4", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_4", "") + " Día de píldora: 4");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 5 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_5", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_5", "") + " Día de píldora: 5");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 6 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_6", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_6", "") + " Día de píldora: 6");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }

            //TOMA 7 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_7", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_7", "") + " Día de píldora: 7");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 8 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_8", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_8", "") + " Día de píldora: 8");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 9 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_9", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_9", "") + " Día de píldora: 9");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 10 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_10", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_10", "") + " Día de píldora: 10");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 11 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_11", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister11", "") + " Día de píldora: 11");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 12 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_12", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_12", "") + " Día de píldora: 12");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 13 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_13", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_13", "") + " Día de píldora: 13");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 14 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_14", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_14", "") + " Día de píldora: 14");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 15 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_15", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_15", "") + " Día de píldora: 15");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 16 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_16", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_16", "") + " Día de píldora: 16");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 17 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_17", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_17", "") + " Día de píldora: 17");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 18 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_18", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_18", "") + " Día de píldora: 18");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 19 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_19", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_19", "") + " Día de píldora: 19");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 20 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_20", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_20", "") + " Día de píldora: 20");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 21 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_21", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_21", "") + " Día de píldora: 21");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 22 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_22", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_22", "") + " Día de píldora: 22");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 23 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_23", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_23", "") + " Día de píldora: 23");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 24 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_24", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_24", "") + " Día de píldora: 24");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 25 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_25", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_25", "") + " Día de píldora: 25");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 26 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_26", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_26", "") + " Día de píldora: 26");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 27 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_27", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_27", "") + " Día de píldora: 27");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 28 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_28", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_28", "") + " Día de píldora: 28");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }

        }
        if (preferences.getString("registro_estado", "").equals("Estado:Genial.")) {
            nivel = 5;
            lista_estados = new ArrayList<>();

            if (preferences.getInt("nivel_animo_1", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_1", "") + " Día de píldora: 1");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }

            //TOMA 2 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_2", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_2", "") + " Día de píldora: 2");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }

            //TOMA 3 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_3", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_3", "") + " Día de píldora: 3");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 4 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_4", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_4", "") + " Día de píldora: 4");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 5 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_5", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_5", "") + " Día de píldora: 5");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 6 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_6", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_6", "") + " Día de píldora: 6");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }

            //TOMA 7 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_7", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_7", "") + " Día de píldora: 7");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 8 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_8", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_8", "") + " Día de píldora: 8");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 9 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_9", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_9", "") + " Día de píldora: 9");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 10 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_10", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_10", "") + " Día de píldora: 10");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 11 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_11", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister11", "") + " Día de píldora: 11");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 12 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_12", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_12", "") + " Día de píldora: 12");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 13 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_13", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_13", "") + " Día de píldora: 13");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 14 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_14", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_14", "") + " Día de píldora: 14");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 15 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_15", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_15", "") + " Día de píldora: 15");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 16 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_16", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_16", "") + " Día de píldora: 16");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 17 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_17", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_17", "") + " Día de píldora: 17");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 18 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_18", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_18", "") + " Día de píldora: 18");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 19 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_19", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_19", "") + " Día de píldora: 19");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 20 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_20", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_20", "") + " Día de píldora: 20");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 21 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_21", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_21", "") + " Día de píldora: 21");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 22 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_22", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_22", "") + " Día de píldora: 22");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 23 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_23", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_23", "") + " Día de píldora: 23");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 24 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_24", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_24", "") + " Día de píldora: 24");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 25 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_25", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_25", "") + " Día de píldora: 25");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 26 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_26", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_26", "") + " Día de píldora: 26");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 27 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_27", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_27", "") + " Día de píldora: 27");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 28 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_28", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_28", "") + " Día de píldora: 28");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }


        }

        //Molestias
        SharedPreferences efectos = getSharedPreferences("efectos", Context.MODE_PRIVATE);

        if (preferences.getString("registro_estado", "").equals("Molestia:Cambios de humor.")) {
            efecto = "Cambios de humor.";
            lista_estados = new ArrayList<>();

            if (efecto.equals(efectos.getString("efecto_animo_1", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_1", "") + " Día de píldora: 1");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }

            //TOMA 2 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_2", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_2", "") + " Día de píldora: 2");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }

            //TOMA 3 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_3", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_3", "") + " Día de píldora: 3");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 4 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_4", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_4", "") + " Día de píldora: 4");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 5 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_5", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_5", "") + " Día de píldora: 5");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 6 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_6", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_6", "") + " Día de píldora: 6");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }

            //TOMA 7 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_7", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_7", "") + " Día de píldora: 7");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 8 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_8", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_8", "") + " Día de píldora: 8");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 9 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_9", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_9", "") + " Día de píldora: 9");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 10 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_10", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_10", "") + " Día de píldora: 10");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 11 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_2", ""))) {
                lista_estados.add(preferences.getString("tomaBlister11", "") + " Día de píldora: 11");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 12 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_12", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_12", "") + " Día de píldora: 12");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 13 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_13", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_13", "") + " Día de píldora: 13");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 14 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_14", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_14", "") + " Día de píldora: 14");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 15 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_15", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_15", "") + " Día de píldora: 15");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 16 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_16", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_16", "") + " Día de píldora: 16");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 17 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_17", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_17", "") + " Día de píldora: 17");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 18 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_18", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_18", "") + " Día de píldora: 18");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 19 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_19", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_19", "") + " Día de píldora: 19");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 20 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_20", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_20", "") + " Día de píldora: 20");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 21 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_21", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_21", "") + " Día de píldora: 21");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 22 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_22", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_22", "") + " Día de píldora: 22");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 23 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_23", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_23", "") + " Día de píldora: 23");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 24 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_24", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_24", "") + " Día de píldora: 24");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 25 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_25", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_25", "") + " Día de píldora: 25");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 26 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_26", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_26", "") + " Día de píldora: 26");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 27 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_27", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_27", "") + " Día de píldora: 27");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 28 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_28", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_28", "") + " Día de píldora: 28");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
        }

        if (preferences.getString("registro_estado", "").equals("Molestia:Aparición de acné.")) {

            efecto = "Aparición de acné.";
            lista_estados = new ArrayList<>();

            if (efecto.equals(efectos.getString("efecto_animo_1", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_1", "") + " Día de píldora: 1");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }

            //TOMA 2 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_2", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_2", "") + " Día de píldora: 2");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }

            //TOMA 3 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_3", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_3", "") + " Día de píldora: 3");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 4 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_4", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_4", "") + " Día de píldora: 4");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 5 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_5", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_5", "") + " Día de píldora: 5");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 6 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_6", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_6", "") + " Día de píldora: 6");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }

            //TOMA 7 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_7", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_7", "") + " Día de píldora: 7");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 8 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_8", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_8", "") + " Día de píldora: 8");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 9 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_9", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_9", "") + " Día de píldora: 9");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 10 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_10", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_10", "") + " Día de píldora: 10");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 11 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_2", ""))) {
                lista_estados.add(preferences.getString("tomaBlister11", "") + " Día de píldora: 11");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 12 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_12", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_12", "") + " Día de píldora: 12");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 13 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_13", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_13", "") + " Día de píldora: 13");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 14 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_14", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_14", "") + " Día de píldora: 14");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 15 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_15", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_15", "") + " Día de píldora: 15");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 16 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_16", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_16", "") + " Día de píldora: 16");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 17 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_17", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_17", "") + " Día de píldora: 17");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 18 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_18", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_18", "") + " Día de píldora: 18");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 19 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_19", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_19", "") + " Día de píldora: 19");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 20 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_20", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_20", "") + " Día de píldora: 20");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 21 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_21", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_21", "") + " Día de píldora: 21");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 22 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_22", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_22", "") + " Día de píldora: 22");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 23 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_23", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_23", "") + " Día de píldora: 23");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 24 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_24", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_24", "") + " Día de píldora: 24");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 25 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_25", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_25", "") + " Día de píldora: 25");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 26 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_26", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_26", "") + " Día de píldora: 26");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 27 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_27", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_27", "") + " Día de píldora: 27");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 28 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_28", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_28", "") + " Día de píldora: 28");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
        }

        if (preferences.getString("registro_estado", "").equals("Molestia:Dolor mamario.")) {
            efecto = "Dolor mamario.";
            lista_estados = new ArrayList<>();

            if (efecto.equals(efectos.getString("efecto_animo_1", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_1", "") + " Día de píldora: 1");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }

            //TOMA 2 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_2", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_2", "") + " Día de píldora: 2");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }

            //TOMA 3 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_3", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_3", "") + " Día de píldora: 3");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 4 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_4", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_4", "") + " Día de píldora: 4");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 5 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_5", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_5", "") + " Día de píldora: 5");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 6 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_6", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_6", "") + " Día de píldora: 6");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }

            //TOMA 7 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_7", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_7", "") + " Día de píldora: 7");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 8 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_8", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_8", "") + " Día de píldora: 8");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 9 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_9", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_9", "") + " Día de píldora: 9");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 10 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_10", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_10", "") + " Día de píldora: 10");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 11 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_2", ""))) {
                lista_estados.add(preferences.getString("tomaBlister11", "") + " Día de píldora: 11");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 12 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_12", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_12", "") + " Día de píldora: 12");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 13 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_13", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_13", "") + " Día de píldora: 13");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 14 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_14", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_14", "") + " Día de píldora: 14");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 15 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_15", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_15", "") + " Día de píldora: 15");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 16 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_16", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_16", "") + " Día de píldora: 16");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 17 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_17", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_17", "") + " Día de píldora: 17");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 18 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_18", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_18", "") + " Día de píldora: 18");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 19 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_19", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_19", "") + " Día de píldora: 19");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 20 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_20", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_20", "") + " Día de píldora: 20");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 21 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_21", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_21", "") + " Día de píldora: 21");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 22 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_22", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_22", "") + " Día de píldora: 22");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 23 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_23", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_23", "") + " Día de píldora: 23");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 24 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_24", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_24", "") + " Día de píldora: 24");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 25 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_25", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_25", "") + " Día de píldora: 25");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 26 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_26", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_26", "") + " Día de píldora: 26");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 27 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_27", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_27", "") + " Día de píldora: 27");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 28 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_28", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_28", "") + " Día de píldora: 28");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
        }


        if (preferences.getString("registro_estado", "").equals("Molestia:Dolor menstrual.")) {
            efecto = "Dolor menstrual.";
            lista_estados = new ArrayList<>();

            if (efecto.equals(efectos.getString("efecto_animo_1", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_1", "") + " Día de píldora: 1");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }

            //TOMA 2 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_2", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_2", "") + " Día de píldora: 2");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }

            //TOMA 3 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_3", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_3", "") + " Día de píldora: 3");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 4 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_4", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_4", "") + " Día de píldora: 4");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 5 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_5", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_5", "") + " Día de píldora: 5");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 6 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_6", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_6", "") + " Día de píldora: 6");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }

            //TOMA 7 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_7", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_7", "") + " Día de píldora: 7");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 8 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_8", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_8", "") + " Día de píldora: 8");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 9 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_9", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_9", "") + " Día de píldora: 9");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 10 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_10", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_10", "") + " Día de píldora: 10");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 11 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_2", ""))) {
                lista_estados.add(preferences.getString("tomaBlister11", "") + " Día de píldora: 11");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 12 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_12", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_12", "") + " Día de píldora: 12");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 13 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_13", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_13", "") + " Día de píldora: 13");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 14 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_14", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_14", "") + " Día de píldora: 14");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 15 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_15", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_15", "") + " Día de píldora: 15");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 16 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_16", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_16", "") + " Día de píldora: 16");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 17 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_17", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_17", "") + " Día de píldora: 17");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 18 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_18", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_18", "") + " Día de píldora: 18");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 19 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_19", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_19", "") + " Día de píldora: 19");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 20 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_20", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_20", "") + " Día de píldora: 20");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 21 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_21", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_21", "") + " Día de píldora: 21");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 22 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_22", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_22", "") + " Día de píldora: 22");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 23 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_23", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_23", "") + " Día de píldora: 23");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 24 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_24", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_24", "") + " Día de píldora: 24");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 25 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_25", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_25", "") + " Día de píldora: 25");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 26 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_26", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_26", "") + " Día de píldora: 26");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 27 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_27", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_27", "") + " Día de píldora: 27");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 28 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_28", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_28", "") + " Día de píldora: 28");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }


        }

        if (preferences.getString("registro_estado", "").equals("Molestia:Cambio en el ritmo deposicional (diarrea,estreñimiento…).")) {
            efecto = "Cambio en el ritmo deposicional (diarrea,estreñimiento…).";
            lista_estados = new ArrayList<>();

            if (efecto.equals(efectos.getString("efecto_animo_1", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_1", "") + " Día de píldora: 1");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }

            //TOMA 2 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_2", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_2", "") + " Día de píldora: 2");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }

            //TOMA 3 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_3", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_3", "") + " Día de píldora: 3");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 4 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_4", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_4", "") + " Día de píldora: 4");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 5 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_5", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_5", "") + " Día de píldora: 5");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 6 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_6", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_6", "") + " Día de píldora: 6");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }

            //TOMA 7 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_7", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_7", "") + " Día de píldora: 7");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 8 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_8", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_8", "") + " Día de píldora: 8");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 9 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_9", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_9", "") + " Día de píldora: 9");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 10 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_10", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_10", "") + " Día de píldora: 10");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 11 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_11", ""))) {
                lista_estados.add(preferences.getString("tomaBlister11", "") + " Día de píldora: 11");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 12 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_12", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_12", "") + " Día de píldora: 12");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 13 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_13", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_13", "") + " Día de píldora: 13");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 14 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_14", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_14", "") + " Día de píldora: 14");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 15 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_15", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_15", "") + " Día de píldora: 15");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 16 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_16", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_16", "") + " Día de píldora: 16");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 17 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_17", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_17", "") + " Día de píldora: 17");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 18 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_18", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_18", "") + " Día de píldora: 18");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 19 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_19", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_19", "") + " Día de píldora: 19");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 20 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_20", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_20", "") + " Día de píldora: 20");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 21 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_21", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_21", "") + " Día de píldora: 21");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 22 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_22", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_22", "") + " Día de píldora: 22");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 23 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_23", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_23", "") + " Día de píldora: 23");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 24 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_24", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_24", "") + " Día de píldora: 24");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 25 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_25", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_25", "") + " Día de píldora: 25");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 26 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_26", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_26", "") + " Día de píldora: 26");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 27 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_27", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_27", "") + " Día de píldora: 27");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 28 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_28", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_28", "") + " Día de píldora: 28");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }


        }

        if (preferences.getString("registro_estado", "").equals("Otros.")) {

            efecto = "Otros.";
            lista_estados = new ArrayList<>();

            if (efecto.equals(efectos.getString("efecto_animo_1", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_1", "") + " Día de píldora: 1");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }

            //TOMA 2 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_2", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_2", "") + " Día de píldora: 2");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }

            //TOMA 3 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_3", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_3", "") + " Día de píldora: 3");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 4 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_4", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_4", "") + " Día de píldora: 4");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 5 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_5", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_5", "") + " Día de píldora: 5");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 6 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_6", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_6", "") + " Día de píldora: 6");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }

            //TOMA 7 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_7", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_7", "") + " Día de píldora: 7");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 8 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_8", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_8", "") + " Día de píldora: 8");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 9 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_9", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_9", "") + " Día de píldora: 9");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 10 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_10", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_10", "") + " Día de píldora: 10");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 11 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_2", ""))) {
                lista_estados.add(preferences.getString("tomaBlister11", "") + " Día de píldora: 11");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 12 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_12", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_12", "") + " Día de píldora: 12");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 13 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_13", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_13", "") + " Día de píldora: 13");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 14 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_14", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_14", "") + " Día de píldora: 14");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 15 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_15", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_15", "") + " Día de píldora: 15");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 16 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_16", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_16", "") + " Día de píldora: 16");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 17 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_17", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_17", "") + " Día de píldora: 17");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 18 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_18", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_18", "") + " Día de píldora: 18");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 19 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_19", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_19", "") + " Día de píldora: 19");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 20 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_20", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_20", "") + " Día de píldora: 20");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 21 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_21", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_21", "") + " Día de píldora: 21");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 22 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_22", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_22", "") + " Día de píldora: 22");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 23 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_23", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_23", "") + " Día de píldora: 23");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 24 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_24", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_24", "") + " Día de píldora: 24");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 25 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_25", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_25", "") + " Día de píldora: 25");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 26 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_26", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_26", "") + " Día de píldora: 26");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 27 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_27", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_27", "") + " Día de píldora: 27");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }
            //TOMA 28 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_28", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_28", "") + " Día de píldora: 28");
                // dias.add("Día " + preferences.getInt("dia_1", 0));

            }


        }


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.list_item_registro, lista_estados);
        registro_dias.setAdapter(adapter);

       /* registro_dias.setOnItemClickListener((parent, view, position, id) -> {
            // SharedPreferences efectos = getSharedPreferences("efectos", Context.MODE_PRIVATE);

            if (position == 0) {

                if(preferences.getInt("nivel_animo_1", 0)==1){
                    niveles_animo(1,preferences.getString("tomaBlister_1", "") );
                }
                if(preferences.getInt("nivel_animo_1", 0)==2){
                    niveles_animo(2,preferences.getString("tomaBlister_1", "") );

                }
            *//*    if( preferences.getInt("nivel_animo_1", 0)==1||preferences.getInt("nivel_animo_2", 0)==1||preferences.getInt("nivel_animo_3", 0)==1
                        ||preferences.getInt("nivel_animo_4", 0)==1||preferences.getInt("nivel_animo_5", 0)==1||preferences.getInt("nivel_animo_6", 0)==1
                        ||preferences.getInt("nivel_animo_7", 0)==1||preferences.getInt("nivel_animo_8", 0)==1||preferences.getInt("nivel_animo_9", 0)==1
                        ||preferences.getInt("nivel_animo_10", 0)==1||preferences.getInt("nivel_animo_11", 0)==1||preferences.getInt("nivel_animo_12", 0)==1
                        ||preferences.getInt("nivel_animo_13", 0)==1||preferences.getInt("nivel_animo_14", 0)==1||preferences.getInt("nivel_animo_15", 0)==1
                        ||preferences.getInt("nivel_animo_16", 0)==1||preferences.getInt("nivel_animo_17", 0)==1||preferences.getInt("nivel_animo_18", 0)==1
                        ||preferences.getInt("nivel_animo_19", 0)==1||preferences.getInt("nivel_animo_20", 0)==1||preferences.getInt("nivel_animo_21", 0)==1
                        ||preferences.getInt("nivel_animo_22", 0)==1||preferences.getInt("nivel_animo_23", 0)==1||preferences.getInt("nivel_animo_24", 0)==1
                        ||preferences.getInt("nivel_animo_25", 0)==1||preferences.getInt("nivel_animo_26", 0)==1||preferences.getInt("nivel_animo_27", 0)==1
                        ||preferences.getInt("nivel_animo_28", 0)==1){
                    niveles_animo(1, "1");


                }
                if( preferences.getInt("nivel_animo_1", 0)==2||preferences.getInt("nivel_animo_2", 0)==2||preferences.getInt("nivel_animo_3", 0)==2
                        ||preferences.getInt("nivel_animo_4", 0)==2||preferences.getInt("nivel_animo_5", 0)==2||preferences.getInt("nivel_animo_6", 0)==2
                        ||preferences.getInt("nivel_animo_7", 0)==2||preferences.getInt("nivel_animo_8", 0)==2||preferences.getInt("nivel_animo_9", 0)==2
                        ||preferences.getInt("nivel_animo_10", 0)==2||preferences.getInt("nivel_animo_11", 0)==2||preferences.getInt("nivel_animo_12", 0)==2
                        ||preferences.getInt("nivel_animo_13", 0)==2||preferences.getInt("nivel_animo_14", 0)==2||preferences.getInt("nivel_animo_15", 0)==2
                        ||preferences.getInt("nivel_animo_16", 0)==2||preferences.getInt("nivel_animo_17", 0)==2||preferences.getInt("nivel_animo_18", 0)==2
                        ||preferences.getInt("nivel_animo_19", 0)==2||preferences.getInt("nivel_animo_20", 0)==2||preferences.getInt("nivel_animo_21", 0)==2
                        ||preferences.getInt("nivel_animo_22", 0)==2||preferences.getInt("nivel_animo_23", 0)==2||preferences.getInt("nivel_animo_24", 0)==2
                        ||preferences.getInt("nivel_animo_25", 0)==2||preferences.getInt("nivel_animo_26", 0)==2||preferences.getInt("nivel_animo_27", 0)==2
                        ||preferences.getInt("nivel_animo_28", 0)==2){
                    niveles_animo(2, "1");
                }
                if( preferences.getInt("nivel_animo_1", 0)==3||preferences.getInt("nivel_animo_2", 0)==3||preferences.getInt("nivel_animo_3", 0)==3
                        ||preferences.getInt("nivel_animo_4", 0)==3||preferences.getInt("nivel_animo_5", 0)==3||preferences.getInt("nivel_animo_6", 0)==3
                        ||preferences.getInt("nivel_animo_7", 0)==3||preferences.getInt("nivel_animo_8", 0)==3||preferences.getInt("nivel_animo_9", 0)==3
                        ||preferences.getInt("nivel_animo_10", 0)==3||preferences.getInt("nivel_animo_11", 0)==3||preferences.getInt("nivel_animo_12", 0)==3
                        ||preferences.getInt("nivel_animo_13", 0)==3||preferences.getInt("nivel_animo_14", 0)==3||preferences.getInt("nivel_animo_15", 0)==3
                        ||preferences.getInt("nivel_animo_16", 0)==3||preferences.getInt("nivel_animo_17", 0)==3||preferences.getInt("nivel_animo_18", 0)==3
                        ||preferences.getInt("nivel_animo_19", 0)==3||preferences.getInt("nivel_animo_20", 0)==3||preferences.getInt("nivel_animo_21", 0)==3
                        ||preferences.getInt("nivel_animo_22", 0)==3||preferences.getInt("nivel_animo_23", 0)==3||preferences.getInt("nivel_animo_24", 0)==3
                        ||preferences.getInt("nivel_animo_25", 0)==3||preferences.getInt("nivel_animo_26", 0)==3||preferences.getInt("nivel_animo_27", 0)==3
                        ||preferences.getInt("nivel_animo_28", 0)==3){
                    niveles_animo(3, "1");
                }*//*
            }
            if (position == 1) {

                if(preferences.getInt("nivel_animo_2", 0)==1){
                    niveles_animo(2,preferences.getString("tomaBlister_2", "")) ;
                }
                if(preferences.getInt("nivel_animo_2", 0)==2) {
                    niveles_animo(2,preferences.getString("tomaBlister_2", "") );
                }
                *//*if( preferences.getInt("nivel_animo_2", 0)==1||preferences.getInt("nivel_animo_3", 0)==1
                        ||preferences.getInt("nivel_animo_4", 0)==1||preferences.getInt("nivel_animo_5", 0)==1||preferences.getInt("nivel_animo_6", 0)==1
                        ||preferences.getInt("nivel_animo_7", 0)==1||preferences.getInt("nivel_animo_8", 0)==1||preferences.getInt("nivel_animo_9", 0)==1
                        ||preferences.getInt("nivel_animo_10", 0)==1||preferences.getInt("nivel_animo_11", 0)==1||preferences.getInt("nivel_animo_12", 0)==1
                        ||preferences.getInt("nivel_animo_13", 0)==1||preferences.getInt("nivel_animo_14", 0)==1||preferences.getInt("nivel_animo_15", 0)==1
                        ||preferences.getInt("nivel_animo_16", 0)==1||preferences.getInt("nivel_animo_17", 0)==1||preferences.getInt("nivel_animo_18", 0)==1
                        ||preferences.getInt("nivel_animo_19", 0)==1||preferences.getInt("nivel_animo_20", 0)==1||preferences.getInt("nivel_animo_21", 0)==1
                        ||preferences.getInt("nivel_animo_22", 0)==1||preferences.getInt("nivel_animo_23", 0)==1||preferences.getInt("nivel_animo_24", 0)==1
                        ||preferences.getInt("nivel_animo_25", 0)==1||preferences.getInt("nivel_animo_26", 0)==1||preferences.getInt("nivel_animo_27", 0)==1
                        ||preferences.getInt("nivel_animo_28", 0)==1){
                   niveles_animo(1, "2");


                }
                if(preferences.getInt("nivel_animo_2", 0)==2||preferences.getInt("nivel_animo_3", 0)==2
                        ||preferences.getInt("nivel_animo_4", 0)==2||preferences.getInt("nivel_animo_5", 0)==2||preferences.getInt("nivel_animo_6", 0)==2
                        ||preferences.getInt("nivel_animo_7", 0)==2||preferences.getInt("nivel_animo_8", 0)==2||preferences.getInt("nivel_animo_9", 0)==2
                        ||preferences.getInt("nivel_animo_10", 0)==2||preferences.getInt("nivel_animo_11", 0)==2||preferences.getInt("nivel_animo_12", 0)==2
                        ||preferences.getInt("nivel_animo_13", 0)==2||preferences.getInt("nivel_animo_14", 0)==2||preferences.getInt("nivel_animo_15", 0)==2
                        ||preferences.getInt("nivel_animo_16", 0)==2||preferences.getInt("nivel_animo_17", 0)==2||preferences.getInt("nivel_animo_18", 0)==2
                        ||preferences.getInt("nivel_animo_19", 0)==2||preferences.getInt("nivel_animo_20", 0)==2||preferences.getInt("nivel_animo_21", 0)==2
                        ||preferences.getInt("nivel_animo_22", 0)==2||preferences.getInt("nivel_animo_23", 0)==2||preferences.getInt("nivel_animo_24", 0)==2
                        ||preferences.getInt("nivel_animo_25", 0)==2||preferences.getInt("nivel_animo_26", 0)==2||preferences.getInt("nivel_animo_27", 0)==2
                        ||preferences.getInt("nivel_animo_28", 0)==2){
                   niveles_animo(2, "2");
                }
                if( preferences.getInt("nivel_animo_2", 0)==3||preferences.getInt("nivel_animo_3", 0)==3
                        ||preferences.getInt("nivel_animo_4", 0)==3||preferences.getInt("nivel_animo_5", 0)==3||preferences.getInt("nivel_animo_6", 0)==3
                        ||preferences.getInt("nivel_animo_7", 0)==3||preferences.getInt("nivel_animo_8", 0)==3||preferences.getInt("nivel_animo_9", 0)==3
                        ||preferences.getInt("nivel_animo_10", 0)==3||preferences.getInt("nivel_animo_11", 0)==3||preferences.getInt("nivel_animo_12", 0)==3
                        ||preferences.getInt("nivel_animo_13", 0)==3||preferences.getInt("nivel_animo_14", 0)==3||preferences.getInt("nivel_animo_15", 0)==3
                        ||preferences.getInt("nivel_animo_16", 0)==3||preferences.getInt("nivel_animo_17", 0)==3||preferences.getInt("nivel_animo_18", 0)==3
                        ||preferences.getInt("nivel_animo_19", 0)==3||preferences.getInt("nivel_animo_20", 0)==3||preferences.getInt("nivel_animo_21", 0)==3
                        ||preferences.getInt("nivel_animo_22", 0)==3||preferences.getInt("nivel_animo_23", 0)==3||preferences.getInt("nivel_animo_24", 0)==3
                        ||preferences.getInt("nivel_animo_25", 0)==3||preferences.getInt("nivel_animo_26", 0)==3||preferences.getInt("nivel_animo_27", 0)==3
                        ||preferences.getInt("nivel_animo_28", 0)==3){
                   niveles_animo(3, "2");
                }*//*
            }
            if (position == 2) {
               *//* if( preferences.getInt("nivel_animo_1", 0)==1||preferences.getInt("nivel_animo_2", 0)==1||preferences.getInt("nivel_animo_3", 0)==1
                        ||preferences.getInt("nivel_animo_4", 0)==1||preferences.getInt("nivel_animo_5", 0)==1||preferences.getInt("nivel_animo_6", 0)==1
                        ||preferences.getInt("nivel_animo_7", 0)==1||preferences.getInt("nivel_animo_8", 0)==1||preferences.getInt("nivel_animo_9", 0)==1
                        ||preferences.getInt("nivel_animo_10", 0)==1||preferences.getInt("nivel_animo_11", 0)==1||preferences.getInt("nivel_animo_12", 0)==1
                        ||preferences.getInt("nivel_animo_13", 0)==1||preferences.getInt("nivel_animo_14", 0)==1||preferences.getInt("nivel_animo_15", 0)==1
                        ||preferences.getInt("nivel_animo_16", 0)==1||preferences.getInt("nivel_animo_17", 0)==1||preferences.getInt("nivel_animo_18", 0)==1
                        ||preferences.getInt("nivel_animo_19", 0)==1||preferences.getInt("nivel_animo_20", 0)==1||preferences.getInt("nivel_animo_21", 0)==1
                        ||preferences.getInt("nivel_animo_22", 0)==1||preferences.getInt("nivel_animo_23", 0)==1||preferences.getInt("nivel_animo_24", 0)==1
                        ||preferences.getInt("nivel_animo_25", 0)==1||preferences.getInt("nivel_animo_26", 0)==1||preferences.getInt("nivel_animo_27", 0)==1
                        ||preferences.getInt("nivel_animo_28", 0)==1) {
                    niveles_animo(3, "3");
                }*//*
            }
           *//* if (position == 3) {
                if( preferences.getInt("nivel_animo_1", 0)==1||preferences.getInt("nivel_animo_2", 0)==1||preferences.getInt("nivel_animo_3", 0)==1
                        ||preferences.getInt("nivel_animo_4", 0)==1||preferences.getInt("nivel_animo_5", 0)==1||preferences.getInt("nivel_animo_6", 0)==1
                        ||preferences.getInt("nivel_animo_7", 0)==1||preferences.getInt("nivel_animo_8", 0)==1||preferences.getInt("nivel_animo_9", 0)==1
                        ||preferences.getInt("nivel_animo_10", 0)==1||preferences.getInt("nivel_animo_11", 0)==1||preferences.getInt("nivel_animo_12", 0)==1
                        ||preferences.getInt("nivel_animo_13", 0)==1||preferences.getInt("nivel_animo_14", 0)==1||preferences.getInt("nivel_animo_15", 0)==1
                        ||preferences.getInt("nivel_animo_16", 0)==1||preferences.getInt("nivel_animo_17", 0)==1||preferences.getInt("nivel_animo_18", 0)==1
                        ||preferences.getInt("nivel_animo_19", 0)==1||preferences.getInt("nivel_animo_20", 0)==1||preferences.getInt("nivel_animo_21", 0)==1
                        ||preferences.getInt("nivel_animo_22", 0)==1||preferences.getInt("nivel_animo_23", 0)==1||preferences.getInt("nivel_animo_24", 0)==1
                        ||preferences.getInt("nivel_animo_25", 0)==1||preferences.getInt("nivel_animo_26", 0)==1||preferences.getInt("nivel_animo_27", 0)==1
                        ||preferences.getInt("nivel_animo_28", 0)==1){
                    niveles_animo(4, "4");}
            }
            if (position == 4) {
                if( preferences.getInt("nivel_animo_1", 0)==1||preferences.getInt("nivel_animo_2", 0)==1||preferences.getInt("nivel_animo_3", 0)==1
                        ||preferences.getInt("nivel_animo_4", 0)==1||preferences.getInt("nivel_animo_5", 0)==1||preferences.getInt("nivel_animo_6", 0)==1
                        ||preferences.getInt("nivel_animo_7", 0)==1||preferences.getInt("nivel_animo_8", 0)==1||preferences.getInt("nivel_animo_9", 0)==1
                        ||preferences.getInt("nivel_animo_10", 0)==1||preferences.getInt("nivel_animo_11", 0)==1||preferences.getInt("nivel_animo_12", 0)==1
                        ||preferences.getInt("nivel_animo_13", 0)==1||preferences.getInt("nivel_animo_14", 0)==1||preferences.getInt("nivel_animo_15", 0)==1
                        ||preferences.getInt("nivel_animo_16", 0)==1||preferences.getInt("nivel_animo_17", 0)==1||preferences.getInt("nivel_animo_18", 0)==1
                        ||preferences.getInt("nivel_animo_19", 0)==1||preferences.getInt("nivel_animo_20", 0)==1||preferences.getInt("nivel_animo_21", 0)==1
                        ||preferences.getInt("nivel_animo_22", 0)==1||preferences.getInt("nivel_animo_23", 0)==1||preferences.getInt("nivel_animo_24", 0)==1
                        ||preferences.getInt("nivel_animo_25", 0)==1||preferences.getInt("nivel_animo_26", 0)==1||preferences.getInt("nivel_animo_27", 0)==1
                        ||preferences.getInt("nivel_animo_28", 0)==1){
                    niveles_animo(5, "5");}
            }
            if (position == 5) {
                if( preferences.getInt("nivel_animo_1", 0)==1||preferences.getInt("nivel_animo_2", 0)==1||preferences.getInt("nivel_animo_3", 0)==1
                        ||preferences.getInt("nivel_animo_4", 0)==1||preferences.getInt("nivel_animo_5", 0)==1||preferences.getInt("nivel_animo_6", 0)==1
                        ||preferences.getInt("nivel_animo_7", 0)==1||preferences.getInt("nivel_animo_8", 0)==1||preferences.getInt("nivel_animo_9", 0)==1
                        ||preferences.getInt("nivel_animo_10", 0)==1||preferences.getInt("nivel_animo_11", 0)==1||preferences.getInt("nivel_animo_12", 0)==1
                        ||preferences.getInt("nivel_animo_13", 0)==1||preferences.getInt("nivel_animo_14", 0)==1||preferences.getInt("nivel_animo_15", 0)==1
                        ||preferences.getInt("nivel_animo_16", 0)==1||preferences.getInt("nivel_animo_17", 0)==1||preferences.getInt("nivel_animo_18", 0)==1
                        ||preferences.getInt("nivel_animo_19", 0)==1||preferences.getInt("nivel_animo_20", 0)==1||preferences.getInt("nivel_animo_21", 0)==1
                        ||preferences.getInt("nivel_animo_22", 0)==1||preferences.getInt("nivel_animo_23", 0)==1||preferences.getInt("nivel_animo_24", 0)==1
                        ||preferences.getInt("nivel_animo_25", 0)==1||preferences.getInt("nivel_animo_26", 0)==1||preferences.getInt("nivel_animo_27", 0)==1
                        ||preferences.getInt("nivel_animo_28", 0)==1){
                    niveles_animo(6, "6");}
            }
            if (position == 6) {
                if( preferences.getInt("nivel_animo_1", 0)==1||preferences.getInt("nivel_animo_2", 0)==1||preferences.getInt("nivel_animo_3", 0)==1
                        ||preferences.getInt("nivel_animo_4", 0)==1||preferences.getInt("nivel_animo_5", 0)==1||preferences.getInt("nivel_animo_6", 0)==1
                        ||preferences.getInt("nivel_animo_7", 0)==1||preferences.getInt("nivel_animo_8", 0)==1||preferences.getInt("nivel_animo_9", 0)==1
                        ||preferences.getInt("nivel_animo_10", 0)==1||preferences.getInt("nivel_animo_11", 0)==1||preferences.getInt("nivel_animo_12", 0)==1
                        ||preferences.getInt("nivel_animo_13", 0)==1||preferences.getInt("nivel_animo_14", 0)==1||preferences.getInt("nivel_animo_15", 0)==1
                        ||preferences.getInt("nivel_animo_16", 0)==1||preferences.getInt("nivel_animo_17", 0)==1||preferences.getInt("nivel_animo_18", 0)==1
                        ||preferences.getInt("nivel_animo_19", 0)==1||preferences.getInt("nivel_animo_20", 0)==1||preferences.getInt("nivel_animo_21", 0)==1
                        ||preferences.getInt("nivel_animo_22", 0)==1||preferences.getInt("nivel_animo_23", 0)==1||preferences.getInt("nivel_animo_24", 0)==1
                        ||preferences.getInt("nivel_animo_25", 0)==1||preferences.getInt("nivel_animo_26", 0)==1||preferences.getInt("nivel_animo_27", 0)==1
                        ||preferences.getInt("nivel_animo_28", 0)==1){
                    niveles_animo(7, "7");}
            }
            if (position == 7) {
                if( preferences.getInt("nivel_animo_1", 0)==1||preferences.getInt("nivel_animo_2", 0)==1||preferences.getInt("nivel_animo_3", 0)==1
                        ||preferences.getInt("nivel_animo_4", 0)==1||preferences.getInt("nivel_animo_5", 0)==1||preferences.getInt("nivel_animo_6", 0)==1
                        ||preferences.getInt("nivel_animo_7", 0)==1||preferences.getInt("nivel_animo_8", 0)==1||preferences.getInt("nivel_animo_9", 0)==1
                        ||preferences.getInt("nivel_animo_10", 0)==1||preferences.getInt("nivel_animo_11", 0)==1||preferences.getInt("nivel_animo_12", 0)==1
                        ||preferences.getInt("nivel_animo_13", 0)==1||preferences.getInt("nivel_animo_14", 0)==1||preferences.getInt("nivel_animo_15", 0)==1
                        ||preferences.getInt("nivel_animo_16", 0)==1||preferences.getInt("nivel_animo_17", 0)==1||preferences.getInt("nivel_animo_18", 0)==1
                        ||preferences.getInt("nivel_animo_19", 0)==1||preferences.getInt("nivel_animo_20", 0)==1||preferences.getInt("nivel_animo_21", 0)==1
                        ||preferences.getInt("nivel_animo_22", 0)==1||preferences.getInt("nivel_animo_23", 0)==1||preferences.getInt("nivel_animo_24", 0)==1
                        ||preferences.getInt("nivel_animo_25", 0)==1||preferences.getInt("nivel_animo_26", 0)==1||preferences.getInt("nivel_animo_27", 0)==1
                        ||preferences.getInt("nivel_animo_28", 0)==1){
                    niveles_animo(8, "8");}
            }
            if (position == 8) {
                if( preferences.getInt("nivel_animo_1", 0)==1||preferences.getInt("nivel_animo_2", 0)==1||preferences.getInt("nivel_animo_3", 0)==1
                        ||preferences.getInt("nivel_animo_4", 0)==1||preferences.getInt("nivel_animo_5", 0)==1||preferences.getInt("nivel_animo_6", 0)==1
                        ||preferences.getInt("nivel_animo_7", 0)==1||preferences.getInt("nivel_animo_8", 0)==1||preferences.getInt("nivel_animo_9", 0)==1
                        ||preferences.getInt("nivel_animo_10", 0)==1||preferences.getInt("nivel_animo_11", 0)==1||preferences.getInt("nivel_animo_12", 0)==1
                        ||preferences.getInt("nivel_animo_13", 0)==1||preferences.getInt("nivel_animo_14", 0)==1||preferences.getInt("nivel_animo_15", 0)==1
                        ||preferences.getInt("nivel_animo_16", 0)==1||preferences.getInt("nivel_animo_17", 0)==1||preferences.getInt("nivel_animo_18", 0)==1
                        ||preferences.getInt("nivel_animo_19", 0)==1||preferences.getInt("nivel_animo_20", 0)==1||preferences.getInt("nivel_animo_21", 0)==1
                        ||preferences.getInt("nivel_animo_22", 0)==1||preferences.getInt("nivel_animo_23", 0)==1||preferences.getInt("nivel_animo_24", 0)==1
                        ||preferences.getInt("nivel_animo_25", 0)==1||preferences.getInt("nivel_animo_26", 0)==1||preferences.getInt("nivel_animo_27", 0)==1
                        ||preferences.getInt("nivel_animo_28", 0)==1){
                    niveles_animo(9, "9");}
            }
            if (position == 9) {
                if( preferences.getInt("nivel_animo_1", 0)==1||preferences.getInt("nivel_animo_2", 0)==1||preferences.getInt("nivel_animo_3", 0)==1
                        ||preferences.getInt("nivel_animo_4", 0)==1||preferences.getInt("nivel_animo_5", 0)==1||preferences.getInt("nivel_animo_6", 0)==1
                        ||preferences.getInt("nivel_animo_7", 0)==1||preferences.getInt("nivel_animo_8", 0)==1||preferences.getInt("nivel_animo_9", 0)==1
                        ||preferences.getInt("nivel_animo_10", 0)==1||preferences.getInt("nivel_animo_11", 0)==1||preferences.getInt("nivel_animo_12", 0)==1
                        ||preferences.getInt("nivel_animo_13", 0)==1||preferences.getInt("nivel_animo_14", 0)==1||preferences.getInt("nivel_animo_15", 0)==1
                        ||preferences.getInt("nivel_animo_16", 0)==1||preferences.getInt("nivel_animo_17", 0)==1||preferences.getInt("nivel_animo_18", 0)==1
                        ||preferences.getInt("nivel_animo_19", 0)==1||preferences.getInt("nivel_animo_20", 0)==1||preferences.getInt("nivel_animo_21", 0)==1
                        ||preferences.getInt("nivel_animo_22", 0)==1||preferences.getInt("nivel_animo_23", 0)==1||preferences.getInt("nivel_animo_24", 0)==1
                        ||preferences.getInt("nivel_animo_25", 0)==1||preferences.getInt("nivel_animo_26", 0)==1||preferences.getInt("nivel_animo_27", 0)==1
                        ||preferences.getInt("nivel_animo_28", 0)==1){
                    niveles_animo(10, "10");}
            }
            if (position == 10) {
                if( preferences.getInt("nivel_animo_1", 0)==1||preferences.getInt("nivel_animo_2", 0)==1||preferences.getInt("nivel_animo_3", 0)==1
                        ||preferences.getInt("nivel_animo_4", 0)==1||preferences.getInt("nivel_animo_5", 0)==1||preferences.getInt("nivel_animo_6", 0)==1
                        ||preferences.getInt("nivel_animo_7", 0)==1||preferences.getInt("nivel_animo_8", 0)==1||preferences.getInt("nivel_animo_9", 0)==1
                        ||preferences.getInt("nivel_animo_10", 0)==1||preferences.getInt("nivel_animo_11", 0)==1||preferences.getInt("nivel_animo_12", 0)==1
                        ||preferences.getInt("nivel_animo_13", 0)==1||preferences.getInt("nivel_animo_14", 0)==1||preferences.getInt("nivel_animo_15", 0)==1
                        ||preferences.getInt("nivel_animo_16", 0)==1||preferences.getInt("nivel_animo_17", 0)==1||preferences.getInt("nivel_animo_18", 0)==1
                        ||preferences.getInt("nivel_animo_19", 0)==1||preferences.getInt("nivel_animo_20", 0)==1||preferences.getInt("nivel_animo_21", 0)==1
                        ||preferences.getInt("nivel_animo_22", 0)==1||preferences.getInt("nivel_animo_23", 0)==1||preferences.getInt("nivel_animo_24", 0)==1
                        ||preferences.getInt("nivel_animo_25", 0)==1||preferences.getInt("nivel_animo_26", 0)==1||preferences.getInt("nivel_animo_27", 0)==1
                        ||preferences.getInt("nivel_animo_28", 0)==1){
                    niveles_animo(11, "11");}
            }
            if (position == 11) {
                if( preferences.getInt("nivel_animo_1", 0)==1||preferences.getInt("nivel_animo_2", 0)==1||preferences.getInt("nivel_animo_3", 0)==1
                        ||preferences.getInt("nivel_animo_4", 0)==1||preferences.getInt("nivel_animo_5", 0)==1||preferences.getInt("nivel_animo_6", 0)==1
                        ||preferences.getInt("nivel_animo_7", 0)==1||preferences.getInt("nivel_animo_8", 0)==1||preferences.getInt("nivel_animo_9", 0)==1
                        ||preferences.getInt("nivel_animo_10", 0)==1||preferences.getInt("nivel_animo_11", 0)==1||preferences.getInt("nivel_animo_12", 0)==1
                        ||preferences.getInt("nivel_animo_13", 0)==1||preferences.getInt("nivel_animo_14", 0)==1||preferences.getInt("nivel_animo_15", 0)==1
                        ||preferences.getInt("nivel_animo_16", 0)==1||preferences.getInt("nivel_animo_17", 0)==1||preferences.getInt("nivel_animo_18", 0)==1
                        ||preferences.getInt("nivel_animo_19", 0)==1||preferences.getInt("nivel_animo_20", 0)==1||preferences.getInt("nivel_animo_21", 0)==1
                        ||preferences.getInt("nivel_animo_22", 0)==1||preferences.getInt("nivel_animo_23", 0)==1||preferences.getInt("nivel_animo_24", 0)==1
                        ||preferences.getInt("nivel_animo_25", 0)==1||preferences.getInt("nivel_animo_26", 0)==1||preferences.getInt("nivel_animo_27", 0)==1
                        ||preferences.getInt("nivel_animo_28", 0)==1){
                    niveles_animo(12, "12");}
            }
            if (position == 12) {
                if( preferences.getInt("nivel_animo_1", 0)==1||preferences.getInt("nivel_animo_2", 0)==1||preferences.getInt("nivel_animo_3", 0)==1
                        ||preferences.getInt("nivel_animo_4", 0)==1||preferences.getInt("nivel_animo_5", 0)==1||preferences.getInt("nivel_animo_6", 0)==1
                        ||preferences.getInt("nivel_animo_7", 0)==1||preferences.getInt("nivel_animo_8", 0)==1||preferences.getInt("nivel_animo_9", 0)==1
                        ||preferences.getInt("nivel_animo_10", 0)==1||preferences.getInt("nivel_animo_11", 0)==1||preferences.getInt("nivel_animo_12", 0)==1
                        ||preferences.getInt("nivel_animo_13", 0)==1||preferences.getInt("nivel_animo_14", 0)==1||preferences.getInt("nivel_animo_15", 0)==1
                        ||preferences.getInt("nivel_animo_16", 0)==1||preferences.getInt("nivel_animo_17", 0)==1||preferences.getInt("nivel_animo_18", 0)==1
                        ||preferences.getInt("nivel_animo_19", 0)==1||preferences.getInt("nivel_animo_20", 0)==1||preferences.getInt("nivel_animo_21", 0)==1
                        ||preferences.getInt("nivel_animo_22", 0)==1||preferences.getInt("nivel_animo_23", 0)==1||preferences.getInt("nivel_animo_24", 0)==1
                        ||preferences.getInt("nivel_animo_25", 0)==1||preferences.getInt("nivel_animo_26", 0)==1||preferences.getInt("nivel_animo_27", 0)==1
                        ||preferences.getInt("nivel_animo_28", 0)==1){
                    niveles_animo(13, "13");}
            }
            if (position == 13) {
                if( preferences.getInt("nivel_animo_1", 0)==1||preferences.getInt("nivel_animo_2", 0)==1||preferences.getInt("nivel_animo_3", 0)==1
                        ||preferences.getInt("nivel_animo_4", 0)==1||preferences.getInt("nivel_animo_5", 0)==1||preferences.getInt("nivel_animo_6", 0)==1
                        ||preferences.getInt("nivel_animo_7", 0)==1||preferences.getInt("nivel_animo_8", 0)==1||preferences.getInt("nivel_animo_9", 0)==1
                        ||preferences.getInt("nivel_animo_10", 0)==1||preferences.getInt("nivel_animo_11", 0)==1||preferences.getInt("nivel_animo_12", 0)==1
                        ||preferences.getInt("nivel_animo_13", 0)==1||preferences.getInt("nivel_animo_14", 0)==1||preferences.getInt("nivel_animo_15", 0)==1
                        ||preferences.getInt("nivel_animo_16", 0)==1||preferences.getInt("nivel_animo_17", 0)==1||preferences.getInt("nivel_animo_18", 0)==1
                        ||preferences.getInt("nivel_animo_19", 0)==1||preferences.getInt("nivel_animo_20", 0)==1||preferences.getInt("nivel_animo_21", 0)==1
                        ||preferences.getInt("nivel_animo_22", 0)==1||preferences.getInt("nivel_animo_23", 0)==1||preferences.getInt("nivel_animo_24", 0)==1
                        ||preferences.getInt("nivel_animo_25", 0)==1||preferences.getInt("nivel_animo_26", 0)==1||preferences.getInt("nivel_animo_27", 0)==1
                        ||preferences.getInt("nivel_animo_28", 0)==1){
                    niveles_animo(14, "14");}
            }
            if (position == 14) {
                if( preferences.getInt("nivel_animo_1", 0)==1||preferences.getInt("nivel_animo_2", 0)==1||preferences.getInt("nivel_animo_3", 0)==1
                        ||preferences.getInt("nivel_animo_4", 0)==1||preferences.getInt("nivel_animo_5", 0)==1||preferences.getInt("nivel_animo_6", 0)==1
                        ||preferences.getInt("nivel_animo_7", 0)==1||preferences.getInt("nivel_animo_8", 0)==1||preferences.getInt("nivel_animo_9", 0)==1
                        ||preferences.getInt("nivel_animo_10", 0)==1||preferences.getInt("nivel_animo_11", 0)==1||preferences.getInt("nivel_animo_12", 0)==1
                        ||preferences.getInt("nivel_animo_13", 0)==1||preferences.getInt("nivel_animo_14", 0)==1||preferences.getInt("nivel_animo_15", 0)==1
                        ||preferences.getInt("nivel_animo_16", 0)==1||preferences.getInt("nivel_animo_17", 0)==1||preferences.getInt("nivel_animo_18", 0)==1
                        ||preferences.getInt("nivel_animo_19", 0)==1||preferences.getInt("nivel_animo_20", 0)==1||preferences.getInt("nivel_animo_21", 0)==1
                        ||preferences.getInt("nivel_animo_22", 0)==1||preferences.getInt("nivel_animo_23", 0)==1||preferences.getInt("nivel_animo_24", 0)==1
                        ||preferences.getInt("nivel_animo_25", 0)==1||preferences.getInt("nivel_animo_26", 0)==1||preferences.getInt("nivel_animo_27", 0)==1
                        ||preferences.getInt("nivel_animo_28", 0)==1){
                    niveles_animo(15, "15");}
            }
            if (position == 15) {
                if( preferences.getInt("nivel_animo_1", 0)==1||preferences.getInt("nivel_animo_2", 0)==1||preferences.getInt("nivel_animo_3", 0)==1
                        ||preferences.getInt("nivel_animo_4", 0)==1||preferences.getInt("nivel_animo_5", 0)==1||preferences.getInt("nivel_animo_6", 0)==1
                        ||preferences.getInt("nivel_animo_7", 0)==1||preferences.getInt("nivel_animo_8", 0)==1||preferences.getInt("nivel_animo_9", 0)==1
                        ||preferences.getInt("nivel_animo_10", 0)==1||preferences.getInt("nivel_animo_11", 0)==1||preferences.getInt("nivel_animo_12", 0)==1
                        ||preferences.getInt("nivel_animo_13", 0)==1||preferences.getInt("nivel_animo_14", 0)==1||preferences.getInt("nivel_animo_15", 0)==1
                        ||preferences.getInt("nivel_animo_16", 0)==1||preferences.getInt("nivel_animo_17", 0)==1||preferences.getInt("nivel_animo_18", 0)==1
                        ||preferences.getInt("nivel_animo_19", 0)==1||preferences.getInt("nivel_animo_20", 0)==1||preferences.getInt("nivel_animo_21", 0)==1
                        ||preferences.getInt("nivel_animo_22", 0)==1||preferences.getInt("nivel_animo_23", 0)==1||preferences.getInt("nivel_animo_24", 0)==1
                        ||preferences.getInt("nivel_animo_25", 0)==1||preferences.getInt("nivel_animo_26", 0)==1||preferences.getInt("nivel_animo_27", 0)==1
                        ||preferences.getInt("nivel_animo_28", 0)==1){
                    niveles_animo(16, "16");}
            }
            if (position == 16) {
                if( preferences.getInt("nivel_animo_1", 0)==1||preferences.getInt("nivel_animo_2", 0)==1||preferences.getInt("nivel_animo_3", 0)==1
                        ||preferences.getInt("nivel_animo_4", 0)==1||preferences.getInt("nivel_animo_5", 0)==1||preferences.getInt("nivel_animo_6", 0)==1
                        ||preferences.getInt("nivel_animo_7", 0)==1||preferences.getInt("nivel_animo_8", 0)==1||preferences.getInt("nivel_animo_9", 0)==1
                        ||preferences.getInt("nivel_animo_10", 0)==1||preferences.getInt("nivel_animo_11", 0)==1||preferences.getInt("nivel_animo_12", 0)==1
                        ||preferences.getInt("nivel_animo_13", 0)==1||preferences.getInt("nivel_animo_14", 0)==1||preferences.getInt("nivel_animo_15", 0)==1
                        ||preferences.getInt("nivel_animo_16", 0)==1||preferences.getInt("nivel_animo_17", 0)==1||preferences.getInt("nivel_animo_18", 0)==1
                        ||preferences.getInt("nivel_animo_19", 0)==1||preferences.getInt("nivel_animo_20", 0)==1||preferences.getInt("nivel_animo_21", 0)==1
                        ||preferences.getInt("nivel_animo_22", 0)==1||preferences.getInt("nivel_animo_23", 0)==1||preferences.getInt("nivel_animo_24", 0)==1
                        ||preferences.getInt("nivel_animo_25", 0)==1||preferences.getInt("nivel_animo_26", 0)==1||preferences.getInt("nivel_animo_27", 0)==1
                        ||preferences.getInt("nivel_animo_28", 0)==1){
                    niveles_animo(17, "17");}
            }
            if (position == 17) {
                if( preferences.getInt("nivel_animo_1", 0)==1||preferences.getInt("nivel_animo_2", 0)==1||preferences.getInt("nivel_animo_3", 0)==1
                        ||preferences.getInt("nivel_animo_4", 0)==1||preferences.getInt("nivel_animo_5", 0)==1||preferences.getInt("nivel_animo_6", 0)==1
                        ||preferences.getInt("nivel_animo_7", 0)==1||preferences.getInt("nivel_animo_8", 0)==1||preferences.getInt("nivel_animo_9", 0)==1
                        ||preferences.getInt("nivel_animo_10", 0)==1||preferences.getInt("nivel_animo_11", 0)==1||preferences.getInt("nivel_animo_12", 0)==1
                        ||preferences.getInt("nivel_animo_13", 0)==1||preferences.getInt("nivel_animo_14", 0)==1||preferences.getInt("nivel_animo_15", 0)==1
                        ||preferences.getInt("nivel_animo_16", 0)==1||preferences.getInt("nivel_animo_17", 0)==1||preferences.getInt("nivel_animo_18", 0)==1
                        ||preferences.getInt("nivel_animo_19", 0)==1||preferences.getInt("nivel_animo_20", 0)==1||preferences.getInt("nivel_animo_21", 0)==1
                        ||preferences.getInt("nivel_animo_22", 0)==1||preferences.getInt("nivel_animo_23", 0)==1||preferences.getInt("nivel_animo_24", 0)==1
                        ||preferences.getInt("nivel_animo_25", 0)==1||preferences.getInt("nivel_animo_26", 0)==1||preferences.getInt("nivel_animo_27", 0)==1
                        ||preferences.getInt("nivel_animo_28", 0)==1){
                    niveles_animo(18, "18");}
            }
            if (position == 18) {
                if( preferences.getInt("nivel_animo_1", 0)==1||preferences.getInt("nivel_animo_2", 0)==1||preferences.getInt("nivel_animo_3", 0)==1
                        ||preferences.getInt("nivel_animo_4", 0)==1||preferences.getInt("nivel_animo_5", 0)==1||preferences.getInt("nivel_animo_6", 0)==1
                        ||preferences.getInt("nivel_animo_7", 0)==1||preferences.getInt("nivel_animo_8", 0)==1||preferences.getInt("nivel_animo_9", 0)==1
                        ||preferences.getInt("nivel_animo_10", 0)==1||preferences.getInt("nivel_animo_11", 0)==1||preferences.getInt("nivel_animo_12", 0)==1
                        ||preferences.getInt("nivel_animo_13", 0)==1||preferences.getInt("nivel_animo_14", 0)==1||preferences.getInt("nivel_animo_15", 0)==1
                        ||preferences.getInt("nivel_animo_16", 0)==1||preferences.getInt("nivel_animo_17", 0)==1||preferences.getInt("nivel_animo_18", 0)==1
                        ||preferences.getInt("nivel_animo_19", 0)==1||preferences.getInt("nivel_animo_20", 0)==1||preferences.getInt("nivel_animo_21", 0)==1
                        ||preferences.getInt("nivel_animo_22", 0)==1||preferences.getInt("nivel_animo_23", 0)==1||preferences.getInt("nivel_animo_24", 0)==1
                        ||preferences.getInt("nivel_animo_25", 0)==1||preferences.getInt("nivel_animo_26", 0)==1||preferences.getInt("nivel_animo_27", 0)==1
                        ||preferences.getInt("nivel_animo_28", 0)==1){
                    niveles_animo(19, "19");}
            }
            if (position == 19) {
                if( preferences.getInt("nivel_animo_1", 0)==1||preferences.getInt("nivel_animo_2", 0)==1||preferences.getInt("nivel_animo_3", 0)==1
                        ||preferences.getInt("nivel_animo_4", 0)==1||preferences.getInt("nivel_animo_5", 0)==1||preferences.getInt("nivel_animo_6", 0)==1
                        ||preferences.getInt("nivel_animo_7", 0)==1||preferences.getInt("nivel_animo_8", 0)==1||preferences.getInt("nivel_animo_9", 0)==1
                        ||preferences.getInt("nivel_animo_10", 0)==1||preferences.getInt("nivel_animo_11", 0)==1||preferences.getInt("nivel_animo_12", 0)==1
                        ||preferences.getInt("nivel_animo_13", 0)==1||preferences.getInt("nivel_animo_14", 0)==1||preferences.getInt("nivel_animo_15", 0)==1
                        ||preferences.getInt("nivel_animo_16", 0)==1||preferences.getInt("nivel_animo_17", 0)==1||preferences.getInt("nivel_animo_18", 0)==1
                        ||preferences.getInt("nivel_animo_19", 0)==1||preferences.getInt("nivel_animo_20", 0)==1||preferences.getInt("nivel_animo_21", 0)==1
                        ||preferences.getInt("nivel_animo_22", 0)==1||preferences.getInt("nivel_animo_23", 0)==1||preferences.getInt("nivel_animo_24", 0)==1
                        ||preferences.getInt("nivel_animo_25", 0)==1||preferences.getInt("nivel_animo_26", 0)==1||preferences.getInt("nivel_animo_27", 0)==1
                        ||preferences.getInt("nivel_animo_28", 0)==1){
                    niveles_animo(20, "20");}
            }
            if (position == 20) {
                if( preferences.getInt("nivel_animo_1", 0)==1||preferences.getInt("nivel_animo_2", 0)==1||preferences.getInt("nivel_animo_3", 0)==1
                        ||preferences.getInt("nivel_animo_4", 0)==1||preferences.getInt("nivel_animo_5", 0)==1||preferences.getInt("nivel_animo_6", 0)==1
                        ||preferences.getInt("nivel_animo_7", 0)==1||preferences.getInt("nivel_animo_8", 0)==1||preferences.getInt("nivel_animo_9", 0)==1
                        ||preferences.getInt("nivel_animo_10", 0)==1||preferences.getInt("nivel_animo_11", 0)==1||preferences.getInt("nivel_animo_12", 0)==1
                        ||preferences.getInt("nivel_animo_13", 0)==1||preferences.getInt("nivel_animo_14", 0)==1||preferences.getInt("nivel_animo_15", 0)==1
                        ||preferences.getInt("nivel_animo_16", 0)==1||preferences.getInt("nivel_animo_17", 0)==1||preferences.getInt("nivel_animo_18", 0)==1
                        ||preferences.getInt("nivel_animo_19", 0)==1||preferences.getInt("nivel_animo_20", 0)==1||preferences.getInt("nivel_animo_21", 0)==1
                        ||preferences.getInt("nivel_animo_22", 0)==1||preferences.getInt("nivel_animo_23", 0)==1||preferences.getInt("nivel_animo_24", 0)==1
                        ||preferences.getInt("nivel_animo_25", 0)==1||preferences.getInt("nivel_animo_26", 0)==1||preferences.getInt("nivel_animo_27", 0)==1
                        ||preferences.getInt("nivel_animo_28", 0)==1){
                    niveles_animo(21, "21");}
            }

            if (position == 21) {
                if( preferences.getInt("nivel_animo_1", 0)==1||preferences.getInt("nivel_animo_2", 0)==1||preferences.getInt("nivel_animo_3", 0)==1
                        ||preferences.getInt("nivel_animo_4", 0)==1||preferences.getInt("nivel_animo_5", 0)==1||preferences.getInt("nivel_animo_6", 0)==1
                        ||preferences.getInt("nivel_animo_7", 0)==1||preferences.getInt("nivel_animo_8", 0)==1||preferences.getInt("nivel_animo_9", 0)==1
                        ||preferences.getInt("nivel_animo_10", 0)==1||preferences.getInt("nivel_animo_11", 0)==1||preferences.getInt("nivel_animo_12", 0)==1
                        ||preferences.getInt("nivel_animo_13", 0)==1||preferences.getInt("nivel_animo_14", 0)==1||preferences.getInt("nivel_animo_15", 0)==1
                        ||preferences.getInt("nivel_animo_16", 0)==1||preferences.getInt("nivel_animo_17", 0)==1||preferences.getInt("nivel_animo_18", 0)==1
                        ||preferences.getInt("nivel_animo_19", 0)==1||preferences.getInt("nivel_animo_20", 0)==1||preferences.getInt("nivel_animo_21", 0)==1
                        ||preferences.getInt("nivel_animo_22", 0)==1||preferences.getInt("nivel_animo_23", 0)==1||preferences.getInt("nivel_animo_24", 0)==1
                        ||preferences.getInt("nivel_animo_25", 0)==1||preferences.getInt("nivel_animo_26", 0)==1||preferences.getInt("nivel_animo_27", 0)==1
                        ||preferences.getInt("nivel_animo_28", 0)==1){
                    niveles_animo(22, "22");}
            }
            if (position == 22) {
                if( preferences.getInt("nivel_animo_1", 0)==1||preferences.getInt("nivel_animo_2", 0)==1||preferences.getInt("nivel_animo_3", 0)==1
                        ||preferences.getInt("nivel_animo_4", 0)==1||preferences.getInt("nivel_animo_5", 0)==1||preferences.getInt("nivel_animo_6", 0)==1
                        ||preferences.getInt("nivel_animo_7", 0)==1||preferences.getInt("nivel_animo_8", 0)==1||preferences.getInt("nivel_animo_9", 0)==1
                        ||preferences.getInt("nivel_animo_10", 0)==1||preferences.getInt("nivel_animo_11", 0)==1||preferences.getInt("nivel_animo_12", 0)==1
                        ||preferences.getInt("nivel_animo_13", 0)==1||preferences.getInt("nivel_animo_14", 0)==1||preferences.getInt("nivel_animo_15", 0)==1
                        ||preferences.getInt("nivel_animo_16", 0)==1||preferences.getInt("nivel_animo_17", 0)==1||preferences.getInt("nivel_animo_18", 0)==1
                        ||preferences.getInt("nivel_animo_19", 0)==1||preferences.getInt("nivel_animo_20", 0)==1||preferences.getInt("nivel_animo_21", 0)==1
                        ||preferences.getInt("nivel_animo_22", 0)==1||preferences.getInt("nivel_animo_23", 0)==1||preferences.getInt("nivel_animo_24", 0)==1
                        ||preferences.getInt("nivel_animo_25", 0)==1||preferences.getInt("nivel_animo_26", 0)==1||preferences.getInt("nivel_animo_27", 0)==1
                        ||preferences.getInt("nivel_animo_28", 0)==1){
                    niveles_animo(23, "23");}
            }
            if (position == 23) {
                if( preferences.getInt("nivel_animo_1", 0)==1||preferences.getInt("nivel_animo_2", 0)==1||preferences.getInt("nivel_animo_3", 0)==1
                        ||preferences.getInt("nivel_animo_4", 0)==1||preferences.getInt("nivel_animo_5", 0)==1||preferences.getInt("nivel_animo_6", 0)==1
                        ||preferences.getInt("nivel_animo_7", 0)==1||preferences.getInt("nivel_animo_8", 0)==1||preferences.getInt("nivel_animo_9", 0)==1
                        ||preferences.getInt("nivel_animo_10", 0)==1||preferences.getInt("nivel_animo_11", 0)==1||preferences.getInt("nivel_animo_12", 0)==1
                        ||preferences.getInt("nivel_animo_13", 0)==1||preferences.getInt("nivel_animo_14", 0)==1||preferences.getInt("nivel_animo_15", 0)==1
                        ||preferences.getInt("nivel_animo_16", 0)==1||preferences.getInt("nivel_animo_17", 0)==1||preferences.getInt("nivel_animo_18", 0)==1
                        ||preferences.getInt("nivel_animo_19", 0)==1||preferences.getInt("nivel_animo_20", 0)==1||preferences.getInt("nivel_animo_21", 0)==1
                        ||preferences.getInt("nivel_animo_22", 0)==1||preferences.getInt("nivel_animo_23", 0)==1||preferences.getInt("nivel_animo_24", 0)==1
                        ||preferences.getInt("nivel_animo_25", 0)==1||preferences.getInt("nivel_animo_26", 0)==1||preferences.getInt("nivel_animo_27", 0)==1
                        ||preferences.getInt("nivel_animo_28", 0)==1){
                    niveles_animo(24, "24");}
            }
            if (position == 24) {
                if( preferences.getInt("nivel_animo_1", 0)==1||preferences.getInt("nivel_animo_2", 0)==1||preferences.getInt("nivel_animo_3", 0)==1
                        ||preferences.getInt("nivel_animo_4", 0)==1||preferences.getInt("nivel_animo_5", 0)==1||preferences.getInt("nivel_animo_6", 0)==1
                        ||preferences.getInt("nivel_animo_7", 0)==1||preferences.getInt("nivel_animo_8", 0)==1||preferences.getInt("nivel_animo_9", 0)==1
                        ||preferences.getInt("nivel_animo_10", 0)==1||preferences.getInt("nivel_animo_11", 0)==1||preferences.getInt("nivel_animo_12", 0)==1
                        ||preferences.getInt("nivel_animo_13", 0)==1||preferences.getInt("nivel_animo_14", 0)==1||preferences.getInt("nivel_animo_15", 0)==1
                        ||preferences.getInt("nivel_animo_16", 0)==1||preferences.getInt("nivel_animo_17", 0)==1||preferences.getInt("nivel_animo_18", 0)==1
                        ||preferences.getInt("nivel_animo_19", 0)==1||preferences.getInt("nivel_animo_20", 0)==1||preferences.getInt("nivel_animo_21", 0)==1
                        ||preferences.getInt("nivel_animo_22", 0)==1||preferences.getInt("nivel_animo_23", 0)==1||preferences.getInt("nivel_animo_24", 0)==1
                        ||preferences.getInt("nivel_animo_25", 0)==1||preferences.getInt("nivel_animo_26", 0)==1||preferences.getInt("nivel_animo_27", 0)==1
                        ||preferences.getInt("nivel_animo_28", 0)==1){
                    niveles_animo(25, "25");}
            }
            if (position == 25) {
                if( preferences.getInt("nivel_animo_1", 0)==1||preferences.getInt("nivel_animo_2", 0)==1||preferences.getInt("nivel_animo_3", 0)==1
                        ||preferences.getInt("nivel_animo_4", 0)==1||preferences.getInt("nivel_animo_5", 0)==1||preferences.getInt("nivel_animo_6", 0)==1
                        ||preferences.getInt("nivel_animo_7", 0)==1||preferences.getInt("nivel_animo_8", 0)==1||preferences.getInt("nivel_animo_9", 0)==1
                        ||preferences.getInt("nivel_animo_10", 0)==1||preferences.getInt("nivel_animo_11", 0)==1||preferences.getInt("nivel_animo_12", 0)==1
                        ||preferences.getInt("nivel_animo_13", 0)==1||preferences.getInt("nivel_animo_14", 0)==1||preferences.getInt("nivel_animo_15", 0)==1
                        ||preferences.getInt("nivel_animo_16", 0)==1||preferences.getInt("nivel_animo_17", 0)==1||preferences.getInt("nivel_animo_18", 0)==1
                        ||preferences.getInt("nivel_animo_19", 0)==1||preferences.getInt("nivel_animo_20", 0)==1||preferences.getInt("nivel_animo_21", 0)==1
                        ||preferences.getInt("nivel_animo_22", 0)==1||preferences.getInt("nivel_animo_23", 0)==1||preferences.getInt("nivel_animo_24", 0)==1
                        ||preferences.getInt("nivel_animo_25", 0)==1||preferences.getInt("nivel_animo_26", 0)==1||preferences.getInt("nivel_animo_27", 0)==1
                        ||preferences.getInt("nivel_animo_28", 0)==1){
                    niveles_animo(26, "26");}
            }
            if (position == 26) {
                if( preferences.getInt("nivel_animo_1", 0)==1||preferences.getInt("nivel_animo_2", 0)==1||preferences.getInt("nivel_animo_3", 0)==1
                        ||preferences.getInt("nivel_animo_4", 0)==1||preferences.getInt("nivel_animo_5", 0)==1||preferences.getInt("nivel_animo_6", 0)==1
                        ||preferences.getInt("nivel_animo_7", 0)==1||preferences.getInt("nivel_animo_8", 0)==1||preferences.getInt("nivel_animo_9", 0)==1
                        ||preferences.getInt("nivel_animo_10", 0)==1||preferences.getInt("nivel_animo_11", 0)==1||preferences.getInt("nivel_animo_12", 0)==1
                        ||preferences.getInt("nivel_animo_13", 0)==1||preferences.getInt("nivel_animo_14", 0)==1||preferences.getInt("nivel_animo_15", 0)==1
                        ||preferences.getInt("nivel_animo_16", 0)==1||preferences.getInt("nivel_animo_17", 0)==1||preferences.getInt("nivel_animo_18", 0)==1
                        ||preferences.getInt("nivel_animo_19", 0)==1||preferences.getInt("nivel_animo_20", 0)==1||preferences.getInt("nivel_animo_21", 0)==1
                        ||preferences.getInt("nivel_animo_22", 0)==1||preferences.getInt("nivel_animo_23", 0)==1||preferences.getInt("nivel_animo_24", 0)==1
                        ||preferences.getInt("nivel_animo_25", 0)==1||preferences.getInt("nivel_animo_26", 0)==1||preferences.getInt("nivel_animo_27", 0)==1
                        ||preferences.getInt("nivel_animo_28", 0)==1){
                    niveles_animo(27, "27");}
            }
            if (position == 27) {
                if( preferences.getInt("nivel_animo_1", 0)==1||preferences.getInt("nivel_animo_2", 0)==1||preferences.getInt("nivel_animo_3", 0)==1
                        ||preferences.getInt("nivel_animo_4", 0)==1||preferences.getInt("nivel_animo_5", 0)==1||preferences.getInt("nivel_animo_6", 0)==1
                        ||preferences.getInt("nivel_animo_7", 0)==1||preferences.getInt("nivel_animo_8", 0)==1||preferences.getInt("nivel_animo_9", 0)==1
                        ||preferences.getInt("nivel_animo_10", 0)==1||preferences.getInt("nivel_animo_11", 0)==1||preferences.getInt("nivel_animo_12", 0)==1
                        ||preferences.getInt("nivel_animo_13", 0)==1||preferences.getInt("nivel_animo_14", 0)==1||preferences.getInt("nivel_animo_15", 0)==1
                        ||preferences.getInt("nivel_animo_16", 0)==1||preferences.getInt("nivel_animo_17", 0)==1||preferences.getInt("nivel_animo_18", 0)==1
                        ||preferences.getInt("nivel_animo_19", 0)==1||preferences.getInt("nivel_animo_20", 0)==1||preferences.getInt("nivel_animo_21", 0)==1
                        ||preferences.getInt("nivel_animo_22", 0)==1||preferences.getInt("nivel_animo_23", 0)==1||preferences.getInt("nivel_animo_24", 0)==1
                        ||preferences.getInt("nivel_animo_25", 0)==1||preferences.getInt("nivel_animo_26", 0)==1||preferences.getInt("nivel_animo_27", 0)==1
                        ||preferences.getInt("nivel_animo_28", 0)==1){
                    niveles_animo(28, "28");}
            }
*//*
        });
    *//*    estados.putString("registro_estado", "");
        estados.apply();*//*
    }


    public void niveles_animo (int nivel_animo,String fecha){

        Bundle extras= new Bundle();
        extras.putString("feche",fecha);
        extras.putString("estado","");


        switch(nivel_animo)
        {
            case 1:
                extras.putString("estado","¡ Me siento TERRIBLE !");
                Intent i1= new Intent(this,Nivel1Activity.class);
                i1.putExtras(extras);
                startActivity(i1);

                break;

            case 2:
                extras.putString("estado","¡ Me siento MAL !");
                Intent i2= new Intent(this,MalActivity.class);
                i2.putExtras(extras);
                startActivity(i2);

                break;

            case 3:
                extras.putString("estado","¡ Me siento BIEN !");
                Intent i3= new Intent(this,BienActivity.class);
                i3.putExtras(extras);
                startActivity(i3);

                break;

            case 4:
                extras.putString("estado","¡ Me siento MUY BIEN !");
                Intent i4= new Intent(this,MuyBienActivity.class);
                i4.putExtras(extras);
                startActivity(i4);

                break;

            case 5:
                extras.putString("estado","¡ Me siento GENIAL !");
                Intent i5= new Intent(this,GenialActivity.class);
                i5.putExtras(extras);
                startActivity(i5);

                break;

        }
*/
    }

}