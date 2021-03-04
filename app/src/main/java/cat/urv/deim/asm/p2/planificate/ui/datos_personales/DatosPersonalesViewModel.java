package cat.urv.deim.asm.p2.planificate.ui.datos_personales;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DatosPersonalesViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public DatosPersonalesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Datos Personales fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}