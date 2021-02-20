package cat.urv.deim.asm.p2.planificate;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;


import cat.urv.deim.asm.p2.planificate.ui.main.SectionsPagerAdapter;

public class MainActivity extends AppCompatActivity{
    //    String texto;
    //    String texto2;
    Fragment blisterFragment1=new BlisterFragment1();
    Fragment blisterFragment2=new BlisterFragment2();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /*///////////////////////////    VISUALIZACION/COMPROBACION QUE SE GUARDA OPCION SPINNER (PILDORAS/COMPRIMIDOS))
        TextView x1= findViewById(R.id.textView);
        SharedPreferences tipos_pildoras_comprimidos = getSharedPreferences("tipos_pildoras_comprimidos", Context.MODE_PRIVATE);
        texto= tipos_pildoras_comprimidos.getString("tipo_pildora", "zz"); // por defecto es true
        x1.setText(texto);
        TextView x2= findViewById(R.id.textView2);
        texto= tipos_pildoras_comprimidos.getString("tipo_comprimidos", "zz"); // por defecto es true
        x2.setText(texto);
////////////////////////////////////////////////////////////////////////////////*/

        //Se cargan los diferentes fragmentos (pantallas) en la pantalla que observa el espectador
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);

        //Se genera los tab's
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);
        tabs.setTabMode(TabLayout.MODE_SCROLLABLE); //Para que los tabs salgan en una linea!!


        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(view -> Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show());


//        getSupportFragmentManager().beginTransaction().add(R.id.view_pager,blisterFragment).commit();

    }


    public void pulsar_blister0(View view) {
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.linearLayout,blisterFragment1);
            fragmentTransaction.commit();

    }

    public void pulsar_blister1(View view) {
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.linearLayout1,blisterFragment2);
        fragmentTransaction.commit();

    }
}




