package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class rf0 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ a.ma1 g;
    public final /* synthetic */ a.ag0 h;
    public final /* synthetic */ android.view.View i;
    public final /* synthetic */ android.content.Context j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rf0(android.content.Context context, android.view.View view, a.ag0 ag0Var, a.ey eyVar, a.ma1 ma1Var) {
        super(2, eyVar);
        this.g = ma1Var;
        this.h = ag0Var;
        this.i = view;
        this.j = context;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        a.ma1 ma1Var = this.g;
        a.ag0 ag0Var = this.h;
        return new a.rf0(this.j, this.i, ag0Var, eyVar, ma1Var);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        ((a.qo0) this.g.c).b();
        android.widget.FrameLayout frameLayout = this.h.n;
        if (frameLayout != null) {
            android.content.Context context = this.j;
            java.lang.Object obj2 = a.zx.f748a;
            frameLayout.setBackground(a.xx.b(context, 2131230945));
            frameLayout.setAlpha(0.6f);
        }
        android.view.View view = this.h.o;
        if (view != null) {
            view.setVisibility(0);
        }
        this.i.setEnabled(true);
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.rf0 rf0Var = (a.rf0) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        rf0Var.e(no1Var);
        return no1Var;
    }
}
