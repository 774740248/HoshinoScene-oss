package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class au extends android.database.sqlite.SQLiteOpenHelper {
    public static a.au e;
    public static a.au f;
    public final /* synthetic */ int c;
    public java.lang.Object d;

    /* [修复] 从 smali 还原：R8 将多个构造器按 i 内联，super 只能调用一次。
       i==1 → "power8"; i==2 → "scene3_config"(v6) 且 d=context; 默认 → "charge8"。 */
    public au(android.content.Context context, int i) {
        super(context, i == 1 ? "power8" : (i == 2 ? "scene3_config" : "charge8"), (android.database.sqlite.SQLiteDatabase.CursorFactory) null, i == 2 ? 6 : 1);
        this.c = i;
        if (i == 2) {
            this.d = context;
        }
    }

    public static com.omarea.model.SceneConfigInfo b(android.database.Cursor cursor) {
        com.omarea.model.SceneConfigInfo sceneConfigInfo = new com.omarea.model.SceneConfigInfo();
        sceneConfigInfo.packageName = cursor.getString(cursor.getColumnIndex("id"));
        sceneConfigInfo.aloneLight = cursor.getInt(cursor.getColumnIndex("alone_light")) == 1;
        sceneConfigInfo.aloneLightValue = cursor.getInt(cursor.getColumnIndex("light"));
        sceneConfigInfo.disNotice = cursor.getInt(cursor.getColumnIndex("dis_notice")) == 1;
        sceneConfigInfo.disButton = cursor.getInt(cursor.getColumnIndex("dis_button")) == 1;
        sceneConfigInfo.gpsOn = cursor.getInt(cursor.getColumnIndex("gps_on")) == 1;
        sceneConfigInfo.freeze = cursor.getInt(cursor.getColumnIndex("freeze")) == 1;
        sceneConfigInfo.screenOrientation = cursor.getInt(cursor.getColumnIndex("screen_orientation"));
        sceneConfigInfo.showMonitor = cursor.getInt(cursor.getColumnIndex("show_monitor")) == 1;
        return sceneConfigInfo;
    }

    public static a.au e() {
        if (e == null) {
            e = new a.au(com.omarea.Scene.e, 0);
        }
        return e;
    }

    public static a.au f() {
        if (f == null) {
            f = new a.au(com.omarea.Scene.e, 1);
        }
        return f;
    }

    public final void a() {
        switch (this.c) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                m();
                try {
                    ((android.database.sqlite.SQLiteDatabase) this.d).execSQL("delete from records", new java.lang.String[0]);
                    return;
                } catch (java.lang.Exception unused) {
                    return;
                }
            default:
                try {
                    getWritableDatabase().delete("records", " 1 = 1", new java.lang.String[0]);
                    return;
                } catch (java.lang.Exception unused2) {
                    return;
                }
        }
    }

    public final com.omarea.model.SceneConfigInfo c(java.lang.String str) {
        com.omarea.model.SceneConfigInfo r1;
        if (!str.equals("standby")) {
            try {
                android.database.sqlite.SQLiteDatabase readableDatabase = getReadableDatabase();
                android.database.Cursor rawQuery = readableDatabase.rawQuery("select * from scene_config3 where id = ?", new java.lang.String[]{str});
                r1 = rawQuery.moveToNext() ? b(rawQuery) : null;
                rawQuery.close();
                readableDatabase.close();
            } catch (java.lang.Exception unused) {
                if (r1 == null) {
                    r1 = new com.omarea.model.SceneConfigInfo();
                }
            } catch (java.lang.Throwable th) {
                if (r1 == null) {
                    new com.omarea.model.SceneConfigInfo().packageName = str;
                }
                throw th;
            }
            if (r1 == null) {
                r1 = new com.omarea.model.SceneConfigInfo();
                r1.packageName = str;
            }
        }
        return r1;
    }

    public final java.util.ArrayList d() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            android.database.sqlite.SQLiteDatabase readableDatabase = getReadableDatabase();
            android.database.Cursor rawQuery = readableDatabase.rawQuery("select * from scene_config3 where freeze == 1", null);
            while (rawQuery.moveToNext()) {
                arrayList.add(rawQuery.getString(0));
            }
            rawQuery.close();
            readableDatabase.close();
        } catch (java.lang.Exception unused) {
        }
        return arrayList;
    }

    public final int g() {
        switch (this.c) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                m();
                try {
                    android.database.Cursor rawQuery = ((android.database.sqlite.SQLiteDatabase) this.d).rawQuery("select capacity from records order by time desc limit 1", new java.lang.String[0]);
                    try {
                        if (!rawQuery.moveToNext()) {
                            rawQuery.close();
                            return 0;
                        }
                        int i = rawQuery.getInt(0);
                        rawQuery.close();
                        return i;
                    } finally {
                    }
                } catch (java.lang.Exception unused) {
                    return 0;
                }
            default:
                m();
                android.database.Cursor rawQuery2 = ((android.database.sqlite.SQLiteDatabase) this.d).rawQuery("select capacity from records order by time desc", new java.lang.String[0]);
                try {
                    int i2 = rawQuery2.moveToNext() ? rawQuery2.getInt(0) : 0;
                    rawQuery2.close();
                    return i2;
                } catch (java.lang.Throwable th) {
                    if (rawQuery2 != null) {
                        try {
                            rawQuery2.close();
                        } catch (java.lang.Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final android.database.sqlite.SQLiteDatabase getReadableDatabase() {
        switch (this.c) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                if (((android.database.sqlite.SQLiteDatabase) this.d) == null) {
                    this.d = getWritableDatabase();
                }
                return (android.database.sqlite.SQLiteDatabase) this.d;
            default:
                return super.getReadableDatabase();
        }
    }

    public final int h() {
        android.database.Cursor rawQuery;
        int i;
        switch (this.c) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                m();
                rawQuery = ((android.database.sqlite.SQLiteDatabase) this.d).rawQuery("select session from records order by time desc limit 1", new java.lang.String[0]);
                try {
                    i = rawQuery.moveToNext() ? rawQuery.getInt(0) : 0;
                    rawQuery.close();
                    return i;
                } finally {
                }
            default:
                m();
                rawQuery = ((android.database.sqlite.SQLiteDatabase) this.d).rawQuery("select session from records order by time desc limit 1", new java.lang.String[0]);
                try {
                    i = rawQuery.moveToNext() ? rawQuery.getInt(0) : 0;
                    rawQuery.close();
                    return i;
                } finally {
                }
        }
    }

    public final a.zt i(int i) {
        m();
        android.database.Cursor rawQuery = ((android.database.sqlite.SQLiteDatabase) this.d).rawQuery("select min(time), max(time), (avg(current) * avg(voltage) * count(current) / 3600) from records where session = ?", new java.lang.String[]{a.ii1.d("", i)});
        try {
            if (!rawQuery.moveToNext()) {
                rawQuery.close();
                return null;
            }
            a.zt ztVar = new a.zt(i, rawQuery);
            try {
                rawQuery = ((android.database.sqlite.SQLiteDatabase) this.d).rawQuery("SELECT capacity FROM records WHERE time = (SELECT MIN(time) FROM records WHERE session = ?) OR time = (SELECT MAX(time) FROM records WHERE session = ?) ORDER BY time ASC", new java.lang.String[]{"" + i, "" + i});
            } catch (java.lang.Exception unused) {
            }
            try {
                int i2 = rawQuery.moveToNext() ? rawQuery.getInt(0) : 0;
                int i3 = i2;
                if (rawQuery.moveToNext()) {
                    i3 = rawQuery.getInt(0);
                }
                ztVar.capacityRatio = i3 - i2;
                rawQuery.close();
                rawQuery.close();
                return ztVar;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        } finally {
            if (rawQuery != null) {
                try {
                    rawQuery.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
        }
    }

    public final a.l61 j(int i) {
        m();
        android.database.Cursor rawQuery = ((android.database.sqlite.SQLiteDatabase) this.d).rawQuery("select a.*, b.p, b.used from (select session as s, min(time), max(time) from records where session = ? group by session) as a left join (select session as s, avg(current * voltage) as p, count(1) as used from records where session = ? and screen_on = 1 and status in (?, ?) group by session) as b on a.s = b.s", new java.lang.String[]{a.ii1.d("", i), a.ii1.d("", i), "3", "4"});
        try {
            if (!rawQuery.moveToNext()) {
                rawQuery.close();
                return null;
            }
            a.l61 l61Var = new a.l61(1, rawQuery);
            rawQuery.close();
            return l61Var;
        } catch (java.lang.Throwable th) {
            if (rawQuery != null) {
                try {
                    rawQuery.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public final java.util.ArrayList k() {
        android.database.Cursor rawQuery;
        switch (this.c) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                m();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                rawQuery = ((android.database.sqlite.SQLiteDatabase) this.d).rawQuery("SELECT a.s, a.ts, a.te, b.capacity, c.capacity FROM (    SELECT session AS s, MIN(time) AS ts, MAX(time) AS te     FROM records     GROUP BY session) AS a LEFT JOIN records AS b ON a.s = b.session AND a.ts = b.time LEFT JOIN records AS c ON a.s = c.session AND a.te = c.time", new java.lang.String[0]);
                while (rawQuery.moveToNext()) {
                    try {
                        arrayList.add(new a.zt(rawQuery));
                    } finally {
                    }
                }
                rawQuery.close();
                return arrayList;
            default:
                m();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                rawQuery = ((android.database.sqlite.SQLiteDatabase) this.d).rawQuery("select a.*, b.p, b.used from (select session as s, min(time), max(time) from records group by session) as a left join (select session as s, avg(current * voltage) as p, count(1) as used from records where screen_on = 1 and status in (?, ?) group by session) as b on a.s = b.s", new java.lang.String[]{"3", "4"});
                while (rawQuery.moveToNext()) {
                    try {
                        arrayList2.add(new a.l61(0, rawQuery));
                    } finally {
                    }
                }
                rawQuery.close();
                return arrayList2;
        }
    }

    public final int l() {
        a.l61 j;
        switch (this.c) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                java.util.ArrayList k = k();
                if (k.size() > 99) {
                    n(((com.omarea.model.ChargeStatSession) k.get(0)).session);
                    int[] iArr = {5, 10, 20};
                    int i = 1;
                    for (int i2 = 0; i2 < 3; i2++) {
                        int i3 = iArr[i2];
                        java.util.Iterator it = k.iterator();
                        while (it.hasNext()) {
                            if (((com.omarea.model.ChargeStatSession) it.next()).capacityRatio < i3) {
                                n(((com.omarea.model.ChargeStatSession) k.get(0)).session);
                                i++;
                            }
                        }
                        if (i <= 10) {
                        }
                    }
                }
                com.omarea.model.ChargeStatSession chargeStatSession = k.isEmpty() ? null : (com.omarea.model.ChargeStatSession) k.get(k.size() - 1);
                if (chargeStatSession != null && chargeStatSession.endTime - chargeStatSession.beginTime < 30000 && chargeStatSession.capacityRatio < 5) {
                    n(chargeStatSession.session);
                }
                if (k.isEmpty()) {
                    return 1;
                }
                return 1 + chargeStatSession.session;
            default:
                java.util.ArrayList k2 = k();
                if (k2.size() > 99) {
                    n(((com.omarea.model.PowerStatSession) k2.get(0)).session);
                    int[] iArr2 = {100, 300, 600};
                    int i4 = 1;
                    for (int i5 = 0; i5 < 3; i5++) {
                        int i6 = iArr2[i5];
                        java.util.Iterator it2 = k2.iterator();
                        while (it2.hasNext()) {
                            if (((com.omarea.model.PowerStatSession) it2.next()).used < i6) {
                                n(((com.omarea.model.PowerStatSession) k2.get(0)).session);
                                i4++;
                            }
                        }
                        if (i4 <= 10) {
                        }
                    }
                }
                com.omarea.model.PowerStatSession powerStatSession = k2.isEmpty() ? null : (com.omarea.model.PowerStatSession) k2.get(k2.size() - 1);
                if (powerStatSession != null && (j = j(powerStatSession.session)) != null && (j.used * 3000) / 60000 < 3) {
                    n(j.session);
                }
                if (k2.isEmpty()) {
                    return 0;
                }
                return ((com.omarea.model.PowerStatSession) k2.get(k2.size() - 1)).session + 1;
        }
    }

    public final void m() {
        switch (this.c) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                android.database.sqlite.SQLiteDatabase sQLiteDatabase = (android.database.sqlite.SQLiteDatabase) this.d;
                if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
                    this.d = getWritableDatabase();
                    return;
                }
                return;
            default:
                android.database.sqlite.SQLiteDatabase sQLiteDatabase2 = (android.database.sqlite.SQLiteDatabase) this.d;
                if (sQLiteDatabase2 == null || !sQLiteDatabase2.isOpen()) {
                    this.d = getWritableDatabase();
                    return;
                }
                return;
        }
    }

    public final void n(int i) {
        switch (this.c) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                m();
                try {
                    ((android.database.sqlite.SQLiteDatabase) this.d).execSQL("delete from records where session = ?", new java.lang.String[]{"" + i});
                    return;
                } catch (java.lang.Exception unused) {
                    return;
                }
            default:
                m();
                try {
                    ((android.database.sqlite.SQLiteDatabase) this.d).delete("records", " session = ?", new java.lang.String[]{"" + i});
                    return;
                } catch (java.lang.Exception unused2) {
                    return;
                }
        }
    }

    public final boolean o(com.omarea.model.SceneConfigInfo sceneConfigInfo) {
        android.database.sqlite.SQLiteDatabase writableDatabase = getWritableDatabase();
        getWritableDatabase().beginTransaction();
        try {
            writableDatabase.execSQL("delete from scene_config3 where id = ?", new java.lang.String[]{sceneConfigInfo.packageName});
            writableDatabase.execSQL("insert into scene_config3(id, alone_light, light, dis_notice, dis_button, gps_on, freeze, screen_orientation, show_monitor) values (?, ?, ?, ?, ?, ?, ?, ?, ?)", new java.lang.Object[]{sceneConfigInfo.packageName, java.lang.Integer.valueOf(sceneConfigInfo.aloneLight ? 1 : 0), java.lang.Integer.valueOf(sceneConfigInfo.aloneLightValue), java.lang.Integer.valueOf(sceneConfigInfo.disNotice ? 1 : 0), java.lang.Integer.valueOf(sceneConfigInfo.disButton ? 1 : 0), java.lang.Integer.valueOf(sceneConfigInfo.gpsOn ? 1 : 0), java.lang.Integer.valueOf(sceneConfigInfo.freeze ? 1 : 0), java.lang.Integer.valueOf(sceneConfigInfo.screenOrientation), java.lang.Integer.valueOf(sceneConfigInfo.showMonitor ? 1 : 0)});
            writableDatabase.setTransactionSuccessful();
            return true;
        } catch (java.lang.Exception unused) {
            return false;
        } finally {
            writableDatabase.endTransaction();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        switch (this.c) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                try {
                    sQLiteDatabase.execSQL("create table records(time text primary key, session int, current INTEGER, voltage REAL,capacity INTEGER, temperature REAL)");
                    return;
                } catch (java.lang.Exception unused) {
                    return;
                }
            case 1:
                try {
                    sQLiteDatabase.execSQL("create table records(time text primary key, session int, temperature REAL default(-1), status int default(-1),mode text,current int default(-1),voltage int,package text,screen_on INTEGER,capacity INTEGER)");
                    return;
                } catch (java.lang.Exception unused2) {
                    return;
                }
            default:
                try {
                    sQLiteDatabase.execSQL("create table scene_config3(id text primary key, alone_light int default(0), light int default(-1), dis_notice int default(0),dis_button int default(0),gps_on int default(0),freeze int default(0),screen_orientation int default(-1),fg_cgroup_mem text default(''),bg_cgroup_mem text default(''),dynamic_boost_mem int default(0),show_monitor int default(0))");
                    return;
                } catch (java.lang.Exception unused3) {
                    return;
                }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
        switch (this.c) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
            case 1:
                return;
            default:
                if (i < 3) {
                    try {
                        sQLiteDatabase.execSQL("alter table scene_config3 add column screen_orientation int default(-1)");
                    } catch (java.lang.Exception unused) {
                    }
                }
                if (i < 4) {
                    try {
                        sQLiteDatabase.execSQL("alter table scene_config3 add column fg_cgroup_mem text default('')");
                        sQLiteDatabase.execSQL("alter table scene_config3 add column bg_cgroup_mem text default('')");
                    } catch (java.lang.Exception unused2) {
                    }
                }
                if (i < 5) {
                    try {
                        sQLiteDatabase.execSQL("alter table scene_config3 add column dynamic_boost_mem text default(0)");
                    } catch (java.lang.Exception unused3) {
                    }
                }
                if (i < 6) {
                    try {
                        sQLiteDatabase.execSQL("alter table scene_config3 add column show_monitor text default(0)");
                        return;
                    } catch (java.lang.Exception unused4) {
                        return;
                    }
                }
                return;
        }
    }
}
