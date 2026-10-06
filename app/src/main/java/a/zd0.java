package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class zd0 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ a.w60 g;
    public final /* synthetic */ java.lang.String h;
    public final /* synthetic */ a.w21 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd0(a.w21 w21Var, a.w60 w60Var, java.lang.String str, a.ey eyVar) {
        super(2, eyVar);
        this.g = w60Var;
        this.h = str;
        this.i = w21Var;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.zd0(this.i, this.g, this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        this.g.a();
        java.lang.String str = this.h;
        if (str == null || str.length() == 0) {
            a.cp cpVar = com.omarea.Scene.c;
            java.lang.String string = this.i.f649a.getString(2131952278);
            a.wv.v(string, "context.getString(R.string.file_open_ok)");
            a.fs1.X(string, 0);
        } else {
            a.cp cpVar2 = com.omarea.Scene.c;
            a.fs1.X(str, 0);
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.zd0 zd0Var = (a.zd0) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        zd0Var.e(no1Var);
        return no1Var;
    }
}
