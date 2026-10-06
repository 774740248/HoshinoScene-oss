package a;

import java.util.Set;
/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class np implements java.util.Collection, java.util.Set {
    public static final int[] g = new int[0];
    public static final java.lang.Object[] h = new java.lang.Object[0];
    public static java.lang.Object[] i;
    public static int j;
    public static java.lang.Object[] k;
    public static int l;
    public int[] c;
    public java.lang.Object[] d;
    public int e;
    public a.jp f;

    public np(int i2) {
        if (i2 == 0) {
            this.c = g;
            this.d = h;
        } else {
            a(i2);
        }
        this.e = 0;
    }

    public static void b(int[] iArr, java.lang.Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (a.np.class) {
                try {
                    if (l < 10) {
                        objArr[0] = k;
                        objArr[1] = iArr;
                        for (int i3 = i2 - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        k = objArr;
                        l++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (a.np.class) {
                try {
                    if (j < 10) {
                        objArr[0] = i;
                        objArr[1] = iArr;
                        for (int i4 = i2 - 1; i4 >= 2; i4--) {
                            objArr[i4] = null;
                        }
                        i = objArr;
                        j++;
                    }
                } finally {
                }
            }
        }
    }

    public final void a(int i2) {
        if (i2 == 8) {
            synchronized (a.np.class) {
                try {
                    java.lang.Object[] objArr = k;
                    if (objArr != null) {
                        this.d = objArr;
                        k = (java.lang.Object[]) objArr[0];
                        this.c = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        l--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i2 == 4) {
            synchronized (a.np.class) {
                try {
                    java.lang.Object[] objArr2 = i;
                    if (objArr2 != null) {
                        this.d = objArr2;
                        i = (java.lang.Object[]) objArr2[0];
                        this.c = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        j--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.c = new int[i2];
        this.d = new java.lang.Object[i2];
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(java.lang.Object obj) {
        int i2;
        int c;
        if (obj == null) {
            c = d();
            i2 = 0;
        } else {
            int hashCode = obj.hashCode();
            i2 = hashCode;
            c = c(hashCode, obj);
        }
        if (c >= 0) {
            return false;
        }
        int i3 = ~c;
        int i4 = this.e;
        int[] iArr = this.c;
        if (i4 >= iArr.length) {
            int i5 = 8;
            if (i4 >= 8) {
                i5 = (i4 >> 1) + i4;
            } else if (i4 < 4) {
                i5 = 4;
            }
            java.lang.Object[] objArr = this.d;
            a(i5);
            int[] iArr2 = this.c;
            if (iArr2.length > 0) {
                java.lang.System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                java.lang.System.arraycopy(objArr, 0, this.d, 0, objArr.length);
            }
            b(iArr, objArr, this.e);
        }
        int i6 = this.e;
        if (i3 < i6) {
            int[] iArr3 = this.c;
            int i7 = i3 + 1;
            java.lang.System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            java.lang.Object[] objArr2 = this.d;
            java.lang.System.arraycopy(objArr2, i3, objArr2, i7, this.e - i3);
        }
        this.c[i3] = i2;
        this.d[i3] = obj;
        this.e++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(java.util.Collection collection) {
        int size = collection.size() + this.e;
        int[] iArr = this.c;
        boolean z = false;
        if (iArr.length < size) {
            java.lang.Object[] objArr = this.d;
            a(size);
            int i2 = this.e;
            if (i2 > 0) {
                java.lang.System.arraycopy(iArr, 0, this.c, 0, i2);
                java.lang.System.arraycopy(objArr, 0, this.d, 0, this.e);
            }
            b(iArr, objArr, this.e);
        }
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            z |= add(it.next());
        }
        return z;
    }

    public final int c(int i2, java.lang.Object obj) {
        int i3 = this.e;
        if (i3 == 0) {
            return -1;
        }
        int l2 = a.wv.l(i3, i2, this.c);
        if (l2 < 0 || obj.equals(this.d[l2])) {
            return l2;
        }
        int i4 = l2 + 1;
        while (i4 < i3 && this.c[i4] == i2) {
            if (obj.equals(this.d[i4])) {
                return i4;
            }
            i4++;
        }
        for (int i5 = l2 - 1; i5 >= 0 && this.c[i5] == i2; i5--) {
            if (obj.equals(this.d[i5])) {
                return i5;
            }
        }
        return ~i4;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i2 = this.e;
        if (i2 != 0) {
            b(this.c, this.d, i2);
            this.c = g;
            this.d = h;
            this.e = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(java.util.Collection collection) {
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int d() {
        int i2 = this.e;
        if (i2 == 0) {
            return -1;
        }
        int l2 = a.wv.l(i2, 0, this.c);
        if (l2 < 0 || this.d[l2] == null) {
            return l2;
        }
        int i3 = l2 + 1;
        while (i3 < i2 && this.c[i3] == 0) {
            if (this.d[i3] == null) {
                return i3;
            }
            i3++;
        }
        for (int i4 = l2 - 1; i4 >= 0 && this.c[i4] == 0; i4--) {
            if (this.d[i4] == null) {
                return i4;
            }
        }
        return ~i3;
    }

    public final void e(int i2) {
        java.lang.Object[] objArr = this.d;
        java.lang.Object obj = objArr[i2];
        int i3 = this.e;
        if (i3 <= 1) {
            b(this.c, objArr, i3);
            this.c = g;
            this.d = h;
            this.e = 0;
            return;
        }
        int[] iArr = this.c;
        if (iArr.length <= 8 || i3 >= iArr.length / 3) {
            int i4 = i3 - 1;
            this.e = i4;
            if (i2 < i4) {
                int i5 = i2 + 1;
                java.lang.System.arraycopy(iArr, i5, iArr, i2, i4 - i2);
                java.lang.Object[] objArr2 = this.d;
                java.lang.System.arraycopy(objArr2, i5, objArr2, i2, this.e - i2);
            }
            this.d[this.e] = null;
            return;
        }
        a(i3 > 8 ? i3 + (i3 >> 1) : 8);
        this.e--;
        if (i2 > 0) {
            java.lang.System.arraycopy(iArr, 0, this.c, 0, i2);
            java.lang.System.arraycopy(objArr, 0, this.d, 0, i2);
        }
        int i6 = this.e;
        if (i2 < i6) {
            int i7 = i2 + 1;
            java.lang.System.arraycopy(iArr, i7, this.c, i2, i6 - i2);
            java.lang.System.arraycopy(objArr, i7, this.d, i2, this.e - i2);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof java.util.Set) {
            java.util.Set set = (java.util.Set) obj;
            if (this.e != set.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.e; i2++) {
                try {
                    if (!set.contains(this.d[i2])) {
                        return false;
                    }
                } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.c;
        int i2 = this.e;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += iArr[i4];
        }
        return i3;
    }

    public final int indexOf(java.lang.Object obj) {
        return obj == null ? d() : c(obj.hashCode(), obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.e <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        int i2 = 1;
        if (this.f == null) {
            this.f = new a.jp(i2, this);
        }
        a.jp jpVar = this.f;
        if (((a.dy0) jpVar.c) == null) {
            jpVar.c = new a.dy0(jpVar, i2);
        }
        return ((a.dy0) jpVar.c).iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        e(indexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(java.util.Collection collection) {
        java.util.Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(java.util.Collection collection) {
        boolean z = false;
        for (int i2 = this.e - 1; i2 >= 0; i2--) {
            if (!collection.contains(this.d[i2])) {
                e(i2);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.e;
    }

    @Override // java.util.Collection, java.util.Set
    public final java.lang.Object[] toArray() {
        int i2 = this.e;
        java.lang.Object[] objArr = new java.lang.Object[i2];
        java.lang.System.arraycopy(this.d, 0, objArr, 0, i2);
        return objArr;
    }

    public final java.lang.String toString() {
        if (isEmpty()) {
            return "{}";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(this.e * 14);
        sb.append('{');
        for (int i2 = 0; i2 < this.e; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            java.lang.Object obj = this.d[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        if (objArr.length < this.e) {
            objArr = (java.lang.Object[]) java.lang.reflect.Array.newInstance(objArr.getClass().getComponentType(), this.e);
        }
        java.lang.System.arraycopy(this.d, 0, objArr, 0, this.e);
        int length = objArr.length;
        int i2 = this.e;
        if (length > i2) {
            objArr[i2] = null;
        }
        return objArr;
    }
}
