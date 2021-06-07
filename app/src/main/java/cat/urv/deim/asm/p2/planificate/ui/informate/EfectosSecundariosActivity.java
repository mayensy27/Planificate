package cat.urv.deim.asm.p2.planificate.ui.informate;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

import cat.urv.deim.asm.p2.planificate.R;

public class EfectosSecundariosActivity extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_efectos_secundarios);

        pdfView = findViewById(R.id.efectos_secundarios);

        //funcion para leer pdf desde Assets
        pdfView.fromAsset("efectos_secundarios.pdf").load();
    }
}