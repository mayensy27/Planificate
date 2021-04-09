package cat.urv.deim.asm.p2.planificate.ui.informate;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

import cat.urv.deim.asm.p2.planificate.R;

public class DocumentacionCatActivity extends AppCompatActivity {
   /* private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter viewPagerAdapter;*/
   PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_documentacion_cat);


        pdfView= findViewById(R.id.documentacion_inf_cat_1);

        //funcion para leer pdf desde Assets
        pdfView.fromAsset("oblits_catala.pdf").load();

     /*   setUpView();
        setUpViewPagerAdapter();*/
    }
/*

    private void setUpViewPagerAdapter() {
        viewPagerAdapter.addFragment(new DocumentCat_1Fragment(), "Oblit_1");
        viewPagerAdapter.addFragment(new DocumentCat_2Fragment(), "Oblit_2");

        viewPager.setAdapter(viewPagerAdapter);

        tabLayout.setupWithViewPager(viewPager);
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) { // tab seleccionado
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) { //tab que se ha deseleccionado

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    private void setUpView() {

        tabLayout=findViewById(R.id.tabLayout);
        viewPager=findViewById(R.id.viewPager);
        viewPagerAdapter= new ViewPagerAdapter(getSupportFragmentManager());

    }
*/

}