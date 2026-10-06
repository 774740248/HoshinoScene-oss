package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ma extends a.lj1 implements a.fp0 {
    public final /* synthetic */ com.omarea.vtools.activities.ActivityFreezeApps g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ma(com.omarea.vtools.activities.ActivityFreezeApps activityFreezeApps, a.ey eyVar) {
        super(2, eyVar);
        this.g = activityFreezeApps;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.ma(this.g, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        a.b20.q1(obj);
        com.omarea.vtools.activities.ActivityFreezeApps activityFreezeApps = this.g;
        java.util.ArrayList d = new a.po(activityFreezeApps.getContext(), true).d(java.lang.Boolean.FALSE, true);
        java.lang.String str = android.os.Build.MANUFACTURER;
        a.wv.v(str, "MANUFACTURER");
        java.util.Locale locale = java.util.Locale.getDefault();
        a.wv.v(locale, "getDefault()");
        java.lang.String lowerCase = str.toLowerCase(locale);
        a.wv.v(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        if ((a.wv.e(lowerCase, "oppo") || a.wv.e(lowerCase, "realme") || a.wv.e(lowerCase, "oneplus")) && android.os.Build.VERSION.SDK_INT >= 34) {
            arrayList = new java.util.ArrayList();
        } else {
            arrayList = new java.util.ArrayList();
            java.util.Iterator it = d.iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                com.omarea.model.AppInfo appInfo = (com.omarea.model.AppInfo) next;
                if (appInfo.enabled.booleanValue()) {
                    java.lang.Boolean bool = appInfo.suspended;
                    a.wv.v(bool, "it.suspended");
                    if (bool.booleanValue()) {
                    }
                }
                arrayList2 = activityFreezeApps.freezeApps;
                if (!arrayList2.contains(appInfo.getPackageName())) {
                    android.content.pm.ApplicationInfo applicationInfo = activityFreezeApps.getApplicationInfo();
                    a.wv.v(applicationInfo, "applicationInfo");
                    if (!a.po.h(applicationInfo)) {
                        arrayList.add(next);
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            java.lang.String[] stringArray = activityFreezeApps.getResources().getStringArray(2130903049);
            a.wv.v(stringArray, "resources.getStringArray…array.config_frozen_apps)");
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.Iterator it2 = d.iterator();
            while (it2.hasNext()) {
                java.lang.Object next2 = it2.next();
                if (a.op.K1(stringArray, ((com.omarea.model.AppInfo) next2).getPackageName())) {
                    arrayList3.add(next2);
                }
            }
            arrayList = arrayList3;
        }
        android.content.pm.PackageManager packageManager = activityFreezeApps.getPackageManager();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        for (java.lang.Object obj2 : arrayList) {
            com.omarea.model.AppInfo appInfo2 = (com.omarea.model.AppInfo) obj2;
            java.lang.Boolean bool2 = appInfo2.enabled;
            if (!bool2.booleanValue()) {
                activityFreezeApps.enableApp(appInfo2);
            }
            try {
                boolean z = packageManager.getLaunchIntentForPackage(appInfo2.getPackageName()) != null;
                if (!bool2.booleanValue()) {
                    activityFreezeApps.disableApp(appInfo2);
                }
                if (z) {
                    arrayList4.add(obj2);
                }
            } catch (java.lang.Exception unused) {
                if (!bool2.booleanValue()) {
                    activityFreezeApps.disableApp(appInfo2);
                }
            } catch (java.lang.Throwable th) {
                if (!bool2.booleanValue()) {
                    activityFreezeApps.disableApp(appInfo2);
                }
                throw th;
            }
        }
        java.util.ArrayList arrayList5 = new java.util.ArrayList(a.op.J1(arrayList4, 10));
        java.util.Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            arrayList5.add(((com.omarea.model.AppInfo) it3.next()).getPackageName());
        }
        java.util.List w2 = a.qv.w2(arrayList5);
        a.cp cpVar = com.omarea.Scene.c;
        a.fs1.L(new a.so(activityFreezeApps, 29, w2));
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.ma maVar = (a.ma) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        maVar.e(no1Var);
        return no1Var;
    }
}
