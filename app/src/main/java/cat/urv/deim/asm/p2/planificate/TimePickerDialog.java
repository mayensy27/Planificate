package cat.urv.deim.asm.p2.planificate;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import java.text.DateFormat;
import java.util.Calendar;

public class TimePickerDialog extends AppCompatActivity implements android.app.TimePickerDialog.OnTimeSetListener {
private  TextView establecer_alarma;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker_dialog);

        Button boton_hora = findViewById(R.id.boton_hora);
        Button boton_cancelar = findViewById(R.id.boton_cancelar);
        establecer_alarma = findViewById(R.id.establecer_alarma);

        boton_hora.setOnClickListener(v -> {
            DialogFragment timePicker = new TimePickerFragment();
            timePicker.show(getSupportFragmentManager(),"time picker");
        });

        boton_cancelar.setOnClickListener(v -> cancelAlarm());
    }


    @SuppressLint("SetTextI18n")
    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
       /* TextView textView=(TextView)findViewById(R.id.establecer_alarma);
        textView.setText("Hour: "+ hourOfDay+ "Minute: "+minute);*/

        Calendar c= Calendar.getInstance();
        c.set(Calendar.HOUR_OF_DAY,hourOfDay);
        c.set(Calendar.MINUTE,minute);
        c.set(Calendar.SECOND,0);

        updateTimeText(c);
        startAlarm(c);

    }


    private void updateTimeText (Calendar c){
        String timeText ="Tu alarma de Planifícate está puesta a las: \n";
        timeText += DateFormat.getTimeInstance(DateFormat.SHORT).format(c.getTime())+" h";

        establecer_alarma.setText(timeText);
    }

    private void startAlarm(Calendar c){
        AlarmManager alarmManager= (AlarmManager) getSystemService(Context.ALARM_SERVICE);
        Intent intent = new Intent(this,AlertReceiver.class);
        PendingIntent pendingIntent= PendingIntent.getBroadcast(this,1,intent,0);

        if(c.before(Calendar.getInstance())){
            c.add(Calendar.DATE,1);
        }
        assert alarmManager != null;
        alarmManager.setExact(AlarmManager.RTC_WAKEUP,c.getTimeInMillis(),pendingIntent);

    }

    @SuppressLint("SetTextI18n")
    private void cancelAlarm(){
        AlarmManager alarmManager= (AlarmManager) getSystemService(Context.ALARM_SERVICE);
        Intent intent = new Intent(this,AlertReceiver.class);
        PendingIntent pendingIntent= PendingIntent.getBroadcast(this,1,intent,0);

        assert alarmManager != null;
        alarmManager.cancel(pendingIntent);
        establecer_alarma.setText("La alarma ha sido cancelada");
    }


}