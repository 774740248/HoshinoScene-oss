package a;

import android.text.Editable;
import com.omarea.vtools.activities.ActivityApplications;

/* loaded from: /tmp/jadx-9051527860862319108.dex */
public final /* synthetic */ class z4 implements Runnable {

    public z4() {
        this(null, 0L, null, null);
    }
    public final /* synthetic */ la1 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ ActivityApplications e;
    public final /* synthetic */ ma1 f;

    public /* synthetic */ z4(la1 la1Var, long j, ActivityApplications activityApplications, ma1 ma1Var) {
        this.c = la1Var;
        this.d = j;
        this.e = activityApplications;
        this.f = ma1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gu0[] gu0VarArr = ActivityApplications.n;
        la1 la1Var = this.c;
        wv.w(la1Var, "$lastInput");
        ActivityApplications activityApplications = this.e;
        wv.w(activityApplications, "this$0");
        ma1 ma1Var = this.f;
        wv.w(ma1Var, "$appState");
        if (la1Var.c == this.d) {
            Editable text = activityApplications.o().getText();
            wv.v(text, "apps_search_box.text");
            activityApplications.q(text, (rk0) ma1Var.c);
        }
    }
}
