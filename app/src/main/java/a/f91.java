package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class f91 extends android.database.Observable {
    public final boolean a() {
        return !this.mObservers.isEmpty();
    }

    public final void b() {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            androidx.recyclerview.widget.RecyclerView recyclerView = ((a.v91) this.mObservers.get(size)).f628a;
            recyclerView.k(null);
            recyclerView.j0.f = true;
            recyclerView.Z(true);
            if (!recyclerView.g.g()) {
                recyclerView.requestLayout();
            }
        }
    }

    public final void c(int i, int i2) {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            a.v91 v91Var = (a.v91) this.mObservers.get(size);
            androidx.recyclerview.widget.RecyclerView recyclerView = v91Var.f628a;
            recyclerView.k(null);
            a.vi viVar = recyclerView.g;
            viVar.getClass();
            if (i != i2) {
                java.util.ArrayList arrayList = viVar.b;
                arrayList.add(viVar.h(null, 8, i, i2));
                viVar.f |= 8;
                if (arrayList.size() == 1) {
                    v91Var.a();
                }
            }
        }
    }

    public final void d(int i, int i2, java.lang.Object obj) {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            a.v91 v91Var = (a.v91) this.mObservers.get(size);
            androidx.recyclerview.widget.RecyclerView recyclerView = v91Var.f628a;
            recyclerView.k(null);
            a.vi viVar = recyclerView.g;
            if (i2 < 1) {
                viVar.getClass();
            } else {
                java.util.ArrayList arrayList = viVar.b;
                arrayList.add(viVar.h(obj, 4, i, i2));
                viVar.f = 4 | viVar.f;
                if (arrayList.size() == 1) {
                    v91Var.a();
                }
            }
        }
    }

    public final void e(int i, int i2) {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            a.v91 v91Var = (a.v91) this.mObservers.get(size);
            androidx.recyclerview.widget.RecyclerView recyclerView = v91Var.f628a;
            recyclerView.k(null);
            a.vi viVar = recyclerView.g;
            if (i2 < 1) {
                viVar.getClass();
            } else {
                java.util.ArrayList arrayList = viVar.b;
                arrayList.add(viVar.h(null, 1, i, i2));
                viVar.f |= 1;
                if (arrayList.size() == 1) {
                    v91Var.a();
                }
            }
        }
    }

    public final void f(int i, int i2) {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            a.v91 v91Var = (a.v91) this.mObservers.get(size);
            androidx.recyclerview.widget.RecyclerView recyclerView = v91Var.f628a;
            recyclerView.k(null);
            a.vi viVar = recyclerView.g;
            if (i2 < 1) {
                viVar.getClass();
            } else {
                java.util.ArrayList arrayList = viVar.b;
                arrayList.add(viVar.h(null, 2, i, i2));
                viVar.f |= 2;
                if (arrayList.size() == 1) {
                    v91Var.a();
                }
            }
        }
    }
}
