package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class jr0 extends a.ws1 {
    public jr0(a.ix ixVar) {
        super(ixVar);
    }

    @Override // a.i30
    public final void a(a.i30 i30Var) {
        a.hq hqVar = (a.hq) this.b;
        int i = hqVar.f0;
        a.k30 k30Var = this.h;
        java.util.Iterator it = k30Var.l.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((a.k30) it.next()).g;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            k30Var.d(i3 + hqVar.h0);
        } else {
            k30Var.d(i2 + hqVar.h0);
        }
    }

    @Override // a.ws1
    public final void d() {
        a.ix ixVar = this.b;
        if (ixVar instanceof a.hq) {
            a.k30 k30Var = this.h;
            k30Var.b = true;
            a.hq hqVar = (a.hq) ixVar;
            int i = hqVar.f0;
            boolean z = hqVar.g0;
            int i2 = 0;
            if (i == 0) {
                k30Var.e = 4;
                while (i2 < hqVar.e0) {
                    a.ix ixVar2 = hqVar.d0[i2];
                    if (z || ixVar2.V != 8) {
                        a.k30 k30Var2 = ixVar2.d.h;
                        k30Var2.k.add(k30Var);
                        k30Var.l.add(k30Var2);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
                return;
            }
            if (i == 1) {
                k30Var.e = 5;
                while (i2 < hqVar.e0) {
                    a.ix ixVar3 = hqVar.d0[i2];
                    if (z || ixVar3.V != 8) {
                        a.k30 k30Var3 = ixVar3.d.i;
                        k30Var3.k.add(k30Var);
                        k30Var.l.add(k30Var3);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
                return;
            }
            if (i == 2) {
                k30Var.e = 6;
                while (i2 < hqVar.e0) {
                    a.ix ixVar4 = hqVar.d0[i2];
                    if (z || ixVar4.V != 8) {
                        a.k30 k30Var4 = ixVar4.e.h;
                        k30Var4.k.add(k30Var);
                        k30Var.l.add(k30Var4);
                    }
                    i2++;
                }
                m(this.b.e.h);
                m(this.b.e.i);
                return;
            }
            if (i != 3) {
                return;
            }
            k30Var.e = 7;
            while (i2 < hqVar.e0) {
                a.ix ixVar5 = hqVar.d0[i2];
                if (z || ixVar5.V != 8) {
                    a.k30 k30Var5 = ixVar5.e.i;
                    k30Var5.k.add(k30Var);
                    k30Var.l.add(k30Var5);
                }
                i2++;
            }
            m(this.b.e.h);
            m(this.b.e.i);
        }
    }

    @Override // a.ws1
    public final void e() {
        a.ix ixVar = this.b;
        if (ixVar instanceof a.hq) {
            int i = ((a.hq) ixVar).f0;
            a.k30 k30Var = this.h;
            if (i == 0 || i == 1) {
                ixVar.N = k30Var.g;
            } else {
                ixVar.O = k30Var.g;
            }
        }
    }

    @Override // a.ws1
    public final void f() {
        this.c = null;
        this.h.c();
    }

    @Override // a.ws1
    public final boolean k() {
        return false;
    }

    public final void m(a.k30 k30Var) {
        a.k30 k30Var2 = this.h;
        k30Var2.k.add(k30Var);
        k30Var.l.add(k30Var2);
    }
}
