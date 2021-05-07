package cat.urv.deim.asm.p2.planificate;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import cat.urv.deim.asm.p2.planificate.ui.datos_personales.LoginUsuariaActivity;

public class SplashActivity extends AppCompatActivity {
    Boolean primeraVez;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
       SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);
       primeraVez = preferences.getBoolean("primeravez", true); // por defecto es true

        if (primeraVez) {
         /*   SharedPreferences.Editor objEditor = preferences.edit();
            objEditor.putBoolean("bool", false); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();*/

            new Handler().postDelayed(() -> {

                Intent intent = new Intent(SplashActivity.this, InformacionActivity.class);
                startActivity(intent);
                finish();

            }, 2000);
        } else {

            new Handler().postDelayed(() -> {

                if(!preferences.getBoolean("registrada", true)){
                    Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }else{
                    Intent intent = new Intent(SplashActivity.this, InformacionActivity.class);
                    startActivity(intent);
                    finish();
                }

            }, 2000);


        }
    }

}