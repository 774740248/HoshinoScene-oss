package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ja extends java.lang.Thread {
    public final /* synthetic */ int c;
    public final java.io.Serializable d;
    public final java.lang.Object e;
    public final java.lang.Object f;

    public ja(android.content.Context context, a.da daVar, java.util.ArrayList arrayList) {
        this.c = 1;
        a.wv.w(arrayList, "apps");
        a.wv.w(context, "context");
        this.d = arrayList;
        this.e = context;
        this.f = daVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        switch (this.c) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                java.util.Iterator it = ((java.util.ArrayList) this.d).iterator();
                while (it.hasNext()) {
                    java.lang.String str = (java.lang.String) it.next();
                    java.lang.String str2 = "pm unhide " + str + "\npm enable " + str;
                    a.wv.w(str2, "shell");
                    a.q10 q10Var = a.q10.f457a;
                    a.q10.l(str2);
                    java.lang.Thread.sleep(3000L);
                    a.b20.J((android.content.Context) this.e, str);
                }
                ((java.lang.Runnable) this.f).run();
                return;
            case 1:
                java.util.Iterator it2 = ((java.util.ArrayList) this.d).iterator();
                while (it2.hasNext()) {
                    com.omarea.model.AppInfo appInfo = (com.omarea.model.AppInfo) it2.next();
                    if (appInfo.enabled.booleanValue()) {
                        java.lang.Boolean bool = appInfo.suspended;
                        a.wv.v(bool, "appInfo.suspended");
                        if (!bool.booleanValue()) {
                            java.lang.Thread.sleep(3000L);
                            a.b20.J((android.content.Context) this.e, appInfo.getPackageName());
                        }
                    }
                    a.tg1 tg1Var = a.me1.m;
                    a.tg1.t(appInfo.getPackageName());
                    java.lang.Thread.sleep(3000L);
                    a.b20.J((android.content.Context) this.e, appInfo.getPackageName());
                }
                ((java.lang.Runnable) this.f).run();
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                a.au auVar = new a.au((android.content.Context) this.e, 2);
                java.util.Iterator it3 = ((java.util.ArrayList) this.d).iterator();
                while (it3.hasNext()) {
                    java.lang.String str3 = (java.lang.String) it3.next();
                    a.tg1 tg1Var2 = a.me1.m;
                    a.wv.v(str3, "it");
                    a.tg1.t(str3);
                    com.omarea.model.SceneConfigInfo c = auVar.c(str3);
                    c.freeze = false;
                    auVar.o(c);
                    a.b20.c1((android.content.Context) this.e, str3);
                    a.me1 me1Var = a.me1.p;
                    if (me1Var != null) {
                        me1Var.i(str3);
                    }
                }
                auVar.close();
                ((java.lang.Runnable) this.f).run();
                return;
            default:
                a.wr0 wr0Var = (a.wr0) this.e;
                a.kc0 kc0Var = (a.kc0) this.d;
                a.wv.s(kc0Var);
                wr0Var.onReceive(kc0Var, (java.util.HashMap) this.f);
                return;
        }
    }

    public ja(android.content.Context context, java.util.ArrayList arrayList, a.da daVar, int i) {
        this.c = i;
        if (i != 2) {
            a.wv.w(context, "context");
            a.wv.w(arrayList, "freezeApps");
            this.e = context;
            this.d = arrayList;
            this.f = daVar;
            return;
        }
        a.wv.w(context, "context");
        a.wv.w(arrayList, "freezeApps");
        this.e = context;
        this.d = arrayList;
        this.f = daVar;
    }

    public ja(a.wr0 wr0Var, a.kc0 kc0Var, java.util.HashMap hashMap) {
        this.c = 3;
        this.e = wr0Var;
        this.d = kc0Var;
        this.f = hashMap;
    }
}
