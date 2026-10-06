package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class wn1 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ com.omarea.ui.TreemapView g;
    public final /* synthetic */ a.vn1 h;
    public final /* synthetic */ a.tn1 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wn1(com.omarea.ui.TreemapView treemapView, a.vn1 vn1Var, a.tn1 tn1Var, a.ey eyVar) {
        super(2, eyVar);
        this.g = treemapView;
        this.h = vn1Var;
        this.i = tn1Var;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.wn1(this.g, this.h, this.i, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        com.omarea.ui.TreemapView treemapView = this.g;
        java.util.HashSet hashSet = treemapView.G;
        a.vn1 vn1Var = this.h;
        hashSet.remove(vn1Var);
        a.tn1 tn1Var = this.i;
        if (tn1Var != null) {
            treemapView.E.put(vn1Var, tn1Var);
        } else {
            treemapView.F.add(vn1Var);
        }
        treemapView.invalidate();
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.wn1 wn1Var = (a.wn1) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        wn1Var.e(no1Var);
        return no1Var;
    }
}
