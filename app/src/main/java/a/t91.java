package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class t91 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f553a;
    public java.util.ArrayList b;
    public final java.util.ArrayList c;
    public final java.util.List d;
    public int e;
    public int f;
    public a.s91 g;
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView h;

    public t91(androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.h = recyclerView;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f553a = arrayList;
        this.b = null;
        this.c = new java.util.ArrayList();
        this.d = java.util.Collections.unmodifiableList(arrayList);
        this.e = 2;
        this.f = 2;
    }

    public final void a(a.da1 da1Var, boolean z) {
        androidx.recyclerview.widget.RecyclerView.l(da1Var);
        androidx.recyclerview.widget.RecyclerView recyclerView = this.h;
        a.fa1 fa1Var = recyclerView.q0;
        android.view.View view = da1Var.f91a;
        if (fa1Var != null) {
            a.ea1 ea1Var = fa1Var.e;
            a.jq1.o(view, ea1Var instanceof a.ea1 ? (a.u) ea1Var.e.remove(view) : null);
        }
        if (z) {
            java.util.ArrayList arrayList = recyclerView.q;
            if (arrayList.size() > 0) {
                a.ai1.t(arrayList.get(0));
                throw null;
            }
            if (recyclerView.j0 != null) {
                recyclerView.i.s(da1Var);
            }
            if (androidx.recyclerview.widget.RecyclerView.E0) {
                android.util.Log.d("RecyclerView", "dispatchViewRecycled: " + da1Var);
            }
        }
        da1Var.s = null;
        da1Var.r = null;
        a.s91 c = c();
        c.getClass();
        int i = da1Var.f;
        java.util.ArrayList arrayList2 = c.a(i).f488a;
        if (((a.r91) c.f523a.get(i)).b <= arrayList2.size()) {
            a.b20.k(view);
        } else {
            if (androidx.recyclerview.widget.RecyclerView.D0 && arrayList2.contains(da1Var)) {
                throw new java.lang.IllegalArgumentException("this scrap item already exists");
            }
            da1Var.q();
            arrayList2.add(da1Var);
        }
    }

    public final int b(int i) {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.h;
        if (i >= 0 && i < recyclerView.j0.b()) {
            return !recyclerView.j0.g ? i : recyclerView.g.f(i, 0);
        }
        throw new java.lang.IndexOutOfBoundsException("invalid position " + i + ". State item count is " + recyclerView.j0.b() + recyclerView.C());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [a.s91, java.lang.Object] */
    public final a.s91 c() {
        if (this.g == null) {
            a.s91 obj = new a.s91();
            obj.f523a = new android.util.SparseArray();
            obj.b = 0;
            obj.c = java.util.Collections.newSetFromMap(new java.util.IdentityHashMap());
            this.g = obj;
            d();
        }
        return this.g;
    }

    public final void d() {
        if (this.g != null) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.h;
            if (recyclerView.o == null || !recyclerView.isAttachedToWindow()) {
                return;
            }
            a.s91 s91Var = this.g;
            s91Var.c.add(recyclerView.o);
        }
    }

    public final void e(a.e91 e91Var, boolean z) {
        a.s91 s91Var = this.g;
        if (s91Var == null) {
            return;
        }
        java.util.Set set = s91Var.c;
        set.remove(e91Var);
        if (set.size() != 0 || z) {
            return;
        }
        int i = 0;
        while (true) {
            android.util.SparseArray sparseArray = s91Var.f523a;
            if (i >= sparseArray.size()) {
                return;
            }
            java.util.ArrayList arrayList = ((a.r91) sparseArray.get(sparseArray.keyAt(i))).f488a;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                a.b20.k(((a.da1) arrayList.get(i2)).f91a);
            }
            i++;
        }
    }

    public final void f() {
        java.util.ArrayList arrayList = this.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            g(size);
        }
        arrayList.clear();
        if (androidx.recyclerview.widget.RecyclerView.J0) {
            a.cq0 cq0Var = this.h.i0;
            int[] iArr = cq0Var.c;
            if (iArr != null) {
                java.util.Arrays.fill(iArr, -1);
            }
            cq0Var.d = 0;
        }
    }

    public final void g(int i) {
        if (androidx.recyclerview.widget.RecyclerView.E0) {
            android.util.Log.d("RecyclerView", "Recycling cached view at index " + i);
        }
        java.util.ArrayList arrayList = this.c;
        a.da1 da1Var = (a.da1) arrayList.get(i);
        if (androidx.recyclerview.widget.RecyclerView.E0) {
            android.util.Log.d("RecyclerView", "CachedViewHolder to be recycled: " + da1Var);
        }
        a(da1Var, true);
        arrayList.remove(i);
    }

    public final void h(android.view.View view) {
        a.da1 N = androidx.recyclerview.widget.RecyclerView.N(view);
        boolean n = N.n();
        androidx.recyclerview.widget.RecyclerView recyclerView = this.h;
        if (n) {
            recyclerView.removeDetachedView(view, false);
        }
        if (N.m()) {
            N.n.l(N);
        } else if (N.t()) {
            N.j &= -33;
        }
        i(N);
        if (recyclerView.O == null || N.k()) {
            return;
        }
        recyclerView.O.d(N);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b3, code lost:
    
        r5 = r5 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(a.da1 r13) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.t91.i(a.da1):void");
    }

    public final void j(android.view.View view) {
        a.j91 j91Var;
        a.da1 N = androidx.recyclerview.widget.RecyclerView.N(view);
        boolean g = N.g(12);
        androidx.recyclerview.widget.RecyclerView recyclerView = this.h;
        if (!g && N.o() && (j91Var = recyclerView.O) != null) {
            a.r20 r20Var = (a.r20) j91Var;
            if (N.f().isEmpty() && r20Var.g && !N.j()) {
                if (this.b == null) {
                    this.b = new java.util.ArrayList();
                }
                N.n = this;
                N.o = true;
                this.b.add(N);
                return;
            }
        }
        if (N.j() && !N.l() && !recyclerView.o.d) {
            throw new java.lang.IllegalArgumentException(a.ai1.d(recyclerView, new java.lang.StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
        }
        N.n = this;
        N.o = false;
        this.f553a.add(N);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x01e9, code lost:
    
        if (r3.g == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0219, code lost:
    
        if (r10.e != r6.d(r10.c)) goto L127;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x060d  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x062d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0145  */
    /* JADX WARN: Type inference failed for: r5v43, types: [a.i91, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final a.da1 k(int r27, long r28) {
        /*
            Method dump skipped, instructions count: 1637
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.t91.k(int, long):a.da1");
    }

    public final void l(a.da1 da1Var) {
        if (da1Var.o) {
            this.b.remove(da1Var);
        } else {
            this.f553a.remove(da1Var);
        }
        da1Var.n = null;
        da1Var.o = false;
        da1Var.j &= -33;
    }

    public final void m() {
        androidx.recyclerview.widget.a aVar = this.h.p;
        this.f = this.e + (aVar != null ? aVar.l : 0);
        java.util.ArrayList arrayList = this.c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f; size--) {
            g(size);
        }
    }
}
