package cat.urv.deim.asm.p2.planificate.ui.informate;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import cat.urv.deim.asm.p2.planificate.R;

public class InformateFragment extends Fragment {

   // private InformateViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
    /*  homeViewModel =
                new ViewModelProvider(this).get(InformateViewModel.class);

      final TextView textView = root.findViewById(R.id.text_home);
        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });*/
//        return root;
       return inflater.inflate(R.layout.fragment_informate, container, false);
    }

}