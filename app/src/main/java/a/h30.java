package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class h30 implements a.qg1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.CharSequence f200a;
    public final int b;
    public final int c;
    public final a.fp0 d;

    public h30(java.lang.CharSequence charSequence, int i, int i2, a.xi1 xi1Var) {
        a.wv.w(charSequence, "input");
        this.f200a = charSequence;
        this.b = i;
        this.c = i2;
        this.d = xi1Var;
    }

    @Override // a.qg1
    public final java.util.Iterator iterator() {
        return new a.g30(this);
    }
}
