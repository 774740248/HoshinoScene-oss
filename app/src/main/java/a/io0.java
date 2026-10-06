package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class io0 extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ java.lang.String h;
    public final /* synthetic */ a.jo0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public io0(a.jo0 jo0Var, java.lang.String str, a.ey eyVar) {
        super(2, eyVar);
        this.h = str;
        this.i = jo0Var;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.io0(this.i, this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        com.omarea.model.LoginResponse loginResponse;
        a.dz dzVar = a.dz.c;
        int i = this.g;
        if (i == 0) {
            a.b20.q1(obj);
            a.cp cpVar = com.omarea.Scene.c;
            a.kf1 kf1Var = new a.kf1(a.fs1.t());
            java.lang.String str = this.h;
            a.wv.w(str, "uid");
            a.lt0 n = a.kf1.n();
            if (n != null) {
                java.lang.String concat = a.tg1.i().concat("/account-unbind");
                a.lt0 lt0Var = new a.lt0();
                java.util.Locale p = kf1Var.p();
                if (p != null) {
                    lt0Var.m(p.getLanguage(), "locale");
                }
                lt0Var.m(str, "uid");
                java.lang.String str2 = "";
                lt0Var.m("", "password");
                lt0Var.m(n, "device_info");
                a.lt0 h = a.qr0.h(kf1Var, concat, lt0Var);
                try {
                    new com.omarea.model.LoginResponse();
                    com.omarea.model.LoginResponse f = (com.omarea.model.LoginResponse) a.qm1.f(h, com.omarea.model.LoginResponse.class);
                    com.omarea.model.LoginResponse loginResponse2 = (com.omarea.model.LoginResponse) f;
                    java.lang.String lt0Var2 = h != null ? h.toString() : null;
                    if (lt0Var2 != null) {
                        str2 = lt0Var2;
                    }
                    loginResponse2.setDetail(str2);
                    loginResponse = (com.omarea.model.LoginResponse) f;
                } catch (java.lang.Exception unused) {
                    loginResponse = null;
                }
            } else {
                loginResponse = new com.omarea.model.LoginResponse();
                loginResponse.setError("无法获取设备标识");
            }
            a.u20 u20Var = a.z80.f728a;
            a.zx0 zx0Var = a.by0.f57a;
            a.ho0 ho0Var = new a.ho0(this.i, loginResponse, null);
            this.g = 1;
            if (a.wv.S1(zx0Var, ho0Var, this) == dzVar) {
                return dzVar;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.b20.q1(obj);
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.io0) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
