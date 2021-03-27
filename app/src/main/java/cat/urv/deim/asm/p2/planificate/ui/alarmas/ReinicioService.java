package cat.urv.deim.asm.p2.planificate.ui.alarmas;

import android.app.IntentService;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

import androidx.annotation.Nullable;

import cat.urv.deim.asm.p2.planificate.R;

public class ReinicioService extends IntentService {

    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     *
     * @param name Used to name the worker thread, important only for debugging.
     */
    public ReinicioService(String name) {
        super(name);
        startForeground(1, new Notification());
    }
    public ReinicioService(){
        super("ReinicioService");
    }

    public void onCreate(){
        super.onCreate();
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        String intentType=intent.getExtras().getString("caller");
        if(intentType==null) return;
        if(intentType.equals("ReinicioReceiver")){
            SharedPreferences settings=getSharedPreferences(getString(R.string.app_name), Context.MODE_PRIVATE);
            Utils.setAlarm(settings.getInt("alarmID",0),settings.getLong("alarmTime",0),this);
        }
    }
}