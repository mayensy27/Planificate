package cat.urv.deim.asm.p2.planificate.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import cat.urv.deim.asm.p2.planificate.AlarmasAcosFragment;
import cat.urv.deim.asm.p2.planificate.BlisterFragment;
import cat.urv.deim.asm.p2.planificate.CalendarioFragment;
import cat.urv.deim.asm.p2.planificate.DatosPersonalesFragment;
import cat.urv.deim.asm.p2.planificate.InformacionWebFragment;
import cat.urv.deim.asm.p2.planificate.R;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.Blister, R.string.Pagina_Informacion,
    R.string.Calendario,R.string.Datos_Personales,R.string.Alarma};

    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    //ME DEVUELVE EL FRAGMENTO QUE ESTA EN AQUELLA POSICION
    @Override
    public Fragment getItem(int position) {
        /*// getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        return PlaceholderFragment.newInstance(position + 1);*/

        Fragment fragment=null;
        switch (position){
            case 0:
                fragment=new BlisterFragment();
                break;
            case 1:
                fragment=new InformacionWebFragment();
                break;
            case 2:
                fragment=new DatosPersonalesFragment();
                break;
            case 3:
                fragment=new CalendarioFragment();
                break;
            case 4:
                fragment=new AlarmasAcosFragment();
                break;
        }
        return fragment;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }


    // DEVUELVE EL TOTAL DE LAS PAGINAS(PESTAÑAS)
    @Override
    public int getCount() {
        // Show 5 total pages.
        return 5;
    }
}