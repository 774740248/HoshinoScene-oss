package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class uv0 {

    public uv0() {
    }


    /* renamed from: a, reason: collision with root package name */
    public boolean f609a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public java.util.List k;
    public boolean l;

    public final void a(android.view.View view) {
        int e;
        int size = this.k.size();
        android.view.View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            android.view.View view3 = ((a.da1) this.k.get(i2)).f91a;
            a.n91 n91Var = (a.n91) view3.getLayoutParams();
            if (view3 != view && !n91Var.c.l() && (e = (n91Var.c.e() - this.d) * this.e) >= 0 && e < i) {
                view2 = view3;
                if (e == 0) {
                    break;
                } else {
                    i = e;
                }
            }
        }
        if (view2 == null) {
            this.d = -1;
        } else {
            this.d = ((a.n91) view2.getLayoutParams()).c.e();
        }
    }

    public final android.view.View b(a.t91 t91Var) {
        java.util.List list = this.k;
        if (list == null) {
            android.view.View view = t91Var.k(this.d, Long.MAX_VALUE).f91a;
            this.d += this.e;
            return view;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            android.view.View view2 = ((a.da1) this.k.get(i)).f91a;
            a.n91 n91Var = (a.n91) view2.getLayoutParams();
            if (!n91Var.c.l() && this.d == n91Var.c.e()) {
                a(view2);
                return view2;
            }
        }
        return null;
    }
}
