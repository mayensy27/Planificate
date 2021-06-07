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
    int nivel;
    String efecto;
    ArrayList<String> lista_estados; //estos vectores deben tener la misma longitud.*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_estados);

        registro_dias = findViewById(R.id.registro_estados);
        SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);

        if (preferences.getString("registro_estado", "").equals("Estado:Terrible.")) {
            nivel = 1;
            lista_estados = new ArrayList<>();

            if (preferences.getInt("nivel_animo_1", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_1", "") + " Día de píldora: 1");

            }

            //TOMA 2 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_2", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_2", "") + " Día de píldora: 2");

            }

            //TOMA 3 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_3", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_3", "") + " Día de píldora: 3");

            }
            //TOMA 4 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_4", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_4", "") + " Día de píldora: 4");

            }
            //TOMA 5 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_5", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_5", "") + " Día de píldora: 5");

            }
            //TOMA 6 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_6", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_6", "") + " Día de píldora: 6");

            }

            //TOMA 7 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_7", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_7", "") + " Día de píldora: 7");

            }
            //TOMA 8 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_8", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_8", "") + " Día de píldora: 8");


            }
            //TOMA 9 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_9", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_9", "") + " Día de píldora: 9");

            }
            //TOMA 10 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_10", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_10", "") + " Día de píldora: 10");

            }
            //TOMA 11 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_11", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_11", "") + " Día de píldora: 11");

            }
            //TOMA 12 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_12", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_12", "") + " Día de píldora: 12");

            }
            //TOMA 13 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_13", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_13", "") + " Día de píldora: 13");

            }
            //TOMA 14 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_14", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_14", "") + " Día de píldora: 14");

            }
            //TOMA 15 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_15", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_15", "") + " Día de píldora: 15");

            }
            //TOMA 16 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_16", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_16", "") + " Día de píldora: 16");

            }
            //TOMA 17 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_17", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_17", "") + " Día de píldora: 17");

            }
            //TOMA 18 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_18", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_18", "") + " Día de píldora: 18");

            }
            //TOMA 19 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_19", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_19", "") + " Día de píldora: 19");

            }
            //TOMA 20 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_20", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_20", "") + " Día de píldora: 20");

            }
            //TOMA 21 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_21", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_21", "") + " Día de píldora: 21");

            }
            //TOMA 22 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_22", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_22", "") + " Día de píldora: 22");

            }
            //TOMA 23 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_23", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_23", "") + " Día de píldora: 23");

            }
            //TOMA 24 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_24", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_24", "") + " Día de píldora: 24");

            }
            //TOMA 25 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_25", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_25", "") + " Día de píldora: 25");

            }
            //TOMA 26 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_26", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_26", "") + " Día de píldora: 26");

            }
            //TOMA 27 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_27", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_27", "") + " Día de píldora: 27");

            }
            //TOMA 28 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_28", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_28", "") + " Día de píldora: 28");

            }
        }
        if (preferences.getString("registro_estado", "").equals("Estado:Mal.")) {
            nivel = 2;
            lista_estados = new ArrayList<>();

            if (preferences.getInt("nivel_animo_1", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_1", "") + " Día de píldora: 1");

            }

            //TOMA 2 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_2", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_2", "") + " Día de píldora: 2");

            }

            //TOMA 3 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_3", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_3", "") + " Día de píldora: 3");

            }
            //TOMA 4 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_4", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_4", "") + " Día de píldora: 4");

            }
            //TOMA 5 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_5", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_5", "") + " Día de píldora: 5");

            }
            //TOMA 6 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_6", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_6", "") + " Día de píldora: 6");

            }

            //TOMA 7 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_7", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_7", "") + " Día de píldora: 7");

            }
            //TOMA 8 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_8", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_8", "") + " Día de píldora: 8");

            }
            //TOMA 9 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_9", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_9", "") + " Día de píldora: 9");

            }
            //TOMA 10 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_10", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_10", "") + " Día de píldora: 10");

            }
            //TOMA 11 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_11", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_11", "") + " Día de píldora: 11");

            }
            //TOMA 12 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_12", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_12", "") + " Día de píldora: 12");

            }
            //TOMA 13 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_13", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_13", "") + " Día de píldora: 13");

            }
            //TOMA 14 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_14", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_14", "") + " Día de píldora: 14");

            }
            //TOMA 15 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_15", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_15", "") + " Día de píldora: 15");

            }
            //TOMA 16 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_16", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_16", "") + " Día de píldora: 16");

            }
            //TOMA 17 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_17", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_17", "") + " Día de píldora: 17");

            }
            //TOMA 18 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_18", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_18", "") + " Día de píldora: 18");

            }
            //TOMA 19 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_19", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_19", "") + " Día de píldora: 19");

            }
            //TOMA 20 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_20", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_20", "") + " Día de píldora: 20");

            }
            //TOMA 21 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_21", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_21", "") + " Día de píldora: 21");

            }
            //TOMA 22 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_22", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_22", "") + " Día de píldora: 22");

            }
            //TOMA 23 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_23", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_23", "") + " Día de píldora: 23");

            }
            //TOMA 24 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_24", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_24", "") + " Día de píldora: 24");

            }
            //TOMA 25 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_25", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_25", "") + " Día de píldora: 25");

            }
            //TOMA 26 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_26", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_26", "") + " Día de píldora: 26");

            }
            //TOMA 27 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_27", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_27", "") + " Día de píldora: 27");

            }
            //TOMA 28 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_28", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_28", "") + " Día de píldora: 28");

            }

        }
        if (preferences.getString("registro_estado", "").equals("Estado:Bien.")) {
            nivel = 3;
            lista_estados = new ArrayList<>();

            if (preferences.getInt("nivel_animo_1", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_1", "") + " Día de píldora: 1");

            }

            //TOMA 2 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_2", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_2", "") + " Día de píldora: 2");

            }

            //TOMA 3 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_3", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_3", "") + " Día de píldora: 3");

            }
            //TOMA 4 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_4", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_4", "") + " Día de píldora: 4");

            }
            //TOMA 5 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_5", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_5", "") + " Día de píldora: 5");

            }
            //TOMA 6 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_6", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_6", "") + " Día de píldora: 6");

            }

            //TOMA 7 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_7", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_7", "") + " Día de píldora: 7");

            }
            //TOMA 8 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_8", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_8", "") + " Día de píldora: 8");

            }
            //TOMA 9 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_9", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_9", "") + " Día de píldora: 9");

            }
            //TOMA 10 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_10", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_10", "") + " Día de píldora: 10");

            }
            //TOMA 11 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_11", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_11", "") + " Día de píldora: 11");

            }
            //TOMA 12 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_12", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_12", "") + " Día de píldora: 12");

            }
            //TOMA 13 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_13", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_13", "") + " Día de píldora: 13");

            }
            //TOMA 14 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_14", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_14", "") + " Día de píldora: 14");

            }
            //TOMA 15 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_15", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_15", "") + " Día de píldora: 15");

            }
            //TOMA 16 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_16", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_16", "") + " Día de píldora: 16");

            }
            //TOMA 17 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_17", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_17", "") + " Día de píldora: 17");

            }
            //TOMA 18 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_18", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_18", "") + " Día de píldora: 18");

            }
            //TOMA 19 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_19", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_19", "") + " Día de píldora: 19");

            }
            //TOMA 20 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_20", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_20", "") + " Día de píldora: 20");

            }
            //TOMA 21 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_21", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_21", "") + " Día de píldora: 21");

            }
            //TOMA 22 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_22", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_22", "") + " Día de píldora: 22");

            }
            //TOMA 23 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_23", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_23", "") + " Día de píldora: 23");


            }
            //TOMA 24 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_24", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_24", "") + " Día de píldora: 24");

            }
            //TOMA 25 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_25", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_25", "") + " Día de píldora: 25");

            }
            //TOMA 26 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_26", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_26", "") + " Día de píldora: 26");

            }
            //TOMA 27 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_27", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_27", "") + " Día de píldora: 27");

            }
            //TOMA 28 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_28", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_28", "") + " Día de píldora: 28");

            }

        }
        if (preferences.getString("registro_estado", "").equals("Estado:Muy Bien.")) {
            nivel = 4;
            lista_estados = new ArrayList<>();

            if (preferences.getInt("nivel_animo_1", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_1", "") + " Día de píldora: 1");

            }

            //TOMA 2 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_2", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_2", "") + " Día de píldora: 2");

            }

            //TOMA 3 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_3", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_3", "") + " Día de píldora: 3");

            }
            //TOMA 4 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_4", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_4", "") + " Día de píldora: 4");

            }
            //TOMA 5 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_5", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_5", "") + " Día de píldora: 5");

            }
            //TOMA 6 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_6", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_6", "") + " Día de píldora: 6");

            }

            //TOMA 7 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_7", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_7", "") + " Día de píldora: 7");

            }
            //TOMA 8 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_8", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_8", "") + " Día de píldora: 8");

            }
            //TOMA 9 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_9", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_9", "") + " Día de píldora: 9");

            }
            //TOMA 10 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_10", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_10", "") + " Día de píldora: 10");

            }
            //TOMA 11 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_11", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_11", "") + " Día de píldora: 11");

            }
            //TOMA 12 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_12", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_12", "") + " Día de píldora: 12");

            }
            //TOMA 13 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_13", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_13", "") + " Día de píldora: 13");

            }
            //TOMA 14 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_14", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_14", "") + " Día de píldora: 14");

            }
            //TOMA 15 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_15", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_15", "") + " Día de píldora: 15");

            }
            //TOMA 16 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_16", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_16", "") + " Día de píldora: 16");

            }
            //TOMA 17 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_17", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_17", "") + " Día de píldora: 17");

            }
            //TOMA 18 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_18", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_18", "") + " Día de píldora: 18");

            }
            //TOMA 19 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_19", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_19", "") + " Día de píldora: 19");

            }
            //TOMA 20 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_20", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_20", "") + " Día de píldora: 20");

            }
            //TOMA 21 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_21", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_21", "") + " Día de píldora: 21");

            }
            //TOMA 22 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_22", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_22", "") + " Día de píldora: 22");

            }
            //TOMA 23 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_23", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_23", "") + " Día de píldora: 23");

            }
            //TOMA 24 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_24", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_24", "") + " Día de píldora: 24");

            }
            //TOMA 25 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_25", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_25", "") + " Día de píldora: 25");

            }
            //TOMA 26 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_26", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_26", "") + " Día de píldora: 26");

            }
            //TOMA 27 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_27", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_27", "") + " Día de píldora: 27");

            }
            //TOMA 28 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_28", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_28", "") + " Día de píldora: 28");

            }

        }
        if (preferences.getString("registro_estado", "").equals("Estado:Genial.")) {
            nivel = 5;
            lista_estados = new ArrayList<>();

            if (preferences.getInt("nivel_animo_1", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_1", "") + " Día de píldora: 1");

            }

            //TOMA 2 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_2", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_2", "") + " Día de píldora: 2");

            }

            //TOMA 3 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_3", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_3", "") + " Día de píldora: 3");

            }
            //TOMA 4 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_4", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_4", "") + " Día de píldora: 4");

            }
            //TOMA 5 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_5", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_5", "") + " Día de píldora: 5");

            }
            //TOMA 6 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_6", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_6", "") + " Día de píldora: 6");

            }

            //TOMA 7 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_7", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_7", "") + " Día de píldora: 7");

            }
            //TOMA 8 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_8", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_8", "") + " Día de píldora: 8");

            }
            //TOMA 9 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_9", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_9", "") + " Día de píldora: 9");

            }
            //TOMA 10 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_10", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_10", "") + " Día de píldora: 10");

            }
            //TOMA 11 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_11", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_11", "") + " Día de píldora: 11");

            }
            //TOMA 12 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_12", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_12", "") + " Día de píldora: 12");

            }
            //TOMA 13 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_13", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_13", "") + " Día de píldora: 13");

            }
            //TOMA 14 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_14", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_14", "") + " Día de píldora: 14");


            }
            //TOMA 15 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_15", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_15", "") + " Día de píldora: 15");

            }
            //TOMA 16 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_16", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_16", "") + " Día de píldora: 16");

            }
            //TOMA 17 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_17", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_17", "") + " Día de píldora: 17");

            }
            //TOMA 18 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_18", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_18", "") + " Día de píldora: 18");

            }
            //TOMA 19 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_19", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_19", "") + " Día de píldora: 19");

            }
            //TOMA 20 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_20", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_20", "") + " Día de píldora: 20");

            }
            //TOMA 21 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_21", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_21", "") + " Día de píldora: 21");

            }
            //TOMA 22 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_22", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_22", "") + " Día de píldora: 22");

            }
            //TOMA 23 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_23", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_23", "") + " Día de píldora: 23");

            }
            //TOMA 24 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_24", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_24", "") + " Día de píldora: 24");

            }
            //TOMA 25 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_25", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_25", "") + " Día de píldora: 25");

            }
            //TOMA 26 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_26", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_26", "") + " Día de píldora: 26");

            }
            //TOMA 27 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_27", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_27", "") + " Día de píldora: 27");

            }
            //TOMA 28 DIA DE LA PILDORA
            if (preferences.getInt("nivel_animo_28", 0) == nivel) {
                lista_estados.add(preferences.getString("tomaBlister_28", "") + " Día de píldora: 28");

            }


        }

        //Molestias
        SharedPreferences efectos = getSharedPreferences("efectos", Context.MODE_PRIVATE);

        if (preferences.getString("registro_estado", "").equals("Molestia:Cambios de humor.")) {
            efecto = "Cambios de humor.";
            lista_estados = new ArrayList<>();

            if (efecto.equals(efectos.getString("efecto_animo_1", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_1", "") + " Día de píldora: 1");

            }

            //TOMA 2 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_2", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_2", "") + " Día de píldora: 2");

            }

            //TOMA 3 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_3", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_3", "") + " Día de píldora: 3");

            }
            //TOMA 4 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_4", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_4", "") + " Día de píldora: 4");

            }
            //TOMA 5 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_5", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_5", "") + " Día de píldora: 5");

            }
            //TOMA 6 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_6", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_6", "") + " Día de píldora: 6");

            }

            //TOMA 7 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_7", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_7", "") + " Día de píldora: 7");

            }
            //TOMA 8 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_8", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_8", "") + " Día de píldora: 8");

            }
            //TOMA 9 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_9", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_9", "") + " Día de píldora: 9");

            }
            //TOMA 10 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_10", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_10", "") + " Día de píldora: 10");

            }
            //TOMA 11 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_11", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_11", "") + " Día de píldora: 11");

            }
            //TOMA 12 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_12", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_12", "") + " Día de píldora: 12");

            }
            //TOMA 13 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_13", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_13", "") + " Día de píldora: 13");

            }
            //TOMA 14 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_14", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_14", "") + " Día de píldora: 14");

            }
            //TOMA 15 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_15", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_15", "") + " Día de píldora: 15");

            }
            //TOMA 16 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_16", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_16", "") + " Día de píldora: 16");

            }
            //TOMA 17 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_17", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_17", "") + " Día de píldora: 17");

            }
            //TOMA 18 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_18", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_18", "") + " Día de píldora: 18");

            }
            //TOMA 19 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_19", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_19", "") + " Día de píldora: 19");

            }
            //TOMA 20 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_20", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_20", "") + " Día de píldora: 20");

            }
            //TOMA 21 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_21", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_21", "") + " Día de píldora: 21");

            }
            //TOMA 22 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_22", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_22", "") + " Día de píldora: 22");

            }
            //TOMA 23 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_23", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_23", "") + " Día de píldora: 23");

            }
            //TOMA 24 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_24", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_24", "") + " Día de píldora: 24");

            }
            //TOMA 25 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_25", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_25", "") + " Día de píldora: 25");

            }
            //TOMA 26 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_26", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_26", "") + " Día de píldora: 26");

            }
            //TOMA 27 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_27", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_27", "") + " Día de píldora: 27");

            }
            //TOMA 28 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_28", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_28", "") + " Día de píldora: 28");

            }
        }

        if (preferences.getString("registro_estado", "").equals("Molestia:Aparición de acné.")) {

            efecto = "Aparición de acné.";
            lista_estados = new ArrayList<>();

            if (efecto.equals(efectos.getString("efecto_animo_1", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_1", "") + " Día de píldora: 1");

            }

            //TOMA 2 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_2", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_2", "") + " Día de píldora: 2");

            }

            //TOMA 3 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_3", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_3", "") + " Día de píldora: 3");

            }
            //TOMA 4 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_4", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_4", "") + " Día de píldora: 4");

            }
            //TOMA 5 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_5", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_5", "") + " Día de píldora: 5");

            }
            //TOMA 6 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_6", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_6", "") + " Día de píldora: 6");

            }

            //TOMA 7 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_7", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_7", "") + " Día de píldora: 7");

            }
            //TOMA 8 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_8", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_8", "") + " Día de píldora: 8");

            }
            //TOMA 9 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_9", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_9", "") + " Día de píldora: 9");

            }
            //TOMA 10 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_10", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_10", "") + " Día de píldora: 10");

            }
            //TOMA 11 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_11", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_11", "") + " Día de píldora: 11");

            }
            //TOMA 12 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_12", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_12", "") + " Día de píldora: 12");

            }
            //TOMA 13 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_13", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_13", "") + " Día de píldora: 13");

            }
            //TOMA 14 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_14", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_14", "") + " Día de píldora: 14");

            }
            //TOMA 15 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_15", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_15", "") + " Día de píldora: 15");

            }
            //TOMA 16 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_16", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_16", "") + " Día de píldora: 16");

            }
            //TOMA 17 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_17", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_17", "") + " Día de píldora: 17");

            }
            //TOMA 18 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_18", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_18", "") + " Día de píldora: 18");

            }
            //TOMA 19 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_19", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_19", "") + " Día de píldora: 19");

            }
            //TOMA 20 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_20", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_20", "") + " Día de píldora: 20");

            }
            //TOMA 21 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_21", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_21", "") + " Día de píldora: 21");

            }
            //TOMA 22 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_22", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_22", "") + " Día de píldora: 22");

            }
            //TOMA 23 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_23", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_23", "") + " Día de píldora: 23");

            }
            //TOMA 24 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_24", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_24", "") + " Día de píldora: 24");

            }
            //TOMA 25 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_25", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_25", "") + " Día de píldora: 25");

            }
            //TOMA 26 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_26", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_26", "") + " Día de píldora: 26");

            }
            //TOMA 27 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_27", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_27", "") + " Día de píldora: 27");

            }
            //TOMA 28 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_28", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_28", "") + " Día de píldora: 28");

            }
        }

        if (preferences.getString("registro_estado", "").equals("Molestia:Dolor mamario.")) {
            efecto = "Dolor mamario.";
            lista_estados = new ArrayList<>();

            if (efecto.equals(efectos.getString("efecto_animo_1", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_1", "") + " Día de píldora: 1");

            }

            //TOMA 2 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_2", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_2", "") + " Día de píldora: 2");

            }

            //TOMA 3 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_3", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_3", "") + " Día de píldora: 3");

            }
            //TOMA 4 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_4", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_4", "") + " Día de píldora: 4");

            }
            //TOMA 5 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_5", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_5", "") + " Día de píldora: 5");

            }
            //TOMA 6 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_6", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_6", "") + " Día de píldora: 6");

            }

            //TOMA 7 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_7", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_7", "") + " Día de píldora: 7");

            }
            //TOMA 8 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_8", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_8", "") + " Día de píldora: 8");

            }
            //TOMA 9 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_9", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_9", "") + " Día de píldora: 9");

            }
            //TOMA 10 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_10", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_10", "") + " Día de píldora: 10");

            }
            //TOMA 11 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_11", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_11", "") + " Día de píldora: 11");

            }
            //TOMA 12 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_12", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_12", "") + " Día de píldora: 12");

            }
            //TOMA 13 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_13", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_13", "") + " Día de píldora: 13");

            }
            //TOMA 14 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_14", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_14", "") + " Día de píldora: 14");

            }
            //TOMA 15 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_15", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_15", "") + " Día de píldora: 15");

            }
            //TOMA 16 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_16", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_16", "") + " Día de píldora: 16");

            }
            //TOMA 17 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_17", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_17", "") + " Día de píldora: 17");

            }
            //TOMA 18 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_18", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_18", "") + " Día de píldora: 18");

            }
            //TOMA 19 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_19", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_19", "") + " Día de píldora: 19");

            }
            //TOMA 20 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_20", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_20", "") + " Día de píldora: 20");

            }
            //TOMA 21 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_21", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_21", "") + " Día de píldora: 21");

            }
            //TOMA 22 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_22", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_22", "") + " Día de píldora: 22");

            }
            //TOMA 23 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_23", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_23", "") + " Día de píldora: 23");

            }
            //TOMA 24 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_24", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_24", "") + " Día de píldora: 24");

            }
            //TOMA 25 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_25", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_25", "") + " Día de píldora: 25");

            }
            //TOMA 26 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_26", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_26", "") + " Día de píldora: 26");

            }
            //TOMA 27 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_27", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_27", "") + " Día de píldora: 27");

            }
            //TOMA 28 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_28", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_28", "") + " Día de píldora: 28");

            }
        }


        if (preferences.getString("registro_estado", "").equals("Molestia:Dolor menstrual.")) {
            efecto = "Dolor menstrual.";
            lista_estados = new ArrayList<>();

            if (efecto.equals(efectos.getString("efecto_animo_1", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_1", "") + " Día de píldora: 1");

            }

            //TOMA 2 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_2", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_2", "") + " Día de píldora: 2");

            }

            //TOMA 3 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_3", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_3", "") + " Día de píldora: 3");

            }
            //TOMA 4 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_4", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_4", "") + " Día de píldora: 4");

            }
            //TOMA 5 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_5", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_5", "") + " Día de píldora: 5");

            }
            //TOMA 6 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_6", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_6", "") + " Día de píldora: 6");

            }

            //TOMA 7 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_7", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_7", "") + " Día de píldora: 7");

            }
            //TOMA 8 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_8", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_8", "") + " Día de píldora: 8");

            }
            //TOMA 9 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_9", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_9", "") + " Día de píldora: 9");

            }
            //TOMA 10 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_10", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_10", "") + " Día de píldora: 10");

            }
            //TOMA 11 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_11", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_11", "") + " Día de píldora: 11");

            }
            //TOMA 12 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_12", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_12", "") + " Día de píldora: 12");

            }
            //TOMA 13 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_13", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_13", "") + " Día de píldora: 13");

            }
            //TOMA 14 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_14", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_14", "") + " Día de píldora: 14");

            }
            //TOMA 15 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_15", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_15", "") + " Día de píldora: 15");

            }
            //TOMA 16 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_16", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_16", "") + " Día de píldora: 16");

            }
            //TOMA 17 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_17", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_17", "") + " Día de píldora: 17");

            }
            //TOMA 18 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_18", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_18", "") + " Día de píldora: 18");

            }
            //TOMA 19 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_19", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_19", "") + " Día de píldora: 19");

            }
            //TOMA 20 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_20", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_20", "") + " Día de píldora: 20");

            }
            //TOMA 21 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_21", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_21", "") + " Día de píldora: 21");

            }
            //TOMA 22 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_22", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_22", "") + " Día de píldora: 22");

            }
            //TOMA 23 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_23", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_23", "") + " Día de píldora: 23");

            }
            //TOMA 24 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_24", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_24", "") + " Día de píldora: 24");

            }
            //TOMA 25 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_25", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_25", "") + " Día de píldora: 25");

            }
            //TOMA 26 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_26", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_26", "") + " Día de píldora: 26");

            }
            //TOMA 27 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_27", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_27", "") + " Día de píldora: 27");

            }
            //TOMA 28 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_28", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_28", "") + " Día de píldora: 28");

            }


        }

        if (preferences.getString("registro_estado", "").equals("Molestia:Cambio en el ritmo deposicional (diarrea,estreñimiento…).")) {
            efecto = "Cambio en el ritmo deposicional (diarrea,estreñimiento…).";
            lista_estados = new ArrayList<>();

            if (efecto.equals(efectos.getString("efecto_animo_1", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_1", "") + " Día de píldora: 1");

            }

            //TOMA 2 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_2", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_2", "") + " Día de píldora: 2");

            }

            //TOMA 3 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_3", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_3", "") + " Día de píldora: 3");

            }
            //TOMA 4 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_4", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_4", "") + " Día de píldora: 4");

            }
            //TOMA 5 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_5", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_5", "") + " Día de píldora: 5");

            }
            //TOMA 6 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_6", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_6", "") + " Día de píldora: 6");

            }

            //TOMA 7 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_7", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_7", "") + " Día de píldora: 7");

            }
            //TOMA 8 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_8", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_8", "") + " Día de píldora: 8");

            }
            //TOMA 9 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_9", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_9", "") + " Día de píldora: 9");

            }
            //TOMA 10 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_10", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_10", "") + " Día de píldora: 10");

            }
            //TOMA 11 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_11", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_11", "") + " Día de píldora: 11");

            }
            //TOMA 12 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_12", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_12", "") + " Día de píldora: 12");

            }
            //TOMA 13 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_13", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_13", "") + " Día de píldora: 13");

            }
            //TOMA 14 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_14", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_14", "") + " Día de píldora: 14");

            }
            //TOMA 15 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_15", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_15", "") + " Día de píldora: 15");

            }
            //TOMA 16 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_16", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_16", "") + " Día de píldora: 16");

            }
            //TOMA 17 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_17", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_17", "") + " Día de píldora: 17");

            }
            //TOMA 18 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_18", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_18", "") + " Día de píldora: 18");

            }
            //TOMA 19 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_19", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_19", "") + " Día de píldora: 19");

            }
            //TOMA 20 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_20", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_20", "") + " Día de píldora: 20");

            }
            //TOMA 21 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_21", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_21", "") + " Día de píldora: 21");

            }
            //TOMA 22 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_22", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_22", "") + " Día de píldora: 22");

            }
            //TOMA 23 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_23", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_23", "") + " Día de píldora: 23");

            }
            //TOMA 24 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_24", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_24", "") + " Día de píldora: 24");

            }
            //TOMA 25 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_25", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_25", "") + " Día de píldora: 25");

            }
            //TOMA 26 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_26", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_26", "") + " Día de píldora: 26");

            }
            //TOMA 27 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_27", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_27", "") + " Día de píldora: 27");

            }
            //TOMA 28 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_28", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_28", "") + " Día de píldora: 28");

            }


        }

        if (preferences.getString("registro_estado", "").equals("Otros.")) {

            efecto = "Otros.";
            lista_estados = new ArrayList<>();

            if (efecto.equals(efectos.getString("efecto_animo_1", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_1", "") + " Día de píldora: 1");

            }

            //TOMA 2 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_2", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_2", "") + " Día de píldora: 2");

            }

            //TOMA 3 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_3", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_3", "") + " Día de píldora: 3");

            }
            //TOMA 4 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_4", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_4", "") + " Día de píldora: 4");

            }
            //TOMA 5 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_5", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_5", "") + " Día de píldora: 5");

            }
            //TOMA 6 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_6", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_6", "") + " Día de píldora: 6");

            }

            //TOMA 7 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_7", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_7", "") + " Día de píldora: 7");

            }
            //TOMA 8 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_8", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_8", "") + " Día de píldora: 8");

            }
            //TOMA 9 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_9", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_9", "") + " Día de píldora: 9");

            }
            //TOMA 10 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_10", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_10", "") + " Día de píldora: 10");

            }
            //TOMA 11 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_11", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_11", "") + " Día de píldora: 11");

            }
            //TOMA 12 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_12", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_12", "") + " Día de píldora: 12");

            }
            //TOMA 13 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_13", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_13", "") + " Día de píldora: 13");

            }
            //TOMA 14 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_14", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_14", "") + " Día de píldora: 14");

            }
            //TOMA 15 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_15", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_15", "") + " Día de píldora: 15");

            }
            //TOMA 16 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_16", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_16", "") + " Día de píldora: 16");

            }
            //TOMA 17 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_17", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_17", "") + " Día de píldora: 17");

            }
            //TOMA 18 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_18", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_18", "") + " Día de píldora: 18");

            }
            //TOMA 19 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_19", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_19", "") + " Día de píldora: 19");

            }
            //TOMA 20 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_20", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_20", "") + " Día de píldora: 20");

            }
            //TOMA 21 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_21", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_21", "") + " Día de píldora: 21");

            }
            //TOMA 22 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_22", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_22", "") + " Día de píldora: 22");

            }
            //TOMA 23 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_23", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_23", "") + " Día de píldora: 23");

            }
            //TOMA 24 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_24", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_24", "") + " Día de píldora: 24");

            }
            //TOMA 25 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_25", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_25", "") + " Día de píldora: 25");

            }
            //TOMA 26 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_26", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_26", "") + " Día de píldora: 26");

            }
            //TOMA 27 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_27", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_27", "") + " Día de píldora: 27");

            }
            //TOMA 28 DIA DE LA PILDORA
            if (efecto.equals(efectos.getString("efecto_animo_28", ""))) {
                lista_estados.add(preferences.getString("tomaBlister_28", "") + " Día de píldora: 28");

            }


        }


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.list_item_registro, lista_estados);
        registro_dias.setAdapter(adapter);

    }

}