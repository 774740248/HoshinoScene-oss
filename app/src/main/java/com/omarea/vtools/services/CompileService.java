package com.omarea.vtools.services;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class CompileService extends android.app.IntentService {
    public static boolean i;
    public boolean c;
    public android.app.NotificationManager d;
    public java.lang.String e;
    public boolean f;
    public final java.lang.String[] g;
    public android.os.PowerManager.WakeLock h;

    public CompileService() {
        super("vtools-compile");
        this.e = "speed";
        this.g = new java.lang.String[]{"com.ss.android.ugc.aweme"};
    }

    public final void a() {
        if (this.c) {
            android.app.NotificationManager notificationManager = this.d;
            if (notificationManager != null) {
                notificationManager.cancel(990);
                return;
            } else {
                a.wv.M1("nm");
                throw null;
            }
        }
        java.lang.String string = getString(2131952168);
        a.wv.v(string, "getString(R.string.dex2oat_completed)");
        b("complete!", string, 100, 100, true);
        a.nu0 nu0Var = a.nu0.f395a;
        a.nu0.l("/dev/cpuctl/dex2oat/cpu.uclamp.min", "0");
    }

    public final void b(java.lang.String str, java.lang.String str2, int i2, int i3, boolean z) {
        if (!this.f) {
            android.app.NotificationManager notificationManager = this.d;
            if (notificationManager == null) {
                a.wv.M1("nm");
                throw null;
            }
            notificationManager.createNotificationChannel(new android.app.NotificationChannel("vtool-compile", "后台编译", 2));
            this.f = true;
        }
        a.j21 j21Var = new a.j21(this, "vtool-compile");
        android.app.NotificationManager notificationManager2 = this.d;
        if (notificationManager2 == null) {
            a.wv.M1("nm");
            throw null;
        }
        j21Var.r.icon = 2131231234;
        j21Var.e = a.j21.c(str);
        j21Var.f = a.j21.c(str2);
        j21Var.d(16, z);
        j21Var.j = i2;
        j21Var.k = i3;
        j21Var.l = false;
        notificationManager2.notify(990, j21Var.a());
    }

    @Override // android.app.IntentService, android.app.Service
    public final void onDestroy() {
        a();
        android.os.PowerManager.WakeLock wakeLock = this.h;
        if (wakeLock == null) {
            a.wv.M1("mWakeLock");
            throw null;
        }
        wakeLock.release();
        super.onDestroy();
    }

    /* JADX WARN: Type inference failed for: r0v32, types: [a.bp0, a.lj1] */
    /* JADX WARN: Type inference failed for: r2v7, types: [a.fp0, a.lj1] */
    @Override // android.app.IntentService
    public final void onHandleIntent(android.content.Intent intent) {
        int i2;
        java.lang.Object systemService = getSystemService("power");
        a.wv.t(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        boolean z = true;
        android.os.PowerManager.WakeLock newWakeLock = ((android.os.PowerManager) systemService).newWakeLock(1, "scene:CompileService");
        a.wv.v(newWakeLock, "mPowerManager.newWakeLoc…, \"scene:CompileService\")");
        this.h = newWakeLock;
        newWakeLock.acquire(3600000L);
        java.lang.Object systemService2 = getSystemService("notification");
        a.wv.t(systemService2, "null cannot be cast to non-null type android.app.NotificationManager");
        this.d = (android.app.NotificationManager) systemService2;
        if (i) {
            this.c = true;
            a();
            return;
        }
        if (intent != null) {
            java.lang.String action = intent.getAction();
            if (a.wv.e(action, getString(2131953359))) {
                this.e = "speed";
            } else if (a.wv.e(action, getString(2131953360))) {
                this.e = "speed-profile";
            } else if (a.wv.e(action, getString(2131953338))) {
                this.e = "everything";
            } else if (a.wv.e(action, getString(2131953348))) {
                this.e = "reset";
            } else if (a.wv.e(action, getString(2131953336))) {
                i = false;
                this.c = true;
                a.cp cpVar = com.omarea.Scene.c;
                a.fs1.c((a.bp0) new a.lj1(1, null));
                return;
            }
        }
        i = true;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        new a.ls();
        try {
            java.util.ArrayList<java.lang.String[]> d = a.ls.d();
            if (!a.op.K1(new java.lang.String[]{"mt6989", "mt6991", "mt6993", "mt6899", "sun", "canoe", "tuna"}, a.gy.u()) && a.ls.h(0) <= 2400000) {
                z = false;
            }
            i2 = 0;
            int i3 = 0;
            for (java.lang.String[] strArr : d.subList(0, d.size())) {
                try {
                    int i4 = i3 + 1;
                    if (i3 <= 0 && !z) {
                        i3 = i4;
                    }
                    a.wv.v(strArr, "cluster");
                    for (java.lang.String str : strArr) {
                        i2++;
                        arrayList.add(str);
                    }
                    i3 = i4;
                } catch (java.lang.Exception unused) {
                }
            }
        } catch (java.lang.Exception unused2) {
            i2 = 0;
        }
        if (i2 == 0 || i2 == 2) {
            arrayList.clear();
            int f = a.ls.f();
            i2 = 0;
            for (int i5 = (i2 == 2 && a.ls.f() == 8) ? 2 : 0; i5 < f; i5++) {
                arrayList.add(java.lang.String.valueOf(i5));
                i2++;
            }
        }
        if (((java.lang.Boolean) a.wv.v1(new a.lj1(2, null))).booleanValue()) {
            a.q10 q10Var = a.q10.f457a;
            a.q10.l("resetprop dalvik.vm.dex2oat-swap false");
            a.q10.l("setprop dalvik.vm.dex2oat-swap false");
        }
        a.nu0 nu0Var = a.nu0.f395a;
        a.nu0.l("/dev/cpuctl/dex2oat/cpu.uclamp.min", "100");
        if (i2 > 2 && (a.yi1.m2(a.wv.n0("dalvik.vm.dex2oat-cpu-set"), "7", 0, false, 6) < 0 || a.yi1.m2(a.wv.n0("dalvik.vm.background-dex2oat-cpu-set"), "7", 0, false, 6) < 0)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String[] strArr2 = {"dalvik.vm.bg-dex2oat-threads", "dalvik.vm.dex2oat-threads", "persist.dalvik.vm.dex2oat-threads", "dalvik.vm.image-dex2oat-threads", "ro.sys.fw.dex2oat_thread_count", "dalvik.vm.background-dex2oat-threads", "dalvik.vm.boot-dex2oat-threads"};
            int i6 = 0;
            while (i6 < 7) {
                java.lang.String str2 = strArr2[i6];
                sb.append("resetprop " + str2 + " " + i2 + "\n");
                sb.append("setprop " + str2 + " " + i2 + "\n");
                i6++;
                strArr2 = strArr2;
            }
            java.lang.String j2 = a.qv.j2(arrayList, ",", null, null, null, 62);
            java.lang.String[] strArr3 = {"dalvik.vm.default-dex2oat-cpu-set", "dalvik.vm.background-dex2oat-cpu-set", "dalvik.vm.boot-dex2oat-cpu-set", "dalvik.vm.image-dex2oat-cpu-set", "dalvik.vm.dex2oat-cpu-set"};
            for (int i7 = 0; i7 < 5; i7++) {
                java.lang.String str3 = strArr3[i7];
                sb.append(a.ai1.i("resetprop ", str3, " ", j2, "\n"));
                sb.append("setprop " + str3 + " " + j2 + "\n");
            }
            sb.append("");
            java.lang.String sb2 = sb.toString();
            a.wv.v(sb2, "cmdBuilder.toString()");
            a.q10 q10Var2 = a.q10.f457a;
            a.q10.l(sb2);
        }
        android.content.pm.PackageManager packageManager = getPackageManager();
        a.wv.v(packageManager, "packageManager");
        java.util.List<android.content.pm.ApplicationInfo> installedApplications = packageManager.getInstalledApplications(0);
        a.wv.v(installedApplications, "packageManager.getInstalledApplications(0)");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int size = installedApplications.size();
        for (int i8 = 0; i8 < size; i8++) {
            arrayList2.add(installedApplications.get(i8).packageName);
        }
        arrayList2.remove(getPackageName());
        arrayList2.remove("com.google.android.gms");
        int size2 = arrayList2.size();
        java.lang.String str4 = android.os.Build.VERSION.SDK_INT > 34 ? "-p PRIORITY_INTERACTIVE_FAST" : "";
        a.b10 b10Var = new a.b10(10, getPackageManager());
        java.lang.String str5 = "/";
        int i9 = 2131952167;
        java.lang.String str6 = "[";
        java.lang.String str7 = "shell";
        if (a.wv.e(this.e, "reset")) {
            java.lang.String packageName = getPackageName();
            java.util.Iterator it = arrayList2.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                java.lang.String str8 = (java.lang.String) it.next();
                if (!a.wv.e(str8, packageName)) {
                    a.wv.v(str8, "packageName");
                    int i11 = i10;
                    java.lang.String str9 = packageName;
                    java.lang.String str10 = str7;
                    b(getString(i9) + str6 + this.e + "]", str6 + i10 + "/" + size2 + "]" + ((java.lang.Object) ((java.lang.CharSequence) b10Var.i(str8))), size2, i11, true);
                    java.lang.String str11 = "cmd package compile -f -m verify " + str4 + " " + str8 + " ||cmd package compile -f -m extra " + str4 + " " + str8 + " ||cmd package compile -f -m speed-profile " + str4 + " " + str8;
                    a.wv.w(str11, str10);
                    a.q10 q10Var3 = a.q10.f457a;
                    a.q10.l(str11);
                    i10 = i11 + 1;
                    str6 = str6;
                    str7 = str10;
                    packageName = str9;
                    size2 = size2;
                    i9 = 2131952167;
                }
            }
        } else {
            int i12 = size2;
            java.lang.String str12 = "[";
            java.util.Iterator it2 = arrayList2.iterator();
            int i13 = 0;
            while (it2.hasNext()) {
                java.lang.String str13 = (java.lang.String) it2.next();
                a.wv.v(str13, "packageName");
                java.lang.String str14 = a.op.K1(this.g, str13) ? "speed-profile" : this.e;
                java.lang.CharSequence charSequence = (java.lang.CharSequence) b10Var.i(str13);
                java.lang.String str15 = getString(2131952167) + str12 + str14 + "]";
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder(str12);
                sb3.append(i13);
                sb3.append(str5);
                java.lang.String str16 = str12;
                int i14 = i12;
                sb3.append(i14);
                sb3.append("]");
                sb3.append((java.lang.Object) charSequence);
                b(str15, sb3.toString(), i14, i13, true);
                java.lang.String str17 = "cmd package compile -m " + str14 + " " + str4 + " " + str13;
                a.wv.w(str17, "shell");
                a.q10 q10Var4 = a.q10.f457a;
                a.q10.l(str17);
                i13++;
                str12 = str16;
                b10Var = b10Var;
                str5 = str5;
                i12 = i14;
            }
            java.lang.String str18 = "cmd package compile -m " + this.e + " " + str4 + " " + getPackageName();
            a.wv.w(str18, "shell");
            a.q10 q10Var5 = a.q10.f457a;
            a.q10.l(str18);
        }
        a();
        i = false;
    }
}
