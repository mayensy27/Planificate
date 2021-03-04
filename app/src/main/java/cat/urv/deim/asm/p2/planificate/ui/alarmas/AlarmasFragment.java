package cat.urv.deim.asm.p2.planificate.ui.alarmas;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import cat.urv.deim.asm.p2.planificate.R;

public class AlarmasFragment extends Fragment {

   // private AlarmasViewModel slideshowViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        /*slideshowViewModel =
                new ViewModelProvider(this).get(AlarmasViewModel.class);
        View root = inflater.inflate(R.layout.fragment_calendario, container, false);
        final TextView textView = root.findViewById(R.id.text_slideshow);
        slideshowViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;*/
        return inflater.inflate(R.layout.fragment_alarmas, container, false);
    }
}