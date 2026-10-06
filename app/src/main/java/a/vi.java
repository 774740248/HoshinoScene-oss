package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class vi {
    public final a.d91 d;

    /* renamed from: a, reason: collision with root package name */
    public final a.a61 f633a = new a.a61(30, 1);
    public final java.util.ArrayList b = new java.util.ArrayList();
    public final java.util.ArrayList c = new java.util.ArrayList();
    public int f = 0;
    public final a.pe e = new a.pe(this);

    public vi(a.d91 d91Var) {
        this.d = d91Var;
    }

    public final boolean a(int i) {
        java.util.ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            a.ui uiVar = (a.ui) arrayList.get(i2);
            int i3 = uiVar.f596a;
            if (i3 == 8) {
                if (f(uiVar.d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = uiVar.b;
                int i5 = uiVar.d + i4;
                while (i4 < i5) {
                    if (f(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public final void b() {
        java.util.ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.d.a((a.ui) arrayList.get(i));
        }
        l(arrayList);
        this.f = 0;
    }

    public final void c() {
        b();
        java.util.ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            a.ui uiVar = (a.ui) arrayList.get(i);
            int i2 = uiVar.f596a;
            a.d91 d91Var = this.d;
            if (i2 == 1) {
                d91Var.a(uiVar);
                d91Var.d(uiVar.b, uiVar.d);
            } else if (i2 == 2) {
                d91Var.a(uiVar);
                int i3 = uiVar.b;
                int i4 = uiVar.d;
                androidx.recyclerview.widget.RecyclerView recyclerView = d91Var.f90a;
                recyclerView.T(i3, i4, true);
                recyclerView.m0 = true;
                recyclerView.j0.c += i4;
            } else if (i2 == 4) {
                d91Var.a(uiVar);
                d91Var.c(uiVar.b, uiVar.d, uiVar.c);
            } else if (i2 == 8) {
                d91Var.a(uiVar);
                d91Var.e(uiVar.b, uiVar.d);
            }
        }
        l(arrayList);
        this.f = 0;
    }

    public final void d(a.ui uiVar) {
        int i;
        int i2 = uiVar.f596a;
        if (i2 == 1 || i2 == 8) {
            throw new java.lang.IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int m = m(uiVar.b, i2);
        int i3 = uiVar.b;
        int i4 = uiVar.f596a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                throw new java.lang.IllegalArgumentException("op should be remove or update." + uiVar);
            }
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < uiVar.d; i6++) {
            int m2 = m((i * i6) + uiVar.b, uiVar.f596a);
            int i7 = uiVar.f596a;
            if (i7 == 2 ? m2 != m : !(i7 == 4 && m2 == m + 1)) {
                a.ui h = h(uiVar.c, i7, m, i5);
                e(h, i3);
                k(h);
                if (uiVar.f596a == 4) {
                    i3 += i5;
                }
                i5 = 1;
                m = m2;
            } else {
                i5++;
            }
        }
        java.lang.Object obj = uiVar.c;
        k(uiVar);
        if (i5 > 0) {
            a.ui h2 = h(obj, uiVar.f596a, m, i5);
            e(h2, i3);
            k(h2);
        }
    }

    public final void e(a.ui uiVar, int i) {
        a.d91 d91Var = this.d;
        d91Var.a(uiVar);
        int i2 = uiVar.f596a;
        if (i2 != 2) {
            if (i2 != 4) {
                throw new java.lang.IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            d91Var.c(i, uiVar.d, uiVar.c);
        } else {
            int i3 = uiVar.d;
            androidx.recyclerview.widget.RecyclerView recyclerView = d91Var.f90a;
            recyclerView.T(i, i3, true);
            recyclerView.m0 = true;
            recyclerView.j0.c += i3;
        }
    }

    public final int f(int i, int i2) {
        java.util.ArrayList arrayList = this.c;
        int size = arrayList.size();
        while (i2 < size) {
            a.ui uiVar = (a.ui) arrayList.get(i2);
            int i3 = uiVar.f596a;
            if (i3 == 8) {
                int i4 = uiVar.b;
                if (i4 == i) {
                    i = uiVar.d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (uiVar.d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = uiVar.b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = uiVar.d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += uiVar.d;
                }
            }
            i2++;
        }
        return i;
    }

    public final boolean g() {
        return this.b.size() > 0;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, a.ui] */
    public final a.ui h(java.lang.Object obj, int i, int i2, int i3) {
        a.ui uiVar = (a.ui) this.f633a.a();
        if (uiVar != null) {
            uiVar.f596a = i;
            uiVar.b = i2;
            uiVar.d = i3;
            uiVar.c = obj;
            return uiVar;
        }
        a.ui obj2 = new a.ui();
        obj2.f596a = i;
        obj2.b = i2;
        obj2.d = i3;
        obj2.c = obj;
        return obj2;
    }

    public final void i(a.ui uiVar) {
        this.c.add(uiVar);
        int i = uiVar.f596a;
        a.d91 d91Var = this.d;
        if (i == 1) {
            d91Var.d(uiVar.b, uiVar.d);
            return;
        }
        if (i == 2) {
            int i2 = uiVar.b;
            int i3 = uiVar.d;
            androidx.recyclerview.widget.RecyclerView recyclerView = d91Var.f90a;
            recyclerView.T(i2, i3, false);
            recyclerView.m0 = true;
            return;
        }
        if (i == 4) {
            d91Var.c(uiVar.b, uiVar.d, uiVar.c);
        } else if (i == 8) {
            d91Var.e(uiVar.b, uiVar.d);
        } else {
            throw new java.lang.IllegalArgumentException("Unknown update op type for " + uiVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 655
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.vi.j():void");
    }

    public final void k(a.ui uiVar) {
        uiVar.c = null;
        this.f633a.b(uiVar);
    }

    public final void l(java.util.ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            k((a.ui) arrayList.get(i));
        }
        arrayList.clear();
    }

    public final int m(int i, int i2) {
        int i3;
        int i4;
        java.util.ArrayList arrayList = this.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a.ui uiVar = (a.ui) arrayList.get(size);
            int i5 = uiVar.f596a;
            if (i5 == 8) {
                int i6 = uiVar.b;
                int i7 = uiVar.d;
                if (i6 < i7) {
                    i4 = i6;
                    i3 = i7;
                } else {
                    i3 = i6;
                    i4 = i7;
                }
                if (i < i4 || i > i3) {
                    if (i < i6) {
                        if (i2 == 1) {
                            uiVar.b = i6 + 1;
                            uiVar.d = i7 + 1;
                        } else if (i2 == 2) {
                            uiVar.b = i6 - 1;
                            uiVar.d = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        uiVar.d = i7 + 1;
                    } else if (i2 == 2) {
                        uiVar.d = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        uiVar.b = i6 + 1;
                    } else if (i2 == 2) {
                        uiVar.b = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = uiVar.b;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= uiVar.d;
                    } else if (i5 == 2) {
                        i += uiVar.d;
                    }
                } else if (i2 == 1) {
                    uiVar.b = i8 + 1;
                } else if (i2 == 2) {
                    uiVar.b = i8 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            a.ui uiVar2 = (a.ui) arrayList.get(size2);
            if (uiVar2.f596a == 8) {
                int i9 = uiVar2.d;
                if (i9 == uiVar2.b || i9 < 0) {
                    arrayList.remove(size2);
                    k(uiVar2);
                }
            } else if (uiVar2.d <= 0) {
                arrayList.remove(size2);
                k(uiVar2);
            }
        }
        return i;
    }
}
