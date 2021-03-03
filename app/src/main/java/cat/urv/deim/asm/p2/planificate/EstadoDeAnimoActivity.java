package cat.urv.deim.asm.p2.planificate;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.hsalf.smilerating.BaseRating;
import com.hsalf.smilerating.SmileRating;

public class EstadoDeAnimoActivity extends AppCompatActivity {

 //   TextView estadoAnimo,salida;

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



//Creacion de barra de valoracion de estados
        SmileRating valoracion_estado= findViewById(R.id.valoracion_estado);
        valoracion_estado.setNameForSmile(BaseRating.TERRIBLE,"TERRIBLE");
        valoracion_estado.setNameForSmile(BaseRating.BAD,"MAL");
        valoracion_estado.setNameForSmile(BaseRating.GOOD,"BIEN");
        valoracion_estado.setNameForSmile(BaseRating.OKAY,"MUY BIEN");
        valoracion_estado.setNameForSmile(BaseRating.GREAT,"GENIAL");
        valoracion_estado.setPlaceholderBackgroundColor(getColor(R.color.colorPrimary));
        valoracion_estado.setTextNonSelectedColor(getColor(R.color.colorPrimary));

        valoracion_estado.setOnSmileySelectionListener((smiley, reselected) -> {
            switch (smiley){
                case SmileRating.BAD:
                    Toast.makeText(EstadoDeAnimoActivity.this,"MAL",Toast.LENGTH_LONG).show();
                    break;

                case SmileRating.GOOD:
                    Toast.makeText(EstadoDeAnimoActivity.this,"BIEN",Toast.LENGTH_LONG).show();
                    break;

                case SmileRating.OKAY:
                    Toast.makeText(EstadoDeAnimoActivity.this,"MUY BIEN",Toast.LENGTH_LONG).show();
                    break;

                case SmileRating.GREAT:
              
                    Toast.makeText(EstadoDeAnimoActivity.this,"GENIAL",Toast.LENGTH_LONG).show();
                    break;

                case SmileRating.TERRIBLE:

                    Toast.makeText(EstadoDeAnimoActivity.this,"TERRIBLE",Toast.LENGTH_LONG).show();
                    break;
            }
        });

valoracion_estado.setOnRatingSelectedListener((level, reselected) -> Toast.makeText(EstadoDeAnimoActivity.this, "Valoración Seleccionada: " + level, Toast.LENGTH_LONG).show());
    }
}

//estadoAnimo.getText().toString() -> POR SI EL [String.valueOf(estadoAnimo.getText()] NO FUNCIONA