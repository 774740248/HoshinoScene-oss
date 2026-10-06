package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class v31 extends a.o91 {

    /* renamed from: a, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f621a;
    public final a.zh1 b = new a.zh1(this);
    public a.m31 c;
    public a.m31 d;

    public static int b(android.view.View view, a.n31 n31Var) {
        return ((n31Var.e(view) / 2) + n31Var.f(view)) - ((n31Var.j() / 2) + n31Var.i());
    }

    public static android.view.View c(androidx.recyclerview.widget.a aVar, a.n31 n31Var) {
        int G = aVar.G();
        android.view.View view = null;
        if (G == 0) {
            return null;
        }
        int j = (n31Var.j() / 2) + n31Var.i();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < G; i2++) {
            android.view.View F = aVar.F(i2);
            int abs = java.lang.Math.abs(((n31Var.e(F) / 2) + n31Var.f(F)) - j);
            if (abs < i) {
                view = F;
                i = abs;
            }
        }
        return view;
    }

    public final int[] a(androidx.recyclerview.widget.a aVar, android.view.View view) {
        int[] iArr = new int[2];
        if (aVar.o()) {
            iArr[0] = b(view, d(aVar));
        } else {
            iArr[0] = 0;
        }
        if (aVar.p()) {
            iArr[1] = b(view, e(aVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public final a.n31 d(androidx.recyclerview.widget.a aVar) {
        a.m31 m31Var = this.d;
        if (m31Var == null || m31Var.f369a != aVar) {
            this.d = a.n31.a(aVar);
        }
        return this.d;
    }

    public final a.n31 e(androidx.recyclerview.widget.a aVar) {
        a.m31 m31Var = this.c;
        if (m31Var == null || m31Var.f369a != aVar) {
            this.c = a.n31.c(aVar);
        }
        return this.c;
    }

    public final void f() {
        androidx.recyclerview.widget.a layoutManager;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f621a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        android.view.View c = layoutManager.p() ? c(layoutManager, e(layoutManager)) : layoutManager.o() ? c(layoutManager, d(layoutManager)) : null;
        if (c == null) {
            return;
        }
        int[] a2 = a(layoutManager, c);
        int i = a2[0];
        if (i == 0 && a2[1] == 0) {
            return;
        }
        this.f621a.k0(i, a2[1], false);
    }
}
