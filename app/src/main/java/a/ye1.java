package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ye1 extends a.uu0 implements a.bp0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ a.ze1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ye1(a.ze1 ze1Var, int i) {
        super(1);
        this.d = i;
        this.e = ze1Var;
    }

    public final void a(a.zt0 zt0Var) {
        int i = this.d;
        a.ze1 ze1Var = this.e;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.wv.w(zt0Var, "$this$null");
                a.wc0 wc0Var = new a.wc0();
                java.util.Collection keySet = ((java.util.HashMap) wc0Var.c.e).keySet();
                a.wv.v(keySet, "fas.whiteListFile.keys");
                zt0Var.t("fas_whitelist", keySet);
                java.util.Collection keySet2 = ((java.util.HashMap) wc0Var.b.e).keySet();
                a.wv.v(keySet2, "fas.blackListFile.keys");
                zt0Var.t("fas_blacklist", keySet2);
                android.content.Context context = ze1Var.e;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                android.content.pm.PackageManager packageManager = context.getPackageManager();
                for (android.content.pm.PackageInfo packageInfo : packageManager.getInstalledPackages(8192)) {
                    try {
                        try {
                            packageManager.getApplicationInfo(packageInfo.packageName, 0);
                        } catch (java.lang.Exception unused) {
                            arrayList.add(packageManager.getApplicationInfo(packageInfo.packageName, 8192));
                        }
                    } catch (java.lang.Exception unused2) {
                    }
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList(a.op.J1(arrayList, 10));
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((android.content.pm.ApplicationInfo) it.next()).packageName);
                }
                zt0Var.t("uninstalled", arrayList2);
                return;
            default:
                a.wv.w(zt0Var, "$this$null");
                zt0Var.u("powercfg", a.ze1.m(ze1Var, "powercfg"));
                zt0Var.u("global", a.ze1.m(ze1Var, "global"));
                zt0Var.u("swap", a.ze1.m(ze1Var, "swap"));
                zt0Var.u("AUTO_SKIP_BLACKLIST", a.ze1.m(ze1Var, "AUTO_SKIP_BLACKLIST"));
                zt0Var.u("scene_black_list_spf", a.ze1.m(ze1Var, "scene_black_list_spf"));
                zt0Var.u("games", a.ze1.m(ze1Var, "games"));
                return;
        }
    }

    @Override // a.bp0
    public final /* bridge */ /* synthetic */ java.lang.Object i(java.lang.Object obj) {
        a.no1 no1Var = a.no1.f387a;
        switch (this.d) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a((a.zt0) obj);
                return no1Var;
            default:
                a((a.zt0) obj);
                return no1Var;
        }
    }
}
