package cat.urv.deim.asm.p2.planificate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class PrimeraPreguntaActivity extends AppCompatActivity {

    RadioButton r1,r2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primera_pregunta);

        r1= findViewById(R.id.decision_propia); //Referenciar
        r2= findViewById(R.id.recomendacion_sanitaria);

//        this.getWindow().setNavigationBarColor(Color.parseColor("#B48ABC"));
//        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR);
      //  hideNavigationBar();
    }

    public void onclick(View view) {

        SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);
        SharedPreferences.Editor objEditor = preferences.edit();

        if(r1.isChecked()){

            objEditor.putBoolean("bool", false); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();

                 Intent miIntent2= new Intent(PrimeraPreguntaActivity.this,
                    SegudaPreguntaActivity.class);
            startActivity(miIntent2);
            Intent miIntent= new Intent(PrimeraPreguntaActivity.this,
                    WebDecisionesCompartidas.class);
            startActivity(miIntent);

                   }

        if(r2.isChecked()){

            objEditor.putBoolean("bool", false); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();

            Intent miIntent= new Intent(PrimeraPreguntaActivity.this,
                    SegudaPreguntaActivity.class);
            startActivity(miIntent);


        }
//
    }

//  public void hideNavigationBar(){
//
//        this.getWindow().getDecorView().setSystemUiVisibility(
//               View.SYSTEM_UI_FLAG_FULLSCREEN|
//                        View.SYSTEM_UI_FLAG_HIDE_NAVIGATION|
//                        View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY|
//                        View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION|
//                        View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN|
//                        View.SYSTEM_UI_FLAG_LAYOUT_STABLE
//        );
//    }
//    @Override
//    public void onWindowFocusChanged(boolean hasFocus) {
//        super.onWindowFocusChanged(hasFocus);
//        if (hasFocus) {
//            hideNavigationBar();
//        }
//    }

}