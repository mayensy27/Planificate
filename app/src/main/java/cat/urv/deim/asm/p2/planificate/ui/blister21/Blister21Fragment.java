package cat.urv.deim.asm.p2.planificate.ui.blister21;

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

import cat.urv.deim.asm.p2.planificate.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Blister21Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Blister21Fragment extends Fragment {
    Boolean primeraVez;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Blister21Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Blister21Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Blister21Fragment newInstance(String param1, String param2) {
        Blister21Fragment fragment = new Blister21Fragment();
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
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blister21, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button blister=view.findViewById(R.id.boton_blister);
        SharedPreferences preferences= requireActivity().getSharedPreferences("datos", Context.MODE_PRIVATE);

if(!preferences.getBoolean("final", true)){
           //INICIALIZACION DE LAS VARIABLES

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
    objEditor.putInt("dia_25", 0); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
    objEditor.apply();

    objEditor.putString("tomaBlister_27", ""); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
    objEditor.apply();
    objEditor.putInt("dia_27", 0); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
    objEditor.apply();
    objEditor.putString("tomaBlister_28", ""); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
    objEditor.apply();
    objEditor.putInt("dia_28", 0); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
    objEditor.apply();
}
        blister.setOnClickListener(v -> {

                    primeraVez = preferences.getBoolean("primeravez_blister1", true); // por defecto es true

                    if (primeraVez) {

                        Intent x = new Intent(getContext(), Blister21Activity.class);
                        startActivity(x);

                    }
                    else {
                        primeraVez = preferences.getBoolean("primeravez_blister2", true); // por defecto es true
                        if (primeraVez) {
                            Intent x = new Intent(getContext(), Blister21Activity1.class);
                            startActivity(x);
                        } else {
                            primeraVez = preferences.getBoolean("primeravez_blister3", true); // por defecto es true
                            if (primeraVez) {
                                Intent x = new Intent(getContext(), Blister21Activity2.class);
                                startActivity(x);
                            }
                            else {
                                primeraVez = preferences.getBoolean("primeravez_blister4", true); // por defecto es true
                                if (primeraVez) {
                                    Intent x = new Intent(getContext(), Blister21Activity3.class);
                                    startActivity(x);
                                } else {
                                    primeraVez = preferences.getBoolean("primeravez_blister5", true); // por defecto es true
                                    if (primeraVez) {
                                        Intent x = new Intent(getContext(), Blister21Activity4.class);
                                        startActivity(x);
                                    } else {
                                        primeraVez = preferences.getBoolean("primeravez_blister6", true); // por defecto es true
                                        if (primeraVez) {
                                            Intent x = new Intent(getContext(), Blister21Activity5.class);
                                            startActivity(x);
                                        } else {
                                            primeraVez = preferences.getBoolean("primeravez_blister7", true); // por defecto es true
                                            if (primeraVez) {
                                                Intent x = new Intent(getContext(), Blister21Activity6.class);
                                                startActivity(x);
                                            } else {
                                                primeraVez = preferences.getBoolean("primeravez_blister8", true); // por defecto es true
                                                if (primeraVez) {
                                                    Intent x = new Intent(getContext(), Blister21Activity7.class);
                                                    startActivity(x);
                                                } else {
                                                    primeraVez = preferences.getBoolean("primeravez_blister9", true); // por defecto es true
                                                    if (primeraVez) {
                                                        Intent x = new Intent(getContext(), Blister21Activity8.class);
                                                        startActivity(x);
                                                    } else {
                                                        primeraVez = preferences.getBoolean("primeravez_blister10", true); // por defecto es true
                                                        if (primeraVez) {
                                                            Intent x = new Intent(getContext(), Blister21Activity9.class);
                                                            startActivity(x);
                                                        } else {
                                                            primeraVez = preferences.getBoolean("primeravez_blister11", true); // por defecto es true
                                                            if (primeraVez) {
                                                                Intent x = new Intent(getContext(), Blister21Activity10.class);
                                                                startActivity(x);
                                                            } else {
                                                                primeraVez = preferences.getBoolean("primeravez_blister12", true); // por defecto es true
                                                                if (primeraVez) {
                                                                    Intent x = new Intent(getContext(), Blister21Activity11.class);
                                                                    startActivity(x);
                                                                } else {
                                                                    primeraVez = preferences.getBoolean("primeravez_blister13", true); // por defecto es true
                                                                    if (primeraVez) {
                                                                        Intent x = new Intent(getContext(), Blister21Activity12.class);
                                                                        startActivity(x);
                                                                    } else {
                                                                        primeraVez = preferences.getBoolean("primeravez_blister14", true); // por defecto es true
                                                                        if (primeraVez) {
                                                                            Intent x = new Intent(getContext(), Blister21Activity13.class);
                                                                            startActivity(x);
                                                                        } else {
                                                                            primeraVez = preferences.getBoolean("primeravez_blister15", true); // por defecto es true
                                                                            if (primeraVez) {
                                                                                Intent x = new Intent(getContext(), Blister21Activity14.class);
                                                                                startActivity(x);
                                                                            } else {
                                                                                primeraVez = preferences.getBoolean("primeravez_blister16", true); // por defecto es true
                                                                                if (primeraVez) {
                                                                                    Intent x = new Intent(getContext(), Blister21Activity15.class);
                                                                                    startActivity(x);
                                                                                } else {
                                                                                    primeraVez = preferences.getBoolean("primeravez_blister17", true); // por defecto es true
                                                                                    if (primeraVez) {
                                                                                        Intent x = new Intent(getContext(), Blister21Activity16.class);
                                                                                        startActivity(x);
                                                                                    } else {
                                                                                        primeraVez = preferences.getBoolean("primeravez_blister18", true); // por defecto es true
                                                                                        if (primeraVez) {
                                                                                            Intent x = new Intent(getContext(), Blister21Activity17.class);
                                                                                            startActivity(x);
                                                                                        } else {
                                                                                            primeraVez = preferences.getBoolean("primeravez_blister19", true); // por defecto es true
                                                                                            if (primeraVez) {
                                                                                                Intent x = new Intent(getContext(), Blister21Activity18.class);
                                                                                                startActivity(x);
                                                                                            } else {
                                                                                                primeraVez = preferences.getBoolean("primeravez_blister20", true); // por defecto es true
                                                                                                if (primeraVez) {
                                                                                                    Intent x = new Intent(getContext(), Blister21Activity19.class);
                                                                                                    startActivity(x);
                                                                                                }else {
                                                                                                    primeraVez = preferences.getBoolean("primeravez_blister21", true); // por defecto es true
                                                                                                    if (primeraVez) {
                                                                                                        Intent x = new Intent(getContext(), Blister21Activity20.class);
                                                                                                        startActivity(x);
                                                                                                    }else {
                                                                                                        Intent x = new Intent(getContext(), Blister21Activity21.class);
                                                                                                        startActivity(x);
                                                                                                                                                                                                                          }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                        }
                    }


                }
        );
    }
}