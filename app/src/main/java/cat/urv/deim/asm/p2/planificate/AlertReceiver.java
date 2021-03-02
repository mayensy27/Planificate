package cat.urv.deim.asm.p2.planificate;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationCompat;
import static cat.urv.deim.asm.p2.planificate.NotificationHelper.NOTIFICATION_ID;


public class AlertReceiver extends BroadcastReceiver {
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onReceive(Context context, Intent intent) {

        NotificationHelper notificationHelper = new NotificationHelper(context);
        NotificationCompat.Builder nb = notificationHelper.getChannelNotification("!Es hora de PLANIFÍCATE!", "Tómate la píldora");
        notificationHelper.getManager().notify(NOTIFICATION_ID, nb.build());

    }
}