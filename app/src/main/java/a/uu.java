package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class uu implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f608a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ uu(int i, java.lang.Object obj) {
        this.f608a = i;
        this.b = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
        switch (this.f608a) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                android.widget.CompoundButton.OnCheckedChangeListener onCheckedChangeListener = ((com.google.android.material.chip.Chip) this.b).onCheckedChangeListenerInternal;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z);
                    return;
                }
                return;
            case 1:
                a.x81 x81Var = (a.x81) this.b;
                a.wv.w(x81Var, "this$0");
                a.wv.w(compoundButton, "compoundButton");
                if (z) {
                    x81Var.a(compoundButton);
                    return;
                }
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                a.ij0 ij0Var = (a.ij0) this.b;
                a.wv.w(ij0Var, "$inputHandler");
                a.wv.w(compoundButton, "<anonymous parameter 0>");
                ij0Var.setValue(java.lang.Boolean.valueOf(z));
                return;
            case 3:
                com.omarea.vtools.activities.ActivityAppContents activityAppContents = (com.omarea.vtools.activities.ActivityAppContents) this.b;
                a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityAppContents.q;
                a.wv.w(activityAppContents, "this$0");
                a.wv.w(compoundButton, "<anonymous parameter 0>");
                if (activityAppContents.l != z) {
                    activityAppContents.l = z;
                    activityAppContents.getSharedPreferences("app_contents", 0).edit().putBoolean("show_all", z).apply();
                    activityAppContents.r(activityAppContents.o, activityAppContents.o());
                    return;
                }
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                com.omarea.vtools.activities.ActivityAppDetails activityAppDetails = (com.omarea.vtools.activities.ActivityAppDetails) this.b;
                a.gu0[] gu0VarArr2 = com.omarea.vtools.activities.ActivityAppDetails.X;
                a.wv.w(activityAppDetails, "this$0");
                a.wv.w(compoundButton, "<anonymous parameter 0>");
                activityAppDetails.r().setVisibility(z ? 0 : 8);
                if (((java.lang.Boolean) activityAppDetails.T.h.a()).booleanValue()) {
                    a.gu0[] gu0VarArr3 = com.omarea.vtools.activities.ActivityAppDetails.X;
                    ((android.widget.LinearLayout) activityAppDetails.q.a(gu0VarArr3[15])).setVisibility(((android.widget.LinearLayout) activityAppDetails.o.a(gu0VarArr3[13])).getVisibility());
                    return;
                }
                return;
            case 5:
                com.omarea.vtools.activities.ActivityChargeControl activityChargeControl = (com.omarea.vtools.activities.ActivityChargeControl) this.b;
                a.gu0[] gu0VarArr4 = com.omarea.vtools.activities.ActivityChargeControl.L;
                a.wv.w(activityChargeControl, "this$0");
                a.wv.w(compoundButton, "<anonymous parameter 0>");
                a.gu0[] gu0VarArr5 = com.omarea.vtools.activities.ActivityChargeControl.L;
                ((android.widget.LinearLayout) activityChargeControl.e.a(gu0VarArr5[1])).setVisibility(z ? 0 : 8);
                if (z) {
                    return;
                }
                ((android.widget.Switch) activityChargeControl.j.a(gu0VarArr5[6])).setChecked(false);
                android.content.SharedPreferences sharedPreferences = activityChargeControl.H;
                if (sharedPreferences != null) {
                    sharedPreferences.edit().putBoolean("sleep_time", false).apply();
                    return;
                } else {
                    a.wv.M1("spf");
                    throw null;
                }
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                com.omarea.vtools.activities.ActivityProcess activityProcess = (com.omarea.vtools.activities.ActivityProcess) this.b;
                a.gu0[] gu0VarArr6 = com.omarea.vtools.activities.ActivityProcess.x;
                a.wv.w(activityProcess, "this$0");
                a.wv.w(compoundButton, "<anonymous parameter 0>");
                if (activityProcess.n == z) {
                    activityProcess.q();
                    return;
                }
                activityProcess.n = z;
                activityProcess.getSharedPreferences("process_manager", 0).edit().putBoolean("group_mode", z).apply();
                activityProcess.q();
                java.util.ArrayList<com.omarea.model.ProcessInfo> arrayList = activityProcess.r;
                if (arrayList == null) {
                    return;
                }
                if (z) {
                    com.omarea.ui.procs.ProcessGroupView u = activityProcess.u();
                    u.i(activityProcess.o);
                    int i = activityProcess.p;
                    if (u.k != i) {
                        u.k = i;
                        u.g();
                    }
                    int i2 = activityProcess.q;
                    if (u.l != i2) {
                        u.l = i2;
                        u.g();
                    }
                    u.setList(arrayList);
                    return;
                }
                a.nj njVar = activityProcess.m;
                if (njVar != null) {
                    java.lang.String str = activityProcess.o;
                    a.wv.w(str, "keywords");
                    njVar.h = str;
                    njVar.s();
                    njVar.i = activityProcess.p;
                    njVar.s();
                    njVar.j = activityProcess.q;
                    njVar.s();
                    njVar.g = arrayList;
                    njVar.r();
                    njVar.s();
                    return;
                }
                return;
            default:
                com.omarea.vtools.activities.ActivityThreadsStat activityThreadsStat = (com.omarea.vtools.activities.ActivityThreadsStat) this.b;
                a.gu0[] gu0VarArr7 = com.omarea.vtools.activities.ActivityThreadsStat.s;
                a.wv.w(activityThreadsStat, "this$0");
                a.wv.w(compoundButton, "<anonymous parameter 0>");
                if (activityThreadsStat.p != z) {
                    activityThreadsStat.p = z;
                    activityThreadsStat.o();
                    return;
                }
                return;
        }
    }
}
