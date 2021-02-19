package cat.urv.deim.asm.p2.planificate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String texto;
    String texto2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

///////////////////////////     COMPROBACION QUE SE GUARDA OPCION SPINNER (PILDORAS/COMPRIMIDOS))
        TextView x1= findViewById(R.id.textView);
        SharedPreferences tipos_pildoras_comprimidos = getSharedPreferences("tipos_pildoras_comprimidos", Context.MODE_PRIVATE);
        texto= tipos_pildoras_comprimidos.getString("tipo_pildora", "zz"); // por defecto es true
        x1.setText(texto);

        TextView x2= findViewById(R.id.textView2);
        texto= tipos_pildoras_comprimidos.getString("tipo_comprimidos", "zz"); // por defecto es true
        x2.setText(texto);

////////////////////////////////////////////////////////////////////////////////
    }
}