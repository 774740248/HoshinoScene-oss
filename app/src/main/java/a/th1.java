package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class th1 extends a.at0 {
    public final a.dt0 d;
    public final a.sh1 e;
    public final boolean f;

    public th1(a.fh fhVar, a.sh1 sh1Var) {
        this.f25a = -1;
        this.d = fhVar;
        this.e = sh1Var;
        this.f = true;
    }

    @Override // a.at0
    public final void a(androidx.recyclerview.widget.RecyclerView recyclerView, a.da1 da1Var) {
        a.wv.w(recyclerView, "recyclerView");
        a.wv.w(da1Var, "viewHolder");
        android.view.View view = da1Var.f91a;
        java.lang.Object tag = view.getTag(2131362672);
        if (tag instanceof java.lang.Float) {
            float floatValue = ((java.lang.Float) tag).floatValue();
            java.util.WeakHashMap weakHashMap = a.jq1.f264a;
            a.xp1.s(view, floatValue);
        }
        view.setTag(2131362672, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        ((a.et0) da1Var).f91a.setAlpha(1.0f);
    }

    @Override // a.at0
    public final int d(androidx.recyclerview.widget.RecyclerView recyclerView, a.da1 da1Var) {
        a.wv.w(recyclerView, "recyclerView");
        a.wv.w(da1Var, "viewHolder");
        return 995391;
    }
}
