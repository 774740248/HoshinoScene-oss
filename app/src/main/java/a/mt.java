package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class mt extends a.ws1 {
    public final java.util.ArrayList k;
    public int l;

    public mt(a.ix ixVar, int i) {
        super(ixVar);
        a.ix ixVar2;
        this.k = new java.util.ArrayList();
        this.f = i;
        a.ix ixVar3 = this.b;
        a.ix l = ixVar3.l(i);
        while (true) {
            a.ix ixVar4 = l;
            ixVar2 = ixVar3;
            ixVar3 = ixVar4;
            if (ixVar3 == null) {
                break;
            } else {
                l = ixVar3.l(this.f);
            }
        }
        this.b = ixVar2;
        int i2 = this.f;
        a.i30 i30Var = i2 == 0 ? ixVar2.d : i2 == 1 ? ixVar2.e : null;
        java.util.ArrayList arrayList = this.k;
        arrayList.add(i30Var);
        a.ix k = ixVar2.k(this.f);
        while (k != null) {
            int i3 = this.f;
            arrayList.add(i3 == 0 ? k.d : i3 == 1 ? k.e : null);
            k = k.k(this.f);
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a.ws1 ws1Var = (a.ws1) it.next();
            int i4 = this.f;
            if (i4 == 0) {
                ws1Var.b.b = this;
            } else if (i4 == 1) {
                ws1Var.b.c = this;
            }
        }
        if (this.f == 0 && ((a.jx) this.b.I).h0 && arrayList.size() > 1) {
            this.b = ((a.ws1) arrayList.get(arrayList.size() - 1)).b;
        }
        this.l = this.f == 0 ? this.b.X : this.b.Y;
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x01a0, code lost:
    
        if (r2 != r3) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01c5, code lost:
    
        r1.d(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01c2, code lost:
    
        r13 = r13 + 1;
        r3 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01c0, code lost:
    
        if (r2 != r3) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x03c8, code lost:
    
        r2 = r2 - r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00dc  */
    @Override // a.i30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(a.i30 r27) {
        /*
            Method dump skipped, instructions count: 999
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.mt.a(a.i30):void");
    }

    @Override // a.ws1
    public final void d() {
        java.util.ArrayList arrayList = this.k;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((a.ws1) it.next()).d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        a.ix ixVar = ((a.ws1) arrayList.get(0)).b;
        a.ix ixVar2 = ((a.ws1) arrayList.get(size - 1)).b;
        int i = this.f;
        a.k30 k30Var = this.i;
        a.k30 k30Var2 = this.h;
        if (i == 0) {
            a.uw uwVar = ixVar.x;
            a.uw uwVar2 = ixVar2.z;
            a.k30 i2 = a.ws1.i(uwVar, 0);
            int c = uwVar.c();
            a.ix m = m();
            if (m != null) {
                c = m.x.c();
            }
            if (i2 != null) {
                a.ws1.b(k30Var2, i2, c);
            }
            a.k30 i3 = a.ws1.i(uwVar2, 0);
            int c2 = uwVar2.c();
            a.ix n = n();
            if (n != null) {
                c2 = n.z.c();
            }
            if (i3 != null) {
                a.ws1.b(k30Var, i3, -c2);
            }
        } else {
            a.uw uwVar3 = ixVar.y;
            a.uw uwVar4 = ixVar2.A;
            a.k30 i4 = a.ws1.i(uwVar3, 1);
            int c3 = uwVar3.c();
            a.ix m2 = m();
            if (m2 != null) {
                c3 = m2.y.c();
            }
            if (i4 != null) {
                a.ws1.b(k30Var2, i4, c3);
            }
            a.k30 i5 = a.ws1.i(uwVar4, 1);
            int c4 = uwVar4.c();
            a.ix n2 = n();
            if (n2 != null) {
                c4 = n2.A.c();
            }
            if (i5 != null) {
                a.ws1.b(k30Var, i5, -c4);
            }
        }
        k30Var2.f279a = this;
        k30Var.f279a = this;
    }

    @Override // a.ws1
    public final void e() {
        int i = 0;
        while (true) {
            java.util.ArrayList arrayList = this.k;
            if (i >= arrayList.size()) {
                return;
            }
            ((a.ws1) arrayList.get(i)).e();
            i++;
        }
    }

    @Override // a.ws1
    public final void f() {
        this.c = null;
        java.util.Iterator it = this.k.iterator();
        while (it.hasNext()) {
            ((a.ws1) it.next()).f();
        }
    }

    @Override // a.ws1
    public final long j() {
        java.util.ArrayList arrayList = this.k;
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            j = r5.i.f + ((a.ws1) arrayList.get(i)).j() + j + r5.h.f;
        }
        return j;
    }

    @Override // a.ws1
    public final boolean k() {
        java.util.ArrayList arrayList = this.k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((a.ws1) arrayList.get(i)).k()) {
                return false;
            }
        }
        return true;
    }

    public final a.ix m() {
        int i = 0;
        while (true) {
            java.util.ArrayList arrayList = this.k;
            if (i >= arrayList.size()) {
                return null;
            }
            a.ix ixVar = ((a.ws1) arrayList.get(i)).b;
            if (ixVar.V != 8) {
                return ixVar;
            }
            i++;
        }
    }

    public final a.ix n() {
        java.util.ArrayList arrayList = this.k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a.ix ixVar = ((a.ws1) arrayList.get(size)).b;
            if (ixVar.V != 8) {
                return ixVar;
            }
        }
        return null;
    }

    public final java.lang.String toString() {
        java.lang.String concat = "ChainRun ".concat(this.f == 0 ? "horizontal : " : "vertical : ");
        java.util.Iterator it = this.k.iterator();
        while (it.hasNext()) {
            a.ws1 ws1Var = (a.ws1) it.next();
            concat = a.ii1.e(a.ii1.e(concat, "<") + ws1Var, "> ");
        }
        return concat;
    }
}
