package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class eu {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f137a = new java.util.ArrayList();

    public final void a() {
        java.util.Iterator it = this.f137a.iterator();
        while (it.hasNext()) {
            ((a.cn1) it.next()).setTooltipPosition(null);
        }
    }

    public final void b(a.cn1 cn1Var) {
        a.wv.w(cn1Var, "chart");
        java.util.ArrayList arrayList = this.f137a;
        if (arrayList.contains(cn1Var)) {
            return;
        }
        arrayList.add(cn1Var);
    }

    public final void c(a.cn1 cn1Var) {
        a.wv.w(cn1Var, "chart");
        this.f137a.remove(cn1Var);
    }

    public final void d(a.cn1 cn1Var, java.lang.Float f) {
        a.wv.w(cn1Var, "source");
        for (a.cn1 cn1Var2 : (Iterable<a.cn1>) this.f137a) {
            if (cn1Var2 != cn1Var) {
                cn1Var2.setTooltipPosition(f);
            }
        }
    }
}
