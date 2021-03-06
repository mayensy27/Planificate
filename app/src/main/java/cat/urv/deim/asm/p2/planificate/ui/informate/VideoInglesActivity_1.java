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

public class VideoInglesActivity_1 extends AppCompatActivity {
    VideoView videoIngles_1;
    MediaController controladorVideo;

    Button siguiente;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_ingles_1);

        controladorVideo= new MediaController( this);
        videoIngles_1 = findViewById(R.id.videoIngles_1);
        siguiente=findViewById(R.id.video_siguiente);


        //video 1
        String path ="android.resource://"+getPackageName()+"/"+ R.raw.videoingles_1;
        videoIngles_1.setVideoURI(Uri.parse(path));
        videoIngles_1.setMediaController(controladorVideo);
        controladorVideo.setAnchorView(videoIngles_1);
        videoIngles_1.start();


    }

    public void onclick(View view) {
        if (siguiente.isClickable()) {
            Intent video_siguiente = new Intent(this, VideoInglesActivity_2.class);
            startActivity(video_siguiente);
            //  finish();// me elimina la pantalla del prueba al tirar para atras!
        }

    }
}