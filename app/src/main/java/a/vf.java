package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class vf extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityStartSplash h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vf(com.omarea.vtools.activities.ActivityStartSplash activityStartSplash, a.ey eyVar) {
        super(2, eyVar);
        this.h = activityStartSplash;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.vf(this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        com.omarea.vtools.activities.ActivityStartSplash activityStartSplash = this.h;
        if (i == 0) {
            a.b20.q1(obj);
            a.fa0 fa0Var = com.omarea.vtools.activities.ActivityStartSplash.q;
            activityStartSplash.getClass();
            ((android.widget.LinearLayout) activityStartSplash.j.a(com.omarea.vtools.activities.ActivityStartSplash.r[7])).setVisibility(8);
            activityStartSplash.s().setText(activityStartSplash.getString(2131953345));
            this.g = 1;
            if (a.wv.Q(16L, this) == dzVar) {
                return dzVar;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.b20.q1(obj);
        }
        new a.hw(activityStartSplash).run();
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.vf) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
