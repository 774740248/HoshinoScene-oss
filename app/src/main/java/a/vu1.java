package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class vu1 extends a.e91 {
    public final a.wy0 f;

    public vu1(a.wy0 wy0Var) {
        this.f = wy0Var;
    }

    @Override // a.e91
    public final int c() {
        return this.f.Y.h;
    }

    @Override // a.e91
    public final void i(a.da1 da1Var, int i) {
        a.wy0 wy0Var = this.f;
        int i2 = wy0Var.Y.c.e + i;
        java.lang.String format = java.lang.String.format(java.util.Locale.getDefault(), "%d", java.lang.Integer.valueOf(i2));
        android.widget.TextView textView = ((a.uu1) da1Var).u;
        textView.setText(format);
        android.content.Context context = textView.getContext();
        textView.setContentDescription(a.so1.c().get(1) == i2 ? java.lang.String.format(context.getString(2131953040), java.lang.Integer.valueOf(i2)) : java.lang.String.format(context.getString(2131953041), java.lang.Integer.valueOf(i2)));
        a.qs qsVar = wy0Var.b0;
        if (a.so1.c().get(1) == i2) {
            a.ol olVar = qsVar.b;
        } else {
            a.ol olVar2 = qsVar.f478a;
        }
        throw null;
    }

    @Override // a.e91
    public final a.da1 k(androidx.recyclerview.widget.RecyclerView recyclerView, int i) {
        return new a.uu1((android.widget.TextView) android.view.LayoutInflater.from(recyclerView.getContext()).inflate(2131558694, (android.view.ViewGroup) recyclerView, false));
    }
}
