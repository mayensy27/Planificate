package cat.urv.deim.asm.p2.planificate.ui.calendario;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

import cat.urv.deim.asm.p2.planificate.R;

public class GenialActivity extends AppCompatActivity {
    TextView dia_animo, estado_animo, efecto_animo;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genial);

        //Recepcion del dia
        dia_animo = findViewById(R.id.dia_animo);
        estado_animo = findViewById(R.id.estado_animo);
        efecto_animo = findViewById(R.id.efecto);

        Bundle dia = this.getIntent().getExtras();
        Bundle estado = this.getIntent().getExtras();


        if (dia != null && estado != null) {
            SharedPreferences efectos = getSharedPreferences("efectos", Context.MODE_PRIVATE);


            String x = dia.getString("dia");
            dia_animo.setText(x);
            String x2 = dia.getString("estado");
            estado_animo.setText(x2);

            if (Objects.requireNonNull(x).equals("1")) {
                String x3 = efectos.getString("efecto_animo_1", "");
                efecto_animo.setText(" Además, has tenido:\n\n " + "     " + x3);
            }
            if (Objects.requireNonNull(x).equals("2")) {
                String x3 = efectos.getString("efecto_animo_2", "");
                efecto_animo.setText(" Además, has tenido:\n\n " + "     " + x3);
            }
            if (Objects.requireNonNull(x).equals("3")) {
                String x3 = efectos.getString("efecto_animo_3", "");
                efecto_animo.setText(" Además, has tenido:\n\n " + "     " + x3);
            }
            if (Objects.requireNonNull(x).equals("4")) {
                String x3 = efectos.getString("efecto_animo_4", "");
                efecto_animo.setText(" Además, has tenido:\n\n " + "     " + x3);
            }
            if (Objects.requireNonNull(x).equals("5")) {
                String x3 = efectos.getString("efecto_animo_5", "");
                efecto_animo.setText(" Además, has tenido:\n\n " + "     " + x3);
            }
            if (Objects.requireNonNull(x).equals("6")) {
                String x3 = efectos.getString("efecto_animo_6", "");
                efecto_animo.setText(" Además, has tenido:\n\n " + "     " + x3);
            }
            if (Objects.requireNonNull(x).equals("7")) {
                String x3 = efectos.getString("efecto_animo_7", "");
                efecto_animo.setText(" Además, has tenido:\n\n " + "     " + x3);
            }
            if (Objects.requireNonNull(x).equals("8")) {
                String x3 = efectos.getString("efecto_animo_8", "");
                efecto_animo.setText(" Además, has tenido:\n\n " + "     " + x3);
            }
            if (Objects.requireNonNull(x).equals("9")) {
                String x3 = efectos.getString("efecto_animo_9", "");
                efecto_animo.setText(" Además, has tenido:\n\n " + "     " + x3);
            }
            if (Objects.requireNonNull(x).equals("10")) {
                String x3 = efectos.getString("efecto_animo_10", "");
                efecto_animo.setText(" Además, has tenido:\n\n " + "     " + x3);
            }
            if (Objects.requireNonNull(x).equals("11")) {
                String x3 = efectos.getString("efecto_animo_11", "");
                efecto_animo.setText(" Además, has tenido:\n\n " + "     " + x3);
            }
            if (Objects.requireNonNull(x).equals("12")) {
                String x3 = efectos.getString("efecto_animo_12", "");
                efecto_animo.setText(" Además, has tenido:\n\n " + "     " + x3);
            }
            if (Objects.requireNonNull(x).equals("13")) {
                String x3 = efectos.getString("efecto_animo_13", "");
                efecto_animo.setText(" Además, has tenido:\n\n " + "     " + x3);
            }
            if (Objects.requireNonNull(x).equals("14")) {
                String x3 = efectos.getString("efecto_animo_14", "");
                efecto_animo.setText(" Además, has tenido:\n\n " + "     " + x3);
            }
            if (Objects.requireNonNull(x).equals("15")) {
                String x3 = efectos.getString("efecto_animo_15", "");
                efecto_animo.setText(" Además, has tenido:\n\n " + "     " + x3);
            }
            if (Objects.requireNonNull(x).equals("16")) {
                String x3 = efectos.getString("efecto_animo_16", "");
                efecto_animo.setText(" Además, has tenido:\n\n " + "     " + x3);
            }
            if (Objects.requireNonNull(x).equals("17")) {
                String x3 = efectos.getString("efecto_animo_17", "");
                efecto_animo.setText(" Además, has tenido:\n\n " + "     " + x3);
            }
            if (Objects.requireNonNull(x).equals("18")) {
                String x3 = efectos.getString("efecto_animo_18", "");
                efecto_animo.setText(" Además, has tenido:\n\n " + "     " + x3);
            }
            if (Objects.requireNonNull(x).equals("19")) {
                String x3 = efectos.getString("efecto_animo_19", "");
                efecto_animo.setText(" Además, has tenido:\n\n " + "     " + x3);
            }
            if (Objects.requireNonNull(x).equals("20")) {
                String x3 = efectos.getString("efecto_animo_20", "");
                efecto_animo.setText(" Además, has tenido:\n\n " + "     " + x3);
            }
            if (Objects.requireNonNull(x).equals("21")) {
                String x3 = efectos.getString("efecto_animo_21", "");
                efecto_animo.setText(" Además, has tenido:\n\n " + "     " + x3);
            }
            if (Objects.requireNonNull(x).equals("22")) {
                String x3 = efectos.getString("efecto_animo_22", "");
                efecto_animo.setText(" Además, has tenido:\n\n " + "     " + x3);
            }
            if (Objects.requireNonNull(x).equals("23")) {
                String x3 = efectos.getString("efecto_animo_23", "");
                efecto_animo.setText(" Además, has tenido:\n\n " + "     " + x3);
            }
            if (Objects.requireNonNull(x).equals("24")) {
                String x3 = efectos.getString("efecto_animo_24", "");
                efecto_animo.setText(" Además, has tenido:\n\n " + "     " + x3);
            }
            if (Objects.requireNonNull(x).equals("25")) {
                String x3 = efectos.getString("efecto_animo_25", "");
                efecto_animo.setText(" Además, has tenido:\n\n " + "     " + x3);
            }
            if (Objects.requireNonNull(x).equals("26")) {
                String x3 = efectos.getString("efecto_animo_26", "");
                efecto_animo.setText(" Además, has tenido:\n\n " + "     " + x3);
            }
            if (Objects.requireNonNull(x).equals("27")) {
                String x3 = efectos.getString("efecto_animo_27", "");
                efecto_animo.setText(" Además, has tenido:\n\n " + "     " + x3);
            }
            if (Objects.requireNonNull(x).equals("28")) {
                String x3 = efectos.getString("efecto_animo_28", "");
                efecto_animo.setText(" Además, has tenido:\n\n " + "     " + x3);
            }
        }
    }
}
