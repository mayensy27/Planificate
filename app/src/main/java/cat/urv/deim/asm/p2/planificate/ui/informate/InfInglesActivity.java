package cat.urv.deim.asm.p2.planificate.ui.informate;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import cat.urv.deim.asm.p2.planificate.R;
import cat.urv.deim.asm.p2.planificate.WebDecisionesCompartidas;

public class InfInglesActivity extends AppCompatActivity {

    ListView lista_opciones_ingles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inf_ingles);

        lista_opciones_ingles = findViewById(R.id.lista_opciones_ingles);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.lista_opciones_ingles
                , R.layout.list_opciones_item);

        lista_opciones_ingles.setAdapter(adapter);

        lista_opciones_ingles.setOnItemClickListener((parent, view, position, id) -> {
            if (parent.getItemAtPosition(position).toString().equals("How do AOCs work?")) {
                Intent i = new Intent(InfInglesActivity.this, VideoInglesActivity_1.class);
                startActivity(i);
            } else {
                if (parent.getItemAtPosition(position).toString().equals("Forgetfulness")) {
                    Intent i = new Intent(InfInglesActivity.this, DocumentacionInglesActivity.class);
                    startActivity(i);

                } else {
                    if (parent.getItemAtPosition(position).toString().equals("Side Effects")) {
                        Intent i = new Intent(InfInglesActivity.this, SideEffectsActivity.class);
                        startActivity(i);

                    } else {
                        if (parent.getItemAtPosition(position).toString().equals("Contraception")) {
                            Intent i = new Intent(InfInglesActivity.this, WebDecisionesCompartidas.class);
                            startActivity(i);

                        }
                    }
                }
            }
        });
    }
}