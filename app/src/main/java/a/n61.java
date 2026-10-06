package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class n61 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ com.omarea.ui.power.PowerStatView g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n61(com.omarea.ui.power.PowerStatView powerStatView, a.ey eyVar) {
        super(2, eyVar);
        this.g = powerStatView;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.n61(this.g, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        com.omarea.ui.power.PowerStatView powerStatView = this.g;
        if (powerStatView.isAttachedToWindow()) {
            try {
                powerStatView.invalidate();
            } catch (java.lang.Exception unused) {
            }
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.n61 n61Var = (a.n61) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        n61Var.e(no1Var);
        return no1Var;
    }
}
