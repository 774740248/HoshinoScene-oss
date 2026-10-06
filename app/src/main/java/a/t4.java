package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class t4 implements java.lang.Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityAppXposedConfig d;

    public /* synthetic */ t4(com.omarea.vtools.activities.ActivityAppXposedConfig activityAppXposedConfig, int i) {
        this.c = i;
        this.d = activityAppXposedConfig;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        com.omarea.vtools.activities.ActivityAppXposedConfig activityAppXposedConfig = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityAppXposedConfig.o;
                a.wv.w(activityAppXposedConfig, "this$0");
                com.omarea.vtools.activities.ActivityAppXposedConfig.q(activityAppXposedConfig);
                return;
            default:
                a.gu0[] gu0VarArr2 = com.omarea.vtools.activities.ActivityAppXposedConfig.o;
                a.wv.w(activityAppXposedConfig, "this$0");
                a.b81 b81Var = activityAppXposedConfig.g;
                if (b81Var == null) {
                    a.wv.M1("processBarDialog");
                    throw null;
                }
                b81Var.a();
                java.util.ArrayList arrayList = activityAppXposedConfig.j;
                com.omarea.common.ui.OverScrollListView p = activityAppXposedConfig.p();
                a.cp cpVar = com.omarea.Scene.c;
                a.fs1.L(new a.ua0(p, activityAppXposedConfig, arrayList, 11));
                return;
        }
    }
}
