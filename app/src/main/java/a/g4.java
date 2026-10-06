package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class g4 extends a.uu0 implements a.fp0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ java.lang.Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g4(int i, java.lang.Object obj) {
        super(2);
        this.d = i;
        this.e = obj;
    }

    public final void a(a.mg1 mg1Var) {
        int i = this.d;
        java.lang.Object obj = this.e;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.wv.w(mg1Var, "item");
                com.omarea.vtools.activities.ActivityAppContents activityAppContents = (com.omarea.vtools.activities.ActivityAppContents) obj;
                activityAppContents.k = mg1Var.b;
                activityAppContents.q();
                return;
            case 1:
            default:
                a.wv.w(mg1Var, "item");
                a.bn0 bn0Var = (a.bn0) obj;
                java.lang.String string = bn0Var.v0.getString("*", a.b11.l);
                java.lang.String str = mg1Var.b;
                if (a.wv.e(string, str)) {
                    return;
                }
                bn0Var.v0.edit().putString("*", str).apply();
                java.util.ArrayList arrayList = a.dc0.f93a;
                a.dc0.a(a.kc0.v, null);
                a.cp cpVar = com.omarea.Scene.c;
                if (a.fs1.D().getBoolean("daemon_auto", true)) {
                    a.q10.A("custom-cache");
                    return;
                }
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                a.wv.w(mg1Var, "<anonymous parameter 0>");
                com.omarea.vtools.activities.ActivityAppXposedConfig.q((com.omarea.vtools.activities.ActivityAppXposedConfig) obj);
                return;
            case 3:
                a.wv.w(mg1Var, "item");
                com.omarea.vtools.activities.ActivityModules activityModules = (com.omarea.vtools.activities.ActivityModules) obj;
                java.lang.String str2 = activityModules.m;
                java.lang.String str3 = mg1Var.b;
                if (a.wv.e(str3, str2)) {
                    return;
                }
                activityModules.m = str3;
                activityModules.r();
                return;
        }
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.nh nhVar;
        a.no1 no1Var = a.no1.f387a;
        switch (this.d) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                ((java.lang.Number) obj2).intValue();
                a((a.mg1) obj);
                return no1Var;
            case 1:
                ((java.lang.Number) obj).intValue();
                ((java.lang.Boolean) obj2).booleanValue();
                com.omarea.vtools.activities.ActivityAppRetrieve activityAppRetrieve = (com.omarea.vtools.activities.ActivityAppRetrieve) this.e;
                a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityAppRetrieve.k;
                android.widget.CheckBox checkBox = (android.widget.CheckBox) activityAppRetrieve.q().findViewById(2131363081);
                if (checkBox != null) {
                    java.lang.ref.WeakReference weakReference = activityAppRetrieve.h;
                    boolean z = false;
                    if (weakReference != null && (nhVar = (a.nh) weakReference.get()) != null && nhVar.a()) {
                        z = true;
                    }
                    checkBox.setChecked(z);
                }
                com.omarea.vtools.activities.ActivityAppRetrieve.o(activityAppRetrieve);
                return no1Var;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                ((java.lang.Number) obj2).intValue();
                a((a.mg1) obj);
                return no1Var;
            case 3:
                ((java.lang.Number) obj2).intValue();
                a((a.mg1) obj);
                return no1Var;
            default:
                ((java.lang.Number) obj2).intValue();
                a((a.mg1) obj);
                return no1Var;
        }
    }
}
