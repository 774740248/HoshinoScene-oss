package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class iu extends a.lj1 implements a.fp0 {
    public final /* synthetic */ a.lu g;
    public final /* synthetic */ java.lang.String h;
    public final /* synthetic */ java.lang.String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iu(a.lu luVar, java.lang.String str, java.lang.String str2, a.ey eyVar) {
        super(2, eyVar);
        this.g = luVar;
        this.h = str;
        this.i = str2;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.iu(this.g, this.h, this.i, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        java.lang.String str = a.q10.v;
        java.lang.String s0 = a.wv.s0(false);
        int i = a.x60.f681a;
        a.lu luVar = this.g;
        android.content.Context context = luVar.f331a;
        java.lang.String string = context.getString(2131952227);
        a.wv.v(string, "context.getString(R.string.error_root)");
        java.lang.String str2 = "Current Mode: " + this.h + "\nSU CMD: " + s0 + "\nCurrent User: " + this.i + "\n\nLogs:\n" + str;
        java.lang.String string2 = luVar.f331a.getString(2131952077);
        a.wv.v(string2, "context.getString(R.string.btn_confirm)");
        a.u60 u60Var = new a.u60(string2, luVar.c, 4);
        java.lang.String string3 = luVar.f331a.getString(2131953612);
        a.wv.v(string3, "context.getString(R.string.switch_root_cmd)");
        a.v60 f = a.fs1.f(context, string, str2, u60Var, new a.u60(string3, new a.fw(17, luVar), 4));
        f.b(false);
        return f;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.iu) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
