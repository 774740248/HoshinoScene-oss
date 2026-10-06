package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class f10 extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ java.lang.String h;
    public final /* synthetic */ java.lang.String i;
    public final /* synthetic */ java.lang.Long j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f10(java.lang.String str, java.lang.String str2, java.lang.Long l, a.ey eyVar) {
        super(2, eyVar);
        this.h = str;
        this.i = str2;
        this.j = l;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.f10(this.h, this.i, this.j, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        if (i == 0) {
            a.b20.q1(obj);
            a.q10 q10Var = a.q10.f457a;
            java.lang.String str = this.h;
            java.lang.String str2 = this.i;
            java.lang.Long l = this.j;
            this.g = 1;
            obj = a.q10.K(q10Var, str, str2, l, this, 8);
            if (obj == dzVar) {
                return dzVar;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.b20.q1(obj);
        }
        return obj;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.f10) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
