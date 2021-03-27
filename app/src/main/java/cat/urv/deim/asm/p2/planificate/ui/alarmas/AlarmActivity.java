package cat.urv.deim.asm.p2.planificate.ui.alarmas;

import android.app.TimePickerDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

import cat.urv.deim.asm.p2.planificate.R;

public class AlarmActivity extends AppCompatActivity {
    private TextView notificationsTime;
    private final int alarmID=1;
    private SharedPreferences settings;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm);

        settings=getSharedPreferences("Pill plan",Context.MODE_PRIVATE);
        String houR, minutE;

        houR=settings.getString("hour","");
        minutE=settings.getString("minute","");

        notificationsTime=findViewById(R.id.notifications_time);
        if(houR.length()>0)
        {
            notificationsTime.setText(houR+":"+minutE);
        }

        findViewById(R.id.change_notification).setOnClickListener((View v) -> {
            Calendar mcurrentTime=Calendar.getInstance();
            int hour =mcurrentTime.get(Calendar.HOUR_OF_DAY);
            int minute=mcurrentTime.get(Calendar.MINUTE);
            TimePickerDialog mTimePicker;
            mTimePicker=new TimePickerDialog(AlarmActivity.this, (view, hourOfDay, minute1) -> {
                String finalHour, finalMinute;

                finalHour = "" + hourOfDay;
                finalMinute = "" + minute1;
                if (hourOfDay < 10) finalHour = "0" + hourOfDay;
                if (minute1 < 10) finalMinute = "0" + minute1;
                notificationsTime.setText(finalHour + ":" + finalMinute +" h");

                Calendar today = Calendar.getInstance();

                today.set(Calendar.HOUR_OF_DAY, hourOfDay);
                today.set(Calendar.MINUTE, minute1);
                today.set(Calendar.SECOND, 0);

                SharedPreferences.Editor edit=settings.edit();
                edit.putString("hour",finalHour);
                edit.putString("minute",finalMinute);

                //SAVE ALARM TIME TO USE IT IN CASE OF REBOOT
                    edit.putInt("alarmID",alarmID);
                    edit.putLong("alarmTime",today.getTimeInMillis());

                    edit.apply();

                Toast.makeText(AlarmActivity.this, getString(R.string.changed_to, finalHour + ":" + finalMinute), Toast.LENGTH_LONG).show();

                int i=0;
                while(i<=20){
                    Utils.setAlarm(alarmID, today.getTimeInMillis(), AlarmActivity.this);
                    i++;
                }

            },hour,minute,true); //Yes 24 hour time
            mTimePicker.setTitle(getString(R.string.select_time));
            mTimePicker.show();
        });

}

}