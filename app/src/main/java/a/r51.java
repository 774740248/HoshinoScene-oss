package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class r51 extends android.database.sqlite.SQLiteOpenHelper {
    public final a.vj1 c;

    public r51(android.content.Context context) {
        super(context, "perf_monitor", (android.database.sqlite.SQLiteDatabase.CursorFactory) null, 7);
        this.c = new a.vj1(new a.cd1(4, this));
    }

    public static java.lang.String c(java.lang.Integer[] numArr) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Integer num : numArr) {
            arrayList.add(java.lang.Integer.valueOf(num.intValue()));
        }
        try {
            a.nk nkVar = new a.nk(6, 0);
            a.mt0 mt0Var = a.mt0.c;
            nkVar.I(mt0Var, "[");
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                nkVar.W(it.next());
            }
            nkVar.d(mt0Var, a.mt0.d, "]");
            str = nkVar.toString();
        } catch (a.kt0 unused) {
            str = null;
        }
        a.wv.v(str, "jsonObject.toString()");
        return str;
    }

    public static java.lang.String d(java.lang.Double[] dArr) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Double d : dArr) {
            double doubleValue = d.doubleValue();
            a.b20.s(doubleValue);
            arrayList.add(java.lang.Double.valueOf(doubleValue));
        }
        try {
            a.nk nkVar = new a.nk(6, 0);
            a.mt0 mt0Var = a.mt0.c;
            nkVar.I(mt0Var, "[");
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                nkVar.W(it.next());
            }
            nkVar.d(mt0Var, a.mt0.d, "]");
            str = nkVar.toString();
        } catch (a.kt0 unused) {
            str = null;
        }
        a.wv.v(str, "jsonObject.toString()");
        return str;
    }

    public static java.util.ArrayList j(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            a.jt0 jt0Var = new a.jt0(str);
            int size = jt0Var.f269a.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(java.lang.Integer.valueOf(jt0Var.b(i) / 1000));
            }
        } catch (java.lang.Exception unused) {
        }
        return arrayList;
    }

    public static java.util.ArrayList k(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            a.jt0 jt0Var = new a.jt0(str);
            int size = jt0Var.f269a.size();
            for (int i = 0; i < size; i++) {
                java.lang.Object a2 = jt0Var.a(i);
                java.lang.Double v1 = a.b20.v1(a2);
                if (v1 == null) {
                    a.b20.A1(java.lang.Integer.valueOf(i), a2, "double");
                    throw null;
                }
                arrayList.add(java.lang.Float.valueOf((float) v1.doubleValue()));
            }
        } catch (java.lang.Exception unused) {
        }
        return arrayList;
    }

    public final float A(long j) {
        float f = 0.0f;
        try {
            android.database.sqlite.SQLiteDatabase e = e();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(j);
            android.database.Cursor rawQuery = e.rawQuery("select min(fps) from fps_record where session = ?", new java.lang.String[]{sb.toString()});
            a.wv.v(rawQuery, "database.rawQuery(\n     … sessionId)\n            )");
            while (rawQuery.moveToNext()) {
                f = rawQuery.getFloat(0);
            }
            rawQuery.close();
        } catch (java.lang.Exception unused) {
        }
        return f;
    }

    public final java.util.ArrayList B(long j) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            android.database.sqlite.SQLiteDatabase e = e();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(j);
            android.database.Cursor rawQuery = e.rawQuery("select gpu_frequency from fps_record where session = ?", new java.lang.String[]{sb.toString()});
            a.wv.v(rawQuery, "database.rawQuery(\n     … sessionId)\n            )");
            while (rawQuery.moveToNext()) {
                arrayList.add(java.lang.Integer.valueOf(rawQuery.getInt(0)));
            }
            rawQuery.close();
        } catch (java.lang.Exception unused) {
        }
        return arrayList;
    }

    public final java.util.ArrayList C(long j) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            android.database.sqlite.SQLiteDatabase e = e();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(j);
            android.database.Cursor rawQuery = e.rawQuery("select gpu_load from fps_record where session = ?", new java.lang.String[]{sb.toString()});
            a.wv.v(rawQuery, "database.rawQuery(\n     … sessionId)\n            )");
            while (rawQuery.moveToNext()) {
                arrayList.add(java.lang.Float.valueOf(rawQuery.getFloat(0)));
            }
            rawQuery.close();
        } catch (java.lang.Exception unused) {
        }
        return arrayList;
    }

    public final int D(long j) {
        int i = 0;
        try {
            android.database.sqlite.SQLiteDatabase e = e();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(j);
            android.database.Cursor rawQuery = e.rawQuery("select sum(jank) from fps_record where session = ?", new java.lang.String[]{sb.toString()});
            a.wv.v(rawQuery, "database.rawQuery(\n     … sessionId)\n            )");
            int i2 = 0;
            while (rawQuery.moveToNext()) {
                try {
                    i2 = rawQuery.getInt(0);
                } catch (java.lang.Exception unused) {
                    i = i2;
                    return i;
                }
            }
            rawQuery.close();
            return i2;
        } catch (java.lang.Exception unused2) {
        }
    }

    public final java.util.ArrayList E(long j, java.lang.String str) {
        int i;
        a.wv.w(str, "column");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(j);
            android.database.Cursor rawQuery = e().rawQuery("select a.id, b.cpu, b." + str + " from fps_record as a left join perf_stall as b on a.id = b.rid where a.session = ? order by a.id, b.cpu", new java.lang.String[]{sb.toString()});
            a.wv.v(rawQuery, "database.rawQuery(\n     … sessionId)\n            )");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            long j2 = -1;
            while (rawQuery.moveToNext()) {
                long j3 = rawQuery.getLong(0);
                if (j3 != j2) {
                    if (j2 != -1) {
                        arrayList.add(arrayList2);
                    }
                    arrayList2 = new java.util.ArrayList();
                    j2 = j3;
                }
                if (!rawQuery.isNull(1)) {
                    int i2 = rawQuery.getInt(1);
                    long j4 = rawQuery.getLong(2);
                    int i3 = j4 > 2147483647L ? Integer.MAX_VALUE : j4 < 0 ? 0 : (int) j4;
                    while (arrayList2.size() < i2) {
                        arrayList2.add(0);
                    }
                    if (arrayList2.size() == i2) {
                        arrayList2.add(java.lang.Integer.valueOf(i3));
                    } else if (i2 >= 0 && i2 < arrayList2.size()) {
                        arrayList2.set(i2, java.lang.Integer.valueOf(i3));
                    }
                }
            }
            if (j2 != -1) {
                arrayList.add(arrayList2);
            }
            rawQuery.close();
            java.util.Iterator it = arrayList.iterator();
            i = 0;
            while (it.hasNext()) {
                java.util.ArrayList arrayList3 = (java.util.ArrayList) it.next();
                if (arrayList3.size() > i) {
                    i = arrayList3.size();
                }
            }
        } catch (java.lang.Exception unused) {
        }
        if (i < 1) {
            return new java.util.ArrayList();
        }
        java.util.Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            java.util.ArrayList arrayList4 = (java.util.ArrayList) it2.next();
            while (arrayList4.size() < i) {
                arrayList4.add(0);
            }
        }
        return arrayList;
    }

    public final double F(long j) {
        double d = 0.0d;
        try {
            android.database.sqlite.SQLiteDatabase e = e();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(j);
            android.database.Cursor rawQuery = e.rawQuery("select avg(bat_current * voltage) / 1000 from fps_record where session = ?", new java.lang.String[]{sb.toString()});
            a.wv.v(rawQuery, "database.rawQuery(\n     … sessionId)\n            )");
            while (rawQuery.moveToNext()) {
                d = rawQuery.getDouble(0);
            }
            rawQuery.close();
        } catch (java.lang.Exception unused) {
        }
        return d;
    }

    public final double G(long j) {
        double d = 0.0d;
        try {
            android.database.sqlite.SQLiteDatabase e = e();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(j);
            android.database.Cursor rawQuery = e.rawQuery("select max(bat_current * voltage) / 1000 from fps_record where session = ?", new java.lang.String[]{sb.toString()});
            a.wv.v(rawQuery, "database.rawQuery(\n     … sessionId)\n            )");
            while (rawQuery.moveToNext()) {
                d = rawQuery.getDouble(0);
            }
            rawQuery.close();
        } catch (java.lang.Exception unused) {
        }
        return d;
    }

    public final double H(long j) {
        double d = 0.0d;
        try {
            android.database.sqlite.SQLiteDatabase e = e();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(j);
            android.database.Cursor rawQuery = e.rawQuery("select min(bat_current * voltage) / 1000 from fps_record where session = ?", new java.lang.String[]{sb.toString()});
            a.wv.v(rawQuery, "database.rawQuery(\n     … sessionId)\n            )");
            while (rawQuery.moveToNext()) {
                d = rawQuery.getDouble(0);
            }
            rawQuery.close();
        } catch (java.lang.Exception unused) {
        }
        return d;
    }

    public final java.util.ArrayList I(long j) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            android.database.sqlite.SQLiteDatabase e = e();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(j);
            android.database.Cursor rawQuery = e.rawQuery("select temperature from fps_record where session = ?", new java.lang.String[]{sb.toString()});
            a.wv.v(rawQuery, "database.rawQuery(\n     … sessionId)\n            )");
            while (rawQuery.moveToNext()) {
                arrayList.add(java.lang.Float.valueOf(rawQuery.getFloat(0)));
            }
            rawQuery.close();
        } catch (java.lang.Exception unused) {
        }
        return arrayList;
    }

    public final java.util.ArrayList J() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            android.database.Cursor rawQuery = e().rawQuery("select id, time, package_name, remark, duration, fps, power, mode, cloud_id from session join (select session, count(session) as duration, count(session) as duration, avg (fps) as fps, avg(bat_current * voltage / 1000) as power from fps_record group by session) on id == session order by id desc", new java.lang.String[0]);
            a.wv.v(rawQuery, "database.rawQuery(\n     …  arrayOf()\n            )");
            while (rawQuery.moveToNext()) {
                arrayList.add(new a.q51(rawQuery, 1));
            }
            rawQuery.close();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    public final void K(long j, java.lang.String str) {
        a.wv.w(str, "cloudID");
        try {
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put("cloud_id", str);
            android.database.sqlite.SQLiteDatabase e = e();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(j);
            e.update("session", contentValues, "id = ?", new java.lang.String[]{sb.toString()});
        } catch (java.lang.Exception unused) {
        }
    }

    public final void a(long j) {
        try {
            android.database.sqlite.SQLiteDatabase e = e();
            java.lang.Object[] objArr = {java.lang.Long.valueOf(j)};
            e.execSQL("delete from session where id = ?", objArr);
            e.execSQL("delete from fps_record where session = ?", objArr);
            e.execSQL("delete from perf_event where session = ?", objArr);
            e.execSQL("delete from threads where session = ?", objArr);
            e.execSQL("delete from perf_stall where session = ?", objArr);
        } catch (java.lang.Exception unused) {
        }
    }

    public final java.lang.String b(long j) {
        int i;
        android.database.sqlite.SQLiteDatabase e = e();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(j);
        android.database.Cursor rawQuery = e.rawQuery("select a.id, a.fps, a.jank, a.big_jank, a.max_ftime, a.cpu_loads, a.cpu_frequencies, b.cycles, a.cpu_temperature, a.ddr_freq, a.gpu_load, a.gpu_frequency, a.capacity, a.temperature, a.bat_current, a.voltage from fps_record as a left join perf_event as b on a.id = b.id where a.session = ?", new java.lang.String[]{sb.toString()});
        a.wv.v(rawQuery, "database.rawQuery(\n     …d\n            )\n        )");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String[] strArr = {"id", "fps", "jank", "big_jank", "max_ftime", "cpu_loads", "cpu_frequencies", "cycles", "cpu_temperature", "ddr_freq", "gpu_load", "gpu_frequency", "capacity", "temperature", "bat_current", "voltage"};
        a.jt0 jt0Var = new a.jt0();
        while (true) {
            if (!rawQuery.moveToNext()) {
                break;
            }
            long j2 = rawQuery.getLong(0);
            java.lang.Long valueOf = java.lang.Long.valueOf(j2);
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(rawQuery.getInt(1));
            java.lang.Integer valueOf3 = java.lang.Integer.valueOf(rawQuery.getInt(2));
            java.lang.Integer valueOf4 = java.lang.Integer.valueOf(rawQuery.getInt(3));
            java.lang.Integer valueOf5 = java.lang.Integer.valueOf(rawQuery.getInt(4));
            java.lang.String string = rawQuery.getString(5);
            a.wv.v(string, "cursor.getString(5)");
            java.lang.String string2 = rawQuery.getString(6);
            java.lang.String[] strArr2 = strArr;
            a.wv.v(string2, "cursor.getString(6)");
            java.lang.String string3 = rawQuery.getString(7);
            a.wv.v(string3, "cursor.getString(7)");
            a.yt0 yt0Var = new a.yt0(valueOf, valueOf2, valueOf3, valueOf4, valueOf5, string, string2, string3, java.lang.Float.valueOf(rawQuery.getFloat(8)), java.lang.Integer.valueOf(rawQuery.getInt(9)), java.lang.Float.valueOf(rawQuery.getFloat(10)), java.lang.Integer.valueOf(rawQuery.getInt(11)), java.lang.Integer.valueOf(rawQuery.getInt(12)), java.lang.Float.valueOf(rawQuery.getFloat(13)), java.lang.Integer.valueOf(rawQuery.getInt(14)), java.lang.Float.valueOf(rawQuery.getFloat(15)));
            arrayList.add(java.lang.Long.valueOf(j2));
            jt0Var.e(yt0Var);
            strArr = strArr2;
        }
        java.lang.String[] strArr3 = strArr;
        rawQuery.close();
        a.l51 f = f(j);
        com.omarea.model.FpsWatchSession l = l(j);
        java.util.ArrayList h = h(j);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (i = 0; i < 5 && i < h.size(); i++) {
            arrayList2.add(g(((a.bm1) h.get(i)).f46a, j, ((a.bm1) h.get(i)).a()));
        }
        a.p51 p51Var = new a.p51(arrayList2, j, this, l, f, jt0Var, strArr3, h, arrayList);
        a.lt0 lt0Var = new a.lt0();
        p51Var.i(lt0Var);
        java.lang.String lt0Var2 = lt0Var.toString();
        a.wv.v(lt0Var2, "fun exportJSON(sessionId…     return jsonStr\n    }");
        return lt0Var2;
    }

    public final android.database.sqlite.SQLiteDatabase e() {
        return (android.database.sqlite.SQLiteDatabase) this.c.a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [a.l51, java.lang.Object] */
    public final a.l51 f(long j) {
        a.l51 obj = new a.l51();
        obj.i = "";
        obj.j = "";
        try {
            android.database.sqlite.SQLiteDatabase e = e();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(j);
            android.database.Cursor rawQuery = e.rawQuery("select sdk_int, platform, machine, manufacturer, model, market_model, mode, working_mode, version, cloud_id from session where id = ?", new java.lang.String[]{sb.toString()});
            a.wv.v(rawQuery, "database.rawQuery(\n     … sessionId)\n            )");
            while (rawQuery.moveToNext()) {
                obj.f310a = rawQuery.getInt(0);
                java.lang.String string = rawQuery.getString(1);
                a.wv.v(string, "cursor.getString(1)");
                obj.b = string;
                java.lang.String string2 = rawQuery.getString(2);
                a.wv.v(string2, "cursor.getString(2)");
                obj.c = string2;
                java.lang.String string3 = rawQuery.getString(3);
                a.wv.v(string3, "cursor.getString(3)");
                obj.d = string3;
                java.lang.String string4 = rawQuery.getString(4);
                a.wv.v(string4, "cursor.getString(4)");
                obj.e = string4;
                obj.f = rawQuery.getString(5);
                java.lang.String string5 = rawQuery.getString(6);
                a.wv.v(string5, "cursor.getString(6)");
                obj.h = string5;
                java.lang.String string6 = rawQuery.getString(7);
                a.wv.v(string6, "cursor.getString(7)");
                obj.g = string6;
                java.lang.String string7 = rawQuery.getString(8);
                a.wv.v(string7, "cursor.getString(8)");
                obj.i = string7;
                java.lang.String string8 = rawQuery.getString(9);
                a.wv.v(string8, "cursor.getString(9)");
                obj.j = string8;
            }
            rawQuery.close();
        } catch (java.lang.Exception e2) {
            e2.getMessage();
        }
        return obj;
    }

    public final java.util.ArrayList g(int i, long j, java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            android.database.sqlite.SQLiteDatabase e = e();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(j);
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(i);
            android.database.Cursor rawQuery = e.rawQuery("select id, rid, tid, duration, load, cpus, cpu from threads where session = ? and tid = ? and comm = ?", new java.lang.String[]{sb.toString(), sb2.toString(), str});
            a.wv.v(rawQuery, "database.rawQuery(\n     …          )\n            )");
            while (rawQuery.moveToNext()) {
                a.am1 am1Var = new a.am1();
                rawQuery.getLong(0);
                am1Var.b = rawQuery.getLong(1);
                am1Var.f19a = rawQuery.getInt(2);
                am1Var.e = rawQuery.getLong(3);
                am1Var.f = rawQuery.getDouble(4);
                am1Var.g = str;
                java.lang.String string = rawQuery.getString(5);
                a.wv.v(string, "cursor.getString(5)");
                am1Var.c = string;
                am1Var.d = rawQuery.getInt(6);
                arrayList.add(am1Var);
            }
            rawQuery.close();
        } catch (java.lang.Exception unused) {
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [a.bm1, java.lang.Object] */
    public final java.util.ArrayList h(long j) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        i(j);
        long j2 = 2;
        try {
            android.database.sqlite.SQLiteDatabase e = e();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(j);
            android.database.Cursor rawQuery = e.rawQuery("select tid, sum(duration), sum(load), max(load), comm, min(rid), max(rid) from threads where session = ? group by tid, comm", new java.lang.String[]{sb.toString()});
            a.wv.v(rawQuery, "database.rawQuery(\n     … sessionId)\n            )");
            while (rawQuery.moveToNext()) {
                a.bm1 obj = new a.bm1();
                obj.f46a = rawQuery.getInt(0);
                obj.b = rawQuery.getLong(1);
                obj.d = rawQuery.getDouble(2);
                obj.e = rawQuery.getDouble(3);
                java.lang.String string = rawQuery.getString(4);
                a.wv.v(string, "cursor.getString(4)");
                obj.f = string;
                obj.c = obj.d / ((rawQuery.getLong(6) - rawQuery.getLong(5)) + j2);
                arrayList.add(obj);
            }
            rawQuery.close();
        } catch (java.lang.Exception unused) {
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a.bm1 next = (bm1) it.next();
            a.bm1 bm1Var = (a.bm1) next;
            if (bm1Var.c >= 0.1d && bm1Var.e >= 1.0d) {
                arrayList2.add(next);
            }
        }
        java.util.ArrayList x2 = a.qv.x2(arrayList2);
        if (x2.size() > 1) {
            a.ov.Z1(x2, new a.py(9));
        }
        return x2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [a.v01, java.lang.Object] */
    public final a.v01 i(long j) {
        a.v01 obj = new a.v01();
        try {
            android.database.sqlite.SQLiteDatabase e = e();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(j);
            android.database.Cursor rawQuery = e.rawQuery("select min(id), max(id) from fps_record where session = ?", new java.lang.String[]{sb.toString()});
            a.wv.v(rawQuery, "database.rawQuery(\n     … sessionId)\n            )");
            while (rawQuery.moveToNext()) {
                obj.f616a = rawQuery.getLong(0);
                obj.b = rawQuery.getLong(1);
            }
            rawQuery.close();
        } catch (java.lang.Exception e2) {
            e2.getMessage();
        }
        return obj;
    }

    public final com.omarea.model.FpsWatchSession l(long j) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            android.database.sqlite.SQLiteDatabase e = e();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(j);
            android.database.Cursor rawQuery = e.rawQuery("select id, cloud_id, time, app_name, package_name, version, view_size, remark from session where id = ?", new java.lang.String[]{sb.toString()});
            a.wv.v(rawQuery, "database.rawQuery(\n     … sessionId)\n            )");
            while (rawQuery.moveToNext()) {
                arrayList.add(new a.q51(rawQuery, 0));
            }
            rawQuery.close();
        } catch (java.lang.Exception unused) {
        }
        if (arrayList.size() > 0) {
            return (com.omarea.model.FpsWatchSession) arrayList.get(0);
        }
        return null;
    }

    public final int m(long j) {
        int i = 0;
        try {
            android.database.sqlite.SQLiteDatabase e = e();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(j);
            android.database.Cursor rawQuery = e.rawQuery("select sum(big_jank) from fps_record where session = ?", new java.lang.String[]{sb.toString()});
            a.wv.v(rawQuery, "database.rawQuery(\n     … sessionId)\n            )");
            int i2 = 0;
            while (rawQuery.moveToNext()) {
                try {
                    i2 = rawQuery.getInt(0);
                } catch (java.lang.Exception unused) {
                    i = i2;
                    return i;
                }
            }
            rawQuery.close();
            return i2;
        } catch (java.lang.Exception unused2) {
        }
    }

    public final java.util.ArrayList n(long j) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            android.database.sqlite.SQLiteDatabase e = e();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(j);
            android.database.Cursor rawQuery = e.rawQuery("select capacity from fps_record where session = ?", new java.lang.String[]{sb.toString()});
            a.wv.v(rawQuery, "database.rawQuery(\n     … sessionId)\n            )");
            while (rawQuery.moveToNext()) {
                arrayList.add(java.lang.Float.valueOf(rawQuery.getFloat(0)));
            }
            rawQuery.close();
        } catch (java.lang.Exception unused) {
        }
        return arrayList;
    }

    public final java.util.ArrayList o(long j) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            android.database.sqlite.SQLiteDatabase e = e();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(j);
            android.database.Cursor rawQuery = e.rawQuery("select cycles from perf_event where session = ?", new java.lang.String[]{sb.toString()});
            a.wv.v(rawQuery, "database.rawQuery(\n     … sessionId)\n            )");
            while (rawQuery.moveToNext()) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                a.jt0 jt0Var = new a.jt0(rawQuery.getString(0));
                int size = jt0Var.f269a.size();
                for (int i = 0; i < size; i++) {
                    arrayList2.add(java.lang.Integer.valueOf(jt0Var.b(i) / 1000));
                }
                arrayList.add(arrayList2);
            }
            rawQuery.close();
        } catch (java.lang.Exception unused) {
        }
        return arrayList;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        a.wv.w(sQLiteDatabase, "db");
        try {
            sQLiteDatabase.execSQL("create table session(id INTEGER primary key, cloud_id text,time long,app_name text,package_name text,version text,sdk_int INTEGER,manufacturer text,platform text,machine text,scheme text,model text,market_model text,mode text,surface_view text,view_size text,remark text,working_mode text)");
            sQLiteDatabase.execSQL("create table fps_record(id INTEGER primary key AUTOINCREMENT,session INTEGER,fps REAL,jank REAL,big_jank REAL,max_ftime REAL,cpu_load REAL,cpu_loads text,cpu_frequencies text,cpu_temperature REAL,gpu_load REAL,gpu_frequency INTEGER,ddr_freq INTEGER,capacity INTEGER,temperature REAL,bat_current INTEGER, voltage REAL default(3.85),power_mode text)");
            sQLiteDatabase.execSQL("create table perf_event(id INTEGER primary key AUTOINCREMENT,session INTEGER,cycles text,ddr_freq INTEGER default(0),mem_available INTEGER default(0))");
            sQLiteDatabase.execSQL("create table threads(id INTEGER primary key AUTOINCREMENT,rid INTEGER,session INTEGER,tid INTEGER,duration long default(0),load REAL default(0),comm text,cpus text,cpu INTEGER default(-1))");
            sQLiteDatabase.execSQL("create table perf_mem(id INTEGER primary key AUTOINCREMENT,rid INTEGER,session INTEGER,cpu INTEGER,cache_references INTEGER default(0),cache_misses INTEGER default(0),mem_access INTEGER default(0),stall INTEGER default(0),stall_backend INTEGER default(0),stall_backend_membound INTEGER default(0),stall_frontend INTEGER default(0),stall_frontend_membound INTEGER default(0))");
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
        a.wv.w(sQLiteDatabase, "db");
        if (i < 3) {
            sQLiteDatabase.execSQL("ALTER TABLE session ADD COLUMN manufacturer TEXT DEFAULT ''");
            sQLiteDatabase.execSQL("ALTER TABLE session ADD COLUMN machine TEXT DEFAULT ''");
            sQLiteDatabase.execSQL("ALTER TABLE session ADD COLUMN working_mode TEXT DEFAULT ''");
            java.lang.String u = a.gy.u();
            java.lang.String z = a.gy.z();
            sQLiteDatabase.execSQL("UPDATE session SET manufacturer = ? where machine = ?", new java.lang.String[]{android.os.Build.MANUFACTURER, u});
            sQLiteDatabase.execSQL("UPDATE session SET machine = ? where platform = ?", new java.lang.String[]{u, u});
            sQLiteDatabase.execSQL("UPDATE session SET platform = ? where machine = ?", new java.lang.String[]{z, u});
        }
        if (i < 4) {
            sQLiteDatabase.execSQL("ALTER TABLE session ADD COLUMN market_model TEXT DEFAULT ''");
            sQLiteDatabase.execSQL("UPDATE session SET market_model = ? where model = ?", new java.lang.String[]{a.gy.w(), android.os.Build.MODEL});
            sQLiteDatabase.execSQL("UPDATE session SET cloud_id = ''");
        }
        if (i < 6) {
            sQLiteDatabase.execSQL("create table perf_stall(id INTEGER primary key AUTOINCREMENT,rid INTEGER,session INTEGER,cpu INTEGER,cache_references INTEGER default(0),cache_misses INTEGER default(0),mem_access INTEGER default(0),stall INTEGER default(0),stall_backend INTEGER default(0),stall_backend_membound INTEGER default(0),stall_frontend INTEGER default(0),stall_frontend_membound INTEGER default(0))");
        }
        if (i < 7) {
            sQLiteDatabase.execSQL("alter table threads add column cpu INTEGER default(-1)");
        }
    }

    public final java.util.ArrayList p(long j) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            android.database.sqlite.SQLiteDatabase e = e();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(j);
            android.database.Cursor rawQuery = e.rawQuery("select cpu_frequencies from fps_record where session = ?", new java.lang.String[]{sb.toString()});
            a.wv.v(rawQuery, "database.rawQuery(\n     … sessionId)\n            )");
            while (rawQuery.moveToNext()) {
                java.lang.String string = rawQuery.getString(0);
                a.wv.v(string, "cursor.getString(0)");
                arrayList.add(j(string));
            }
            rawQuery.close();
        } catch (java.lang.Exception unused) {
        }
        return arrayList;
    }

    public final java.util.ArrayList q(long j) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            android.database.sqlite.SQLiteDatabase e = e();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(j);
            android.database.Cursor rawQuery = e.rawQuery("select cpu_loads from fps_record where session = ?", new java.lang.String[]{sb.toString()});
            a.wv.v(rawQuery, "database.rawQuery(\n     … sessionId)\n            )");
            while (rawQuery.moveToNext()) {
                java.lang.String string = rawQuery.getString(0);
                a.wv.v(string, "cursor.getString(0)");
                arrayList.add(k(string));
            }
            rawQuery.close();
        } catch (java.lang.Exception unused) {
        }
        return arrayList;
    }

    public final float r(long j) {
        float f = 0.0f;
        try {
            android.database.sqlite.SQLiteDatabase e = e();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(j);
            android.database.Cursor rawQuery = e.rawQuery("select avg(cpu_temperature) from fps_record where session = ?", new java.lang.String[]{sb.toString()});
            a.wv.v(rawQuery, "database.rawQuery(\n     … sessionId)\n            )");
            while (rawQuery.moveToNext()) {
                f = rawQuery.getFloat(0);
            }
            rawQuery.close();
        } catch (java.lang.Exception unused) {
        }
        return f;
    }

    public final java.util.ArrayList s(long j) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            android.database.sqlite.SQLiteDatabase e = e();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(j);
            android.database.Cursor rawQuery = e.rawQuery("select cpu_temperature from fps_record where session = ?", new java.lang.String[]{sb.toString()});
            a.wv.v(rawQuery, "database.rawQuery(\n     … sessionId)\n            )");
            while (rawQuery.moveToNext()) {
                arrayList.add(java.lang.Double.valueOf(rawQuery.getDouble(0)));
            }
            rawQuery.close();
        } catch (java.lang.Exception unused) {
        }
        return arrayList;
    }

    public final float t(long j) {
        float f = 0.0f;
        try {
            android.database.sqlite.SQLiteDatabase e = e();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(j);
            android.database.Cursor rawQuery = e.rawQuery("select max(cpu_temperature) from fps_record where session = ?", new java.lang.String[]{sb.toString()});
            a.wv.v(rawQuery, "database.rawQuery(\n     … sessionId)\n            )");
            while (rawQuery.moveToNext()) {
                f = rawQuery.getFloat(0);
            }
            rawQuery.close();
        } catch (java.lang.Exception unused) {
        }
        return f;
    }

    public final float u(long j) {
        float f = 0.0f;
        try {
            android.database.sqlite.SQLiteDatabase e = e();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(j);
            android.database.Cursor rawQuery = e.rawQuery("select min(cpu_temperature) from fps_record where session = ?", new java.lang.String[]{sb.toString()});
            a.wv.v(rawQuery, "database.rawQuery(\n     … sessionId)\n            )");
            while (rawQuery.moveToNext()) {
                f = rawQuery.getFloat(0);
            }
            rawQuery.close();
        } catch (java.lang.Exception unused) {
        }
        return f;
    }

    public final java.util.ArrayList v(long j) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            android.database.sqlite.SQLiteDatabase e = e();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(j);
            android.database.Cursor rawQuery = e.rawQuery("select ddr_freq from fps_record where session = ?", new java.lang.String[]{sb.toString()});
            a.wv.v(rawQuery, "database.rawQuery(\n     … sessionId)\n            )");
            while (rawQuery.moveToNext()) {
                arrayList.add(java.lang.Integer.valueOf(rawQuery.getInt(0)));
            }
            rawQuery.close();
        } catch (java.lang.Exception unused) {
        }
        return arrayList;
    }

    public final float w(long j) {
        float f = 0.0f;
        try {
            android.database.sqlite.SQLiteDatabase e = e();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(j);
            android.database.Cursor rawQuery = e.rawQuery("select avg(fps) from fps_record where session = ?", new java.lang.String[]{sb.toString()});
            a.wv.v(rawQuery, "database.rawQuery(\n     … sessionId)\n            )");
            while (rawQuery.moveToNext()) {
                f = rawQuery.getFloat(0);
            }
            rawQuery.close();
        } catch (java.lang.Exception unused) {
        }
        return f;
    }

    public final double x(long j) {
        java.lang.Float[] fArr = (java.lang.Float[]) y(j).toArray(new java.lang.Float[0]);
        double d = 0.0d;
        double d2 = 0.0d;
        for (java.lang.Float f : fArr) {
            d2 += f.floatValue();
        }
        double length = d2 / fArr.length;
        for (java.lang.Float f2 : fArr) {
            double floatValue = f2.floatValue() - length;
            d += floatValue * floatValue;
        }
        return (java.lang.Math.sqrt(d / fArr.length) / w(j)) * 100;
    }

    public final java.util.ArrayList y(long j) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            android.database.sqlite.SQLiteDatabase e = e();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(j);
            android.database.Cursor rawQuery = e.rawQuery("select fps from fps_record where session = ?", new java.lang.String[]{sb.toString()});
            a.wv.v(rawQuery, "database.rawQuery(\n     … sessionId)\n            )");
            while (rawQuery.moveToNext()) {
                arrayList.add(java.lang.Float.valueOf(rawQuery.getFloat(0)));
            }
            rawQuery.close();
        } catch (java.lang.Exception unused) {
        }
        return arrayList;
    }

    public final float z(long j) {
        float f = 0.0f;
        try {
            android.database.sqlite.SQLiteDatabase e = e();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(j);
            android.database.Cursor rawQuery = e.rawQuery("select max(fps) from fps_record where session = ?", new java.lang.String[]{sb.toString()});
            a.wv.v(rawQuery, "database.rawQuery(\n     … sessionId)\n            )");
            while (rawQuery.moveToNext()) {
                f = rawQuery.getFloat(0);
            }
            rawQuery.close();
        } catch (java.lang.Exception e2) {
            android.util.Log.e("@Scene", "sessionMaxFps " + e2.getMessage());
        }
        return f;
    }
}
