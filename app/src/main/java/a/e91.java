package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class e91 {
    public final a.f91 c = new a.f91();
    public boolean d = false;
    public final int e = 1;

    public abstract int c();

    public long d(int i) {
        return -1L;
    }

    public int e(int i) {
        return 0;
    }

    public final void f() {
        this.c.b();
    }

    public final void g(int i) {
        this.c.d(i, 1, null);
    }

    public void h(androidx.recyclerview.widget.RecyclerView recyclerView) {
    }

    public abstract void i(a.da1 da1Var, int i);

    public void j(a.da1 da1Var, int i, java.util.List list) {
        i(da1Var, i);
    }

    public abstract a.da1 k(androidx.recyclerview.widget.RecyclerView recyclerView, int i);

    public void l(androidx.recyclerview.widget.RecyclerView recyclerView) {
    }

    public void m(a.da1 da1Var) {
    }

    public void n(a.da1 da1Var) {
    }

    public final void o() {
        if (this.c.a()) {
            throw new java.lang.IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.d = true;
    }
}
