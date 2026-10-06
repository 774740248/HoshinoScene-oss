package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class d91 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f90a;

    public /* synthetic */ d91(androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.f90a = recyclerView;
    }

    public final void a(a.ui uiVar) {
        int i = uiVar.f596a;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f90a;
        if (i == 1) {
            recyclerView.p.h0(uiVar.b, uiVar.d);
            return;
        }
        if (i == 2) {
            recyclerView.p.k0(uiVar.b, uiVar.d);
        } else if (i == 4) {
            recyclerView.p.m0(recyclerView, uiVar.b, uiVar.d);
        } else {
            if (i != 8) {
                return;
            }
            recyclerView.p.j0(uiVar.b, uiVar.d);
        }
    }

    public final a.da1 b(int i) {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f90a;
        int h = recyclerView.h.h();
        int i2 = 0;
        a.da1 da1Var = null;
        while (true) {
            if (i2 >= h) {
                break;
            }
            a.da1 N = androidx.recyclerview.widget.RecyclerView.N(recyclerView.h.g(i2));
            if (N != null && !N.l() && N.c == i) {
                if (!recyclerView.h.j(N.f91a)) {
                    da1Var = N;
                    break;
                }
                da1Var = N;
            }
            i2++;
        }
        if (da1Var == null) {
            return null;
        }
        if (!recyclerView.h.j(da1Var.f91a)) {
            return da1Var;
        }
        if (androidx.recyclerview.widget.RecyclerView.E0) {
            android.util.Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
        }
        return null;
    }

    public final void c(int i, int i2, java.lang.Object obj) {
        int i3;
        int i4;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f90a;
        int h = recyclerView.h.h();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < h; i6++) {
            android.view.View g = recyclerView.h.g(i6);
            a.da1 N = androidx.recyclerview.widget.RecyclerView.N(g);
            if (N != null && !N.s() && (i4 = N.c) >= i && i4 < i5) {
                N.b(2);
                N.a(obj);
                ((a.n91) g.getLayoutParams()).e = true;
            }
        }
        a.t91 t91Var = recyclerView.e;
        java.util.ArrayList arrayList = t91Var.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a.da1 da1Var = (a.da1) arrayList.get(size);
            if (da1Var != null && (i3 = da1Var.c) >= i && i3 < i5) {
                da1Var.b(2);
                t91Var.g(size);
            }
        }
        recyclerView.n0 = true;
    }

    public final void d(int i, int i2) {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f90a;
        int h = recyclerView.h.h();
        for (int i3 = 0; i3 < h; i3++) {
            a.da1 N = androidx.recyclerview.widget.RecyclerView.N(recyclerView.h.g(i3));
            if (N != null && !N.s() && N.c >= i) {
                if (androidx.recyclerview.widget.RecyclerView.E0) {
                    android.util.Log.d("RecyclerView", "offsetPositionRecordsForInsert attached child " + i3 + " holder " + N + " now at position " + (N.c + i2));
                }
                N.p(i2, false);
                recyclerView.j0.f = true;
            }
        }
        java.util.ArrayList arrayList = recyclerView.e.c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            a.da1 da1Var = (a.da1) arrayList.get(i4);
            if (da1Var != null && da1Var.c >= i) {
                if (androidx.recyclerview.widget.RecyclerView.E0) {
                    android.util.Log.d("RecyclerView", "offsetPositionRecordsForInsert cached " + i4 + " holder " + da1Var + " now at position " + (da1Var.c + i2));
                }
                da1Var.p(i2, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.m0 = true;
    }

    public final void e(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f90a;
        int h = recyclerView.h.h();
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        boolean z = false;
        for (int i11 = 0; i11 < h; i11++) {
            a.da1 N = androidx.recyclerview.widget.RecyclerView.N(recyclerView.h.g(i11));
            if (N != null && (i10 = N.c) >= i4 && i10 <= i3) {
                if (androidx.recyclerview.widget.RecyclerView.E0) {
                    android.util.Log.d("RecyclerView", "offsetPositionRecordsForMove attached child " + i11 + " holder " + N);
                }
                if (N.c == i) {
                    N.p(i2 - i, false);
                } else {
                    N.p(i5, false);
                }
                recyclerView.j0.f = true;
            }
        }
        a.t91 t91Var = recyclerView.e;
        t91Var.getClass();
        if (i < i2) {
            i7 = i;
            i6 = i2;
            i8 = -1;
        } else {
            i6 = i;
            i7 = i2;
            i8 = 1;
        }
        java.util.ArrayList arrayList = t91Var.c;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            a.da1 da1Var = (a.da1) arrayList.get(i12);
            if (da1Var != null && (i9 = da1Var.c) >= i7 && i9 <= i6) {
                if (i9 == i) {
                    da1Var.p(i2 - i, z);
                } else {
                    da1Var.p(i8, z);
                }
                if (androidx.recyclerview.widget.RecyclerView.E0) {
                    android.util.Log.d("RecyclerView", "offsetPositionRecordsForMove cached child " + i12 + " holder " + da1Var);
                }
            }
            i12++;
            z = false;
        }
        recyclerView.requestLayout();
        recyclerView.m0 = true;
    }

    public final void f(a.da1 da1Var, a.i91 i91Var, a.i91 i91Var2) {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f90a;
        recyclerView.getClass();
        da1Var.r(false);
        a.r20 r20Var = (a.r20) recyclerView.O;
        if (i91Var != null) {
            r20Var.getClass();
            int i = i91Var.f227a;
            int i2 = i91Var2.f227a;
            if (i != i2 || i91Var.b != i91Var2.b) {
                if (!r20Var.g(da1Var, i, i91Var.b, i2, i91Var2.b)) {
                    return;
                }
                recyclerView.X();
            }
        }
        r20Var.l(da1Var);
        da1Var.f91a.setAlpha(0.0f);
        r20Var.i.add(da1Var);
        recyclerView.X();
    }

    public final void g(a.da1 da1Var, a.i91 i91Var, a.i91 i91Var2) {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f90a;
        recyclerView.e.l(da1Var);
        recyclerView.h(da1Var);
        da1Var.r(false);
        a.r20 r20Var = (a.r20) recyclerView.O;
        r20Var.getClass();
        int i = i91Var.f227a;
        int i2 = i91Var.b;
        android.view.View view = da1Var.f91a;
        int left = i91Var2 == null ? view.getLeft() : i91Var2.f227a;
        int top = i91Var2 == null ? view.getTop() : i91Var2.b;
        if (da1Var.l() || (i == left && i2 == top)) {
            r20Var.l(da1Var);
            r20Var.h.add(da1Var);
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            if (!r20Var.g(da1Var, i, i2, left, top)) {
                return;
            }
        }
        recyclerView.X();
    }

    public final void h(int i) {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f90a;
        android.view.View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }
}
