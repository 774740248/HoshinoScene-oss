package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class d80 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ a.x01 g;
    public final /* synthetic */ java.lang.String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d80(a.x01 x01Var, java.lang.String str, a.ey eyVar) {
        super(2, eyVar);
        this.g = x01Var;
        this.h = str;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.d80(this.g, this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        ((android.app.Activity) this.g.e).startActivity(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(this.h)));
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.d80 d80Var = (a.d80) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        d80Var.e(no1Var);
        return no1Var;
    }
}
