package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class m3 implements java.lang.Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityAddinOnline d;
    public final /* synthetic */ int e;

    public /* synthetic */ m3(com.omarea.vtools.activities.ActivityAddinOnline activityAddinOnline, int i, int i2) {
        this.c = i2;
        this.d = activityAddinOnline;
        this.e = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        boolean z = false;
        int i2 = this.e;
        com.omarea.vtools.activities.ActivityAddinOnline activityAddinOnline = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.wv.w(activityAddinOnline, "this$0");
                activityAddinOnline.getWindow().setStatusBarColor(i2);
                a.ju1 h = a.jq1.h(activityAddinOnline.getWindow().getDecorView());
                if (h == null) {
                    return;
                }
                if (android.graphics.Color.red(i2) > 180 && android.graphics.Color.green(i2) > 180 && android.graphics.Color.blue(i2) > 180) {
                    z = true;
                }
                h.b(z);
                return;
            default:
                a.wv.w(activityAddinOnline, "this$0");
                activityAddinOnline.getWindow().setNavigationBarColor(i2);
                a.ju1 h2 = a.jq1.h(activityAddinOnline.getWindow().getDecorView());
                if (h2 == null) {
                    return;
                }
                if (android.graphics.Color.red(i2) > 180 && android.graphics.Color.green(i2) > 180 && android.graphics.Color.blue(i2) > 180) {
                    z = true;
                }
                h2.a(z);
                return;
        }
    }
}
