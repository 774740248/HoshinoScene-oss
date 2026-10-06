package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class x9 extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ com.omarea.model.AppInfo h;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityFpsSessions i;
    public final /* synthetic */ a.b81 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9(com.omarea.model.AppInfo appInfo, com.omarea.vtools.activities.ActivityFpsSessions activityFpsSessions, a.b81 b81Var, a.ey eyVar) {
        super(2, eyVar);
        this.h = appInfo;
        this.i = activityFpsSessions;
        this.j = b81Var;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.x9(this.h, this.i, this.j, eyVar);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [a.fp0, a.lj1] */
    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.y31 y31Var;
        a.dz dzVar = a.dz.c;
        int i = this.g;
        if (i == 0) {
            a.b20.q1(obj);
            a.wv.M0(a.wv.b(a.z80.b), null, new a.lj1(2, null), 3);
            com.omarea.model.AppInfo appInfo = this.h;
            boolean e = a.wv.e(appInfo.getPackageName(), "android");
            com.omarea.vtools.activities.ActivityFpsSessions activityFpsSessions = this.i;
            if (e) {
                a.r51 r51Var = activityFpsSessions.p;
                if (r51Var == null) {
                    a.wv.M1("fpsWatchStore");
                    throw null;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                try {
                    android.database.Cursor rawQuery = r51Var.e().rawQuery("select id, cloud_id from session", new java.lang.String[0]);
                    a.wv.v(rawQuery, "database.rawQuery(\n     …  arrayOf()\n            )");
                    while (rawQuery.moveToNext()) {
                        arrayList.add(java.lang.Long.valueOf(rawQuery.getLong(0)));
                        java.lang.String string = rawQuery.getString(1);
                        if (string != null && string.length() != 0) {
                            arrayList2.add(string);
                        }
                    }
                    rawQuery.close();
                } catch (java.lang.Exception unused) {
                }
                try {
                    android.database.sqlite.SQLiteDatabase e2 = r51Var.e();
                    e2.execSQL("delete from session", new java.lang.String[0]);
                    e2.execSQL("delete from fps_record", new java.lang.String[0]);
                    e2.execSQL("delete from perf_event", new java.lang.String[0]);
                    e2.execSQL("delete from threads", new java.lang.String[0]);
                    e2.execSQL("delete from perf_stall", new java.lang.String[0]);
                } catch (java.lang.Exception unused2) {
                }
                y31Var = new a.y31(arrayList, arrayList2);
            } else {
                a.r51 r51Var2 = activityFpsSessions.p;
                if (r51Var2 == null) {
                    a.wv.M1("fpsWatchStore");
                    throw null;
                }
                java.lang.String packageName = appInfo.getPackageName();
                a.wv.w(packageName, "packageName");
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                try {
                    android.database.Cursor rawQuery2 = r51Var2.e().rawQuery("select id, cloud_id from session where package_name = ?", new java.lang.String[]{packageName});
                    a.wv.v(rawQuery2, "database.rawQuery(\n     …ackageName)\n            )");
                    while (rawQuery2.moveToNext()) {
                        arrayList3.add(java.lang.Long.valueOf(rawQuery2.getLong(0)));
                        java.lang.String string2 = rawQuery2.getString(1);
                        if (string2 != null && string2.length() != 0) {
                            arrayList4.add(string2);
                        }
                    }
                    rawQuery2.close();
                } catch (java.lang.Exception unused3) {
                }
                java.util.Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    java.lang.Long l = (java.lang.Long) it.next();
                    a.wv.v(l, "session");
                    r51Var2.a(l.longValue());
                }
                y31Var = new a.y31(arrayList3, arrayList4);
            }
            java.util.List list = (java.util.List) y31Var.d;
            a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityFpsSessions.t;
            if (!activityFpsSessions.isDestroyed()) {
                a.wv.M0(a.wv.b(a.z80.b), null, new a.aa(activityFpsSessions, false, null), 3);
            }
            a.zx0 zx0Var = a.by0.f57a;
            a.w9 w9Var = new a.w9(list, activityFpsSessions, this.j, null);
            this.g = 1;
            if (a.wv.S1(zx0Var, w9Var, this) == dzVar) {
                return dzVar;
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
        return ((a.x9) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
