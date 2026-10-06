package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class gd extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityPowerBench h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gd(com.omarea.vtools.activities.ActivityPowerBench activityPowerBench, a.ey eyVar) {
        super(2, eyVar);
        this.h = activityPowerBench;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.gd(this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.h61 h61Var;
        a.dz dzVar = a.dz.c;
        int i = this.g;
        if (i == 0) {
            a.b20.q1(obj);
            a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityPowerBench.U;
            com.omarea.vtools.activities.ActivityPowerBench activityPowerBench = this.h;
            a.i61 F = activityPowerBench.F();
            android.database.Cursor rawQuery = F.a().rawQuery("select * from session order by time desc limit 1", new java.lang.String[0]);
            try {
                if (rawQuery.moveToNext()) {
                    h61Var = a.i61.c(rawQuery);
                    a.wv.z(rawQuery, null);
                } else {
                    a.wv.z(rawQuery, null);
                    h61Var = null;
                }
                a.y31 y31Var = h61Var != null ? new a.y31(h61Var, F.b(h61Var.f201a)) : null;
                if (y31Var != null) {
                    a.u20 u20Var = a.z80.f728a;
                    a.zx0 zx0Var = a.by0.f57a;
                    a.fd fdVar = new a.fd(activityPowerBench, y31Var, null);
                    this.g = 1;
                    if (a.wv.S1(zx0Var, fdVar, this) == dzVar) {
                        return dzVar;
                    }
                }
            } finally {
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
        return ((a.gd) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
