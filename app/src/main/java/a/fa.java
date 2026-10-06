package a;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.view.View;
import android.widget.CompoundButton;
import com.omarea.common.ui.SeekBar;
import com.omarea.vtools.activities.ActivityFreezeApps;

/* loaded from: /tmp/jadx-9051527860862319108.dex */
public final /* synthetic */ class fa implements View.OnClickListener {

    public fa() {
        this(null, null, null, null, null, null, null, null, false);
    }
    public final /* synthetic */ v60 c;
    public final /* synthetic */ CompoundButton d;
    public final /* synthetic */ ActivityFreezeApps e;
    public final /* synthetic */ CompoundButton f;
    public final /* synthetic */ SeekBar g;
    public final /* synthetic */ CompoundButton h;
    public final /* synthetic */ PackageManager i;
    public final /* synthetic */ ComponentName j;
    public final /* synthetic */ boolean k;

    public /* synthetic */ fa(v60 v60Var, CompoundButton compoundButton, ActivityFreezeApps activityFreezeApps, CompoundButton compoundButton2, SeekBar seekBar, CompoundButton compoundButton3, PackageManager packageManager, ComponentName componentName, boolean z) {
        this.c = v60Var;
        this.d = compoundButton;
        this.e = activityFreezeApps;
        this.f = compoundButton2;
        this.g = seekBar;
        this.h = compoundButton3;
        this.i = packageManager;
        this.j = componentName;
        this.k = z;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ActivityFreezeApps.freezeSettingsDialog$lambda$30(this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, view);
    }
}
