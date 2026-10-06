package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class c60 extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ java.lang.String h;
    public final /* synthetic */ java.lang.String i;
    public final /* synthetic */ a.w60 j;
    public final /* synthetic */ a.f60 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c60(java.lang.String str, java.lang.String str2, a.w60 w60Var, a.f60 f60Var, a.ey eyVar) {
        super(2, eyVar);
        this.h = str;
        this.i = str2;
        this.j = w60Var;
        this.k = f60Var;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.c60(this.h, this.i, this.j, this.k, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        if (i == 0) {
            a.b20.q1(obj);
            a.gy gyVar = a.gy.g;
            this.g = 1;
            obj = gyVar.V(this.h, this.i, null, this);
            if (obj == dzVar) {
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
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        a.u20 u20Var = a.z80.f728a;
        a.zx0 zx0Var = a.by0.f57a;
        a.b60 b60Var = new a.b60(this.j, this.k, booleanValue, null);
        this.g = 2;
        if (a.wv.S1(zx0Var, b60Var, this) == dzVar) {
            return dzVar;
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.c60) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
