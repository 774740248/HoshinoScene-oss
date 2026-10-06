package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class a1 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ a.gy g;
    public final /* synthetic */ android.content.Context h;
    public final /* synthetic */ java.lang.Runnable i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(a.gy gyVar, android.content.Context context, java.lang.Runnable runnable, a.ey eyVar) {
        super(2, eyVar);
        this.g = gyVar;
        this.h = context;
        this.i = runnable;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.a1(this.g, this.h, this.i, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        this.g.getClass();
        android.content.Context context = this.h;
        if (a.gy.O(context)) {
            try {
                this.i.run();
            } catch (java.lang.Throwable th) {
                a.b20.I(th);
            }
        } else {
            try {
                a.cp cpVar = com.omarea.Scene.c;
                java.lang.String string = context.getString(2131951824);
                a.wv.v(string, "context.getString(R.stri…sibility_please_activate)");
                a.fs1.X(string, 0);
                context.startActivity(new android.content.Intent("android.settings.ACCESSIBILITY_SETTINGS"));
            } catch (java.lang.Exception unused) {
            }
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.a1 a1Var = (a.a1) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        a1Var.e(no1Var);
        return no1Var;
    }
}
