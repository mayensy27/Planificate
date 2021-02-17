package cat.urv.deim.asm.p2.planificate;

import android.app.Application;

public class InformacionGlobal extends Application {

    public static Boolean visto=false;


    public static void setVisto(Boolean visto) {
        InformacionGlobal.visto = visto;
    }

    public static Boolean getVisto() {
        return visto;
    }
}