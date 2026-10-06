package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class d5 extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ a.mo h;
    public final /* synthetic */ java.lang.String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d5(a.mo moVar, java.lang.String str, a.ey eyVar) {
        super(2, eyVar);
        this.h = moVar;
        this.i = str;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.d5(this.h, this.i, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        if (i == 0) {
            a.b20.q1(obj);
            a.e30 K1 = this.h.K1(this.i);
            this.g = 1;
            obj = K1.o(this);
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
        return ((a.d5) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
