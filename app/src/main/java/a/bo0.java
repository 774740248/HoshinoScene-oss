package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class bo0 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ a.jo0 g;
    public final /* synthetic */ com.omarea.model.AccountPointsResponse h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bo0(a.jo0 jo0Var, com.omarea.model.AccountPointsResponse accountPointsResponse, a.ey eyVar) {
        super(2, eyVar);
        this.g = jo0Var;
        this.h = accountPointsResponse;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.bo0(this.g, this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        a.jo0 jo0Var = this.g;
        boolean z = jo0Var.C;
        com.omarea.model.AccountPointsResponse accountPointsResponse = this.h;
        if (!z) {
            a.gu0[] gu0VarArr = a.jo0.v0;
            jo0Var.V().setText(jo0Var.m(2131953698) + (accountPointsResponse != null ? new java.lang.Integer(accountPointsResponse.getFree()) : null));
        }
        if (accountPointsResponse != null && accountPointsResponse.getUnbind()) {
            a.cp cpVar = com.omarea.Scene.c;
            a.fs1.D().edit().remove("user_name").apply();
            ((android.widget.TextView) jo0Var.k0.a(a.jo0.v0[14])).setText(jo0Var.m(2131953719));
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.bo0 bo0Var = (a.bo0) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        bo0Var.e(no1Var);
        return no1Var;
    }
}
