package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ol0 extends a.uu0 implements a.qo0 {
    public final /* synthetic */ a.pl0 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ a.jz0 f;
    public final /* synthetic */ long g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ol0(a.pl0 pl0Var, long j, a.jz0 jz0Var, long j2) {
        super(0);
        this.d = pl0Var;
        this.e = j;
        this.f = jz0Var;
        this.g = j2;
    }

    @Override // a.qo0
    public final java.lang.Object b() {
        int i = a.x60.f681a;
        android.content.Context L = this.d.L();
        a.q10 q10Var = a.q10.f457a;
        java.lang.String t = a.q10.t();
        java.util.Locale locale = java.util.Locale.ENGLISH;
        a.wv.v(locale, "ENGLISH");
        java.lang.String upperCase = t.toUpperCase(locale);
        a.wv.v(upperCase, "this as java.lang.String).toUpperCase(locale)");
        a.jz0 jz0Var = this.f;
        int i2 = jz0Var.d;
        int i3 = jz0Var.e / 1024;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Used(Maybe) =\n                                    |(\n                                    |   MemTotal + SwapTotal\n                                    |    - MemAvailable\n                                    |    - SwapFree\n                                    |) / MemTotal\n                                    |\n                                    |(\n                                    |   ");
        long j = this.e;
        sb.append(j);
        sb.append(" + ");
        sb.append(i2);
        sb.append("\n                                    |    - ");
        sb.append(this.g);
        sb.append("\n                                    |    - ");
        sb.append(i3);
        sb.append("\n                                    |) / ");
        sb.append(j);
        sb.append("\n                                    |");
        a.fs1.F(L, upperCase, a.wv.O1(sb.toString()), null);
        return a.no1.f387a;
    }
}
