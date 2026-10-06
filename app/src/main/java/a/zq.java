package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class zq extends a.lj1 implements a.fp0 {
    public final /* synthetic */ com.omarea.ui.fps.BatteryIOView g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zq(com.omarea.ui.fps.BatteryIOView batteryIOView, a.ey eyVar) {
        super(2, eyVar);
        this.g = batteryIOView;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.zq(this.g, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        this.g.invalidate();
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.zq zqVar = (a.zq) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        zqVar.e(no1Var);
        return no1Var;
    }
}
