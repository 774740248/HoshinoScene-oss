package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class p70 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ android.widget.Button g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p70(android.widget.Button button, a.ey eyVar) {
        super(2, eyVar);
        this.g = button;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.p70(this.g, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        this.g.setText(2131952077);
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.p70 p70Var = (a.p70) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        p70Var.e(no1Var);
        return no1Var;
    }
}
