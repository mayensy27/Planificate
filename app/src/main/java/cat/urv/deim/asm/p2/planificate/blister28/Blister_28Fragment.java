package cat.urv.deim.asm.p2.planificate.blister28;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import cat.urv.deim.asm.p2.planificate.MainActivity;
import cat.urv.deim.asm.p2.planificate.Popup2;
import cat.urv.deim.asm.p2.planificate.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Blister_28Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Blister_28Fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Blister_28Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Blister_1Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Blister_28Fragment newInstance(String param1, String param2) {
        Blister_28Fragment fragment = new Blister_28Fragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
        SharedPreferences preferences= this.requireActivity().getSharedPreferences("datos", Context.MODE_PRIVATE);
        SharedPreferences.Editor objEditor = preferences.edit();
        objEditor.putBoolean("primeravez_blister28", false); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
        objEditor.apply();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blister_28, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        SharedPreferences preferences= this.requireActivity().getSharedPreferences("datos", Context.MODE_PRIVATE);
        SharedPreferences.Editor objEditor = preferences.edit();
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


       // Navigation.findNavController(view).navigate(R.id.nav_home);
        Intent i = new Intent(getContext(), MainActivity.class);
        startActivity(i);
        Intent i2 = new Intent(getContext(), Popup2.class);
        startActivity(i2);

        /*ImageButton blister28= view.findViewById(R.id.boton_blister28);

        blister28.setOnClickListener(v -> {

            Intent i = new Intent(getContext(), Popup2.class);
            startActivity(i);
                    Navigation.findNavController(v).navigate(R.id.nav_home);
                }
        );*/
    }
}
