package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class hc extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityOplusORMS h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hc(com.omarea.vtools.activities.ActivityOplusORMS activityOplusORMS, a.ey eyVar) {
        super(2, eyVar);
        this.h = activityOplusORMS;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.hc(this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        com.omarea.vtools.activities.ActivityOplusORMS activityOplusORMS = this.h;
        try {
        } catch (java.lang.Exception unused) {
            a.u20 u20Var = a.z80.f728a;
            a.zx0 zx0Var = a.by0.f57a;
            a.gc gcVar = new a.gc(activityOplusORMS, null);
            this.g = 3;
            if (a.wv.S1(zx0Var, gcVar, this) == dzVar) {
                return dzVar;
            }
        }
        if (i == 0) {
            a.b20.q1(obj);
            java.lang.String a2 = new a.v21().a();
            a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityOplusORMS.i;
            if (a.wv.e(a2, activityOplusORMS.p().getText().toString())) {
                a.u20 u20Var2 = a.z80.f728a;
                a.zx0 zx0Var2 = a.by0.f57a;
                a.fc fcVar = new a.fc(activityOplusORMS, null);
                this.g = 2;
                if (a.wv.S1(zx0Var2, fcVar, this) == dzVar) {
                    return dzVar;
                }
                return a.no1.f387a;
            }
            a.u20 u20Var3 = a.z80.f728a;
            a.zx0 zx0Var3 = a.by0.f57a;
            a.ec ecVar = new a.ec(activityOplusORMS, a2, null);
            this.g = 1;
            if (a.wv.S1(zx0Var3, ecVar, this) == dzVar) {
                return dzVar;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    a.b20.q1(obj);
                } else {
                    if (i != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a.b20.q1(obj);
                }
                return a.no1.f387a;
            }
            a.b20.q1(obj);
        }
        a.gu0[] gu0VarArr2 = com.omarea.vtools.activities.ActivityOplusORMS.i;
        activityOplusORMS.q();
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.hc) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
