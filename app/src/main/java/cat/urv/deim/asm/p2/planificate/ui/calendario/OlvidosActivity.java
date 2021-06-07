package cat.urv.deim.asm.p2.planificate.ui.calendario;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import cat.urv.deim.asm.p2.planificate.R;

public class OlvidosActivity extends AppCompatActivity {
    ListView registro_olvidos;
    ArrayList<String> lista_olvidos; //estos vectores deben tener la misma longitud.*/
    String aux,aux2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_olvidos);

        registro_olvidos = findViewById(R.id.registro_olvidos);
        SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);

        lista_olvidos=new ArrayList<>();

        aux=preferences.getString("tomaBlister_1", "");



        //xxx
        if(aux.equals(preferences.getString("tomaBlister_1", ""))){
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.list_item_registro, lista_olvidos);
            registro_olvidos.setAdapter(adapter);
        }
///xxx




        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-M-dd", Locale.getDefault());
        try {
            Date date = dateFormat.parse(aux);
            Calendar c = Calendar.getInstance();
            assert date != null;
            c.setTime(date);
            c.add(Calendar.DATE, 1);
            aux2 = dateFormat.format(c.getTime());


            if (aux2.equals(preferences.getString("tomaBlister_2", ""))||preferences.getString("tomaBlister_2", "").equals("")) {
                ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.list_item_registro, lista_olvidos);
                registro_olvidos.setAdapter(adapter);
                //Toast.makeText(this, "BIEN1", Toast.LENGTH_SHORT).show(); //NO OLVIDO
             /*   aux = preferences.getString("tomaBlister_2", "");
                date = dateFormat.parse(aux);
                c = Calendar.getInstance();
                assert date != null;
                c.setTime(date);
                c.add(Calendar.DATE, 1);
                aux2 = dateFormat.format(c.getTime());
                if (aux2.equals(preferences.getString("tomaBlister_3", ""))) {

                    aux = preferences.getString("tomaBlister_3", "");
                    date = dateFormat.parse(aux);
                    c = Calendar.getInstance();
                    assert date != null;
                    c.setTime(date);
                    c.add(Calendar.DATE, 1);
                    aux2 = dateFormat.format(c.getTime());
                    if (aux2.equals(preferences.getString("tomaBlister_4", ""))) {

                        aux = preferences.getString("tomaBlister_4", "");
                        date = dateFormat.parse(aux);
                        c = Calendar.getInstance();
                        assert date != null;
                        c.setTime(date);
                        c.add(Calendar.DATE, 1);
                        aux2 = dateFormat.format(c.getTime());
                        if (aux2.equals(preferences.getString("tomaBlister_5", ""))) {

                            aux = preferences.getString("tomaBlister_5", "");
                            date = dateFormat.parse(aux);
                            c = Calendar.getInstance();
                            assert date != null;
                            c.setTime(date);
                            c.add(Calendar.DATE, 1);
                            aux2 = dateFormat.format(c.getTime());
                            if (aux2.equals(preferences.getString("tomaBlister_6", ""))) {

                                aux = preferences.getString("tomaBlister_6", "");
                                date = dateFormat.parse(aux);
                                c = Calendar.getInstance();
                                assert date != null;
                                c.setTime(date);
                                c.add(Calendar.DATE, 1);
                                aux2 = dateFormat.format(c.getTime());
                                if (aux2.equals(preferences.getString("tomaBlister_7", ""))) {

                                    aux = preferences.getString("tomaBlister_7", "");
                                    date = dateFormat.parse(aux);
                                    c = Calendar.getInstance();
                                    assert date != null;
                                    c.setTime(date);
                                    c.add(Calendar.DATE, 1);
                                    aux2 = dateFormat.format(c.getTime());
                                    if (aux2.equals(preferences.getString("tomaBlister_8", ""))) {

                                        aux = preferences.getString("tomaBlister_8", "");
                                        date = dateFormat.parse(aux);
                                        c = Calendar.getInstance();
                                        assert date != null;
                                        c.setTime(date);
                                        c.add(Calendar.DATE, 1);
                                        aux2 = dateFormat.format(c.getTime());
                                        if (aux2.equals(preferences.getString("tomaBlister_9", ""))) {

                                            aux = preferences.getString("tomaBlister_9", "");
                                            date = dateFormat.parse(aux);
                                            c = Calendar.getInstance();
                                            assert date != null;
                                            c.setTime(date);
                                            c.add(Calendar.DATE, 1);
                                            aux2 = dateFormat.format(c.getTime());
                                            if (aux2.equals(preferences.getString("tomaBlister_10", ""))) {
                                                aux = preferences.getString("tomaBlister_10", "");
                                                date = dateFormat.parse(aux);
                                                c = Calendar.getInstance();
                                                assert date != null;
                                                c.setTime(date);
                                                c.add(Calendar.DATE, 1);
                                                aux2 = dateFormat.format(c.getTime());
                                                if (aux2.equals(preferences.getString("tomaBlister_11", ""))) {

                                                    aux = preferences.getString("tomaBlister_11", "");
                                                    date = dateFormat.parse(aux);
                                                    c = Calendar.getInstance();
                                                    assert date != null;
                                                    c.setTime(date);
                                                    c.add(Calendar.DATE, 1);
                                                    aux2 = dateFormat.format(c.getTime());
                                                    if (aux2.equals(preferences.getString("tomaBlister_12", ""))) {

                                                        //Toast.makeText(this, "BIEN1", Toast.LENGTH_SHORT).show(); //NO OLVIDO
                                                        aux = preferences.getString("tomaBlister_12", "");
                                                        date = dateFormat.parse(aux);
                                                        c = Calendar.getInstance();
                                                        assert date != null;
                                                        c.setTime(date);
                                                        c.add(Calendar.DATE, 1);
                                                        aux2 = dateFormat.format(c.getTime());
                                                        if (aux2.equals(preferences.getString("tomaBlister_13", ""))) {

                                                            //Toast.makeText(this, "BIEN1", Toast.LENGTH_SHORT).show(); //NO OLVIDO
                                                            aux = preferences.getString("tomaBlister_13", "");
                                                            date = dateFormat.parse(aux);
                                                            c = Calendar.getInstance();
                                                            assert date != null;
                                                            c.setTime(date);
                                                            c.add(Calendar.DATE, 1);
                                                            aux2 = dateFormat.format(c.getTime());
                                                            if (aux2.equals(preferences.getString("tomaBlister_14", ""))) {

                                                                //Toast.makeText(this, "BIEN1", Toast.LENGTH_SHORT).show(); //NO OLVIDO
                                                                aux = preferences.getString("tomaBlister_14", "");
                                                                date = dateFormat.parse(aux);
                                                                c = Calendar.getInstance();
                                                                assert date != null;
                                                                c.setTime(date);
                                                                c.add(Calendar.DATE, 1);
                                                                aux2 = dateFormat.format(c.getTime());
                                                                if (aux2.equals(preferences.getString("tomaBlister_15", ""))) {

                                                                    aux = preferences.getString("tomaBlister_15", "");
                                                                    date = dateFormat.parse(aux);
                                                                    c = Calendar.getInstance();
                                                                    assert date != null;
                                                                    c.setTime(date);
                                                                    c.add(Calendar.DATE, 1);
                                                                    aux2 = dateFormat.format(c.getTime());
                                                                    if (aux2.equals(preferences.getString("tomaBlister_16", ""))) {

                                                                        aux = preferences.getString("tomaBlister_16", "");
                                                                        date = dateFormat.parse(aux);
                                                                        c = Calendar.getInstance();
                                                                        assert date != null;
                                                                        c.setTime(date);
                                                                        c.add(Calendar.DATE, 1);
                                                                        aux2 = dateFormat.format(c.getTime());
                                                                        if (aux2.equals(preferences.getString("tomaBlister_17", ""))) {

                                                                            aux = preferences.getString("tomaBlister_17", "");
                                                                            date = dateFormat.parse(aux);
                                                                            c = Calendar.getInstance();
                                                                            assert date != null;
                                                                            c.setTime(date);
                                                                            c.add(Calendar.DATE, 1);
                                                                            aux2 = dateFormat.format(c.getTime());
                                                                            if (aux2.equals(preferences.getString("tomaBlister_18", ""))) {

                                                                                aux = preferences.getString("tomaBlister_18", "");
                                                                                date = dateFormat.parse(aux);
                                                                                c = Calendar.getInstance();
                                                                                assert date != null;
                                                                                c.setTime(date);
                                                                                c.add(Calendar.DATE, 1);
                                                                                aux2 = dateFormat.format(c.getTime());
                                                                                if (aux2.equals(preferences.getString("tomaBlister_19", ""))) {

                                                                                    aux = preferences.getString("tomaBlister_19", "");
                                                                                    date = dateFormat.parse(aux);
                                                                                    c = Calendar.getInstance();
                                                                                    assert date != null;
                                                                                    c.setTime(date);
                                                                                    c.add(Calendar.DATE, 1);
                                                                                    aux2 = dateFormat.format(c.getTime());
                                                                                    if (aux2.equals(preferences.getString("tomaBlister_20", ""))) {

                                                                                        aux = preferences.getString("tomaBlister_20", "");
                                                                                        date = dateFormat.parse(aux);
                                                                                        c = Calendar.getInstance();
                                                                                        assert date != null;
                                                                                        c.setTime(date);
                                                                                        c.add(Calendar.DATE, 1);
                                                                                        aux2 = dateFormat.format(c.getTime());
                                                                                        if (aux2.equals(preferences.getString("tomaBlister_21", ""))) {

                                                                                            //Toast.makeText(this, "BIEN1", Toast.LENGTH_SHORT).show(); //NO OLVIDO
                                                                                            aux = preferences.getString("tomaBlister_21", "");
                                                                                            date = dateFormat.parse(aux);
                                                                                            c = Calendar.getInstance();
                                                                                            assert date != null;
                                                                                            c.setTime(date);
                                                                                            c.add(Calendar.DATE, 1);
                                                                                            aux2 = dateFormat.format(c.getTime());
                                                                                            if (aux2.equals(preferences.getString("tomaBlister_22", ""))) {

                                                                                                aux = preferences.getString("tomaBlister_22", "");
                                                                                                date = dateFormat.parse(aux);
                                                                                                c = Calendar.getInstance();
                                                                                                assert date != null;
                                                                                                c.setTime(date);
                                                                                                c.add(Calendar.DATE, 1);
                                                                                                aux2 = dateFormat.format(c.getTime());
                                                                                                if (aux2.equals(preferences.getString("tomaBlister_23", ""))) {

                                                                                                    //Toast.makeText(this, "BIEN1", Toast.LENGTH_SHORT).show(); //NO OLVIDO
                                                                                                    aux = preferences.getString("tomaBlister_23", "");
                                                                                                    date = dateFormat.parse(aux);
                                                                                                    c = Calendar.getInstance();
                                                                                                    assert date != null;
                                                                                                    c.setTime(date);
                                                                                                    c.add(Calendar.DATE, 1);
                                                                                                    aux2 = dateFormat.format(c.getTime());
                                                                                                    if (aux2.equals(preferences.getString("tomaBlister_24", ""))) {

                                                                                                        aux = preferences.getString("tomaBlister_24", "");
                                                                                                        date = dateFormat.parse(aux);
                                                                                                        c = Calendar.getInstance();
                                                                                                        assert date != null;
                                                                                                        c.setTime(date);
                                                                                                        c.add(Calendar.DATE, 1);
                                                                                                        aux2 = dateFormat.format(c.getTime());
                                                                                                        if (aux2.equals(preferences.getString("tomaBlister_25", ""))) {

                                                                                                            aux = preferences.getString("tomaBlister_25", "");
                                                                                                            date = dateFormat.parse(aux);
                                                                                                            c = Calendar.getInstance();
                                                                                                            assert date != null;
                                                                                                            c.setTime(date);
                                                                                                            c.add(Calendar.DATE, 1);
                                                                                                            aux2 = dateFormat.format(c.getTime());
                                                                                                            if (aux2.equals(preferences.getString("tomaBlister_26", ""))) {

                                                                                                                aux = preferences.getString("tomaBlister_26", "");
                                                                                                                date = dateFormat.parse(aux);
                                                                                                                c = Calendar.getInstance();
                                                                                                                assert date != null;
                                                                                                                c.setTime(date);
                                                                                                                c.add(Calendar.DATE, 1);
                                                                                                                aux2 = dateFormat.format(c.getTime());
                                                                                                                if (aux2.equals(preferences.getString("tomaBlister_27", ""))) {

                                                                                                                    aux = preferences.getString("tomaBlister_27", "");
                                                                                                                    date = dateFormat.parse(aux);
                                                                                                                    c = Calendar.getInstance();
                                                                                                                    assert date != null;
                                                                                                                    c.setTime(date);
                                                                                                                    c.add(Calendar.DATE, 1);
                                                                                                                    aux2 = dateFormat.format(c.getTime());
                                                                                                                    if (aux2.equals(preferences.getString("tomaBlister_28", ""))) {
                                                                                                                        aux = preferences.getString("tomaBlister_28", "");
                                                                                                                        date = dateFormat.parse(aux);
                                                                                                                        c = Calendar.getInstance();
                                                                                                                        assert date != null;
                                                                                                                        c.setTime(date);
                                                                                                                        c.add(Calendar.DATE, 1);
                                                                                                                        aux2 = dateFormat.format(c.getTime());
                                                                                                                        if (aux2.equals(preferences.getString("tomaBlister_29", ""))) {

                                                                                                                            Toast.makeText(this, "Ningun olvido en la toma de las píldoras.", Toast.LENGTH_LONG).show(); //NO OLVIDO
                                                                                                                        }

                                                                                                                    } else { //OLVIDO
                                                                                                                        while (!aux2.equals(preferences.getString("tomaBlister_28", ""))) {
                                                                                                                            //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                                                                                                                            lista_olvidos.add(aux2);
                                                                                                                            date = dateFormat.parse(aux2);
                                                                                                                            assert date != null;
                                                                                                                            c.setTime(date);
                                                                                                                            c.add(Calendar.DATE, 1);
                                                                                                                            aux2 = dateFormat.format(c.getTime());
                                                                                                                        }


                                                                                                                    }


                                                                                                                } else { //OLVIDO
                                                                                                                    while (!aux2.equals(preferences.getString("tomaBlister_27", ""))) {
                                                                                                                        //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                                                                                                                        lista_olvidos.add(aux2);
                                                                                                                        date = dateFormat.parse(aux2);
                                                                                                                        assert date != null;
                                                                                                                        c.setTime(date);
                                                                                                                        c.add(Calendar.DATE, 1);
                                                                                                                        aux2 = dateFormat.format(c.getTime());
                                                                                                                    }


                                                                                                                }


                                                                                                            } else { //OLVIDO
                                                                                                                while (!aux2.equals(preferences.getString("tomaBlister_26", ""))) {
                                                                                                                    //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                                                                                                                    lista_olvidos.add(aux2);
                                                                                                                    date = dateFormat.parse(aux2);
                                                                                                                    assert date != null;
                                                                                                                    c.setTime(date);
                                                                                                                    c.add(Calendar.DATE, 1);
                                                                                                                    aux2 = dateFormat.format(c.getTime());
                                                                                                                }


                                                                                                            }

                                                                                                        } else { //OLVIDO
                                                                                                            while (!aux2.equals(preferences.getString("tomaBlister_25", ""))) {
                                                                                                                //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                                                                                                                lista_olvidos.add(aux2);
                                                                                                                date = dateFormat.parse(aux2);
                                                                                                                assert date != null;
                                                                                                                c.setTime(date);
                                                                                                                c.add(Calendar.DATE, 1);
                                                                                                                aux2 = dateFormat.format(c.getTime());
                                                                                                            }


                                                                                                        }

                                                                                                    } else { //OLVIDO
                                                                                                        while (!aux2.equals(preferences.getString("tomaBlister_24", ""))) {
                                                                                                            //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                                                                                                            lista_olvidos.add(aux2);
                                                                                                            date = dateFormat.parse(aux2);
                                                                                                            assert date != null;
                                                                                                            c.setTime(date);
                                                                                                            c.add(Calendar.DATE, 1);
                                                                                                            aux2 = dateFormat.format(c.getTime());
                                                                                                        }


                                                                                                    }

                                                                                                } else { //OLVIDO
                                                                                                    while (!aux2.equals(preferences.getString("tomaBlister_23", ""))) {
                                                                                                        //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                                                                                                        lista_olvidos.add(aux2);
                                                                                                        date = dateFormat.parse(aux2);
                                                                                                        assert date != null;
                                                                                                        c.setTime(date);
                                                                                                        c.add(Calendar.DATE, 1);
                                                                                                        aux2 = dateFormat.format(c.getTime());
                                                                                                    }


                                                                                                }

                                                                                            } else { //OLVIDO
                                                                                                while (!aux2.equals(preferences.getString("tomaBlister_22", ""))) {
                                                                                                    //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                                                                                                    lista_olvidos.add(aux2);
                                                                                                    date = dateFormat.parse(aux2);
                                                                                                    assert date != null;
                                                                                                    c.setTime(date);
                                                                                                    c.add(Calendar.DATE, 1);
                                                                                                    aux2 = dateFormat.format(c.getTime());
                                                                                                }


                                                                                            }

                                                                                        } else { //OLVIDO
                                                                                            while (!aux2.equals(preferences.getString("tomaBlister_21", ""))) {
                                                                                                //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                                                                                                lista_olvidos.add(aux2);
                                                                                                date = dateFormat.parse(aux2);
                                                                                                assert date != null;
                                                                                                c.setTime(date);
                                                                                                c.add(Calendar.DATE, 1);
                                                                                                aux2 = dateFormat.format(c.getTime());
                                                                                            }


                                                                                        }


                                                                                    } else { //OLVIDO
                                                                                        while (!aux2.equals(preferences.getString("tomaBlister_20", ""))) {
                                                                                            //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                                                                                            lista_olvidos.add(aux2);
                                                                                            date = dateFormat.parse(aux2);
                                                                                            assert date != null;
                                                                                            c.setTime(date);
                                                                                            c.add(Calendar.DATE, 1);
                                                                                            aux2 = dateFormat.format(c.getTime());
                                                                                        }


                                                                                    }


                                                                                } else { //OLVIDO
                                                                                    while (!aux2.equals(preferences.getString("tomaBlister_19", ""))) {
                                                                                        //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                                                                                        lista_olvidos.add(aux2);
                                                                                        date = dateFormat.parse(aux2);
                                                                                        assert date != null;
                                                                                        c.setTime(date);
                                                                                        c.add(Calendar.DATE, 1);
                                                                                        aux2 = dateFormat.format(c.getTime());
                                                                                    }


                                                                                }

                                                                            } else { //OLVIDO
                                                                                while (!aux2.equals(preferences.getString("tomaBlister_18", ""))) {
                                                                                    //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                                                                                    lista_olvidos.add(aux2);
                                                                                    date = dateFormat.parse(aux2);
                                                                                    assert date != null;
                                                                                    c.setTime(date);
                                                                                    c.add(Calendar.DATE, 1);
                                                                                    aux2 = dateFormat.format(c.getTime());
                                                                                }


                                                                            }

                                                                        } else { //OLVIDO
                                                                            while (!aux2.equals(preferences.getString("tomaBlister_17", ""))) {
                                                                                //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                                                                                lista_olvidos.add(aux2);
                                                                                date = dateFormat.parse(aux2);
                                                                                assert date != null;
                                                                                c.setTime(date);
                                                                                c.add(Calendar.DATE, 1);
                                                                                aux2 = dateFormat.format(c.getTime());
                                                                            }


                                                                        }

                                                                    } else { //OLVIDO
                                                                        while (!aux2.equals(preferences.getString("tomaBlister_16", ""))) {
                                                                            //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                                                                            lista_olvidos.add(aux2);
                                                                            date = dateFormat.parse(aux2);
                                                                            assert date != null;
                                                                            c.setTime(date);
                                                                            c.add(Calendar.DATE, 1);
                                                                            aux2 = dateFormat.format(c.getTime());
                                                                        }


                                                                    }

                                                                } else { //OLVIDO
                                                                    while (!aux2.equals(preferences.getString("tomaBlister_15", ""))) {
                                                                        //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                                                                        lista_olvidos.add(aux2);
                                                                        date = dateFormat.parse(aux2);
                                                                        assert date != null;
                                                                        c.setTime(date);
                                                                        c.add(Calendar.DATE, 1);
                                                                        aux2 = dateFormat.format(c.getTime());
                                                                    }


                                                                }

                                                            } else { //OLVIDO
                                                                while (!aux2.equals(preferences.getString("tomaBlister_14", ""))) {
                                                                    //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                                                                    lista_olvidos.add(aux2);
                                                                    date = dateFormat.parse(aux2);
                                                                    assert date != null;
                                                                    c.setTime(date);
                                                                    c.add(Calendar.DATE, 1);
                                                                    aux2 = dateFormat.format(c.getTime());
                                                                }


                                                            }

                                                        } else { //OLVIDO
                                                            while (!aux2.equals(preferences.getString("tomaBlister_13", ""))) {
                                                                //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                                                                lista_olvidos.add(aux2);
                                                                date = dateFormat.parse(aux2);
                                                                assert date != null;
                                                                c.setTime(date);
                                                                c.add(Calendar.DATE, 1);
                                                                aux2 = dateFormat.format(c.getTime());
                                                            }


                                                        }


                                                    } else { //OLVIDO
                                                        while (!aux2.equals(preferences.getString("tomaBlister_12", ""))) {
                                                            //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                                                            lista_olvidos.add(aux2);
                                                            date = dateFormat.parse(aux2);
                                                            assert date != null;
                                                            c.setTime(date);
                                                            c.add(Calendar.DATE, 1);
                                                            aux2 = dateFormat.format(c.getTime());
                                                        }


                                                    }

                                                } else { //OLVIDO
                                                    while (!aux2.equals(preferences.getString("tomaBlister_11", ""))) {
                                                        //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                                                        lista_olvidos.add(aux2);
                                                        date = dateFormat.parse(aux2);
                                                        assert date != null;
                                                        c.setTime(date);
                                                        c.add(Calendar.DATE, 1);
                                                        aux2 = dateFormat.format(c.getTime());
                                                    }


                                                }

                                            } else { //OLVIDO
                                                while (!aux2.equals(preferences.getString("tomaBlister_10", ""))) {
                                                    //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                                                    lista_olvidos.add(aux2);
                                                    date = dateFormat.parse(aux2);
                                                    assert date != null;
                                                    c.setTime(date);
                                                    c.add(Calendar.DATE, 1);
                                                    aux2 = dateFormat.format(c.getTime());
                                                }


                                            }

                                        } else { //OLVIDO
                                            while (!aux2.equals(preferences.getString("tomaBlister_9", ""))) {
                                                //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                                                lista_olvidos.add(aux2);
                                                date = dateFormat.parse(aux2);
                                                assert date != null;
                                                c.setTime(date);
                                                c.add(Calendar.DATE, 1);
                                                aux2 = dateFormat.format(c.getTime());
                                            }


                                        }

                                    } else { //OLVIDO
                                        while (!aux2.equals(preferences.getString("tomaBlister_8", ""))) {
                                            //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                                            lista_olvidos.add(aux2);
                                            date = dateFormat.parse(aux2);
                                            assert date != null;
                                            c.setTime(date);
                                            c.add(Calendar.DATE, 1);
                                            aux2 = dateFormat.format(c.getTime());
                                        }


                                    }

                                } else { //OLVIDO
                                    while (!aux2.equals(preferences.getString("tomaBlister_7", ""))) {
                                        //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                                        lista_olvidos.add(aux2);
                                        date = dateFormat.parse(aux2);
                                        assert date != null;
                                        c.setTime(date);
                                        c.add(Calendar.DATE, 1);
                                        aux2 = dateFormat.format(c.getTime());
                                    }


                                }


                            } else { //OLVIDO
                                while (!aux2.equals(preferences.getString("tomaBlister_6", ""))) {
                                    //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                                    lista_olvidos.add(aux2);
                                    date = dateFormat.parse(aux2);
                                    assert date != null;
                                    c.setTime(date);
                                    c.add(Calendar.DATE, 1);
                                    aux2 = dateFormat.format(c.getTime());
                                }


                            }

                        } else { //OLVIDO
                            while (!aux2.equals(preferences.getString("tomaBlister_5", ""))) {
                                //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                                lista_olvidos.add(aux2);
                                date = dateFormat.parse(aux2);
                                assert date != null;
                                c.setTime(date);
                                c.add(Calendar.DATE, 1);
                                aux2 = dateFormat.format(c.getTime());
                            }


                        }

                    } else { //OLVIDO
                        while (!aux2.equals(preferences.getString("tomaBlister_4", ""))) {
                            //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                            lista_olvidos.add(aux2);
                            date = dateFormat.parse(aux2);
                            assert date != null;
                            c.setTime(date);
                            c.add(Calendar.DATE, 1);
                            aux2 = dateFormat.format(c.getTime());
                        }


                    }

                }
*/
//OJITOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOoo
            } else { //OLVIDO 1
                lista_olvidos.add(aux2);
                date = dateFormat.parse(aux2);
                assert date != null;
                c.setTime(date);
                c.add(Calendar.DATE, 1);
                aux2 = dateFormat.format(c.getTime());
                while (!aux2.equals(preferences.getString("tomaBlister_2", ""))) {
                    //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                    lista_olvidos.add(aux2);
                    date = dateFormat.parse(aux2);
                    assert date != null;
                    c.setTime(date);
                    c.add(Calendar.DATE, 1);
                    aux2 = dateFormat.format(c.getTime());
                }
            }



            if(aux2.equals(preferences.getString("tomaBlister_3", ""))||preferences.getString("tomaBlister_3", "").equals("")) {
                ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.list_item_registro, lista_olvidos);
                registro_olvidos.setAdapter(adapter);
            } else { //OLVIDO 2
                //lista_olvidos.add(aux2);
                date = dateFormat.parse(aux2);
                assert date != null;
                c.setTime(date);
                c.add(Calendar.DATE, 1);
                aux2 = dateFormat.format(c.getTime());
                while (!aux2.equals(preferences.getString("tomaBlister_3", ""))) {
                    //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                    lista_olvidos.add(aux2);
                    date = dateFormat.parse(aux2);
                    assert date != null;
                    c.setTime(date);
                    c.add(Calendar.DATE, 1);
                    aux2 = dateFormat.format(c.getTime());
                }
            }


            if(aux2.equals(preferences.getString("tomaBlister_4", ""))||preferences.getString("tomaBlister_4", "").equals("")) {
                ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.list_item_registro, lista_olvidos);
                registro_olvidos.setAdapter(adapter);
            } else { //OLVIDO 3
                //lista_olvidos.add(aux2);
                date = dateFormat.parse(aux2);
                assert date != null;
                c.setTime(date);
                c.add(Calendar.DATE, 1);
                aux2 = dateFormat.format(c.getTime());
                while (!aux2.equals(preferences.getString("tomaBlister_4", ""))) {
                    //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                    lista_olvidos.add(aux2);
                    date = dateFormat.parse(aux2);
                    assert date != null;
                    c.setTime(date);
                    c.add(Calendar.DATE, 1);
                    aux2 = dateFormat.format(c.getTime());
                }
            }


            if(aux2.equals(preferences.getString("tomaBlister_5", ""))||preferences.getString("tomaBlister_5", "").equals("")) {
                ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.list_item_registro, lista_olvidos);
                registro_olvidos.setAdapter(adapter);
            } else { //OLVIDO 4
                //lista_olvidos.add(aux2);
                date = dateFormat.parse(aux2);
                assert date != null;
                c.setTime(date);
                c.add(Calendar.DATE, 1);
                aux2 = dateFormat.format(c.getTime());
                while (!aux2.equals(preferences.getString("tomaBlister_5", ""))) {
                    //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                    lista_olvidos.add(aux2);
                    date = dateFormat.parse(aux2);
                    assert date != null;
                    c.setTime(date);
                    c.add(Calendar.DATE, 1);
                    aux2 = dateFormat.format(c.getTime());
                }
            }


            if(aux2.equals(preferences.getString("tomaBlister_6", ""))||preferences.getString("tomaBlister_6", "").equals("")) {
                ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.list_item_registro, lista_olvidos);
                registro_olvidos.setAdapter(adapter);
            } else { //OLVIDO 5
                //lista_olvidos.add(aux2);
                date = dateFormat.parse(aux2);
                assert date != null;
                c.setTime(date);
                c.add(Calendar.DATE, 1);
                aux2 = dateFormat.format(c.getTime());
                while (!aux2.equals(preferences.getString("tomaBlister_6", ""))) {
                    //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                    lista_olvidos.add(aux2);
                    date = dateFormat.parse(aux2);
                    assert date != null;
                    c.setTime(date);
                    c.add(Calendar.DATE, 1);
                    aux2 = dateFormat.format(c.getTime());
                }
            }


            if(aux2.equals(preferences.getString("tomaBlister_7", ""))||preferences.getString("tomaBlister_7", "").equals("")) {
                ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.list_item_registro, lista_olvidos);
                registro_olvidos.setAdapter(adapter);
            } else { //OLVIDO 6
                //lista_olvidos.add(aux2);
                date = dateFormat.parse(aux2);
                assert date != null;
                c.setTime(date);
                c.add(Calendar.DATE, 1);
                aux2 = dateFormat.format(c.getTime());
                while (!aux2.equals(preferences.getString("tomaBlister_7", ""))) {
                    //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                    lista_olvidos.add(aux2);
                    date = dateFormat.parse(aux2);
                    assert date != null;
                    c.setTime(date);
                    c.add(Calendar.DATE, 1);
                    aux2 = dateFormat.format(c.getTime());
                }
            }


            if(aux2.equals(preferences.getString("tomaBlister_8", ""))||preferences.getString("tomaBlister_8", "").equals("")) {
                ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.list_item_registro, lista_olvidos);
                registro_olvidos.setAdapter(adapter);
            } else { //OLVIDO 7
                //lista_olvidos.add(aux2);
                date = dateFormat.parse(aux2);
                assert date != null;
                c.setTime(date);
                c.add(Calendar.DATE, 1);
                aux2 = dateFormat.format(c.getTime());
                while (!aux2.equals(preferences.getString("tomaBlister_8", ""))) {
                    //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                    lista_olvidos.add(aux2);
                    date = dateFormat.parse(aux2);
                    assert date != null;
                    c.setTime(date);
                    c.add(Calendar.DATE, 1);
                    aux2 = dateFormat.format(c.getTime());
                }
            }

            if(aux2.equals(preferences.getString("tomaBlister_9", ""))||preferences.getString("tomaBlister_9", "").equals("")) {
                ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.list_item_registro, lista_olvidos);
                registro_olvidos.setAdapter(adapter);
            } else { //OLVIDO 8
                //lista_olvidos.add(aux2);
                date = dateFormat.parse(aux2);
                assert date != null;
                c.setTime(date);
                c.add(Calendar.DATE, 1);
                aux2 = dateFormat.format(c.getTime());
                while (!aux2.equals(preferences.getString("tomaBlister_9", ""))) {
                    //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                    lista_olvidos.add(aux2);
                    date = dateFormat.parse(aux2);
                    assert date != null;
                    c.setTime(date);
                    c.add(Calendar.DATE, 1);
                    aux2 = dateFormat.format(c.getTime());
                }
            }

            if(aux2.equals(preferences.getString("tomaBlister_10", ""))||preferences.getString("tomaBlister_10", "").equals("")) {
                ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.list_item_registro, lista_olvidos);
                registro_olvidos.setAdapter(adapter);
            } else { //OLVIDO 9
                //lista_olvidos.add(aux2);
                date = dateFormat.parse(aux2);
                assert date != null;
                c.setTime(date);
                c.add(Calendar.DATE, 1);
                aux2 = dateFormat.format(c.getTime());
                while (!aux2.equals(preferences.getString("tomaBlister_10", ""))) {
                    //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                    lista_olvidos.add(aux2);
                    date = dateFormat.parse(aux2);
                    assert date != null;
                    c.setTime(date);
                    c.add(Calendar.DATE, 1);
                    aux2 = dateFormat.format(c.getTime());
                }
            }

            if(aux2.equals(preferences.getString("tomaBlister_11", ""))||preferences.getString("tomaBlister_11", "").equals("")) {
                ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.list_item_registro, lista_olvidos);
                registro_olvidos.setAdapter(adapter);
            } else { //OLVIDO 10
                //lista_olvidos.add(aux2);
                date = dateFormat.parse(aux2);
                assert date != null;
                c.setTime(date);
                c.add(Calendar.DATE, 1);
                aux2 = dateFormat.format(c.getTime());
                while (!aux2.equals(preferences.getString("tomaBlister_11", ""))) {
                    //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                    lista_olvidos.add(aux2);
                    date = dateFormat.parse(aux2);
                    assert date != null;
                    c.setTime(date);
                    c.add(Calendar.DATE, 1);
                    aux2 = dateFormat.format(c.getTime());
                }
            }

            if(aux2.equals(preferences.getString("tomaBlister_12", ""))||preferences.getString("tomaBlister_12", "").equals("")) {
                ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.list_item_registro, lista_olvidos);
                registro_olvidos.setAdapter(adapter);
            } else { //OLVIDO 11
                //lista_olvidos.add(aux2);
                date = dateFormat.parse(aux2);
                assert date != null;
                c.setTime(date);
                c.add(Calendar.DATE, 1);
                aux2 = dateFormat.format(c.getTime());
                while (!aux2.equals(preferences.getString("tomaBlister_12", ""))) {
                    //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                    lista_olvidos.add(aux2);
                    date = dateFormat.parse(aux2);
                    assert date != null;
                    c.setTime(date);
                    c.add(Calendar.DATE, 1);
                    aux2 = dateFormat.format(c.getTime());
                }
            }

            if(aux2.equals(preferences.getString("tomaBlister_13", ""))||preferences.getString("tomaBlister_13", "").equals("")) {
                ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.list_item_registro, lista_olvidos);
                registro_olvidos.setAdapter(adapter);
            } else { //OLVIDO 12
                //lista_olvidos.add(aux2);
                date = dateFormat.parse(aux2);
                assert date != null;
                c.setTime(date);
                c.add(Calendar.DATE, 1);
                aux2 = dateFormat.format(c.getTime());
                while (!aux2.equals(preferences.getString("tomaBlister_13", ""))) {
                    //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                    lista_olvidos.add(aux2);
                    date = dateFormat.parse(aux2);
                    assert date != null;
                    c.setTime(date);
                    c.add(Calendar.DATE, 1);
                    aux2 = dateFormat.format(c.getTime());
                }
            }

            if(aux2.equals(preferences.getString("tomaBlister_14", ""))||preferences.getString("tomaBlister_14", "").equals("")) {
                ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.list_item_registro, lista_olvidos);
                registro_olvidos.setAdapter(adapter);
            } else { //OLVIDO 13
                //lista_olvidos.add(aux2);
                date = dateFormat.parse(aux2);
                assert date != null;
                c.setTime(date);
                c.add(Calendar.DATE, 1);
                aux2 = dateFormat.format(c.getTime());
                while (!aux2.equals(preferences.getString("tomaBlister_14", ""))) {
                    //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                    lista_olvidos.add(aux2);
                    date = dateFormat.parse(aux2);
                    assert date != null;
                    c.setTime(date);
                    c.add(Calendar.DATE, 1);
                    aux2 = dateFormat.format(c.getTime());
                }
            }


            if(aux2.equals(preferences.getString("tomaBlister_15", ""))||preferences.getString("tomaBlister_15", "").equals("")) {
                ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.list_item_registro, lista_olvidos);
                registro_olvidos.setAdapter(adapter);
            } else { //OLVIDO 14
                //lista_olvidos.add(aux2);
                date = dateFormat.parse(aux2);
                assert date != null;
                c.setTime(date);
                c.add(Calendar.DATE, 1);
                aux2 = dateFormat.format(c.getTime());
                while (!aux2.equals(preferences.getString("tomaBlister_15", ""))) {
                    //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                    lista_olvidos.add(aux2);
                    date = dateFormat.parse(aux2);
                    assert date != null;
                    c.setTime(date);
                    c.add(Calendar.DATE, 1);
                    aux2 = dateFormat.format(c.getTime());
                }
            }

            if(aux2.equals(preferences.getString("tomaBlister_16", ""))||preferences.getString("tomaBlister_16", "").equals("")) {
                ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.list_item_registro, lista_olvidos);
                registro_olvidos.setAdapter(adapter);
            } else { //OLVIDO 15
                //lista_olvidos.add(aux2);
                date = dateFormat.parse(aux2);
                assert date != null;
                c.setTime(date);
                c.add(Calendar.DATE, 1);
                aux2 = dateFormat.format(c.getTime());
                while (!aux2.equals(preferences.getString("tomaBlister_16", ""))) {
                    //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                    lista_olvidos.add(aux2);
                    date = dateFormat.parse(aux2);
                    assert date != null;
                    c.setTime(date);
                    c.add(Calendar.DATE, 1);
                    aux2 = dateFormat.format(c.getTime());
                }
            }

            if(aux2.equals(preferences.getString("tomaBlister_17", ""))||preferences.getString("tomaBlister_17", "").equals("")) {
                ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.list_item_registro, lista_olvidos);
                registro_olvidos.setAdapter(adapter);
            } else { //OLVIDO 16
                //lista_olvidos.add(aux2);
                date = dateFormat.parse(aux2);
                assert date != null;
                c.setTime(date);
                c.add(Calendar.DATE, 1);
                aux2 = dateFormat.format(c.getTime());
                while (!aux2.equals(preferences.getString("tomaBlister_17", ""))) {
                    //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                    lista_olvidos.add(aux2);
                    date = dateFormat.parse(aux2);
                    assert date != null;
                    c.setTime(date);
                    c.add(Calendar.DATE, 1);
                    aux2 = dateFormat.format(c.getTime());
                }
            }


            if(aux2.equals(preferences.getString("tomaBlister_18", ""))||preferences.getString("tomaBlister_18", "").equals("")) {
                ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.list_item_registro, lista_olvidos);
                registro_olvidos.setAdapter(adapter);
            } else { //OLVIDO 17
                //lista_olvidos.add(aux2);
                date = dateFormat.parse(aux2);
                assert date != null;
                c.setTime(date);
                c.add(Calendar.DATE, 1);
                aux2 = dateFormat.format(c.getTime());
                while (!aux2.equals(preferences.getString("tomaBlister_18", ""))) {
                    //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                    lista_olvidos.add(aux2);
                    date = dateFormat.parse(aux2);
                    assert date != null;
                    c.setTime(date);
                    c.add(Calendar.DATE, 1);
                    aux2 = dateFormat.format(c.getTime());
                }
            }


            if(aux2.equals(preferences.getString("tomaBlister_19", ""))||preferences.getString("tomaBlister_19", "").equals("")) {
                ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.list_item_registro, lista_olvidos);
                registro_olvidos.setAdapter(adapter);
            } else { //OLVIDO 18
                //lista_olvidos.add(aux2);
                date = dateFormat.parse(aux2);
                assert date != null;
                c.setTime(date);
                c.add(Calendar.DATE, 1);
                aux2 = dateFormat.format(c.getTime());
                while (!aux2.equals(preferences.getString("tomaBlister_19", ""))) {
                    //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                    lista_olvidos.add(aux2);
                    date = dateFormat.parse(aux2);
                    assert date != null;
                    c.setTime(date);
                    c.add(Calendar.DATE, 1);
                    aux2 = dateFormat.format(c.getTime());
                }
            }

            if(aux2.equals(preferences.getString("tomaBlister_20", ""))||preferences.getString("tomaBlister_20", "").equals("")) {
                ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.list_item_registro, lista_olvidos);
                registro_olvidos.setAdapter(adapter);
            } else { //OLVIDO 19
                //lista_olvidos.add(aux2);
                date = dateFormat.parse(aux2);
                assert date != null;
                c.setTime(date);
                c.add(Calendar.DATE, 1);
                aux2 = dateFormat.format(c.getTime());
                while (!aux2.equals(preferences.getString("tomaBlister_20", ""))) {
                    //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                    lista_olvidos.add(aux2);
                    date = dateFormat.parse(aux2);
                    assert date != null;
                    c.setTime(date);
                    c.add(Calendar.DATE, 1);
                    aux2 = dateFormat.format(c.getTime());
                }
            }

            if(aux2.equals(preferences.getString("tomaBlister_21", ""))||preferences.getString("tomaBlister_21", "").equals("")) {
                ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.list_item_registro, lista_olvidos);
                registro_olvidos.setAdapter(adapter);
            } else { //OLVIDO 20
                //lista_olvidos.add(aux2);
                date = dateFormat.parse(aux2);
                assert date != null;
                c.setTime(date);
                c.add(Calendar.DATE, 1);
                aux2 = dateFormat.format(c.getTime());
                while (!aux2.equals(preferences.getString("tomaBlister_21", ""))) {
                    //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                    lista_olvidos.add(aux2);
                    date = dateFormat.parse(aux2);
                    assert date != null;
                    c.setTime(date);
                    c.add(Calendar.DATE, 1);
                    aux2 = dateFormat.format(c.getTime());
                }
            }

            if(aux2.equals(preferences.getString("tomaBlister_22", ""))||preferences.getString("tomaBlister_22", "").equals("")) {
                ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.list_item_registro, lista_olvidos);
                registro_olvidos.setAdapter(adapter);
            } else { //OLVIDO 21
                //lista_olvidos.add(aux2);
                date = dateFormat.parse(aux2);
                assert date != null;
                c.setTime(date);
                c.add(Calendar.DATE, 1);
                aux2 = dateFormat.format(c.getTime());
                while (!aux2.equals(preferences.getString("tomaBlister_22", ""))) {
                    //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                    lista_olvidos.add(aux2);
                    date = dateFormat.parse(aux2);
                    assert date != null;
                    c.setTime(date);
                    c.add(Calendar.DATE, 1);
                    aux2 = dateFormat.format(c.getTime());
                }
            }

            if(aux2.equals(preferences.getString("tomaBlister_23", ""))||preferences.getString("tomaBlister_23", "").equals("")) {
                ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.list_item_registro, lista_olvidos);
                registro_olvidos.setAdapter(adapter);
            } else { //OLVIDO 22
                //lista_olvidos.add(aux2);
                date = dateFormat.parse(aux2);
                assert date != null;
                c.setTime(date);
                c.add(Calendar.DATE, 1);
                aux2 = dateFormat.format(c.getTime());
                while (!aux2.equals(preferences.getString("tomaBlister_23", ""))) {
                    //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                    lista_olvidos.add(aux2);
                    date = dateFormat.parse(aux2);
                    assert date != null;
                    c.setTime(date);
                    c.add(Calendar.DATE, 1);
                    aux2 = dateFormat.format(c.getTime());
                }
            }


            if(aux2.equals(preferences.getString("tomaBlister_24", ""))||preferences.getString("tomaBlister_24", "").equals("")) {
                ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.list_item_registro, lista_olvidos);
                registro_olvidos.setAdapter(adapter);
            } else { //OLVIDO 23
                //lista_olvidos.add(aux2);
                date = dateFormat.parse(aux2);
                assert date != null;
                c.setTime(date);
                c.add(Calendar.DATE, 1);
                aux2 = dateFormat.format(c.getTime());
                while (!aux2.equals(preferences.getString("tomaBlister_24", ""))) {
                    //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                    lista_olvidos.add(aux2);
                    date = dateFormat.parse(aux2);
                    assert date != null;
                    c.setTime(date);
                    c.add(Calendar.DATE, 1);
                    aux2 = dateFormat.format(c.getTime());
                }
            }

            if(aux2.equals(preferences.getString("tomaBlister_25", ""))||preferences.getString("tomaBlister_25", "").equals("")) {
                ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.list_item_registro, lista_olvidos);
                registro_olvidos.setAdapter(adapter);
            } else { //OLVIDO 24
                //lista_olvidos.add(aux2);
                date = dateFormat.parse(aux2);
                assert date != null;
                c.setTime(date);
                c.add(Calendar.DATE, 1);
                aux2 = dateFormat.format(c.getTime());
                while (!aux2.equals(preferences.getString("tomaBlister_25", ""))) {
                    //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                    lista_olvidos.add(aux2);
                    date = dateFormat.parse(aux2);
                    assert date != null;
                    c.setTime(date);
                    c.add(Calendar.DATE, 1);
                    aux2 = dateFormat.format(c.getTime());
                }
            }

            if(aux2.equals(preferences.getString("tomaBlister_26", ""))||preferences.getString("tomaBlister_26", "").equals("")) {
                ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.list_item_registro, lista_olvidos);
                registro_olvidos.setAdapter(adapter);
            } else { //OLVIDO 25
                //lista_olvidos.add(aux2);
                date = dateFormat.parse(aux2);
                assert date != null;
                c.setTime(date);
                c.add(Calendar.DATE, 1);
                aux2 = dateFormat.format(c.getTime());
                while (!aux2.equals(preferences.getString("tomaBlister_26", ""))) {
                    //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                    lista_olvidos.add(aux2);
                    date = dateFormat.parse(aux2);
                    assert date != null;
                    c.setTime(date);
                    c.add(Calendar.DATE, 1);
                    aux2 = dateFormat.format(c.getTime());
                }
            }

            if(aux2.equals(preferences.getString("tomaBlister_27", ""))||preferences.getString("tomaBlister_27", "").equals("")) {
                ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.list_item_registro, lista_olvidos);
                registro_olvidos.setAdapter(adapter);
            } else { //OLVIDO 26
                //lista_olvidos.add(aux2);
                date = dateFormat.parse(aux2);
                assert date != null;
                c.setTime(date);
                c.add(Calendar.DATE, 1);
                aux2 = dateFormat.format(c.getTime());
                while (!aux2.equals(preferences.getString("tomaBlister_27", ""))) {
                    //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                    lista_olvidos.add(aux2);
                    date = dateFormat.parse(aux2);
                    assert date != null;
                    c.setTime(date);
                    c.add(Calendar.DATE, 1);
                    aux2 = dateFormat.format(c.getTime());
                }
            }


            if(aux2.equals(preferences.getString("tomaBlister_28", ""))||preferences.getString("tomaBlister_28", "").equals("")) {
                ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.list_item_registro, lista_olvidos);
                registro_olvidos.setAdapter(adapter);
            } else { //OLVIDO 27
                //lista_olvidos.add(aux2);
                date = dateFormat.parse(aux2);
                assert date != null;
                c.setTime(date);
                c.add(Calendar.DATE, 1);
                aux2 = dateFormat.format(c.getTime());
                while (!aux2.equals(preferences.getString("tomaBlister_28", ""))) {
                    //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                    lista_olvidos.add(aux2);
                    date = dateFormat.parse(aux2);
                    assert date != null;
                    c.setTime(date);
                    c.add(Calendar.DATE, 1);
                    aux2 = dateFormat.format(c.getTime());
                }
            }

            if(aux2.equals(preferences.getString("tomaBlister_29", ""))||preferences.getString("tomaBlister_29", "").equals("")) {
                ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.list_item_registro, lista_olvidos);
                registro_olvidos.setAdapter(adapter);
            } else { //OLVIDO 28
                //lista_olvidos.add(aux2);
                date = dateFormat.parse(aux2);
                assert date != null;
                c.setTime(date);
                c.add(Calendar.DATE, 1);
                aux2 = dateFormat.format(c.getTime());
                while (!aux2.equals(preferences.getString("tomaBlister_29", ""))) {
                    //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                    lista_olvidos.add(aux2);
                    date = dateFormat.parse(aux2);
                    assert date != null;
                    c.setTime(date);
                    c.add(Calendar.DATE, 1);
                    aux2 = dateFormat.format(c.getTime());
                }
            }
              /*  //OLVIDO 2
                date = dateFormat.parse(aux2);
                assert date != null;
                c.setTime(date);
                c.add(Calendar.DATE, 1);
                aux2 = dateFormat.format(c.getTime());
                while (!aux2.equals(preferences.getString("tomaBlister_3", ""))) {
                    //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                    lista_olvidos.add(aux2);
                    date = dateFormat.parse(aux2);
                    assert date != null;
                    c.setTime(date);
                    c.add(Calendar.DATE, 1);
                    aux2 = dateFormat.format(c.getTime());
                }

                //OLVIDO 3
                date = dateFormat.parse(aux2);
                assert date != null;
                c.setTime(date);
                c.add(Calendar.DATE, 1);
                aux2 = dateFormat.format(c.getTime());
                while (!aux2.equals(preferences.getString("tomaBlister_4", ""))) {
                    //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                    lista_olvidos.add(aux2);
                    date = dateFormat.parse(aux2);
                    assert date != null;
                    c.setTime(date);
                    c.add(Calendar.DATE, 1);
                    aux2 = dateFormat.format(c.getTime());
                }

                //OLVIDO 4
                date = dateFormat.parse(aux2);
                assert date != null;
                c.setTime(date);
                c.add(Calendar.DATE, 1);
                aux2 = dateFormat.format(c.getTime());
                while (!aux2.equals(preferences.getString("tomaBlister_5", ""))) {
                    //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                    lista_olvidos.add(aux2);
                    date = dateFormat.parse(aux2);
                    assert date != null;
                    c.setTime(date);
                    c.add(Calendar.DATE, 1);
                    aux2 = dateFormat.format(c.getTime());
                }

                //OLVIDO 5
                date = dateFormat.parse(aux2);
                assert date != null;
                c.setTime(date);
                c.add(Calendar.DATE, 1);
                aux2 = dateFormat.format(c.getTime());
                while (!aux2.equals(preferences.getString("tomaBlister_6", ""))) {
                    //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                    lista_olvidos.add(aux2);
                    date = dateFormat.parse(aux2);
                    assert date != null;
                    c.setTime(date);
                    c.add(Calendar.DATE, 1);
                    aux2 = dateFormat.format(c.getTime());
                }

                //OLVIDO 6
                date = dateFormat.parse(aux2);
                assert date != null;
                c.setTime(date);
                c.add(Calendar.DATE, 1);
                aux2 = dateFormat.format(c.getTime());
                while (!aux2.equals(preferences.getString("tomaBlister_7", ""))) {
                    //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                    lista_olvidos.add(aux2);
                    date = dateFormat.parse(aux2);
                    assert date != null;
                    c.setTime(date);
                    c.add(Calendar.DATE, 1);
                    aux2 = dateFormat.format(c.getTime());
                }

                //OLVIDO 7
                date = dateFormat.parse(aux2);
                assert date != null;
                c.setTime(date);
                c.add(Calendar.DATE, 1);
                aux2 = dateFormat.format(c.getTime());
                while (!aux2.equals(preferences.getString("tomaBlister_8", ""))) {
                    //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                    lista_olvidos.add(aux2);
                    date = dateFormat.parse(aux2);
                    assert date != null;
                    c.setTime(date);
                    c.add(Calendar.DATE, 1);
                    aux2 = dateFormat.format(c.getTime());
                }

                //OLVIDO 8
                date = dateFormat.parse(aux2);
                assert date != null;
                c.setTime(date);
                c.add(Calendar.DATE, 1);
                aux2 = dateFormat.format(c.getTime());
                while (!aux2.equals(preferences.getString("tomaBlister_9", ""))) {
                    //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                    lista_olvidos.add(aux2);
                    date = dateFormat.parse(aux2);
                    assert date != null;
                    c.setTime(date);
                    c.add(Calendar.DATE, 1);
                    aux2 = dateFormat.format(c.getTime());
                }

                //OLVIDO 9
                date = dateFormat.parse(aux2);
                assert date != null;
                c.setTime(date);
                c.add(Calendar.DATE, 1);
                aux2 = dateFormat.format(c.getTime());
                while (!aux2.equals(preferences.getString("tomaBlister_10", ""))) {
                    //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                    lista_olvidos.add(aux2);
                    date = dateFormat.parse(aux2);
                    assert date != null;
                    c.setTime(date);
                    c.add(Calendar.DATE, 1);
                    aux2 = dateFormat.format(c.getTime());
                }

                //OLVIDO 10
                date = dateFormat.parse(aux2);
                assert date != null;
                c.setTime(date);
                c.add(Calendar.DATE, 1);
                aux2 = dateFormat.format(c.getTime());
                while (!aux2.equals(preferences.getString("tomaBlister_11", ""))) {
                    //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                    lista_olvidos.add(aux2);
                    date = dateFormat.parse(aux2);
                    assert date != null;
                    c.setTime(date);
                    c.add(Calendar.DATE, 1);
                    aux2 = dateFormat.format(c.getTime());
                }
                //OLVIDO 11
                date = dateFormat.parse(aux2);
                assert date != null;
                c.setTime(date);
                c.add(Calendar.DATE, 1);
                aux2 = dateFormat.format(c.getTime());
                while (!aux2.equals(preferences.getString("tomaBlister_12", ""))) {
                    //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                    lista_olvidos.add(aux2);
                    date = dateFormat.parse(aux2);
                    assert date != null;
                    c.setTime(date);
                    c.add(Calendar.DATE, 1);
                    aux2 = dateFormat.format(c.getTime());
                }

                //OLVIDO 12
                date = dateFormat.parse(aux2);
                assert date != null;
                c.setTime(date);
                c.add(Calendar.DATE, 1);
                aux2 = dateFormat.format(c.getTime());
                while (!aux2.equals(preferences.getString("tomaBlister_13", ""))) {
                    //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                    lista_olvidos.add(aux2);
                    date = dateFormat.parse(aux2);
                    assert date != null;
                    c.setTime(date);
                    c.add(Calendar.DATE, 1);
                    aux2 = dateFormat.format(c.getTime());
                }

                //OLVIDO 13
                date = dateFormat.parse(aux2);
                assert date != null;
                c.setTime(date);
                c.add(Calendar.DATE, 1);
                aux2 = dateFormat.format(c.getTime());
                while (!aux2.equals(preferences.getString("tomaBlister_14", ""))) {
                    //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                    lista_olvidos.add(aux2);
                    date = dateFormat.parse(aux2);
                    assert date != null;
                    c.setTime(date);
                    c.add(Calendar.DATE, 1);
                    aux2 = dateFormat.format(c.getTime());
                }

                //OLVIDO 14
                date = dateFormat.parse(aux2);
                assert date != null;
                c.setTime(date);
                c.add(Calendar.DATE, 1);
                aux2 = dateFormat.format(c.getTime());
                while (!aux2.equals(preferences.getString("tomaBlister_15", ""))) {
                    //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                    lista_olvidos.add(aux2);
                    date = dateFormat.parse(aux2);
                    assert date != null;
                    c.setTime(date);
                    c.add(Calendar.DATE, 1);
                    aux2 = dateFormat.format(c.getTime());
                }

                //OLVIDO 15
                date = dateFormat.parse(aux2);
                assert date != null;
                c.setTime(date);
                c.add(Calendar.DATE, 1);
                aux2 = dateFormat.format(c.getTime());
                while (!aux2.equals(preferences.getString("tomaBlister_16", ""))) {
                    //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                    lista_olvidos.add(aux2);
                    date = dateFormat.parse(aux2);
                    assert date != null;
                    c.setTime(date);
                    c.add(Calendar.DATE, 1);
                    aux2 = dateFormat.format(c.getTime());
                }

                //OLVIDO 16
                date = dateFormat.parse(aux2);
                assert date != null;
                c.setTime(date);
                c.add(Calendar.DATE, 1);
                aux2 = dateFormat.format(c.getTime());
                while (!aux2.equals(preferences.getString("tomaBlister_17", ""))) {
                    //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                    lista_olvidos.add(aux2);
                    date = dateFormat.parse(aux2);
                    assert date != null;
                    c.setTime(date);
                    c.add(Calendar.DATE, 1);
                    aux2 = dateFormat.format(c.getTime());
                }

                //OLVIDO 17
                date = dateFormat.parse(aux2);
                assert date != null;
                c.setTime(date);
                c.add(Calendar.DATE, 1);
                aux2 = dateFormat.format(c.getTime());
                while (!aux2.equals(preferences.getString("tomaBlister_18", ""))) {
                    //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                    lista_olvidos.add(aux2);
                    date = dateFormat.parse(aux2);
                    assert date != null;
                    c.setTime(date);
                    c.add(Calendar.DATE, 1);
                    aux2 = dateFormat.format(c.getTime());
                }
                //OLVIDO 18
                date = dateFormat.parse(aux2);
                assert date != null;
                c.setTime(date);
                c.add(Calendar.DATE, 1);
                aux2 = dateFormat.format(c.getTime());
                while (!aux2.equals(preferences.getString("tomaBlister_19", ""))) {
                    //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                    lista_olvidos.add(aux2);
                    date = dateFormat.parse(aux2);
                    assert date != null;
                    c.setTime(date);
                    c.add(Calendar.DATE, 1);
                    aux2 = dateFormat.format(c.getTime());
                }

                //OLVIDO 19
                date = dateFormat.parse(aux2);
                assert date != null;
                c.setTime(date);
                c.add(Calendar.DATE, 1);
                aux2 = dateFormat.format(c.getTime());
                while (!aux2.equals(preferences.getString("tomaBlister_20", ""))) {
                    //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                    lista_olvidos.add(aux2);
                    date = dateFormat.parse(aux2);
                    assert date != null;
                    c.setTime(date);
                    c.add(Calendar.DATE, 1);
                    aux2 = dateFormat.format(c.getTime());
                }
                //OLVIDO 20
                date = dateFormat.parse(aux2);
                assert date != null;
                c.setTime(date);
                c.add(Calendar.DATE, 1);
                aux2 = dateFormat.format(c.getTime());
                while (!aux2.equals(preferences.getString("tomaBlister_21", ""))) {
                    //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                    lista_olvidos.add(aux2);
                    date = dateFormat.parse(aux2);
                    assert date != null;
                    c.setTime(date);
                    c.add(Calendar.DATE, 1);
                    aux2 = dateFormat.format(c.getTime());
                }

                //OLVIDO 21
                date = dateFormat.parse(aux2);
                assert date != null;
                c.setTime(date);
                c.add(Calendar.DATE, 1);
                aux2 = dateFormat.format(c.getTime());
                while (!aux2.equals(preferences.getString("tomaBlister_22", ""))) {
                    //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                    lista_olvidos.add(aux2);
                    date = dateFormat.parse(aux2);
                    assert date != null;
                    c.setTime(date);
                    c.add(Calendar.DATE, 1);
                    aux2 = dateFormat.format(c.getTime());
                }
                //OLVIDO 22
                date = dateFormat.parse(aux2);
                assert date != null;
                c.setTime(date);
                c.add(Calendar.DATE, 1);
                aux2 = dateFormat.format(c.getTime());
                while (!aux2.equals(preferences.getString("tomaBlister_23", ""))) {
                    //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                    lista_olvidos.add(aux2);
                    date = dateFormat.parse(aux2);
                    assert date != null;
                    c.setTime(date);
                    c.add(Calendar.DATE, 1);
                    aux2 = dateFormat.format(c.getTime());
                }
                //OLVIDO 23                date = dateFormat.parse(aux2);
                assert date != null;
                c.setTime(date);
                c.add(Calendar.DATE, 1);
                aux2 = dateFormat.format(c.getTime());
                while (!aux2.equals(preferences.getString("tomaBlister_24", ""))) {
                    //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                    lista_olvidos.add(aux2);
                    date = dateFormat.parse(aux2);
                    assert date != null;
                    c.setTime(date);
                    c.add(Calendar.DATE, 1);
                    aux2 = dateFormat.format(c.getTime());
                }
                //OLVIDO 24
                date = dateFormat.parse(aux2);
                assert date != null;
                c.setTime(date);
                c.add(Calendar.DATE, 1);
                aux2 = dateFormat.format(c.getTime());
                while (!aux2.equals(preferences.getString("tomaBlister_25", ""))) {
                    //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                    lista_olvidos.add(aux2);
                    date = dateFormat.parse(aux2);
                    assert date != null;
                    c.setTime(date);
                    c.add(Calendar.DATE, 1);
                    aux2 = dateFormat.format(c.getTime());
                }
                //OLVIDO 25
                date = dateFormat.parse(aux2);
                assert date != null;
                c.setTime(date);
                c.add(Calendar.DATE, 1);
                aux2 = dateFormat.format(c.getTime());
                while (!aux2.equals(preferences.getString("tomaBlister_26", ""))) {
                    //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                    lista_olvidos.add(aux2);
                    date = dateFormat.parse(aux2);
                    assert date != null;
                    c.setTime(date);
                    c.add(Calendar.DATE, 1);
                    aux2 = dateFormat.format(c.getTime());
                }
                //OLVIDO 26
                date = dateFormat.parse(aux2);
                assert date != null;
                c.setTime(date);
                c.add(Calendar.DATE, 1);
                aux2 = dateFormat.format(c.getTime());
                while (!aux2.equals(preferences.getString("tomaBlister_27", ""))) {
                    //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                    lista_olvidos.add(aux2);
                    date = dateFormat.parse(aux2);
                    assert date != null;
                    c.setTime(date);
                    c.add(Calendar.DATE, 1);
                    aux2 = dateFormat.format(c.getTime());
                }
                //OLVIDO 27
                date = dateFormat.parse(aux2);
                assert date != null;
                c.setTime(date);
                c.add(Calendar.DATE, 1);
                aux2 = dateFormat.format(c.getTime());
                while (!aux2.equals(preferences.getString("tomaBlister_28", ""))) {
                    //Toast.makeText(this,aux2,Toast.LENGTH_SHORT).show(); //OLVIDO
                    lista_olvidos.add(aux2);
                    date = dateFormat.parse(aux2);
                    assert date != null;
                    c.setTime(date);
                    c.add(Calendar.DATE, 1);
                    aux2 = dateFormat.format(c.getTime());
                }
            }*/

        }

        catch (ParseException e) {
            e.printStackTrace();
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.list_item_registro, lista_olvidos);
        registro_olvidos.setAdapter(adapter);
    }
}