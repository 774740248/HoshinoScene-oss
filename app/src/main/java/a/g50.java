package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class g50 extends a.lj1 implements a.fp0 {
    public com.omarea.model.ActivationCodeResponse g;
    public java.lang.String h;
    public int i;
    public final /* synthetic */ a.i50 j;
    public final /* synthetic */ java.lang.String k;
    public final /* synthetic */ boolean l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g50(a.i50 i50Var, java.lang.String str, boolean z, a.ey eyVar) {
        super(2, eyVar);
        this.j = i50Var;
        this.k = str;
        this.l = z;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.g50(this.j, this.k, this.l, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        com.omarea.model.ActivationCodeResponse o;
        java.lang.String str;
        a.dz dzVar = a.dz.c;
        int i = this.i;
        boolean z = this.l;
        a.i50 i50Var = this.j;
        if (i == 0) {
            a.b20.q1(obj);
            android.content.Context applicationContext = i50Var.f225a.getApplicationContext();
            a.wv.v(applicationContext, "activity.applicationContext");
            o = new a.kf1(applicationContext).o();
            i50Var.e(false);
            if (o != null) {
                i50Var.e(false);
                if (o.getPass()) {
                    java.lang.String codeStr = o.getCodeStr();
                    a.b20.e1(codeStr);
                    a.b20.f1(o.getType());
                    java.lang.String account = o.getAccount();
                    if (account.length() == 0) {
                        account = null;
                    }
                    a.b20.m1("user_name", account);
                    if (!a.wv.e(codeStr, this.k)) {
                        a.q10 q10Var = a.q10.f457a;
                        if (a.yi1.g2(a.q10.g(codeStr), "success")) {
                            a.a3 a3Var = new a.a3(i50Var.f225a);
                            this.g = o;
                            this.h = codeStr;
                            this.i = 1;
                            if (a3Var.a(null, this) == dzVar) {
                                return dzVar;
                            }
                            str = codeStr;
                        }
                    }
                    if (!z) {
                        a.cp cpVar = com.omarea.Scene.c;
                        a.fs1.L(new a.b50(i50Var, 6));
                    }
                }
            } else {
                a.cp cpVar2 = com.omarea.Scene.c;
                java.lang.String string = a.fs1.t().getString(2131952790);
                a.wv.v(string, "Scene.context.getString(…ring.license_no_response)");
                a.fs1.X(string, 0);
            }
            return a.no1.f387a;
        }
        if (i != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str = this.h;
        o = this.g;
        a.b20.q1(obj);
        if (!z) {
            a.cp cpVar3 = com.omarea.Scene.c;
            a.fs1.L(new a.b50(i50Var, 5));
        }
        a.cp cpVar4 = com.omarea.Scene.c;
        a.fs1.L(new a.ua0(i50Var, str, o, 23));
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.g50) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
