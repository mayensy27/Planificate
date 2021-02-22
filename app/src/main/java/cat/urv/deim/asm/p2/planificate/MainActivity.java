package cat.urv.deim.asm.p2.planificate;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
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

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

import cat.urv.deim.asm.p2.planificate.ui.gallery.GalleryFragment;
import cat.urv.deim.asm.p2.planificate.ui.home.HomeFragment;
import cat.urv.deim.asm.p2.planificate.ui.slideshow.SlideshowFragment;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    Boolean primeraVez;

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
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow,R.id.nav_blister,R.id.nav_blister1,R.id.nav_blister2)
                .setDrawerLayout(drawer)
                .build();

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);

        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {


                    @Override
                    public boolean onNavigationItemSelected(@NotNull MenuItem item) {
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
                            else{

                                primeraVez = preferences.getBoolean("primeravez_blister2", true); // por defecto es true
                                if(primeraVez) {
                                    fragment = new Blister_1Fragment();
                                    fTransaction = true;

                                }
                               else{
                                    fragment = new Blister_2Fragment();
                                    fTransaction = true;
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

/*
    public void onclick(View view) {
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