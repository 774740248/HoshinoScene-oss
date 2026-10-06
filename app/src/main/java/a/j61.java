package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class j61 implements a.wr0 {
    public final a.nk c;
    public final a.au d;
    public final a.ej1 e;
    public int f;
    public boolean g;
    public long h;
    public int i;

    public j61(android.content.Context context) {
        long j;
        a.wv.w(context, "context");
        this.c = new a.nk("Analyser-Power", new a.vt(1, this));
        a.au f = a.au.f();
        this.d = f;
        this.e = new a.ej1(context, 11);
        this.f = f.h();
        this.g = true;
        f.m();
        android.database.Cursor rawQuery = ((android.database.sqlite.SQLiteDatabase) f.d).rawQuery("select max(time) AS current from records", new java.lang.String[0]);
        try {
            if (rawQuery.moveToNext()) {
                j = rawQuery.getLong(0);
                rawQuery.close();
            } else {
                rawQuery.close();
                j = 0;
            }
            this.h = j;
            this.i = f.g();
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

    public final void a() {
        this.g = false;
        this.f = this.d.l();
    }

    public final void b() {
        a.vj1 vj1Var = a.oq0.c;
        int i = a.oq0.i;
        if (i == 5 || i == 1) {
            a.oq0.i();
            a.vj1 vj1Var2 = a.oq0.d;
            a.oq0.f = ((android.os.BatteryManager) vj1Var2.a()).getIntProperty(4);
            int intProperty = ((android.os.BatteryManager) vj1Var2.a()).getIntProperty(6);
            if (intProperty != 1) {
                a.oq0.i = intProperty;
            }
        } else {
            a.oq0.i();
        }
        if (a.oq0.a()) {
            return;
        }
        boolean s = this.e.s();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j = currentTimeMillis - this.h;
        if (j > 86400000 || (j > 30000 && a.oq0.f > this.i)) {
            a();
        }
        this.h = currentTimeMillis;
        this.i = a.oq0.f;
        if (java.lang.Math.abs(a.oq0.h) > 60000) {
            a();
            if (a.la0.b) {
                return;
            }
            a.cp cpVar = com.omarea.Scene.c;
            new a.la0(a.fs1.t()).a(true);
            return;
        }
        com.omarea.model.BatteryStatus batteryStatus = new com.omarea.model.BatteryStatus();
        batteryStatus.time = currentTimeMillis;
        batteryStatus.session = this.f;
        batteryStatus.temperature = a.oq0.f417a;
        batteryStatus.status = a.oq0.i;
        batteryStatus.current = (int) a.oq0.h;
        double f = a.oq0.f();
        if (f > 0.0d) {
            batteryStatus.voltage = f;
        }
        batteryStatus.screenOn = s;
        batteryStatus.capacity = a.oq0.f;
        java.lang.String str = a.oq0.j;
        if (str == null || str.length() == 0) {
            str = "android";
        }
        batteryStatus.packageName = str;
        a.nk nkVar = a.b11.c;
        batteryStatus.mode = a.tg1.j();
        a.au auVar = this.d;
        auVar.m();
        try {
            ((android.database.sqlite.SQLiteDatabase) auVar.d).execSQL("insert into records(time, session, temperature, status, mode, current, voltage, package, screen_on, capacity) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", new java.lang.Object[]{"" + batteryStatus.time, java.lang.Integer.valueOf(batteryStatus.session), java.lang.Double.valueOf(batteryStatus.temperature), java.lang.Integer.valueOf(batteryStatus.status), batteryStatus.mode, java.lang.Integer.valueOf(batteryStatus.current), java.lang.Double.valueOf(batteryStatus.voltage), batteryStatus.packageName, java.lang.Integer.valueOf(batteryStatus.screenOn ? 1 : 0), java.lang.Integer.valueOf(batteryStatus.capacity)});
        } catch (java.lang.Exception unused) {
        }
        this.g = true;
        if (s) {
            return;
        }
        a.nk nkVar2 = this.c;
        java.util.Timer timer = (java.util.Timer) nkVar2.f;
        if (timer != null) {
            timer.cancel();
        }
        nkVar2.f = null;
    }

    public final void c() {
        a.nk nkVar = this.c;
        if (((java.util.Timer) nkVar.f) == null && this.e.s() && nkVar.R(1000L, 3000L)) {
            a.oq0.g(5000L);
        }
    }

    @Override // a.wr0
    public final boolean eventFilter(a.kc0 kc0Var) {
        int ordinal = kc0Var.ordinal();
        return ordinal == 0 || ordinal == 1 || ordinal == 4 || ordinal == 5 || ordinal == 7 || ordinal == 8;
    }

    @Override // a.wr0
    public final boolean isAsync() {
        return true;
    }

    @Override // a.wr0
    public final void onReceive(a.kc0 kc0Var, java.util.HashMap hashMap) {
        int ordinal = kc0Var.ordinal();
        if (ordinal == 0) {
            a();
            return;
        }
        if (ordinal == 1) {
            if (this.g) {
                a();
            }
            c();
            return;
        }
        if (ordinal != 4) {
            if (ordinal == 5) {
                a();
                return;
            } else if (ordinal == 7) {
                c();
                return;
            } else {
                if (ordinal != 8) {
                    return;
                }
                b();
                return;
            }
        }
        a.vj1 vj1Var = a.oq0.c;
        int i = a.oq0.i;
        if (i == 3 || i == 4) {
            c();
        } else if (this.g) {
            a();
        }
    }

    @Override // a.wr0
    public final void onSubscribe() {
        c();
    }

    @Override // a.wr0
    public final void onUnsubscribe() {
        a.nk nkVar = this.c;
        java.util.Timer timer = (java.util.Timer) nkVar.f;
        if (timer != null) {
            timer.cancel();
        }
        nkVar.f = null;
    }
}
