package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class vt extends a.pp0 implements a.qo0 {
    public final /* synthetic */ int k;

    /* [修复] 从 smali 还原：super 只能调用一次，按 i 选择目标类/方法 */
    public vt(int i, java.lang.Object obj) {
        super(0, obj, i == 1 ? a.j61.class : (i == 2 ? com.omarea.vtools.activities.ActivityFiles.class : a.wt.class), i == 2 ? "refresh" : "saveLog", i == 2 ? "refresh()V" : "saveLog()V");
        this.k = i;
    }

    @Override // a.qo0
    public final /* bridge */ /* synthetic */ java.lang.Object b() {
        a.no1 no1Var = a.no1.f387a;
        switch (this.k) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                j();
                return no1Var;
            case 1:
                j();
                return no1Var;
            default:
                j();
                return no1Var;
        }
    }

    public final void j() {
        int i = this.k;
        java.lang.Object obj = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.wt wtVar = (a.wt) obj;
                wtVar.getClass();
                a.vj1 vj1Var = a.oq0.c;
                wtVar.d = java.lang.Long.valueOf(a.oq0.g(5000L));
                if (a.oq0.i != 2) {
                    a.nk nkVar = wtVar.f;
                    java.util.Timer timer = (java.util.Timer) nkVar.f;
                    if (timer != null) {
                        timer.cancel();
                    }
                    nkVar.f = null;
                    return;
                }
                if (java.lang.Math.abs(a.oq0.h) > 100) {
                    int i2 = a.wt.g;
                    long j = a.oq0.h;
                    double f = a.oq0.f();
                    int i3 = a.oq0.f;
                    double d = a.oq0.f417a;
                    a.au auVar = wtVar.c;
                    auVar.m();
                    try {
                        ((android.database.sqlite.SQLiteDatabase) auVar.d).execSQL("insert into records(time, session, current, voltage, capacity, temperature) values (?, ?, ?, ?, ?, ?)", new java.lang.Object[]{java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), java.lang.Integer.valueOf(i2), java.lang.Long.valueOf(j), java.lang.Double.valueOf(f), java.lang.Integer.valueOf(i3), java.lang.Double.valueOf(d)});
                        return;
                    } catch (java.lang.Exception unused) {
                        return;
                    }
                }
                return;
            case 1:
                ((a.j61) obj).b();
                return;
            default:
                com.omarea.vtools.activities.ActivityFiles.p((com.omarea.vtools.activities.ActivityFiles) obj);
                return;
        }
    }
}
