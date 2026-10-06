package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class kd0 extends a.q91 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a.nd0 f286a;

    public kd0(a.nd0 nd0Var) {
        this.f286a = nd0Var;
    }

    @Override // a.q91
    public final void b(androidx.recyclerview.widget.RecyclerView recyclerView, int i, int i2) {
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        a.nd0 nd0Var = this.f286a;
        int computeVerticalScrollRange = nd0Var.s.computeVerticalScrollRange();
        int i3 = nd0Var.r;
        int i4 = computeVerticalScrollRange - i3;
        int i5 = nd0Var.f378a;
        nd0Var.t = i4 > 0 && i3 >= i5;
        int computeHorizontalScrollRange = nd0Var.s.computeHorizontalScrollRange();
        int i6 = nd0Var.q;
        boolean z = computeHorizontalScrollRange - i6 > 0 && i6 >= i5;
        nd0Var.u = z;
        boolean z2 = nd0Var.t;
        if (!z2 && !z) {
            if (nd0Var.v != 0) {
                nd0Var.j(0);
                return;
            }
            return;
        }
        if (z2) {
            float f = i3;
            nd0Var.l = (int) ((((f / 2.0f) + computeVerticalScrollOffset) * f) / computeVerticalScrollRange);
            nd0Var.k = java.lang.Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
        }
        if (nd0Var.u) {
            float f2 = computeHorizontalScrollOffset;
            float f3 = i6;
            nd0Var.o = (int) ((((f3 / 2.0f) + f2) * f3) / computeHorizontalScrollRange);
            nd0Var.n = java.lang.Math.min(i6, (i6 * i6) / computeHorizontalScrollRange);
        }
        int i7 = nd0Var.v;
        if (i7 == 0 || i7 == 1) {
            nd0Var.j(1);
        }
    }
}
