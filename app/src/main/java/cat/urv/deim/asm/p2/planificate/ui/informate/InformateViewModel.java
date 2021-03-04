package cat.urv.deim.asm.p2.planificate.ui.informate;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class InformateViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public InformateViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Informate fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}