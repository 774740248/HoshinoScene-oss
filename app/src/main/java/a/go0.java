package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class go0 implements a.y70 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f186a;
    public final /* synthetic */ java.lang.String b;
    public final /* synthetic */ a.jo0 c;

    public go0(android.view.View view, a.jo0 jo0Var, java.lang.String str) {
        this.f186a = view;
        this.b = str;
        this.c = jo0Var;
    }

    @Override // a.y70
    public final void a(java.lang.String str) {
        com.omarea.model.LoginResponse loginResponse;
        a.wv.w(str, "password");
        boolean z = ((com.omarea.ui.SwitchOptionItemView) this.f186a.findViewById(2131362512)).i;
        a.cp cpVar = com.omarea.Scene.c;
        a.kf1 kf1Var = new a.kf1(a.fs1.t());
        java.lang.String str2 = this.b;
        a.wv.w(str2, "uid");
        a.lt0 n = a.kf1.n();
        a.q10 q10Var = a.q10.f457a;
        java.lang.String n2 = a.q10.n();
        if (n != null) {
            java.lang.String concat = a.tg1.i().concat("/account-set-main");
            a.lt0 lt0Var = new a.lt0();
            java.util.Locale p = kf1Var.p();
            if (p != null) {
                lt0Var.m(p.getLanguage(), "locale");
            }
            if (n2 != null) {
                lt0Var.m(n2, "scene_version");
            }
            lt0Var.m(str2, "uid");
            lt0Var.m(a.kf1.r(str), "password");
            lt0Var.m(n, "device_info");
            lt0Var.o("complement", z);
            a.lt0 h = a.qr0.h(kf1Var, concat, lt0Var);
            if (h != null) {
                try {
                    new com.omarea.model.LoginResponse();
                    com.omarea.model.LoginResponse f = (com.omarea.model.LoginResponse) a.qm1.f(h, com.omarea.model.LoginResponse.class);
                    java.lang.String lt0Var2 = h.toString();
                    a.wv.v(lt0Var2, "response.toString()");
                    ((com.omarea.model.LoginResponse) f).setDetail(lt0Var2);
                    loginResponse = (com.omarea.model.LoginResponse) f;
                } catch (java.lang.Exception unused) {
                }
            }
            loginResponse = null;
        } else {
            loginResponse = new com.omarea.model.LoginResponse();
            loginResponse.setError("无法获取设备标识");
        }
        if (loginResponse != null) {
            if (!loginResponse.getPass()) {
                a.cp cpVar2 = com.omarea.Scene.c;
                a.fs1.X("@_@: " + loginResponse.getError(), 0);
                return;
            }
            a.gu0[] gu0VarArr = a.jo0.v0;
            a.jo0 jo0Var = this.c;
            jo0Var.Y();
            a.cp cpVar3 = com.omarea.Scene.c;
            a.fs1.X("OK ^_^", 0);
            a.wv.M0(a.wv.b(a.z80.b), null, new a.fo0(jo0Var, null), 3);
        }
    }
}
