package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class p0 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ com.omarea.vtools.AccessibilitySceneMode g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(com.omarea.vtools.AccessibilitySceneMode accessibilitySceneMode, a.ey eyVar) {
        super(2, eyVar);
        this.g = accessibilitySceneMode;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.p0(this.g, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        com.omarea.vtools.AccessibilitySceneMode accessibilitySceneMode = this.g;
        android.content.Context applicationContext = accessibilitySceneMode.getApplicationContext();
        a.wv.v(applicationContext, "applicationContext");
        java.util.ArrayList c = new a.l1(applicationContext, 6).c();
        accessibilitySceneMode.e = c;
        c.add("com.oplus.pscanvas");
        java.util.ArrayList arrayList = accessibilitySceneMode.k;
        android.content.Context applicationContext2 = accessibilitySceneMode.getApplicationContext();
        a.wv.v(applicationContext2, "applicationContext");
        android.content.Intent intent = new android.content.Intent("android.intent.action.MAIN", (android.net.Uri) null);
        intent.addCategory("android.intent.category.HOME");
        java.util.List<android.content.pm.ResolveInfo> queryIntentActivities = applicationContext2.getPackageManager().queryIntentActivities(intent, 0);
        a.wv.v(queryIntentActivities, "context.packageManager.q…ivities(resolveIntent, 0)");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator<android.content.pm.ResolveInfo> it = queryIntentActivities.iterator();
        while (it.hasNext()) {
            java.lang.String str = it.next().activityInfo.packageName;
            if (!a.wv.e("com.android.settings", str)) {
                arrayList2.add(str);
            }
        }
        arrayList.addAll(arrayList2);
        accessibilitySceneMode.k.addAll(accessibilitySceneMode.e);
        a.q10 q10Var = a.q10.f457a;
        if (a.q10.r()) {
            a.q10.P(true);
            a.b11.c.U();
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.p0 p0Var = (a.p0) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        p0Var.e(no1Var);
        return no1Var;
    }
}
