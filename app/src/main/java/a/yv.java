package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class yv extends a.lj1 implements a.fp0 {
    public int g;

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.lj1(2, eyVar);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [a.lz0, java.lang.Object] */
    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        if (i == 0) {
            a.b20.q1(obj);
            a.lz0 obj2 = new a.lz0();
            this.g = 1;
            obj = obj2.b(this);
            if (obj == dzVar) {
                return dzVar;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.b20.q1(obj);
        }
        return java.lang.Boolean.valueOf(((a.jz0) obj).f276a > 16384);
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.yv) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
