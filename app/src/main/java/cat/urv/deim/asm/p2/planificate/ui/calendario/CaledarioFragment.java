package cat.urv.deim.asm.p2.planificate.ui.calendario;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.material.datepicker.MaterialDatePicker;

import java.util.Calendar;

import cat.urv.deim.asm.p2.planificate.R;

public class CaledarioFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_calendario, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button abrir_calendario = view.findViewById(R.id.boton_calendario);

        long today =MaterialDatePicker.todayInUtcMilliseconds();

        MaterialDatePicker.Builder builder=MaterialDatePicker.Builder.datePicker();  //seleccionar
        builder.setTitleText("SELECCIONA UNA FECHA");
        final  MaterialDatePicker materialDatePicker=builder.build();

        abrir_calendario.setOnClickListener(v -> {

        materialDatePicker.show(requireActivity().getSupportFragmentManager(),"DATE_PICKER");

        });

        materialDatePicker.addOnPositiveButtonClickListener(selection -> {

            Calendar calendario= Calendar.getInstance();
            int ano=calendario.get(Calendar.YEAR);
            int mes=calendario.get(Calendar.MONTH);
            int dia=calendario.get(Calendar.DAY_OF_MONTH);
            String fecha = ano + "-" + (mes + 1) + "-" + dia;

            SharedPreferences preferences = requireActivity().getSharedPreferences("datos", Context.MODE_PRIVATE);


            //TOMA PRIMER DIA DE LA PILDORA
            if (fecha.equals(preferences.getString("tomaBlister_1", "")) && !preferences.getBoolean("primeravez_blister1", true) && preferences.getInt("dia_1", 0) == 1) {
                //  retorno_texto_calendario.setText(preferences.getString("tomaBlister21_1", ""));
                            /*retorno_texto_calendario.setText("Te has tomado la píldora: dia 1\n" + "El estado de ánimo" +
                                    "ha sido: " + preferences.getInt("nivel_animo_1", 0));
*/                      builder.setSelection(today);
                niveles_animo(preferences.getInt("nivel_animo_1", 0),"1");
            }
       });
    }


    public void niveles_animo (int nivel_animo,String dia_animo){

        Bundle extras= new Bundle();
        extras.putString("dia",dia_animo);
        extras.putString("estado","");


        switch(nivel_animo)
        {
            case 1:
                extras.putString("estado","¡ Me siento TERRIBLE !");
                Intent i1= new Intent(getContext(),TerribleActivity.class);
                i1.putExtras(extras);
                startActivity(i1);

                break;

            case 2:
                extras.putString("estado","¡ Me siento MAL !");
                Intent i2= new Intent(getContext(),MalActivity.class);
                i2.putExtras(extras);
                startActivity(i2);

                break;

            case 3:
                extras.putString("estado","¡ Me siento BIEN !");
                Intent i3= new Intent(getContext(),BienActivity.class);
                i3.putExtras(extras);
                startActivity(i3);

                break;

            case 4:
                extras.putString("estado","¡ Me siento MUY BIEN !");
                Intent i4= new Intent(getContext(),MuyBienActivity.class);
                i4.putExtras(extras);
                startActivity(i4);

                break;

            case 5:
                extras.putString("estado","¡ Me siento GENIAL !");
                Intent i5= new Intent(getContext(),GenialActivity.class);
                i5.putExtras(extras);
                startActivity(i5);

                break;

        }

    }


}