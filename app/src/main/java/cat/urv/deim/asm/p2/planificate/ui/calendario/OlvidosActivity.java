package cat.urv.deim.asm.p2.planificate.ui.calendario;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

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

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-M-dd", Locale.getDefault());
        try {
            Date date = dateFormat.parse(aux);
            Calendar c = Calendar.getInstance();
            assert date != null;
            c.setTime(date);
            c.add(Calendar.DATE, 1);
            aux2 = dateFormat.format(c.getTime());


            if (aux2.equals(preferences.getString("tomaBlister_2", ""))) {
                //Toast.makeText(this, "BIEN1", Toast.LENGTH_SHORT).show(); //NO OLVIDO
                aux = preferences.getString("tomaBlister_2", "");
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
                //OLVIDO 2
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
            }

        }

        catch (ParseException e) {
            e.printStackTrace();
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.list_item_registro, lista_olvidos);
        registro_olvidos.setAdapter(adapter);
    }
}