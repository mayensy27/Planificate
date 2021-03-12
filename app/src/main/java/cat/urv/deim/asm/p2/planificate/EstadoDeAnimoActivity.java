package cat.urv.deim.asm.p2.planificate;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.hsalf.smilerating.BaseRating;
import com.hsalf.smilerating.SmileRating;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class EstadoDeAnimoActivity extends AppCompatActivity {

 //   TextView estadoAnimo,salida;
 SmileRating valoracion_estado;
 Button enviar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estado_de_animo);
/*

        estadoAnimo=findViewById(R.id.estadoAnimo);
        salida=findViewById(R.id.salida);

//Se guarda la informacion recogida del TextView en un SharePreference
        SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);
        SharedPreferences.Editor objEditor = preferences.edit();
        objEditor.putString("Registro_Estados_Animo", String.valueOf(estadoAnimo.getText()));
        objEditor.apply();

        //Se copia la informacion guardada del TextView en otro TextView
        salida.setText(preferences.getString("Registro_Estados_Animo", ""));

*/

        enviar = findViewById(R.id.enviar);

//Creacion de barra de valoracion de estados
        valoracion_estado = findViewById(R.id.valoracion_estado);
        valoracion_estado.setNameForSmile(BaseRating.TERRIBLE, "TERRIBLE");
        valoracion_estado.setNameForSmile(BaseRating.BAD, "MAL");
        valoracion_estado.setNameForSmile(BaseRating.GOOD, "BIEN");
        valoracion_estado.setNameForSmile(BaseRating.OKAY, "MUY BIEN");
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
            SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);
            SharedPreferences.Editor objEditor = preferences.edit();
            objEditor.putInt("nivel_animo", level);
            objEditor.apply();


           //CONTROL DE LAS TOMAS/ VALORACION ESTADO DE ANIMO  Y ASIGNACION DEL DIA

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-M-dd", Locale.getDefault()); //Cambiado para que concuerde con la fecha que me proporciona el Calendar
            Date date = new Date();
            String fecha = dateFormat.format(date);
            if(fecha.equals(preferences.getString("tomaBlister_1", ""))
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
                                                                                                   && !preferences.getBoolean("primeravez_blister21", true)) {

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
                                                                                                                               && !preferences.getBoolean("primeravez_blister28", true)) {

                                                                                                                           objEditor.putInt("nivel_animo_28", level);
                                                                                                                           objEditor.apply();
                                                                                                                       }
               if (fecha.equals(preferences.getString("tomaBlister_29", ""))
                                                                                                                                   && !preferences.getBoolean("primeravez_blister29", true)) {

                                                                                                                               objEditor.putInt("nivel_animo_29", level);
                                                                                                                               objEditor.apply();
                                                                                                                         }

        });

    }

    public void enviar_animo(View view) {
        SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);
      // "nivel_animo" -> por defecto es 0
            if( preferences.getInt("nivel_animo", 0)!=0 && enviar.isClickable()){
                Intent enviar_datos= new Intent(this, MainActivity.class);
                startActivity(enviar_datos);
                finish();

                SharedPreferences.Editor objEditor = preferences.edit();
                objEditor.putInt("nivel_animo", 0);
                objEditor.apply();
            }

    }
}

//estadoAnimo.getText().toString() -> POR SI EL [String.valueOf(estadoAnimo.getText()] NO FUNCIONA