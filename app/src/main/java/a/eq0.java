package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class eq0 implements java.lang.Runnable {

    public eq0() {
    }

    public static final java.lang.ThreadLocal g = new java.lang.ThreadLocal();
    public static final a.py h = new a.py(2);
    public java.util.ArrayList c;
    public long d;
    public long e;
    public java.util.ArrayList f;

    public static a.da1 c(androidx.recyclerview.widget.RecyclerView recyclerView, int i, long j) {
        int h2 = recyclerView.h.h();
        for (int i2 = 0; i2 < h2; i2++) {
            a.da1 N = androidx.recyclerview.widget.RecyclerView.N(recyclerView.h.g(i2));
            if (N.c == i && !N.j()) {
                return null;
            }
        }
        a.t91 t91Var = recyclerView.e;
        try {
            recyclerView.U();
            a.da1 k = t91Var.k(i, j);
            if (k != null) {
                if (!k.i() || k.j()) {
                    t91Var.a(k, false);
                } else {
                    t91Var.h(k.f91a);
                }
            }
            recyclerView.V(false);
            return k;
        } catch (java.lang.Throwable th) {
            recyclerView.V(false);
            throw th;
        }
    }

    public final void a(androidx.recyclerview.widget.RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow()) {
            if (androidx.recyclerview.widget.RecyclerView.D0 && !this.c.contains(recyclerView)) {
                throw new java.lang.IllegalStateException("attempting to post unregistered view!");
            }
            if (this.d == 0) {
                this.d = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        a.cq0 cq0Var = recyclerView.i0;
        cq0Var.f78a = i;
        cq0Var.b = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(long j) {
        a.dq0 dq0Var;
        androidx.recyclerview.widget.RecyclerView recyclerView;
        androidx.recyclerview.widget.RecyclerView recyclerView2;
        a.dq0 dq0Var2;
        java.util.ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            androidx.recyclerview.widget.RecyclerView recyclerView3 = (androidx.recyclerview.widget.RecyclerView) arrayList.get(i2);
            if (recyclerView3.getWindowVisibility() == 0) {
                a.cq0 cq0Var = recyclerView3.i0;
                cq0Var.b(recyclerView3, false);
                i += cq0Var.d;
            }
        }
        java.util.ArrayList arrayList2 = this.f;
        arrayList2.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            androidx.recyclerview.widget.RecyclerView recyclerView4 = (androidx.recyclerview.widget.RecyclerView) arrayList.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                a.cq0 cq0Var2 = recyclerView4.i0;
                int abs = java.lang.Math.abs(cq0Var2.b) + java.lang.Math.abs(cq0Var2.f78a);
                for (int i5 = 0; i5 < cq0Var2.d * 2; i5 += 2) {
                    if (i3 >= arrayList2.size()) {
                        a.dq0 obj = new a.dq0();
                        arrayList2.add(obj);
                        dq0Var2 = obj;
                    } else {
                        dq0Var2 = (a.dq0) arrayList2.get(i3);
                    }
                    int[] iArr = cq0Var2.c;
                    int i6 = iArr[i5 + 1];
                    dq0Var2.f104a = i6 <= abs;
                    dq0Var2.b = abs;
                    dq0Var2.c = i6;
                    dq0Var2.d = recyclerView4;
                    dq0Var2.e = iArr[i5];
                    i3++;
                }
            }
        }
        java.util.Collections.sort(arrayList2, h);
        for (int i7 = 0; i7 < arrayList2.size() && (recyclerView = (dq0Var = (a.dq0) arrayList2.get(i7)).d) != null; i7++) {
            a.da1 c = c(recyclerView, dq0Var.e, dq0Var.f104a ? Long.MAX_VALUE : j);
            if (c != null && c.b != null && c.i() && !c.j() && (recyclerView2 = (androidx.recyclerview.widget.RecyclerView) c.b.get()) != null) {
                if (recyclerView2.F && recyclerView2.h.h() != 0) {
                    a.j91 j91Var = recyclerView2.O;
                    if (j91Var != null) {
                        j91Var.e();
                    }
                    androidx.recyclerview.widget.a aVar = recyclerView2.p;
                    a.t91 t91Var = recyclerView2.e;
                    if (aVar != null) {
                        aVar.t0(t91Var);
                        recyclerView2.p.u0(t91Var);
                    }
                    t91Var.f553a.clear();
                    t91Var.f();
                }
                a.cq0 cq0Var3 = recyclerView2.i0;
                cq0Var3.b(recyclerView2, true);
                if (cq0Var3.d != 0) {
                    try {
                        int i8 = a.gn1.f185a;
                        a.fn1.a("RV Nested Prefetch");
                        a.z91 z91Var = recyclerView2.j0;
                        a.e91 e91Var = recyclerView2.o;
                        z91Var.d = 1;
                        z91Var.e = e91Var.c();
                        z91Var.g = false;
                        z91Var.h = false;
                        z91Var.i = false;
                        for (int i9 = 0; i9 < cq0Var3.d * 2; i9 += 2) {
                            c(recyclerView2, cq0Var3.c[i9], j);
                        }
                        a.fn1.b();
                        dq0Var.f104a = false;
                        dq0Var.b = 0;
                        dq0Var.c = 0;
                        dq0Var.d = null;
                        dq0Var.e = 0;
                    } catch (java.lang.Throwable th) {
                        int i10 = a.gn1.f185a;
                        a.fn1.b();
                        throw th;
                    }
                }
            }
            dq0Var.f104a = false;
            dq0Var.b = 0;
            dq0Var.c = 0;
            dq0Var.d = null;
            dq0Var.e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = a.gn1.f185a;
            a.fn1.a("RV Prefetch");
            java.util.ArrayList arrayList = this.c;
            if (arrayList.isEmpty()) {
                this.d = 0L;
                a.fn1.b();
                return;
            }
            int size = arrayList.size();
            long j = 0;
            for (int i2 = 0; i2 < size; i2++) {
                androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) arrayList.get(i2);
                if (recyclerView.getWindowVisibility() == 0) {
                    j = java.lang.Math.max(recyclerView.getDrawingTime(), j);
                }
            }
            if (j == 0) {
                this.d = 0L;
                a.fn1.b();
            } else {
                b(java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(j) + this.e);
                this.d = 0L;
                a.fn1.b();
            }
        } catch (java.lang.Throwable th) {
            this.d = 0L;
            int i3 = a.gn1.f185a;
            a.fn1.b();
            throw th;
        }
    }
}
