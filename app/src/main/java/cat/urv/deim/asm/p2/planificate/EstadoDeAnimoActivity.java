package cat.urv.deim.asm.p2.planificate;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class EstadoDeAnimoActivity extends AppCompatActivity {

    TextView estadoAnimo,salida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estado_de_animo);

        estadoAnimo=findViewById(R.id.estadoAnimo);
        salida=findViewById(R.id.salida);

//Se guarda la informacion reocogida del TextView en un SharePreference
        SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);
        SharedPreferences.Editor objEditor = preferences.edit();
        objEditor.putString("Registro_Estados_Animo", String.valueOf(estadoAnimo.getText()));
        objEditor.apply();

        //Se copia la informacion guardada del TextView en otro TextView
        salida.setText(preferences.getString("Registro_Estados_Animo", ""));


    }
}

//estadoAnimo.getText().toString() -> POR SI EL [String.valueOf(estadoAnimo.getText()] NO FUNCIONA