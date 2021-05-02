package cat.urv.deim.asm.p2.planificate.ui.informate;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import cat.urv.deim.asm.p2.planificate.R;
import cat.urv.deim.asm.p2.planificate.WebDecisionesCompartidas;

public class InfCatActivity extends AppCompatActivity {

    ListView lista_opciones_cat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inf_cat);

        lista_opciones_cat=findViewById(R.id.lista_opciones_cat);

        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this, R.array.lista_opciones_cat
        , R.layout.list_opciones_item);

        lista_opciones_cat.setAdapter(adapter);

        lista_opciones_cat.setOnItemClickListener((parent, view, position, id) -> {
            if(parent.getItemAtPosition(position).toString().equals("¿Com funcionen els ACOs?")){
                Intent i=new Intent(InfCatActivity.this, VideoCatActivity_1.class);
                startActivity(i);
            }else{
                if (parent.getItemAtPosition(position).toString().equals("Oblits")){
                    Intent i=new Intent(InfCatActivity.this, DocumentacionCatActivity.class);
                    startActivity(i);

                }else {
                    if (parent.getItemAtPosition(position).toString().equals("Efectes Secundaris")) {
                        Intent i = new Intent(InfCatActivity.this, EfectesSecundarisActivity.class);
                        startActivity(i);

                    } else {
                        if (parent.getItemAtPosition(position).toString().equals("Anticoncepció")) {
                            Intent i = new Intent(InfCatActivity.this, WebDecisionesCompartidas.class);
                            startActivity(i);

                        }
                    }
                }
            }
        });
    }
}