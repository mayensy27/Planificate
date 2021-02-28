package cat.urv.deim.asm.p2.planificate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

public class TimePickerDialog extends AppCompatActivity implements android.app.TimePickerDialog.OnTimeSetListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker_dialog);

        Button boton_hora = (Button) findViewById(R.id.boton_hora);
        boton_hora.setOnClickListener(v -> {
            DialogFragment timePicker = new TimePickerFragment();
            timePicker.show(getSupportFragmentManager(),"time picker");
        });
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        TextView textView=(TextView)findViewById(R.id.establecer_alarma);
        textView.setText("Hour: "+ hourOfDay+ "Minute: "+minute);
    }
}