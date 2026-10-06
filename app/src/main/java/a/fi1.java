package a;

import java.util.Map;
/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class fi1 implements java.lang.Cloneable {
    public static final java.lang.Object f = new java.lang.Object();
    public int[] c;
    public java.lang.Object[] d;
    public int e;

    public fi1() {
        int i;
        int i2 = 4;
        while (true) {
            i = 40;
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (40 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 4;
        this.c = new int[i4];
        this.d = new java.lang.Object[i4];
    }

    public final void a(int i, java.lang.Object obj) {
        int i2 = this.e;
        if (i2 != 0 && i <= this.c[i2 - 1]) {
            d(i, obj);
            return;
        }
        if (i2 >= this.c.length) {
            int i3 = (i2 + 1) * 4;
            int i4 = 4;
            while (true) {
                if (i4 >= 32) {
                    break;
                }
                int i5 = (1 << i4) - 12;
                if (i3 <= i5) {
                    i3 = i5;
                    break;
                }
                i4++;
            }
            int i6 = i3 / 4;
            int[] iArr = new int[i6];
            java.lang.Object[] objArr = new java.lang.Object[i6];
            int[] iArr2 = this.c;
            java.lang.System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            java.lang.Object[] objArr2 = this.d;
            java.lang.System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.c = iArr;
            this.d = objArr;
        }
        this.c[i2] = i;
        this.d[i2] = obj;
        this.e = i2 + 1;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final a.fi1 clone() {
        try {
            a.fi1 fi1Var = (a.fi1) super.clone();
            fi1Var.c = (int[]) this.c.clone();
            fi1Var.d = (java.lang.Object[]) this.d.clone();
            return fi1Var;
        } catch (java.lang.CloneNotSupportedException e) {
            throw new java.lang.AssertionError(e);
        }
    }

    public final java.lang.Object c(int i, java.lang.Integer num) {
        java.lang.Object obj;
        int l = a.wv.l(this.e, i, this.c);
        return (l < 0 || (obj = this.d[l]) == f) ? num : obj;
    }

    public final void d(int i, java.lang.Object obj) {
        int l = a.wv.l(this.e, i, this.c);
        if (l >= 0) {
            this.d[l] = obj;
            return;
        }
        int i2 = ~l;
        int i3 = this.e;
        if (i2 < i3) {
            java.lang.Object[] objArr = this.d;
            if (objArr[i2] == f) {
                this.c[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (i3 >= this.c.length) {
            int i4 = (i3 + 1) * 4;
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
            int i7 = i4 / 4;
            int[] iArr = new int[i7];
            java.lang.Object[] objArr2 = new java.lang.Object[i7];
            int[] iArr2 = this.c;
            java.lang.System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            java.lang.Object[] objArr3 = this.d;
            java.lang.System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.c = iArr;
            this.d = objArr2;
        }
        int i8 = this.e - i2;
        if (i8 != 0) {
            int[] iArr3 = this.c;
            int i9 = i2 + 1;
            java.lang.System.arraycopy(iArr3, i2, iArr3, i9, i8);
            java.lang.Object[] objArr4 = this.d;
            java.lang.System.arraycopy(objArr4, i2, objArr4, i9, this.e - i2);
        }
        this.c[i2] = i;
        this.d[i2] = obj;
        this.e++;
    }

    public final java.lang.String toString() {
        int i = this.e;
        if (i <= 0) {
            return "{}";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(i * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.e; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(this.c[i2]);
            sb.append('=');
            java.lang.Object obj = this.d[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
