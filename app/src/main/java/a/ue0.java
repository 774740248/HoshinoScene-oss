package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ue0 {
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public float j;
    public float k;
    public int l;
    public int m;
    public int o;
    public int p;
    public boolean q;
    public boolean r;

    /* renamed from: a, reason: collision with root package name */
    public int f590a = Integer.MAX_VALUE;
    public int b = Integer.MAX_VALUE;
    public int c = Integer.MIN_VALUE;
    public int d = Integer.MIN_VALUE;
    public final java.util.ArrayList n = new java.util.ArrayList();

    public final int a() {
        return this.h - this.i;
    }

    public final void b(android.view.View view, int i, int i2, int i3, int i4) {
        a.te0 te0Var = (a.te0) view.getLayoutParams();
        this.f590a = java.lang.Math.min(this.f590a, (view.getLeft() - te0Var.m()) - i);
        this.b = java.lang.Math.min(this.b, (view.getTop() - te0Var.q()) - i2);
        this.c = java.lang.Math.max(this.c, te0Var.a() + view.getRight() + i3);
        this.d = java.lang.Math.max(this.d, te0Var.k() + view.getBottom() + i4);
    }
}
