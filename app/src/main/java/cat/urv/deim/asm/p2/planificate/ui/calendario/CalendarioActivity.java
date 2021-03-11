package cat.urv.deim.asm.p2.planificate.ui.calendario;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

import cat.urv.deim.asm.p2.planificate.R;

public class CalendarioActivity extends AppCompatActivity {

  TextView retorno_texto_calendario;
   // CalendarView calendarView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendario);

        //Calendario Flotante
        retorno_texto_calendario= findViewById(R.id.regresa_calendario);

        Calendar calendario= Calendar.getInstance();
        int ano=calendario.get(Calendar.YEAR);
        int mes=calendario.get(Calendar.MONTH);
        int dia=calendario.get(Calendar.DAY_OF_MONTH);
        DatePickerDialog datePickerDialog= new DatePickerDialog(this,R.style.Theme_Planificate,
                new DatePickerDialog.OnDateSetListener() {
                    @SuppressLint("SetTextI18n")
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                       String fecha = year+ "-" + (month+1) + "-" + dayOfMonth;


                      SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);

                      //TOMA PRIMER DIA DE LA PILDORA
                         if(fecha.equals(preferences.getString("tomaBlister_1", ""))){
                        //  retorno_texto_calendario.setText(preferences.getString("tomaBlister21_1", ""));
                             retorno_texto_calendario.setText("Te has tomado la píldora: dia 1\n"+"El estado de ánimo" +
                                     "ha sido: "+preferences.getInt("nivel_animo_1", 0));
                       }
                         else{
                             //TOMA 2 DIA DE LA PILDORA
                             if(fecha.equals(preferences.getString("tomaBlister_2", ""))){
                                 //  retorno_texto_calendario.setText(preferences.getString("tomaBlister21_1", ""));
                                 retorno_texto_calendario.setText("Te has tomado la píldora: dia 2\n"+"El estado de ánimo" +
                                         "ha sido: "+preferences.getInt("nivel_animo_2", 0));
                             }
                         }

                    }
                },ano,mes,dia);
        datePickerDialog.show();

        //Calendario incustrado en el fragmento
       /* calendarView=findViewById(R.id.calendarView);
        calendarView.setOnDateChangeListener((view, year, month, dayOfMonth) -> {
            String fecha= dayOfMonth +"/"+(month+1) +"/"+year;
            Toast.makeText(CalendarioActivity.this,fecha,Toast.LENGTH_LONG).show();
        });*/



    }
}