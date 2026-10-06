package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class z9 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ com.omarea.vtools.activities.ActivityFpsSessions g;
    public final /* synthetic */ java.util.ArrayList h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z9(com.omarea.vtools.activities.ActivityFpsSessions activityFpsSessions, java.util.ArrayList arrayList, a.ey eyVar) {
        super(2, eyVar);
        this.g = activityFpsSessions;
        this.h = arrayList;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.z9(this.g, this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        com.omarea.vtools.activities.ActivityFpsSessions activityFpsSessions = this.g;
        boolean isDestroyed = activityFpsSessions.isDestroyed();
        a.no1 no1Var = a.no1.f387a;
        if (isDestroyed) {
            return no1Var;
        }
        java.util.ArrayList arrayList = this.h;
        int size = arrayList.size();
        a.yq1 yq1Var = activityFpsSessions.n;
        if (size > 0) {
            ((android.widget.TextView) yq1Var.a(com.omarea.vtools.activities.ActivityFpsSessions.t[10])).setVisibility(8);
            activityFpsSessions.s().setVisibility(0);
            androidx.recyclerview.widget.RecyclerView s = activityFpsSessions.s();
            a.dk dkVar = new a.dk(activityFpsSessions.getContext(), arrayList);
            dkVar.o = activityFpsSessions;
            dkVar.p = new a.ba(activityFpsSessions);
            s.setAdapter(dkVar);
            a.po poVar = new a.po(activityFpsSessions.getContext(), true);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.ArrayList arrayList3 = new java.util.ArrayList(a.op.J1(arrayList, 10));
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList3.add(((com.omarea.model.FpsWatchSession) it.next()).packageName);
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.util.Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                java.lang.Object next = it2.next();
                java.lang.String str = (java.lang.String) next;
                if (!a.wv.e(str, "android") && str != null) {
                    arrayList4.add(next);
                }
            }
            java.util.Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                java.lang.String str2 = (java.lang.String) it3.next();
                if (!arrayList2.contains(str2)) {
                    arrayList2.add(str2);
                }
            }
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            com.omarea.model.AppInfo appInfo = new com.omarea.model.AppInfo();
            appInfo.setPackageName("android");
            arrayList5.add(appInfo);
            java.util.Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                java.lang.String str3 = (java.lang.String) it4.next();
                com.omarea.model.AppInfo c = poVar.c(str3);
                if (c == null) {
                    c = new com.omarea.model.AppInfo();
                    c.setPackageName(str3);
                }
                arrayList5.add(c);
            }
            androidx.recyclerview.widget.RecyclerView r = activityFpsSessions.r();
            activityFpsSessions.getContext();
            r.setLayoutManager(new androidx.recyclerview.widget.GridLayoutManager(arrayList5.size()));
            androidx.recyclerview.widget.RecyclerView r2 = activityFpsSessions.r();
            a.jh jhVar = new a.jh(activityFpsSessions.getContext(), arrayList5);
            jhVar.n = new a.ba(activityFpsSessions);
            r2.setAdapter(jhVar);
        } else {
            activityFpsSessions.s().setVisibility(8);
            ((android.widget.TextView) yq1Var.a(com.omarea.vtools.activities.ActivityFpsSessions.t[10])).setVisibility(0);
        }
        activityFpsSessions.s = arrayList.size();
        return no1Var;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.z9) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
