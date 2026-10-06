package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class m51 extends a.uu0 implements a.bp0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;
    public final /* synthetic */ java.lang.Object f;
    public final /* synthetic */ java.lang.Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m51(java.lang.Object obj, long j, java.lang.Object obj2, int i) {
        super(1);
        this.d = i;
        this.f = obj;
        this.e = j;
        this.g = obj2;
    }

    public final void a(a.zt0 zt0Var) {
        int i = this.d;
        java.lang.Object obj = this.g;
        long j = this.e;
        java.lang.Object obj2 = this.f;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.wv.w(zt0Var, "$this$$receiver");
                a.r51 r51Var = (a.r51) obj2;
                zt0Var.m(java.lang.Float.valueOf(r51Var.z(j)), "fpsMax");
                zt0Var.m(java.lang.Float.valueOf(r51Var.A(j)), "fpsMin");
                zt0Var.m(java.lang.Float.valueOf(r51Var.w(j)), "fpsAvg");
                java.lang.Float[] fArr = (java.lang.Float[]) r51Var.y(j).toArray(new java.lang.Float[0]);
                double d = 0.0d;
                for (java.lang.Float f : fArr) {
                    d += f.floatValue();
                }
                double length = d / fArr.length;
                int length2 = fArr.length;
                int i2 = 0;
                double d2 = 0.0d;
                while (i2 < length2) {
                    double floatValue = fArr[i2].floatValue() - length;
                    d2 += floatValue * floatValue;
                    i2++;
                    fArr = fArr;
                }
                zt0Var.m(java.lang.Double.valueOf(d2 / fArr.length), "fpsVariance");
                zt0Var.m(java.lang.Double.valueOf(r51Var.x(j)), "fpsCV");
                zt0Var.m(java.lang.Integer.valueOf(r51Var.m(j)), "bigJank");
                zt0Var.m(java.lang.Integer.valueOf(r51Var.D(j)), "jank");
                zt0Var.m(java.lang.Double.valueOf(r51Var.F(j)), "powerAvg");
                zt0Var.m(java.lang.Double.valueOf(r51Var.H(j)), "powerMin");
                zt0Var.m(java.lang.Double.valueOf(r51Var.G(j)), "powerMax");
                float f2 = 0.0f;
                try {
                    android.database.sqlite.SQLiteDatabase e = r51Var.e();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(j);
                    android.database.Cursor rawQuery = e.rawQuery("select max(temperature) from fps_record where session = ?", new java.lang.String[]{sb.toString()});
                    a.wv.v(rawQuery, "database.rawQuery(\n     … sessionId)\n            )");
                    while (rawQuery.moveToNext()) {
                        f2 = rawQuery.getFloat(0);
                    }
                    rawQuery.close();
                } catch (java.lang.Exception unused) {
                }
                zt0Var.m(java.lang.Float.valueOf(f2), "batTempMax");
                zt0Var.m(java.lang.Float.valueOf(r51Var.t(j)), "cpuTempMax");
                zt0Var.m(java.lang.Float.valueOf(r51Var.u(j)), "cpuTempMin");
                zt0Var.m(java.lang.Float.valueOf(r51Var.r(j)), "cpuTempAvg");
                zt0Var.m(java.lang.Integer.valueOf(((a.jt0) obj).f269a.size() + 1), "duration");
                return;
            default:
                a.wv.w(zt0Var, "$this$$receiver");
                com.omarea.vtools.activities.ActivityPerfBench activityPerfBench = (com.omarea.vtools.activities.ActivityPerfBench) obj2;
                a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityPerfBench.z;
                activityPerfBench.getClass();
                a.gu0[] gu0VarArr2 = com.omarea.vtools.activities.ActivityPerfBench.z;
                zt0Var.m(java.lang.Integer.valueOf(((com.omarea.common.ui.SeekBar) activityPerfBench.e.a(gu0VarArr2[3])).getProgress()), "coreCount");
                zt0Var.m(java.lang.Integer.valueOf(((com.omarea.common.ui.SeekBar) activityPerfBench.h.a(gu0VarArr2[6])).getProgress()), "targetLoad");
                zt0Var.m(java.lang.Long.valueOf(j), "durationMS");
                zt0Var.m(java.lang.Integer.valueOf(((com.omarea.common.ui.SeekBar) activityPerfBench.g.a(gu0VarArr2[5])).getProgress()), "period");
                zt0Var.m(((com.omarea.common.ui.Tags) activityPerfBench.d.a(gu0VarArr2[2])).getCheckedIndex() == 1 ? "float" : "int", "mode");
                boolean[] zArr = (boolean[]) ((a.ma1) obj).c;
                a.wv.w(zArr, "<this>");
                java.lang.Boolean[] boolArr = new java.lang.Boolean[zArr.length];
                int length3 = zArr.length;
                for (int i3 = 0; i3 < length3; i3++) {
                    boolArr[i3] = java.lang.Boolean.valueOf(zArr[i3]);
                }
                zt0Var.v("cpus", boolArr);
                zt0Var.m(java.lang.Boolean.FALSE, "smartCore");
                return;
        }
    }

    @Override // a.bp0
    public final /* bridge */ /* synthetic */ java.lang.Object i(java.lang.Object obj) {
        a.no1 no1Var = a.no1.f387a;
        switch (this.d) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a((a.zt0) obj);
                return no1Var;
            default:
                a((a.zt0) obj);
                return no1Var;
        }
    }
}
