package a;

import java.util.Map;
/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class sx0 implements java.lang.Cloneable {
    public static final java.lang.Object g = new java.lang.Object();
    public boolean c = false;
    public long[] d;
    public java.lang.Object[] e;
    public int f;

    public sx0() {
        int i;
        int i2 = 4;
        while (true) {
            i = 80;
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (80 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 8;
        this.d = new long[i4];
        this.e = new java.lang.Object[i4];
    }

    public final void a() {
        int i = this.f;
        java.lang.Object[] objArr = this.e;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f = 0;
        this.c = false;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final a.sx0 clone() {
        try {
            a.sx0 sx0Var = (a.sx0) super.clone();
            sx0Var.d = (long[]) this.d.clone();
            sx0Var.e = (java.lang.Object[]) this.e.clone();
            return sx0Var;
        } catch (java.lang.CloneNotSupportedException e) {
            throw new java.lang.AssertionError(e);
        }
    }

    public final void c() {
        int i = this.f;
        long[] jArr = this.d;
        java.lang.Object[] objArr = this.e;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            java.lang.Object obj = objArr[i3];
            if (obj != g) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.c = false;
        this.f = i2;
    }

    public final java.lang.Object d(long j, java.lang.Long l) {
        java.lang.Object obj;
        int m = a.wv.m(this.d, this.f, j);
        return (m < 0 || (obj = this.e[m]) == g) ? l : obj;
    }

    public final void e(long j, java.lang.Object obj) {
        int m = a.wv.m(this.d, this.f, j);
        if (m >= 0) {
            this.e[m] = obj;
            return;
        }
        int i = ~m;
        int i2 = this.f;
        if (i < i2) {
            java.lang.Object[] objArr = this.e;
            if (objArr[i] == g) {
                this.d[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.c && i2 >= this.d.length) {
            c();
            i = ~a.wv.m(this.d, this.f, j);
        }
        int i3 = this.f;
        if (i3 >= this.d.length) {
            int i4 = (i3 + 1) * 8;
            int i5 = 4;
            while (true) {
                if (i5 >= 32) {
                    break;
                }
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
                i5++;
            }
            int i7 = i4 / 8;
            long[] jArr = new long[i7];
            java.lang.Object[] objArr2 = new java.lang.Object[i7];
            long[] jArr2 = this.d;
            java.lang.System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            java.lang.Object[] objArr3 = this.e;
            java.lang.System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.d = jArr;
            this.e = objArr2;
        }
        int i8 = this.f - i;
        if (i8 != 0) {
            long[] jArr3 = this.d;
            int i9 = i + 1;
            java.lang.System.arraycopy(jArr3, i, jArr3, i9, i8);
            java.lang.Object[] objArr4 = this.e;
            java.lang.System.arraycopy(objArr4, i, objArr4, i9, this.f - i);
        }
        this.d[i] = j;
        this.e[i] = obj;
        this.f++;
    }

    public final int f() {
        if (this.c) {
            c();
        }
        return this.f;
    }

    public final java.lang.Object g(int i) {
        if (this.c) {
            c();
        }
        return this.e[i];
    }

    public final java.lang.String toString() {
        if (f() <= 0) {
            return "{}";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(this.f * 28);
        sb.append('{');
        for (int i = 0; i < this.f; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            if (this.c) {
                c();
            }
            sb.append(this.d[i]);
            sb.append('=');
            java.lang.Object g2 = g(i);
            if (g2 != this) {
                sb.append(g2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
