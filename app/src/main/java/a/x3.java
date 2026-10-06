package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class x3 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ com.omarea.vtools.activities.ActivityAppConfig2 g;
    public final /* synthetic */ boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(com.omarea.vtools.activities.ActivityAppConfig2 activityAppConfig2, boolean z, a.ey eyVar) {
        super(2, eyVar);
        this.g = activityAppConfig2;
        this.h = z;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.x3(this.g, this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        int i;
        java.util.ArrayList arrayList;
        a.b20.q1(obj);
        com.omarea.vtools.activities.ActivityAppConfig2 activityAppConfig2 = this.g;
        activityAppConfig2.r = true;
        int i2 = 0;
        if (this.h || (arrayList = activityAppConfig2.l) == null || arrayList.size() == 0) {
            activityAppConfig2.l = new java.util.ArrayList();
            a.po poVar = activityAppConfig2.k;
            if (poVar == null) {
                a.wv.M1("appListHelper");
                throw null;
            }
            activityAppConfig2.l = poVar.d(null, false);
        }
        activityAppConfig2.o();
        java.lang.String obj2 = activityAppConfig2.o().getText().toString();
        java.util.Locale locale = java.util.Locale.getDefault();
        a.wv.v(locale, "getDefault()");
        java.lang.String lowerCase = obj2.toLowerCase(locale);
        a.wv.v(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        boolean z = lowerCase.length() > 0;
        java.lang.String value = activityAppConfig2.p().getValue();
        if (value == null) {
            value = "*";
        }
        java.lang.String value2 = activityAppConfig2.q().getValue();
        if (value2 == null) {
            value2 = "*";
        }
        activityAppConfig2.m = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = activityAppConfig2.l;
        a.wv.s(arrayList2);
        int size = arrayList2.size();
        for (i = 0; i < size; i++) {
            java.util.ArrayList arrayList3 = activityAppConfig2.l;
            a.wv.s(arrayList3);
            java.lang.Object obj3 = arrayList3.get(i);
            a.wv.v(obj3, "installedList!![i]");
            com.omarea.model.AppInfo appInfo = (com.omarea.model.AppInfo) obj3;
            activityAppConfig2.u(appInfo);
            java.lang.String packageName = appInfo.getPackageName();
            if (z) {
                java.util.Locale locale2 = java.util.Locale.getDefault();
                a.wv.v(locale2, "getDefault()");
                java.lang.String lowerCase2 = packageName.toLowerCase(locale2);
                a.wv.v(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                if (!a.yi1.g2(lowerCase2, lowerCase)) {
                    java.lang.String str = appInfo.getAppName().toString();
                    java.util.Locale locale3 = java.util.Locale.getDefault();
                    a.wv.v(locale3, "getDefault()");
                    java.lang.String lowerCase3 = str.toLowerCase(locale3);
                    a.wv.v(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
                    i = a.yi1.g2(lowerCase3, lowerCase) ? 0 : i + 1;
                }
            }
            if (!a.wv.e(value, "*")) {
                java.lang.String string = activityAppConfig2.s().getString(packageName, "");
                a.wv.s(string);
                if (!a.wv.e(value, string)) {
                }
            }
            if (!a.wv.e(value2, "*")) {
                java.lang.CharSequence charSequence = appInfo.path;
                a.wv.v(charSequence, "item.path");
                if (!a.yi1.A2(charSequence, value2)) {
                }
            }
            java.util.ArrayList arrayList4 = activityAppConfig2.m;
            a.wv.s(arrayList4);
            arrayList4.add(appInfo);
        }
        java.util.ArrayList arrayList5 = activityAppConfig2.m;
        a.wv.s(arrayList5);
        a.ov.Z1(arrayList5, new a.w3(a.a4.e, i2));
        a.cp cpVar = com.omarea.Scene.c;
        a.fs1.L(new a.v3(activityAppConfig2, 2));
        activityAppConfig2.r = false;
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.x3 x3Var = (a.x3) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        x3Var.e(no1Var);
        return no1Var;
    }
}
