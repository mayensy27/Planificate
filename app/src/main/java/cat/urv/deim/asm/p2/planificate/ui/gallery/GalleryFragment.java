package cat.urv.deim.asm.p2.planificate.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import cat.urv.deim.asm.p2.planificate.R;

public class GalleryFragment extends Fragment {

//    private GalleryViewModel galleryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
       /* galleryViewModel =
                new ViewModelProvider(this).get(GalleryViewModel.class);
        final TextView textView = root.findViewById(R.id.text_gallery);
        galleryViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });*/
        return inflater.inflate(R.layout.fragment_gallery, container, false);
    }
}