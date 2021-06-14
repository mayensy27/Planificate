package cat.urv.deim.asm.p2.planificate.ui.alarmas;

import android.annotation.TargetApi;
import android.app.IntentService;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;

import androidx.core.app.NotificationCompat;

import java.util.Calendar;

import cat.urv.deim.asm.p2.planificate.MainActivity;
import cat.urv.deim.asm.p2.planificate.R;

public class NotificationService extends IntentService {

    NotificationManager notificationManager;
    PendingIntent pendingIntent;
    static int NOTIFICATION_ID = 1;
    Notification notification;
    String id,title;

    SharedPreferences settings;


    public NotificationService() {
        super("SERVICE");
    }

    @TargetApi(Build.VERSION_CODES.O)
    @Override
    protected void onHandleIntent(Intent intent2) {
        String NOTIFICATION_CHANNEL_ID = getApplicationContext().getString(R.string.app_name);
        Context context = this.getApplicationContext();
        notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        Intent mIntent = new Intent(this, MainActivity.class);
        Resources res = this.getResources();
        Uri soundUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_ALARM);

        String message = getString(R.string.new_notification);

        settings = getSharedPreferences(getString(R.string.app_name), Context.MODE_PRIVATE);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {

            final int NOTIFY_ID = 0; // ID of notification
           id = NOTIFICATION_CHANNEL_ID; // default_channel_id
            title = NOTIFICATION_CHANNEL_ID; // Default Channel
            PendingIntent pendingIntent;
            NotificationCompat.Builder builder;
            NotificationManager notifManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
            if (notifManager == null) {
                notifManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
            }
            int importance = NotificationManager.IMPORTANCE_HIGH;
            assert notifManager != null;
            NotificationChannel mChannel = notifManager.getNotificationChannel(id);
            if (mChannel == null) {
                mChannel = new NotificationChannel(id, title, importance);
                mChannel.enableVibration(true);
                mChannel.setVibrationPattern(new long[]{100, 200, 300, 400, 500, 400, 300, 200, 400});
                notifManager.createNotificationChannel(mChannel);
            }
            builder = new NotificationCompat.Builder(context, id);
            mIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
            pendingIntent = PendingIntent.getActivity(context, 0, mIntent, PendingIntent.FLAG_UPDATE_CURRENT);
            builder.setContentTitle(getString(R.string.app_name)).setCategory(Notification.CATEGORY_SERVICE)
                    .setSmallIcon(R.drawable.ic_notificacion)   // required
                    .setContentText(message)
                    .setLargeIcon(BitmapFactory.decodeResource(res, R.drawable.ic_notificacion))
                    .setDefaults(Notification.DEFAULT_ALL)
                    .setAutoCancel(true)
                    .setSound(soundUri)

                    .setContentIntent(pendingIntent)
                    .setVibrate(new long[]{100, 200, 300, 400, 500, 400, 300, 200, 400});
            Notification notification = builder.build();
            notifManager.notify(NOTIFY_ID, notification);

            startForeground(1, notification);


        } else {

            pendingIntent = PendingIntent.getActivity(context, 1, mIntent, PendingIntent.FLAG_UPDATE_CURRENT);
            notification = new NotificationCompat.Builder(this)
                    .setContentIntent(pendingIntent)
                    .setSmallIcon(R.drawable.ic_notificacion)
                    .setLargeIcon(BitmapFactory.decodeResource(res, R.drawable.ic_notificacion))
                    .setSound(soundUri)
                    .setAutoCancel(true)
                    .setContentTitle(getString(R.string.app_name)).setCategory(Notification.CATEGORY_SERVICE)
                    .setContentText(message).build();
            notificationManager.notify(NOTIFICATION_ID, notification);


        }

       /* Random random= new Random();
        int alarmID=random.nextInt(8000) ;*/
        int alarmID=1;

        Calendar mcurrentTime = Calendar.getInstance();
        int hour = mcurrentTime.get(Calendar.HOUR_OF_DAY);
        int minute = mcurrentTime.get(Calendar.MINUTE);

        SharedPreferences settings;
        settings = getApplicationContext().getSharedPreferences(getString(R.string.app_name), Context.MODE_PRIVATE);

        String hora = settings.getString("hour", "");
        String minuto = settings.getString("minute", "");
        if (hora.equals(Integer.toString(hour))&&minuto.equals(Integer.toString(minute))) {

            Calendar today = Calendar.getInstance();

            //today.set(Calendar.DAY_OF_MONTH,Calendar.DAY_OF_MONTH+1);
            today.set(Calendar.HOUR_OF_DAY, hour);
            today.set(Calendar.MINUTE, minute+1440); //24H=1440minutes
            today.set(Calendar.SECOND, 0);
            today.set(Calendar.MILLISECOND, 0);

            Utils.setAlarm(alarmID, today.getTimeInMillis(), NotificationService.this);
        }
        else{
            Calendar today = Calendar.getInstance();

            today.set(Calendar.HOUR_OF_DAY, hour);
            today.set(Calendar.MINUTE, minute+5); //24H=1440minutes
            today.set(Calendar.SECOND, 0);
            today.set(Calendar.MILLISECOND,0);
            Utils.setAlarm(alarmID, today.getTimeInMillis(), NotificationService.this);
        }
    }
}