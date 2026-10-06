package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ff extends a.lj1 implements a.fp0 {
    public final /* synthetic */ com.omarea.vtools.activities.ActivityStartSplash g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ff(com.omarea.vtools.activities.ActivityStartSplash activityStartSplash, a.ey eyVar) {
        super(2, eyVar);
        this.g = activityStartSplash;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.ff(this.g, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.v60 F;
        a.b20.q1(obj);
        a.fa0 fa0Var = com.omarea.vtools.activities.ActivityStartSplash.q;
        com.omarea.vtools.activities.ActivityStartSplash activityStartSplash = this.g;
        activityStartSplash.s().setText(activityStartSplash.getString(2131953361));
        try {
            if (android.os.Build.VERSION.SDK_INT <= 30) {
                int i = a.x60.f681a;
                java.lang.String string = activityStartSplash.getString(2131953321);
                a.wv.v(string, "getString(R.string.scene_adb_tip)");
                F = a.fs1.F(activityStartSplash, string, "adb shell sh " + activityStartSplash.o, null);
            } else {
                int i2 = a.x60.f681a;
                java.lang.String string2 = activityStartSplash.getString(2131953321);
                a.wv.v(string2, "getString(R.string.scene_adb_tip)");
                F = a.fs1.F(activityStartSplash, string2, "adb shell sh " + activityStartSplash.p, null);
            }
            return F;
        } catch (java.lang.Exception unused) {
            return a.no1.f387a;
        }
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.ff) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
