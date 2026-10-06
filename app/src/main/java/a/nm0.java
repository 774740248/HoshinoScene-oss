package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class nm0 extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ java.lang.String h;
    public final /* synthetic */ a.ls i;
    public final /* synthetic */ android.view.View j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nm0(java.lang.String str, a.ls lsVar, android.view.View view, a.ey eyVar) {
        super(2, eyVar);
        this.h = str;
        this.i = lsVar;
        this.j = view;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.nm0(this.h, this.i, this.j, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        if (i == 0) {
            a.b20.q1(obj);
            java.lang.String str = this.h;
            if (str.length() < 3 || a.wv.e(str, "611")) {
                this.i.getClass();
                if (a.ls.h(0) < 2800000) {
                    a.u20 u20Var = a.z80.f728a;
                    a.zx0 zx0Var = a.by0.f57a;
                    a.mm0 mm0Var = new a.mm0(this.j, null);
                    this.g = 1;
                    if (a.wv.S1(zx0Var, mm0Var, this) == dzVar) {
                        return dzVar;
                    }
                }
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
        return ((a.nm0) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
