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
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.hsalf.smilerating.BaseRating;
import com.hsalf.smilerating.SmileRating;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class EstadoDeAnimoActivity extends AppCompatActivity {

    SmileRating valoracion_estado;
    Button enviar;
    Spinner spinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estado_de_animo);

        spinner = findViewById(R.id.efectos);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-M-dd", Locale.getDefault()); //Cambiado para que concuerde con la fecha que me proporciona el Calendar
        Date date = new Date();
        String fecha = dateFormat.format(date);
        SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);


        //Desplegable efectos
        ArrayAdapter<CharSequence> adapter_comprimidos = ArrayAdapter.createFromResource(this,
                R.array.efectos_cast, R.layout.spinner_item); // //opciones_comprimidos
        spinner.setAdapter(adapter_comprimidos);

        SharedPreferences efectos = getSharedPreferences("efectos", Context.MODE_PRIVATE);
        SharedPreferences.Editor efecto = efectos.edit();

        //GUARDAR DATOS EFECTOS

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                efecto.putString("efectos_cast", parent.getItemAtPosition(position).toString());
                efecto.apply();

                if (fecha.equals(preferences.getString("tomaBlister_1", ""))
                        && !preferences.getBoolean("primeravez_blister1", true)) {
                    efecto.putString("efecto_animo_1", efectos.getString("efectos_cast", "zz"));
                    efecto.apply();
                }
                if (fecha.equals(preferences.getString("tomaBlister_2", ""))
                        && !preferences.getBoolean("primeravez_blister2", true)) {
                    efecto.putString("efecto_animo_2", efectos.getString("efectos_cast", "zz"));
                    efecto.apply();
                }
                if (fecha.equals(preferences.getString("tomaBlister_3", ""))
                        && !preferences.getBoolean("primeravez_blister3", true)) {
                    efecto.putString("efecto_animo_3", efectos.getString("efectos_cast", "zz"));
                    efecto.apply();
                }
                if (fecha.equals(preferences.getString("tomaBlister_4", ""))
                        && !preferences.getBoolean("primeravez_blister4", true)) {
                    efecto.putString("efecto_animo_4", efectos.getString("efectos_cast", "zz"));
                    efecto.apply();
                }
                if (fecha.equals(preferences.getString("tomaBlister_5", ""))
                        && !preferences.getBoolean("primeravez_blister5", true)) {
                    efecto.putString("efecto_animo_5", efectos.getString("efectos_cast", "zz"));
                    efecto.apply();
                }
                if (fecha.equals(preferences.getString("tomaBlister_6", ""))
                        && !preferences.getBoolean("primeravez_blister6", true)) {
                    efecto.putString("efecto_animo_6", efectos.getString("efectos_cast", "zz"));
                    efecto.apply();
                }
                if (fecha.equals(preferences.getString("tomaBlister_7", ""))
                        && !preferences.getBoolean("primeravez_blister7", true)) {
                    efecto.putString("efecto_animo_7", efectos.getString("efectos_cast", "zz"));
                    efecto.apply();
                }
                if (fecha.equals(preferences.getString("tomaBlister_8", ""))
                        && !preferences.getBoolean("primeravez_blister8", true)) {
                    efecto.putString("efecto_animo_8", efectos.getString("efectos_cast", "zz"));
                    efecto.apply();
                }
                if (fecha.equals(preferences.getString("tomaBlister_9", ""))
                        && !preferences.getBoolean("primeravez_blister9", true)) {
                    efecto.putString("efecto_animo_9", efectos.getString("efectos_cast", "zz"));
                    efecto.apply();
                }
                if (fecha.equals(preferences.getString("tomaBlister_10", ""))
                        && !preferences.getBoolean("primeravez_blister10", true)) {
                    efecto.putString("efecto_animo_10", efectos.getString("efectos_cast", "zz"));
                    efecto.apply();
                }
                if (fecha.equals(preferences.getString("tomaBlister_11", ""))
                        && !preferences.getBoolean("primeravez_blister11", true)) {
                    efecto.putString("efecto_animo_11", efectos.getString("efectos_cast", "zz"));
                    efecto.apply();
                }
                if (fecha.equals(preferences.getString("tomaBlister_12", ""))
                        && !preferences.getBoolean("primeravez_blister12", true)) {
                    efecto.putString("efecto_animo_12", efectos.getString("efectos_cast", "zz"));
                    efecto.apply();
                }
                if (fecha.equals(preferences.getString("tomaBlister_13", ""))
                        && !preferences.getBoolean("primeravez_blister13", true)) {
                    efecto.putString("efecto_animo_13", efectos.getString("efectos_cast", "zz"));
                    efecto.apply();
                }
                if (fecha.equals(preferences.getString("tomaBlister_14", ""))
                        && !preferences.getBoolean("primeravez_blister14", true)) {
                    efecto.putString("efecto_animo_14", efectos.getString("efectos_cast", "zz"));
                    efecto.apply();
                }
                if (fecha.equals(preferences.getString("tomaBlister_15", ""))
                        && !preferences.getBoolean("primeravez_blister15", true)) {
                    efecto.putString("efecto_animo_15", efectos.getString("efectos_cast", "zz"));
                    efecto.apply();
                }
                if (fecha.equals(preferences.getString("tomaBlister_16", ""))
                        && !preferences.getBoolean("primeravez_blister16", true)) {
                    efecto.putString("efecto_animo_16", efectos.getString("efectos_cast", "zz"));
                    efecto.apply();
                }
                if (fecha.equals(preferences.getString("tomaBlister_17", ""))
                        && !preferences.getBoolean("primeravez_blister17", true)) {
                    efecto.putString("efecto_animo_17", efectos.getString("efectos_cast", "zz"));
                    efecto.apply();
                }
                if (fecha.equals(preferences.getString("tomaBlister_18", ""))
                        && !preferences.getBoolean("primeravez_blister18", true)) {
                    efecto.putString("efecto_animo_18", efectos.getString("efectos_cast", "zz"));
                    efecto.apply();
                }
                if (fecha.equals(preferences.getString("tomaBlister_19", ""))
                        && !preferences.getBoolean("primeravez_blister19", true)) {
                    efecto.putString("efecto_animo_19", efectos.getString("efectos_cast", "zz"));
                    efecto.apply();
                }
                if (fecha.equals(preferences.getString("tomaBlister_20", ""))
                        && !preferences.getBoolean("primeravez_blister20", true)) {
                    efecto.putString("efecto_animo_20", efectos.getString("efectos_cast", "zz"));
                    efecto.apply();
                }
                if (fecha.equals(preferences.getString("tomaBlister_21", ""))
                        && !preferences.getBoolean("primeravez_blister21", true)) {
                    efecto.putString("efecto_animo_21", efectos.getString("efectos_cast", "zz"));
                    efecto.apply();
                }
                if (fecha.equals(preferences.getString("tomaBlister_21", ""))
                        && !preferences.getBoolean("primeravez_blister21", true)) {
                    efecto.putString("efecto_animo_21", efectos.getString("efectos_cast", "zz"));
                    efecto.apply();
                }
                if (fecha.equals(preferences.getString("tomaBlister_22", ""))
                        && !preferences.getBoolean("primeravez_blister22", true)) {
                    efecto.putString("efecto_animo_22", efectos.getString("efectos_cast", "zz"));
                    efecto.apply();
                }
                if (fecha.equals(preferences.getString("tomaBlister_23", ""))
                        && !preferences.getBoolean("primeravez_blister23", true)) {
                    efecto.putString("efecto_animo_23", efectos.getString("efectos_cast", "zz"));
                    efecto.apply();
                }
                if (fecha.equals(preferences.getString("tomaBlister_24", ""))
                        && !preferences.getBoolean("primeravez_blister24", true)) {
                    efecto.putString("efecto_animo_24", efectos.getString("efectos_cast", "zz"));
                    efecto.apply();
                }
                if (fecha.equals(preferences.getString("tomaBlister_25", ""))
                        && !preferences.getBoolean("primeravez_blister25", true)) {
                    efecto.putString("efecto_animo_25", efectos.getString("efectos_cast", "zz"));
                    efecto.apply();
                }
                if (fecha.equals(preferences.getString("tomaBlister_26", ""))
                        && !preferences.getBoolean("primeravez_blister26", true)) {
                    efecto.putString("efecto_animo_26", efectos.getString("efectos_cast", "zz"));
                    efecto.apply();
                }
                if (fecha.equals(preferences.getString("tomaBlister_27", ""))
                        && !preferences.getBoolean("primeravez_blister27", true)) {
                    efecto.putString("efecto_animo_27", efectos.getString("efectos_cast", "zz"));
                    efecto.apply();
                }
                if (fecha.equals(preferences.getString("tomaBlister_28", ""))
                        && !preferences.getBoolean("primeravez_blister28", true)) {
                    efecto.putString("efecto_animo_28", efectos.getString("efectos_cast", "zz"));
                    efecto.apply();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        enviar = findViewById(R.id.enviar);

//Creacion de barra de valoracion de estados
        valoracion_estado = findViewById(R.id.valoracion_estado);
        valoracion_estado.setNameForSmile(BaseRating.TERRIBLE, "TERRIBLE");
        valoracion_estado.setNameForSmile(BaseRating.BAD, "MAL");
        valoracion_estado.setNameForSmile(BaseRating.OKAY, "BIEN");
        valoracion_estado.setNameForSmile(BaseRating.GOOD, "MUY BIEN");
        valoracion_estado.setNameForSmile(BaseRating.GREAT, "GENIAL");
        valoracion_estado.setPlaceholderBackgroundColor(getColor(R.color.colorPrimary));
        valoracion_estado.setTextNonSelectedColor(getColor(R.color.colorPrimary));

        valoracion_estado.setOnSmileySelectionListener((smiley, reselected) -> {
            switch (smiley) {
                case SmileRating.BAD:
                    Toast.makeText(EstadoDeAnimoActivity.this, "MAL", Toast.LENGTH_LONG).show();
                    break;

                case SmileRating.GOOD:
                    Toast.makeText(EstadoDeAnimoActivity.this, "BIEN", Toast.LENGTH_LONG).show();
                    break;

                case SmileRating.OKAY:
                    Toast.makeText(EstadoDeAnimoActivity.this, "MUY BIEN", Toast.LENGTH_LONG).show();
                    break;

                case SmileRating.GREAT:

                    Toast.makeText(EstadoDeAnimoActivity.this, "GENIAL", Toast.LENGTH_LONG).show();
                    break;

                case SmileRating.TERRIBLE:

                    Toast.makeText(EstadoDeAnimoActivity.this, "TERRIBLE", Toast.LENGTH_LONG).show();
                    break;
            }
        });

        valoracion_estado.setOnRatingSelectedListener((int level, boolean reselected) -> {
            Toast.makeText(EstadoDeAnimoActivity.this, "Valoración Seleccionada: " + level, Toast.LENGTH_LONG).show();

            //Guardado del nivel de estado de animo
            SharedPreferences.Editor objEditor = preferences.edit();
            objEditor.putInt("nivel_animo", level);
            objEditor.apply();


            //CONTROL DE LAS TOMAS/ VALORACION ESTADO DE ANIMO  Y ASIGNACION DEL DIA

            if (fecha.equals(preferences.getString("tomaBlister_1", ""))
                    && !preferences.getBoolean("primeravez_blister1", true)) {


                objEditor.putInt("nivel_animo_1", level);
                objEditor.apply();
            }
            if (fecha.equals(preferences.getString("tomaBlister_2", ""))
                    && !preferences.getBoolean("primeravez_blister2", true)) {

                objEditor.putInt("nivel_animo_2", level);
                objEditor.apply();
            }
            if (fecha.equals(preferences.getString("tomaBlister_3", ""))
                    && !preferences.getBoolean("primeravez_blister3", true)) {

                objEditor.putInt("nivel_animo_3", level);
                objEditor.apply();
            }

            if (fecha.equals(preferences.getString("tomaBlister_4", ""))
                    && !preferences.getBoolean("primeravez_blister4", true)) {

                objEditor.putInt("nivel_animo_4", level);
                objEditor.apply();
            }

            if (fecha.equals(preferences.getString("tomaBlister_5", ""))
                    && !preferences.getBoolean("primeravez_blister5", true)) {

                objEditor.putInt("nivel_animo_5", level);
                objEditor.apply();
            }
            if (fecha.equals(preferences.getString("tomaBlister_6", ""))
                    && !preferences.getBoolean("primeravez_blister6", true)) {

                objEditor.putInt("nivel_animo_6", level);
                objEditor.apply();
            }
            if (fecha.equals(preferences.getString("tomaBlister_7", ""))
                    && !preferences.getBoolean("primeravez_blister7", true)) {

                objEditor.putInt("nivel_animo_7", level);
                objEditor.apply();
            }
            if (fecha.equals(preferences.getString("tomaBlister_8", ""))
                    && !preferences.getBoolean("primeravez_blister8", true)) {

                objEditor.putInt("nivel_animo_8", level);
                objEditor.apply();
            }
            if (fecha.equals(preferences.getString("tomaBlister_9", ""))
                    && !preferences.getBoolean("primeravez_blister9", true)) {
                objEditor.putInt("nivel_animo_9", level);
                objEditor.apply();
            }
            if (fecha.equals(preferences.getString("tomaBlister_10", ""))
                    && !preferences.getBoolean("primeravez_blister10", true)) {

                objEditor.putInt("nivel_animo_10", level);
                objEditor.apply();
            }
            if (fecha.equals(preferences.getString("tomaBlister_11", ""))
                    && !preferences.getBoolean("primeravez_blister11", true)) {

                objEditor.putInt("nivel_animo_11", level);
                objEditor.apply();
            }
            if (fecha.equals(preferences.getString("tomaBlister_12", ""))
                    && !preferences.getBoolean("primeravez_blister12", true)) {

                objEditor.putInt("nivel_animo_12", level);
                objEditor.apply();
            }
            if (fecha.equals(preferences.getString("tomaBlister_13", ""))
                    && !preferences.getBoolean("primeravez_blister13", true)) {

                objEditor.putInt("nivel_animo_13", level);
                objEditor.apply();
            }
            if (fecha.equals(preferences.getString("tomaBlister_14", ""))
                    && !preferences.getBoolean("primeravez_blister14", true)) {

                objEditor.putInt("nivel_animo_14", level);
                objEditor.apply();
            }
            if (fecha.equals(preferences.getString("tomaBlister_15", ""))
                    && !preferences.getBoolean("primeravez_blister15", true)) {

                objEditor.putInt("nivel_animo_15", level);
                objEditor.apply();
            }
            if (fecha.equals(preferences.getString("tomaBlister_16", ""))
                    && !preferences.getBoolean("primeravez_blister2", true)) {

                objEditor.putInt("nivel_animo_16", level);
                objEditor.apply();
            }
            if (fecha.equals(preferences.getString("tomaBlister_17", ""))
                    && !preferences.getBoolean("primeravez_blister17", true)) {

                objEditor.putInt("nivel_animo_17", level);
                objEditor.apply();
            }
            if (fecha.equals(preferences.getString("tomaBlister_18", ""))
                    && !preferences.getBoolean("primeravez_blister18", true)) {

                objEditor.putInt("nivel_animo_18", level);
                objEditor.apply();
            }
            if (fecha.equals(preferences.getString("tomaBlister_19", ""))
                    && !preferences.getBoolean("primeravez_blister19", true)) {

                objEditor.putInt("nivel_animo_19", level);
                objEditor.apply();
            }

            if (fecha.equals(preferences.getString("tomaBlister_20", ""))
                    && !preferences.getBoolean("primeravez_blister20", true)) {

                objEditor.putInt("nivel_animo_20", level);
                objEditor.apply();
            }
            if (fecha.equals(preferences.getString("tomaBlister_21", ""))
                    && (!preferences.getBoolean("primeravez21_blister21", true) || !preferences.getBoolean("primeravez_blister21", true))) {

                objEditor.putInt("nivel_animo_21", level);
                objEditor.apply();
            }
            if (fecha.equals(preferences.getString("tomaBlister_22", ""))
                    && !preferences.getBoolean("primeravez_blister22", true)) {

                objEditor.putInt("nivel_animo_22", level);
                objEditor.apply();
            }
            if (fecha.equals(preferences.getString("tomaBlister_23", ""))
                    && !preferences.getBoolean("primeravez_blister23", true)) {

                objEditor.putInt("nivel_animo_23", level);
                objEditor.apply();
            }
            if (fecha.equals(preferences.getString("tomaBlister_24", ""))
                    && !preferences.getBoolean("primeravez_blister24", true)) {

                objEditor.putInt("nivel_animo_24", level);
                objEditor.apply();
            }
            if (fecha.equals(preferences.getString("tomaBlister_25", ""))
                    && !preferences.getBoolean("primeravez_blister25", true)) {

                objEditor.putInt("nivel_animo_25", level);
                objEditor.apply();
            }
            if (fecha.equals(preferences.getString("tomaBlister_26", ""))
                    && !preferences.getBoolean("primeravez_blister26", true)) {

                objEditor.putInt("nivel_animo_26", level);
                objEditor.apply();
            }
            if (fecha.equals(preferences.getString("tomaBlister_27", ""))
                    && !preferences.getBoolean("primeravez_blister27", true)) {

                objEditor.putInt("nivel_animo_27", level);
                objEditor.apply();
            }
            if (fecha.equals(preferences.getString("tomaBlister_28", ""))
                    && preferences.getBoolean("primeravez_blister28", true)) {

                objEditor.putInt("nivel_animo_28", level);
                objEditor.apply();
            }


        });

    }

    public void enviar_animo(View view) {
        SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);
        if (preferences.getInt("nivel_animo", 0) != 0 && enviar.isClickable()) {

            if (!preferences.getBoolean("mail_21", true)
                    || !preferences.getBoolean("mail_28", true)) {
                Intent enviar_datos = new Intent(this, MailAPI.class);
                startActivity(enviar_datos);
                finish();
            } else {
                Intent enviar_datos = new Intent(this, MainActivity.class);
                startActivity(enviar_datos);
                finish();

            }
            SharedPreferences.Editor objEditor = preferences.edit();
            objEditor.putInt("nivel_animo", 0);
            objEditor.apply();
        }

    }
}

