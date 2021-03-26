package cat.urv.deim.asm.p2.planificate.ui.alarmas;

import android.annotation.TargetApi;
import android.app.IntentService;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;

import androidx.core.app.NotificationCompat;

import cat.urv.deim.asm.p2.planificate.R;


public class NotificationService extends IntentService {
    private PendingIntent pendingIntent;
    private static int NOTIFICATION_ID=1;
    Notification notification;

    public NotificationService (String name){
        super(name);
    }

    public NotificationService(){
        super("SERVICE");
    }
    @TargetApi(Build.VERSION_CODES.O)
    @Override
    protected void onHandleIntent(Intent intent) {
        String NOTIFICATION_CHANNEL_ID=getApplicationContext().getString(R.string.app_name);
        Context context=this.getApplicationContext();
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        Intent mIntent =new Intent(this, AlarmActivity.class);
        Resources res=this.getResources();
        Uri soundUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_ALARM);

        String message =getString(R.string.new_notification);

        if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.O){
            final int NOTIFY_ID=0;  //ID of notification
            String id=NOTIFICATION_CHANNEL_ID; //default channel id
            String title=NOTIFICATION_CHANNEL_ID; //Default Channel
            PendingIntent pendingIntent;
            NotificationCompat.Builder builder;
            NotificationManager notifManager= (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);

            if(notifManager==null){
                notifManager=(NotificationManager)context.getSystemService(Context.NOTIFICATION_SERVICE);
            }
            int importance=NotificationManager.IMPORTANCE_HIGH;
            assert notifManager != null;
            NotificationChannel nChannel=notifManager.getNotificationChannel(id);
            if(nChannel==null){
                nChannel= new NotificationChannel(id,title,importance);
                nChannel.enableVibration(true);
                nChannel.setVibrationPattern(new long []{100,200,300,400,500,400,300,200,400});
                notifManager.createNotificationChannel(nChannel);
            }

            builder=new NotificationCompat.Builder(context,id);
            mIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP|Intent.FLAG_ACTIVITY_SINGLE_TOP);
            pendingIntent=PendingIntent.getActivity(context,0,mIntent,PendingIntent.FLAG_UPDATE_CURRENT);
            builder.setContentTitle(getString(R.string.app_name)).setCategory(Notification.CATEGORY_SERVICE)
                    .setSmallIcon(R.mipmap.icono_plan_pill_round)
                    .setContentText(message)
                    .setLargeIcon(BitmapFactory.decodeResource(res,R.drawable.ic_notificacion))
                    .setDefaults(Notification.DEFAULT_ALL)
                    .setAutoCancel(true)
                    .setSound(soundUri)

                    .setContentIntent(pendingIntent)
                    .setVibrate(new long[]{100,200,300,400,500,400,300,200,400});
            Notification notification =builder.build();
            notifManager.notify(NOTIFY_ID,notification);

            startForeground(1,notification);
        } else {
            pendingIntent=PendingIntent.getActivity(context,1,mIntent,PendingIntent.FLAG_UPDATE_CURRENT);
            notification=new NotificationCompat.Builder(this)
                    .setContentIntent(pendingIntent)
                    .setSmallIcon(R.mipmap.icono_plan_pill_round)
                    .setLargeIcon(BitmapFactory.decodeResource(res,R.drawable.ic_notificacion))
                    .setSound(soundUri)
                    .setAutoCancel(true)
                    .setContentTitle(getString(R.string.app_name)).setCategory(Notification.CATEGORY_SERVICE)
                    .setContentText(message).build();
            assert notificationManager != null;
            notificationManager.notify(NOTIFICATION_ID,notification);

                 }
    }

}