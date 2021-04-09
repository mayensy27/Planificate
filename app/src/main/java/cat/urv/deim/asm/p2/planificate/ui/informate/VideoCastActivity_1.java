package cat.urv.deim.asm.p2.planificate.ui.informate;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

import cat.urv.deim.asm.p2.planificate.R;

public class VideoCastActivity_1 extends AppCompatActivity {
    VideoView videoCast_1;
    MediaController controladorVideo;

    //Button siguiente,documentacion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_cast_1);

        controladorVideo= new MediaController( this);
        videoCast_1 = findViewById(R.id.videoCast_1);
       /* siguiente=findViewById(R.id.video_siguiente);
        documentacion=findViewById(R.id.documentacion_cast);*/


        //video 1
        String path ="android.resource://"+getPackageName()+"/"+ R.raw.videocast_1;
        videoCast_1.setVideoURI(Uri.parse(path));
        videoCast_1.setMediaController(controladorVideo);
        controladorVideo.setAnchorView(videoCast_1);
        videoCast_1.start();


    }

 /*   public void onclick(View view) {
        if(siguiente.isClickable()){
        Intent video_siguiente= new Intent(this, VideoCastActivity_2.class);
        startActivity(video_siguiente);
   //  finish();// me elimina la pantalla del prueba al tirar para atras!
    }

    }

    public void verDocumentacion(View view) {
        if (documentacion.isClickable()) {
            Intent ver_documentacion = new Intent(this, DocumentacionCastActivity.class);
            startActivity(ver_documentacion);
        }
    }*/
}