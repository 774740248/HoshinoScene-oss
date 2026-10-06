package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class jp1 extends a.uu0 implements a.qo0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ java.lang.Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jp1(int i, int i2, java.lang.Object obj) {
        super(0);
        this.d = i2;
        this.f = obj;
        this.e = i;
    }

    public final android.view.View a() {
        int i = this.d;
        int i2 = this.e;
        java.lang.Object obj = this.f;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                android.view.View findViewById = ((android.app.Activity) obj).findViewById(i2);
                a.wv.v(findViewById, "findViewById(id)");
                return findViewById;
            case 1:
                android.view.View findViewById2 = ((a.gk0) obj).M().findViewById(i2);
                a.wv.v(findViewById2, "requireView().findViewById(id)");
                return findViewById2;
            default:
                android.view.View findViewById3 = ((android.view.View) obj).findViewById(i2);
                a.wv.v(findViewById3, "findViewById(id)");
                return findViewById3;
        }
    }

    @Override // a.qo0
    public final java.lang.Object b() {
        switch (this.d) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                return a();
            case 1:
                return a();
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                return a();
            default:
                a.cp cpVar = com.omarea.Scene.c;
                a.fs1.D().edit().putInt("app_theme5", this.e).apply();
                com.omarea.vtools.activities.ActivityOtherSettings activityOtherSettings = (com.omarea.vtools.activities.ActivityOtherSettings) this.f;
                a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityOtherSettings.t;
                activityOtherSettings.p();
                return a.no1.f387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jp1(int i, com.omarea.vtools.activities.ActivityOtherSettings activityOtherSettings) {
        super(0);
        this.d = 3;
        this.e = i;
        this.f = activityOtherSettings;
    }
}
