package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class kf extends a.lj1 implements a.fp0 {
    public final /* synthetic */ com.omarea.vtools.activities.ActivityStartSplash g;
    public final /* synthetic */ boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kf(com.omarea.vtools.activities.ActivityStartSplash activityStartSplash, a.ey eyVar, boolean z) {
        super(2, eyVar);
        this.g = activityStartSplash;
        this.h = z;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.kf(this.g, eyVar, this.h);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        a.fa0 fa0Var = com.omarea.vtools.activities.ActivityStartSplash.q;
        com.omarea.vtools.activities.ActivityStartSplash activityStartSplash = this.g;
        activityStartSplash.o();
        if (!this.h) {
            a.cp cpVar = com.omarea.Scene.c;
            java.lang.String string = a.fs1.D().getString("user_name", "");
            if (string == null || string.length() == 0) {
                new a.ej1(activityStartSplash, (a.b81) activityStartSplash.k.a(), (a.n70) activityStartSplash.m.a()).w();
            } else {
                ((a.i50) activityStartSplash.l.a()).c();
            }
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.kf kfVar = (a.kf) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        kfVar.e(no1Var);
        return no1Var;
    }
}
