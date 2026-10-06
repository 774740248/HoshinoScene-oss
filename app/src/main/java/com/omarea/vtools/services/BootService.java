package com.omarea.vtools.services;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class BootService extends android.app.IntentService {
    public android.content.SharedPreferences c;
    public android.app.NotificationManager d;
    public android.os.PowerManager.WakeLock e;
    public boolean f;
    public boolean g;

    public BootService() {
        super("vtools-boot");
    }

    public final void a() {
        if (this.f) {
            java.lang.String string = getString(2131952066);
            a.wv.v(string, "getString(R.string.boot_success)");
            b(string);
        } else {
            android.app.NotificationManager notificationManager = this.d;
            if (notificationManager != null) {
                notificationManager.cancel(900);
            } else {
                a.wv.M1("nm");
                throw null;
            }
        }
    }

    public final void b(java.lang.String str) {
        if (!this.g) {
            android.app.NotificationManager notificationManager = this.d;
            if (notificationManager == null) {
                a.wv.M1("nm");
                throw null;
            }
            notificationManager.createNotificationChannel(new android.app.NotificationChannel("vtool-boot", getString(2131953076), 2));
            this.g = true;
        }
        a.j21 j21Var = new a.j21(this, "vtool-boot");
        android.app.NotificationManager notificationManager2 = this.d;
        if (notificationManager2 == null) {
            a.wv.M1("nm");
            throw null;
        }
        j21Var.r.icon = 2131230986;
        j21Var.e = a.j21.c(getString(2131953076));
        j21Var.f = a.j21.c(str);
        notificationManager2.notify(900, j21Var.a());
    }

    @Override // android.app.IntentService, android.app.Service
    public final void onDestroy() {
        a();
        android.os.PowerManager.WakeLock wakeLock = this.e;
        if (wakeLock == null) {
            a.wv.M1("mWakeLock");
            throw null;
        }
        wakeLock.release();
        super.onDestroy();
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x032e, code lost:
    
        if (r5.getBoolean("swap", false) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x02b4, code lost:
    
        if (a.wv.e(r12, r13 != null ? a.yi1.F2(a.yi1.v2(a.yi1.v2(r13, "[", ""), "]", "")).toString() : "") == false) goto L82;
     */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [a.xy, a.ey] */
    /* JADX WARN: Type inference failed for: r9v5 */
    @Override // android.app.IntentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onHandleIntent(android.content.Intent r20) {
        /*
            Method dump skipped, instructions count: 1155
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.omarea.vtools.services.BootService.onHandleIntent(android.content.Intent):void");
    }
}
