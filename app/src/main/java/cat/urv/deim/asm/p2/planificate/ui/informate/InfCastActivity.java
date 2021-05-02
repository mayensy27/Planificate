package cat.urv.deim.asm.p2.planificate.ui.informate;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import cat.urv.deim.asm.p2.planificate.R;
import cat.urv.deim.asm.p2.planificate.WebDecisionesCompartidas;

public class InfCastActivity extends AppCompatActivity {

    ListView lista_opciones_cast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inf_cast);

        lista_opciones_cast=findViewById(R.id.lista_opciones_cast);

        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this, R.array.lista_opciones_cast
        , R.layout.list_opciones_item);

        lista_opciones_cast.setAdapter(adapter);

        lista_opciones_cast.setOnItemClickListener((parent, view, position, id) -> {
            if(parent.getItemAtPosition(position).toString().equals("¿Cómo funcionan los ACOs?")){
                Intent i=new Intent(InfCastActivity.this, VideoCastActivity_1.class);
                startActivity(i);
            }else{
                if (parent.getItemAtPosition(position).toString().equals("Olvidos")){
                    Intent i=new Intent(InfCastActivity.this, DocumentacionCastActivity.class);
                    startActivity(i);

                }else {
                    if (parent.getItemAtPosition(position).toString().equals("Efectos Secundarios")) {
                        Intent i = new Intent(InfCastActivity.this, EfectosSecundariosActivity.class);
                        startActivity(i);

                    }
                    else {
                        if (parent.getItemAtPosition(position).toString().equals("Anticoncepción")) {
                            Intent i = new Intent(InfCastActivity.this, WebDecisionesCompartidas.class);
                            startActivity(i);

                        }
                    }
                }
            }
        });
    }
}