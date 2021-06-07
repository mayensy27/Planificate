package cat.urv.deim.asm.p2.planificate.ui.alarmas;

import android.annotation.SuppressLint;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.Calendar;

import cat.urv.deim.asm.p2.planificate.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AlarmasFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AlarmasFragment extends Fragment {


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";


    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public AlarmasFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment AlarmasFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static AlarmasFragment newInstance(String param1, String param2) {
        AlarmasFragment fragment = new AlarmasFragment();
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
        return inflater.inflate(R.layout.fragment_alarmas, container, false);
    }


    @SuppressLint("SetTextI18n")
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView notificationsTime;
        int alarmID = 1;
        SharedPreferences settings;

        settings = requireActivity().getSharedPreferences(getString(R.string.app_name), Context.MODE_PRIVATE);

        String hour, minute;

        hour = settings.getString("hour", "");
        minute = settings.getString("minute", "");

        notificationsTime = view.findViewById(R.id.notifications_time);

        if (hour.length() > 0) {
            notificationsTime.setText(hour + ":" + minute);
        }

        view.findViewById(R.id.change_notification).setOnClickListener(view1 -> {
            Calendar mcurrentTime = Calendar.getInstance();
            int hour1 = mcurrentTime.get(Calendar.HOUR_OF_DAY);
            int minute1 = mcurrentTime.get(Calendar.MINUTE);
            TimePickerDialog mTimePicker = new TimePickerDialog(getContext(), (timePicker, selectedHour, selectedMinute) -> {
                String finalHour, finalMinute;

                finalHour = "" + selectedHour;
                finalMinute = "" + selectedMinute;
                if (selectedHour < 10) finalHour = "0" + selectedHour;
                if (selectedMinute < 10) finalMinute = "0" + selectedMinute;
                notificationsTime.setText(finalHour + ":" + finalMinute);

                Calendar today = Calendar.getInstance();

                today.set(Calendar.HOUR_OF_DAY, selectedHour);
                today.set(Calendar.MINUTE, selectedMinute);
                today.set(Calendar.SECOND, 0);

                SharedPreferences.Editor edit = settings.edit();
                edit.putString("hour", finalHour);
                edit.putString("minute", finalMinute);

                //SAVE ALARM TIME TO USE IT IN CASE OF REBOOT
                edit.putInt("alarmID", alarmID);
                edit.putLong("alarmTime", today.getTimeInMillis());

                edit.apply();

                Toast.makeText(getContext(), getString(R.string.changed_to, finalHour + ":" + finalMinute), Toast.LENGTH_LONG).show();

                Utils.setAlarm(alarmID, today.getTimeInMillis(), requireActivity());

            }, hour1, minute1, true);//Yes 24 hour time
            mTimePicker.setTitle(getString(R.string.select_time));
            mTimePicker.show();

        });

    }
}