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


            //Añadido hoy!!!!!!!!!!!!!!!!!!!!!!!

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