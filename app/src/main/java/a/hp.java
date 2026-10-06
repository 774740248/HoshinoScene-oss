package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class hp extends a.i {
    public static final java.lang.Object[] f = new java.lang.Object[0];
    public int c;
    public java.lang.Object[] d = f;
    public int e;

    public final void a(int i, java.util.Collection collection) {
        java.util.Iterator it = collection.iterator();
        int length = this.d.length;
        while (i < length && it.hasNext()) {
            this.d[i] = it.next();
            i++;
        }
        int i2 = this.c;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.d[i3] = it.next();
        }
        this.e = collection.size() + this.e;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(java.lang.Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection collection) {
        a.wv.w(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        b(collection.size() + this.e);
        a(d(this.c + this.e), collection);
        return true;
    }

    public final void addFirst(java.lang.Object obj) {
        b(this.e + 1);
        int i = this.c;
        if (i == 0) {
            java.lang.Object[] objArr = this.d;
            a.wv.w(objArr, "<this>");
            i = objArr.length;
        }
        int i2 = i - 1;
        this.c = i2;
        this.d[i2] = obj;
        this.e++;
    }

    public final void addLast(java.lang.Object obj) {
        b(this.e + 1);
        this.d[d(this.c + this.e)] = obj;
        this.e++;
    }

    public final void b(int i) {
        if (i < 0) {
            throw new java.lang.IllegalStateException("Deque is too big.");
        }
        java.lang.Object[] objArr = this.d;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == f) {
            if (i < 10) {
                i = 10;
            }
            this.d = new java.lang.Object[i];
            return;
        }
        int length = objArr.length;
        int i2 = length + (length >> 1);
        if (i2 - i < 0) {
            i2 = i;
        }
        if (i2 - 2147483639 > 0) {
            i2 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        java.lang.Object[] objArr2 = new java.lang.Object[i2];
        a.op.L1(objArr, objArr2, 0, this.c, objArr.length);
        java.lang.Object[] objArr3 = this.d;
        int length2 = objArr3.length;
        int i3 = this.c;
        a.op.L1(objArr3, objArr2, length2 - i3, 0, i3);
        this.c = 0;
        this.d = objArr2;
    }

    public final int c(int i) {
        a.wv.w(this.d, "<this>");
        if (i == r0.length - 1) {
            return 0;
        }
        return i + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int d = d(this.c + this.e);
        int i = this.c;
        if (i < d) {
            java.lang.Object[] objArr = this.d;
            a.wv.w(objArr, "<this>");
            java.util.Arrays.fill(objArr, i, d, (java.lang.Object) null);
        } else if (!isEmpty()) {
            java.lang.Object[] objArr2 = this.d;
            java.util.Arrays.fill(objArr2, this.c, objArr2.length, (java.lang.Object) null);
            java.lang.Object[] objArr3 = this.d;
            a.wv.w(objArr3, "<this>");
            java.util.Arrays.fill(objArr3, 0, d, (java.lang.Object) null);
        }
        this.c = 0;
        this.e = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object obj) {
        return indexOf(obj) != -1;
    }

    public final int d(int i) {
        java.lang.Object[] objArr = this.d;
        return i >= objArr.length ? i - objArr.length : i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int i) {
        a.fa0.c(i, this.e);
        return this.d[d(this.c + i)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object obj) {
        int i;
        int d = d(this.c + this.e);
        int i2 = this.c;
        if (i2 < d) {
            while (i2 < d) {
                if (a.wv.e(obj, this.d[i2])) {
                    i = this.c;
                } else {
                    i2++;
                }
            }
            return -1;
        }
        if (i2 < d) {
            return -1;
        }
        int length = this.d.length;
        while (true) {
            if (i2 >= length) {
                for (int i3 = 0; i3 < d; i3++) {
                    if (a.wv.e(obj, this.d[i3])) {
                        i2 = i3 + this.d.length;
                        i = this.c;
                    }
                }
                return -1;
            }
            if (a.wv.e(obj, this.d[i2])) {
                i = this.c;
                break;
            }
            i2++;
        }
        return i2 - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.e == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        int length;
        int i;
        int d = d(this.c + this.e);
        int i2 = this.c;
        if (i2 < d) {
            length = d - 1;
            if (i2 <= length) {
                while (!a.wv.e(obj, this.d[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.c;
                return length - i;
            }
            return -1;
        }
        if (i2 > d) {
            int i3 = d - 1;
            while (true) {
                if (-1 >= i3) {
                    java.lang.Object[] objArr = this.d;
                    a.wv.w(objArr, "<this>");
                    length = objArr.length - 1;
                    int i4 = this.c;
                    if (i4 <= length) {
                        while (!a.wv.e(obj, this.d[length])) {
                            if (length != i4) {
                                length--;
                            }
                        }
                        i = this.c;
                    }
                } else {
                    if (a.wv.e(obj, this.d[i3])) {
                        length = i3 + this.d.length;
                        i = this.c;
                        break;
                    }
                    i3--;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(java.lang.Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(java.util.Collection collection) {
        int d;
        a.wv.w(collection, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.d.length != 0) {
            int d2 = d(this.c + this.e);
            int i = this.c;
            if (i < d2) {
                d = i;
                while (i < d2) {
                    java.lang.Object obj = this.d[i];
                    if (!collection.contains(obj)) {
                        this.d[d] = obj;
                        d++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                java.lang.Object[] objArr = this.d;
                a.wv.w(objArr, "<this>");
                java.util.Arrays.fill(objArr, d, d2, (java.lang.Object) null);
            } else {
                int length = this.d.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    java.lang.Object[] objArr2 = this.d;
                    java.lang.Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (!collection.contains(obj2)) {
                        this.d[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                d = d(i2);
                for (int i3 = 0; i3 < d2; i3++) {
                    java.lang.Object[] objArr3 = this.d;
                    java.lang.Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (!collection.contains(obj3)) {
                        this.d[d] = obj3;
                        d = c(d);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                int i4 = d - this.c;
                if (i4 < 0) {
                    i4 += this.d.length;
                }
                this.e = i4;
            }
        }
        return z;
    }

    public final java.lang.Object removeFirst() {
        if (isEmpty()) {
            throw new java.util.NoSuchElementException("ArrayDeque is empty.");
        }
        java.lang.Object[] objArr = this.d;
        int i = this.c;
        java.lang.Object obj = objArr[i];
        objArr[i] = null;
        this.c = c(i);
        this.e--;
        return obj;
    }

    public final java.lang.Object removeLast() {
        if (isEmpty()) {
            throw new java.util.NoSuchElementException("ArrayDeque is empty.");
        }
        int d = d(a.b20.d0(this) + this.c);
        java.lang.Object[] objArr = this.d;
        java.lang.Object obj = objArr[d];
        objArr[d] = null;
        this.e--;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(java.util.Collection collection) {
        int d;
        a.wv.w(collection, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.d.length != 0) {
            int d2 = d(this.c + this.e);
            int i = this.c;
            if (i < d2) {
                d = i;
                while (i < d2) {
                    java.lang.Object obj = this.d[i];
                    if (collection.contains(obj)) {
                        this.d[d] = obj;
                        d++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                java.lang.Object[] objArr = this.d;
                a.wv.w(objArr, "<this>");
                java.util.Arrays.fill(objArr, d, d2, (java.lang.Object) null);
            } else {
                int length = this.d.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    java.lang.Object[] objArr2 = this.d;
                    java.lang.Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        this.d[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                d = d(i2);
                for (int i3 = 0; i3 < d2; i3++) {
                    java.lang.Object[] objArr3 = this.d;
                    java.lang.Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        this.d[d] = obj3;
                        d = c(d);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                int i4 = d - this.c;
                if (i4 < 0) {
                    i4 += this.d.length;
                }
                this.e = i4;
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object set(int i, java.lang.Object obj) {
        a.fa0.c(i, this.e);
        int d = d(this.c + i);
        java.lang.Object[] objArr = this.d;
        java.lang.Object obj2 = objArr[d];
        objArr[d] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        a.wv.w(objArr, "array");
        int length = objArr.length;
        int i = this.e;
        if (length < i) {
            java.lang.Object newInstance = java.lang.reflect.Array.newInstance(objArr.getClass().getComponentType(), i);
            a.wv.t(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (java.lang.Object[]) newInstance;
        }
        int d = d(this.c + this.e);
        int i2 = this.c;
        if (i2 < d) {
            a.op.L1(this.d, objArr, 0, i2, d);
        } else if (!isEmpty()) {
            java.lang.Object[] objArr2 = this.d;
            a.op.L1(objArr2, objArr, 0, this.c, objArr2.length);
            java.lang.Object[] objArr3 = this.d;
            a.op.L1(objArr3, objArr, objArr3.length - this.c, 0, d);
        }
        int length2 = objArr.length;
        int i3 = this.e;
        if (length2 > i3) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, java.lang.Object obj) {
        int i2;
        a.fa0.e(i, this.e);
        int i3 = this.e;
        if (i == i3) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        b(i3 + 1);
        int d = d(this.c + i);
        int i4 = this.e;
        if (i < ((i4 + 1) >> 1)) {
            if (d == 0) {
                java.lang.Object[] objArr = this.d;
                a.wv.w(objArr, "<this>");
                d = objArr.length;
            }
            int i5 = d - 1;
            int i6 = this.c;
            if (i6 == 0) {
                java.lang.Object[] objArr2 = this.d;
                a.wv.w(objArr2, "<this>");
                i2 = objArr2.length - 1;
            } else {
                i2 = i6 - 1;
            }
            int i7 = this.c;
            if (i5 >= i7) {
                java.lang.Object[] objArr3 = this.d;
                objArr3[i2] = objArr3[i7];
                a.op.L1(objArr3, objArr3, i7, i7 + 1, i5 + 1);
            } else {
                java.lang.Object[] objArr4 = this.d;
                a.op.L1(objArr4, objArr4, i7 - 1, i7, objArr4.length);
                java.lang.Object[] objArr5 = this.d;
                objArr5[objArr5.length - 1] = objArr5[0];
                a.op.L1(objArr5, objArr5, 0, 1, i5 + 1);
            }
            this.d[i5] = obj;
            this.c = i2;
        } else {
            int d2 = d(this.c + i4);
            if (d < d2) {
                java.lang.Object[] objArr6 = this.d;
                a.op.L1(objArr6, objArr6, d + 1, d, d2);
            } else {
                java.lang.Object[] objArr7 = this.d;
                a.op.L1(objArr7, objArr7, 1, 0, d2);
                java.lang.Object[] objArr8 = this.d;
                objArr8[0] = objArr8[objArr8.length - 1];
                a.op.L1(objArr8, objArr8, d + 1, d, objArr8.length - 1);
            }
            this.d[d] = obj;
        }
        this.e++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, java.util.Collection collection) {
        a.wv.w(collection, "elements");
        a.fa0.e(i, this.e);
        if (collection.isEmpty()) {
            return false;
        }
        int i2 = this.e;
        if (i == i2) {
            return addAll(collection);
        }
        b(collection.size() + i2);
        int d = d(this.c + this.e);
        int d2 = d(this.c + i);
        int size = collection.size();
        if (i < ((this.e + 1) >> 1)) {
            int i3 = this.c;
            int i4 = i3 - size;
            if (d2 < i3) {
                java.lang.Object[] objArr = this.d;
                a.op.L1(objArr, objArr, i4, i3, objArr.length);
                if (size >= d2) {
                    java.lang.Object[] objArr2 = this.d;
                    a.op.L1(objArr2, objArr2, objArr2.length - size, 0, d2);
                } else {
                    java.lang.Object[] objArr3 = this.d;
                    a.op.L1(objArr3, objArr3, objArr3.length - size, 0, size);
                    java.lang.Object[] objArr4 = this.d;
                    a.op.L1(objArr4, objArr4, 0, size, d2);
                }
            } else if (i4 >= 0) {
                java.lang.Object[] objArr5 = this.d;
                a.op.L1(objArr5, objArr5, i4, i3, d2);
            } else {
                java.lang.Object[] objArr6 = this.d;
                i4 += objArr6.length;
                int i5 = d2 - i3;
                int length = objArr6.length - i4;
                if (length >= i5) {
                    a.op.L1(objArr6, objArr6, i4, i3, d2);
                } else {
                    a.op.L1(objArr6, objArr6, i4, i3, i3 + length);
                    java.lang.Object[] objArr7 = this.d;
                    a.op.L1(objArr7, objArr7, 0, this.c + length, d2);
                }
            }
            this.c = i4;
            int i6 = d2 - size;
            if (i6 < 0) {
                i6 += this.d.length;
            }
            a(i6, collection);
        } else {
            int i7 = d2 + size;
            if (d2 < d) {
                int i8 = size + d;
                java.lang.Object[] objArr8 = this.d;
                if (i8 <= objArr8.length) {
                    a.op.L1(objArr8, objArr8, i7, d2, d);
                } else if (i7 >= objArr8.length) {
                    a.op.L1(objArr8, objArr8, i7 - objArr8.length, d2, d);
                } else {
                    int length2 = d - (i8 - objArr8.length);
                    a.op.L1(objArr8, objArr8, 0, length2, d);
                    java.lang.Object[] objArr9 = this.d;
                    a.op.L1(objArr9, objArr9, i7, d2, length2);
                }
            } else {
                java.lang.Object[] objArr10 = this.d;
                a.op.L1(objArr10, objArr10, size, 0, d);
                java.lang.Object[] objArr11 = this.d;
                if (i7 >= objArr11.length) {
                    a.op.L1(objArr11, objArr11, i7 - objArr11.length, d2, objArr11.length);
                } else {
                    a.op.L1(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    java.lang.Object[] objArr12 = this.d;
                    a.op.L1(objArr12, objArr12, i7, d2, objArr12.length - size);
                }
            }
            a(d2, collection);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final java.lang.Object[] toArray() {
        return toArray(new java.lang.Object[this.e]);
    }
}
