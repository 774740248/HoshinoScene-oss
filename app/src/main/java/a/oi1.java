package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class oi1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f410a = new java.util.ArrayList();
    public int b = Integer.MIN_VALUE;
    public int c = Integer.MIN_VALUE;
    public int d = 0;
    public final int e;
    public final /* synthetic */ androidx.recyclerview.widget.StaggeredGridLayoutManager f;

    public oi1(androidx.recyclerview.widget.StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.f = staggeredGridLayoutManager;
        this.e = i;
    }

    public final void a() {
        android.view.View view = (android.view.View) this.f410a.get(this.a.size() - 1);
        a.li1 li1Var = (a.li1) view.getLayoutParams();
        this.c = this.f.t.d(view);
        li1Var.getClass();
    }

    public final void b() {
        this.f410a.clear();
        this.b = Integer.MIN_VALUE;
        this.c = Integer.MIN_VALUE;
        this.d = 0;
    }

    public final int c() {
        return this.f.y ? e(this.a.size() - 1, -1) : e(0, this.f410a.size());
    }

    public final int d() {
        return this.f.y ? e(0, this.f410a.size()) : e(this.a.size() - 1, -1);
    }

    public final int e(int i, int i2) {
        androidx.recyclerview.widget.StaggeredGridLayoutManager staggeredGridLayoutManager = this.f;
        int i3 = staggeredGridLayoutManager.t.i();
        int h = staggeredGridLayoutManager.t.h();
        int i4 = i2 > i ? 1 : -1;
        while (i != i2) {
            android.view.View view = (android.view.View) this.f410a.get(i);
            int f = staggeredGridLayoutManager.t.f(view);
            int d = staggeredGridLayoutManager.t.d(view);
            boolean z = f <= h;
            boolean z2 = d >= i3;
            if (z && z2 && (f < i3 || d > h)) {
                return androidx.recyclerview.widget.a.Q(view);
            }
            i += i4;
        }
        return -1;
    }

    public final int f(int i) {
        int i2 = this.c;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.f410a.size() == 0) {
            return i;
        }
        a();
        return this.c;
    }

    public final android.view.View g(int i, int i2) {
        java.util.ArrayList arrayList = this.f410a;
        androidx.recyclerview.widget.StaggeredGridLayoutManager staggeredGridLayoutManager = this.f;
        android.view.View view = null;
        if (i2 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                android.view.View view2 = (android.view.View) arrayList.get(size);
                if ((staggeredGridLayoutManager.y && androidx.recyclerview.widget.a.Q(view2) >= i) || ((!staggeredGridLayoutManager.y && androidx.recyclerview.widget.a.Q(view2) <= i) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
        } else {
            int size2 = arrayList.size();
            int i3 = 0;
            while (i3 < size2) {
                android.view.View view3 = (android.view.View) arrayList.get(i3);
                if ((staggeredGridLayoutManager.y && androidx.recyclerview.widget.a.Q(view3) <= i) || ((!staggeredGridLayoutManager.y && androidx.recyclerview.widget.a.Q(view3) >= i) || !view3.hasFocusable())) {
                    break;
                }
                i3++;
                view = view3;
            }
        }
        return view;
    }

    public final int h(int i) {
        int i2 = this.b;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.f410a.size() == 0) {
            return i;
        }
        android.view.View view = (android.view.View) this.f410a.get(0);
        a.li1 li1Var = (a.li1) view.getLayoutParams();
        this.b = this.f.t.f(view);
        li1Var.getClass();
        return this.b;
    }
}
