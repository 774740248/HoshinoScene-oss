package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class r80 {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f486a;
    public final int[] b;
    public final a.e71 c;
    public final int d;
    public final int e;
    public final boolean f;

    public r80(a.e71 e71Var, java.util.ArrayList arrayList, int[] iArr, int[] iArr2) {
        int[] iArr3;
        int[] iArr4;
        a.e71 e71Var2;
        int i;
        a.q80 q80Var;
        int i2;
        this.f486a = iArr;
        this.b = iArr2;
        java.util.Arrays.fill(iArr, 0);
        java.util.Arrays.fill(iArr2, 0);
        this.c = e71Var;
        int size = e71Var.f117a.size();
        this.d = size;
        int size2 = e71Var.b.size();
        this.e = size2;
        this.f = false;
        a.q80 q80Var2 = arrayList.isEmpty() ? null : (a.q80) arrayList.get(0);
        if (q80Var2 == null || q80Var2.f464a != 0 || q80Var2.b != 0) {
            arrayList.add(0, new a.q80(0, 0, 0));
        }
        arrayList.add(new a.q80(size, size2, 0));
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            iArr3 = this.b;
            iArr4 = this.f486a;
            e71Var2 = this.c;
            if (!hasNext) {
                break;
            }
            a.q80 q80Var3 = (a.q80) it.next();
            for (int i3 = 0; i3 < q80Var3.c; i3++) {
                int i4 = q80Var3.f464a + i3;
                int i5 = q80Var3.b + i3;
                int i6 = e71Var2.a(i4, i5) ? 1 : 2;
                iArr4[i4] = (i5 << 4) | i6;
                iArr3[i5] = (i4 << 4) | i6;
            }
        }
        if (this.f) {
            java.util.Iterator it2 = arrayList.iterator();
            int i7 = 0;
            while (it2.hasNext()) {
                a.q80 q80Var4 = (a.q80) it2.next();
                while (true) {
                    i = q80Var4.f464a;
                    if (i7 < i) {
                        if (iArr4[i7] == 0) {
                            int size3 = arrayList.size();
                            int i8 = 0;
                            int i9 = 0;
                            while (true) {
                                if (i8 < size3) {
                                    q80Var = (a.q80) arrayList.get(i8);
                                    while (true) {
                                        i2 = q80Var.b;
                                        if (i9 < i2) {
                                            if (iArr3[i9] == 0 && e71Var2.b(i7, i9)) {
                                                int i10 = e71Var2.a(i7, i9) ? 8 : 4;
                                                iArr4[i7] = (i9 << 4) | i10;
                                                iArr3[i9] = i10 | (i7 << 4);
                                            } else {
                                                i9++;
                                            }
                                        }
                                    }
                                }
                                i9 = q80Var.c + i2;
                                i8++;
                            }
                        }
                        i7++;
                    }
                }
                i7 = q80Var4.c + i;
            }
        }
    }

    public static a.s80 a(java.util.ArrayDeque arrayDeque, int i, boolean z) {
        a.s80 s80Var;
        java.util.Iterator it = arrayDeque.iterator();
        while (true) {
            if (!it.hasNext()) {
                s80Var = null;
                break;
            }
            s80Var = (a.s80) it.next();
            if (s80Var.f520a == i && s80Var.c == z) {
                it.remove();
                break;
            }
        }
        while (it.hasNext()) {
            a.s80 s80Var2 = (a.s80) it.next();
            if (z) {
                s80Var2.b--;
            } else {
                s80Var2.b++;
            }
        }
        return s80Var;
    }
}
