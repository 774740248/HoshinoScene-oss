package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class wk implements a.wr0 {

    public wk() {
    }

    public static android.app.Notification e;
    public static long h;
    public static final android.app.NotificationManager i;
    public static final a.j21 j;
    public static final a.wk c = new a.wk();
    public static boolean d = true;
    public static final a.vj1 f = new a.vj1(a.vk.e);
    public static final android.util.LruCache g = new android.util.LruCache(50);

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, a.wk] */
    static {
        a.cp cpVar = com.omarea.Scene.c;
        a.wk systemService = (wk) a.fs1.t().getSystemService("notification");
        a.wv.t(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        i = (android.app.NotificationManager) systemService;
        a.j21 j21Var = new a.j21(a.fs1.t(), "scene-scheduler");
        j21Var.d(16, false);
        j21Var.d(2, true);
        android.app.Notification notification = j21Var.r;
        notification.sound = null;
        notification.audioStreamType = -1;
        notification.audioAttributes = a.i21.a(a.i21.e(a.i21.c(a.i21.b(), 4), 5));
        j21Var.s = true;
        j21Var.d(8, true);
        j21Var.i = false;
        j21Var.o = 1;
        j21Var.m = "status";
        j21Var.h = -1;
        j = j21Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
    
        if (r0 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.CharSequence a(java.lang.String r5) {
        /*
            java.lang.String r0 = "<get-pm>(...)"
            android.util.LruCache r1 = a.wk.g
            a.wk r2 = r1.get(r5)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            if (r2 == 0) goto Ld
            return r2
        Ld:
            a.vj1 r2 = a.wk.f     // Catch: java.lang.Exception -> L30
            java.lang.Object r3 = r2.a()     // Catch: java.lang.Exception -> L30
            a.wv.v(r3, r0)     // Catch: java.lang.Exception -> L30
            android.content.pm.PackageManager r3 = (android.content.pm.PackageManager) r3     // Catch: java.lang.Exception -> L30
            r4 = 0
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r5, r4)     // Catch: java.lang.Exception -> L30
            android.content.pm.ApplicationInfo r3 = r3.applicationInfo     // Catch: java.lang.Exception -> L30
            if (r3 == 0) goto L30
            java.lang.Object r2 = r2.a()     // Catch: java.lang.Exception -> L30
            a.wv.v(r2, r0)     // Catch: java.lang.Exception -> L30
            android.content.pm.PackageManager r2 = (android.content.pm.PackageManager) r2     // Catch: java.lang.Exception -> L30
            java.lang.CharSequence r0 = r3.loadLabel(r2)     // Catch: java.lang.Exception -> L30
            if (r0 != 0) goto L31
        L30:
            r0 = r5
        L31:
            java.lang.String r2 = "try {\n                pm…packageName\n            }"
            a.wv.v(r0, r2)
            r1.put(r5, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.wk.a(java.lang.String):java.lang.CharSequence");
    }

    public static void b(boolean z) {
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (!z && java.lang.Math.abs(currentTimeMillis - h) <= 5000) {
                return;
            }
            a.nk nkVar = a.b11.c;
            java.lang.String j2 = a.tg1.j();
            if (j2.length() == 0) {
                j2 = "";
            }
            java.lang.String str = a.oq0.j;
            java.lang.String str2 = a.oq0.j;
            if (str.length() == 0) {
                str = "android";
                str2 = "android";
            }
            java.util.ArrayList arrayList = a.b11.r;
            a.y01 y01Var = (a.y01) a.qv.g2(arrayList);
            java.lang.String str3 = null;
            java.lang.String str4 = y01Var != null ? y01Var.f700a : null;
            if (str4 != null && str4.length() != 0) {
                str = str4;
            }
            a.y01 y01Var2 = (a.y01) a.qv.g2(arrayList);
            java.lang.String str5 = y01Var2 != null ? y01Var2.b : null;
            if (str5 != null && str5.length() != 0 && !a.wv.e(str5, j2)) {
                str3 = str5;
            }
            c(str, str2, j2, str3);
            h = currentTimeMillis;
        } catch (java.lang.Exception e2) {
            e2.getMessage();
        }
    }

    public static void c(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        java.lang.CharSequence charSequence;
        java.lang.String str5;
        android.app.PendingIntent activity;
        java.lang.String n;
        java.lang.String str6;
        if (d) {
            android.app.NotificationManager notificationManager = i;
            if (notificationManager.getNotificationChannel("scene-scheduler") == null) {
                a.cp cpVar = com.omarea.Scene.c;
                android.app.NotificationChannel notificationChannel = new android.app.NotificationChannel("scene-scheduler", a.fs1.t().getString(2131951827), 2);
                notificationChannel.setSound(null, null);
                notificationChannel.enableVibration(false);
                notificationChannel.setShowBadge(false);
                notificationChannel.setLockscreenVisibility(1);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            if (notificationManager.areNotificationsEnabled()) {
                android.app.NotificationChannel notificationChannel2 = notificationManager.getNotificationChannel("scene-scheduler");
                if (notificationChannel2 == null || notificationChannel2.getImportance() != 0) {
                    if (a.wv.e(str, str2)) {
                        charSequence = a(str2);
                    } else {
                        charSequence = ((java.lang.Object) a(str)) + "/" + ((java.lang.Object) a(str2));
                    }
                    try {
                        str5 = a.oq0.f417a + "℃";
                    } catch (java.lang.Exception unused) {
                        str5 = "";
                    }
                    a.q10 q10Var = a.q10.f457a;
                    if (a.wv.e(a.q10.t(), "basic")) {
                        a.cp cpVar2 = com.omarea.Scene.c;
                        activity = android.app.PendingIntent.getActivity(a.fs1.t(), 0, new android.content.Intent(a.fs1.t(), (java.lang.Class<?>) com.omarea.vtools.activities.ActivityMain.class), 201326592);
                    } else {
                        a.cp cpVar3 = com.omarea.Scene.c;
                        activity = android.app.PendingIntent.getBroadcast(a.fs1.t(), 0, new android.content.Intent(a.fs1.t(), (java.lang.Class<?>) com.omarea.scene_mode.ReceiverSceneMode.class), 201326592);
                    }
                    if (str4 == null || str4.length() == 0) {
                        a.nk nkVar = a.b11.c;
                        n = a.tg1.n(str3);
                    } else {
                        a.nk nkVar2 = a.b11.c;
                        n = "▶".concat(a.tg1.n(str4));
                    }
                    if (android.os.SystemClock.uptimeMillis() - com.omarea.vtools.AccessibilitySceneMode.C < 55000) {
                        a.vj1 vj1Var = a.oq0.c;
                        str6 = a.oq0.e() + " " + a.oq0.f + "% " + str5;
                    } else {
                        str6 = a.oq0.f + "% " + str5;
                    }
                    int i2 = a.wv.e(str3, a.b11.i) ? 2131231214 : a.wv.e(str3, a.b11.l) ? 2131231215 : (!a.wv.e(str3, a.b11.j) && (a.wv.e(str3, a.b11.k) || a.wv.e(str3, a.b11.m))) ? 2131231217 : 2131231216;
                    java.lang.String f2 = a.ii1.f(n, "  ", str6);
                    a.j21 j21Var = j;
                    j21Var.r.icon = i2;
                    j21Var.r.when = java.lang.System.currentTimeMillis();
                    j21Var.e = a.j21.c(charSequence);
                    j21Var.f = a.j21.c(f2);
                    j21Var.g = activity;
                    android.app.Notification a2 = j21Var.a();
                    a2.flags |= 34;
                    e = a2;
                    notificationManager.notify(256, a2);
                }
            }
        }
    }

    @Override // a.wr0
    public final boolean eventFilter(a.kc0 kc0Var) {
        return kc0Var == a.kc0.s || kc0Var == a.kc0.t || kc0Var == a.kc0.l;
    }

    @Override // a.wr0
    public final boolean isAsync() {
        return false;
    }

    @Override // a.wr0
    public final void onReceive(a.kc0 kc0Var, java.util.HashMap hashMap) {
        a.cp cpVar = com.omarea.Scene.c;
        a.fs1.L(new a.hs(1));
    }

    @Override // a.wr0
    public final void onSubscribe() {
    }

    @Override // a.wr0
    public final void onUnsubscribe() {
    }
}
