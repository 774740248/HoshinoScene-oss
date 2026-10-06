package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class sv0 {

    /* renamed from: a, reason: collision with root package name */
    public a.m31 f541a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;

    public sv0() {
        d();
    }

    public final void a() {
        this.c = this.d ? this.f541a.h() : this.f541a.i();
    }

    public final void b(android.view.View view, int i) {
        if (this.d) {
            this.c = this.f541a.k() + this.f541a.d(view);
        } else {
            this.c = this.f541a.f(view);
        }
        this.b = i;
    }

    public final void c(android.view.View view, int i) {
        int k = this.f541a.k();
        if (k >= 0) {
            b(view, i);
            return;
        }
        this.b = i;
        if (!this.d) {
            int f = this.f541a.f(view);
            int i2 = f - this.f541a.i();
            this.c = f;
            if (i2 > 0) {
                int h = (this.f541a.h() - java.lang.Math.min(0, (this.f541a.h() - k) - this.f541a.d(view))) - (this.f541a.e(view) + f);
                if (h < 0) {
                    this.c -= java.lang.Math.min(i2, -h);
                    return;
                }
                return;
            }
            return;
        }
        int h2 = (this.f541a.h() - k) - this.f541a.d(view);
        this.c = this.f541a.h() - h2;
        if (h2 > 0) {
            int e = this.c - this.f541a.e(view);
            int i3 = this.f541a.i();
            int min = e - (java.lang.Math.min(this.f541a.f(view) - i3, 0) + i3);
            if (min < 0) {
                this.c = java.lang.Math.min(h2, -min) + this.c;
            }
        }
    }

    public final void d() {
        this.b = -1;
        this.c = Integer.MIN_VALUE;
        this.d = false;
        this.e = false;
    }

    public final java.lang.String toString() {
        return "AnchorInfo{mPosition=" + this.b + ", mCoordinate=" + this.c + ", mLayoutFromEnd=" + this.d + ", mValid=" + this.e + '}';
    }
}
