package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class mp {

    public mp() {
        this(null);
    }
    public a.lp d;

    /* renamed from: a, reason: collision with root package name */
    public a.bi1 f358a = null;
    public float b = 0.0f;
    public java.util.ArrayList c = new java.util.ArrayList();
    public boolean e = false;

    public mp(a.ej1 ej1Var) {
        this.d = new a.ip(this, ej1Var);
    }

    public final void a(a.zv0 zv0Var, int i) {
        this.d.c(zv0Var.i(i), 1.0f);
        this.d.c(zv0Var.i(i), -1.0f);
    }

    public final void b(a.bi1 bi1Var, a.bi1 bi1Var2, a.bi1 bi1Var3, int i) {
        boolean z;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            } else {
                z = false;
            }
            this.b = i;
            if (z) {
                this.d.c(bi1Var, 1.0f);
                this.d.c(bi1Var2, -1.0f);
                this.d.c(bi1Var3, -1.0f);
                return;
            }
        }
        this.d.c(bi1Var, -1.0f);
        this.d.c(bi1Var2, 1.0f);
        this.d.c(bi1Var3, 1.0f);
    }

    public final void c(a.bi1 bi1Var, a.bi1 bi1Var2, a.bi1 bi1Var3, int i) {
        boolean z;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            } else {
                z = false;
            }
            this.b = i;
            if (z) {
                this.d.c(bi1Var, 1.0f);
                this.d.c(bi1Var2, -1.0f);
                this.d.c(bi1Var3, 1.0f);
                return;
            }
        }
        this.d.c(bi1Var, -1.0f);
        this.d.c(bi1Var2, 1.0f);
        this.d.c(bi1Var3, -1.0f);
    }

    public a.bi1 d(boolean[] zArr) {
        return e(zArr, null);
    }

    public final a.bi1 e(boolean[] zArr, a.bi1 bi1Var) {
        int i;
        int k = this.d.k();
        a.bi1 bi1Var2 = null;
        float f = 0.0f;
        for (int i2 = 0; i2 < k; i2++) {
            float a2 = this.d.a(i2);
            if (a2 < 0.0f) {
                a.bi1 f2 = this.d.f(i2);
                if ((zArr == null || !zArr[f2.b]) && f2 != bi1Var && (((i = f2.l) == 3 || i == 4) && a2 < f)) {
                    f = a2;
                    bi1Var2 = f2;
                }
            }
        }
        return bi1Var2;
    }

    public final void f(a.bi1 bi1Var) {
        a.bi1 bi1Var2 = this.f358a;
        if (bi1Var2 != null) {
            this.d.c(bi1Var2, -1.0f);
            this.f358a = null;
        }
        float h = this.d.h(bi1Var, true) * (-1.0f);
        this.f358a = bi1Var;
        if (h == 1.0f) {
            return;
        }
        this.b /= h;
        this.d.g(h);
    }

    public final void g(a.bi1 bi1Var, boolean z) {
        if (bi1Var.f) {
            float i = this.d.i(bi1Var);
            this.b = (bi1Var.e * i) + this.b;
            this.d.h(bi1Var, z);
            if (z) {
                bi1Var.b(this);
            }
        }
    }

    public void h(a.mp mpVar, boolean z) {
        float b = this.d.b(mpVar, z);
        this.b = (mpVar.b * b) + this.b;
        if (z) {
            mpVar.f358a.b(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r10 = this;
            a.bi1 r0 = r10.f358a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L17
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            a.bi1 r1 = r10.f358a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L17:
            java.lang.String r1 = " = "
            java.lang.String r0 = a.ii1.e(r0, r1)
            float r1 = r10.b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L39
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r10.b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = r3
            goto L3a
        L39:
            r1 = r4
        L3a:
            a.lp r5 = r10.d
            int r5 = r5.k()
        L40:
            if (r4 >= r5) goto La0
            a.lp r6 = r10.d
            a.bi1 r6 = r6.f(r4)
            if (r6 != 0) goto L4b
            goto L9d
        L4b:
            a.lp r7 = r10.d
            float r7 = r7.a(r4)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L56
            goto L9d
        L56:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L6a
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L7a
            java.lang.String r1 = "- "
            java.lang.String r0 = a.ii1.e(r0, r1)
        L68:
            float r7 = r7 * r9
            goto L7a
        L6a:
            if (r8 <= 0) goto L73
            java.lang.String r1 = " + "
            java.lang.String r0 = a.ii1.e(r0, r1)
            goto L7a
        L73:
            java.lang.String r1 = " - "
            java.lang.String r0 = a.ii1.e(r0, r1)
            goto L68
        L7a:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L85
            java.lang.String r0 = a.ii1.e(r0, r6)
            goto L9c
        L85:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L9c:
            r1 = r3
        L9d:
            int r4 = r4 + 1
            goto L40
        La0:
            if (r1 != 0) goto La8
            java.lang.String r1 = "0.0"
            java.lang.String r0 = a.ii1.e(r0, r1)
        La8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.mp.toString():java.lang.String");
    }
}
