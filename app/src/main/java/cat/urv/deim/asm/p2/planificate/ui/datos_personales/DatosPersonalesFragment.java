package cat.urv.deim.asm.p2.planificate.ui.datos_personales;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import cat.urv.deim.asm.p2.planificate.R;
import cat.urv.deim.asm.p2.planificate.SplashActivity;

public class DatosPersonalesFragment extends Fragment {

    RequestQueue request;
    StringRequest stringRequest;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_datos_personales, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button ver_datos = view.findViewById(R.id.vermisdatos);
        Button actualizar_datos = view.findViewById(R.id.actualizarmisdatos);
        Button borrar_datos = view.findViewById(R.id.borrarmisdatos);

        request = Volley.newRequestQueue(requireContext());


        ver_datos.setOnClickListener(v -> {
            Intent i = new Intent(getContext(), DatosPersonalesUsuariaActivity.class);
            startActivity(i);
        });

        actualizar_datos.setOnClickListener(v -> {
            Intent i2 = new Intent(getContext(), ActualizarDatosPersonalesActivity.class);
            startActivity(i2);
        });

        borrar_datos.setOnClickListener(v -> {

            SharedPreferences preferences = requireActivity().getSharedPreferences("datos", Context.MODE_PRIVATE);

            String url = "https://pillplanusuarias.000webhostapp.com/eliminarUsuaria.php?email=" + preferences.getString("email_usuaria", "");
            stringRequest = new StringRequest(Request.Method.GET, url, response -> {
                Log.d("URL: ", "" + url);
                Log.d("RESPUESTA: ", "" + response);

                Toast.makeText(getContext(), "Se ha Eliminado con exito", Toast.LENGTH_SHORT).show();


            }, error -> Toast.makeText(getContext(), "No se ha podido conectar", Toast.LENGTH_SHORT).show());
            request.add(stringRequest);

            SharedPreferences.Editor objEditor = preferences.edit();

            objEditor.putBoolean("primeravez", true); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putBoolean("registrada", true); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putBoolean("signup_google", true);
            objEditor.apply();
            objEditor.putString("edad_usuaria", ""); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putString("email_usuaria", ""); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();

            //INICIALIZACION DE LAS VARIABLES TOMAS/CALENDARIO

            objEditor.putBoolean("primeravez_blister1", true); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putBoolean("primeravez_blister2", true); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putBoolean("primeravez_blister3", true); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putBoolean("primeravez_blister4", true); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putBoolean("primeravez_blister5", true); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putBoolean("primeravez_blister6", true); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putBoolean("primeravez_blister7", true); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putBoolean("primeravez_blister8", true); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putBoolean("primeravez_blister9", true); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putBoolean("primeravez_blister10", true); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putBoolean("primeravez_blister11", true); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putBoolean("primeravez_blister12", true); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putBoolean("primeravez_blister13", true); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putBoolean("primeravez_blister14", true); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putBoolean("primeravez_blister15", true); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putBoolean("primeravez_blister16", true); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putBoolean("primeravez_blister17", true); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putBoolean("primeravez_blister18", true); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putBoolean("primeravez_blister19", true); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putBoolean("primeravez_blister20", true); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putBoolean("primeravez_blister21", true); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putBoolean("primeravez21_blister21", true); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putBoolean("primeravez_blister22", true); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putBoolean("primeravez_blister23", true); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putBoolean("primeravez_blister24", true); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putBoolean("primeravez_blister25", true); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putBoolean("primeravez_blister26", true); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putBoolean("primeravez_blister27", true); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putBoolean("primeravez_blister28", true); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();

            objEditor.putString("tomaBlister_1", ""); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putInt("dia_1", 0); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();

            objEditor.putString("tomaBlister_2", ""); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putInt("dia_2", 0); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();

            objEditor.putString("tomaBlister_3", ""); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putInt("dia_3", 0); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();

            objEditor.putString("tomaBlister_4", ""); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putInt("dia_4", 0); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();

            objEditor.putString("tomaBlister_5", ""); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putInt("dia_5", 0); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();

            objEditor.putString("tomaBlister_6", ""); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putInt("dia_6", 0); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();

            objEditor.putString("tomaBlister_7", ""); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putInt("dia_7", 0); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();

            objEditor.putString("tomaBlister_8", ""); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putInt("dia_8", 0); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();

            objEditor.putString("tomaBlister_9", ""); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putInt("dia_9", 0); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();

            objEditor.putString("tomaBlister_10", ""); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putInt("dia_10", 0); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();

            objEditor.putString("tomaBlister_11", ""); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putInt("dia_11", 0); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();

            objEditor.putString("tomaBlister_12", ""); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putInt("dia_12", 0); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();

            objEditor.putString("tomaBlister_13", ""); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putInt("dia_13", 0); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();

            objEditor.putString("tomaBlister_14", ""); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putInt("dia_14", 0); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();

            objEditor.putString("tomaBlister_15", ""); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putInt("dia_15", 0); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();

            objEditor.putString("tomaBlister_16", ""); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putInt("dia_16", 0); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();

            objEditor.putString("tomaBlister_17", ""); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putInt("dia_17", 0); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();

            objEditor.putString("tomaBlister_18", ""); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putInt("dia_18", 0); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();


            objEditor.putString("tomaBlister_19", ""); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putInt("dia_19", 0); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();

            objEditor.putString("tomaBlister_20", ""); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putInt("dia_20", 0); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putString("tomaBlister_21", ""); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putInt("dia_21", 0); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();

            objEditor.putString("tomaBlister_22", ""); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putInt("dia_22", 0); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();

            objEditor.putString("tomaBlister_23", ""); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putInt("dia_23", 0); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();

            objEditor.putString("tomaBlister_24", ""); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putInt("dia_24", 0); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();

            objEditor.putString("tomaBlister_25", ""); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putInt("dia_25", 0); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();

            objEditor.putString("tomaBlister_26", ""); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putInt("dia_26", 0); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();

            objEditor.putString("tomaBlister_27", ""); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putInt("dia_27", 0); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putString("tomaBlister_28", ""); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();
            objEditor.putInt("dia_28", 0); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();

            objEditor.putInt("nivel_animo_1", 0);
            objEditor.apply();
            objEditor.putInt("nivel_animo_2", 0);
            objEditor.apply();
            objEditor.putInt("nivel_animo_3", 0);
            objEditor.apply();
            objEditor.putInt("nivel_animo_4", 0);
            objEditor.apply();
            objEditor.putInt("nivel_animo_5", 0);
            objEditor.apply();
            objEditor.putInt("nivel_animo_6", 0);
            objEditor.apply();
            objEditor.putInt("nivel_animo_7", 0);
            objEditor.apply();
            objEditor.putInt("nivel_animo_8", 0);
            objEditor.apply();
            objEditor.putInt("nivel_animo_9", 0);
            objEditor.apply();
            objEditor.putInt("nivel_animo_10", 0);
            objEditor.apply();
            objEditor.putInt("nivel_animo_11", 0);
            objEditor.apply();
            objEditor.putInt("nivel_animo_12", 0);
            objEditor.apply();
            objEditor.putInt("nivel_animo_13", 0);
            objEditor.apply();
            objEditor.putInt("nivel_animo_14", 0);
            objEditor.apply();
            objEditor.putInt("nivel_animo_15", 0);
            objEditor.apply();
            objEditor.putInt("nivel_animo_16", 0);
            objEditor.apply();
            objEditor.putInt("nivel_animo_17", 0);
            objEditor.apply();
            objEditor.putInt("nivel_animo_18", 0);
            objEditor.apply();
            objEditor.putInt("nivel_animo_19", 0);
            objEditor.apply();
            objEditor.putInt("nivel_animo_20", 0);
            objEditor.apply();
            objEditor.putInt("nivel_animo_21", 0);
            objEditor.apply();
            objEditor.putInt("nivel_animo_22", 0);
            objEditor.apply();
            objEditor.putInt("nivel_animo_23", 0);
            objEditor.apply();
            objEditor.putInt("nivel_animo_24", 0);
            objEditor.apply();
            objEditor.putInt("nivel_animo_25", 0);
            objEditor.apply();
            objEditor.putInt("nivel_animo_26", 0);
            objEditor.apply();
            objEditor.putInt("nivel_animo_27", 0);
            objEditor.apply();
            objEditor.putInt("nivel_animo_28", 0);
            objEditor.apply();

            objEditor.putString("efecto_animo_1", "");
            objEditor.apply();
            objEditor.putString("efecto_animo_2", "");
            objEditor.apply();
            objEditor.putString("efecto_animo_3", "");
            objEditor.apply();
            objEditor.putString("efecto_animo_4", "");
            objEditor.apply();
            objEditor.putString("efecto_animo_5", "");
            objEditor.apply();
            objEditor.putString("efecto_animo_6", "");
            objEditor.apply();
            objEditor.putString("efecto_animo_7", "");
            objEditor.apply();
            objEditor.putString("efecto_animo_8", "");
            objEditor.apply();
            objEditor.putString("efecto_animo_9", "");
            objEditor.apply();
            objEditor.putString("efecto_animo_10", "");
            objEditor.apply();
            objEditor.putString("efecto_animo_11", "");
            objEditor.apply();
            objEditor.putString("efecto_animo_12", "");
            objEditor.apply();
            objEditor.putString("efecto_animo_13", "");
            objEditor.apply();
            objEditor.putString("efecto_animo_14", "");
            objEditor.apply();
            objEditor.putString("efecto_animo_15", "");
            objEditor.apply();
            objEditor.putString("efecto_animo_16", "");
            objEditor.apply();
            objEditor.putString("efecto_animo_17", "");
            objEditor.apply();
            objEditor.putString("efecto_animo_18", "");
            objEditor.apply();
            objEditor.putString("efecto_animo_19", "");
            objEditor.apply();
            objEditor.putString("efecto_animo_20", "");
            objEditor.apply();
            objEditor.putString("efecto_animo_21", "");
            objEditor.apply();
            objEditor.putString("efecto_animo_22", "");
            objEditor.apply();
            objEditor.putString("efecto_animo_23", "");
            objEditor.apply();
            objEditor.putString("efecto_animo_24", "");
            objEditor.apply();
            objEditor.putString("efecto_animo_25", "");
            objEditor.apply();
            objEditor.putString("efecto_animo_26", "");
            objEditor.apply();
            objEditor.putString("efecto_animo_27", "");
            objEditor.apply();
            objEditor.putString("efecto_animo_28", "");
            objEditor.apply();

            objEditor.putBoolean("final", true); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();

            objEditor.putBoolean("mail_28", true);
            objEditor.apply();

            objEditor.putBoolean("mail_21", true);
            objEditor.apply();

            objEditor.putBoolean("notif3", false); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
            objEditor.apply();

            objEditor.putString("olvidos", "");
            objEditor.apply();

            objEditor.putString("registro_estado","");
            objEditor.apply();

            Intent i = new Intent(requireContext().getApplicationContext(), SplashActivity.class);
            startActivity(i);


        });

    }

}