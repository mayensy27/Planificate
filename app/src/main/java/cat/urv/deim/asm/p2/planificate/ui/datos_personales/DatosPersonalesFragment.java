package cat.urv.deim.asm.p2.planificate.ui.datos_personales;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import cat.urv.deim.asm.p2.planificate.R;

public class DatosPersonalesFragment extends Fragment {

//    private DatosPersonalesViewModel galleryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
       /* galleryViewModel =
                new ViewModelProvider(this).get(DatosPersonalesViewModel.class);
        final TextView textView = root.findViewById(R.id.text_gallery);
        galleryViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });*/
        return inflater.inflate(R.layout.fragment_datos_personales, container, false);
    }



    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
/*

        WebView webView = view.findViewById(R.id.web_decisiones_compartidas);
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("http://decisionscompartides.gencat.cat/es/decidir-sobre/anticoncepcio_hormonal/opcions_tractament/anticonceptius_orals_combinats/");
*/
        Button ver_datos =view.findViewById(R.id.vermisdatos);
        Button actualizar_datos=view.findViewById(R.id.actualizarmisdatos);

        ver_datos.setOnClickListener(v -> {
            Intent i= new Intent(getContext(), DatosPersonalesUsuariaActivity.class);
            startActivity(i);
        });

        actualizar_datos.setOnClickListener(v -> {
            Intent i2=new Intent(getContext(),ActualizarDatosPersonalesActivity.class);
            startActivity(i2);
        });
    }

}