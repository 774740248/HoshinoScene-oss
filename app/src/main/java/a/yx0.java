package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class yx0 extends a.lj1 implements a.fp0 {
    public /* synthetic */ java.lang.Object g;
    public final /* synthetic */ java.util.ArrayList h;
    public final /* synthetic */ a.pm i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yx0(java.util.ArrayList arrayList, a.pm pmVar, a.ey eyVar) {
        super(2, eyVar);
        this.h = arrayList;
        this.i = pmVar;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        a.yx0 yx0Var = new a.yx0(this.h, this.i, eyVar);
        yx0Var.g = obj;
        return yx0Var;
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        return a.wv.g((a.cz) this.g, null, new a.xx0(this.h, this.i, null), 3);
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.yx0) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
