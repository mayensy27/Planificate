package cat.urv.deim.asm.p2.planificate.ui.informate;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import cat.urv.deim.asm.p2.planificate.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link VideosCastFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class VideosCastFragment extends Fragment {

    VideoView videoCast_1,videoCast_2,videoCast_3;
    MediaController controladorVideo;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public VideosCastFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment VideosCastFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static VideosCastFragment newInstance(String param1, String param2) {
        VideosCastFragment fragment = new VideosCastFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_videos_cast, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        controladorVideo= new MediaController( getContext());
        videoCast_1 = view.findViewById(R.id.videoCast_1);
        videoCast_2 = view.findViewById(R.id.videoCast_2);


        //video 1
        String path ="android.resource://"+requireActivity().getPackageName()+"/"+ R.raw.videocast_1;
        videoCast_1.setVideoURI(Uri.parse(path));
        videoCast_1.setMediaController(controladorVideo);
        controladorVideo.setAnchorView(videoCast_1);
        videoCast_1.start();

        //Video 2
        videoCast_1.setOnCompletionListener(mp -> {
            videoCast_1.stopPlayback();
            String path2 ="android.resource://"+requireActivity().getPackageName()+"/"+ R.raw.videocast_1;
            videoCast_2.setVideoURI(Uri.parse(path2));
            videoCast_2.setMediaController(controladorVideo);
            controladorVideo.setAnchorView(videoCast_2);

            videoCast_2.start();
        });


/*

        //Video 3
        String path3 ="android.resource://"+requireActivity().getPackageName()+"/"+ R.raw.videocast_1;
        videoCast_2.setVideoURI(Uri.parse(path2));
        videoCast_2.setMediaController(controladorVideo);
        controladorVideo.setAnchorView(videoCast_2);

        videoCast_2.start();
*/

    }
}