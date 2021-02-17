package cat.urv.deim.asm.p2.planificate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
//        SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);
//        primeraVez = preferences.getBoolean("bool", true); // por defecto es true

        if (!InformacionGlobal.getVisto()) {
//            SharedPreferences.Editor objEditor = preferences.edit();
//            objEditor.putBoolean("bool", false); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
//            objEditor.apply();

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                    Intent intent = new Intent(SplashActivity.this, InformacionActivity.class);
                    startActivity(intent);
                    finish();

                }
            }, 2000);
        } else {

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                    Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();

                }


            }, 2000);


        }
    }

}