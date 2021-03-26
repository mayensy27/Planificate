package cat.urv.deim.asm.p2.planificate.ui.alarmas;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

import cat.urv.deim.asm.p2.planificate.R;

public class AlarmActivity extends AppCompatActivity {
    private TextView notificationsTime;
    private final int alarmID=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm);
        notificationsTime=findViewById(R.id.notifications_time);
        findViewById(R.id.change_notification).setOnClickListener(v -> {
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

                Toast.makeText(AlarmActivity.this, getString(R.string.changed_to, finalHour + ":" + finalMinute), Toast.LENGTH_LONG).show();
                setAlarm(alarmID, today.getTimeInMillis(), AlarmActivity.this);
            },hour,minute,true); //Yes 24 hour time
            mTimePicker.setTitle(getString(R.string.select_time));
            mTimePicker.show();
        });

}

    private static void setAlarm (int i, long timestamp, Context ctx){
        AlarmManager alarmManager=(AlarmManager) ctx.getSystemService(ALARM_SERVICE);
        Intent  alarmIntent =new Intent(ctx, AlarmReceiver.class);
        PendingIntent pendingIntent;
        pendingIntent =PendingIntent.getBroadcast(ctx,i,alarmIntent,PendingIntent.FLAG_ONE_SHOT);
        alarmIntent.setData(Uri.parse("custom://"+System.currentTimeMillis()));
        assert alarmManager != null;
        alarmManager.set(AlarmManager.RTC_WAKEUP,timestamp,pendingIntent);

    }
}