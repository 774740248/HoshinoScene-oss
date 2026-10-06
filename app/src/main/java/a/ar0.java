package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ar0 extends a.ws1 {
    public ar0(a.ix ixVar) {
        super(ixVar);
    }

    @Override // a.i30
    public final void a(a.i30 i30Var) {
        a.k30 k30Var = this.h;
        if (k30Var.c && !k30Var.j) {
            k30Var.d((int) ((((a.k30) k30Var.l.get(0)).g * ((a.zq0) this.b).d0) + 0.5f));
        }
    }

    @Override // a.ws1
    public final void d() {
        a.ix ixVar = this.b;
        a.zq0 zq0Var = (a.zq0) ixVar;
        int i = zq0Var.e0;
        int i2 = zq0Var.f0;
        int i3 = zq0Var.h0;
        a.k30 k30Var = this.h;
        if (i3 == 1) {
            if (i != -1) {
                k30Var.l.add(ixVar.I.d.h);
                this.b.I.d.h.k.add(k30Var);
                k30Var.f = i;
            } else if (i2 != -1) {
                k30Var.l.add(ixVar.I.d.i);
                this.b.I.d.i.k.add(k30Var);
                k30Var.f = -i2;
            } else {
                k30Var.b = true;
                k30Var.l.add(ixVar.I.d.i);
                this.b.I.d.i.k.add(k30Var);
            }
            m(this.b.d.h);
            m(this.b.d.i);
            return;
        }
        if (i != -1) {
            k30Var.l.add(ixVar.I.e.h);
            this.b.I.e.h.k.add(k30Var);
            k30Var.f = i;
        } else if (i2 != -1) {
            k30Var.l.add(ixVar.I.e.i);
            this.b.I.e.i.k.add(k30Var);
            k30Var.f = -i2;
        } else {
            k30Var.b = true;
            k30Var.l.add(ixVar.I.e.i);
            this.b.I.e.i.k.add(k30Var);
        }
        m(this.b.e.h);
        m(this.b.e.i);
    }

    @Override // a.ws1
    public final void e() {
        a.ix ixVar = this.b;
        int i = ((a.zq0) ixVar).h0;
        a.k30 k30Var = this.h;
        if (i == 1) {
            ixVar.N = k30Var.g;
        } else {
            ixVar.O = k30Var.g;
        }
    }

    @Override // a.ws1
    public final void f() {
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
