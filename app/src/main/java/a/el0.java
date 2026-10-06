package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class el0 extends a.lj1 implements a.bp0 {
    public int g;
    public final /* synthetic */ a.pl0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public el0(a.pl0 pl0Var, a.ey eyVar) {
        super(1, eyVar);
        this.h = pl0Var;
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        if (i == 0) {
            a.b20.q1(obj);
            this.g = 1;
            a.gu0[] gu0VarArr = a.pl0.W0;
            a.pl0 pl0Var = this.h;
            pl0Var.getClass();
            obj = a.wv.S1(a.z80.f728a, new a.al0(pl0Var, 2, null), this);
            if (obj == dzVar) {
                return dzVar;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.b20.q1(obj);
        }
        a.cp cpVar = com.omarea.Scene.c;
        a.fs1.X((java.lang.String) obj, 0);
        return a.no1.f387a;
    }

    @Override // a.bp0
    public final java.lang.Object i(java.lang.Object obj) {
        return new a.el0(this.h, (a.ey) obj).e(a.no1.f387a);
    }
}
