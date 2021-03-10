package cat.urv.deim.asm.p2.planificate.ui.calendario;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import cat.urv.deim.asm.p2.planificate.R;
import sun.bob.mcalendarview.MCalendarView;
import sun.bob.mcalendarview.listeners.OnDateClickListener;
import sun.bob.mcalendarview.vo.DateData;

public class CalendarioActivity extends AppCompatActivity {

//    TextView retorno_texto_calendario;
 MCalendarView calendarView;
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

    ///MARCACION DE DIAS DEL MES
        calendarView.markDate(2021, 3, 29);
        calendarView.markDate(2021, 3, 27);
        calendarView.markDate(2021, 4, 25);


    calendarView.setOnDateClickListener(new OnDateClickListener() {
        @Override
        public void onDateClick(View view, DateData date) {
            Toast.makeText(CalendarioActivity.this,"Hoy es: "+date.getDayString()+"/"+date.getMonth()+"/"+date.getYear(),Toast.LENGTH_LONG).show();
        }
    });


    }
}