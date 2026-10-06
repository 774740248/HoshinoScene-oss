package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class wm0 extends a.lj1 implements a.bp0 {
    public int g;
    public final /* synthetic */ a.bn0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wm0(a.bn0 bn0Var, a.ey eyVar) {
        super(1, eyVar);
        this.h = bn0Var;
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        if (i == 0) {
            a.b20.q1(obj);
            this.g = 1;
            if (a.bn0.S(this.h, this) == dzVar) {
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

    @Override // a.bp0
    public final java.lang.Object i(java.lang.Object obj) {
        return new a.wm0(this.h, (a.ey) obj).e(a.no1.f387a);
    }
}
