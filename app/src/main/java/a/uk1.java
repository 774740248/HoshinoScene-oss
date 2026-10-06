package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class uk1 {

    public uk1(uk1 p0) {
        this.f600a = p0;
    }

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f600a;

    public abstract boolean a();

    public abstract a.uh1 b(java.lang.String str);

    public abstract boolean c();

    public abstract java.lang.String d();

    public final boolean e(java.lang.CharSequence charSequence, int i) {
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            throw new java.lang.IllegalArgumentException();
        }
        a.tk1 tk1Var = (a.tk1) this.f600a;
        if (tk1Var == null) {
            return c();
        }
        int c = tk1Var.c(charSequence, i);
        if (c == 0) {
            return true;
        }
        if (c != 1) {
            return c();
        }
        return false;
    }

    public abstract a.uk1[] f();
}
