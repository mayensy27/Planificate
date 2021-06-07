package cat.urv.deim.asm.p2.planificate.ui.informate;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

import cat.urv.deim.asm.p2.planificate.R;

public class DocumentacionInglesActivity extends AppCompatActivity {

    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_documentacion_ingles);

        pdfView = findViewById(R.id.documentacion_inf_ingles_1);

        //funcion para leer pdf desde Assets
        pdfView.fromAsset("oblits_ingles.pdf").load();


    }

}