package cat.urv.deim.asm.p2.planificate.ui.calendario;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import cat.urv.deim.asm.p2.planificate.R;

public class CaledarioFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_calendario, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {



        Button abrir_calendario= view.findViewById(R.id.boton_calendario);
        abrir_calendario.setOnClickListener(v -> {

            Intent i= new Intent(getContext(),CalendarioActivity.class);
            startActivity(i);
        });

        Button ver_estados_molestias= view.findViewById(R.id.boton_calendario2);
        ver_estados_molestias.setOnClickListener(v -> {

            Intent i= new Intent(getContext(),VerEstadosActivity.class);
            startActivity(i);
        });

        Button dias_olvidos= view.findViewById(R.id.boton_calendario3);
        dias_olvidos.setOnClickListener(v -> {
                       Intent i= new Intent(getContext(),CalendarioActivity.class);
            startActivity(i);
        });

    }

}