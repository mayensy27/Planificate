package cat.urv.deim.asm.p2.planificate.ui.informate;

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

public class InformateFragment extends Fragment {


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_informate, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button boton_espanol = view.findViewById(R.id.boton_espanol);
        Button boton_catalan = view.findViewById(R.id.boton_catalan);
        Button boton_ingles = view.findViewById(R.id.boton_ingles);


        boton_espanol.setOnClickListener(v -> {
                    Intent x = new Intent(InformateFragment.this.getContext(), InfCastActivity.class);
                    InformateFragment.this.startActivity(x);
                }
        );


        boton_catalan.setOnClickListener(v -> {
                    Intent x = new Intent(getContext(), InfCatActivity.class);
                    startActivity(x);
                }
        );


        boton_ingles.setOnClickListener(v -> {
                    Intent x = new Intent(getContext(), InfInglesActivity.class);
                    startActivity(x);
                }
        );
    }
}