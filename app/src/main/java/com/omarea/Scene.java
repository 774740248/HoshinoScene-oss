package com.omarea;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class Scene extends android.app.Application {
    public static a.cp c;
    public static android.app.Application e;
    public static android.app.Activity f;
    public static java.lang.String g;
    public static final android.os.Handler d = new android.os.Handler(android.os.Looper.getMainLooper());
    public static final a.vj1 h = new a.vj1(a.od1.f);
    public static final a.vj1 i = new a.vj1(a.od1.e);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [a.fp0, a.lj1] */
    /* JADX WARN: Type inference failed for: r5v24, types: [a.fp0, a.lj1] */
    /* JADX WARN: Type inference failed for: r9v11, types: [a.be1, a.qr0] */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.lang.Object, a.rd1] */
    /* JADX WARN: Type inference failed for: r9v25, types: [android.content.BroadcastReceiver, a.rf1] */
    /* JADX WARN: Type inference failed for: r9v31, types: [a.wr0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v35, types: [a.fp0, a.lj1] */
    @Override // android.content.ContextWrapper
    public final void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
        e = this;
        java.lang.String packageName = getPackageName();
        a.wv.v(packageName, "this.packageName");
        g = packageName;
        java.lang.String string = a.fs1.D().getString("su_alias7", "");
        a.e20 e20Var = null;
        int i2 = 2;
        if (string != null && string.length() != 0) {
            if (android.os.Build.VERSION.SDK_INT >= 30 && a.wv.e(string, "su")) {
                a.wv.M0(a.wv.b(a.z80.b), null, new a.lj1(2, null), 3);
            }
            a.wv.V = string;
        }
        a.q10 q10Var = a.q10.f457a;
        java.lang.String C = a.fs1.C(this, getApplicationInfo().packageName);
        a.wv.v(C, "SignTool().getSignature(context)");
        a.q10.f = C;
        a.wv.v(C.getBytes(a.bu.f53a), "this as java.lang.String).getBytes(charset)");
        java.lang.String a2 = new a.v10(this).a();
        if (a2 != null) {
            a.vj1 vj1Var = a.ep1.b;
            a.q10.F(a2, a.fs1.v());
        }
        boolean z = false;
        new a.be1().m(false);
        a.q10.E(java.lang.Boolean.valueOf(a.fs1.s("daemon_alive", false)));
        a.rd1 obj = new a.rd1();
        java.lang.Object systemService = a.fs1.t().getSystemService("notification");
        a.wv.t(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        obj.f493a = (android.app.NotificationManager) systemService;
        a.q10.g = obj;
        android.content.SharedPreferences sharedPreferences = getSharedPreferences("daemon-info", 0);
        if (!a.wv.e(sharedPreferences.getString("version", ""), a.q10.d)) {
            a.q10.h = true;
            sharedPreferences.edit().putString("version", a.q10.d).apply();
        }
        java.lang.String str = a.pe0.f434a;
        java.lang.String string2 = getString(2131952137);
        a.wv.v(string2, "getString(R.string.config_toolkit_install_path)");
        java.lang.String d2 = a.pe0.d(this, string2);
        try {
            java.io.File file = new java.io.File(d2);
            if (!file.exists()) {
                file.mkdirs();
            }
        } catch (java.lang.Exception unused) {
        }
        a.wv.S = d2;
        a.tg1.r();
        java.lang.String string3 = a.fs1.D().getString("random_id2", "");
        if (string3 == null) {
            string3 = "";
        }
        if (string3.length() == 0) {
            a.wv.v1(new a.lj1(2, null));
        } else {
            java.lang.String E = a.fs1.E("working_mode", "");
            if (string3.length() > 0 && a.wv.e(E, "root")) {
                a.wv.v1(new a.td1(E, null));
            }
            a.q10 q10Var2 = a.q10.f457a;
            a.q10.e = string3;
            if (a.q10.x == 3) {
                a.q10.g(string3);
            }
        }
        a.rf1 broadcastReceiver = new a.rf1();
        /* TODO: jadx type unresolved, defaulted to Object */
        broadcastReceiver.f494a = this;
        android.content.Context applicationContext = getApplicationContext() != null ? getApplicationContext() : this;
        applicationContext.registerReceiver(broadcastReceiver, new android.content.IntentFilter("android.intent.action.SCREEN_OFF"));
        applicationContext.registerReceiver(broadcastReceiver, new android.content.IntentFilter("android.intent.action.USER_UNLOCKED"));
        applicationContext.registerReceiver(broadcastReceiver, new android.content.IntentFilter("android.intent.action.SCREEN_ON"));
        applicationContext.registerReceiver(broadcastReceiver, new android.content.IntentFilter("android.intent.action.USER_PRESENT"));
        a.k20 k20Var = a.z80.b;
        a.wv.M0(a.wv.b(k20Var), null, new a.pf1(broadcastReceiver, null), 3);
        a.ir irVar = new a.ir(this);
        android.content.IntentFilter intentFilter = new android.content.IntentFilter("android.intent.action.BOOT_COMPLETED");
        android.content.Context context2 = irVar.f239a;
        context2.registerReceiver(irVar, intentFilter);
        context2.registerReceiver(irVar, new android.content.IntentFilter("android.intent.action.ACTION_POWER_CONNECTED"));
        context2.registerReceiver(irVar, new android.content.IntentFilter("android.intent.action.ACTION_POWER_DISCONNECTED"));
        context2.registerReceiver(irVar, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
        context2.registerReceiver(irVar, new android.content.IntentFilter("android.intent.action.BATTERY_LOW"));
        java.util.ArrayList arrayList = a.dc0.f93a;
        a.dc0.c(new com.omarea.data.customer.BatteryReceiver(this, z, i2, e20Var));
        a.dc0.c(new a.wt(this));
        a.dc0.c(new a.j61(this));
        a.dc0.c(new a.x10());
        a.wv.M0(a.wv.b(k20Var), null, new a.lj1(2, null), 3);
        a.dc0.c(new a.of1(a.fs1.t()));
        c = new a.cp(this);
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        a.wv.w(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.app.Application$ActivityLifecycleCallbacks, java.lang.Object] */
    @Override // android.app.Application
    public final void onCreate() {
        super.onCreate();
        registerActivityLifecycleCallbacks(new a.vd1());
    }
}
