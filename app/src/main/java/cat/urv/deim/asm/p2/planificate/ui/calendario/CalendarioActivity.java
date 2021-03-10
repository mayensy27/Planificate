package cat.urv.deim.asm.p2.planificate.ui.calendario;

import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import cat.urv.deim.asm.p2.planificate.R;

public class CalendarioActivity extends AppCompatActivity {

//    TextView retorno_texto_calendario;
CalendarView calendarView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendario);

        //Calendario Flotante
/*
        retorno_texto_calendario= findViewById(R.id.regresa_calendario);

        Calendar calendario= Calendar.getInstance();
        int ano=calendario.get(Calendar.YEAR);
        int mes=calendario.get(Calendar.MONTH);
        int dia=calendario.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog datePickerDialog= new DatePickerDialog(this,
                (view, year, month, dayOfMonth) -> {
                String fecha= dayOfMonth +"/"+month +"/"+year;
                retorno_texto_calendario.setText(fecha);
                },ano,mes,dia);
        datePickerDialog.show();*/

    calendarView=findViewById(R.id.calendarView);
    calendarView.setOnDateChangeListener((view, year, month, dayOfMonth) -> {
        String fecha= dayOfMonth +"/"+(month+1) +"/"+year;
        Toast.makeText(CalendarioActivity.this,fecha,Toast.LENGTH_LONG).show();
    });
    }
}