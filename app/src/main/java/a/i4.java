package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class i4 extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityAppContents h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4(com.omarea.vtools.activities.ActivityAppContents activityAppContents, a.ey eyVar) {
        super(2, eyVar);
        this.h = activityAppContents;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.i4(this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        if (i == 0) {
            a.b20.q1(obj);
            com.omarea.vtools.activities.ActivityAppContents activityAppContents = this.h;
            a.po poVar = activityAppContents.n;
            if (poVar == null) {
                a.wv.M1("appListHelper");
                throw null;
            }
            java.util.ArrayList d = poVar.d(null, false);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = d.iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                com.omarea.model.AppInfo appInfo = (com.omarea.model.AppInfo) next;
                if (!a.yi1.B2(appInfo.getPackageName(), "com.android.overlay") && !a.yi1.B2(appInfo.getPackageName(), "com.android.theme")) {
                    arrayList.add(next);
                }
            }
            activityAppContents.o = new java.util.ArrayList(arrayList);
            a.u20 u20Var = a.z80.f728a;
            a.zx0 zx0Var = a.by0.f57a;
            a.h4 h4Var = new a.h4(activityAppContents, null);
            this.g = 1;
            if (a.wv.S1(zx0Var, h4Var, this) == dzVar) {
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
        return ((a.i4) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
