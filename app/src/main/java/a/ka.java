package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ka extends a.lj1 implements a.fp0 {
    public final /* synthetic */ com.omarea.vtools.activities.ActivityFreezeApps g;
    public final /* synthetic */ java.util.ArrayList h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ka(com.omarea.vtools.activities.ActivityFreezeApps activityFreezeApps, java.util.ArrayList arrayList, a.ey eyVar) {
        super(2, eyVar);
        this.g = activityFreezeApps;
        this.h = arrayList;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.ka(this.g, this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b81 b81Var;
        com.omarea.vtools.activities.ActivityFreezeApps activityFreezeApps = this.g;
        a.b20.q1(obj);
        try {
            b81Var = activityFreezeApps.processBarDialog;
        } catch (java.lang.Exception unused) {
        }
        if (b81Var == null) {
            a.wv.M1("processBarDialog");
            throw null;
        }
        b81Var.a();
        a.a40 a40Var = new a.a40(activityFreezeApps.getThemeMode().f442a, this.h, true, new a.tp0(activityFreezeApps, 1));
        java.lang.String packageName = activityFreezeApps.getContext().getPackageName();
        a.wv.v(packageName, "context.packageName");
        a40Var.s0 = new java.lang.String[]{packageName, "com.topjohnwu.magisk", "eu.chainfire.supersu", "com.android.settings", "me.weishu.kernelsu"};
        if (a40Var.H != null) {
            android.util.Log.e("@DialogAppChooser", "Unable to set the exclusion list, The list has been loaded");
        }
        a40Var.r0 = false;
        android.view.View view = a40Var.H;
        android.widget.CompoundButton compoundButton = view != null ? (android.widget.CompoundButton) view.findViewById(2131363073) : null;
        if (compoundButton != null) {
            compoundButton.setVisibility(8);
        }
        a40Var.V(activityFreezeApps.getSupportFragmentManager(), "freeze-app-add");
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.ka kaVar = (a.ka) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        kaVar.e(no1Var);
        return no1Var;
    }
}
