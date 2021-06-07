package cat.urv.deim.asm.p2.planificate;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.os.Build;

import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationCompat;

public class NotificationHelper extends ContextWrapper {

    public static final String channel1ID = "channel1ID";
    public static final String channel1Name = "Channel 1";
    public static final int NOTIFICATION_ID = 0;

    private NotificationManager mManager;

    @RequiresApi(api = Build.VERSION_CODES.O)
    public NotificationHelper(Context base) {
        super(base);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            createChannels();
        }

    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public void createChannels() {

        NotificationChannel channel1 = new NotificationChannel(channel1ID, channel1Name, NotificationManager.IMPORTANCE_DEFAULT);
        channel1.enableLights(true);
        channel1.enableVibration(true);
        channel1.setLightColor(R.color.purple_500);
        channel1.setLockscreenVisibility(Notification.VISIBILITY_PRIVATE);

        getManager().createNotificationChannel(channel1);
    }

    public NotificationManager getManager() {
        if (mManager == null) {
            mManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        }
        return mManager;
    }

    @SuppressLint("ResourceAsColor")
    public NotificationCompat.Builder getChannelNotification(String title, String message) {
        return new NotificationCompat.Builder(getApplicationContext(), channel1ID)
                .setContentTitle(title)
                .setContentText(message)
                .setColor(Color.MAGENTA)
                .setLights(Color.MAGENTA, 1000, 1000)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setContentIntent(TimePickerDialog.pendingIntent)
                .setSmallIcon(R.drawable.ic_notificacion);

    }
}