package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class k9 extends a.lj1 implements a.fp0 {
    public float g;
    public float h;
    public int i;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityFpsSession j;
    public final /* synthetic */ java.lang.Long k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k9(com.omarea.vtools.activities.ActivityFpsSession activityFpsSession, java.lang.Long l, a.ey eyVar) {
        super(2, eyVar);
        this.j = activityFpsSession;
        this.k = l;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.k9(this.j, this.k, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        float f;
        float f2;
        a.dz dzVar = a.dz.c;
        int i = this.i;
        java.lang.Long l = this.k;
        com.omarea.vtools.activities.ActivityFpsSession activityFpsSession = this.j;
        if (i == 0) {
            a.b20.q1(obj);
            a.r51 r51Var = activityFpsSession.D0;
            a.wv.v(l, "sessionId");
            float t = r51Var.t(l.longValue());
            long longValue = l.longValue();
            a.r51 r51Var2 = activityFpsSession.D0;
            float u = r51Var2.u(longValue);
            float r = r51Var2.r(l.longValue());
            a.u20 u20Var = a.z80.f728a;
            a.zx0 zx0Var = a.by0.f57a;
            a.h9 h9Var = new a.h9(this.j, t, u, r, null);
            this.g = t;
            this.h = u;
            this.i = 1;
            if (a.wv.S1(zx0Var, h9Var, this) == dzVar) {
                return dzVar;
            }
            f = t;
            f2 = u;
        } else {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a.b20.q1(obj);
                return a.no1.f387a;
            }
            f2 = this.h;
            f = this.g;
            a.b20.q1(obj);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (f > 93.0f) {
            a.r51 r51Var3 = activityFpsSession.D0;
            a.wv.v(l, "sessionId");
            java.util.ArrayList s = r51Var3.s(l.longValue());
            sb.append(activityFpsSession.getString(2131952337) + f + "℃    ");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = s.iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                if (((java.lang.Number) next).doubleValue() > 93.0d) {
                    arrayList.add(next);
                }
            }
            sb.append("    ≥90℃ " + arrayList.size() + activityFpsSession.getString(2131952336));
            a.u20 u20Var2 = a.z80.f728a;
            a.zx0 zx0Var2 = a.by0.f57a;
            a.i9 i9Var = new a.i9(activityFpsSession, sb, null);
            this.i = 2;
            if (a.wv.S1(zx0Var2, i9Var, this) == dzVar) {
                return dzVar;
            }
        } else if (f > 0.0f && f == f2) {
            sb.append(activityFpsSession.getString(2131952338) + " " + f + "℃");
            a.u20 u20Var3 = a.z80.f728a;
            a.zx0 zx0Var3 = a.by0.f57a;
            a.j9 j9Var = new a.j9(activityFpsSession, sb, null);
            this.i = 3;
            if (a.wv.S1(zx0Var3, j9Var, this) == dzVar) {
                return dzVar;
            }
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.k9) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
