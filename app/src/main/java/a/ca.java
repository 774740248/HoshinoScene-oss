package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ca extends a.lj1 implements a.fp0 {
    public final /* synthetic */ com.omarea.vtools.activities.ActivityFpsSessions g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ca(com.omarea.vtools.activities.ActivityFpsSessions activityFpsSessions, a.ey eyVar) {
        super(2, eyVar);
        this.g = activityFpsSessions;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.ca(this.g, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        java.lang.String str;
        a.b20.q1(obj);
        a.oe1 oe1Var = new a.oe1();
        com.omarea.vtools.activities.ActivityFpsSessions activityFpsSessions = this.g;
        a.r51 r51Var = activityFpsSessions.p;
        if (r51Var == null) {
            a.wv.M1("fpsWatchStore");
            throw null;
        }
        java.util.Iterator it = r51Var.J().iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            com.omarea.model.FpsWatchSession fpsWatchSession = (com.omarea.model.FpsWatchSession) it.next();
            java.lang.Long l = fpsWatchSession.sessionId;
            java.lang.Long l2 = fpsWatchSession.beginTime;
            a.wv.v(l2, "it.beginTime");
            if (l2.longValue() > 1774972800000L && ((str = fpsWatchSession.cloudId) == null || str.length() == 0)) {
                int i3 = fpsWatchSession.duration;
                if (i3 > 60 && i3 <= 2400) {
                    a.r51 r51Var2 = activityFpsSessions.p;
                    if (r51Var2 == null) {
                        a.wv.M1("fpsWatchStore");
                        throw null;
                    }
                    a.wv.v(l, "sessionId");
                    a.y31 o = oe1Var.o(r51Var2.b(l.longValue()));
                    if (o != null) {
                        i2++;
                        a.r51 r51Var3 = activityFpsSessions.p;
                        if (r51Var3 == null) {
                            a.wv.M1("fpsWatchStore");
                            throw null;
                        }
                        r51Var3.K(l.longValue(), (java.lang.String) o.c);
                    } else {
                        i++;
                    }
                }
            }
        }
        if (i > 0 && i2 == 0) {
            a.cp cpVar = com.omarea.Scene.c;
            a.fs1.X("数据上传失败，功能暂未开放", 0);
        } else if (!activityFpsSessions.isDestroyed()) {
            a.wv.M0(a.wv.b(a.z80.b), null, new a.aa(activityFpsSessions, true, null), 3);
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.ca caVar = (a.ca) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        caVar.e(no1Var);
        return no1Var;
    }
}
