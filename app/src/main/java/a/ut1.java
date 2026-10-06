package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class ut1 {

    /* renamed from: a, reason: collision with root package name */
    public final a.du1 f607a;
    public a.ns0[] b;

    public ut1() {
        this(new a.du1());
    }

    public final void a() {
        a.ns0[] ns0VarArr = this.b;
        if (ns0VarArr != null) {
            a.ns0 ns0Var = ns0VarArr[a.wv.y0(1)];
            a.ns0 ns0Var2 = this.b[a.wv.y0(2)];
            a.du1 du1Var = this.f607a;
            if (ns0Var2 == null) {
                ns0Var2 = du1Var.f107a.f(2);
            }
            if (ns0Var == null) {
                ns0Var = du1Var.f107a.f(1);
            }
            g(a.ns0.a(ns0Var, ns0Var2));
            a.ns0 ns0Var3 = this.b[a.wv.y0(16)];
            if (ns0Var3 != null) {
                f(ns0Var3);
            }
            a.ns0 ns0Var4 = this.b[a.wv.y0(32)];
            if (ns0Var4 != null) {
                d(ns0Var4);
            }
            a.ns0 ns0Var5 = this.b[a.wv.y0(64)];
            if (ns0Var5 != null) {
                h(ns0Var5);
            }
        }
    }

    public abstract a.du1 b();

    public void c(int i, a.ns0 ns0Var) {
        if (this.b == null) {
            this.b = new a.ns0[9];
        }
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.b[a.wv.y0(i2)] = ns0Var;
            }
        }
    }

    public void d(a.ns0 ns0Var) {
    }

    public abstract void e(a.ns0 ns0Var);

    public void f(a.ns0 ns0Var) {
    }

    public abstract void g(a.ns0 ns0Var);

    public void h(a.ns0 ns0Var) {
    }

    public ut1(a.du1 du1Var) {
        this.f607a = du1Var;
    }
}
