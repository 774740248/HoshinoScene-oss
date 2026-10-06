package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class i extends java.util.AbstractList implements java.util.List, a.eu0 {
    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object remove(int i) {
        a.hp hpVar = (a.hp) this;
        a.fa0.c(i, hpVar.e);
        if (i == a.b20.d0(hpVar)) {
            return hpVar.removeLast();
        }
        if (i == 0) {
            return hpVar.removeFirst();
        }
        int d = hpVar.d(hpVar.c + i);
        java.lang.Object[] objArr = hpVar.d;
        java.lang.Object obj = objArr[d];
        if (i < (hpVar.e >> 1)) {
            int i2 = hpVar.c;
            if (d >= i2) {
                a.op.L1(objArr, objArr, i2 + 1, i2, d);
            } else {
                a.op.L1(objArr, objArr, 1, 0, d);
                java.lang.Object[] objArr2 = hpVar.d;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i3 = hpVar.c;
                a.op.L1(objArr2, objArr2, i3 + 1, i3, objArr2.length - 1);
            }
            java.lang.Object[] objArr3 = hpVar.d;
            int i4 = hpVar.c;
            objArr3[i4] = null;
            hpVar.c = hpVar.c(i4);
        } else {
            int d2 = hpVar.d(a.b20.d0(hpVar) + hpVar.c);
            if (d <= d2) {
                java.lang.Object[] objArr4 = hpVar.d;
                a.op.L1(objArr4, objArr4, d, d + 1, d2 + 1);
            } else {
                java.lang.Object[] objArr5 = hpVar.d;
                a.op.L1(objArr5, objArr5, d, d + 1, objArr5.length);
                java.lang.Object[] objArr6 = hpVar.d;
                objArr6[objArr6.length - 1] = objArr6[0];
                a.op.L1(objArr6, objArr6, 0, 1, d2 + 1);
            }
            hpVar.d[d2] = null;
        }
        hpVar.e--;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return ((a.hp) this).e;
    }
}
