package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class ws1 implements a.i30 {

    /* renamed from: a, reason: collision with root package name */
    public int f674a;
    public a.ix b;
    public a.sc1 c;
    public int d;
    public final a.v80 e = new a.v80(this);
    public int f = 0;
    public boolean g = false;
    public final a.k30 h = new a.k30(this);
    public final a.k30 i = new a.k30(this);
    public int j = 1;

    public ws1(a.ix ixVar) {
        this.b = ixVar;
    }

    public static void b(a.k30 k30Var, a.k30 k30Var2, int i) {
        k30Var.l.add(k30Var2);
        k30Var.f = i;
        k30Var2.k.add(k30Var);
    }

    public static a.k30 h(a.uw uwVar) {
        a.uw uwVar2 = uwVar.d;
        if (uwVar2 == null) {
            return null;
        }
        int B = a.ai1.B(uwVar2.c);
        a.ix ixVar = uwVar2.b;
        if (B == 1) {
            return ixVar.d.h;
        }
        if (B == 2) {
            return ixVar.e.h;
        }
        if (B == 3) {
            return ixVar.d.i;
        }
        if (B == 4) {
            return ixVar.e.i;
        }
        if (B != 5) {
            return null;
        }
        return ixVar.e.k;
    }

    public static a.k30 i(a.uw uwVar, int i) {
        a.uw uwVar2 = uwVar.d;
        if (uwVar2 == null) {
            return null;
        }
        a.ix ixVar = uwVar2.b;
        a.ws1 ws1Var = i == 0 ? ixVar.d : ixVar.e;
        int B = a.ai1.B(uwVar2.c);
        if (B == 1 || B == 2) {
            return ws1Var.h;
        }
        if (B == 3 || B == 4) {
            return ws1Var.i;
        }
        return null;
    }

    public final void c(a.k30 k30Var, a.k30 k30Var2, int i, a.v80 v80Var) {
        k30Var.l.add(k30Var2);
        k30Var.l.add(this.e);
        k30Var.h = i;
        k30Var.i = v80Var;
        k30Var2.k.add(k30Var);
        v80Var.k.add(k30Var);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i2) {
        int max;
        if (i2 == 0) {
            a.ix ixVar = this.b;
            int i3 = ixVar.n;
            max = java.lang.Math.max(ixVar.m, i);
            if (i3 > 0) {
                max = java.lang.Math.min(i3, i);
            }
            if (max == i) {
                return i;
            }
        } else {
            a.ix ixVar2 = this.b;
            int i4 = ixVar2.q;
            max = java.lang.Math.max(ixVar2.p, i);
            if (i4 > 0) {
                max = java.lang.Math.min(i4, i);
            }
            if (max == i) {
                return i;
            }
        }
        return max;
    }

    public long j() {
        if (this.e.j) {
            return r0.g;
        }
        return 0L;
    }

    public abstract boolean k();

    public final void l(a.uw uwVar, a.uw uwVar2, int i) {
        a.k30 h = h(uwVar);
        a.k30 h2 = h(uwVar2);
        if (h.j && h2.j) {
            int c = uwVar.c() + h.g;
            int c2 = h2.g - uwVar2.c();
            int i2 = c2 - c;
            a.v80 v80Var = this.e;
            if (!v80Var.j && this.d == 3) {
                int i3 = this.f674a;
                if (i3 == 0) {
                    v80Var.d(g(i2, i));
                } else if (i3 == 1) {
                    v80Var.d(java.lang.Math.min(g(v80Var.m, i), i2));
                } else if (i3 == 2) {
                    a.ix ixVar = this.b;
                    a.ix ixVar2 = ixVar.I;
                    if (ixVar2 != null) {
                        if ((i == 0 ? ixVar2.d : ixVar2.e).e.j) {
                            v80Var.d(g((int) ((r6.g * (i == 0 ? ixVar.o : ixVar.r)) + 0.5f), i));
                        }
                    }
                } else if (i3 == 3) {
                    a.ix ixVar3 = this.b;
                    a.ws1 ws1Var = ixVar3.d;
                    int i4 = ws1Var.d;
                    a.ws1 ws1Var2 = ixVar3.e;
                    if (i4 != 3 || ws1Var.f674a != 3 || ws1Var2.d != 3 || ws1Var2.f674a != 3) {
                        if (i == 0) {
                            ws1Var = ws1Var2;
                        }
                        if (ws1Var.e.j) {
                            float f = ixVar3.L;
                            v80Var.d(i == 1 ? (int) ((r6.g / f) + 0.5f) : (int) ((f * r6.g) + 0.5f));
                        }
                    }
                }
            }
            if (v80Var.j) {
                int i5 = v80Var.g;
                a.k30 k30Var = this.i;
                a.k30 k30Var2 = this.h;
                if (i5 == i2) {
                    k30Var2.d(c);
                    k30Var.d(c2);
                    return;
                }
                a.ix ixVar4 = this.b;
                float f2 = i == 0 ? ixVar4.S : ixVar4.T;
                if (h == h2) {
                    c = h.g;
                    c2 = h2.g;
                    f2 = 0.5f;
                }
                k30Var2.d((int) ((((c2 - c) - i5) * f2) + c + 0.5f));
                k30Var.d(k30Var2.g + v80Var.g);
            }
        }
    }
}
