package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class g40 extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ a.k40 h;
    public final /* synthetic */ com.omarea.ui.SwitchOptionItemView i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g40(a.k40 k40Var, com.omarea.ui.SwitchOptionItemView switchOptionItemView, a.ey eyVar) {
        super(2, eyVar);
        this.h = k40Var;
        this.i = switchOptionItemView;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.g40(this.h, this.i, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        if (i == 0) {
            a.b20.q1(obj);
            boolean z = this.i.i;
            this.g = 1;
            if (a.k40.c(this.h, z, this) == dzVar) {
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
        return ((a.g40) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
