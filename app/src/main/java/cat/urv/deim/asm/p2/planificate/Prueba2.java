package cat.urv.deim.asm.p2.planificate;

import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class Prueba2 extends AppCompatActivity {
    VideoView videoCast_2;
    MediaController controladorVideo;

    Button siguiente;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prueba2);

        controladorVideo= new MediaController( this);
        videoCast_2 = findViewById(R.id.videoCast_2);
        siguiente=findViewById(R.id.video_siguiente);


        //video 1
        String path ="android.resource://"+getPackageName()+"/"+ R.raw.videocast_1;
        videoCast_2.setVideoURI(Uri.parse(path));
        videoCast_2.setMediaController(controladorVideo);
        controladorVideo.setAnchorView(videoCast_2);
        videoCast_2.start();


    }




}