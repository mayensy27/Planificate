package cat.urv.deim.asm.p2.planificate.ui.datos_personales;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;

import cat.urv.deim.asm.p2.planificate.R;
import cat.urv.deim.asm.p2.planificate.SplashActivity;

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
        Button borrar_datos=view.findViewById(R.id.borrarmisdatos);

        ver_datos.setOnClickListener(v -> {
            Intent i= new Intent(getContext(), DatosPersonalesUsuariaActivity.class);
            startActivity(i);
        });

        actualizar_datos.setOnClickListener(v -> {
            Intent i2=new Intent(getContext(),ActualizarDatosPersonalesActivity.class);
            startActivity(i2);
        });

        borrar_datos.setOnClickListener(v -> {
            FirebaseAuth.getInstance().signOut();

            GoogleSignIn.getClient(requireActivity().getApplicationContext(), new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).build()).signOut()
                    .addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            Intent i=new Intent(requireContext().getApplicationContext(), SplashActivity.class);
                            startActivity(i);

                            SharedPreferences preferences = requireActivity().getSharedPreferences("datos", Context.MODE_PRIVATE);
                            SharedPreferences.Editor objEditor = preferences.edit();
                            objEditor.putBoolean("primeravez", true); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
                            objEditor.apply();
                            objEditor.putBoolean("registrada", true); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
                            objEditor.apply();
                            objEditor.putBoolean("signup_google", true);
                            objEditor.apply();

                            objEditor.putString("nombre_usuaria",""); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
                            objEditor.apply();
                            objEditor.putString("email_usuaria",""); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
                            objEditor.apply();
                            objEditor.putString("telefono_usuaria",""); // dado que a partir de ahora no será la pirmera vez, lo ponemos false
                            objEditor.apply();
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Toast.makeText(requireContext().getApplicationContext(),"Signout Failed",Toast.LENGTH_SHORT).show();
                }
            });
        });

    }

}