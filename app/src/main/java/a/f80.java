package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class f80 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ a.x01 g;
    public final /* synthetic */ android.view.View h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f80(a.x01 x01Var, android.view.View view, a.ey eyVar) {
        super(2, eyVar);
        this.g = x01Var;
        this.h = view;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.f80(this.g, this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        int i = a.x60.f681a;
        android.app.Activity activity = (android.app.Activity) this.g.e;
        android.view.View view = this.h;
        a.wv.v(view, "view");
        a.fs1.m(activity, view, true);
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.f80 f80Var = (a.f80) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        f80Var.e(no1Var);
        return no1Var;
    }
}
