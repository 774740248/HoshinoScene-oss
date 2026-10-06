package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class l9 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ java.lang.String g;
    public final /* synthetic */ java.lang.String h;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityFpsSession i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l9(java.lang.String str, java.lang.String str2, com.omarea.vtools.activities.ActivityFpsSession activityFpsSession, a.ey eyVar) {
        super(2, eyVar);
        this.g = str;
        this.h = str2;
        this.i = activityFpsSession;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.l9(this.g, this.h, this.i, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        com.omarea.vtools.activities.ActivityFpsSession activityFpsSession = this.i;
        java.lang.String str = this.g;
        if (str != null) {
            java.lang.String str2 = this.h;
            if (!a.wv.e(str, str2)) {
                try {
                    activityFpsSession.startActivity(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(new a.oe1().n(str, str2))));
                } catch (java.lang.Exception unused) {
                }
                return a.no1.f387a;
            }
        }
        a.cp cpVar = com.omarea.Scene.c;
        java.lang.String string = activityFpsSession.getString(2131952312);
        a.wv.v(string, "getString(R.string.fps_pk_invalid_target)");
        a.fs1.X(string, 0);
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.l9 l9Var = (a.l9) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        l9Var.e(no1Var);
        return no1Var;
    }
}
