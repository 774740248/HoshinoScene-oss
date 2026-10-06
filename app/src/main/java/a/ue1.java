package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ue1 extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ a.be1 h;
    public final /* synthetic */ java.lang.Runnable i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ue1(a.be1 be1Var, java.lang.Runnable runnable, a.ey eyVar) {
        super(2, eyVar);
        this.h = be1Var;
        this.i = runnable;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.ue1(this.h, this.i, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        if (i == 0) {
            a.b20.q1(obj);
            this.g = 1;
            obj = this.h.r(null, this);
            if (obj == dzVar) {
                return dzVar;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.b20.q1(obj);
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
            a.cp cpVar = com.omarea.Scene.c;
            a.fs1.L(this.i);
        } else {
            a.cp cpVar2 = com.omarea.Scene.c;
            java.lang.String string = a.fs1.t().getString(2131952790);
            a.wv.v(string, "Scene.context.getString(…ring.license_no_response)");
            a.fs1.X(string, 0);
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.ue1) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
