package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class yn1 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ com.omarea.ui.TreemapView g;
    public final /* synthetic */ java.util.ArrayList h;
    public final /* synthetic */ a.vn1 i;
    public final /* synthetic */ int j;
    public final /* synthetic */ boolean k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yn1(com.omarea.ui.TreemapView treemapView, java.util.ArrayList arrayList, a.vn1 vn1Var, int i, boolean z, a.ey eyVar) {
        super(2, eyVar);
        this.g = treemapView;
        this.h = arrayList;
        this.i = vn1Var;
        this.j = i;
        this.k = z;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.yn1(this.g, this.h, this.i, this.j, this.k, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        com.omarea.ui.TreemapView treemapView = this.g;
        treemapView.h = false;
        a.vn1 vn1Var = this.i;
        java.util.ArrayList arrayList = this.h;
        if (arrayList != null) {
            vn1Var.b = 0L;
            vn1Var.c = arrayList;
        }
        if (this.j == treemapView.i && this.k && arrayList != null && !arrayList.isEmpty()) {
            treemapView.f.add(vn1Var);
            treemapView.i++;
            a.bp0 onPathChange = treemapView.getOnPathChange();
            if (onPathChange != null) {
                onPathChange.i(treemapView.getCurrentPath());
            }
        }
        treemapView.invalidate();
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.yn1 yn1Var = (a.yn1) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        yn1Var.e(no1Var);
        return no1Var;
    }
}
