package cat.urv.deim.asm.p2.planificate;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;

import java.util.Objects;

import cat.urv.deim.asm.p2.planificate.blister28.BlisterFragment;
import cat.urv.deim.asm.p2.planificate.blister28.Blister_10Fragment;
import cat.urv.deim.asm.p2.planificate.blister28.Blister_11Fragment;
import cat.urv.deim.asm.p2.planificate.blister28.Blister_12Fragment;
import cat.urv.deim.asm.p2.planificate.blister28.Blister_13Fragment;
import cat.urv.deim.asm.p2.planificate.blister28.Blister_14Fragment;
import cat.urv.deim.asm.p2.planificate.blister28.Blister_15Fragment;
import cat.urv.deim.asm.p2.planificate.blister28.Blister_16Fragment;
import cat.urv.deim.asm.p2.planificate.blister28.Blister_17Fragment;
import cat.urv.deim.asm.p2.planificate.blister28.Blister_18Fragment;
import cat.urv.deim.asm.p2.planificate.blister28.Blister_19Fragment;
import cat.urv.deim.asm.p2.planificate.blister28.Blister_1Fragment;
import cat.urv.deim.asm.p2.planificate.blister28.Blister_20Fragment;
import cat.urv.deim.asm.p2.planificate.blister28.Blister_21Fragment;
import cat.urv.deim.asm.p2.planificate.blister28.Blister_22Fragment;
import cat.urv.deim.asm.p2.planificate.blister28.Blister_23Fragment;
import cat.urv.deim.asm.p2.planificate.blister28.Blister_24Fragment;
import cat.urv.deim.asm.p2.planificate.blister28.Blister_25Fragment;
import cat.urv.deim.asm.p2.planificate.blister28.Blister_26Fragment;
import cat.urv.deim.asm.p2.planificate.blister28.Blister_27Fragment;
import cat.urv.deim.asm.p2.planificate.blister28.Blister_28Fragment;
import cat.urv.deim.asm.p2.planificate.blister28.Blister_2Fragment;
import cat.urv.deim.asm.p2.planificate.blister28.Blister_3Fragment;
import cat.urv.deim.asm.p2.planificate.blister28.Blister_4Fragment;
import cat.urv.deim.asm.p2.planificate.blister28.Blister_5Fragment;
import cat.urv.deim.asm.p2.planificate.blister28.Blister_6Fragment;
import cat.urv.deim.asm.p2.planificate.blister28.Blister_7Fragment;
import cat.urv.deim.asm.p2.planificate.blister28.Blister_8Fragment;
import cat.urv.deim.asm.p2.planificate.blister28.Blister_9Fragment;
import cat.urv.deim.asm.p2.planificate.ui.gallery.GalleryFragment;
import cat.urv.deim.asm.p2.planificate.ui.home.HomeFragment;
import cat.urv.deim.asm.p2.planificate.ui.slideshow.SlideshowFragment;

import static cat.urv.deim.asm.p2.planificate.NotificationHelper.NOTIFICATION_ID;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    Boolean primeraVez;
    public static  int contador_blsiter28=0;
    public static int contador_blsiter21=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(view -> Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show());
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);


        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(         //Aqui si cargan los id de los fragmentos que seran mostrados en pantalla
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow,R.id.nav_blister,R.id.nav_blister1,R.id.nav_blister2,R.id.nav_blister3,R.id.nav_blister4,R.id.nav_blister5,R.id.nav_blister6
                ,R.id.nav_blister7,R.id.nav_blister8,R.id.nav_blister9,R.id.nav_blister10,R.id.nav_blister11,R.id.nav_blister12,R.id.nav_blister13,R.id.nav_blister14,R.id.nav_blister15,R.id.nav_blister16
                ,R.id.nav_blister17,R.id.nav_blister18,R.id.nav_blister19,R.id.nav_blister20,R.id.nav_blister21,R.id.nav_blister22,R.id.nav_blister23,R.id.nav_blister24,R.id.nav_blister25,R.id.nav_blister26
                ,R.id.nav_blister27,R.id.nav_blister28)
                .setDrawerLayout(drawer)
                .build();

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);

        //*PARA QUE DESAPAREZCA LA NOTIFICACION
        NotificationManagerCompat notificationManagerCompat= NotificationManagerCompat.from(getApplicationContext());
        notificationManagerCompat.cancel(NOTIFICATION_ID);

        navigationView.setNavigationItemSelectedListener(
                item -> {
                    int id = item.getItemId();
                    boolean fTransaction = false;
                    Fragment fragment = null;
                    if (id == R.id.nav_home) {
                        fragment = new HomeFragment();
                        fTransaction = true;


                    } else if (id == R.id.nav_gallery) {
                        fragment = new GalleryFragment();
                        fTransaction = true;


                    } else if (id == R.id.nav_slideshow) {
                        fragment = new SlideshowFragment();
                        fTransaction = true;

                    }else if (id == R.id.nav_blister) {


                        SharedPreferences preferences= getSharedPreferences("datos", Context.MODE_PRIVATE);
                        primeraVez = preferences.getBoolean("primeravez_blister1", true); // por defecto es true

                        if (primeraVez) {

                            fragment = new BlisterFragment();
                            fTransaction = true;
                       }
                        else {

                            primeraVez = preferences.getBoolean("primeravez_blister2", true); // por defecto es true
                            if (primeraVez) {
                                fragment = new Blister_1Fragment();
                                fTransaction = true;

                            } else {

                                primeraVez = preferences.getBoolean("primeravez_blister3", true); // por defecto es true
                                if (primeraVez) {
                                    fragment = new Blister_2Fragment();
                                    fTransaction = true;

                                } else {
                                    primeraVez = preferences.getBoolean("primeravez_blister4", true); // por defecto es true
                                    if (primeraVez) {
                                        fragment = new Blister_3Fragment();
                                        fTransaction = true;

                                    } else {
                                        primeraVez = preferences.getBoolean("primeravez_blister5", true); // por defecto es true
                                        if (primeraVez) {
                                            fragment = new Blister_4Fragment();
                                            fTransaction = true;

                                        } else {
                                            primeraVez = preferences.getBoolean("primeravez_blister6", true); // por defecto es true
                                            if (primeraVez) {
                                                fragment = new Blister_5Fragment();
                                                fTransaction = true;

                                            } else {
                                                primeraVez = preferences.getBoolean("primeravez_blister7", true); // por defecto es true
                                                if (primeraVez) {
                                                    fragment = new Blister_6Fragment();
                                                    fTransaction = true;
                                                } else {
                                                    primeraVez = preferences.getBoolean("primeravez_blister8", true); // por defecto es true
                                                    if (primeraVez) {
                                                        fragment = new Blister_7Fragment();
                                                        fTransaction = true;

                                                    } else {
                                                        primeraVez = preferences.getBoolean("primeravez_blister9", true); // por defecto es true
                                                        if (primeraVez) {
                                                            fragment = new Blister_8Fragment();
                                                            fTransaction = true;

                                                        } else {
                                                            primeraVez = preferences.getBoolean("primeravez_blister10", true); // por defecto es true
                                                            if (primeraVez) {
                                                                fragment = new Blister_9Fragment();
                                                                fTransaction = true;

                                                            } else {
                                                                primeraVez = preferences.getBoolean("primeravez_blister11", true); // por defecto es true
                                                                if (primeraVez) {
                                                                    fragment = new Blister_10Fragment();
                                                                    fTransaction = true;

                                                                } else {
                                                                    primeraVez = preferences.getBoolean("primeravez_blister12", true); // por defecto es true
                                                                    if (primeraVez) {
                                                                        fragment = new Blister_11Fragment();
                                                                        fTransaction = true;

                                                                    } else {
                                                                        primeraVez = preferences.getBoolean("primeravez_blister13", true); // por defecto es true
                                                                        if (primeraVez) {
                                                                            fragment = new Blister_12Fragment();
                                                                            fTransaction = true;

                                                                        } else {
                                                                            primeraVez = preferences.getBoolean("primeravez_blister14", true); // por defecto es true
                                                                            if (primeraVez) {
                                                                                fragment = new Blister_13Fragment();
                                                                                fTransaction = true;

                                                                            }
                                                                            else{
                                                                                primeraVez = preferences.getBoolean("primeravez_blister15", true); // por defecto es true
                                                                                if (primeraVez) {
                                                                                    fragment = new Blister_14Fragment();
                                                                                    fTransaction = true;

                                                                                }
                                                                                else{
                                                                                    primeraVez = preferences.getBoolean("primeravez_blister16", true); // por defecto es true
                                                                                    if (primeraVez) {
                                                                                        fragment = new Blister_15Fragment();
                                                                                        fTransaction = true;

                                                                                    }
                                                                                    else{
                                                                                        primeraVez = preferences.getBoolean("primeravez_blister17", true); // por defecto es true
                                                                                        if (primeraVez) {
                                                                                            fragment = new Blister_16Fragment();
                                                                                            fTransaction = true;

                                                                                        }
                                                                                        else{
                                                                                            primeraVez = preferences.getBoolean("primeravez_blister18", true); // por defecto es true
                                                                                            if (primeraVez) {
                                                                                                fragment = new Blister_17Fragment();
                                                                                                fTransaction = true;

                                                                                            }
                                                                                            else{
                                                                                                primeraVez = preferences.getBoolean("primeravez_blister19", true); // por defecto es true
                                                                                                if (primeraVez) {
                                                                                                    fragment = new Blister_18Fragment();
                                                                                                    fTransaction = true;

                                                                                                }
                                                                                                else{
                                                                                                    primeraVez = preferences.getBoolean("primeravez_blister20", true); // por defecto es true
                                                                                                    if (primeraVez) {
                                                                                                        fragment = new Blister_19Fragment();
                                                                                                        fTransaction = true;

                                                                                                    }
                                                                                                    else{
                                                                                                        primeraVez = preferences.getBoolean("primeravez_blister21", true); // por defecto es true
                                                                                                        if (primeraVez) {
                                                                                                            fragment = new Blister_20Fragment();
                                                                                                            fTransaction = true;

                                                                                                        }
                                                                                                        else{
                                                                                                            primeraVez = preferences.getBoolean("primeravez_blister22", true); // por defecto es true
                                                                                                            if (primeraVez) {
                                                                                                                fragment = new Blister_21Fragment();
                                                                                                                fTransaction = true;

                                                                                                            }
                                                                                                            else{
                                                                                                                primeraVez = preferences.getBoolean("primeravez_blister23", true); // por defecto es true
                                                                                                                if (primeraVez) {
                                                                                                                    fragment = new Blister_22Fragment();
                                                                                                                    fTransaction = true;

                                                                                                                }
                                                                                                                else{
                                                                                                                    primeraVez = preferences.getBoolean("primeravez_blister24", true); // por defecto es true
                                                                                                                    if (primeraVez) {
                                                                                                                        fragment = new Blister_23Fragment();
                                                                                                                        fTransaction = true;

                                                                                                                    }
                                                                                                                    else{
                                                                                                                        primeraVez = preferences.getBoolean("primeravez_blister25", true); // por defecto es true
                                                                                                                        if (primeraVez) {
                                                                                                                            fragment = new Blister_24Fragment();
                                                                                                                            fTransaction = true;

                                                                                                                        }
                                                                                                                        else{
                                                                                                                            primeraVez = preferences.getBoolean("primeravez_blister26", true); // por defecto es true
                                                                                                                            if (primeraVez) {
                                                                                                                                fragment = new Blister_25Fragment();
                                                                                                                                fTransaction = true;

                                                                                                                            }
                                                                                                                            else{
                                                                                                                                primeraVez = preferences.getBoolean("primeravez_blister27", true); // por defecto es true
                                                                                                                                if (primeraVez) {
                                                                                                                                    fragment = new Blister_26Fragment();
                                                                                                                                    fTransaction = true;

                                                                                                                                }
                                                                                                                                else{
                                                                                                                                    primeraVez = preferences.getBoolean("primeravez_blister28", true); // por defecto es true
                                                                                                                                    if (primeraVez) {
                                                                                                                                        fragment = new Blister_27Fragment();
                                                                                                                                        fTransaction = true;

                                                                                                                                    }
                                                                                                                                    else{
                                                                                                                                        fragment = new Blister_28Fragment();
                                                                                                                                        fTransaction = true;
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
                                            }
                                        }

                                    }
                                }
                            }
                        }

} /*else if (id == R.id.nav_profile) {
                        Intent i = new Intent(MainLoginActivity.this, Profile.class);
                        startActivity(i);

                    }else if (id == R.id.nav_faqs) {
                        Intent i = new Intent(MainLoginActivity.this, FAQ.class);
                        startActivity(i);

                    }*/

                    if (fTransaction) {
                        getSupportFragmentManager().beginTransaction().addToBackStack(null);
                        getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment, fragment).commit();

                    }
                    item.setChecked(false);
                    Objects.requireNonNull(getSupportActionBar()).setTitle(item.getTitle());

                   // DrawerLayout drawer = findViewById(R.id.drawer_layout);
                    drawer.closeDrawer(GravityCompat.START);
                    return true;
                }
        );


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

/*    public void onclick(View view) {
        SharedPreferences preferences= getSharedPreferences("datos", Context.MODE_PRIVATE);
        SharedPreferences.Editor objEditor = preferences.edit();
        objEditor.putBoolean("primeravez_blister1", false); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
        objEditor.apply();
    }

    public void onclick2(View view) {
        SharedPreferences preferences= getSharedPreferences("datos", Context.MODE_PRIVATE);
        SharedPreferences.Editor objEditor = preferences.edit();
        objEditor.putBoolean("primeravez_blister2", false); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
        objEditor.apply();
    }*/
}