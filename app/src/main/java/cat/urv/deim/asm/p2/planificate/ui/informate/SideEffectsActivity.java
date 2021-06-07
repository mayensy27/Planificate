package cat.urv.deim.asm.p2.planificate.ui.informate;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

import cat.urv.deim.asm.p2.planificate.R;

public class SideEffectsActivity extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_side_effects);
        pdfView = findViewById(R.id.side_effects);

        //funcion para leer pdf desde Assets
        pdfView.fromAsset("side_effects.pdf").load();
    }
}