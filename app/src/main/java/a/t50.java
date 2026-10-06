package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class t50 extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ a.f60 h;
    public final /* synthetic */ a.mc1 i;
    public final /* synthetic */ a.ma1 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t50(a.f60 f60Var, a.mc1 mc1Var, a.ma1 ma1Var, a.ey eyVar) {
        super(2, eyVar);
        this.h = f60Var;
        this.i = mc1Var;
        this.j = ma1Var;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.t50(this.h, this.i, this.j, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        a.f60 f60Var = this.h;
        if (i == 0) {
            a.b20.q1(obj);
            this.g = 1;
            obj = a.f60.b(f60Var, this);
            if (obj == dzVar) {
                return dzVar;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.b20.q1(obj);
        }
        a.ec1 ec1Var = (a.ec1) obj;
        if (ec1Var != null) {
            java.lang.String str = this.i.c;
            java.lang.String str2 = (java.lang.String) this.j.c;
            f60Var.getClass();
            a.b81 b81Var = new a.b81(f60Var.f145a, java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
            a.b81.c(b81Var);
            a.wv.M0(a.wv.b(a.z80.b), null, new a.x50(str, str2, ec1Var, f60Var, b81Var, null), 3);
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.t50) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
