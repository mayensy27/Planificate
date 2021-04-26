package cat.urv.deim.asm.p2.planificate;

import android.os.Bundle;
import android.telephony.SmsManager;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Sms_Envio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);


        enviarSMS("644006200","Pill Plan te recuerda que: ¡Te quedan 3 tomas!"); //solo el movil, sin ningun codigo
    }

    private void enviarSMS(String telefono,String sms) {
        try{
            SmsManager smsManager=SmsManager.getDefault();
            smsManager.sendTextMessage(telefono,null,sms,null,null);
            Toast.makeText(getApplicationContext(),"Mensaje enviado",Toast.LENGTH_LONG).show();
        }catch (Exception e){
            Toast.makeText(getApplicationContext(),"Mensaje no Enviado",Toast.LENGTH_SHORT).show();
            e.printStackTrace();
        }
    }
}