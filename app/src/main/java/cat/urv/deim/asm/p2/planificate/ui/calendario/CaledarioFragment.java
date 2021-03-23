package cat.urv.deim.asm.p2.planificate.ui.calendario;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.Calendar;

import cat.urv.deim.asm.p2.planificate.R;

public class CaledarioFragment extends Fragment {

   // private AlarmasViewModel slideshowViewModel;


    TextView retorno_texto_calendario;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_calendario, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button abrir_calendario= view.findViewById(R.id.boton_calendario);
        abrir_calendario.setOnClickListener(v -> {
          /*  Intent i= new Intent(getContext(),CalendarioActivity.class);
            startActivity(i);*/

            //retorno_texto_calendario= view.findViewById(R.id.regresa_calendario);

            Calendar calendario= Calendar.getInstance();
            int ano=calendario.get(Calendar.YEAR);
            int mes=calendario.get(Calendar.MONTH);
            int dia=calendario.get(Calendar.DAY_OF_MONTH);

            DatePickerDialog datePickerDialog= new DatePickerDialog(requireActivity(),R.style.Theme_Planificate,
                    (view1, year, month, dayOfMonth) -> {
                        String fecha = year + "-" + (month + 1) + "-" + dayOfMonth;

                        SharedPreferences preferences = requireActivity().getSharedPreferences("datos", Context.MODE_PRIVATE);


                        //TOMA PRIMER DIA DE LA PILDORA
                        if (fecha.equals(preferences.getString("tomaBlister_1", "")) && !preferences.getBoolean("primeravez_blister1", true) && preferences.getInt("dia_1", 0) == 1) {
                            //  retorno_texto_calendario.setText(preferences.getString("tomaBlister21_1", ""));
                        /*retorno_texto_calendario.setText("Te has tomado la píldora: dia 1\n" + "El estado de ánimo" +
                                "ha sido: " + preferences.getInt("nivel_animo_1", 0));
*/
                            niveles_animo(preferences.getInt("nivel_animo_1", 0),"1");
                        }

                        //TOMA 2 DIA DE LA PILDORA
                        if (fecha.equals(preferences.getString("tomaBlister_2", "")) && !preferences.getBoolean("primeravez_blister2", true) && preferences.getInt("dia_2", 0) == 2) {
                            //  retorno_texto_calendario.setText(preferences.getString("tomaBlister21_1", ""));
                        /*retorno_texto_calendario.setText("Te has tomado la píldora: dia 2\n" + "El estado de ánimo" +
                                "ha sido: " + preferences.getInt("nivel_animo_2", 0));*/

                            niveles_animo(preferences.getInt("nivel_animo_2", 0),"2");
                        }
                        //TOMA 3 DIA DE LA PILDORA
                        if (fecha.equals(preferences.getString("tomaBlister_3", "")) && !preferences.getBoolean("primeravez_blister3", true) && preferences.getInt("dia_3", 0) == 3) {
                            //  retorno_texto_calendario.setText(preferences.getString("tomaBlister21_1", ""));
                      /*  retorno_texto_calendario.setText("Te has tomado la píldora: dia 3\n" + "El estado de ánimo" +
                                "ha sido: " + preferences.getInt("nivel_animo_3", 0));*/
                            niveles_animo(preferences.getInt("nivel_animo_3", 0),"3");

                        }
                        //TOMA 4 DIA DE LA PILDORA
                        if (fecha.equals(preferences.getString("tomaBlister_4", "")) && !preferences.getBoolean("primeravez_blister4", true) && preferences.getInt("dia_4", 0) == 4) {
                            //  retorno_texto_calendario.setText(preferences.getString("tomaBlister21_1", ""));
                       /* retorno_texto_calendario.setText("Te has tomado la píldora: dia 4\n" + "El estado de ánimo" +
                                "ha sido: " + preferences.getInt("nivel_animo_2", 0));*/

                            niveles_animo(preferences.getInt("nivel_animo_4", 0),"4");

                        }
                        //TOMA 5 DIA DE LA PILDORA
                        if (fecha.equals(preferences.getString("tomaBlister_5", "")) && !preferences.getBoolean("primeravez_blister5", true) && preferences.getInt("dia_5", 0) == 5) {
                            //  retorno_texto_calendario.setText(preferences.getString("tomaBlister21_1", ""));
                      /*  retorno_texto_calendario.setText("Te has tomado la píldora: dia 5\n" + "El estado de ánimo" +
                                "ha sido: " + preferences.getInt("nivel_animo_5", 0));*/
                            niveles_animo(preferences.getInt("nivel_animo_5", 0),"5");

                        }
                        //TOMA 6 DIA DE LA PILDORA
                        if (fecha.equals(preferences.getString("tomaBlister_6", "")) && !preferences.getBoolean("primeravez_blister6", true) && preferences.getInt("dia_6", 0) == 6) {
                            //  retorno_texto_calendario.setText(preferences.getString("tomaBlister21_1", ""));
                        /*retorno_texto_calendario.setText("Te has tomado la píldora: dia 6\n" + "El estado de ánimo" +
                                "ha sido: " + preferences.getInt("nivel_animo_6", 0));*/
                            niveles_animo(preferences.getInt("nivel_animo_6", 0),"6");

                        }
                        //TOMA 7 DIA DE LA PILDORA
                        if (fecha.equals(preferences.getString("tomaBlister_7", "")) && !preferences.getBoolean("primeravez_blister7", true) && preferences.getInt("dia_7", 0) == 7) {
                            //  retorno_texto_calendario.setText(preferences.getString("tomaBlister21_1", ""));
                        /*retorno_texto_calendario.setText("Te has tomado la píldora: dia 7\n" + "El estado de ánimo" +
                                "ha sido: " + preferences.getInt("nivel_animo_7", 0));*/
                            niveles_animo(preferences.getInt("nivel_animo_7", 0),"7");

                        }
                        //TOMA 8 DIA DE LA PILDORA
                        if (fecha.equals(preferences.getString("tomaBlister_8", "")) && !preferences.getBoolean("primeravez_blister8", true) && preferences.getInt("dia_8", 0) == 8) {
                            //  retorno_texto_calendario.setText(preferences.getString("tomaBlister21_1", ""));
                       /* retorno_texto_calendario.setText("Te has tomado la píldora: dia 8\n" + "El estado de ánimo" +
                                "ha sido: " + preferences.getInt("nivel_animo_8", 0));*/
                            niveles_animo(preferences.getInt("nivel_animo_8", 0),"8");

                        }
                        //TOMA 9 DIA DE LA PILDORA
                        if (fecha.equals(preferences.getString("tomaBlister_9", "")) && !preferences.getBoolean("primeravez_blister9", true) && preferences.getInt("dia_9", 0) == 9) {
                            //  retorno_texto_calendario.setText(preferences.getString("tomaBlister21_1", ""));
                   /*     retorno_texto_calendario.setText("Te has tomado la píldora: dia 9\n" + "El estado de ánimo" +
                                "ha sido: " + preferences.getInt("nivel_animo_9", 0));*/
                            niveles_animo(preferences.getInt("nivel_animo_9", 0),"9");

                        }
                        //TOMA 10 DIA DE LA PILDORA
                        if (fecha.equals(preferences.getString("tomaBlister_10", "")) && !preferences.getBoolean("primeravez_blister10", true) && preferences.getInt("dia_10", 0) == 10) {
                            //  retorno_texto_calendario.setText(preferences.getString("tomaBlister21_1", ""));
                     /*   retorno_texto_calendario.setText("Te has tomado la píldora: dia 10\n" + "El estado de ánimo" +
                                "ha sido: " + preferences.getInt("nivel_animo_10", 0));*/
                            niveles_animo(preferences.getInt("nivel_animo_10", 0),"10");

                        }
                        //TOMA 11 DIA DE LA PILDORA
                        if (fecha.equals(preferences.getString("tomaBlister_11", "")) && !preferences.getBoolean("primeravez_blister11", true) && preferences.getInt("dia_11", 0) == 11) {
                            //  retorno_texto_calendario.setText(preferences.getString("tomaBlister21_1", ""));
               /*         retorno_texto_calendario.setText("Te has tomado la píldora: dia 11\n" + "El estado de ánimo" +
                                "ha sido: " + preferences.getInt("nivel_animo_11", 0));*/
                            niveles_animo(preferences.getInt("nivel_animo_11", 0),"11");

                        }
                        //TOMA 12 DIA DE LA PILDORA
                        if (fecha.equals(preferences.getString("tomaBlister_12", "")) && !preferences.getBoolean("primeravez_blister12", true) && preferences.getInt("dia_12", 0) == 12) {
                            //  retorno_texto_calendario.setText(preferences.getString("tomaBlister21_1", ""));
                     /*   retorno_texto_calendario.setText("Te has tomado la píldora: dia 12\n" + "El estado de ánimo" +
                                "ha sido: " + preferences.getInt("nivel_animo_12", 0));*/
                            niveles_animo(preferences.getInt("nivel_animo_12", 0),"12");

                        }
                        //TOMA 13 DIA DE LA PILDORA
                        if (fecha.equals(preferences.getString("tomaBlister_13", "")) && !preferences.getBoolean("primeravez_blister13", true) && preferences.getInt("dia_13", 0) == 13) {
                            //  retorno_texto_calendario.setText(preferences.getString("tomaBlister21_1", ""));
               /*         retorno_texto_calendario.setText("Te has tomado la píldora: dia 13\n" + "El estado de ánimo" +
                                "ha sido: " + preferences.getInt("nivel_animo_13", 0));*/
                            niveles_animo(preferences.getInt("nivel_animo_13", 0),"13");

                        }
                        //TOMA 14 DIA DE LA PILDORA
                        if (fecha.equals(preferences.getString("tomaBlister_14", "")) && !preferences.getBoolean("primeravez_blister14", true) && preferences.getInt("dia_14", 0) == 14) {
                            //  retorno_texto_calendario.setText(preferences.getString("tomaBlister21_1", ""));
                     /*   retorno_texto_calendario.setText("Te has tomado la píldora: dia 14\n" + "El estado de ánimo" +
                                "ha sido: " + preferences.getInt("nivel_animo_14", 0));*/
                            niveles_animo(preferences.getInt("nivel_animo_14", 0),"14");

                        }
                        //TOMA 15 DIA DE LA PILDORA
                        if (fecha.equals(preferences.getString("tomaBlister_15", "")) && !preferences.getBoolean("primeravez_blister15", true) && preferences.getInt("dia_15", 0) == 15) {
                            //  retorno_texto_calendario.setText(preferences.getString("tomaBlister21_1", ""));
                     /*   retorno_texto_calendario.setText("Te has tomado la píldora: dia 15\n" + "El estado de ánimo" +
                                "ha sido: " + preferences.getInt("nivel_animo_15", 0));*/
                            niveles_animo(preferences.getInt("nivel_animo_15", 0),"15");

                        }
                        //TOMA 16 DIA DE LA PILDORA
                        if (fecha.equals(preferences.getString("tomaBlister_16", "")) && !preferences.getBoolean("primeravez_blister16", true) && preferences.getInt("dia_16", 0) == 16) {
                            //  retorno_texto_calendario.setText(preferences.getString("tomaBlister21_1", ""));
/*                        retorno_texto_calendario.setText("Te has tomado la píldora: dia 16\n" + "El estado de ánimo" +
                                "ha sido: " + preferences.getInt("nivel_animo_16", 0));*/
                            niveles_animo(preferences.getInt("nivel_animo_16", 0),"16");

                        }
                        //TOMA 17 DIA DE LA PILDORA
                        if (fecha.equals(preferences.getString("tomaBlister_17", "")) && !preferences.getBoolean("primeravez_blister17", true) && preferences.getInt("dia_17", 0) == 17) {
                            //  retorno_texto_calendario.setText(preferences.getString("tomaBlister21_1", ""));
    /*                    retorno_texto_calendario.setText("Te has tomado la píldora: dia 17\n" + "El estado de ánimo" +
                                "ha sido: " + preferences.getInt("nivel_animo_17", 0));*/
                            niveles_animo(preferences.getInt("nivel_animo_17", 0),"17");

                        }
                        //TOMA 18 DIA DE LA PILDORA
                        if (fecha.equals(preferences.getString("tomaBlister_18", "")) && !preferences.getBoolean("primeravez_blister18", true) && preferences.getInt("dia_18", 0) == 18) {
                            //  retorno_texto_calendario.setText(preferences.getString("tomaBlister21_1", ""));
                       /* retorno_texto_calendario.setText("Te has tomado la píldora: dia 18\n" + "El estado de ánimo" +
                                "ha sido: " + preferences.getInt("nivel_animo_18", 0));*/
                            niveles_animo(preferences.getInt("nivel_animo_18", 0),"18");

                        }
                        //TOMA 19 DIA DE LA PILDORA
                        if (fecha.equals(preferences.getString("tomaBlister_19", "")) && !preferences.getBoolean("primeravez_blister19", true) && preferences.getInt("dia_19", 0) == 19) {
                            //  retorno_texto_calendario.setText(preferences.getString("tomaBlister21_1", ""));
                     /*   retorno_texto_calendario.setText("Te has tomado la píldora: dia 19\n" + "El estado de ánimo" +
                                "ha sido: " + preferences.getInt("nivel_animo_19", 0));*/
                            niveles_animo(preferences.getInt("nivel_animo_19", 0),"19");

                        }
                        //TOMA 20 DIA DE LA PILDORA
                        if (fecha.equals(preferences.getString("tomaBlister_20", "")) && !preferences.getBoolean("primeravez_blister20", true) && preferences.getInt("dia_20", 0) == 20) {
                            //  retorno_texto_calendario.setText(preferences.getString("tomaBlister21_1", ""));
                      /*  retorno_texto_calendario.setText("Te has tomado la píldora: dia 20\n" + "El estado de ánimo" +
                                "ha sido: " + preferences.getInt("nivel_animo_20", 0));*/
                            niveles_animo(preferences.getInt("nivel_animo_20", 0),"20");

                        }
                        //TOMA 21 DIA DE LA PILDORA
                        if (fecha.equals(preferences.getString("tomaBlister_21", "")) && (!preferences.getBoolean("primeravez21_blister21", true)||!preferences.getBoolean("primeravez_blister21", true))
                                && preferences.getInt("dia_21", 0) == 21) {
                            //  retorno_texto_calendario.setText(preferences.getString("tomaBlister21_1", ""));
                       /* retorno_texto_calendario.setText("Te has tomado la píldora: dia 21\n" + "El estado de ánimo" +
                                "ha sido: " + preferences.getInt("nivel_animo_21", 0));*/
                            niveles_animo(preferences.getInt("nivel_animo_21", 0),"21");


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
                            //  retorno_texto_calendario.setText(preferences.getString("tomaBlister21_1", ""));
                       /* retorno_texto_calendario.setText("Te has tomado la píldora: dia 22\n" + "El estado de ánimo" +
                                "ha sido: " + preferences.getInt("nivel_animo_22", 0));*/
                            niveles_animo(preferences.getInt("nivel_animo_22", 0),"22");

                        }
                        //TOMA 23 DIA DE LA PILDORA
                        if (fecha.equals(preferences.getString("tomaBlister_23", "")) && !preferences.getBoolean("primeravez_blister23", true) && preferences.getInt("dia_23", 0) == 23) {
                            //  retorno_texto_calendario.setText(preferences.getString("tomaBlister21_1", ""));
        /*                retorno_texto_calendario.setText("Te has tomado la píldora: dia 23\n" + "El estado de ánimo" +
                                "ha sido: " + preferences.getInt("nivel_animo_23", 0));*/
                            niveles_animo(preferences.getInt("nivel_animo_23", 0),"23");

                        }
                        //TOMA 24 DIA DE LA PILDORA
                        if (fecha.equals(preferences.getString("tomaBlister_24", "")) && !preferences.getBoolean("primeravez_blister24", true) && preferences.getInt("dia_24", 0) == 24) {
                            //  retorno_texto_calendario.setText(preferences.getString("tomaBlister21_1", ""));
                  /*      retorno_texto_calendario.setText("Te has tomado la píldora: dia 24\n" + "El estado de ánimo" +
                                "ha sido: " + preferences.getInt("nivel_animo_24", 0));*/
                            niveles_animo(preferences.getInt("nivel_animo_24", 0),"24");

                        }
                        //TOMA 25 DIA DE LA PILDORA
                        if (fecha.equals(preferences.getString("tomaBlister_25", "")) && !preferences.getBoolean("primeravez_blister25", true) && preferences.getInt("dia_25", 0) == 25) {
                            //  retorno_texto_calendario.setText(preferences.getString("tomaBlister21_1", ""));
                       /* retorno_texto_calendario.setText("Te has tomado la píldora: dia 25\n" + "El estado de ánimo" +
                                "ha sido: " + preferences.getInt("nivel_animo_25", 0));*/
                            niveles_animo(preferences.getInt("nivel_animo_25", 0),"25");

                        }
                        //TOMA 26 DIA DE LA PILDORA
                        if (fecha.equals(preferences.getString("tomaBlister_26", "")) && !preferences.getBoolean("primeravez_blister26", true) && preferences.getInt("dia_26", 0) == 26) {
                            //  retorno_texto_calendario.setText(preferences.getString("tomaBlister21_1", ""));
        /*                retorno_texto_calendario.setText("Te has tomado la píldora: dia 26\n" + "El estado de ánimo" +
                                "ha sido: " + preferences.getInt("nivel_animo_26", 0));*/
                            niveles_animo(preferences.getInt("nivel_animo_26", 0),"26");

                        }
                        //TOMA 27 DIA DE LA PILDORA
                        if (fecha.equals(preferences.getString("tomaBlister_27", "")) && !preferences.getBoolean("primeravez_blister27", true) && preferences.getInt("dia_27", 0) == 27) {
                            //  retorno_texto_calendario.setText(preferences.getString("tomaBlister21_1", ""));
               /*         retorno_texto_calendario.setText("Te has tomado la píldora: dia 27\n" + "El estado de ánimo" +
                                "ha sido: " + preferences.getInt("nivel_animo_27", 0));*/
                            niveles_animo(preferences.getInt("nivel_animo_27", 0),"27");

                        }
                        //TOMA 28 DIA DE LA PILDORA
                        if (fecha.equals(preferences.getString("tomaBlister_28", "")) && !preferences.getBoolean("primeravez_blister28", true) && preferences.getInt("dia_28", 0) == 28) {
                            //  retorno_texto_calendario.setText(preferences.getString("tomaBlister21_1", ""));
                      /*  retorno_texto_calendario.setText("Te has tomado la píldora: dia 28\n" + "El estado de ánimo" +
                                "ha sido: " + preferences.getInt("nivel_animo_28", 0));
*/
                            niveles_animo(preferences.getInt("nivel_animo_28", 0),"28");

                            SharedPreferences.Editor objEditor = preferences.edit();
                            objEditor.putBoolean("primeravez_blister28", false); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
                            objEditor.apply();
                            objEditor.putString("tomaBlister_28", ""); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
                            objEditor.apply();
                            objEditor.putInt("dia_28", 0); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
                            objEditor.apply();
                        }

                    },ano,mes,dia);
            datePickerDialog.show();


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
                Intent i1= new Intent(getContext(),TerribleActivity.class);
                i1.putExtras(extras);
                startActivity(i1);

                break;

            case 2:
                extras.putString("estado","¡ Me siento MAL !");
                Intent i2= new Intent(getContext(),MalActivity.class);
                i2.putExtras(extras);
                startActivity(i2);

                break;

            case 3:
                extras.putString("estado","¡ Me siento BIEN !");
                Intent i3= new Intent(getContext(),BienActivity.class);
                i3.putExtras(extras);
                startActivity(i3);

                break;

            case 4:
                extras.putString("estado","¡ Me siento MUY BIEN !");
                Intent i4= new Intent(getContext(),MuyBienActivity.class);
                i4.putExtras(extras);
                startActivity(i4);

                break;

            case 5:
                extras.putString("estado","¡ Me siento GENIAL !");
                Intent i5= new Intent(getContext(),GenialActivity.class);
                i5.putExtras(extras);
                startActivity(i5);

                break;

        }

    }

}