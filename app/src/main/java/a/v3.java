package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class v3 implements java.lang.Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityAppConfig2 d;

    public /* synthetic */ v3(com.omarea.vtools.activities.ActivityAppConfig2 activityAppConfig2, int i) {
        this.c = i;
        this.d = activityAppConfig2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        com.omarea.vtools.activities.ActivityAppConfig2 activityAppConfig2 = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityAppConfig2.s;
                a.wv.w(activityAppConfig2, "this$0");
                a.au auVar = activityAppConfig2.n;
                auVar.getClass();
                try {
                    auVar.getWritableDatabase().execSQL("update scene_config3 set alone_light = 0, fg_cgroup_mem = '', screen_orientation = ?, bg_cgroup_mem = '', dynamic_boost_mem = 0, show_monitor = 0", new java.lang.Object[]{-1});
                } catch (java.lang.Exception unused) {
                }
                activityAppConfig2.s().edit().clear().apply();
                new a.pm(21).y();
                activityAppConfig2.recreate();
                return;
            default:
                a.b81 b81Var = activityAppConfig2.i;
                if (b81Var == null) {
                    a.wv.M1("processBarDialog");
                    throw null;
                }
                b81Var.a();
                java.util.ArrayList arrayList = activityAppConfig2.m;
                android.widget.ListView r = activityAppConfig2.r();
                a.cp cpVar = com.omarea.Scene.c;
                a.fs1.L(new a.ua0(r, activityAppConfig2, arrayList, 9));
                return;
        }
    }
}
