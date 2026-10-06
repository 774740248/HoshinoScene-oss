package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ta extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityFreezeApps h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ta(com.omarea.vtools.activities.ActivityFreezeApps activityFreezeApps, a.ey eyVar) {
        super(2, eyVar);
        this.h = activityFreezeApps;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.ta(this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        android.content.SharedPreferences sharedPreferences;
        java.lang.String str;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        java.util.ArrayList arrayList3;
        com.omarea.vtools.activities.ActivityFreezeApps activityFreezeApps = this.h;
        a.dz dzVar = a.dz.c;
        int i = this.g;
        try {
            if (i == 0) {
                a.b20.q1(obj);
                a.au auVar = new a.au(activityFreezeApps.getContext(), 2);
                sharedPreferences = activityFreezeApps.shortConfig;
                if (sharedPreferences == null) {
                    a.wv.M1("shortConfig");
                    throw null;
                }
                str = activityFreezeApps.sortDataKey;
                java.lang.String string = sharedPreferences.getString(str, "");
                a.wv.s(string);
                java.util.List y2 = a.yi1.y2(string, new java.lang.String[]{","});
                activityFreezeApps.freezeApps = auVar.d();
                arrayList = activityFreezeApps.freezeApps;
                int size = arrayList.size();
                arrayList2 = activityFreezeApps.freezeApps;
                if (arrayList2.size() > 1) {
                    a.ov.Z1(arrayList2, new a.aq0(y2, size, 1));
                }
                a.cp cpVar = com.omarea.Scene.c;
                boolean s = a.fs1.s("freeze_icon_notify", false);
                java.util.ArrayList k0 = s ? a.b20.k0(activityFreezeApps.getContext()) : new java.util.ArrayList();
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                a.po poVar = new a.po(activityFreezeApps.getContext(), true);
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                arrayList3 = activityFreezeApps.freezeApps;
                java.util.Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    java.lang.String str2 = (java.lang.String) it.next();
                    a.wv.v(str2, "it");
                    com.omarea.model.AppInfo c = poVar.c(str2);
                    if (c != null) {
                        arrayList5.add(c);
                        if (s && !k0.contains(str2)) {
                            arrayList4.add(c);
                            sb.append(c.getAppName());
                            sb.append("\n");
                        }
                    }
                }
                auVar.close();
                a.u20 u20Var = a.z80.f728a;
                a.zx0 zx0Var = a.by0.f57a;
                a.sa saVar = new a.sa(this.h, arrayList5, arrayList4, sb, null);
                this.g = 1;
                if (a.wv.S1(zx0Var, saVar, this) == dzVar) {
                    return dzVar;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a.b20.q1(obj);
            }
        } catch (java.lang.Exception e) {
            e.getStackTrace();
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.ta) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
