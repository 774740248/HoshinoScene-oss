package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class la extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityFreezeApps h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public la(com.omarea.vtools.activities.ActivityFreezeApps activityFreezeApps, a.ey eyVar) {
        super(2, eyVar);
        this.h = activityFreezeApps;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.la(this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        java.util.ArrayList arrayList;
        a.dz dzVar = a.dz.c;
        int i = this.g;
        if (i == 0) {
            a.b20.q1(obj);
            com.omarea.vtools.activities.ActivityFreezeApps activityFreezeApps = this.h;
            java.util.ArrayList f = new a.po(activityFreezeApps.getContext(), true).f();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = f.iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                arrayList = activityFreezeApps.freezeApps;
                if (!arrayList.contains(((com.omarea.model.AppInfo) next).getPackageName())) {
                    arrayList2.add(next);
                }
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList(a.op.J1(arrayList2, 10));
            java.util.Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                com.omarea.model.AppInfo appInfo = (com.omarea.model.AppInfo) it2.next();
                a.tg tgVar = new a.tg();
                tgVar.setAppName(appInfo.getAppName());
                tgVar.setPackageName(appInfo.getPackageName());
                tgVar.setSelected(false);
                arrayList3.add(tgVar);
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList(arrayList3);
            a.u20 u20Var = a.z80.f728a;
            a.zx0 zx0Var = a.by0.f57a;
            a.ka kaVar = new a.ka(activityFreezeApps, arrayList4, null);
            this.g = 1;
            if (a.wv.S1(zx0Var, kaVar, this) == dzVar) {
                return dzVar;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.b20.q1(obj);
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.la) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
