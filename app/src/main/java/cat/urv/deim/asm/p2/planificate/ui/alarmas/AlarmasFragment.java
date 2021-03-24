package cat.urv.deim.asm.p2.planificate.ui.alarmas;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import cat.urv.deim.asm.p2.planificate.R;
import cat.urv.deim.asm.p2.planificate.TimePickerDialog;

public class AlarmasFragment extends Fragment {

   // private AlarmasViewModel slideshowViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        Intent i = new Intent(getContext(), TimePickerDialog.class);
        startActivity(i);

        return inflater.inflate(R.layout.fragment_alarmas, container, false);
    }
}