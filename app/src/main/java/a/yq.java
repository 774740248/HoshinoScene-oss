package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class yq implements a.ww0 {
    public final a.ww0 c;
    public int d = 0;
    public int e = -1;
    public int f = -1;
    public java.lang.Object g = null;

    public yq(a.pe peVar) {
        this.c = peVar;
    }

    @Override // a.ww0
    public final void a(int i, int i2) {
        int i3;
        if (this.d == 2 && (i3 = this.e) >= i && i3 <= i + i2) {
            this.f += i2;
            this.e = i;
        } else {
            d();
            this.e = i;
            this.f = i2;
            this.d = 2;
        }
    }

    @Override // a.ww0
    public final void b(int i, int i2) {
        int i3;
        if (this.d == 1 && i >= (i3 = this.e)) {
            int i4 = this.f;
            if (i <= i3 + i4) {
                this.f = i4 + i2;
                this.e = java.lang.Math.min(i, i3);
                return;
            }
        }
        d();
        this.e = i;
        this.f = i2;
        this.d = 1;
    }

    @Override // a.ww0
    public final void c(int i, int i2) {
        d();
        this.c.c(i, i2);
    }

    public final void d() {
        int i = this.d;
        if (i == 0) {
            return;
        }
        a.ww0 ww0Var = this.c;
        if (i == 1) {
            ww0Var.b(this.e, this.f);
        } else if (i == 2) {
            ww0Var.a(this.e, this.f);
        } else if (i == 3) {
            ww0Var.e(this.e, this.f, this.g);
        }
        this.g = null;
        this.d = 0;
    }

    @Override // a.ww0
    public final void e(int i, int i2, java.lang.Object obj) {
        int i3;
        if (this.d == 3) {
            int i4 = this.e;
            int i5 = this.f;
            if (i <= i4 + i5 && (i3 = i + i2) >= i4 && this.g == obj) {
                this.e = java.lang.Math.min(i, i4);
                this.f = java.lang.Math.max(i5 + i4, i3) - this.e;
                return;
            }
        }
        d();
        this.e = i;
        this.f = i2;
        this.g = obj;
        this.d = 3;
    }
}
