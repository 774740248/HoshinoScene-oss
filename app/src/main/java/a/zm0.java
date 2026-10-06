package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class zm0 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ a.bn0 g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zm0(a.bn0 bn0Var, boolean z, boolean z2, a.ey eyVar) {
        super(2, eyVar);
        this.g = bn0Var;
        this.h = z;
        this.i = z2;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.zm0(this.g, this.h, this.i, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        a.gu0[] gu0VarArr = a.bn0.x0;
        a.bn0 bn0Var = this.g;
        bn0Var.getClass();
        ((android.widget.Switch) bn0Var.i0.a(a.bn0.x0[12])).setChecked(this.h);
        if (this.i) {
            a.cp cpVar = com.omarea.Scene.c;
            a.fs1.D().edit().putBoolean("dynamic_control", false).apply();
            bn0Var.X().setChecked(false);
            java.util.ArrayList arrayList = a.dc0.f93a;
            a.dc0.a(a.kc0.u, null);
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.zm0 zm0Var = (a.zm0) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        zm0Var.e(no1Var);
        return no1Var;
    }
}
