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


        blister.setOnClickListener(v -> {

                    SharedPreferences preferences= requireActivity().getSharedPreferences("datos", Context.MODE_PRIVATE);
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