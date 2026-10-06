package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class l10 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l10(boolean z, a.ey eyVar) {
        super(2, eyVar);
        this.g = z;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.l10(this.g, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        a.q10 q10Var = a.q10.f457a;
        a.q10.L("notify-accessibility-state", java.lang.String.valueOf(this.g), null);
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.l10 l10Var = (a.l10) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        l10Var.e(no1Var);
        return no1Var;
    }
}
