package cat.urv.deim.asm.p2.planificate;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import cat.urv.deim.asm.p2.planificate.ui.main.SectionsPagerAdapter;

public class MainActivity extends AppCompatActivity {
    //    String texto;
    //    String texto2;
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

        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);
        FloatingActionButton fab = findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
}


