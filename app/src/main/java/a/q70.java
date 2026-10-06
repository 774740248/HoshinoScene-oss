package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class q70 extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ android.app.AlertDialog h;
    public final /* synthetic */ java.lang.String i;
    public final /* synthetic */ android.widget.Button j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q70(android.app.AlertDialog alertDialog, java.lang.String str, android.widget.Button button, a.ey eyVar) {
        super(2, eyVar);
        this.h = alertDialog;
        this.i = str;
        this.j = button;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.q70(this.h, this.i, this.j, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        android.widget.Button button = this.j;
        int i2 = 1;
        try {
        } catch (java.lang.Exception unused) {
            a.u20 u20Var = a.z80.f728a;
            a.zx0 zx0Var = a.by0.f57a;
            a.p70 p70Var = new a.p70(button, null);
            this.g = 2;
            if (a.wv.S1(zx0Var, p70Var, this) == dzVar) {
                return dzVar;
            }
        }
        if (i == 0) {
            a.b20.q1(obj);
            android.content.Context context = this.h.getContext();
            a.wv.v(context, "context");
            a.kf1 kf1Var = new a.kf1(context);
            java.lang.String str = this.i;
            a.wv.w(str, "uid");
            java.util.concurrent.FutureTask futureTask = new java.util.concurrent.FutureTask(new a.df1(kf1Var, str, i2));
            a.wv.M0(a.wv.b(a.z80.b), null, new a.gf1(futureTask, null), 3);
            java.lang.Boolean bool = (java.lang.Boolean) futureTask.get(5L, java.util.concurrent.TimeUnit.SECONDS);
            a.zx0 zx0Var2 = a.by0.f57a;
            a.o70 o70Var = new a.o70(bool, button, null);
            this.g = 1;
            if (a.wv.S1(zx0Var2, o70Var, this) == dzVar) {
                return dzVar;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a.b20.q1(obj);
                return a.no1.f387a;
            }
            a.b20.q1(obj);
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.q70) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
