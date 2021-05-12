package cat.urv.deim.asm.p2.planificate;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class MailAPI extends Activity implements OnClickListener{

    Session session = null;
    ProgressDialog pdialog = null;
    Context context = null;
    EditText reciep, sub;
    String rec, subject, textMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mail_api);

        context = this;

        Button login = findViewById(R.id.btn_submit);
        reciep =findViewById(R.id.et_to);
        sub = findViewById(R.id.et_sub);

        login.setOnClickListener(this);

        SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);
        reciep.setText(preferences.getString("email_usuaria",""));

        sub.setText("Pill Plan");
        sub.setFocusable(false);  //para NO modificar

    }

    @Override
    public void onClick(View v) {
        rec = reciep.getText().toString();
        subject = sub.getText().toString();


        SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);
        SharedPreferences efectos = getSharedPreferences("efectos", Context.MODE_PRIVATE);
        if(!preferences.getBoolean("mail_21", true)) {
            textMessage = "Hola, como ya se te ha informado anteriormente te enviamos desde Pill Plan el registro de las tomas " +
                    "de los anticonceptivos junto con los estados de ánimo y molestias provocadas por estos.\n\n" +
                    "Día 1: Tu estado de ánimo ha sido -> " + niveles_animo(preferences.getInt("nivel_animo_1", 0)) + " y ha tenido molestias de: " + efectos.getString("efecto_animo_1", "") + "\n" +
                    "Día 2: Tu estado de ánimo ha sido -> " + niveles_animo(preferences.getInt("nivel_animo_2", 0)) + " y ha tenido molestias de: " + efectos.getString("efecto_animo_2", "") + "\n" +
                    "Día 3: Tu estado de ánimo ha sido -> " + niveles_animo(preferences.getInt("nivel_animo_3", 0)) + " y ha tenido molestias de: " + efectos.getString("efecto_animo_3", "") + "\n" +
                    "Día 4: Tu estado de ánimo ha sido -> " + niveles_animo(preferences.getInt("nivel_animo_4", 0)) + " y ha tenido molestias de: " + efectos.getString("efecto_animo_4", "") + "\n" +
                    "Día 5: Tu estado de ánimo ha sido -> " + niveles_animo(preferences.getInt("nivel_animo_5", 0)) + " y ha tenido molestias de: " + efectos.getString("efecto_animo_5", "") + "\n" +
                    "Día 6: Tu estado de ánimo ha sido -> " + niveles_animo(preferences.getInt("nivel_animo_6", 0)) + " y ha tenido molestias de: " + efectos.getString("efecto_animo_6", "") + "\n" +
                    "Día 7: Tu estado de ánimo ha sido -> " + niveles_animo(preferences.getInt("nivel_animo_7", 0)) + " y ha tenido molestias de: " + efectos.getString("efecto_animo_7", "") + "\n" +
                    "Día 8: Tu estado de ánimo ha sido -> " + niveles_animo(preferences.getInt("nivel_animo_8", 0)) + " y ha tenido molestias de: " + efectos.getString("efecto_animo_8", "") + "\n" +
                    "Día 9: Tu estado de ánimo ha sido -> " + niveles_animo(preferences.getInt("nivel_animo_9", 0)) + " y ha tenido molestias de: " + efectos.getString("efecto_animo_9", "") + "\n" +
                    "Día 10: Tu estado de ánimo ha sido -> " + niveles_animo(preferences.getInt("nivel_animo_10", 0)) + " y ha tenido molestias de: " + efectos.getString("efecto_animo_10", "") + "\n" +
                    "Día 11: Tu estado de ánimo ha sido -> " + niveles_animo(preferences.getInt("nivel_animo_11", 0)) + " y ha tenido molestias de: " + efectos.getString("efecto_animo_11", "") + "\n" +
                    "Día 12: Tu estado de ánimo ha sido -> " + niveles_animo(preferences.getInt("nivel_animo_12", 0)) + " y ha tenido molestias de: " + efectos.getString("efecto_animo_12", "") + "\n" +
                    "Día 13: Tu estado de ánimo ha sido -> " + niveles_animo(preferences.getInt("nivel_animo_13", 0)) + " y ha tenido molestias de: " + efectos.getString("efecto_animo_13", "") + "\n" +
                    "Día 14: Tu estado de ánimo ha sido -> " + niveles_animo(preferences.getInt("nivel_animo_14", 0)) + " y ha tenido molestias de: " + efectos.getString("efecto_animo_14", "") + "\n" +
                    "Día 15: Tu estado de ánimo ha sido -> " + niveles_animo(preferences.getInt("nivel_animo_15", 0)) + " y ha tenido molestias de: " + efectos.getString("efecto_animo_15", "") + "\n" +
                    "Día 16: Tu estado de ánimo ha sido -> " + niveles_animo(preferences.getInt("nivel_animo_16", 0)) + " y ha tenido molestias de: " + efectos.getString("efecto_animo_16", "") + "\n" +
                    "Día 17: Tu estado de ánimo ha sido -> " + niveles_animo(preferences.getInt("nivel_animo_17", 0)) + " y ha tenido molestias de: " + efectos.getString("efecto_animo_17", "") + "\n" +
                    "Día 18: Tu estado de ánimo ha sido -> " + niveles_animo(preferences.getInt("nivel_animo_18", 0)) + " y ha tenido molestias de: " + efectos.getString("efecto_animo_18", "") + "\n" +
                    "Día 19: Tu estado de ánimo ha sido -> " + niveles_animo(preferences.getInt("nivel_animo_19", 0)) + " y ha tenido molestias de: " + efectos.getString("efecto_animo_19", "") + "\n" +
                    "Día 20: Tu estado de ánimo ha sido -> " + niveles_animo(preferences.getInt("nivel_animo_20", 0)) + " y ha tenido molestias de: " + efectos.getString("efecto_animo_20", "") + "\n" +
                    "Día 21: Tu estado de ánimo ha sido -> " + niveles_animo(preferences.getInt("nivel_animo_21", 0)) + " y ha tenido molestias de: " + efectos.getString("efecto_animo_21", "");
        }
        if(!preferences.getBoolean("mail_28", true)){
            textMessage = "Hola, como ya se te ha informado anteriormente te enviamos desde Pill Plan el registro de las tomas " +
                    "de los anticonceptivos junto con los estados de ánimo y molestias provocadas por estos.\n\n" +
                    "Día 1: Tu estado de ánimo ha sido -> " + niveles_animo(preferences.getInt("nivel_animo_1", 0)) + " y ha tenido molestias de: " + efectos.getString("efecto_animo_1", "") + "\n" +
                    "Día 2: Tu estado de ánimo ha sido -> " + niveles_animo(preferences.getInt("nivel_animo_2", 0)) + " y ha tenido molestias de: " + efectos.getString("efecto_animo_2", "") + "\n" +
                    "Día 3: Tu estado de ánimo ha sido -> " + niveles_animo(preferences.getInt("nivel_animo_3", 0)) + " y ha tenido molestias de: " + efectos.getString("efecto_animo_3", "") + "\n" +
                    "Día 4: Tu estado de ánimo ha sido -> " + niveles_animo(preferences.getInt("nivel_animo_4", 0)) + " y ha tenido molestias de: " + efectos.getString("efecto_animo_4", "") + "\n" +
                    "Día 5: Tu estado de ánimo ha sido -> " + niveles_animo(preferences.getInt("nivel_animo_5", 0)) + " y ha tenido molestias de: " + efectos.getString("efecto_animo_5", "") + "\n" +
                    "Día 6: Tu estado de ánimo ha sido -> " + niveles_animo(preferences.getInt("nivel_animo_6", 0)) + " y ha tenido molestias de: " + efectos.getString("efecto_animo_6", "") + "\n" +
                    "Día 7: Tu estado de ánimo ha sido -> " + niveles_animo(preferences.getInt("nivel_animo_7", 0)) + " y ha tenido molestias de: " + efectos.getString("efecto_animo_7", "") + "\n" +
                    "Día 8: Tu estado de ánimo ha sido -> " + niveles_animo(preferences.getInt("nivel_animo_8", 0)) + " y ha tenido molestias de: " + efectos.getString("efecto_animo_8", "") + "\n" +
                    "Día 9: Tu estado de ánimo ha sido -> " + niveles_animo(preferences.getInt("nivel_animo_9", 0)) + " y ha tenido molestias de: " + efectos.getString("efecto_animo_9", "") + "\n" +
                    "Día 10: Tu estado de ánimo ha sido -> " + niveles_animo(preferences.getInt("nivel_animo_10", 0)) + " y ha tenido molestias de: " + efectos.getString("efecto_animo_10", "") + "\n" +
                    "Día 11: Tu estado de ánimo ha sido -> " + niveles_animo(preferences.getInt("nivel_animo_11", 0)) + " y ha tenido molestias de: " + efectos.getString("efecto_animo_11", "") + "\n" +
                    "Día 12: Tu estado de ánimo ha sido -> " + niveles_animo(preferences.getInt("nivel_animo_12", 0)) + " y ha tenido molestias de: " + efectos.getString("efecto_animo_12", "") + "\n" +
                    "Día 13: Tu estado de ánimo ha sido -> " + niveles_animo(preferences.getInt("nivel_animo_13", 0)) + " y ha tenido molestias de: " + efectos.getString("efecto_animo_13", "") + "\n" +
                    "Día 14: Tu estado de ánimo ha sido -> " + niveles_animo(preferences.getInt("nivel_animo_14", 0)) + " y ha tenido molestias de: " + efectos.getString("efecto_animo_14", "") + "\n" +
                    "Día 15: Tu estado de ánimo ha sido -> " + niveles_animo(preferences.getInt("nivel_animo_15", 0)) + " y ha tenido molestias de: " + efectos.getString("efecto_animo_15", "") + "\n" +
                    "Día 16: Tu estado de ánimo ha sido -> " + niveles_animo(preferences.getInt("nivel_animo_16", 0)) + " y ha tenido molestias de: " + efectos.getString("efecto_animo_16", "") + "\n" +
                    "Día 17: Tu estado de ánimo ha sido -> " + niveles_animo(preferences.getInt("nivel_animo_17", 0)) + " y ha tenido molestias de: " + efectos.getString("efecto_animo_17", "") + "\n" +
                    "Día 18: Tu estado de ánimo ha sido -> " + niveles_animo(preferences.getInt("nivel_animo_18", 0)) + " y ha tenido molestias de: " + efectos.getString("efecto_animo_18", "") + "\n" +
                    "Día 19: Tu estado de ánimo ha sido -> " + niveles_animo(preferences.getInt("nivel_animo_19", 0)) + " y ha tenido molestias de: " + efectos.getString("efecto_animo_19", "") + "\n" +
                    "Día 20: Tu estado de ánimo ha sido -> " + niveles_animo(preferences.getInt("nivel_animo_20", 0)) + " y ha tenido molestias de: " + efectos.getString("efecto_animo_20", "") + "\n" +
                    "Día 21: Tu estado de ánimo ha sido -> " + niveles_animo(preferences.getInt("nivel_animo_21", 0)) + " y ha tenido molestias de: " + efectos.getString("efecto_animo_21", "") + "\n" +
                    "Día 22: Tu estado de ánimo ha sido -> " + niveles_animo(preferences.getInt("nivel_animo_22", 0)) + " y ha tenido molestias de: " + efectos.getString("efecto_animo_22", "") + "\n" +
                    "Día 23: Tu estado de ánimo ha sido -> " + niveles_animo(preferences.getInt("nivel_animo_23", 0)) + " y ha tenido molestias de: " + efectos.getString("efecto_animo_23", "") + "\n" +
                    "Día 24: Tu estado de ánimo ha sido -> " + niveles_animo(preferences.getInt("nivel_animo_24", 0)) + " y ha tenido molestias de: " + efectos.getString("efecto_animo_24", "") + "\n" +
                    "Día 25: Tu estado de ánimo ha sido -> " + niveles_animo(preferences.getInt("nivel_animo_25", 0)) + " y ha tenido molestias de: " + efectos.getString("efecto_animo_25", "") + "\n" +
                    "Día 26: Tu estado de ánimo ha sido -> " + niveles_animo(preferences.getInt("nivel_animo_26", 0)) + " y ha tenido molestias de: " + efectos.getString("efecto_animo_26", "") + "\n" +
                    "Día 27: Tu estado de ánimo ha sido -> " + niveles_animo(preferences.getInt("nivel_animo_27", 0)) + " y ha tenido molestias de: " + efectos.getString("efecto_animo_27", "") + "\n" +
                    "Día 28: Tu estado de ánimo ha sido -> " + niveles_animo(preferences.getInt("nivel_animo_28", 0)) + " y ha tenido molestias de: " + efectos.getString("efecto_animo_28", "");
        }


                Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");

        session = Session.getDefaultInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("pillplanusuarias@gmail.com", "Pillplan0327..");
            }
        });

        pdialog = ProgressDialog.show(context, "", "Sending Mail...", true);

        RetreiveFeedTask task = new RetreiveFeedTask();
        task.execute();

        /*Intent x = new Intent(this, MainActivity.class);
        startActivity(x);
        finish();*/
    }

    private String niveles_animo(int nivel_animo) {
        switch (nivel_animo) {
            case 1:
                return "Terrible";

            case 2:
                return "Mal";

            case 3:
                return "Bien";

            case 4:
                return "Muy Bien";

            case 5:
                return "Genial";
            default:
                return "";
        }
    }

    class RetreiveFeedTask extends AsyncTask<String, Void, String> {

        @Override
        protected String doInBackground(String... params) {

            try{
                Message message = new MimeMessage(session);
                message.setFrom(new InternetAddress("testfrom354@gmail.com"));
                message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(rec));
                message.setSubject(subject);
                message.setContent(textMessage, "text/html; charset=utf-8");
                Transport.send(message);
            } catch(Exception e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(String result) {
            pdialog.dismiss();
          /*  reciep.setText("");
            msg.setText("");
            sub.setText("");*/
            Toast.makeText(getApplicationContext(), "Message sent", Toast.LENGTH_LONG).show();
            Intent z = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(z);
            finish();
        }
    }
}