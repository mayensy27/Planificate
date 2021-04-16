package cat.urv.deim.asm.p2.planificate.ui.informate;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;


/*ADAPTADOR PARA EL APARTADO DE DOCUMENTACION (FORMA DESLIZANTE)*/
public class ViewPagerAdapter extends FragmentPagerAdapter {
    @NonNull

    private List<Fragment> fragments= new ArrayList<>();
    private List<String> fragmentsTitles=new ArrayList<>();

    public ViewPagerAdapter (FragmentManager fragmentManager){
        super(fragmentManager);
    }
    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    public  CharSequence getPageTitle (int position){
        return fragmentsTitles.get(position);
    }

    public void addFragment (Fragment fragment, String title){
        fragments.add(fragment);
        fragmentsTitles.add(title);

    }
}