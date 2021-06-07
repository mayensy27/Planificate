package cat.urv.deim.asm.p2.planificate.ui.informate;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

import cat.urv.deim.asm.p2.planificate.R;

public class EfectesSecundarisActivity extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_efectes_secundaris);
        pdfView = findViewById(R.id.efectes_secundaris);

        //funcion para leer pdf desde Assets
        pdfView.fromAsset("efectes_secundaris.pdf").load();
    }
}