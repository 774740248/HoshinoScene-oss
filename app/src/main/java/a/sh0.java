package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class sh0 extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ java.util.Map.Entry h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sh0(java.util.Map.Entry entry, a.ey eyVar) {
        super(2, eyVar);
        this.h = entry;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.sh0(this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        if (i == 0) {
            a.b20.q1(obj);
            a.q10 q10Var = a.q10.f457a;
            java.lang.String str = (java.lang.String) this.h.getKey();
            this.g = 1;
            obj = a.q10.f457a.s(str, null, this);
            if (obj == dzVar) {
                return dzVar;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.b20.q1(obj);
        }
        return java.lang.Boolean.valueOf(((java.lang.Number) obj).doubleValue() > -1.0d);
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.sh0) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
