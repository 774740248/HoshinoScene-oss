package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class lo extends a.lj1 implements a.fp0 {
    public final /* synthetic */ a.mo g;
    public final /* synthetic */ java.lang.String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lo(a.mo moVar, java.lang.String str, a.ey eyVar) {
        super(2, eyVar);
        this.g = moVar;
        this.h = str;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.lo(this.g, this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        return this.g.M1(this.h);
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.lo) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
