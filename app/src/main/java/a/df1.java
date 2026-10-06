package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class df1 implements java.util.concurrent.Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f97a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.String c;

    public /* synthetic */ df1(a.pm pmVar, java.lang.String str) {
        this.f97a = 2;
        this.c = str;
        this.b = pmVar;
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        int i = this.f97a;
        java.lang.String str = this.c;
        java.lang.Object obj = this.b;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.kf1 kf1Var = (a.kf1) obj;
                a.wv.w(kf1Var, "this$0");
                a.wv.w(str, "$uid");
                try {
                    a.lt0 n = a.kf1.n();
                    java.lang.String concat = a.tg1.i().concat("/account-devices");
                    a.lt0 lt0Var = new a.lt0();
                    java.util.Locale p = kf1Var.p();
                    if (p != null) {
                        lt0Var.m(p.getLanguage(), "locale");
                    }
                    lt0Var.m(n, "device_info");
                    lt0Var.m(str, "uid");
                    lt0Var.m("", "password");
                    java.lang.String obj2 = a.yi1.F2(kf1Var.g(lt0Var, concat)).toString();
                    if (obj2.length() <= 0) {
                        return null;
                    }
                    try {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        a.jt0 jt0Var = new a.jt0(obj2);
                        int size = jt0Var.f269a.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            a.lt0 c = jt0Var.c(i2);
                            com.omarea.model.DeviceBindInfo deviceBindInfo = new com.omarea.model.DeviceBindInfo();
                            deviceBindInfo.setItem(c);
                            java.lang.String h = c.h("device_id");
                            java.lang.String h2 = c.f329a.containsKey("product_model") ? c.h("product_model") : "";
                            if (h2.length() == 0) {
                                h2 = h;
                            }
                            deviceBindInfo.setCurrent(c.b("current"));
                            deviceBindInfo.setName(h2);
                            deviceBindInfo.setId(h);
                            arrayList.add(deviceBindInfo);
                        }
                        return arrayList;
                    } catch (java.lang.Exception e) {
                        e.toString();
                        return null;
                    }
                } catch (java.lang.Exception unused) {
                    android.util.Log.e("Scene", "Cloud Request(exchangeCode), Fail!");
                    return null;
                }
            case 1:
                a.kf1 kf1Var2 = (a.kf1) obj;
                a.wv.w(kf1Var2, "this$0");
                a.wv.w(str, "$uid");
                try {
                    long time = new java.util.Date().getTime();
                    java.lang.String str2 = a.tg1.i() + "/account-exist?t=" + time;
                    a.lt0 lt0Var2 = new a.lt0();
                    java.util.Locale p2 = kf1Var2.p();
                    if (p2 != null) {
                        lt0Var2.m(p2.getLanguage(), "locale");
                    }
                    lt0Var2.m(str, "uid");
                    lt0Var2.f329a.put("request_time", java.lang.Long.valueOf(time));
                    java.lang.String obj3 = a.yi1.F2(kf1Var2.g(lt0Var2, str2)).toString();
                    if (obj3.length() > 0 && a.wv.e(obj3, "true")) {
                        return java.lang.Boolean.TRUE;
                    }
                } catch (java.lang.Exception unused2) {
                    android.util.Log.e("Scene", "Cloud Request(account exist), Fail!");
                }
                return java.lang.Boolean.FALSE;
            default:
                a.pm pmVar = (a.pm) obj;
                a.wv.w(str, "$cmd");
                a.wv.w(pmVar, "this$0");
                a.q10 q10Var = a.q10.f457a;
                return java.lang.Boolean.valueOf(a.q10.v((a.u10) pmVar.d, str));
        }
    }

    public /* synthetic */ df1(a.kf1 kf1Var, java.lang.String str, int i) {
        this.f97a = i;
        this.b = kf1Var;
        this.c = str;
    }
}
