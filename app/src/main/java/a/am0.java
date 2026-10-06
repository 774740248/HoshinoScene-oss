package a;

import android.app.Activity;
/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class am0 {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public java.util.ArrayList F;
    public java.util.ArrayList G;
    public java.util.ArrayList H;
    public a.dm0 I;
    public final a.lk0 J;
    public boolean b;
    public java.util.ArrayList d;
    public java.util.ArrayList e;
    public androidx.activity.a g;
    public java.util.ArrayList k;
    public final java.util.Map l;
    public final a.sl0 m;
    public final a.pm n;
    public final java.util.concurrent.CopyOnWriteArrayList o;
    public int p;
    public a.jk0 q;
    public a.wv r;
    public a.gk0 s;
    public a.gk0 t;
    public final a.ul0 u;
    public final a.sl0 v;
    public a.ue w;
    public a.ue x;
    public a.ue y;
    public java.util.ArrayDeque z;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f18a = new java.util.ArrayList();
    public final a.dn0 c = new a.dn0();
    public final a.rl0 f = new a.rl0(this);
    public final a.tl0 h = new a.tl0(this);
    public final java.util.concurrent.atomic.AtomicInteger i = new java.util.concurrent.atomic.AtomicInteger();
    public final java.util.Map j = java.util.Collections.synchronizedMap(new java.util.HashMap());

    public am0() {
        java.util.Collections.synchronizedMap(new java.util.HashMap());
        this.l = java.util.Collections.synchronizedMap(new java.util.HashMap());
        this.m = new a.sl0(this, 2);
        this.n = new a.pm(this);
        this.o = new java.util.concurrent.CopyOnWriteArrayList();
        this.p = -1;
        this.u = new a.ul0(this);
        int i = 3;
        this.v = new a.sl0(this, i);
        this.z = new java.util.ArrayDeque();
        this.J = new a.lk0(i, this);
    }

    public static boolean C(a.gk0 gk0Var) {
        gk0Var.getClass();
        java.util.Iterator it = gk0Var.w.c.e().iterator();
        boolean z = false;
        while (it.hasNext()) {
            a.gk0 gk0Var2 = (a.gk0) it.next();
            if (gk0Var2 != null) {
                z = C(gk0Var2);
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public static boolean D(a.gk0 gk0Var) {
        if (gk0Var == null) {
            return true;
        }
        return gk0Var.E && (gk0Var.u == null || D(gk0Var.x));
    }

    public static boolean E(a.gk0 gk0Var) {
        if (gk0Var == null) {
            return true;
        }
        a.am0 am0Var = gk0Var.u;
        return gk0Var.equals(am0Var.t) && E(am0Var.s);
    }

    public static void T(a.gk0 gk0Var) {
        if (android.util.Log.isLoggable("FragmentManager", 2)) {
            android.util.Log.v("FragmentManager", "show: " + gk0Var);
        }
        if (gk0Var.B) {
            gk0Var.B = false;
            gk0Var.L = !gk0Var.L;
        }
    }

    public final a.sl0 A() {
        a.gk0 gk0Var = this.s;
        return gk0Var != null ? gk0Var.u.A() : this.v;
    }

    public final void B(a.gk0 gk0Var) {
        if (android.util.Log.isLoggable("FragmentManager", 2)) {
            android.util.Log.v("FragmentManager", "hide: " + gk0Var);
        }
        if (gk0Var.B) {
            return;
        }
        gk0Var.B = true;
        gk0Var.L = true ^ gk0Var.L;
        S(gk0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0094, code lost:
    
        if (r1 != 5) goto L118;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01db A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a9  */
    /* JADX WARN: Type inference failed for: r5v1, types: [a.ct, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F(int r20, a.gk0 r21) {
        /*
            Method dump skipped, instructions count: 557
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.am0.F(int, a.gk0):void");
    }

    public final void G(int i, boolean z) {
        java.util.HashMap hashMap;
        a.jk0 jk0Var;
        if (this.q == null && i != -1) {
            throw new java.lang.IllegalStateException("No activity");
        }
        if (z || i != this.p) {
            this.p = i;
            a.dn0 dn0Var = this.c;
            java.util.Iterator it = dn0Var.f101a.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                hashMap = dn0Var.b;
                if (!hasNext) {
                    break;
                }
                androidx.fragment.app.a aVar = (androidx.fragment.app.a) hashMap.get(((a.gk0) it.next()).h);
                if (aVar != null) {
                    aVar.k();
                }
            }
            for (androidx.fragment.app.a aVar2 : (Iterable<androidx.fragment.app.a>) hashMap.values()) {
                if (aVar2 != null) {
                    aVar2.k();
                    a.gk0 gk0Var = aVar2.c;
                    if (gk0Var.o && gk0Var.t <= 0) {
                        dn0Var.h(aVar2);
                    }
                }
            }
            U();
            if (this.A && (jk0Var = this.q) != null && this.p == 7) {
                jk0Var.a0.supportInvalidateOptionsMenu();
                this.A = false;
            }
        }
    }

    public final void H() {
        if (this.q == null) {
            return;
        }
        this.B = false;
        this.C = false;
        this.I.i = false;
        for (a.gk0 gk0Var : (Iterable<a.gk0>) this.c.f()) {
            if (gk0Var != null) {
                gk0Var.w.H();
            }
        }
    }

    public final boolean I() {
        u(false);
        t(true);
        a.gk0 gk0Var = this.t;
        if (gk0Var != null && gk0Var.e().I()) {
            return true;
        }
        boolean J = J(this.F, this.G, -1, 0);
        if (J) {
            this.b = true;
            try {
                L(this.F, this.G);
            } finally {
                d();
            }
        }
        V();
        q();
        this.c.b.values().removeAll(java.util.Collections.singleton(null));
        return J;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0043, code lost:
    
        if ((r8 & 1) != 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0045, code lost:
    
        r0 = r0 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0047, code lost:
    
        if (r0 < 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0049, code lost:
    
        r8 = (a.cq) r4.d.get(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0051, code lost:
    
        if (r7 < 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0055, code lost:
    
        if (r7 != r8.r) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean J(java.util.ArrayList r5, java.util.ArrayList r6, int r7, int r8) {
        /*
            r4 = this;
            java.util.ArrayList r0 = r4.d
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r2 = 1
            if (r7 >= 0) goto L24
            r3 = r8 & 1
            if (r3 != 0) goto L24
            int r7 = r0.size()
            int r7 = r7 - r2
            if (r7 >= 0) goto L15
            return r1
        L15:
            java.util.ArrayList r8 = r4.d
            java.lang.Object r7 = r8.remove(r7)
            r5.add(r7)
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r6.add(r5)
            goto L7d
        L24:
            if (r7 < 0) goto L58
            int r0 = r0.size()
            int r0 = r0 - r2
        L2b:
            if (r0 < 0) goto L3f
            java.util.ArrayList r3 = r4.d
            java.lang.Object r3 = r3.get(r0)
            a.cq r3 = (a.cq) r3
            if (r7 < 0) goto L3c
            int r3 = r3.r
            if (r7 != r3) goto L3c
            goto L3f
        L3c:
            int r0 = r0 + (-1)
            goto L2b
        L3f:
            if (r0 >= 0) goto L42
            return r1
        L42:
            r8 = r8 & r2
            if (r8 == 0) goto L59
        L45:
            int r0 = r0 + (-1)
            if (r0 < 0) goto L59
            java.util.ArrayList r8 = r4.d
            java.lang.Object r8 = r8.get(r0)
            a.cq r8 = (a.cq) r8
            if (r7 < 0) goto L59
            int r8 = r8.r
            if (r7 != r8) goto L59
            goto L45
        L58:
            r0 = -1
        L59:
            java.util.ArrayList r7 = r4.d
            int r7 = r7.size()
            int r7 = r7 - r2
            if (r0 != r7) goto L63
            return r1
        L63:
            java.util.ArrayList r7 = r4.d
            int r7 = r7.size()
            int r7 = r7 - r2
        L6a:
            if (r7 <= r0) goto L7d
            java.util.ArrayList r8 = r4.d
            java.lang.Object r8 = r8.remove(r7)
            r5.add(r8)
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            r6.add(r8)
            int r7 = r7 + (-1)
            goto L6a
        L7d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: a.am0.J(java.util.ArrayList, java.util.ArrayList, int, int):boolean");
    }

    public final void K(a.gk0 gk0Var) {
        if (android.util.Log.isLoggable("FragmentManager", 2)) {
            android.util.Log.v("FragmentManager", "remove: " + gk0Var + " nesting=" + gk0Var.t);
        }
        boolean z = !(gk0Var.t > 0);
        if (!gk0Var.C || z) {
            a.dn0 dn0Var = this.c;
            synchronized (dn0Var.f101a) {
                dn0Var.f101a.remove(gk0Var);
            }
            gk0Var.n = false;
            if (C(gk0Var)) {
                this.A = true;
            }
            gk0Var.o = true;
            S(gk0Var);
        }
    }

    public final void L(java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new java.lang.IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((a.cq) arrayList.get(i)).o) {
                if (i2 != i) {
                    v(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((java.lang.Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((java.lang.Boolean) arrayList2.get(i2)).booleanValue() && !((a.cq) arrayList.get(i2)).o) {
                        i2++;
                    }
                }
                v(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            v(arrayList, arrayList2, i2, size);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [a.en0, java.lang.Object] */
    public final void M(android.os.Parcelable parcelable) {
        int i;
        a.pm pmVar;
        int i2;
        androidx.fragment.app.a aVar;
        if (parcelable == null) {
            return;
        }
        a.cm0 cm0Var = (a.cm0) parcelable;
        if (cm0Var.c == null) {
            return;
        }
        a.dn0 dn0Var = this.c;
        dn0Var.b.clear();
        java.util.Iterator it = cm0Var.c.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            i = 2;
            pmVar = this.n;
            if (!hasNext) {
                break;
            }
            a.cn0 cn0Var = (a.cn0) it.next();
            if (cn0Var != null) {
                a.gk0 gk0Var = (a.gk0) this.I.d.get(cn0Var.d);
                if (gk0Var != null) {
                    if (android.util.Log.isLoggable("FragmentManager", 2)) {
                        android.util.Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + gk0Var);
                    }
                    aVar = new androidx.fragment.app.a(pmVar, dn0Var, gk0Var, cn0Var);
                } else {
                    aVar = new androidx.fragment.app.a(this.n, this.c, this.q.X.getClassLoader(), z(), cn0Var);
                }
                a.gk0 gk0Var2 = aVar.c;
                gk0Var2.u = this;
                if (android.util.Log.isLoggable("FragmentManager", 2)) {
                    android.util.Log.v("FragmentManager", "restoreSaveState: active (" + gk0Var2.h + "): " + gk0Var2);
                }
                aVar.m(this.q.X.getClassLoader());
                dn0Var.g(aVar);
                aVar.e = this.p;
            }
        }
        a.dm0 dm0Var = this.I;
        dm0Var.getClass();
        java.util.Iterator it2 = new java.util.ArrayList(dm0Var.d.values()).iterator();
        while (it2.hasNext()) {
            a.gk0 gk0Var3 = (a.gk0) it2.next();
            if (!(dn0Var.b.get(gk0Var3.h) != null)) {
                if (android.util.Log.isLoggable("FragmentManager", 2)) {
                    android.util.Log.v("FragmentManager", "Discarding retained Fragment " + gk0Var3 + " that was not found in the set of active Fragments " + cm0Var.c);
                }
                this.I.c(gk0Var3);
                gk0Var3.u = this;
                androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(pmVar, dn0Var, gk0Var3);
                aVar2.e = 1;
                aVar2.k();
                gk0Var3.o = true;
                aVar2.k();
            }
        }
        java.util.ArrayList<java.lang.String> arrayList = cm0Var.d;
        dn0Var.f101a.clear();
        if (arrayList != null) {
            for (java.lang.String str : arrayList) {
                a.gk0 b = dn0Var.b(str);
                if (b == null) {
                    throw new java.lang.IllegalStateException(a.ai1.h("No instantiated fragment for (", str, ")"));
                }
                if (android.util.Log.isLoggable("FragmentManager", 2)) {
                    android.util.Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + b);
                }
                dn0Var.a(b);
            }
        }
        a.gk0 gk0Var4 = null;
        if (cm0Var.e != null) {
            this.d = new java.util.ArrayList(cm0Var.e.length);
            int i3 = 0;
            while (true) {
                a.dq[] dqVarArr = cm0Var.e;
                if (i3 >= dqVarArr.length) {
                    break;
                }
                a.dq dqVar = dqVarArr[i3];
                dqVar.getClass();
                a.cq cqVar = new a.cq(this);
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    int[] iArr = dqVar.c;
                    if (i4 >= iArr.length) {
                        break;
                    }
                    en0 obj = new en0();
                    /* TODO: jadx type unresolved, defaulted to Object */
                    int i6 = i4 + 1;
                    obj.f129a = iArr[i4];
                    if (android.util.Log.isLoggable("FragmentManager", i)) {
                        android.util.Log.v("FragmentManager", "Instantiate " + cqVar + " op #" + i5 + " base fragment #" + iArr[i6]);
                    }
                    java.lang.String str2 = (java.lang.String) dqVar.d.get(i5);
                    if (str2 != null) {
                        obj.b = dn0Var.b(str2);
                    } else {
                        obj.b = gk0Var4;
                    }
                    obj.g = a.fv0.values()[dqVar.e[i5]];
                    obj.h = a.fv0.values()[dqVar.f[i5]];
                    int i7 = iArr[i6];
                    obj.c = i7;
                    int i8 = iArr[i4 + 2];
                    obj.d = i8;
                    int i9 = i4 + 4;
                    int i10 = iArr[i4 + 3];
                    obj.e = i10;
                    i4 += 5;
                    int i11 = iArr[i9];
                    obj.f = i11;
                    cqVar.b = i7;
                    cqVar.c = i8;
                    cqVar.d = i10;
                    cqVar.e = i11;
                    cqVar.b((en0) (obj));
                    i5++;
                    gk0Var4 = null;
                    i = 2;
                }
                cqVar.f = dqVar.g;
                cqVar.h = dqVar.h;
                cqVar.r = dqVar.i;
                cqVar.g = true;
                cqVar.i = dqVar.j;
                cqVar.j = dqVar.k;
                cqVar.k = dqVar.l;
                cqVar.l = dqVar.m;
                cqVar.m = dqVar.n;
                cqVar.n = dqVar.o;
                cqVar.o = dqVar.p;
                cqVar.c(1);
                if (android.util.Log.isLoggable("FragmentManager", 2)) {
                    android.util.Log.v("FragmentManager", "restoreAllState: back stack #" + i3 + " (index " + cqVar.r + "): " + cqVar);
                    java.io.PrintWriter printWriter = new java.io.PrintWriter(new a.px0());
                    cqVar.f("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(cqVar);
                i3++;
                i = 2;
                gk0Var4 = null;
            }
            i2 = 0;
        } else {
            i2 = 0;
            this.d = null;
        }
        this.i.set(cm0Var.f);
        java.lang.String str3 = cm0Var.g;
        if (str3 != null) {
            a.gk0 b2 = dn0Var.b(str3);
            this.t = b2;
            n(b2);
        }
        java.util.ArrayList arrayList2 = cm0Var.h;
        if (arrayList2 != null) {
            while (i2 < arrayList2.size()) {
                android.os.Bundle bundle = (android.os.Bundle) cm0Var.i.get(i2);
                bundle.setClassLoader(this.q.X.getClassLoader());
                this.j.put(arrayList2.get(i2), bundle);
                i2++;
            }
        }
        this.z = new java.util.ArrayDeque(cm0Var.j);
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [a.cm0, java.lang.Object] */
    public final a.cm0 N() {
        int i;
        java.util.ArrayList arrayList;
        a.dq[] dqVarArr;
        int size;
        java.util.Iterator it = e().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            a.ji1 ji1Var = (a.ji1) it.next();
            if (ji1Var.e) {
                ji1Var.e = false;
                ji1Var.c();
            }
        }
        java.util.Iterator it2 = e().iterator();
        while (it2.hasNext()) {
            ((a.ji1) it2.next()).e();
        }
        u(true);
        this.B = true;
        this.I.i = true;
        a.dn0 dn0Var = this.c;
        dn0Var.getClass();
        java.util.HashMap hashMap = dn0Var.b;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(hashMap.size());
        java.util.Iterator it3 = hashMap.values().iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            androidx.fragment.app.a aVar = (androidx.fragment.app.a) it3.next();
            if (aVar != null) {
                a.gk0 gk0Var = aVar.c;
                a.cn0 cn0Var = new a.cn0(gk0Var);
                if (gk0Var.c <= -1 || cn0Var.o != null) {
                    cn0Var.o = gk0Var.d;
                } else {
                    android.os.Bundle bundle = new android.os.Bundle();
                    gk0Var.z(bundle);
                    gk0Var.T.c(bundle);
                    a.cm0 N = gk0Var.w.N();
                    if (N != null) {
                        bundle.putParcelable("android:support:fragments", N);
                    }
                    aVar.f754a.k(false);
                    android.os.Bundle bundle2 = bundle.isEmpty() ? null : bundle;
                    if (gk0Var.H != null) {
                        aVar.o();
                    }
                    if (gk0Var.e != null) {
                        if (bundle2 == null) {
                            bundle2 = new android.os.Bundle();
                        }
                        bundle2.putSparseParcelableArray("android:view_state", gk0Var.e);
                    }
                    if (gk0Var.f != null) {
                        if (bundle2 == null) {
                            bundle2 = new android.os.Bundle();
                        }
                        bundle2.putBundle("android:view_registry_state", gk0Var.f);
                    }
                    if (!gk0Var.J) {
                        if (bundle2 == null) {
                            bundle2 = new android.os.Bundle();
                        }
                        bundle2.putBoolean("android:user_visible_hint", gk0Var.J);
                    }
                    cn0Var.o = bundle2;
                    if (gk0Var.k != null) {
                        if (bundle2 == null) {
                            cn0Var.o = new android.os.Bundle();
                        }
                        cn0Var.o.putString("android:target_state", gk0Var.k);
                        int i2 = gk0Var.l;
                        if (i2 != 0) {
                            cn0Var.o.putInt("android:target_req_state", i2);
                        }
                    }
                }
                arrayList2.add(cn0Var);
                if (android.util.Log.isLoggable("FragmentManager", 2)) {
                    android.util.Log.v("FragmentManager", "Saved state of " + gk0Var + ": " + cn0Var.o);
                }
            }
        }
        if (arrayList2.isEmpty()) {
            if (android.util.Log.isLoggable("FragmentManager", 2)) {
                android.util.Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        a.dn0 dn0Var2 = this.c;
        synchronized (dn0Var2.f101a) {
            try {
                if (dn0Var2.f101a.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new java.util.ArrayList(dn0Var2.f101a.size());
                    java.util.Iterator it4 = dn0Var2.f101a.iterator();
                    while (it4.hasNext()) {
                        a.gk0 gk0Var2 = (a.gk0) it4.next();
                        arrayList.add(gk0Var2.h);
                        if (android.util.Log.isLoggable("FragmentManager", 2)) {
                            android.util.Log.v("FragmentManager", "saveAllState: adding fragment (" + gk0Var2.h + "): " + gk0Var2);
                        }
                    }
                }
            } finally {
            }
        }
        java.util.ArrayList arrayList3 = this.d;
        if (arrayList3 == null || (size = arrayList3.size()) <= 0) {
            dqVarArr = null;
        } else {
            dqVarArr = new a.dq[size];
            for (i = 0; i < size; i++) {
                dqVarArr[i] = new a.dq((a.cq) this.d.get(i));
                if (android.util.Log.isLoggable("FragmentManager", 2)) {
                    android.util.Log.v("FragmentManager", "saveAllState: adding back stack #" + i + ": " + this.d.get(i));
                }
            }
        }
        cm0 obj = new cm0();
        /* TODO: jadx type unresolved, defaulted to Object */
        obj.g = null;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        obj.h = arrayList4;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        obj.i = arrayList5;
        obj.c = arrayList2;
        obj.d = arrayList;
        obj.e = dqVarArr;
        obj.f = this.i.get();
        a.gk0 gk0Var3 = this.t;
        if (gk0Var3 != null) {
            obj.g = gk0Var3.h;
        }
        arrayList4.addAll(this.j.keySet());
        arrayList5.addAll(this.j.values());
        obj.j = new java.util.ArrayList(this.z);
        return (cm0) (obj);
    }

    public final void O() {
        synchronized (this.f18a) {
            try {
                if (this.f18a.size() == 1) {
                    this.q.Y.removeCallbacks(this.J);
                    this.q.Y.post(this.J);
                    V();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void P(a.gk0 gk0Var, boolean z) {
        android.view.ViewGroup y = y(gk0Var);
        if (y == null || !(y instanceof androidx.fragment.app.FragmentContainerView)) {
            return;
        }
        ((androidx.fragment.app.FragmentContainerView) y).setDrawDisappearingViewsLast(!z);
    }

    public final void Q(a.gk0 gk0Var, a.fv0 fv0Var) {
        if (gk0Var.equals(this.c.b(gk0Var.h)) && (gk0Var.v == null || gk0Var.u == this)) {
            gk0Var.P = fv0Var;
            return;
        }
        throw new java.lang.IllegalArgumentException("Fragment " + gk0Var + " is not an active fragment of FragmentManager " + this);
    }

    public final void R(a.gk0 gk0Var) {
        if (gk0Var != null) {
            if (!gk0Var.equals(this.c.b(gk0Var.h)) || (gk0Var.v != null && gk0Var.u != this)) {
                throw new java.lang.IllegalArgumentException("Fragment " + gk0Var + " is not an active fragment of FragmentManager " + this);
            }
        }
        a.gk0 gk0Var2 = this.t;
        this.t = gk0Var;
        n(gk0Var2);
        n(this.t);
    }

    public final void S(a.gk0 gk0Var) {
        android.view.ViewGroup y = y(gk0Var);
        if (y != null) {
            a.ek0 ek0Var = gk0Var.K;
            if ((ek0Var == null ? 0 : ek0Var.g) + (ek0Var == null ? 0 : ek0Var.f) + (ek0Var == null ? 0 : ek0Var.e) + (ek0Var == null ? 0 : ek0Var.d) > 0) {
                if (y.getTag(2131363361) == null) {
                    y.setTag(2131363361, gk0Var);
                }
                a.gk0 gk0Var2 = (a.gk0) y.getTag(2131363361);
                a.ek0 ek0Var2 = gk0Var.K;
                boolean z = ek0Var2 != null ? ek0Var2.c : false;
                if (gk0Var2.K == null) {
                    return;
                }
                gk0Var2.c().c = z;
            }
        }
    }

    public final void U() {
        java.util.Iterator it = this.c.d().iterator();
        while (it.hasNext()) {
            androidx.fragment.app.a aVar = (androidx.fragment.app.a) it.next();
            a.gk0 gk0Var = aVar.c;
            if (gk0Var.I) {
                if (this.b) {
                    this.E = true;
                } else {
                    gk0Var.I = false;
                    aVar.k();
                }
            }
        }
    }

    public final void V() {
        synchronized (this.f18a) {
            try {
                if (!this.f18a.isEmpty()) {
                    this.h.b(true);
                    return;
                }
                a.tl0 tl0Var = this.h;
                java.util.ArrayList arrayList = this.d;
                tl0Var.b(arrayList != null && arrayList.size() > 0 && E(this.s));
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final androidx.fragment.app.a a(a.gk0 gk0Var) {
        if (android.util.Log.isLoggable("FragmentManager", 2)) {
            android.util.Log.v("FragmentManager", "add: " + gk0Var);
        }
        androidx.fragment.app.a f = f(gk0Var);
        gk0Var.u = this;
        a.dn0 dn0Var = this.c;
        dn0Var.g(f);
        if (!gk0Var.C) {
            dn0Var.a(gk0Var);
            gk0Var.o = false;
            if (gk0Var.H == null) {
                gk0Var.L = false;
            }
            if (C(gk0Var)) {
                this.A = true;
            }
        }
        return f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, a.qe] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, a.qe] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, a.qe] */
    public final void b(a.jk0 jk0Var, a.wv wvVar, a.gk0 gk0Var) {
        if (this.q != null) {
            throw new java.lang.IllegalStateException("Already attached");
        }
        this.q = jk0Var;
        this.r = wvVar;
        this.s = gk0Var;
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.o;
        if (gk0Var != null) {
            copyOnWriteArrayList.add(new a.vl0(gk0Var));
        } else if (jk0Var instanceof a.gm0) {
            copyOnWriteArrayList.add(jk0Var);
        }
        if (this.s != null) {
            V();
        }
        if (jk0Var instanceof a.f31) {
            androidx.activity.a onBackPressedDispatcher = jk0Var.a0.getOnBackPressedDispatcher();
            this.g = onBackPressedDispatcher;
            onBackPressedDispatcher.a(gk0Var != null ? gk0Var : jk0Var, this.h);
        }
        int i = 0;
        if (gk0Var != null) {
            a.dm0 dm0Var = gk0Var.u.I;
            java.util.HashMap hashMap = dm0Var.e;
            a.dm0 dm0Var2 = (a.dm0) hashMap.get(gk0Var.h);
            if (dm0Var2 == null) {
                dm0Var2 = new a.dm0(dm0Var.g);
                hashMap.put(gk0Var.h, dm0Var2);
            }
            this.I = dm0Var2;
        } else if (jk0Var instanceof a.fr1) {
            a.nk nkVar = new a.nk(jk0Var.a0.getViewModelStore(), a.dm0.j, 0);
            java.lang.String canonicalName = a.dm0.class.getCanonicalName();
            if (canonicalName == null) {
                throw new java.lang.IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            this.I = (a.dm0) nkVar.f(a.dm0.class, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
        } else {
            this.I = new a.dm0(false);
        }
        a.dm0 dm0Var3 = this.I;
        int i2 = 1;
        dm0Var3.i = this.B || this.C;
        this.c.c = dm0Var3;
        a.jk0 jk0Var2 = this.q;
        if (jk0Var2 instanceof a.xe) {
            androidx.activity.result.a activityResultRegistry = jk0Var2.a0.getActivityResultRegistry();
            java.lang.String g = a.ai1.g("FragmentManager:", gk0Var != null ? a.ai1.j(new java.lang.StringBuilder(), gk0Var.h, ":") : "");
            this.w = activityResultRegistry.c(a.ii1.e(g, "StartActivityForResult"), (qe) (new java.lang.Object()), new a.sl0(this, 4));
            this.x = activityResultRegistry.c(a.ii1.e(g, "StartIntentSenderForResult"), (qe) (new java.lang.Object()), new a.sl0(this, i));
            this.y = activityResultRegistry.c(a.ii1.e(g, "RequestPermissions"), (qe) (new java.lang.Object()), new a.sl0(this, i2));
        }
    }

    public final void c(a.gk0 gk0Var) {
        if (android.util.Log.isLoggable("FragmentManager", 2)) {
            android.util.Log.v("FragmentManager", "attach: " + gk0Var);
        }
        if (gk0Var.C) {
            gk0Var.C = false;
            if (gk0Var.n) {
                return;
            }
            this.c.a(gk0Var);
            if (android.util.Log.isLoggable("FragmentManager", 2)) {
                android.util.Log.v("FragmentManager", "add from attach: " + gk0Var);
            }
            if (C(gk0Var)) {
                this.A = true;
            }
        }
    }

    public final void d() {
        this.b = false;
        this.G.clear();
        this.F.clear();
    }

    public final java.util.HashSet e() {
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator it = this.c.d().iterator();
        while (it.hasNext()) {
            android.view.ViewGroup viewGroup = ((androidx.fragment.app.a) it.next()).c.G;
            if (viewGroup != null) {
                hashSet.add(a.ji1.f(viewGroup, A()));
            }
        }
        return hashSet;
    }

    public final androidx.fragment.app.a f(a.gk0 gk0Var) {
        java.lang.String str = gk0Var.h;
        a.dn0 dn0Var = this.c;
        androidx.fragment.app.a aVar = (androidx.fragment.app.a) dn0Var.b.get(str);
        if (aVar != null) {
            return aVar;
        }
        androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(this.n, dn0Var, gk0Var);
        aVar2.m(this.q.X.getClassLoader());
        aVar2.e = this.p;
        return aVar2;
    }

    public final void g(a.gk0 gk0Var) {
        if (android.util.Log.isLoggable("FragmentManager", 2)) {
            android.util.Log.v("FragmentManager", "detach: " + gk0Var);
        }
        if (gk0Var.C) {
            return;
        }
        gk0Var.C = true;
        if (gk0Var.n) {
            if (android.util.Log.isLoggable("FragmentManager", 2)) {
                android.util.Log.v("FragmentManager", "remove from detach: " + gk0Var);
            }
            a.dn0 dn0Var = this.c;
            synchronized (dn0Var.f101a) {
                dn0Var.f101a.remove(gk0Var);
            }
            gk0Var.n = false;
            if (C(gk0Var)) {
                this.A = true;
            }
            S(gk0Var);
        }
    }

    public final void h(android.content.res.Configuration configuration) {
        for (a.gk0 gk0Var : (Iterable<a.gk0>) this.c.f()) {
            if (gk0Var != null) {
                gk0Var.onConfigurationChanged(configuration);
                gk0Var.w.h(configuration);
            }
        }
    }

    public final boolean i() {
        if (this.p < 1) {
            return false;
        }
        for (a.gk0 gk0Var : (Iterable<a.gk0>) this.c.f()) {
            if (gk0Var != null && !gk0Var.B && gk0Var.w.i()) {
                return true;
            }
        }
        return false;
    }

    public final boolean j() {
        if (this.p < 1) {
            return false;
        }
        java.util.ArrayList arrayList = null;
        boolean z = false;
        for (a.gk0 gk0Var : (Iterable<a.gk0>) this.c.f()) {
            if (gk0Var != null && D(gk0Var) && !gk0Var.B && gk0Var.w.j()) {
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList();
                }
                arrayList.add(gk0Var);
                z = true;
            }
        }
        if (this.e != null) {
            for (int i = 0; i < this.e.size(); i++) {
                a.gk0 gk0Var2 = (a.gk0) this.e.get(i);
                if (arrayList == null || !arrayList.contains(gk0Var2)) {
                    gk0Var2.getClass();
                }
            }
        }
        this.e = arrayList;
        return z;
    }

    public final void k() {
        this.D = true;
        u(true);
        java.util.Iterator it = e().iterator();
        while (it.hasNext()) {
            ((a.ji1) it.next()).e();
        }
        p(-1);
        this.q = null;
        this.r = null;
        this.s = null;
        if (this.g != null) {
            java.util.Iterator it2 = this.h.b.iterator();
            while (it2.hasNext()) {
                ((a.ys) it2.next()).cancel();
            }
            this.g = null;
        }
        a.ue ueVar = this.w;
        if (ueVar != null) {
            int i = ueVar.f589a;
            java.lang.String str = ueVar.b;
            androidx.activity.result.a aVar = ueVar.d;
            switch (i) {
                case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                    aVar.f(str);
                    break;
                default:
                    aVar.f(str);
                    break;
            }
            a.ue ueVar2 = this.x;
            int i2 = ueVar2.f589a;
            java.lang.String str2 = ueVar2.b;
            androidx.activity.result.a aVar2 = ueVar2.d;
            switch (i2) {
                case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                    aVar2.f(str2);
                    break;
                default:
                    aVar2.f(str2);
                    break;
            }
            a.ue ueVar3 = this.y;
            int i3 = ueVar3.f589a;
            java.lang.String str3 = ueVar3.b;
            androidx.activity.result.a aVar3 = ueVar3.d;
            switch (i3) {
                case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                    aVar3.f(str3);
                    return;
                default:
                    aVar3.f(str3);
                    return;
            }
        }
    }

    public final boolean l() {
        if (this.p < 1) {
            return false;
        }
        for (a.gk0 gk0Var : (Iterable<a.gk0>) this.c.f()) {
            if (gk0Var != null && !gk0Var.B && gk0Var.w.l()) {
                return true;
            }
        }
        return false;
    }

    public final void m() {
        if (this.p < 1) {
            return;
        }
        for (a.gk0 gk0Var : (Iterable<a.gk0>) this.c.f()) {
            if (gk0Var != null && !gk0Var.B) {
                gk0Var.w.m();
            }
        }
    }

    public final void n(a.gk0 gk0Var) {
        if (gk0Var != null) {
            if (gk0Var.equals(this.c.b(gk0Var.h))) {
                gk0Var.u.getClass();
                boolean E = E(gk0Var);
                java.lang.Boolean bool = gk0Var.m;
                if (bool == null || bool.booleanValue() != E) {
                    gk0Var.m = java.lang.Boolean.valueOf(E);
                    a.bm0 bm0Var = gk0Var.w;
                    bm0Var.V();
                    bm0Var.n(bm0Var.t);
                }
            }
        }
    }

    public final boolean o() {
        boolean z = false;
        if (this.p < 1) {
            return false;
        }
        for (a.gk0 gk0Var : (Iterable<a.gk0>) this.c.f()) {
            if (gk0Var != null && D(gk0Var) && gk0Var.J()) {
                z = true;
            }
        }
        return z;
    }

    public final void p(int i) {
        try {
            this.b = true;
            for (androidx.fragment.app.a aVar : (Iterable<androidx.fragment.app.a>) this.c.b.values()) {
                if (aVar != null) {
                    aVar.e = i;
                }
            }
            G(i, false);
            java.util.Iterator it = e().iterator();
            while (it.hasNext()) {
                ((a.ji1) it.next()).e();
            }
            this.b = false;
            u(true);
        } catch (java.lang.Throwable th) {
            this.b = false;
            throw th;
        }
    }

    public final void q() {
        if (this.E) {
            this.E = false;
            U();
        }
    }

    public final void r(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        int size;
        int size2;
        java.lang.String e = a.ii1.e(str, "    ");
        a.dn0 dn0Var = this.c;
        dn0Var.getClass();
        java.lang.String str2 = str + "    ";
        java.util.HashMap hashMap = dn0Var.b;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (androidx.fragment.app.a aVar : (Iterable<androidx.fragment.app.a>) hashMap.values()) {
                printWriter.print(str);
                if (aVar != null) {
                    a.gk0 gk0Var = aVar.c;
                    printWriter.println(gk0Var);
                    gk0Var.b(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        java.util.ArrayList arrayList = dn0Var.f101a;
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size3; i++) {
                a.gk0 gk0Var2 = (a.gk0) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(gk0Var2.toString());
            }
        }
        java.util.ArrayList arrayList2 = this.e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                a.gk0 gk0Var3 = (a.gk0) this.e.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(gk0Var3.toString());
            }
        }
        java.util.ArrayList arrayList3 = this.d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                a.cq cqVar = (a.cq) this.d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(cqVar.toString());
                cqVar.f(e, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.i.get());
        synchronized (this.f18a) {
            try {
                int size4 = this.f18a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i4 = 0; i4 < size4; i4++) {
                        java.lang.Object obj = (a.yl0) this.f18a.get(i4);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i4);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.q);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.r);
        if (this.s != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.s);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.p);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.B);
        printWriter.print(" mStopped=");
        printWriter.print(this.C);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.D);
        if (this.A) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.A);
        }
    }

    public final void s(a.yl0 yl0Var, boolean z) {
        if (!z) {
            if (this.q == null) {
                if (!this.D) {
                    throw new java.lang.IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new java.lang.IllegalStateException("FragmentManager has been destroyed");
            }
            if (this.B || this.C) {
                throw new java.lang.IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f18a) {
            try {
                if (this.q == null) {
                    if (!z) {
                        throw new java.lang.IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f18a.add(yl0Var);
                    O();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void t(boolean z) {
        if (this.b) {
            throw new java.lang.IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.q == null) {
            if (!this.D) {
                throw new java.lang.IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new java.lang.IllegalStateException("FragmentManager has been destroyed");
        }
        if (android.os.Looper.myLooper() != this.q.Y.getLooper()) {
            throw new java.lang.IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z && (this.B || this.C)) {
            throw new java.lang.IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.F == null) {
            this.F = new java.util.ArrayList();
            this.G = new java.util.ArrayList();
        }
        this.b = false;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        sb.append(" in ");
        a.gk0 gk0Var = this.s;
        if (gk0Var != null) {
            sb.append(gk0Var.getClass().getSimpleName());
            sb.append("{");
            sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this.s)));
            sb.append("}");
        } else {
            a.jk0 jk0Var = this.q;
            if (jk0Var != null) {
                sb.append(jk0Var.getClass().getSimpleName());
                sb.append("{");
                sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this.q)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final boolean u(boolean z) {
        t(z);
        boolean z2 = false;
        while (true) {
            java.util.ArrayList arrayList = this.F;
            java.util.ArrayList arrayList2 = this.G;
            synchronized (this.f18a) {
                try {
                    if (this.f18a.isEmpty()) {
                        break;
                    }
                    int size = this.f18a.size();
                    boolean z3 = false;
                    for (int i = 0; i < size; i++) {
                        z3 |= ((a.yl0) this.f18a.get(i)).a(arrayList, arrayList2);
                    }
                    this.f18a.clear();
                    this.q.Y.removeCallbacks(this.J);
                    if (!z3) {
                        break;
                    }
                    z2 = true;
                    this.b = true;
                    try {
                        L(this.F, this.G);
                    } finally {
                        d();
                    }
                } finally {
                }
            }
        }
        V();
        q();
        this.c.b.values().removeAll(java.util.Collections.singleton(null));
        return z2;
    }

    public final void v(java.util.ArrayList arrayList, java.util.ArrayList arrayList2, int i, int i2) {
        android.view.ViewGroup viewGroup;
        a.dn0 dn0Var;
        a.dn0 dn0Var2;
        a.dn0 dn0Var3;
        int i3;
        int i4;
        java.util.ArrayList arrayList3 = arrayList2;
        boolean z = ((a.cq) arrayList.get(i)).o;
        java.util.ArrayList arrayList4 = this.H;
        if (arrayList4 == null) {
            this.H = new java.util.ArrayList();
        } else {
            arrayList4.clear();
        }
        java.util.ArrayList arrayList5 = this.H;
        a.dn0 dn0Var4 = this.c;
        arrayList5.addAll(dn0Var4.f());
        a.gk0 gk0Var = this.t;
        int i5 = i;
        boolean z2 = false;
        while (true) {
            int i6 = 1;
            if (i5 >= i2) {
                a.dn0 dn0Var5 = dn0Var4;
                this.H.clear();
                if (!z && this.p >= 1) {
                    for (int i7 = i; i7 < i2; i7++) {
                        java.util.Iterator it = ((a.cq) arrayList.get(i7)).f77a.iterator();
                        while (it.hasNext()) {
                            a.gk0 gk0Var2 = ((a.en0) it.next()).b;
                            if (gk0Var2 == null || gk0Var2.u == null) {
                                dn0Var = dn0Var5;
                            } else {
                                dn0Var = dn0Var5;
                                dn0Var.g(f(gk0Var2));
                            }
                            dn0Var5 = dn0Var;
                        }
                    }
                }
                for (int i8 = i; i8 < i2; i8++) {
                    a.cq cqVar = (a.cq) arrayList.get(i8);
                    if (((java.lang.Boolean) arrayList2.get(i8)).booleanValue()) {
                        cqVar.c(-1);
                        cqVar.h();
                    } else {
                        cqVar.c(1);
                        cqVar.g();
                    }
                }
                boolean booleanValue = ((java.lang.Boolean) arrayList2.get(i2 - 1)).booleanValue();
                for (int i9 = i; i9 < i2; i9++) {
                    a.cq cqVar2 = (a.cq) arrayList.get(i9);
                    if (booleanValue) {
                        for (int size = cqVar2.f77a.size() - 1; size >= 0; size--) {
                            a.gk0 gk0Var3 = ((a.en0) cqVar2.f77a.get(size)).b;
                            if (gk0Var3 != null) {
                                f(gk0Var3).k();
                            }
                        }
                    } else {
                        java.util.Iterator it2 = cqVar2.f77a.iterator();
                        while (it2.hasNext()) {
                            a.gk0 gk0Var4 = ((a.en0) it2.next()).b;
                            if (gk0Var4 != null) {
                                f(gk0Var4).k();
                            }
                        }
                    }
                }
                G(this.p, true);
                java.util.HashSet hashSet = new java.util.HashSet();
                for (int i10 = i; i10 < i2; i10++) {
                    java.util.Iterator it3 = ((a.cq) arrayList.get(i10)).f77a.iterator();
                    while (it3.hasNext()) {
                        a.gk0 gk0Var5 = ((a.en0) it3.next()).b;
                        if (gk0Var5 != null && (viewGroup = gk0Var5.G) != null) {
                            hashSet.add(a.ji1.f(viewGroup, A()));
                        }
                    }
                }
                java.util.Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    a.ji1 ji1Var = (a.ji1) it4.next();
                    ji1Var.d = booleanValue;
                    ji1Var.g();
                    ji1Var.c();
                }
                for (int i11 = i; i11 < i2; i11++) {
                    a.cq cqVar3 = (a.cq) arrayList.get(i11);
                    if (((java.lang.Boolean) arrayList2.get(i11)).booleanValue() && cqVar3.r >= 0) {
                        cqVar3.r = -1;
                    }
                    cqVar3.getClass();
                }
                if (!z2 || this.k == null) {
                    return;
                }
                for (int i12 = 0; i12 < this.k.size(); i12++) {
                    a.gb gbVar = (a.gb) this.k.get(i12);
                    gbVar.getClass();
                    a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityMain.i;
                    a.qo0 qo0Var = gbVar.f174a;
                    a.wv.w(qo0Var, "$tmp0");
                    qo0Var.b();
                }
                return;
            }
            a.cq cqVar4 = (a.cq) arrayList.get(i5);
            if (((java.lang.Boolean) arrayList3.get(i5)).booleanValue()) {
                dn0Var2 = dn0Var4;
                int i13 = 1;
                java.util.ArrayList arrayList6 = this.H;
                int size2 = cqVar4.f77a.size() - 1;
                while (size2 >= 0) {
                    a.en0 en0Var = (a.en0) cqVar4.f77a.get(size2);
                    int i14 = en0Var.f129a;
                    if (i14 != i13) {
                        if (i14 != 3) {
                            switch (i14) {
                                case 8:
                                    gk0Var = null;
                                    break;
                                case 9:
                                    gk0Var = en0Var.b;
                                    break;
                                case 10:
                                    en0Var.h = en0Var.g;
                                    break;
                            }
                            size2--;
                            i13 = 1;
                        }
                        arrayList6.add(en0Var.b);
                        size2--;
                        i13 = 1;
                    }
                    arrayList6.remove(en0Var.b);
                    size2--;
                    i13 = 1;
                }
            } else {
                java.util.ArrayList arrayList7 = this.H;
                int i15 = 0;
                while (i15 < cqVar4.f77a.size()) {
                    a.en0 en0Var2 = (a.en0) cqVar4.f77a.get(i15);
                    int i16 = en0Var2.f129a;
                    if (i16 == i6) {
                        dn0Var3 = dn0Var4;
                        i3 = i6;
                    } else if (i16 != 2) {
                        if (i16 == 3 || i16 == 6) {
                            arrayList7.remove(en0Var2.b);
                            a.gk0 gk0Var6 = en0Var2.b;
                            if (gk0Var6 == gk0Var) {
                                cqVar4.f77a.add(i15, new a.en0(9, gk0Var6));
                                i15++;
                                dn0Var3 = dn0Var4;
                                i3 = 1;
                                gk0Var = null;
                                i15 += i3;
                                i6 = i3;
                                dn0Var4 = dn0Var3;
                            }
                        } else if (i16 == 7) {
                            dn0Var3 = dn0Var4;
                            i3 = 1;
                        } else if (i16 == 8) {
                            cqVar4.f77a.add(i15, new a.en0(9, gk0Var));
                            i15++;
                            gk0Var = en0Var2.b;
                        }
                        dn0Var3 = dn0Var4;
                        i3 = 1;
                        i15 += i3;
                        i6 = i3;
                        dn0Var4 = dn0Var3;
                    } else {
                        a.gk0 gk0Var7 = en0Var2.b;
                        int i17 = gk0Var7.z;
                        int size3 = arrayList7.size() - 1;
                        boolean z3 = false;
                        while (size3 >= 0) {
                            a.gk0 gk0Var8 = (a.gk0) arrayList7.get(size3);
                            a.dn0 dn0Var6 = dn0Var4;
                            if (gk0Var8.z != i17) {
                                i4 = i17;
                            } else if (gk0Var8 == gk0Var7) {
                                i4 = i17;
                                z3 = true;
                            } else {
                                if (gk0Var8 == gk0Var) {
                                    i4 = i17;
                                    cqVar4.f77a.add(i15, new a.en0(9, gk0Var8));
                                    i15++;
                                    gk0Var = null;
                                } else {
                                    i4 = i17;
                                }
                                a.en0 en0Var3 = new a.en0(3, gk0Var8);
                                en0Var3.c = en0Var2.c;
                                en0Var3.e = en0Var2.e;
                                en0Var3.d = en0Var2.d;
                                en0Var3.f = en0Var2.f;
                                cqVar4.f77a.add(i15, en0Var3);
                                arrayList7.remove(gk0Var8);
                                i15++;
                            }
                            size3--;
                            dn0Var4 = dn0Var6;
                            i17 = i4;
                        }
                        dn0Var3 = dn0Var4;
                        if (z3) {
                            cqVar4.f77a.remove(i15);
                            i15--;
                            i3 = 1;
                            i15 += i3;
                            i6 = i3;
                            dn0Var4 = dn0Var3;
                        } else {
                            i3 = 1;
                            en0Var2.f129a = 1;
                            arrayList7.add(gk0Var7);
                            i15 += i3;
                            i6 = i3;
                            dn0Var4 = dn0Var3;
                        }
                    }
                    arrayList7.add(en0Var2.b);
                    i15 += i3;
                    i6 = i3;
                    dn0Var4 = dn0Var3;
                }
                dn0Var2 = dn0Var4;
            }
            z2 = z2 || cqVar4.g;
            i5++;
            arrayList3 = arrayList2;
            dn0Var4 = dn0Var2;
        }
    }

    public final a.gk0 w(int i) {
        a.dn0 dn0Var = this.c;
        java.util.ArrayList arrayList = dn0Var.f101a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a.gk0 gk0Var = (a.gk0) arrayList.get(size);
            if (gk0Var != null && gk0Var.y == i) {
                return gk0Var;
            }
        }
        for (androidx.fragment.app.a aVar : (Iterable<androidx.fragment.app.a>) dn0Var.b.values()) {
            if (aVar != null) {
                a.gk0 gk0Var2 = aVar.c;
                if (gk0Var2.y == i) {
                    return gk0Var2;
                }
            }
        }
        return null;
    }

    public final a.gk0 x(java.lang.String str) {
        a.dn0 dn0Var = this.c;
        if (str != null) {
            java.util.ArrayList arrayList = dn0Var.f101a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                a.gk0 gk0Var = (a.gk0) arrayList.get(size);
                if (gk0Var != null && str.equals(gk0Var.A)) {
                    return gk0Var;
                }
            }
        }
        if (str != null) {
            for (androidx.fragment.app.a aVar : (Iterable<androidx.fragment.app.a>) dn0Var.b.values()) {
                if (aVar != null) {
                    a.gk0 gk0Var2 = aVar.c;
                    if (str.equals(gk0Var2.A)) {
                        return gk0Var2;
                    }
                }
            }
        } else {
            dn0Var.getClass();
        }
        return null;
    }

    public final android.view.ViewGroup y(a.gk0 gk0Var) {
        android.view.ViewGroup viewGroup = gk0Var.G;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (gk0Var.z > 0 && this.r.W0()) {
            android.view.View V0 = this.r.V0(gk0Var.z);
            if (V0 instanceof android.view.ViewGroup) {
                return (android.view.ViewGroup) V0;
            }
        }
        return null;
    }

    public final a.ul0 z() {
        a.gk0 gk0Var = this.s;
        return gk0Var != null ? gk0Var.u.z() : this.u;
    }
}
