package cat.urv.deim.asm.p2.planificate;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class Prueba extends AppCompatActivity {
    VideoView videoCast_1;
    MediaController controladorVideo;

    Button siguiente;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prueba);

        controladorVideo= new MediaController( this);
        videoCast_1 = findViewById(R.id.videoCast_1);
        siguiente=findViewById(R.id.video_siguiente);


        //video 1
        String path ="android.resource://"+getPackageName()+"/"+ R.raw.videocast_1;
        videoCast_1.setVideoURI(Uri.parse(path));
        videoCast_1.setMediaController(controladorVideo);
        controladorVideo.setAnchorView(videoCast_1);
        videoCast_1.start();


    }

    public void onclick(View view) {
        if(siguiente.isClickable()){
        Intent video_siguiente= new Intent(this,Prueba2.class);
        startActivity(video_siguiente);
     finish();// me elimina la pantalla del prueba al tirar para atras!
    }

    }
}