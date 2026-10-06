package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class we0 {

    /* renamed from: a, reason: collision with root package name */
    public final a.se0 f660a;
    public boolean[] b;
    public int[] c;
    public long[] d;
    public long[] e;

    public we0(a.se0 se0Var) {
        this.f660a = se0Var;
    }

    public static java.util.ArrayList e(java.util.List list, int i, int i2) {
        int i3 = (i - i2) / 2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        a.ue0 ue0Var = new a.ue0();
        ue0Var.g = i3;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (i4 == 0) {
                arrayList.add(ue0Var);
            }
            arrayList.add((a.ue0) list.get(i4));
            if (i4 == list.size() - 1) {
                arrayList.add(ue0Var);
            }
        }
        return arrayList;
    }

    public static int[] r(int i, java.util.ArrayList arrayList, android.util.SparseIntArray sparseIntArray) {
        java.util.Collections.sort(arrayList);
        sparseIntArray.clear();
        int[] iArr = new int[i];
        java.util.Iterator it = arrayList.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            a.ve0 ve0Var = (a.ve0) it.next();
            int i3 = ve0Var.c;
            iArr[i2] = i3;
            sparseIntArray.append(i3, ve0Var.d);
            i2++;
        }
        return iArr;
    }

    public final void a(java.util.List list, a.ue0 ue0Var, int i, int i2) {
        ue0Var.m = i2;
        this.f660a.c(ue0Var);
        ue0Var.p = i;
        list.add(ue0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:165:0x020d, code lost:
    
        if (r8 < (r15 + r22)) goto L101;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03a8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x031a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(a.tk r29, int r30, int r31, int r32, int r33, int r34, java.util.List r35) {
        /*
            Method dump skipped, instructions count: 967
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.we0.b(a.tk, int, int, int, int, int, java.util.List):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(android.view.View r7, int r8) {
        /*
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            a.te0 r0 = (a.te0) r0
            int r1 = r7.getMeasuredWidth()
            int r2 = r7.getMeasuredHeight()
            int r3 = r0.c()
            r4 = 1
            if (r1 >= r3) goto L1b
            int r1 = r0.c()
        L19:
            r3 = r4
            goto L27
        L1b:
            int r3 = r0.p()
            if (r1 <= r3) goto L26
            int r1 = r0.p()
            goto L19
        L26:
            r3 = 0
        L27:
            int r5 = r0.b()
            if (r2 >= r5) goto L32
            int r2 = r0.b()
            goto L3e
        L32:
            int r5 = r0.i()
            if (r2 <= r5) goto L3d
            int r2 = r0.i()
            goto L3e
        L3d:
            r4 = r3
        L3e:
            if (r4 == 0) goto L55
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r7.measure(r1, r0)
            r6.v(r7, r8, r1, r0)
            a.se0 r0 = r6.f660a
            r0.h(r7, r8)
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.we0.c(android.view.View, int):void");
    }

    public final void d(java.util.List list, int i) {
        int i2 = this.c[i];
        if (i2 == -1) {
            i2 = 0;
        }
        if (list.size() > i2) {
            list.subList(i2, list.size()).clear();
        }
        int[] iArr = this.c;
        int length = iArr.length - 1;
        if (i > length) {
            java.util.Arrays.fill(iArr, -1);
        } else {
            java.util.Arrays.fill(iArr, i, length, -1);
        }
        long[] jArr = this.d;
        int length2 = jArr.length - 1;
        if (i > length2) {
            java.util.Arrays.fill(jArr, 0L);
        } else {
            java.util.Arrays.fill(jArr, i, length2, 0L);
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [a.ve0, java.lang.Object] */
    public final java.util.ArrayList f(int i) {
        java.util.ArrayList arrayList = new java.util.ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            a.te0 te0Var = (a.te0) this.f660a.a(i2).getLayoutParams();
            a.ve0 obj = new a.ve0();
            obj.d = te0Var.getOrder();
            obj.c = i2;
            arrayList.add(obj);
        }
        return arrayList;
    }

    public final void g(int i, int i2, int i3) {
        int mode;
        int size;
        a.se0 se0Var = this.f660a;
        int flexDirection = se0Var.getFlexDirection();
        if (flexDirection == 0 || flexDirection == 1) {
            mode = android.view.View.MeasureSpec.getMode(i2);
            size = android.view.View.MeasureSpec.getSize(i2);
        } else {
            if (flexDirection != 2 && flexDirection != 3) {
                throw new java.lang.IllegalArgumentException(a.ii1.d("Invalid flex direction: ", flexDirection));
            }
            mode = android.view.View.MeasureSpec.getMode(i);
            size = android.view.View.MeasureSpec.getSize(i);
        }
        java.util.List<a.ue0> flexLinesInternal = se0Var.getFlexLinesInternal();
        if (mode == 1073741824) {
            int sumOfCrossSize = se0Var.getSumOfCrossSize() + i3;
            int i4 = 0;
            if (flexLinesInternal.size() == 1) {
                ((a.ue0) flexLinesInternal.get(0)).g = size - i3;
                return;
            }
            if (flexLinesInternal.size() >= 2) {
                int alignContent = se0Var.getAlignContent();
                if (alignContent == 1) {
                    a.ue0 ue0Var = new a.ue0();
                    ue0Var.g = size - sumOfCrossSize;
                    flexLinesInternal.add(0, ue0Var);
                    return;
                }
                if (alignContent == 2) {
                    se0Var.setFlexLines(e(flexLinesInternal, size, sumOfCrossSize));
                    return;
                }
                if (alignContent == 3) {
                    if (sumOfCrossSize >= size) {
                        return;
                    }
                    float size2 = (size - sumOfCrossSize) / (flexLinesInternal.size() - 1);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    int size3 = flexLinesInternal.size();
                    float f = 0.0f;
                    while (i4 < size3) {
                        arrayList.add((a.ue0) flexLinesInternal.get(i4));
                        if (i4 != flexLinesInternal.size() - 1) {
                            a.ue0 ue0Var2 = new a.ue0();
                            if (i4 == flexLinesInternal.size() - 2) {
                                ue0Var2.g = java.lang.Math.round(f + size2);
                                f = 0.0f;
                            } else {
                                ue0Var2.g = java.lang.Math.round(size2);
                            }
                            int i5 = ue0Var2.g;
                            float f2 = (size2 - i5) + f;
                            if (f2 > 1.0f) {
                                ue0Var2.g = i5 + 1;
                                f2 -= 1.0f;
                            } else if (f2 < -1.0f) {
                                ue0Var2.g = i5 - 1;
                                f2 += 1.0f;
                            }
                            f = f2;
                            arrayList.add(ue0Var2);
                        }
                        i4++;
                    }
                    se0Var.setFlexLines(arrayList);
                    return;
                }
                if (alignContent == 4) {
                    if (sumOfCrossSize >= size) {
                        se0Var.setFlexLines(e(flexLinesInternal, size, sumOfCrossSize));
                        return;
                    }
                    int size4 = (size - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    a.ue0 ue0Var3 = new a.ue0();
                    ue0Var3.g = size4;
                    for (a.ue0 ue0Var4 : flexLinesInternal) {
                        arrayList2.add(ue0Var3);
                        arrayList2.add(ue0Var4);
                        arrayList2.add(ue0Var3);
                    }
                    se0Var.setFlexLines(arrayList2);
                    return;
                }
                if (alignContent == 5 && sumOfCrossSize < size) {
                    float size5 = (size - sumOfCrossSize) / flexLinesInternal.size();
                    int size6 = flexLinesInternal.size();
                    float f3 = 0.0f;
                    while (i4 < size6) {
                        a.ue0 ue0Var5 = (a.ue0) flexLinesInternal.get(i4);
                        float f4 = ue0Var5.g + size5;
                        if (i4 == flexLinesInternal.size() - 1) {
                            f4 += f3;
                            f3 = 0.0f;
                        }
                        int round = java.lang.Math.round(f4);
                        float f5 = (f4 - round) + f3;
                        if (f5 > 1.0f) {
                            round++;
                            f5 -= 1.0f;
                        } else if (f5 < -1.0f) {
                            round--;
                            f5 += 1.0f;
                        }
                        f3 = f5;
                        ue0Var5.g = round;
                        i4++;
                    }
                }
            }
        }
    }

    public final void h(int i, int i2, int i3) {
        int size;
        int paddingLeft;
        int paddingRight;
        a.se0 se0Var = this.f660a;
        int flexItemCount = se0Var.getFlexItemCount();
        boolean[] zArr = this.b;
        if (zArr == null) {
            this.b = new boolean[java.lang.Math.max(flexItemCount, 10)];
        } else if (zArr.length < flexItemCount) {
            this.b = new boolean[java.lang.Math.max(zArr.length * 2, flexItemCount)];
        } else {
            java.util.Arrays.fill(zArr, false);
        }
        if (i3 >= se0Var.getFlexItemCount()) {
            return;
        }
        int flexDirection = se0Var.getFlexDirection();
        int flexDirection2 = se0Var.getFlexDirection();
        if (flexDirection2 == 0 || flexDirection2 == 1) {
            int mode = android.view.View.MeasureSpec.getMode(i);
            size = android.view.View.MeasureSpec.getSize(i);
            int largestMainSize = se0Var.getLargestMainSize();
            if (mode != 1073741824) {
                size = java.lang.Math.min(largestMainSize, size);
            }
            paddingLeft = se0Var.getPaddingLeft();
            paddingRight = se0Var.getPaddingRight();
        } else {
            if (flexDirection2 != 2 && flexDirection2 != 3) {
                throw new java.lang.IllegalArgumentException(a.ii1.d("Invalid flex direction: ", flexDirection));
            }
            int mode2 = android.view.View.MeasureSpec.getMode(i2);
            size = android.view.View.MeasureSpec.getSize(i2);
            if (mode2 != 1073741824) {
                size = se0Var.getLargestMainSize();
            }
            paddingLeft = se0Var.getPaddingTop();
            paddingRight = se0Var.getPaddingBottom();
        }
        int i4 = paddingRight + paddingLeft;
        int[] iArr = this.c;
        java.util.List flexLinesInternal = se0Var.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        for (int i5 = iArr != null ? iArr[i3] : 0; i5 < size2; i5++) {
            a.ue0 ue0Var = (a.ue0) flexLinesInternal.get(i5);
            int i6 = ue0Var.e;
            if (i6 < size && ue0Var.q) {
                l(i, i2, ue0Var, size, i4, false);
            } else if (i6 > size && ue0Var.r) {
                q(i, i2, ue0Var, size, i4, false);
            }
        }
    }

    public final void i(int i) {
        int[] iArr = this.c;
        if (iArr == null) {
            this.c = new int[java.lang.Math.max(i, 10)];
        } else if (iArr.length < i) {
            this.c = java.util.Arrays.copyOf(this.c, java.lang.Math.max(iArr.length * 2, i));
        }
    }

    public final void j(int i) {
        long[] jArr = this.d;
        if (jArr == null) {
            this.d = new long[java.lang.Math.max(i, 10)];
        } else if (jArr.length < i) {
            this.d = java.util.Arrays.copyOf(this.d, java.lang.Math.max(jArr.length * 2, i));
        }
    }

    public final void k(int i) {
        long[] jArr = this.e;
        if (jArr == null) {
            this.e = new long[java.lang.Math.max(i, 10)];
        } else if (jArr.length < i) {
            this.e = java.util.Arrays.copyOf(this.e, java.lang.Math.max(jArr.length * 2, i));
        }
    }

    public final void l(int i, int i2, a.ue0 ue0Var, int i3, int i4, boolean z) {
        int i5;
        int i6;
        a.se0 se0Var;
        android.view.View view;
        android.view.View view2;
        int i7;
        a.te0 te0Var;
        double d;
        double d2;
        float f = ue0Var.j;
        if (f <= 0.0f || i3 < (i5 = ue0Var.e)) {
            return;
        }
        float f2 = (i3 - i5) / f;
        ue0Var.e = i4 + ue0Var.f;
        if (!z) {
            ue0Var.g = Integer.MIN_VALUE;
        }
        int i8 = 0;
        boolean z2 = false;
        int i9 = 0;
        float f3 = 0.0f;
        while (i8 < ue0Var.h) {
            int i10 = ue0Var.o + i8;
            a.se0 se0Var2 = this.f660a;
            android.view.View g = se0Var2.g(i10);
            if (g == null || g.getVisibility() == 8) {
                i6 = i5;
            } else {
                a.te0 te0Var2 = (a.te0) g.getLayoutParams();
                int flexDirection = se0Var2.getFlexDirection();
                if (flexDirection == 0 || flexDirection == 1) {
                    i6 = i5;
                    int measuredWidth = g.getMeasuredWidth();
                    long[] jArr = this.e;
                    if (jArr != null) {
                        measuredWidth = (int) jArr[i10];
                    }
                    int measuredHeight = g.getMeasuredHeight();
                    long[] jArr2 = this.e;
                    if (jArr2 != null) {
                        long j = jArr2[i10];
                        se0Var = se0Var2;
                        view = g;
                        measuredHeight = (int) (j >> 32);
                    } else {
                        se0Var = se0Var2;
                        view = g;
                    }
                    if (this.b[i10] || te0Var2.f() <= 0.0f) {
                        view2 = view;
                    } else {
                        float f4 = (te0Var2.f() * f2) + measuredWidth;
                        if (i8 == ue0Var.h - 1) {
                            f4 += f3;
                            f3 = 0.0f;
                        }
                        int round = java.lang.Math.round(f4);
                        if (round > te0Var2.p()) {
                            round = te0Var2.p();
                            this.b[i10] = true;
                            ue0Var.j -= te0Var2.f();
                            te0Var = te0Var2;
                            z2 = true;
                        } else {
                            float f5 = (f4 - round) + f3;
                            te0Var = te0Var2;
                            double d3 = f5;
                            if (d3 > 1.0d) {
                                round++;
                                d = d3 - 1.0d;
                            } else {
                                if (d3 < -1.0d) {
                                    round--;
                                    d = d3 + 1.0d;
                                }
                                f3 = f5;
                            }
                            f5 = (float) d;
                            f3 = f5;
                        }
                        te0Var2 = te0Var;
                        int m = m(i2, te0Var2, ue0Var.m);
                        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                        view2 = view;
                        view2.measure(makeMeasureSpec, m);
                        int measuredWidth2 = view2.getMeasuredWidth();
                        int measuredHeight2 = view2.getMeasuredHeight();
                        v(view2, i10, makeMeasureSpec, m);
                        se0Var.h(view2, i10);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int max = java.lang.Math.max(i9, se0Var.k(view2) + te0Var2.k() + te0Var2.q() + measuredHeight);
                    ue0Var.e = te0Var2.a() + te0Var2.m() + measuredWidth + ue0Var.e;
                    i7 = max;
                } else {
                    int measuredHeight3 = g.getMeasuredHeight();
                    long[] jArr3 = this.e;
                    if (jArr3 != null) {
                        i6 = i5;
                        measuredHeight3 = (int) (jArr3[i10] >> 32);
                    } else {
                        i6 = i5;
                    }
                    int measuredWidth3 = g.getMeasuredWidth();
                    long[] jArr4 = this.e;
                    if (jArr4 != null) {
                        measuredWidth3 = (int) jArr4[i10];
                    }
                    if (!this.b[i10] && te0Var2.f() > 0.0f) {
                        float f6 = (te0Var2.f() * f2) + measuredHeight3;
                        if (i8 == ue0Var.h - 1) {
                            f6 += f3;
                            f3 = 0.0f;
                        }
                        int round2 = java.lang.Math.round(f6);
                        if (round2 > te0Var2.i()) {
                            round2 = te0Var2.i();
                            this.b[i10] = true;
                            ue0Var.j -= te0Var2.f();
                            z2 = true;
                        } else {
                            float f7 = (f6 - round2) + f3;
                            double d4 = f7;
                            if (d4 > 1.0d) {
                                round2++;
                                d2 = d4 - 1.0d;
                            } else {
                                if (d4 < -1.0d) {
                                    round2--;
                                    d2 = d4 + 1.0d;
                                }
                                f3 = f7;
                            }
                            f7 = (float) d2;
                            f3 = f7;
                        }
                        int n = n(i, te0Var2, ue0Var.m);
                        int makeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                        g.measure(n, makeMeasureSpec2);
                        int measuredWidth4 = g.getMeasuredWidth();
                        int measuredHeight4 = g.getMeasuredHeight();
                        v(g, i10, n, makeMeasureSpec2);
                        se0Var2.h(g, i10);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    i7 = java.lang.Math.max(i9, se0Var2.k(g) + te0Var2.a() + te0Var2.m() + measuredWidth3);
                    ue0Var.e = te0Var2.k() + te0Var2.q() + measuredHeight3 + ue0Var.e;
                }
                ue0Var.g = java.lang.Math.max(ue0Var.g, i7);
                i9 = i7;
            }
            i8++;
            i5 = i6;
        }
        int i11 = i5;
        if (!z2 || i11 == ue0Var.e) {
            return;
        }
        l(i, i2, ue0Var, i3, i4, true);
    }

    public final int m(int i, a.te0 te0Var, int i2) {
        a.se0 se0Var = this.f660a;
        int e = se0Var.e(i, te0Var.k() + te0Var.q() + se0Var.getPaddingBottom() + se0Var.getPaddingTop() + i2, te0Var.h());
        int size = android.view.View.MeasureSpec.getSize(e);
        return size > te0Var.i() ? android.view.View.MeasureSpec.makeMeasureSpec(te0Var.i(), android.view.View.MeasureSpec.getMode(e)) : size < te0Var.b() ? android.view.View.MeasureSpec.makeMeasureSpec(te0Var.b(), android.view.View.MeasureSpec.getMode(e)) : e;
    }

    public final int n(int i, a.te0 te0Var, int i2) {
        a.se0 se0Var = this.f660a;
        int i3 = se0Var.i(i, te0Var.a() + te0Var.m() + se0Var.getPaddingRight() + se0Var.getPaddingLeft() + i2, te0Var.g());
        int size = android.view.View.MeasureSpec.getSize(i3);
        return size > te0Var.p() ? android.view.View.MeasureSpec.makeMeasureSpec(te0Var.p(), android.view.View.MeasureSpec.getMode(i3)) : size < te0Var.c() ? android.view.View.MeasureSpec.makeMeasureSpec(te0Var.c(), android.view.View.MeasureSpec.getMode(i3)) : i3;
    }

    public final void o(android.view.View view, a.ue0 ue0Var, int i, int i2, int i3, int i4) {
        a.te0 te0Var = (a.te0) view.getLayoutParams();
        a.se0 se0Var = this.f660a;
        int alignItems = se0Var.getAlignItems();
        if (te0Var.n() != -1) {
            alignItems = te0Var.n();
        }
        int i5 = ue0Var.g;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (se0Var.getFlexWrap() != 2) {
                    int i6 = i2 + i5;
                    view.layout(i, (i6 - view.getMeasuredHeight()) - te0Var.k(), i3, i6 - te0Var.k());
                    return;
                }
                view.layout(i, te0Var.q() + view.getMeasuredHeight() + (i2 - i5), i3, te0Var.q() + view.getMeasuredHeight() + (i4 - i5));
                return;
            }
            if (alignItems == 2) {
                int q = ((te0Var.q() + (i5 - view.getMeasuredHeight())) - te0Var.k()) / 2;
                if (se0Var.getFlexWrap() != 2) {
                    int i7 = i2 + q;
                    view.layout(i, i7, i3, view.getMeasuredHeight() + i7);
                    return;
                } else {
                    int i8 = i2 - q;
                    view.layout(i, i8, i3, view.getMeasuredHeight() + i8);
                    return;
                }
            }
            if (alignItems == 3) {
                if (se0Var.getFlexWrap() != 2) {
                    int max = java.lang.Math.max(ue0Var.l - view.getBaseline(), te0Var.q());
                    view.layout(i, i2 + max, i3, i4 + max);
                    return;
                } else {
                    int max2 = java.lang.Math.max(view.getBaseline() + (ue0Var.l - view.getMeasuredHeight()), te0Var.k());
                    view.layout(i, i2 - max2, i3, i4 - max2);
                    return;
                }
            }
            if (alignItems != 4) {
                return;
            }
        }
        if (se0Var.getFlexWrap() != 2) {
            view.layout(i, te0Var.q() + i2, i3, te0Var.q() + i4);
        } else {
            view.layout(i, i2 - te0Var.k(), i3, i4 - te0Var.k());
        }
    }

    public final void p(android.view.View view, a.ue0 ue0Var, boolean z, int i, int i2, int i3, int i4) {
        a.te0 te0Var = (a.te0) view.getLayoutParams();
        int alignItems = this.f660a.getAlignItems();
        if (te0Var.n() != -1) {
            alignItems = te0Var.n();
        }
        int i5 = ue0Var.g;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (!z) {
                    view.layout(((i + i5) - view.getMeasuredWidth()) - te0Var.a(), i2, ((i3 + i5) - view.getMeasuredWidth()) - te0Var.a(), i4);
                    return;
                }
                view.layout(te0Var.m() + view.getMeasuredWidth() + (i - i5), i2, te0Var.m() + view.getMeasuredWidth() + (i3 - i5), i4);
                return;
            }
            if (alignItems == 2) {
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int c = ((a.gy0.c(marginLayoutParams) + (i5 - view.getMeasuredWidth())) - a.gy0.b(marginLayoutParams)) / 2;
                if (z) {
                    view.layout(i - c, i2, i3 - c, i4);
                    return;
                } else {
                    view.layout(i + c, i2, i3 + c, i4);
                    return;
                }
            }
            if (alignItems != 3 && alignItems != 4) {
                return;
            }
        }
        if (z) {
            view.layout(i - te0Var.a(), i2, i3 - te0Var.a(), i4);
        } else {
            view.layout(te0Var.m() + i, i2, te0Var.m() + i3, i4);
        }
    }

    public final void q(int i, int i2, a.ue0 ue0Var, int i3, int i4, boolean z) {
        int i5;
        int i6;
        int i7;
        int i8;
        float f;
        int i9;
        float f2;
        float f3;
        int i10 = ue0Var.e;
        float f4 = ue0Var.k;
        if (f4 <= 0.0f || i3 > i10) {
            return;
        }
        float f5 = (i10 - i3) / f4;
        ue0Var.e = i4 + ue0Var.f;
        if (!z) {
            ue0Var.g = Integer.MIN_VALUE;
        }
        int i11 = 0;
        boolean z2 = false;
        int i12 = 0;
        float f6 = 0.0f;
        while (i11 < ue0Var.h) {
            int i13 = ue0Var.o + i11;
            a.se0 se0Var = this.f660a;
            android.view.View g = se0Var.g(i13);
            if (g == null || g.getVisibility() == 8) {
                i5 = i10;
                i6 = i11;
                i7 = i12;
                f6 = f6;
            } else {
                a.te0 te0Var = (a.te0) g.getLayoutParams();
                int flexDirection = se0Var.getFlexDirection();
                if (flexDirection == 0 || flexDirection == 1) {
                    i6 = i11;
                    int i14 = i12;
                    float f7 = f6;
                    int i15 = i10;
                    int measuredWidth = g.getMeasuredWidth();
                    long[] jArr = this.e;
                    if (jArr != null) {
                        measuredWidth = (int) jArr[i13];
                    }
                    int measuredHeight = g.getMeasuredHeight();
                    long[] jArr2 = this.e;
                    if (jArr2 != null) {
                        i5 = i15;
                        measuredHeight = (int) (jArr2[i13] >> 32);
                    } else {
                        i5 = i15;
                    }
                    if (this.b[i13] || te0Var.o() <= 0.0f) {
                        f6 = f7;
                    } else {
                        float o = measuredWidth - (te0Var.o() * f5);
                        if (i6 == ue0Var.h - 1) {
                            o += f7;
                            f7 = 0.0f;
                        }
                        int round = java.lang.Math.round(o);
                        if (round < te0Var.c()) {
                            round = te0Var.c();
                            this.b[i13] = true;
                            ue0Var.k -= te0Var.o();
                            z2 = true;
                            f6 = f7;
                        } else {
                            float f8 = (o - round) + f7;
                            double d = f8;
                            if (d > 1.0d) {
                                round++;
                                f8 -= 1.0f;
                            } else if (d < -1.0d) {
                                round--;
                                f8 += 1.0f;
                            }
                            f6 = f8;
                        }
                        int m = m(i2, te0Var, ue0Var.m);
                        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                        g.measure(makeMeasureSpec, m);
                        int measuredWidth2 = g.getMeasuredWidth();
                        int measuredHeight2 = g.getMeasuredHeight();
                        v(g, i13, makeMeasureSpec, m);
                        se0Var.h(g, i13);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int max = java.lang.Math.max(i14, se0Var.k(g) + te0Var.k() + te0Var.q() + measuredHeight);
                    ue0Var.e = te0Var.a() + te0Var.m() + measuredWidth + ue0Var.e;
                    i7 = max;
                } else {
                    int measuredHeight3 = g.getMeasuredHeight();
                    long[] jArr3 = this.e;
                    if (jArr3 != null) {
                        long j = jArr3[i13];
                        i8 = i12;
                        f = f6;
                        measuredHeight3 = (int) (j >> 32);
                    } else {
                        i8 = i12;
                        f = f6;
                    }
                    int measuredWidth3 = g.getMeasuredWidth();
                    long[] jArr4 = this.e;
                    if (jArr4 != null) {
                        measuredWidth3 = (int) jArr4[i13];
                    }
                    if (this.b[i13] || te0Var.o() <= 0.0f) {
                        i9 = i10;
                        i6 = i11;
                    } else {
                        float o2 = measuredHeight3 - (te0Var.o() * f5);
                        if (i11 == ue0Var.h - 1) {
                            o2 += f;
                            f2 = 0.0f;
                        } else {
                            f2 = f;
                        }
                        int round2 = java.lang.Math.round(o2);
                        if (round2 < te0Var.b()) {
                            round2 = te0Var.b();
                            this.b[i13] = true;
                            ue0Var.k -= te0Var.o();
                            i6 = i11;
                            f3 = f2;
                            z2 = true;
                            i9 = i10;
                        } else {
                            f3 = (o2 - round2) + f2;
                            i9 = i10;
                            i6 = i11;
                            double d2 = f3;
                            if (d2 > 1.0d) {
                                round2++;
                                f3 -= 1.0f;
                            } else if (d2 < -1.0d) {
                                round2--;
                                f3 += 1.0f;
                            }
                        }
                        int n = n(i, te0Var, ue0Var.m);
                        int makeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                        g.measure(n, makeMeasureSpec2);
                        int measuredWidth4 = g.getMeasuredWidth();
                        int measuredHeight4 = g.getMeasuredHeight();
                        v(g, i13, n, makeMeasureSpec2);
                        se0Var.h(g, i13);
                        f = f3;
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    i7 = java.lang.Math.max(i8, se0Var.k(g) + te0Var.a() + te0Var.m() + measuredWidth3);
                    ue0Var.e = te0Var.k() + te0Var.q() + measuredHeight3 + ue0Var.e;
                    i5 = i9;
                    f6 = f;
                }
                ue0Var.g = java.lang.Math.max(ue0Var.g, i7);
            }
            i11 = i6 + 1;
            i12 = i7;
            i10 = i5;
        }
        int i16 = i10;
        if (!z2 || i16 == ue0Var.e) {
            return;
        }
        q(i, i2, ue0Var, i3, i4, true);
    }

    public final void s(android.view.View view, int i, int i2) {
        a.te0 te0Var = (a.te0) view.getLayoutParams();
        int m = (i - te0Var.m()) - te0Var.a();
        a.se0 se0Var = this.f660a;
        int min = java.lang.Math.min(java.lang.Math.max(m - se0Var.k(view), te0Var.c()), te0Var.p());
        long[] jArr = this.e;
        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) (jArr[i2] >> 32) : view.getMeasuredHeight(), 1073741824);
        int makeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec2, makeMeasureSpec);
        v(view, i2, makeMeasureSpec2, makeMeasureSpec);
        se0Var.h(view, i2);
    }

    public final void t(android.view.View view, int i, int i2) {
        a.te0 te0Var = (a.te0) view.getLayoutParams();
        int q = (i - te0Var.q()) - te0Var.k();
        a.se0 se0Var = this.f660a;
        int min = java.lang.Math.min(java.lang.Math.max(q - se0Var.k(view), te0Var.b()), te0Var.i());
        long[] jArr = this.e;
        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) jArr[i2] : view.getMeasuredWidth(), 1073741824);
        int makeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec, makeMeasureSpec2);
        v(view, i2, makeMeasureSpec, makeMeasureSpec2);
        se0Var.h(view, i2);
    }

    public final void u(int i) {
        android.view.View g;
        a.se0 se0Var = this.f660a;
        if (i >= se0Var.getFlexItemCount()) {
            return;
        }
        int flexDirection = se0Var.getFlexDirection();
        if (se0Var.getAlignItems() != 4) {
            for (a.ue0 ue0Var : (Iterable<a.ue0>) se0Var.getFlexLinesInternal()) {
                java.util.Iterator it = ue0Var.n.iterator();
                while (it.hasNext()) {
                    java.lang.Integer num = (java.lang.Integer) it.next();
                    android.view.View g2 = se0Var.g(num.intValue());
                    if (flexDirection == 0 || flexDirection == 1) {
                        t(g2, ue0Var.g, num.intValue());
                    } else {
                        if (flexDirection != 2 && flexDirection != 3) {
                            throw new java.lang.IllegalArgumentException(a.ii1.d("Invalid flex direction: ", flexDirection));
                        }
                        s(g2, ue0Var.g, num.intValue());
                    }
                }
            }
            return;
        }
        int[] iArr = this.c;
        java.util.List flexLinesInternal = se0Var.getFlexLinesInternal();
        int size = flexLinesInternal.size();
        for (int i2 = iArr != null ? iArr[i] : 0; i2 < size; i2++) {
            a.ue0 ue0Var2 = (a.ue0) flexLinesInternal.get(i2);
            int i3 = ue0Var2.h;
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = ue0Var2.o + i4;
                if (i4 < se0Var.getFlexItemCount() && (g = se0Var.g(i5)) != null && g.getVisibility() != 8) {
                    a.te0 te0Var = (a.te0) g.getLayoutParams();
                    if (te0Var.n() == -1 || te0Var.n() == 4) {
                        if (flexDirection == 0 || flexDirection == 1) {
                            t(g, ue0Var2.g, i5);
                        } else {
                            if (flexDirection != 2 && flexDirection != 3) {
                                throw new java.lang.IllegalArgumentException(a.ii1.d("Invalid flex direction: ", flexDirection));
                            }
                            s(g, ue0Var2.g, i5);
                        }
                    }
                }
            }
        }
    }

    public final void v(android.view.View view, int i, int i2, int i3) {
        long[] jArr = this.d;
        if (jArr != null) {
            jArr[i] = (i2 & 4294967295L) | (i3 << 32);
        }
        long[] jArr2 = this.e;
        if (jArr2 != null) {
            jArr2[i] = (view.getMeasuredWidth() & 4294967295L) | (view.getMeasuredHeight() << 32);
        }
    }
}
