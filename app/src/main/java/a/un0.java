package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class un0 implements a.y70 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f602a;
    public final /* synthetic */ a.ma1 b;

    public un0(java.lang.String str, a.ma1 ma1Var) {
        this.f602a = str;
        this.b = ma1Var;
    }

    @Override // a.y70
    public final void a(java.lang.String str) {
        a.wv.w(str, "password");
        a.cp cpVar = com.omarea.Scene.c;
        a.kf1 kf1Var = new a.kf1(a.fs1.t());
        java.lang.Object obj = this.b.c;
        a.wv.s(obj);
        a.lt0 item = ((com.omarea.model.DeviceBindInfo) obj).getItem();
        java.lang.String str2 = this.f602a;
        a.wv.w(str2, "uid");
        a.wv.w(item, "deviceInfo");
        a.q10 q10Var = a.q10.f457a;
        java.lang.String n = a.q10.n();
        java.lang.String concat = a.tg1.i().concat("/account-unbind");
        a.lt0 lt0Var = new a.lt0();
        java.util.Locale p = kf1Var.p();
        if (p != null) {
            lt0Var.m(p.getLanguage(), "locale");
        }
        if (n != null) {
            lt0Var.m(n, "scene_version");
        }
        lt0Var.m(str2, "uid");
        lt0Var.m(a.kf1.r(str), "password");
        lt0Var.m(item, "device_info");
        a.lt0 h = a.qr0.h(kf1Var, concat, lt0Var);
        com.omarea.model.LoginResponse loginResponse = null;
        if (h != null) {
            try {
                new com.omarea.model.LoginResponse();
                com.omarea.model.LoginResponse f = (com.omarea.model.LoginResponse) a.qm1.f(h, com.omarea.model.LoginResponse.class);
                com.omarea.model.LoginResponse loginResponse2 = (com.omarea.model.LoginResponse) f;
                java.lang.String lt0Var2 = h.toString();
                if (lt0Var2 == null) {
                    lt0Var2 = "";
                }
                loginResponse2.setDetail(lt0Var2);
                loginResponse = (com.omarea.model.LoginResponse) f;
            } catch (java.lang.Exception unused) {
            }
        }
        if (loginResponse == null || !loginResponse.getPass()) {
            return;
        }
        a.cp cpVar2 = com.omarea.Scene.c;
        a.fs1.X("OK", 0);
    }
}
