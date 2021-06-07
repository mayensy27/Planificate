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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_cast_1);

        controladorVideo = new MediaController(this);
        videoCast_1 = findViewById(R.id.videoCast_1);

        //video 1
        String path = "android.resource://" + getPackageName() + "/" + R.raw.videocast_1;
        videoCast_1.setVideoURI(Uri.parse(path));
        videoCast_1.setMediaController(controladorVideo);
        controladorVideo.setAnchorView(videoCast_1);
        videoCast_1.start();


    }


}