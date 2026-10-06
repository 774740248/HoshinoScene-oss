package a;

import java.util.Map;
/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class rh1 {
    public static java.lang.Object[] f;
    public static int g;
    public static java.lang.Object[] h;
    public static int i;
    public int[] c;
    public java.lang.Object[] d;
    public int e;

    public rh1() {
        this.c = a.wv.k;
        this.d = a.wv.l;
        this.e = 0;
    }

    public static void c(int[] iArr, java.lang.Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (a.rh1.class) {
                try {
                    if (i < 10) {
                        objArr[0] = h;
                        objArr[1] = iArr;
                        for (int i3 = (i2 << 1) - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        h = objArr;
                        i++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (a.rh1.class) {
                try {
                    if (g < 10) {
                        objArr[0] = f;
                        objArr[1] = iArr;
                        for (int i4 = (i2 << 1) - 1; i4 >= 2; i4--) {
                            objArr[i4] = null;
                        }
                        f = objArr;
                        g++;
                    }
                } finally {
                }
            }
        }
    }

    public final void a(int i2) {
        if (i2 == 8) {
            synchronized (a.rh1.class) {
                try {
                    java.lang.Object[] objArr = h;
                    if (objArr != null) {
                        this.d = objArr;
                        h = (java.lang.Object[]) objArr[0];
                        this.c = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        i--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i2 == 4) {
            synchronized (a.rh1.class) {
                try {
                    java.lang.Object[] objArr2 = f;
                    if (objArr2 != null) {
                        this.d = objArr2;
                        f = (java.lang.Object[]) objArr2[0];
                        this.c = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        g--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.c = new int[i2];
        this.d = new java.lang.Object[i2 << 1];
    }

    public final void b(int i2) {
        int i3 = this.e;
        int[] iArr = this.c;
        if (iArr.length < i2) {
            java.lang.Object[] objArr = this.d;
            a(i2);
            if (this.e > 0) {
                java.lang.System.arraycopy(iArr, 0, this.c, 0, i3);
                java.lang.System.arraycopy(objArr, 0, this.d, 0, i3 << 1);
            }
            c(iArr, objArr, i3);
        }
        if (this.e != i3) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    public final void clear() {
        int i2 = this.e;
        if (i2 > 0) {
            int[] iArr = this.c;
            java.lang.Object[] objArr = this.d;
            this.c = a.wv.k;
            this.d = a.wv.l;
            this.e = 0;
            c(iArr, objArr, i2);
        }
        if (this.e > 0) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    public final boolean containsKey(java.lang.Object obj) {
        return e(obj) >= 0;
    }

    public final boolean containsValue(java.lang.Object obj) {
        return g(obj) >= 0;
    }

    public final int d(int i2, java.lang.Object obj) {
        int i3 = this.e;
        if (i3 == 0) {
            return -1;
        }
        try {
            int l = a.wv.l(i3, i2, this.c);
            if (l < 0 || obj.equals(this.d[l << 1])) {
                return l;
            }
            int i4 = l + 1;
            while (i4 < i3 && this.c[i4] == i2) {
                if (obj.equals(this.d[i4 << 1])) {
                    return i4;
                }
                i4++;
            }
            for (int i5 = l - 1; i5 >= 0 && this.c[i5] == i2; i5--) {
                if (obj.equals(this.d[i5 << 1])) {
                    return i5;
                }
            }
            return ~i4;
        } catch (java.lang.ArrayIndexOutOfBoundsException unused) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    public final int e(java.lang.Object obj) {
        return obj == null ? f() : d(obj.hashCode(), obj);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a.rh1) {
            a.rh1 rh1Var = (a.rh1) obj;
            if (this.e != rh1Var.e) {
                return false;
            }
            for (int i2 = 0; i2 < this.e; i2++) {
                try {
                    java.lang.Object h2 = h(i2);
                    java.lang.Object j = j(i2);
                    java.lang.Object orDefault = rh1Var.getOrDefault(h2, null);
                    if (j == null) {
                        if (orDefault != null || !rh1Var.containsKey(h2)) {
                            return false;
                        }
                    } else if (!j.equals(orDefault)) {
                        return false;
                    }
                } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof java.util.Map) {
            java.util.Map map = (java.util.Map) obj;
            if (this.e != map.size()) {
                return false;
            }
            for (int i3 = 0; i3 < this.e; i3++) {
                try {
                    java.lang.Object h3 = h(i3);
                    java.lang.Object j2 = j(i3);
                    java.lang.Object obj2 = map.get(h3);
                    if (j2 == null) {
                        if (obj2 != null || !map.containsKey(h3)) {
                            return false;
                        }
                    } else if (!j2.equals(obj2)) {
                        return false;
                    }
                } catch (java.lang.ClassCastException | java.lang.NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f() {
        int i2 = this.e;
        if (i2 == 0) {
            return -1;
        }
        try {
            int l = a.wv.l(i2, 0, this.c);
            if (l < 0 || this.d[l << 1] == null) {
                return l;
            }
            int i3 = l + 1;
            while (i3 < i2 && this.c[i3] == 0) {
                if (this.d[i3 << 1] == null) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = l - 1; i4 >= 0 && this.c[i4] == 0; i4--) {
                if (this.d[i4 << 1] == null) {
                    return i4;
                }
            }
            return ~i3;
        } catch (java.lang.ArrayIndexOutOfBoundsException unused) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    public final int g(java.lang.Object obj) {
        int i2 = this.e * 2;
        java.lang.Object[] objArr = this.d;
        if (obj == null) {
            for (int i3 = 1; i3 < i2; i3 += 2) {
                if (objArr[i3] == null) {
                    return i3 >> 1;
                }
            }
            return -1;
        }
        for (int i4 = 1; i4 < i2; i4 += 2) {
            if (obj.equals(objArr[i4])) {
                return i4 >> 1;
            }
        }
        return -1;
    }

    public final java.lang.Object get(java.lang.Object obj) {
        return getOrDefault(obj, null);
    }

    public final java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
        int e = e(obj);
        return e >= 0 ? this.d[(e << 1) + 1] : obj2;
    }

    public final java.lang.Object h(int i2) {
        return this.d[i2 << 1];
    }

    public final int hashCode() {
        int[] iArr = this.c;
        java.lang.Object[] objArr = this.d;
        int i2 = this.e;
        int i3 = 1;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            java.lang.Object obj = objArr[i3];
            i5 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i4];
            i4++;
            i3 += 2;
        }
        return i5;
    }

    public final java.lang.Object i(int i2) {
        java.lang.Object[] objArr = this.d;
        int i3 = i2 << 1;
        java.lang.Object obj = objArr[i3 + 1];
        int i4 = this.e;
        int i5 = 0;
        if (i4 <= 1) {
            c(this.c, objArr, i4);
            this.c = a.wv.k;
            this.d = a.wv.l;
        } else {
            int i6 = i4 - 1;
            int[] iArr = this.c;
            if (iArr.length <= 8 || i4 >= iArr.length / 3) {
                if (i2 < i6) {
                    int i7 = i2 + 1;
                    int i8 = i6 - i2;
                    java.lang.System.arraycopy(iArr, i7, iArr, i2, i8);
                    java.lang.Object[] objArr2 = this.d;
                    java.lang.System.arraycopy(objArr2, i7 << 1, objArr2, i3, i8 << 1);
                }
                java.lang.Object[] objArr3 = this.d;
                int i9 = i6 << 1;
                objArr3[i9] = null;
                objArr3[i9 + 1] = null;
            } else {
                a(i4 > 8 ? i4 + (i4 >> 1) : 8);
                if (i4 != this.e) {
                    throw new java.util.ConcurrentModificationException();
                }
                if (i2 > 0) {
                    java.lang.System.arraycopy(iArr, 0, this.c, 0, i2);
                    java.lang.System.arraycopy(objArr, 0, this.d, 0, i3);
                }
                if (i2 < i6) {
                    int i10 = i2 + 1;
                    int i11 = i6 - i2;
                    java.lang.System.arraycopy(iArr, i10, this.c, i2, i11);
                    java.lang.System.arraycopy(objArr, i10 << 1, this.d, i3, i11 << 1);
                }
            }
            i5 = i6;
        }
        if (i4 != this.e) {
            throw new java.util.ConcurrentModificationException();
        }
        this.e = i5;
        return obj;
    }

    public final boolean isEmpty() {
        return this.e <= 0;
    }

    public final java.lang.Object j(int i2) {
        return this.d[(i2 << 1) + 1];
    }

    public final java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        int i2;
        int d;
        int i3 = this.e;
        if (obj == null) {
            d = f();
            i2 = 0;
        } else {
            int hashCode = obj.hashCode();
            i2 = hashCode;
            d = d(hashCode, obj);
        }
        if (d >= 0) {
            int i4 = (d << 1) + 1;
            java.lang.Object[] objArr = this.d;
            java.lang.Object obj3 = objArr[i4];
            objArr[i4] = obj2;
            return obj3;
        }
        int i5 = ~d;
        int[] iArr = this.c;
        if (i3 >= iArr.length) {
            int i6 = 8;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i6 = 4;
            }
            java.lang.Object[] objArr2 = this.d;
            a(i6);
            if (i3 != this.e) {
                throw new java.util.ConcurrentModificationException();
            }
            int[] iArr2 = this.c;
            if (iArr2.length > 0) {
                java.lang.System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                java.lang.System.arraycopy(objArr2, 0, this.d, 0, objArr2.length);
            }
            c(iArr, objArr2, i3);
        }
        if (i5 < i3) {
            int[] iArr3 = this.c;
            int i7 = i5 + 1;
            java.lang.System.arraycopy(iArr3, i5, iArr3, i7, i3 - i5);
            java.lang.Object[] objArr3 = this.d;
            java.lang.System.arraycopy(objArr3, i5 << 1, objArr3, i7 << 1, (this.e - i5) << 1);
        }
        int i8 = this.e;
        if (i3 == i8) {
            int[] iArr4 = this.c;
            if (i5 < iArr4.length) {
                iArr4[i5] = i2;
                java.lang.Object[] objArr4 = this.d;
                int i9 = i5 << 1;
                objArr4[i9] = obj;
                objArr4[i9 + 1] = obj2;
                this.e = i8 + 1;
                return null;
            }
        }
        throw new java.util.ConcurrentModificationException();
    }

    public final java.lang.Object putIfAbsent(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object orDefault = getOrDefault(obj, null);
        return orDefault == null ? put(obj, obj2) : orDefault;
    }

    public final java.lang.Object remove(java.lang.Object obj) {
        int e = e(obj);
        if (e >= 0) {
            return i(e);
        }
        return null;
    }

    public final java.lang.Object replace(java.lang.Object obj, java.lang.Object obj2) {
        int e = e(obj);
        if (e < 0) {
            return null;
        }
        int i2 = (e << 1) + 1;
        java.lang.Object[] objArr = this.d;
        java.lang.Object obj3 = objArr[i2];
        objArr[i2] = obj2;
        return obj3;
    }

    public final int size() {
        return this.e;
    }

    public final java.lang.String toString() {
        if (isEmpty()) {
            return "{}";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(this.e * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.e; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            java.lang.Object h2 = h(i2);
            if (h2 != this) {
                sb.append(h2);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            java.lang.Object j = j(i2);
            if (j != this) {
                sb.append(j);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public rh1(int i2) {
        if (i2 == 0) {
            this.c = a.wv.k;
            this.d = a.wv.l;
        } else {
            a(i2);
        }
        this.e = 0;
    }

    public final boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        int e = e(obj);
        if (e < 0) {
            return false;
        }
        java.lang.Object j = j(e);
        if (obj2 != j && (obj2 == null || !obj2.equals(j))) {
            return false;
        }
        i(e);
        return true;
    }

    public final boolean replace(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int e = e(obj);
        if (e < 0) {
            return false;
        }
        java.lang.Object j = j(e);
        if (j != obj2 && (obj2 == null || !obj2.equals(j))) {
            return false;
        }
        int i2 = (e << 1) + 1;
        java.lang.Object[] objArr = this.d;
        java.lang.Object obj4 = objArr[i2];
        objArr[i2] = obj3;
        return true;
    }
}
