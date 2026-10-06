package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class sa extends a.lj1 implements a.fp0 {
    public final /* synthetic */ com.omarea.vtools.activities.ActivityFreezeApps g;
    public final /* synthetic */ java.util.ArrayList h;
    public final /* synthetic */ java.util.ArrayList i;
    public final /* synthetic */ java.lang.StringBuilder j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sa(com.omarea.vtools.activities.ActivityFreezeApps activityFreezeApps, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, java.lang.StringBuilder sb, a.ey eyVar) {
        super(2, eyVar);
        this.g = activityFreezeApps;
        this.h = arrayList;
        this.i = arrayList2;
        this.j = sb;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.sa(this.g, this.h, this.i, this.j, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        com.omarea.ui.BlurViewRecyclerView freeze_apps;
        a.na naVar;
        com.omarea.ui.BlurViewRecyclerView freeze_apps2;
        a.b81 b81Var;
        java.util.ArrayList arrayList = this.i;
        com.omarea.vtools.activities.ActivityFreezeApps activityFreezeApps = this.g;
        a.b20.q1(obj);
        try {
            android.content.Context applicationContext = activityFreezeApps.getApplicationContext();
            a.wv.v(applicationContext, "applicationContext");
            a.fh fhVar = new a.fh(applicationContext, this.h);
            freeze_apps = activityFreezeApps.getFreeze_apps();
            freeze_apps.getContext();
            freeze_apps.setLayoutManager(new androidx.recyclerview.widget.GridLayoutManager(freeze_apps.getResources().getConfiguration().orientation == 2 ? 6 : 4));
            freeze_apps.setAdapter(fhVar);
            naVar = activityFreezeApps.editingState;
            a.th1 th1Var = new a.th1(fhVar, naVar);
            a.ct0 ct0Var = new a.ct0(th1Var);
            freeze_apps2 = activityFreezeApps.getFreeze_apps();
            ct0Var.g(freeze_apps2);
            fhVar.m = new a.yp0(fhVar, freeze_apps, activityFreezeApps);
            fhVar.n = new a.ra(freeze_apps, th1Var, fhVar, activityFreezeApps);
            b81Var = activityFreezeApps.processBarDialog;
        } catch (java.lang.Exception unused) {
        }
        if (b81Var == null) {
            a.wv.M1("processBarDialog");
            throw null;
        }
        b81Var.a();
        if (arrayList.size() > 0) {
            java.lang.String sb = this.j.toString();
            a.wv.v(sb, "lostedShortcutsName.toString()");
            activityFreezeApps.shortcutsLostDialog(sb, arrayList);
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.sa saVar = (a.sa) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        saVar.e(no1Var);
        return no1Var;
    }
}
