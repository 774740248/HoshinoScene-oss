package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class i61 extends android.database.sqlite.SQLiteOpenHelper {
    public final a.vj1 c;

    public i61(android.content.Context context) {
        super(context, "power_bench", (android.database.sqlite.SQLiteDatabase.CursorFactory) null, 4);
        this.c = new a.vj1(new a.cd1(5, this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, a.h61] */
    public static a.h61 c(android.database.Cursor cursor) {
        a.h61 obj = new a.h61();
        obj.e = "int";
        obj.f201a = cursor.getLong(cursor.getColumnIndexOrThrow("id"));
        obj.b = cursor.getInt(cursor.getColumnIndexOrThrow("thread_count"));
        obj.c = cursor.getInt(cursor.getColumnIndexOrThrow("target_load"));
        cursor.getInt(cursor.getColumnIndexOrThrow("load_period_ms"));
        cursor.getInt(cursor.getColumnIndexOrThrow("step_duration"));
        java.util.List y2 = a.yi1.y2(a.b20.o0(cursor, "cpus"), new java.lang.String[]{","});
        java.util.ArrayList arrayList = new java.util.ArrayList(a.op.J1(y2, 10));
        java.util.Iterator it = y2.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Boolean.valueOf(a.wv.e((java.lang.String) it.next(), "1")));
        }
        obj.f = a.qv.u2(arrayList);
        cursor.getInt(cursor.getColumnIndexOrThrow("cpu_max_freq"));
        cursor.getInt(cursor.getColumnIndexOrThrow("cpu_max_freq"));
        obj.d = cursor.getInt(cursor.getColumnIndexOrThrow("ddr_min_freq"));
        obj.e = a.b20.o0(cursor, "method");
        obj.g = cursor.getInt(cursor.getColumnIndexOrThrow("idle_power"));
        cursor.getInt(cursor.getColumnIndexOrThrow("charging"));
        return obj;
    }

    public final android.database.sqlite.SQLiteDatabase a() {
        return (android.database.sqlite.SQLiteDatabase) this.c.a();
    }

    public final java.util.ArrayList b(long j) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor query = a().query("records", null, "session=?", new java.lang.String[]{java.lang.String.valueOf(j)}, null, null, null);
        while (query.moveToNext()) {
            try {
                boolean z = true;
                if (query.getInt(query.getColumnIndexOrThrow("pass")) != 1) {
                    z = false;
                }
                java.util.List y2 = a.yi1.y2(a.b20.o0(query, "frequencies"), new java.lang.String[]{","});
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.Iterator it = y2.iterator();
                while (it.hasNext()) {
                    java.lang.Integer c2 = a.wi1.c2((java.lang.String) it.next());
                    if (c2 != null) {
                        arrayList2.add(c2);
                    }
                }
                java.util.List y22 = a.yi1.y2(a.b20.o0(query, "cycles"), new java.lang.String[]{","});
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.util.Iterator it2 = y22.iterator();
                while (it2.hasNext()) {
                    java.lang.Integer c22 = a.wi1.c2((java.lang.String) it2.next());
                    if (c22 != null) {
                        arrayList3.add(c22);
                    }
                }
                a.g61 g61Var = new a.g61();
                g61Var.b = arrayList2;
                g61Var.f170a = arrayList3;
                g61Var.c = query.getInt(query.getColumnIndexOrThrow("power_total"));
                g61Var.d = query.getInt(query.getColumnIndexOrThrow("power_dynamic"));
                g61Var.e = query.getInt(query.getColumnIndexOrThrow("temperature_avg"));
                g61Var.f = query.getInt(query.getColumnIndexOrThrow("total_score"));
                g61Var.g = z;
                g61Var.h = a.b20.o0(query, "perf_stat");
                arrayList.add(g61Var);
            } finally {
            }
        }
        a.wv.z(query, null);
        return arrayList;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        a.wv.w(sQLiteDatabase, "db");
        try {
            sQLiteDatabase.execSQL("create table session(id INTEGER primary key, cloud_id text,time long,method varchar(10),thread_count INTEGER,target_load integer,load_period_ms integer,step_duration integer,cpus varchar(32),cpu_min_freq integer,cpu_max_freq integer,ddr_min_freq integer,idle_power integer,charging real,ram_access integer,remark text)");
            sQLiteDatabase.execSQL("create table records(id INTEGER primary key AUTOINCREMENT,session INTEGER,pass real,frequencies text,cycles string,power_total integer,power_dynamic integer,temperature_avg integer,temperature_max integer,total_score integer,perf_stat text,scores text)");
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
        a.wv.w(sQLiteDatabase, "db");
        if (i < 2) {
            sQLiteDatabase.execSQL("alter table session add column ram_access integer default 10", new java.lang.Object[0]);
        }
        if (i < 4) {
            sQLiteDatabase.execSQL("alter table records add column perf_stat text default null", new java.lang.Object[0]);
        }
    }
}
