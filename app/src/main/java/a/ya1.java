package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ya1 extends a.uu0 implements a.qo0 {
    public final /* synthetic */ a.ab1 d;
    public final /* synthetic */ java.lang.CharSequence e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ya1(a.ab1 ab1Var, java.lang.CharSequence charSequence, int i) {
        super(0);
        this.d = ab1Var;
        this.e = charSequence;
        this.f = i;
    }

    @Override // a.qo0
    public final java.lang.Object b() {
        return this.d.a(this.f, this.e);
    }
}
