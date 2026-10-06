package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class au1 {
    public static final a.du1 b;

    /* renamed from: a, reason: collision with root package name */
    public final a.du1 f26a;

    static {
        int i = android.os.Build.VERSION.SDK_INT;
        b = (i >= 30 ? new a.tt1() : i >= 29 ? new a.st1() : new a.qt1()).b().f107a.a().f107a.b().f107a.c();
    }

    public au1(a.du1 du1Var) {
        this.f26a = du1Var;
    }

    public a.du1 a() {
        return this.f26a;
    }

    public a.du1 b() {
        return this.f26a;
    }

    public a.du1 c() {
        return this.f26a;
    }

    public void d(android.view.View view) {
    }

    public a.b90 e() {
        return null;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a.au1)) {
            return false;
        }
        a.au1 au1Var = (a.au1) obj;
        return n() == au1Var.n() && m() == au1Var.m() && a.x21.a(j(), au1Var.j()) && a.x21.a(h(), au1Var.h()) && a.x21.a(e(), au1Var.e());
    }

    public a.ns0 f(int i) {
        return a.ns0.e;
    }

    public a.ns0 g() {
        return j();
    }

    public a.ns0 h() {
        return a.ns0.e;
    }

    public int hashCode() {
        return a.x21.b(java.lang.Boolean.valueOf(n()), java.lang.Boolean.valueOf(m()), j(), h(), e());
    }

    public a.ns0 i() {
        return j();
    }

    public a.ns0 j() {
        return a.ns0.e;
    }

    public a.ns0 k() {
        return j();
    }

    public a.du1 l(int i, int i2, int i3, int i4) {
        return b;
    }

    public boolean m() {
        return false;
    }

    public boolean n() {
        return false;
    }

    public void o(a.ns0[] ns0VarArr) {
    }

    public void p(a.du1 du1Var) {
    }

    public void q(a.ns0 ns0Var) {
    }
}
