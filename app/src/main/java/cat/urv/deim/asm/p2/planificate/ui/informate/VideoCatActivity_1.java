package cat.urv.deim.asm.p2.planificate.ui.informate;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

import cat.urv.deim.asm.p2.planificate.R;

public class VideoCatActivity_1 extends AppCompatActivity {
    VideoView videoCat_1;
    MediaController controladorVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_cat_1);

        controladorVideo = new MediaController(this);
        videoCat_1 = findViewById(R.id.videoCat_1);

        //video 1
        String path = "android.resource://" + getPackageName() + "/" + R.raw.videocat_1;
        videoCat_1.setVideoURI(Uri.parse(path));
        videoCat_1.setMediaController(controladorVideo);
        controladorVideo.setAnchorView(videoCat_1);
        videoCat_1.start();


    }


}