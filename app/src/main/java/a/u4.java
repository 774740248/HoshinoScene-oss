package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class u4 implements java.lang.Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ java.lang.Object e;

    public /* synthetic */ u4(a.p5 p5Var, boolean z, int i) {
        this.c = i;
        this.e = p5Var;
        this.d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        java.util.ArrayList arrayList;
        int i2 = this.c;
        boolean z = this.d;
        java.lang.Object obj = this.e;
        switch (i2) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                com.omarea.vtools.activities.ActivityAppXposedConfig activityAppXposedConfig = (com.omarea.vtools.activities.ActivityAppXposedConfig) obj;
                a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityAppXposedConfig.o;
                a.wv.w(activityAppXposedConfig, "this$0");
                int i3 = 1;
                activityAppXposedConfig.n = true;
                if (z || (arrayList = activityAppXposedConfig.i) == null || arrayList.size() == 0) {
                    activityAppXposedConfig.i = new java.util.ArrayList();
                    a.po poVar = activityAppXposedConfig.h;
                    if (poVar == null) {
                        a.wv.M1("applistHelper");
                        throw null;
                    }
                    activityAppXposedConfig.i = poVar.d(null, false);
                }
                a.gu0[] gu0VarArr2 = com.omarea.vtools.activities.ActivityAppXposedConfig.o;
                a.gu0 gu0Var = gu0VarArr2[0];
                a.yq1 yq1Var = activityAppXposedConfig.d;
                java.lang.String obj2 = ((android.widget.EditText) yq1Var.a(gu0VarArr2[0])).getText().toString();
                java.util.Locale locale = java.util.Locale.getDefault();
                a.wv.v(locale, "getDefault()");
                java.lang.String lowerCase = obj2.toLowerCase(locale);
                a.wv.v(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                boolean z2 = lowerCase.length() > 0;
                java.lang.String value = activityAppXposedConfig.o().getValue();
                if (value == null) {
                    value = "*";
                }
                activityAppXposedConfig.j = new java.util.ArrayList();
                java.util.ArrayList arrayList2 = activityAppXposedConfig.i;
                a.wv.s(arrayList2);
                int size = arrayList2.size();
                for (i = 0; i < size; i++) {
                    java.util.ArrayList arrayList3 = activityAppXposedConfig.i;
                    a.wv.s(arrayList3);
                    java.lang.Object obj3 = arrayList3.get(i);
                    a.wv.v(obj3, "installedList!![i]");
                    com.omarea.model.AppInfo appInfo = (com.omarea.model.AppInfo) obj3;
                    java.lang.String packageName = appInfo.getPackageName();
                    if (z2) {
                        java.util.Locale locale2 = java.util.Locale.getDefault();
                        a.wv.v(locale2, "getDefault()");
                        java.lang.String lowerCase2 = packageName.toLowerCase(locale2);
                        a.wv.v(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                        if (!a.yi1.g2(lowerCase2, lowerCase)) {
                            java.lang.String appName = appInfo.getAppName();
                            java.util.Locale locale3 = java.util.Locale.getDefault();
                            a.wv.v(locale3, "getDefault()");
                            java.lang.String lowerCase3 = appName.toLowerCase(locale3);
                            a.wv.v(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
                            i = a.yi1.g2(lowerCase3, lowerCase) ? 0 : i + 1;
                        }
                    }
                    if (!a.wv.e(value, "*")) {
                        java.lang.CharSequence charSequence = appInfo.path;
                        a.wv.v(charSequence, "item.path");
                        if (!a.yi1.A2(charSequence, value)) {
                        }
                    }
                    java.util.ArrayList arrayList4 = activityAppXposedConfig.j;
                    a.wv.s(arrayList4);
                    arrayList4.add(appInfo);
                    activityAppXposedConfig.r(appInfo);
                }
                java.util.ArrayList arrayList5 = activityAppXposedConfig.j;
                a.wv.s(arrayList5);
                a.ov.Z1(arrayList5, new a.w3(a.a4.f, i3));
                a.cp cpVar = com.omarea.Scene.c;
                a.fs1.L(new a.t4(activityAppXposedConfig, 2));
                activityAppXposedConfig.n = false;
                return;
            case 1:
                com.omarea.vtools.activities.ActivitySwap activitySwap = (com.omarea.vtools.activities.ActivitySwap) obj;
                a.gu0[] gu0VarArr3 = com.omarea.vtools.activities.ActivitySwap.W;
                a.wv.w(activitySwap, "this$0");
                java.util.Timer timer = new java.util.Timer("SwapOFF");
                a.pj1 pj1Var = activitySwap.P;
                pj1Var.getClass();
                timer.schedule(new a.fg(activitySwap, a.pj1.f(), java.lang.System.currentTimeMillis(), 0), 0L, 1000L);
                a.vj1 vj1Var = pj1Var.h;
                if (z) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(a.ai1.h("sh ", (java.lang.String) vj1Var.a(), " disable_swap "));
                    sb.append(a.yi1.g2(pj1Var.c(), "loop") ? "1" : "0");
                    sb.append("\nrm -f " + pj1Var.b);
                    java.lang.String sb2 = sb.toString();
                    a.wv.v(sb2, "sb.toString()");
                    a.q10 q10Var = a.q10.f457a;
                    a.q10.l(sb2);
                } else {
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder(a.ai1.h("sh ", (java.lang.String) vj1Var.a(), " disable_swap "));
                    sb3.append(a.yi1.g2(pj1Var.c(), "loop") ? "1" : "0");
                    java.lang.String sb4 = sb3.toString();
                    a.wv.v(sb4, "sb.toString()");
                    a.q10 q10Var2 = a.q10.f457a;
                    a.q10.l(sb4);
                }
                timer.cancel();
                a.cp cpVar2 = com.omarea.Scene.c;
                a.fs1.L(new a.zf(activitySwap, 6));
                return;
            default:
                a.i50 i50Var = (a.i50) obj;
                a.wv.w(i50Var, "this$0");
                a.b81 b81Var = i50Var.c;
                if (z) {
                    a.b81.c(b81Var);
                    return;
                } else {
                    b81Var.a();
                    return;
                }
        }
    }

    public /* synthetic */ u4(a.i50 i50Var, boolean z) {
        this.c = 2;
        this.d = z;
        this.e = i50Var;
    }
}
