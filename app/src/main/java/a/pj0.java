package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class pj0 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ android.widget.CompoundButton g;
    public final /* synthetic */ boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pj0(android.widget.CompoundButton compoundButton, boolean z, a.ey eyVar) {
        super(2, eyVar);
        this.g = compoundButton;
        this.h = z;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.pj0(this.g, this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        this.g.setChecked(this.h);
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.pj0 pj0Var = (a.pj0) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        pj0Var.e(no1Var);
        return no1Var;
    }
}
