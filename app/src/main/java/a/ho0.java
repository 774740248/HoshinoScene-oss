package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ho0 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ a.jo0 g;
    public final /* synthetic */ com.omarea.model.LoginResponse h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ho0(a.jo0 jo0Var, com.omarea.model.LoginResponse loginResponse, a.ey eyVar) {
        super(2, eyVar);
        this.g = jo0Var;
        this.h = loginResponse;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.ho0(this.g, this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        a.gu0[] gu0VarArr = a.jo0.v0;
        a.jo0 jo0Var = this.g;
        jo0Var.U().a();
        com.omarea.model.LoginResponse loginResponse = this.h;
        if (loginResponse == null) {
            a.cp cpVar = com.omarea.Scene.c;
            java.lang.String m = jo0Var.m(2131953691);
            a.wv.v(m, "getString(R.string.user_not_response)");
            a.fs1.X(m, 0);
        } else if (loginResponse.getPass()) {
            a.cp cpVar2 = com.omarea.Scene.c;
            a.fs1.D().edit().remove("user_name").apply();
            if (jo0Var.C) {
                java.lang.String m2 = jo0Var.m(2131953688);
                a.wv.v(m2, "getString(R.string.user_log_out_ok)");
                a.fs1.X(m2, 0);
            } else {
                jo0Var.Y();
            }
        } else {
            a.cp cpVar3 = com.omarea.Scene.c;
            a.fs1.X(jo0Var.m(2131953718) + " " + loginResponse.getError(), 0);
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.ho0 ho0Var = (a.ho0) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        ho0Var.e(no1Var);
        return no1Var;
    }
}
