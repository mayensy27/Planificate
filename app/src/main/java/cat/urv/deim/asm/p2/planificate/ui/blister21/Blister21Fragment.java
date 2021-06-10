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
import cat.urv.deim.asm.p2.planificate.SegudaPreguntaActivity;


public class Blister21Fragment extends Fragment {
    Boolean primeraVez;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blister21, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button blister = view.findViewById(R.id.boton_blister);
        Button cambiar_blister = view.findViewById(R.id.boton_cambiar_blister);

        SharedPreferences preferences = requireActivity().getSharedPreferences("datos", Context.MODE_PRIVATE);

        cambiar_blister.setOnClickListener(v -> {
            Intent i = new Intent(getContext(), SegudaPreguntaActivity.class);
            startActivity(i);
        });


        blister.setOnClickListener(v -> {
                    if (!preferences.getBoolean("final", true)) {


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

                        objEditor.putBoolean("primeravez21_blister21", true); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
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

                        objEditor.putBoolean("mail_21", true);
                        objEditor.apply();
                    }
                    primeraVez = preferences.getBoolean("primeravez_blister1", true); // por defecto es true

                    if (primeraVez) {
                        // sendMail();
                        Intent x = new Intent(getContext(), Blister21Activity.class);
                        startActivity(x);

                    } else {
                        primeraVez = preferences.getBoolean("primeravez_blister2", true); // por defecto es true
                        if (primeraVez) {
                            Intent x = new Intent(getContext(), Blister21Activity1.class);
                            startActivity(x);
                        } else {
                            primeraVez = preferences.getBoolean("primeravez_blister3", true); // por defecto es true
                            if (primeraVez) {
                                Intent x = new Intent(getContext(), Blister21Activity2.class);
                                startActivity(x);
                            } else {
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
                                                                                                } else {
                                                                                                    primeraVez = preferences.getBoolean("primeravez21_blister21", true); // por defecto es true
                                                                                                    Intent x;
                                                                                                    if (primeraVez) {
                                                                                                        x = new Intent(getContext(), Blister21Activity20.class);
                                                                                                    } else {
                                                                                                        x = new Intent(getContext(), Blister21Activity21.class);
                                                                                                    }
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
        );
    }

}