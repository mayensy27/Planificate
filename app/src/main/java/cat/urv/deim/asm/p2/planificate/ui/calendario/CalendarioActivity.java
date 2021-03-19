package cat.urv.deim.asm.p2.planificate.ui.calendario;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import cat.urv.deim.asm.p2.planificate.R;

public class CalendarioActivity extends AppCompatActivity {

    ListView registro_dias;
    ArrayList<String> fechas; //estos vectores deben ttener la misma longitud.
    ArrayList<String> dias;


   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendario);

        registro_dias=findViewById(R.id.registro_pildoras);

       SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-M-dd", Locale.getDefault()); //Cambiado para que concuerde con la fecha que me proporciona el Calendar
       Date date = new Date();
       String fecha = dateFormat.format(date);

       SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);
       fechas= new ArrayList<>();
       dias= new ArrayList<>();

           //TOMA PRIMER DIA DE LA PILDORA
       if (fecha.equals(preferences.getString("tomaBlister_1", "")) && !preferences.getBoolean("primeravez_blister1", true) && preferences.getInt("dia_1", 0) == 1) {
         fechas.add(fecha +" Dia de píldora: 1");
        dias.add("Dia "+preferences.getInt("dia_1", 0)) ;
          }

       //TOMA 2 DIA DE LA PILDORA
       if (fecha.equals(preferences.getString("tomaBlister_2", "")) && !preferences.getBoolean("primeravez_blister2", true) && preferences.getInt("dia_2", 0) == 2) {
           fechas.add(fecha +" Dia de píldora: 2");
           dias.add("Dia "+preferences.getInt("dia_2", 0)) ;
       }

       //TOMA 3 DIA DE LA PILDORA
       if (fecha.equals(preferences.getString("tomaBlister_3", "")) && !preferences.getBoolean("primeravez_blister3", true) && preferences.getInt("dia_3", 0) == 3) {
           fechas.add(fecha +" Dia de píldora: 3");
           dias.add("Dia "+preferences.getInt("dia_3", 0)) ;

       }
       //TOMA 4 DIA DE LA PILDORA
       if (fecha.equals(preferences.getString("tomaBlister_4", "")) && !preferences.getBoolean("primeravez_blister4", true) && preferences.getInt("dia_4", 0) == 4) {
           fechas.add(fecha +" Dia de píldora: 4");
           dias.add("Dia "+preferences.getInt("dia_4", 0)) ;
       }
       //TOMA 5 DIA DE LA PILDORA
       if (fecha.equals(preferences.getString("tomaBlister_5", "")) && !preferences.getBoolean("primeravez_blister5", true) && preferences.getInt("dia_5", 0) == 5) {
           fechas.add(fecha +" Dia de píldora: 5");
           dias.add("Dia "+preferences.getInt("dia_5", 0)) ;

       }
       //TOMA 6 DIA DE LA PILDORA
       if (fecha.equals(preferences.getString("tomaBlister_6", "")) && !preferences.getBoolean("primeravez_blister6", true) && preferences.getInt("dia_6", 0) == 6) {
           fechas.add(fecha +" Dia de píldora: 6");
           dias.add("Dia "+preferences.getInt("dia_6", 0)) ;

       }
       //TOMA 7 DIA DE LA PILDORA
       if (fecha.equals(preferences.getString("tomaBlister_7", "")) && !preferences.getBoolean("primeravez_blister7", true) && preferences.getInt("dia_7", 0) == 7) {
           fechas.add(fecha +" Dia de píldora: 7");
           dias.add("Dia "+preferences.getInt("dia_7", 0)) ;

       }
       //TOMA 8 DIA DE LA PILDORA
       if (fecha.equals(preferences.getString("tomaBlister_8", "")) && !preferences.getBoolean("primeravez_blister8", true) && preferences.getInt("dia_8", 0) == 8) {
           fechas.add(fecha +" Dia de píldora: 8");
           dias.add("Dia "+preferences.getInt("dia_8", 0)) ;

       }
       //TOMA 9 DIA DE LA PILDORA
       if (fecha.equals(preferences.getString("tomaBlister_9", "")) && !preferences.getBoolean("primeravez_blister9", true) && preferences.getInt("dia_9", 0) == 9) {
           fechas.add(fecha +" Dia de píldora: 9");
           dias.add("Dia "+preferences.getInt("dia_9", 0)) ;

       }
       //TOMA 10 DIA DE LA PILDORA
       if (fecha.equals(preferences.getString("tomaBlister_10", "")) && !preferences.getBoolean("primeravez_blister10", true) && preferences.getInt("dia_10", 0) == 10) {
           fechas.add(fecha +" Dia de píldora: 10");
           dias.add("Dia "+preferences.getInt("dia_10", 0)) ;

       }
       //TOMA 11 DIA DE LA PILDORA
       if (fecha.equals(preferences.getString("tomaBlister_11", "")) && !preferences.getBoolean("primeravez_blister11", true) && preferences.getInt("dia_11", 0) == 11) {
           fechas.add(fecha +" Dia de píldora: 11");
           dias.add("Dia "+preferences.getInt("dia_11", 0)) ;

       }
       //TOMA 12 DIA DE LA PILDORA
       if (fecha.equals(preferences.getString("tomaBlister_12", "")) && !preferences.getBoolean("primeravez_blister12", true) && preferences.getInt("dia_12", 0) == 12) {
           fechas.add(fecha +" Dia de píldora: 12");
           dias.add("Dia "+preferences.getInt("dia_12", 0)) ;

       }
       //TOMA 13 DIA DE LA PILDORA
       if (fecha.equals(preferences.getString("tomaBlister_13", "")) && !preferences.getBoolean("primeravez_blister13", true) && preferences.getInt("dia_13", 0) == 13) {
           fechas.add(fecha +" Dia de píldora: 13");
           dias.add("Dia "+preferences.getInt("dia_13", 0)) ;

       }
       //TOMA 14 DIA DE LA PILDORA
       if (fecha.equals(preferences.getString("tomaBlister_14", "")) && !preferences.getBoolean("primeravez_blister14", true) && preferences.getInt("dia_14", 0) == 14) {
           fechas.add(fecha +" Dia de píldora: 14");
           dias.add("Dia "+preferences.getInt("dia_14", 0)) ;

       }
       //TOMA 15 DIA DE LA PILDORA
       if (fecha.equals(preferences.getString("tomaBlister_15", "")) && !preferences.getBoolean("primeravez_blister15", true) && preferences.getInt("dia_15", 0) == 15) {
           fechas.add(fecha +" Dia de píldora: 15");
           dias.add("Dia "+preferences.getInt("dia_15", 0)) ;

       }
       //TOMA 16 DIA DE LA PILDORA
       if (fecha.equals(preferences.getString("tomaBlister_16", "")) && !preferences.getBoolean("primeravez_blister16", true) && preferences.getInt("dia_16", 0) == 16) {
           fechas.add(fecha +" Dia de píldora: 16");
           dias.add("Dia "+preferences.getInt("dia_16", 0)) ;

       }
       //TOMA 17 DIA DE LA PILDORA
       if (fecha.equals(preferences.getString("tomaBlister_17", "")) && !preferences.getBoolean("primeravez_blister17", true) && preferences.getInt("dia_17", 0) == 17) {
           fechas.add(fecha +" Dia de píldora: 17");
           dias.add("Dia "+preferences.getInt("dia_17", 0)) ;

       }
       //TOMA 18 DIA DE LA PILDORA
       if (fecha.equals(preferences.getString("tomaBlister_18", "")) && !preferences.getBoolean("primeravez_blister18", true) && preferences.getInt("dia_18", 0) == 18) {
           fechas.add(fecha +" Dia de píldora: 18");
           dias.add("Dia "+preferences.getInt("dia_18", 0)) ;

       }
       //TOMA 19 DIA DE LA PILDORA
       if (fecha.equals(preferences.getString("tomaBlister_19", "")) && !preferences.getBoolean("primeravez_blister19", true) && preferences.getInt("dia_19", 0) == 19) {
           fechas.add(fecha +" Dia de píldora: 19");
           dias.add("Dia "+preferences.getInt("dia_19", 0)) ;

       }
       //TOMA 20 DIA DE LA PILDORA
       if (fecha.equals(preferences.getString("tomaBlister_20", "")) && !preferences.getBoolean("primeravez_blister20", true) && preferences.getInt("dia_20", 0) == 20) {
           fechas.add(fecha +" Dia de píldora: 20");
           dias.add("Dia "+preferences.getInt("dia_20", 0)) ;

       }
       //TOMA 21 DIA DE LA PILDORA
       if (fecha.equals(preferences.getString("tomaBlister_21", "")) && (!preferences.getBoolean("primeravez21_blister21", true)||!preferences.getBoolean("primeravez_blister21", true))
               && preferences.getInt("dia_21", 0) == 21) {
           fechas.add(fecha +" Dia de píldora: 21");
           dias.add("Dia "+preferences.getInt("dia_21", 0)) ;

           SharedPreferences.Editor objEditor = preferences.edit();
           objEditor.putBoolean("primeravez21_blister21", true); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
           objEditor.apply();
           objEditor.putString("tomaBlister_21", ""); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
           objEditor.apply();
           objEditor.putInt("dia_21", 0); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
           objEditor.apply();
       }
       //TOMA 22 DIA DE LA PILDORA
       if (fecha.equals(preferences.getString("tomaBlister_22", "")) && !preferences.getBoolean("primeravez_blister22", true) && preferences.getInt("dia_22", 0) == 22) {
           fechas.add(fecha +" Dia de píldora: 22");
           dias.add("Dia "+preferences.getInt("dia_22", 0)) ;

       }
       //TOMA 23 DIA DE LA PILDORA
       if (fecha.equals(preferences.getString("tomaBlister_23", "")) && !preferences.getBoolean("primeravez_blister23", true) && preferences.getInt("dia_23", 0) == 23) {
           fechas.add(fecha +" Dia de píldora: 23");
           dias.add("Dia "+preferences.getInt("dia_23", 0)) ;
       }
       //TOMA 24 DIA DE LA PILDORA
       if (fecha.equals(preferences.getString("tomaBlister_24", "")) && !preferences.getBoolean("primeravez_blister24", true) && preferences.getInt("dia_24", 0) == 24) {
           fechas.add(fecha +" Dia de píldora: 24");
           dias.add("Dia "+preferences.getInt("dia_24", 0)) ;

       }
       //TOMA 25 DIA DE LA PILDORA
       if (fecha.equals(preferences.getString("tomaBlister_25", "")) && !preferences.getBoolean("primeravez_blister25", true) && preferences.getInt("dia_25", 0) == 25) {
           fechas.add(fecha +" Dia de píldora: 25");
           dias.add("Dia "+preferences.getInt("dia_25", 0)) ;

       }
       //TOMA 26 DIA DE LA PILDORA
       if (fecha.equals(preferences.getString("tomaBlister_26", "")) && !preferences.getBoolean("primeravez_blister26", true) && preferences.getInt("dia_26", 0) == 26) {
           fechas.add(fecha +" Dia de píldora: 26");
           dias.add("Dia "+preferences.getInt("dia_26", 0)) ;

       }
       //TOMA 27 DIA DE LA PILDORA
       if (fecha.equals(preferences.getString("tomaBlister_27", "")) && !preferences.getBoolean("primeravez_blister27", true) && preferences.getInt("dia_27", 0) == 27) {
           fechas.add(fecha +" Dia de píldora: 27");
           dias.add("Dia "+preferences.getInt("dia_27", 0)) ;

       }
       //TOMA 28 DIA DE LA PILDORA
       if (fecha.equals(preferences.getString("tomaBlister_28", "")) && !preferences.getBoolean("primeravez_blister28", true) && preferences.getInt("dia_28", 0) == 28) {
           fechas.add(fecha +" Dia de píldora: 28");
           dias.add("Dia "+preferences.getInt("dia_28", 0)) ;

           SharedPreferences.Editor objEditor = preferences.edit();
           objEditor.putBoolean("primeravez_blister28", false); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
           objEditor.apply();
           objEditor.putString("tomaBlister_28", ""); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
           objEditor.apply();
           objEditor.putInt("dia_28", 0); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
           objEditor.apply();
       }


       ArrayAdapter <String> adapter= new ArrayAdapter<>(this, R.layout.list_item_registro, fechas);
       registro_dias.setAdapter(adapter);

        registro_dias.setOnItemClickListener((parent, view, position, id) -> {
            if(position==0) {
                niveles_animo(preferences.getInt("nivel_animo_1", 0), "1");
            }
            if(position==1) {
                niveles_animo(preferences.getInt("nivel_animo_2", 0), "2");
            }
            if(position==2) {
                niveles_animo(preferences.getInt("nivel_animo_3", 0), "3");
            }
            if(position==3) {
                niveles_animo(preferences.getInt("nivel_animo_4", 0), "4");
            }
            if(position==4) {
                 niveles_animo(preferences.getInt("nivel_animo_5", 0), "5");
            }
            if(position==5) {
                niveles_animo(preferences.getInt("nivel_animo_6", 0), "6");
            }
            if(position==6) {
                niveles_animo(preferences.getInt("nivel_animo_7", 0), "7");
            }
            if(position==7) {
                niveles_animo(preferences.getInt("nivel_animo_8", 0), "8");
            }
            if(position==8) {
                niveles_animo(preferences.getInt("nivel_animo_9", 0), "9");
            }
            if(position==9) {
                niveles_animo(preferences.getInt("nivel_animo_10", 0), "10");
            }
            if(position==10) {
                niveles_animo(preferences.getInt("nivel_animo_11", 0), "11");
            }
            if(position==11) {
                niveles_animo(preferences.getInt("nivel_animo_12", 0), "12");
            }
            if(position==12) {
                niveles_animo(preferences.getInt("nivel_animo_13", 0), "13");
            }
            if(position==13) {
                niveles_animo(preferences.getInt("nivel_animo_14", 0), "14");
            }
            if(position==14) {
                niveles_animo(preferences.getInt("nivel_animo_15", 0), "15");
            }
            if(position==15) {
                niveles_animo(preferences.getInt("nivel_animo_16", 0), "16");
            }
            if(position==16) {
                niveles_animo(preferences.getInt("nivel_animo_17", 0), "17");
            }
            if(position==17) {
                niveles_animo(preferences.getInt("nivel_animo_18", 0), "18");
            }
            if(position==18) {
                niveles_animo(preferences.getInt("nivel_animo_19", 0), "19");
            }
            if(position==19) {
                niveles_animo(preferences.getInt("nivel_animo_20", 0), "20");
            }
            if(position==20) {
                niveles_animo(preferences.getInt("nivel_animo_21", 0), "21");
            }

            if(position==21) {
                niveles_animo(preferences.getInt("nivel_animo_22", 0), "22");
            }
            if(position==22) {
                niveles_animo(preferences.getInt("nivel_animo_23", 0), "23");
            }
            if(position==23) {
                niveles_animo(preferences.getInt("nivel_animo_24", 0), "24");
            }
            if(position==24) {
                niveles_animo(preferences.getInt("nivel_animo_25", 0), "25");
            }
            if(position==25) {
                niveles_animo(preferences.getInt("nivel_animo_26", 0), "26");
            }
            if(position==26) {
                niveles_animo(preferences.getInt("nivel_animo_27", 0), "27");
            }
            if(position==27) {
                niveles_animo(preferences.getInt("nivel_animo_28", 0), "28");
            }


        });


    }


    public void niveles_animo (int nivel_animo,String dia_animo){

       Bundle extras= new Bundle();
        extras.putString("dia",dia_animo);
        extras.putString("estado","");


        switch(nivel_animo)
        {
            case 1:
                extras.putString("estado","¡ Me siento TERRIBLE !");
                Intent i1= new Intent(this,TerribleActivity.class);
               i1.putExtras(extras);
                startActivity(i1);

            break;

            case 2:
                extras.putString("estado","¡ Me siento MAL !");
                Intent i2= new Intent(this,MalActivity.class);
                i2.putExtras(extras);
                startActivity(i2);

            break;

            case 3:
                extras.putString("estado","¡ Me siento BIEN !");
                Intent i3= new Intent(this,BienActivity.class);
                i3.putExtras(extras);
                startActivity(i3);
                finish();
                break;

            case 4:
                extras.putString("estado","¡ Me siento MUY BIEN !");
                Intent i4= new Intent(this,MuyBienActivity.class);
                i4.putExtras(extras);
                startActivity(i4);
                finish();
                break;

            case 5:
                extras.putString("estado","¡ Me siento GENIAL !");
                Intent i5= new Intent(this,GenialActivity.class);
                i5.putExtras(extras);
                startActivity(i5);
                finish();
                break;

        }

    }
}