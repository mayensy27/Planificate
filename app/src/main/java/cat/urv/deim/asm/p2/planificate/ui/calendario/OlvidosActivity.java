package cat.urv.deim.asm.p2.planificate.ui.calendario;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import cat.urv.deim.asm.p2.planificate.R;

public class OlvidosActivity extends AppCompatActivity {
    ListView registro_olvidos;
    ArrayList<String> lista_olvidos; //estos vectores deben tener la misma longitud.*/
    String aux,aux2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_olvidos);

        registro_olvidos = findViewById(R.id.registro_olvidos);
        SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);

        lista_olvidos=new ArrayList<>();

        aux=preferences.getString("tomaBlister_1", "");

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-M-dd", Locale.getDefault());
        try {
            Date date = dateFormat.parse(aux);
            Calendar c = Calendar.getInstance();
            assert date != null;
            c.setTime(date);
            c.add(Calendar.DATE, 1);
            aux2 = dateFormat.format(c.getTime());
            // aux2=c.getTime().toString();

            if (aux2.equals(preferences.getString("tomaBlister_2", ""))) {
                //Toast.makeText(this, "BIEN1", Toast.LENGTH_SHORT).show(); //NO OLVIDO
            } else { //OLVIDO

                //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                lista_olvidos.add(aux2);
            }
                aux = preferences.getString("tomaBlister_2", "");
                date = dateFormat.parse(aux);
                c = Calendar.getInstance();
                assert date != null;
                c.setTime(date);
                c.add(Calendar.DATE, 1);
                aux2 = dateFormat.format(c.getTime());
                if (aux2.equals(preferences.getString("tomaBlister_3", ""))) {
                   // Toast.makeText(this, "BIEN2", Toast.LENGTH_SHORT).show(); //NO OLVIDO
                } else {
                    //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                    lista_olvidos.add(aux2);
                }
                    aux = preferences.getString("tomaBlister_3", "");
                    date = dateFormat.parse(aux);
                    c = Calendar.getInstance();
                    assert date != null;
                    c.setTime(date);
                    c.add(Calendar.DATE, 1);
                    aux2 = dateFormat.format(c.getTime());
                    if (aux2.equals(preferences.getString("tomaBlister_4", ""))) {
                       // Toast.makeText(this, "BIEN3", Toast.LENGTH_SHORT).show(); //NO OLVIDO
                    } else {
//Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                        lista_olvidos.add(aux2);
                    }
                        aux = preferences.getString("tomaBlister_4", "");
                        date = dateFormat.parse(aux);
                        c = Calendar.getInstance();
                        assert date != null;
                        c.setTime(date);
                        c.add(Calendar.DATE, 1);
                        aux2 = dateFormat.format(c.getTime());
                        if (aux2.equals(preferences.getString("tomaBlister_5", ""))) {
                           // Toast.makeText(this, "BIEN4", Toast.LENGTH_SHORT).show(); //NO OLVIDO
                        } else {
                            lista_olvidos.add(aux2);
                        }
            aux = preferences.getString("tomaBlister_5", "");
            date = dateFormat.parse(aux);
            c = Calendar.getInstance();
            assert date != null;
            c.setTime(date);
            c.add(Calendar.DATE, 1);
            aux2 = dateFormat.format(c.getTime());
            if (aux2.equals(preferences.getString("tomaBlister_6", ""))) {
                // Toast.makeText(this, "BIEN4", Toast.LENGTH_SHORT).show(); //NO OLVIDO
            } else {
                lista_olvidos.add(aux2);
            }

            aux = preferences.getString("tomaBlister_6", "");
            date = dateFormat.parse(aux);
            c = Calendar.getInstance();
            assert date != null;
            c.setTime(date);
            c.add(Calendar.DATE, 1);
            aux2 = dateFormat.format(c.getTime());
            if (aux2.equals(preferences.getString("tomaBlister_7", ""))) {
                // Toast.makeText(this, "BIEN4", Toast.LENGTH_SHORT).show(); //NO OLVIDO
            } else {
                lista_olvidos.add(aux2);
            }

            aux = preferences.getString("tomaBlister_7", "");
            date = dateFormat.parse(aux);
            c = Calendar.getInstance();
            assert date != null;
            c.setTime(date);
            c.add(Calendar.DATE, 1);
            aux2 = dateFormat.format(c.getTime());
            if (aux2.equals(preferences.getString("tomaBlister_8", ""))) {
                // Toast.makeText(this, "BIEN4", Toast.LENGTH_SHORT).show(); //NO OLVIDO
            } else {
                lista_olvidos.add(aux2);
            }

            aux = preferences.getString("tomaBlister_8", "");
            date = dateFormat.parse(aux);
            c = Calendar.getInstance();
            assert date != null;
            c.setTime(date);
            c.add(Calendar.DATE, 1);
            aux2 = dateFormat.format(c.getTime());
            if (aux2.equals(preferences.getString("tomaBlister_9", ""))) {
                // Toast.makeText(this, "BIEN4", Toast.LENGTH_SHORT).show(); //NO OLVIDO
            } else {
                lista_olvidos.add(aux2);
            }

        }catch (ParseException e) {
            e.printStackTrace();
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.list_item_registro, lista_olvidos);
        registro_olvidos.setAdapter(adapter);
    }
}