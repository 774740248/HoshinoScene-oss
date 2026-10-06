package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class z11 {

    /* renamed from: a, reason: collision with root package name */
    public android.view.ViewParent f723a;
    public android.view.ViewParent b;
    public final android.view.View c;
    public boolean d;
    public int[] e;

    public z11(android.view.View view) {
        this.c = view;
    }

    public final boolean a(float f, float f2, boolean z) {
        android.view.ViewParent f3;
        if (!this.d || (f3 = f(0)) == null) {
            return false;
        }
        try {
            return a.or1.a(f3, this.c, f, f2, z);
        } catch (java.lang.AbstractMethodError e) {
            android.util.Log.e("ViewParentCompat", "ViewParent " + f3 + " does not implement interface method onNestedFling", e);
            return false;
        }
    }

    public final boolean b(float f, float f2) {
        android.view.ViewParent f3;
        if (!this.d || (f3 = f(0)) == null) {
            return false;
        }
        try {
            return a.or1.b(f3, this.c, f, f2);
        } catch (java.lang.AbstractMethodError e) {
            android.util.Log.e("ViewParentCompat", "ViewParent " + f3 + " does not implement interface method onNestedPreFling", e);
            return false;
        }
    }

    public final boolean c(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        android.view.ViewParent f;
        int i4;
        int i5;
        int[] iArr3;
        if (!this.d || (f = f(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        android.view.View view = this.c;
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            if (this.e == null) {
                this.e = new int[2];
            }
            iArr3 = this.e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        android.view.View view2 = this.c;
        if (f instanceof a.a21) {
            ((a.a21) f).c(view2, i, i2, iArr3, i3);
        } else if (i3 == 0) {
            try {
                a.or1.c(f, view2, i, i2, iArr3);
            } catch (java.lang.AbstractMethodError e) {
                android.util.Log.e("ViewParentCompat", "ViewParent " + f + " does not implement interface method onNestedPreScroll", e);
            }
        }
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public final void d(int i, int i2, int i3, int[] iArr) {
        e(0, i, 0, i2, null, i3, iArr);
    }

    public final boolean e(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        android.view.ViewParent f;
        int i6;
        int i7;
        int[] iArr3;
        if (!this.d || (f = f(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        android.view.View view = this.c;
        if (iArr != null) {
            view.getLocationInWindow(iArr);
            i6 = iArr[0];
            i7 = iArr[1];
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (iArr2 == null) {
            if (this.e == null) {
                this.e = new int[2];
            }
            int[] iArr4 = this.e;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        android.view.View view2 = this.c;
        if (f instanceof a.b21) {
            ((a.b21) f).d(view2, i, i2, i3, i4, i5, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i3;
            iArr3[1] = iArr3[1] + i4;
            if (f instanceof a.a21) {
                ((a.a21) f).e(view2, i, i2, i3, i4, i5);
            } else if (i5 == 0) {
                try {
                    a.or1.d(f, view2, i, i2, i3, i4);
                } catch (java.lang.AbstractMethodError e) {
                    android.util.Log.e("ViewParentCompat", "ViewParent " + f + " does not implement interface method onNestedScroll", e);
                }
            }
        }
        if (iArr != null) {
            view.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i6;
            iArr[1] = iArr[1] - i7;
        }
        return true;
    }

    public final android.view.ViewParent f(int i) {
        if (i == 0) {
            return this.f723a;
        }
        if (i != 1) {
            return null;
        }
        return this.b;
    }

    public final boolean g(int i) {
        return f(i) != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0077 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(int r9, int r10) {
        /*
            r8 = this;
            boolean r0 = r8.g(r10)
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = r8.d
            if (r0 == 0) goto L7c
            android.view.View r0 = r8.c
            android.view.ViewParent r2 = r0.getParent()
            r3 = r0
        L13:
            if (r2 == 0) goto L7c
            boolean r4 = r2 instanceof a.a21
            java.lang.String r5 = "ViewParentCompat"
            java.lang.String r6 = "ViewParent "
            if (r4 == 0) goto L25
            r7 = r2
            a.a21 r7 = (a.a21) r7
            boolean r7 = r7.f(r3, r0, r9, r10)
            goto L2b
        L25:
            if (r10 != 0) goto L70
            boolean r7 = a.or1.f(r2, r3, r0, r9)     // Catch: java.lang.AbstractMethodError -> L5b
        L2b:
            if (r7 == 0) goto L70
            if (r10 == 0) goto L35
            if (r10 == r1) goto L32
            goto L37
        L32:
            r8.b = r2
            goto L37
        L35:
            r8.f723a = r2
        L37:
            if (r4 == 0) goto L3f
            a.a21 r2 = (a.a21) r2
            r2.a(r3, r0, r9, r10)
            goto L5a
        L3f:
            if (r10 != 0) goto L5a
            a.or1.e(r2, r3, r0, r9)     // Catch: java.lang.AbstractMethodError -> L45
            goto L5a
        L45:
            r9 = move-exception
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r6)
            r10.append(r2)
            java.lang.String r0 = " does not implement interface method onNestedScrollAccepted"
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            android.util.Log.e(r5, r10, r9)
        L5a:
            return r1
        L5b:
            r4 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r6)
            r7.append(r2)
            java.lang.String r6 = " does not implement interface method onStartNestedScroll"
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            android.util.Log.e(r5, r6, r4)
        L70:
            boolean r4 = r2 instanceof android.view.View
            if (r4 == 0) goto L77
            r3 = r2
            android.view.View r3 = (android.view.View) r3
        L77:
            android.view.ViewParent r2 = r2.getParent()
            goto L13
        L7c:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a.z11.h(int, int):boolean");
    }

    public final void i(int i) {
        android.view.ViewParent f = f(i);
        if (f != null) {
            boolean z = f instanceof a.a21;
            android.view.View view = this.c;
            if (z) {
                ((a.a21) f).b(view, i);
            } else if (i == 0) {
                try {
                    a.or1.g(f, view);
                } catch (java.lang.AbstractMethodError e) {
                    android.util.Log.e("ViewParentCompat", "ViewParent " + f + " does not implement interface method onStopNestedScroll", e);
                }
            }
            if (i == 0) {
                this.f723a = null;
            } else {
                if (i != 1) {
                    return;
                }
                this.b = null;
            }
        }
    }
}
