package cat.urv.deim.asm.p2.planificate;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

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

import com.google.android.material.navigation.NavigationView;

import java.util.Objects;

import cat.urv.deim.asm.p2.planificate.ui.alarmas.AlarmasFragment;
import cat.urv.deim.asm.p2.planificate.ui.blister21.Blister21Fragment;
import cat.urv.deim.asm.p2.planificate.ui.blister28.BlisterFragment;
import cat.urv.deim.asm.p2.planificate.ui.calendario.CaledarioFragment;
import cat.urv.deim.asm.p2.planificate.ui.datos_personales.DatosPersonalesFragment;
import cat.urv.deim.asm.p2.planificate.ui.informate.InformateFragment;

import static cat.urv.deim.asm.p2.planificate.NotificationHelper.NOTIFICATION_ID;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);

//ASIGNACION DEL NOMBRE DE LA USUARIA AL APARTADO DEL MENU
        View hView = navigationView.getHeaderView(0);
        TextView hola = hView.findViewById(R.id.hola);


        hola.setText("¡ Hola,\n" + " bienvenida!");


//Se quita la tinta iconos; Permite visualizar los iconos del menu con sus respectivos colores (si no se pone, estos salen en negro)
        navigationView.setItemIconTintList(null);


        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(         //Aqui si cargan los id de los fragmentos que seran mostrados en pantalla
                R.id.nav_informate, R.id.nav_datos_personales, R.id.nav_calendario, R.id.nav_alarmas, R.id.nav_blister, R.id.nav_informate)
                .setDrawerLayout(drawer)
                .build();

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);

        //*PARA QUE DESAPAREZCA LA NOTIFICACION
        NotificationManagerCompat notificationManagerCompat = NotificationManagerCompat.from(getApplicationContext());
        notificationManagerCompat.cancel(NOTIFICATION_ID);

        navigationView.setNavigationItemSelectedListener(
                item -> {
                    int id = item.getItemId();
                    boolean fTransaction = false;
                    Fragment fragment = null;

                    //Fragmento INFORMATE!
                    if (id == R.id.nav_informate) {
                        fragment = new InformateFragment();
                        fTransaction = true;
                    }

                    //Fragmento DATOS!
                    else if (id == R.id.nav_datos_personales) {
                        fragment = new DatosPersonalesFragment();
                        fTransaction = true;

                        //Fragmento CALENDARIO!
                    } else if (id == R.id.nav_calendario) {
                        fragment = new CaledarioFragment();
                        fTransaction = true;

                        //Fragmento ALARMAS!
                    } else if (id == R.id.nav_alarmas) {
                        fragment = new AlarmasFragment();
                        fTransaction = true;

                        //Fragmento BILSTER!
                    } else if (id == R.id.nav_blister) {
                        SharedPreferences tipos_pildoras_comprimidos = getSharedPreferences("tipos_pildoras_comprimidos", Context.MODE_PRIVATE);
                        String texto = tipos_pildoras_comprimidos.getString("tipo_comprimidos", "zz"); // por defecto es true

                        if (texto.equals("Blíster 28.")) {
                            fragment = new BlisterFragment();
                        } else {
                            fragment = new Blister21Fragment();
                        }
                        fTransaction = true;

                    }
                    if (fTransaction) {
                        getSupportFragmentManager().beginTransaction().addToBackStack(null);
                        getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment, fragment).commit();

                    }
                    item.setChecked(false);
                    Objects.requireNonNull(getSupportActionBar()).setTitle(item.getTitle());

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

}