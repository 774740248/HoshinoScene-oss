package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class s9 extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityFpsSession h;
    public final /* synthetic */ com.omarea.model.FpsWatchSession i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s9(com.omarea.vtools.activities.ActivityFpsSession activityFpsSession, com.omarea.model.FpsWatchSession fpsWatchSession, a.ey eyVar) {
        super(2, eyVar);
        this.h = activityFpsSession;
        this.i = fpsWatchSession;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.s9(this.h, this.i, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        com.omarea.vtools.activities.ActivityFpsSession activityFpsSession = this.h;
        if (i == 0) {
            a.b20.q1(obj);
            a.mo moVar = new a.mo(activityFpsSession.getContext(), 0, 6, 0);
            java.lang.String str = this.i.packageName;
            a.wv.v(str, "item.packageName");
            a.e30 N1 = moVar.N1(str);
            this.g = 1;
            obj = N1.o(this);
            if (obj == dzVar) {
                return dzVar;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a.b20.q1(obj);
                return a.no1.f387a;
            }
            a.b20.q1(obj);
        }
        a.u20 u20Var = a.z80.f728a;
        a.zx0 zx0Var = a.by0.f57a;
        a.r9 r9Var = new a.r9(activityFpsSession, (android.graphics.drawable.Drawable) obj, null);
        this.g = 2;
        if (a.wv.S1(zx0Var, r9Var, this) == dzVar) {
            return dzVar;
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.s9) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
