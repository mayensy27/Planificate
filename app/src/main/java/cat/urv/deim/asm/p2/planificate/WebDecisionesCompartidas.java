package cat.urv.deim.asm.p2.planificate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class WebDecisionesCompartidas extends AppCompatActivity {

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_decisiones_compartidas);

        WebView webView = findViewById(R.id.web_decisiones_compartidas);
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("http://decisionscompartides.gencat.cat/ca/decidir-sobre/anticoncepcio/");

    }

}