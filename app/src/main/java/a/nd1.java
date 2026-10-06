package a;

import android.widget.Toast;
import com.omarea.Scene;

/* loaded from: /tmp/jadx-9051527860862319108.dex */
public final /* synthetic */ class nd1 implements Runnable {

    public nd1() {
        this(0, 0);
    }
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ nd1(int i, int i2) {
        this.c = i;
        this.d = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cp cpVar = Scene.c;
        Toast.makeText(fs1.t(), this.c, this.d).show();
    }
}
