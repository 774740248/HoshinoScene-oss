package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class a60 extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ a.mc1 h;
    public final /* synthetic */ a.f60 i;
    public final /* synthetic */ a.w60 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a60(a.mc1 mc1Var, a.f60 f60Var, a.w60 w60Var, a.ey eyVar) {
        super(2, eyVar);
        this.h = mc1Var;
        this.i = f60Var;
        this.j = w60Var;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.a60(this.h, this.i, this.j, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        if (i == 0) {
            a.b20.q1(obj);
            boolean h = a.gy.h(this.h.c);
            a.f60 f60Var = this.i;
            if (!h) {
                a.cp cpVar = com.omarea.Scene.c;
                a.ai1.o(f60Var.f145a, 2131952441, "activity.getString(R.string.fs_op_failed)", 0);
            }
            a.u20 u20Var = a.z80.f728a;
            a.zx0 zx0Var = a.by0.f57a;
            a.z50 z50Var = new a.z50(this.j, f60Var, null);
            this.g = 1;
            if (a.wv.S1(zx0Var, z50Var, this) == dzVar) {
                return dzVar;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.b20.q1(obj);
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.a60) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
