package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ru {

    /* renamed from: a, reason: collision with root package name */
    public final a.d91 f506a;
    public android.view.View e;
    public int d = 0;
    public final a.qu b = new a.qu();
    public final java.util.ArrayList c = new java.util.ArrayList();

    public ru(a.d91 d91Var) {
        this.f506a = d91Var;
    }

    public final void a(android.view.View view, int i, boolean z) {
        a.d91 d91Var = this.f506a;
        int childCount = i < 0 ? d91Var.f90a.getChildCount() : f(i);
        this.b.e(childCount, z);
        if (z) {
            i(view);
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = d91Var.f90a;
        recyclerView.addView(view, childCount);
        a.da1 N = androidx.recyclerview.widget.RecyclerView.N(view);
        a.e91 e91Var = recyclerView.o;
        if (e91Var != null && N != null) {
            e91Var.m(N);
        }
        java.util.ArrayList arrayList = recyclerView.E;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((a.ct0) recyclerView.E.get(size)).getClass();
            }
        }
    }

    public final void b(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams, boolean z) {
        a.d91 d91Var = this.f506a;
        int childCount = i < 0 ? d91Var.f90a.getChildCount() : f(i);
        this.b.e(childCount, z);
        if (z) {
            i(view);
        }
        d91Var.getClass();
        a.da1 N = androidx.recyclerview.widget.RecyclerView.N(view);
        androidx.recyclerview.widget.RecyclerView recyclerView = d91Var.f90a;
        if (N != null) {
            if (!N.n() && !N.s()) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Called attach on a child which is not detached: ");
                sb.append(N);
                throw new java.lang.IllegalArgumentException(a.ai1.d(recyclerView, sb));
            }
            if (androidx.recyclerview.widget.RecyclerView.E0) {
                android.util.Log.d("RecyclerView", "reAttach " + N);
            }
            N.j &= -257;
        } else if (androidx.recyclerview.widget.RecyclerView.D0) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            sb2.append(", index: ");
            sb2.append(childCount);
            throw new java.lang.IllegalArgumentException(a.ai1.d(recyclerView, sb2));
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public final void c(int i) {
        int f = f(i);
        this.b.f(f);
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f506a.f90a;
        android.view.View childAt = recyclerView.getChildAt(f);
        if (childAt != null) {
            a.da1 N = androidx.recyclerview.widget.RecyclerView.N(childAt);
            if (N != null) {
                if (N.n() && !N.s()) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("called detach on an already detached child ");
                    sb.append(N);
                    throw new java.lang.IllegalArgumentException(a.ai1.d(recyclerView, sb));
                }
                if (androidx.recyclerview.widget.RecyclerView.E0) {
                    android.util.Log.d("RecyclerView", "tmpDetach " + N);
                }
                N.b(256);
            }
        } else if (androidx.recyclerview.widget.RecyclerView.D0) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("No view at offset ");
            sb2.append(f);
            throw new java.lang.IllegalArgumentException(a.ai1.d(recyclerView, sb2));
        }
        recyclerView.detachViewFromParent(f);
    }

    public final android.view.View d(int i) {
        return this.f506a.f90a.getChildAt(f(i));
    }

    public final int e() {
        return this.f506a.f90a.getChildCount() - this.c.size();
    }

    public final int f(int i) {
        if (i < 0) {
            return -1;
        }
        int childCount = this.f506a.f90a.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            a.qu quVar = this.b;
            int b = i - (i2 - quVar.b(i2));
            if (b == 0) {
                while (quVar.d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += b;
        }
        return -1;
    }

    public final android.view.View g(int i) {
        return this.f506a.f90a.getChildAt(i);
    }

    public final int h() {
        return this.f506a.f90a.getChildCount();
    }

    public final void i(android.view.View view) {
        this.c.add(view);
        a.d91 d91Var = this.f506a;
        d91Var.getClass();
        a.da1 N = androidx.recyclerview.widget.RecyclerView.N(view);
        if (N != null) {
            int i = N.q;
            android.view.View view2 = N.f91a;
            if (i != -1) {
                N.p = i;
            } else {
                java.util.WeakHashMap weakHashMap = a.jq1.f264a;
                N.p = a.rp1.c(view2);
            }
            androidx.recyclerview.widget.RecyclerView recyclerView = d91Var.f90a;
            if (recyclerView.Q()) {
                N.q = 4;
                recyclerView.x0.add(N);
            } else {
                java.util.WeakHashMap weakHashMap2 = a.jq1.f264a;
                a.rp1.s(view2, 4);
            }
        }
    }

    public final boolean j(android.view.View view) {
        return this.c.contains(view);
    }

    public final void k(int i) {
        a.d91 d91Var = this.f506a;
        int i2 = this.d;
        if (i2 == 1) {
            throw new java.lang.IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i2 == 2) {
            throw new java.lang.IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            int f = f(i);
            android.view.View childAt = d91Var.f90a.getChildAt(f);
            if (childAt == null) {
                this.d = 0;
                this.e = null;
                return;
            }
            this.d = 1;
            this.e = childAt;
            if (this.b.f(f)) {
                l(childAt);
            }
            d91Var.h(f);
            this.d = 0;
            this.e = null;
        } catch (java.lang.Throwable th) {
            this.d = 0;
            this.e = null;
            throw th;
        }
    }

    public final void l(android.view.View view) {
        if (this.c.remove(view)) {
            a.d91 d91Var = this.f506a;
            d91Var.getClass();
            a.da1 N = androidx.recyclerview.widget.RecyclerView.N(view);
            if (N != null) {
                int i = N.p;
                androidx.recyclerview.widget.RecyclerView recyclerView = d91Var.f90a;
                if (recyclerView.Q()) {
                    N.q = i;
                    recyclerView.x0.add(N);
                } else {
                    java.util.WeakHashMap weakHashMap = a.jq1.f264a;
                    a.rp1.s(N.f91a, i);
                }
                N.p = 0;
            }
        }
    }

    public final java.lang.String toString() {
        return this.b.toString() + ", hidden list:" + this.c.size();
    }
}
