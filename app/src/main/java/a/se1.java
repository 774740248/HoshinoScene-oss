package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class se1 extends a.lj1 implements a.fp0 {
    public int g;
    public /* synthetic */ java.lang.Object h;
    public final /* synthetic */ a.zv i;
    public final /* synthetic */ java.lang.String j;
    public final /* synthetic */ java.util.concurrent.atomic.AtomicInteger k;
    public final /* synthetic */ a.be1 l;
    public final /* synthetic */ java.lang.String m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public se1(a.zv zvVar, java.lang.String str, java.util.concurrent.atomic.AtomicInteger atomicInteger, a.be1 be1Var, java.lang.String str2, a.ey eyVar) {
        super(2, eyVar);
        this.i = zvVar;
        this.j = str;
        this.k = atomicInteger;
        this.l = be1Var;
        this.m = str2;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        a.se1 se1Var = new a.se1(this.i, this.j, this.k, this.l, this.m, eyVar);
        se1Var.h = obj;
        return se1Var;
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        java.lang.Object I;
        a.dz dzVar = a.dz.c;
        int i = this.g;
        java.util.concurrent.atomic.AtomicInteger atomicInteger = this.k;
        a.zv zvVar = this.i;
        try {
            try {
                if (i == 0) {
                    a.b20.q1(obj);
                    a.be1 be1Var = this.l;
                    java.lang.String str = this.m;
                    this.g = 1;
                    obj = be1Var.r(str, this);
                    if (obj == dzVar) {
                        return dzVar;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a.b20.q1(obj);
                }
                I = java.lang.Boolean.valueOf(((java.lang.Boolean) obj).booleanValue());
            } catch (java.lang.Throwable th) {
                I = a.b20.I(th);
            }
            java.lang.Object obj2 = java.lang.Boolean.FALSE;
            if (I instanceof a.ac1) {
                I = obj2;
            }
            if (((java.lang.Boolean) I).booleanValue()) {
                ((a.aw) zvVar).S(this.j);
            }
            return a.no1.f387a;
        } finally {
            if (atomicInteger.decrementAndGet() == 0) {
                ((a.aw) zvVar).S(null);
            }
        }
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.se1) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
