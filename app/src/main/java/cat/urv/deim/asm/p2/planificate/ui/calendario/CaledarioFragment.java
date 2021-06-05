package cat.urv.deim.asm.p2.planificate.ui.calendario;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import cat.urv.deim.asm.p2.planificate.R;

public class CaledarioFragment extends Fragment {
    Spinner spinner;

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




        ////////////

        spinner = view.findViewById(R.id.estados);
        SharedPreferences preferences = requireActivity().getSharedPreferences("datos", Context.MODE_PRIVATE);

        //Desplegable comprimidos
        ArrayAdapter<CharSequence> adapter_estados = ArrayAdapter.createFromResource(requireContext(),
                R.array.desplegable_estados, R.layout.spinner_item); // //opciones_comprimidos
        spinner.setAdapter(adapter_estados);

        SharedPreferences.Editor estados = preferences.edit();
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                estados.putString("registro_estado", parent.getItemAtPosition(position).toString());
                estados.apply();
                if(!preferences.getString("registro_estado","").equals("-")){
                    Intent intent = new Intent(getActivity(), VerEstadosActivity.class);
                    startActivity(intent);
                }



            }  @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
       /* Button ver_estados_molestias= view.findViewById(R.id.boton_calendario2);
        ver_estados_molestias.setOnClickListener(v -> {

            Intent i= new Intent(getContext(),VerEstadosActivity.class);
            startActivity(i);
        });*/


        /////////////////



        Button dias_olvidos= view.findViewById(R.id.boton_calendario3);
        dias_olvidos.setOnClickListener(v -> {
                       Intent i= new Intent(getContext(),OlvidosActivity.class);
            startActivity(i);
        });

    }

}