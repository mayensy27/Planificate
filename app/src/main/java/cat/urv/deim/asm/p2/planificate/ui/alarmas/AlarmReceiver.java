package cat.urv.deim.asm.p2.planificate.ui.alarmas;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;

import androidx.core.content.ContextCompat;

public class AlarmReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Intent servicel=new Intent(context, NotificationService.class);
        servicel.setData(Uri.parse("custom://" + System.currentTimeMillis()));
        ContextCompat.startForegroundService(context,servicel);
        Log.d("PILL PLAN","ALARM RECEIVED!!!");
    }
}
