package a;

import android.content.Context;
import android.widget.CompoundButton;
import com.omarea.Scene;
import com.omarea.vtools.activities.ActivityAutoClick;

/* loaded from: /tmp/jadx-9051527860862319108.dex */
public final /* synthetic */ class j5 implements CompoundButton.OnCheckedChangeListener {

    public j5(ActivityAutoClick p0) {
        this(p0, 0);
    }

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9a;
    public final /* synthetic */ ActivityAutoClick b;

    public /* synthetic */ j5(ActivityAutoClick activityAutoClick, int i) {
        this.f9a = i;
        this.b = activityAutoClick;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        kq0 kq0Var = kq0.c;
        int i = this.f9a;
        ActivityAutoClick activityAutoClick = this.b;
        switch (i) {
            case 0:
                gu0[] gu0VarArr = ActivityAutoClick.m;
                wv.w(activityAutoClick, "this$0");
                wv.w(compoundButton, "<anonymous parameter 0>");
                if (z) {
                    cp cpVar = Scene.c;
                    if (fs1.D().getBoolean("is_skip_ad_precise2", false)) {
                        Context context = activityAutoClick.getContext();
                        wv.w(context, "context");
                        wv.M0(kq0Var, z80.b, new xp(true, context, (ey) null), 2);
                        return;
                    }
                    return;
                }
                return;
            default:
                gu0[] gu0VarArr2 = ActivityAutoClick.m;
                wv.w(activityAutoClick, "this$0");
                wv.w(compoundButton, "<anonymous parameter 0>");
                if (z) {
                    Context context2 = activityAutoClick.getContext();
                    wv.w(context2, "context");
                    wv.M0(kq0Var, z80.b, new xp(true, context2, (ey) null), 2);
                    return;
                }
                return;
        }
    }
}
