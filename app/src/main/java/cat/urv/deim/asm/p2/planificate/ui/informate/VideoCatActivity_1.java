package cat.urv.deim.asm.p2.planificate.ui.informate;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

import cat.urv.deim.asm.p2.planificate.R;

public class VideoCatActivity_1 extends AppCompatActivity {
    VideoView videoCat_1;
    MediaController controladorVideo;

    Button siguiente,documentacion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_cat_1);

        controladorVideo= new MediaController( this);
        videoCat_1 = findViewById(R.id.videoCat_1);
        siguiente=findViewById(R.id.video_siguiente);
        documentacion=findViewById(R.id.documentacion_cat);


        //video 1
        String path ="android.resource://"+getPackageName()+"/"+ R.raw.videocat_1;
        videoCat_1.setVideoURI(Uri.parse(path));
        videoCat_1.setMediaController(controladorVideo);
        controladorVideo.setAnchorView(videoCat_1);
        videoCat_1.start();


    }

    public void onclick(View view) {
        if(siguiente.isClickable()){
            Intent video_siguiente= new Intent(this, VideoCatActivity_2.class);
            startActivity(video_siguiente);
            //  finish();// me elimina la pantalla del prueba al tirar para atras!
        }

    }

    public void verDocumentacion(View view) {
        if (documentacion.isClickable()) {
            Intent ver_documentacion = new Intent(this, DocumentacionCatActivity.class);
            startActivity(ver_documentacion);
        }
    }
}