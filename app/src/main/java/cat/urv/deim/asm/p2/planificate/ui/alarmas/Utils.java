package cat.urv.deim.asm.p2.planificate.ui.alarmas;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

import static android.content.Context.ALARM_SERVICE;

public class Utils {

    public static void setAlarm (int i, long timestamp, Context ctx){
        AlarmManager alarmManager=(AlarmManager) ctx.getSystemService(ALARM_SERVICE);
        Intent alarmIntent =new Intent(ctx, AlarmReceiver.class);
        PendingIntent pendingIntent;
        pendingIntent =PendingIntent.getBroadcast(ctx,i,alarmIntent,PendingIntent.FLAG_ONE_SHOT);
        alarmIntent.setData(Uri.parse("custom://"+System.currentTimeMillis()));
        assert alarmManager != null;
        alarmManager.set(AlarmManager.RTC_WAKEUP,timestamp,pendingIntent);

    }

}