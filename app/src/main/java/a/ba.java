package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ba implements a.bk {

    public ba(ActivityFpsSessions p0) {
        this.c = p0;
    }
    public final /* synthetic */ com.omarea.vtools.activities.ActivityFpsSessions c;

    @Override // a.bk
    public void b(int i) {
        a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityFpsSessions.t;
        com.omarea.vtools.activities.ActivityFpsSessions activityFpsSessions = this.c;
        a.e91 adapter = activityFpsSessions.s().getAdapter();
        a.wv.t(adapter, "null cannot be cast to non-null type com.omarea.ui.fps.AdapterSessions");
        a.dk dkVar = (a.dk) adapter;
        java.lang.Object obj = dkVar.j.get(i);
        a.wv.v(obj, "filterResult[position]");
        com.omarea.model.FpsWatchSession fpsWatchSession = (com.omarea.model.FpsWatchSession) obj;
        a.r51 r51Var = activityFpsSessions.p;
        if (r51Var == null) {
            a.wv.M1("fpsWatchStore");
            throw null;
        }
        java.lang.Long l = fpsWatchSession.sessionId;
        a.wv.v(l, "item.sessionId");
        r51Var.a(l.longValue());
        java.lang.String str = fpsWatchSession.cloudId;
        if (str != null && str.length() != 0) {
            activityFpsSessions.o(a.b20.y0(fpsWatchSession.cloudId));
        }
        java.lang.Object obj2 = dkVar.j.get(i);
        a.wv.v(obj2, "this.filterResult.get(position)");
        com.omarea.model.FpsWatchSession fpsWatchSession2 = (com.omarea.model.FpsWatchSession) obj2;
        dkVar.j.remove(i);
        java.util.ArrayList arrayList = dkVar.g;
        if (arrayList.contains(fpsWatchSession2)) {
            arrayList.remove(fpsWatchSession2);
        }
        dkVar.f();
        activityFpsSessions.s = dkVar.j.size();
    }
}
