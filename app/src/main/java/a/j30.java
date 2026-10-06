package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class j30 {

    public j30() {
    }


    /* renamed from: a, reason: collision with root package name */
    public a.jx f245a;
    public boolean b;
    public boolean c;
    public a.jx d;
    public java.util.ArrayList e;
    public a.zw f;
    public a.xq g;
    public java.util.ArrayList h;

    /* JADX WARN: Type inference failed for: r10v2, types: [a.sc1, java.lang.Object] */
    public final void a(a.k30 k30Var, int i, java.util.ArrayList arrayList, a.sc1 sc1Var) {
        a.ws1 ws1Var = k30Var.d;
        if (ws1Var.c == null) {
            a.jx jxVar = this.f245a;
            if (ws1Var != jxVar.d) {
                a.sc1 sc1Var2 = sc1Var;
                if (ws1Var == jxVar.e) {
                    return;
                }
                if (sc1Var == null) {
                    a.sc1 obj = new a.sc1();
                    obj.f525a = null;
                    obj.b = new java.util.ArrayList();
                    obj.f525a = ws1Var;
                    arrayList.add(obj);
                    sc1Var2 = obj;
                }
                ws1Var.c = sc1Var2;
                sc1Var2.b.add(ws1Var);
                a.k30 k30Var2 = ws1Var.h;
                java.util.Iterator it = k30Var2.k.iterator();
                while (it.hasNext()) {
                    a.i30 i30Var = (a.i30) it.next();
                    if (i30Var instanceof a.k30) {
                        a((a.k30) i30Var, i, arrayList, sc1Var2);
                    }
                }
                a.k30 k30Var3 = ws1Var.i;
                java.util.Iterator it2 = k30Var3.k.iterator();
                while (it2.hasNext()) {
                    a.i30 i30Var2 = (a.i30) it2.next();
                    if (i30Var2 instanceof a.k30) {
                        a((a.k30) i30Var2, i, arrayList, sc1Var2);
                    }
                }
                if (i == 1 && (ws1Var instanceof a.ip1)) {
                    java.util.Iterator it3 = ((a.ip1) ws1Var).k.k.iterator();
                    while (it3.hasNext()) {
                        a.i30 i30Var3 = (a.i30) it3.next();
                        if (i30Var3 instanceof a.k30) {
                            a((a.k30) i30Var3, i, arrayList, sc1Var2);
                        }
                    }
                }
                java.util.Iterator it4 = k30Var2.l.iterator();
                while (it4.hasNext()) {
                    a((a.k30) it4.next(), i, arrayList, sc1Var2);
                }
                java.util.Iterator it5 = k30Var3.l.iterator();
                while (it5.hasNext()) {
                    a((a.k30) it5.next(), i, arrayList, sc1Var2);
                }
                if (i == 1 && (ws1Var instanceof a.ip1)) {
                    java.util.Iterator it6 = ((a.ip1) ws1Var).k.l.iterator();
                    while (it6.hasNext()) {
                        a((a.k30) it6.next(), i, arrayList, sc1Var2);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0008 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0201 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0192 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x025f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(a.jx r20) {
        /*
            Method dump skipped, instructions count: 782
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.j30.b(a.jx):void");
    }

    public final void c() {
        java.util.ArrayList arrayList = this.e;
        arrayList.clear();
        a.jx jxVar = this.d;
        jxVar.d.f();
        a.ip1 ip1Var = jxVar.e;
        ip1Var.f();
        arrayList.add(jxVar.d);
        arrayList.add(ip1Var);
        java.util.Iterator it = jxVar.d0.iterator();
        java.util.HashSet hashSet = null;
        while (it.hasNext()) {
            a.ix ixVar = (a.ix) it.next();
            if (ixVar instanceof a.zq0) {
                a.ws1 ws1Var = new a.ar0(ixVar);
                ixVar.d.f();
                ixVar.e.f();
                ws1Var.f = ((a.zq0) ixVar).h0;
                arrayList.add(ws1Var);
            } else {
                if (ixVar.r()) {
                    if (ixVar.b == null) {
                        ixVar.b = new a.mt(ixVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new java.util.HashSet();
                    }
                    hashSet.add(ixVar.b);
                } else {
                    arrayList.add(ixVar.d);
                }
                if (ixVar.s()) {
                    if (ixVar.c == null) {
                        ixVar.c = new a.mt(ixVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new java.util.HashSet();
                    }
                    hashSet.add(ixVar.c);
                } else {
                    arrayList.add(ixVar.e);
                }
                if (ixVar instanceof a.kr0) {
                    arrayList.add(new a.jr0(ixVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        java.util.Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((a.ws1) it2.next()).f();
        }
        java.util.Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            a.ws1 ws1Var2 = (a.ws1) it3.next();
            if (ws1Var2.b != jxVar) {
                ws1Var2.d();
            }
        }
        java.util.ArrayList arrayList2 = this.h;
        arrayList2.clear();
        a.jx jxVar2 = this.f245a;
        e(jxVar2.d, 0, arrayList2);
        e(jxVar2.e, 1, arrayList2);
        this.b = false;
    }

    public final int d(a.jx jxVar, int i) {
        java.util.ArrayList arrayList;
        int i2;
        int i3;
        long max;
        float f;
        a.jx jxVar2 = jxVar;
        java.util.ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        int i4 = 0;
        long j = 0;
        while (i4 < size) {
            a.ws1 ws1Var = ((a.sc1) arrayList2.get(i4)).f525a;
            if (!(ws1Var instanceof a.mt) ? !(i != 0 ? (ws1Var instanceof a.ip1) : (ws1Var instanceof a.nr0)) : ((a.mt) ws1Var).f != i) {
                a.k30 k30Var = (i == 0 ? jxVar2.d : jxVar2.e).h;
                a.k30 k30Var2 = (i == 0 ? jxVar2.d : jxVar2.e).i;
                boolean contains = ws1Var.h.l.contains(k30Var);
                a.k30 k30Var3 = ws1Var.i;
                boolean contains2 = k30Var3.l.contains(k30Var2);
                long j2 = ws1Var.j();
                a.k30 k30Var4 = ws1Var.h;
                if (contains && contains2) {
                    long b = a.sc1.b(k30Var4, 0L);
                    java.util.ArrayList arrayList3 = arrayList2;
                    i2 = size;
                    long a2 = a.sc1.a(k30Var3, 0L);
                    long j3 = b - j2;
                    int i5 = k30Var3.f;
                    arrayList = arrayList3;
                    i3 = i4;
                    if (j3 >= (-i5)) {
                        j3 += i5;
                    }
                    long j4 = (-a2) - j2;
                    long j5 = k30Var4.f;
                    long j6 = j4 - j5;
                    if (j6 >= j5) {
                        j6 -= j5;
                    }
                    a.ix ixVar = ws1Var.b;
                    if (i == 0) {
                        f = ixVar.S;
                    } else if (i == 1) {
                        f = ixVar.T;
                    } else {
                        ixVar.getClass();
                        f = -1.0f;
                    }
                    float f2 = (float) (f > 0.0f ? (((float) j3) / (1.0f - f)) + (((float) j6) / f) : 0L);
                    max = (k30Var4.f + ((((f2 * f) + 0.5f) + j2) + (((1.0f - f) * f2) + 0.5f))) - k30Var3.f;
                } else {
                    arrayList = arrayList2;
                    i2 = size;
                    i3 = i4;
                    max = contains ? java.lang.Math.max(a.sc1.b(k30Var4, k30Var4.f), k30Var4.f + j2) : contains2 ? java.lang.Math.max(-a.sc1.a(k30Var3, k30Var3.f), (-k30Var3.f) + j2) : (ws1Var.j() + k30Var4.f) - k30Var3.f;
                }
            } else {
                arrayList = arrayList2;
                i2 = size;
                i3 = i4;
                max = 0;
            }
            j = java.lang.Math.max(j, max);
            i4 = i3 + 1;
            jxVar2 = jxVar;
            size = i2;
            arrayList2 = arrayList;
        }
        return (int) j;
    }

    public final void e(a.ws1 ws1Var, int i, java.util.ArrayList arrayList) {
        a.k30 k30Var;
        java.util.Iterator it = ws1Var.h.k.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            k30Var = ws1Var.i;
            if (!hasNext) {
                break;
            }
            a.i30 i30Var = (a.i30) it.next();
            if (i30Var instanceof a.k30) {
                a((a.k30) i30Var, i, arrayList, null);
            } else if (i30Var instanceof a.ws1) {
                a(((a.ws1) i30Var).h, i, arrayList, null);
            }
        }
        java.util.Iterator it2 = k30Var.k.iterator();
        while (it2.hasNext()) {
            a.i30 i30Var2 = (a.i30) it2.next();
            if (i30Var2 instanceof a.k30) {
                a((a.k30) i30Var2, i, arrayList, null);
            } else if (i30Var2 instanceof a.ws1) {
                a(((a.ws1) i30Var2).i, i, arrayList, null);
            }
        }
        if (i == 1) {
            java.util.Iterator it3 = ((a.ip1) ws1Var).k.k.iterator();
            while (it3.hasNext()) {
                a.i30 i30Var3 = (a.i30) it3.next();
                if (i30Var3 instanceof a.k30) {
                    a((a.k30) i30Var3, i, arrayList, null);
                }
            }
        }
    }

    public final void f(a.ix ixVar, int i, int i2, int i3, int i4) {
        a.xq xqVar = this.g;
        xqVar.f692a = i;
        xqVar.b = i3;
        xqVar.c = i2;
        xqVar.d = i4;
        this.f.a(ixVar, xqVar);
        ixVar.z(xqVar.e);
        ixVar.w(xqVar.f);
        ixVar.w = xqVar.h;
        int i5 = xqVar.g;
        ixVar.P = i5;
        ixVar.w = i5 > 0;
    }

    public final void g() {
        a.wq wqVar;
        java.util.Iterator it = this.f245a.d0.iterator();
        while (it.hasNext()) {
            a.ix ixVar = (a.ix) it.next();
            if (!ixVar.f242a) {
                int[] iArr = ixVar.c0;
                boolean z = false;
                int i = iArr[0];
                int i2 = iArr[1];
                int i3 = ixVar.j;
                int i4 = ixVar.k;
                boolean z2 = i == 2 || (i == 3 && i3 == 1);
                if (i2 == 2 || (i2 == 3 && i4 == 1)) {
                    z = true;
                }
                a.nr0 nr0Var = ixVar.d;
                a.v80 v80Var = nr0Var.e;
                boolean z3 = v80Var.j;
                a.ip1 ip1Var = ixVar.e;
                a.v80 v80Var2 = ip1Var.e;
                boolean z4 = v80Var2.j;
                if (z3 && z4) {
                    f(ixVar, 1, v80Var.g, 1, v80Var2.g);
                    ixVar.f242a = true;
                } else if (z3 && z) {
                    f(ixVar, 1, v80Var.g, 2, v80Var2.g);
                    if (i2 == 3) {
                        ip1Var.e.m = ixVar.j();
                    } else {
                        ip1Var.e.d(ixVar.j());
                        ixVar.f242a = true;
                    }
                } else if (z4 && z2) {
                    f(ixVar, 2, v80Var.g, 1, v80Var2.g);
                    if (i == 3) {
                        nr0Var.e.m = ixVar.m();
                    } else {
                        nr0Var.e.d(ixVar.m());
                        ixVar.f242a = true;
                    }
                }
                if (ixVar.f242a && (wqVar = ip1Var.l) != null) {
                    wqVar.d(ixVar.P);
                }
            }
        }
    }
}
