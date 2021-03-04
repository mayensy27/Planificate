package cat.urv.deim.asm.p2.planificate.ui.alarmas;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AlarmasViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public AlarmasViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Alarmas fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}