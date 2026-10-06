package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ua extends a.lj1 implements a.fp0 {
    public final /* synthetic */ com.omarea.vtools.activities.ActivityFreezeApps g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ua(com.omarea.vtools.activities.ActivityFreezeApps activityFreezeApps, a.ey eyVar) {
        super(2, eyVar);
        this.g = activityFreezeApps;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.ua(this.g, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        java.util.ArrayList arrayList;
        a.b20.q1(obj);
        com.omarea.vtools.activities.ActivityFreezeApps activityFreezeApps = this.g;
        arrayList = activityFreezeApps.freezeApps;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            a.wv.v(str, "it");
            activityFreezeApps.enableApp(str);
            activityFreezeApps.disableApp(str);
        }
        a.cp cpVar = com.omarea.Scene.c;
        a.fs1.L(new a.da(activityFreezeApps, 10));
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.ua uaVar = (a.ua) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        uaVar.e(no1Var);
        return no1Var;
    }
}
