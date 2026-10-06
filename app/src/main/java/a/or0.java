package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class or0 implements java.util.concurrent.Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f419a;
    public final /* synthetic */ java.io.Serializable b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ or0(java.lang.Object obj, java.io.Serializable serializable, java.lang.Object obj2, int i) {
        this.f419a = i;
        this.c = obj;
        this.b = serializable;
        this.d = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        java.lang.Object f;
        int i = this.f419a;
        java.lang.Object obj = this.d;
        java.io.Serializable serializable = this.b;
        java.lang.Object obj2 = this.c;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.qr0 qr0Var = (a.qr0) obj2;
                java.lang.String str = (java.lang.String) serializable;
                a.lt0 lt0Var = (a.lt0) obj;
                a.wv.w(qr0Var, "this$0");
                a.wv.w(str, "$url");
                a.wv.w(lt0Var, "$json");
                java.lang.String obj3 = a.yi1.F2(qr0Var.g(lt0Var, str)).toString();
                if (obj3.length() > 0) {
                    return obj3;
                }
                return null;
            case 1:
                a.kf1 kf1Var = (a.kf1) obj2;
                java.lang.String str2 = (java.lang.String) serializable;
                java.lang.String str3 = (java.lang.String) obj;
                a.wv.w(kf1Var, "this$0");
                a.wv.w(str2, "$uid");
                a.wv.w(str3, "$password");
                try {
                    java.lang.String concat = a.tg1.i().concat("/account-integral");
                    a.lt0 lt0Var2 = new a.lt0();
                    java.util.Locale p = kf1Var.p();
                    if (p != null) {
                        lt0Var2.m(p.getLanguage(), "locale");
                    }
                    lt0Var2.m(str2, "uid");
                    lt0Var2.m(a.kf1.r(str3), "password");
                    java.lang.String obj4 = a.yi1.F2(kf1Var.g(lt0Var2, concat)).toString();
                    if (obj4.length() <= 0) {
                        return null;
                    }
                    try {
                        new com.omarea.model.AccountPointsResponse();
                        if (obj4.length() != 0) {
                            a.lt0 lt0Var3 = new a.lt0(obj4);
                            if (!a.qm1.b(lt0Var3)) {
                                f = a.qm1.f(lt0Var3, com.omarea.model.AccountPointsResponse.class);
                                ((com.omarea.model.AccountPointsResponse) f).setDetail(obj4);
                                return (com.omarea.model.AccountPointsResponse) f;
                            }
                        }
                        f = null;
                        ((com.omarea.model.AccountPointsResponse) f).setDetail(obj4);
                        return (com.omarea.model.AccountPointsResponse) f;
                    } catch (java.lang.Exception unused) {
                        return null;
                    }
                } catch (java.lang.Exception unused2) {
                    android.util.Log.e("Scene", "Cloud Request(exchangeCode), Fail!");
                    return null;
                }
            default:
                com.omarea.vtools.activities.ActivityStartSplash activityStartSplash = (com.omarea.vtools.activities.ActivityStartSplash) obj2;
                a.ka1 ka1Var = (a.ka1) serializable;
                java.lang.Process process = (java.lang.Process) obj;
                a.fa0 fa0Var = com.omarea.vtools.activities.ActivityStartSplash.q;
                a.wv.w(activityStartSplash, "this$0");
                a.wv.w(ka1Var, "$shizukuVersion");
                java.lang.String d = a.pe0.d(activityStartSplash, "rish.sh");
                a.vj1 vj1Var = a.ep1.b;
                java.lang.String d2 = a.ii1.d("export port=", a.fs1.v().f544a);
                java.lang.String str4 = activityStartSplash.o;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("sh ");
                sb.append(d);
                sb.append(" -c '");
                sb.append(d2);
                sb.append(";sh ");
                java.lang.String j = a.ai1.j(sb, str4, "'");
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("sh /storage/emulated/0/Android/data/com.omarea.vtools/rish.sh -c '");
                sb2.append(d2);
                sb2.append(";sh ");
                java.lang.String str5 = activityStartSplash.p;
                java.lang.String j2 = a.ai1.j(sb2, str5, "'");
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("sh ");
                sb3.append(d);
                sb3.append(" -c '");
                sb3.append(d2);
                sb3.append(";sh ");
                java.lang.String j3 = a.ai1.j(sb3, str5, "'");
                if (android.os.Build.VERSION.SDK_INT >= 30) {
                    j = ka1Var.c > 1086 ? j3 : j2;
                }
                java.lang.String e = a.ii1.e(j, "\nexit 0");
                java.io.OutputStream outputStream = process.getOutputStream();
                byte[] bytes = e.getBytes(a.bu.f53a);
                a.wv.v(bytes, "this as java.lang.String).getBytes(charset)");
                outputStream.write(bytes);
                outputStream.flush();
                outputStream.close();
                return java.lang.Integer.valueOf(process.waitFor());
        }
    }
}
