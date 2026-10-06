package a;

import android.widget.CompoundButton;
import com.omarea.Scene;

/* loaded from: /tmp/jadx-9051527860862319108.dex */
public final /* synthetic */ class t40 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13a;

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        wv.w(compoundButton, "<anonymous parameter 0>");
        if (z) {
            cp cpVar = Scene.c;
            fs1.D().edit().putInt("wifi_mac_autochange_mode", this.f13a).apply();
        } else {
            cp cpVar2 = Scene.c;
            fs1.D().edit().remove("wifi_mac_autochange_mode").apply();
        }
    }
}
