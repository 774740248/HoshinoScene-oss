package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class s70 extends a.lj1 implements a.fp0 {
    public java.lang.Throwable g;
    public int h;
    public final /* synthetic */ a.ej1 i;
    public final /* synthetic */ java.lang.String j;
    public final /* synthetic */ java.lang.String k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s70(a.ej1 ej1Var, java.lang.String str, java.lang.String str2, a.ey eyVar) {
        super(2, eyVar);
        this.i = ej1Var;
        this.j = str;
        this.k = str2;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.s70(this.i, this.j, this.k, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        java.lang.String str = this.j;
        a.dz dzVar = a.dz.c;
        int i = this.h;
        a.ej1 ej1Var = this.i;
        try {
            try {
            } catch (java.lang.Exception unused) {
                a.cp cpVar = com.omarea.Scene.c;
                java.lang.String string = ((android.content.Context) ej1Var.d).getString(2131953691);
                a.wv.v(string, "context.getString(R.string.user_not_response)");
                a.fs1.X(string, 0);
                a.u20 u20Var = a.z80.f728a;
                a.zx0 zx0Var = a.by0.f57a;
                a.r70 r70Var = new a.r70(ej1Var, null);
                this.h = 3;
                if (a.wv.S1(zx0Var, r70Var, this) == dzVar) {
                    return dzVar;
                }
            }
            if (i == 0) {
                a.b20.q1(obj);
                com.omarea.model.LoginResponse q = new a.kf1((android.content.Context) ej1Var.d).q(str, this.k);
                if (q == null) {
                    a.cp cpVar2 = com.omarea.Scene.c;
                    java.lang.String string2 = ((android.content.Context) ej1Var.d).getString(2131953691);
                    a.wv.v(string2, "context.getString(R.string.user_not_response)");
                    a.fs1.X(string2, 0);
                } else if (q.getPass()) {
                    a.cp cpVar3 = com.omarea.Scene.c;
                    java.lang.String string3 = ((android.content.Context) ej1Var.d).getString(2131953690);
                    a.wv.v(string3, "context.getString(R.string.user_login_ok)");
                    a.fs1.X(string3, 0);
                    a.v60 v60Var = (a.v60) ej1Var.f;
                    if (v60Var != null) {
                        v60Var.a();
                    }
                    ej1Var.f = null;
                    a.n70 n70Var = (a.n70) ej1Var.e;
                    boolean activated = q.getActivated();
                    this.h = 1;
                    if (((a.tf) n70Var).a(str, this, activated) == dzVar) {
                        return dzVar;
                    }
                } else if (q.getError().length() > 0) {
                    a.cp cpVar4 = com.omarea.Scene.c;
                    a.fs1.X(q.getError(), 0);
                } else {
                    a.cp cpVar5 = com.omarea.Scene.c;
                    java.lang.String string4 = ((android.content.Context) ej1Var.d).getString(2131953689);
                    a.wv.v(string4, "context.getString(R.string.user_login_failure)");
                    a.fs1.X(string4, 0);
                }
            } else {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        a.b20.q1(obj);
                        return a.no1.f387a;
                    }
                    if (i != 4) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    java.lang.Throwable th = this.g;
                    a.b20.q1(obj);
                    throw th;
                }
                a.b20.q1(obj);
            }
            a.u20 u20Var2 = a.z80.f728a;
            a.zx0 zx0Var2 = a.by0.f57a;
            a.r70 r70Var2 = new a.r70(ej1Var, null);
            this.h = 2;
            if (a.wv.S1(zx0Var2, r70Var2, this) == dzVar) {
                return dzVar;
            }
            return a.no1.f387a;
        } catch (java.lang.Throwable th2) {
            a.u20 u20Var3 = a.z80.f728a;
            a.zx0 zx0Var3 = a.by0.f57a;
            a.r70 r70Var3 = new a.r70(ej1Var, null);
            this.g = th2;
            this.h = 4;
            if (a.wv.S1(zx0Var3, r70Var3, this) == dzVar) {
                return dzVar;
            }
            throw th2;
        }
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.s70) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
