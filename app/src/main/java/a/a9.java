package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class a9 extends a.uu0 implements a.bp0 {
    public final /* synthetic */ com.omarea.vtools.activities.ActivityFpsSession d;
    public final /* synthetic */ long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a9(com.omarea.vtools.activities.ActivityFpsSession activityFpsSession, long j) {
        super(1);
        this.d = activityFpsSession;
        this.e = j;
    }

    @Override // a.bp0
    public final java.lang.Object i(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        long j = this.e;
        a.wv.w(str, "remark");
        com.omarea.vtools.activities.ActivityFpsSession activityFpsSession = this.d;
        a.r51 r51Var = activityFpsSession.D0;
        r51Var.getClass();
        try {
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put("remark", str);
            android.database.sqlite.SQLiteDatabase e = r51Var.e();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(j);
            e.update("session", contentValues, "id = ?", new java.lang.String[]{sb.toString()});
        } catch (java.lang.Exception unused) {
        }
        a.l51 f = activityFpsSession.D0.f(j);
        if (f.j.length() > 0) {
            a.wv.M0(a.wv.b(a.z80.b), null, new a.z8(f, str, null), 3);
        }
        return a.no1.f387a;
    }
}
