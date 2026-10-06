package com.omarea.vtools.services;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class KeepAliveService extends android.app.Service {
    @Override // android.app.Service
    public final android.os.IBinder onBind(android.content.Intent intent) {
        a.wv.w(intent, "intent");
        throw new java.lang.Error("An operation is not implemented: Return the communication channel to the service.");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(android.content.Intent intent, int i, int i2) {
        a.cp cpVar = com.omarea.Scene.c;
        java.lang.Object systemService = a.fs1.t().getSystemService("notification");
        a.wv.t(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        android.app.NotificationManager notificationManager = (android.app.NotificationManager) systemService;
        int i3 = android.os.Build.VERSION.SDK_INT;
        if (notificationManager.getNotificationChannel("keep-alive") == null) {
            notificationManager.createNotificationChannel(new android.app.NotificationChannel("keep-alive", getString(2131952546), 2));
        }
        a.j21 j21Var = new a.j21(a.fs1.t(), "keep-alive");
        j21Var.r.icon = 2131230966;
        j21Var.r.when = java.lang.System.currentTimeMillis();
        j21Var.e = a.j21.c("Keep Alive");
        j21Var.f = a.j21.c("");
        a.q10 q10Var = a.q10.f457a;
        if (a.wv.e(a.q10.t(), "root")) {
            j21Var.g = android.app.PendingIntent.getBroadcast(a.fs1.t(), 0, new android.content.Intent(a.fs1.t(), (java.lang.Class<?>) com.omarea.scene_mode.ReceiverSceneMode.class), 201326592);
        }
        if (i3 >= 34) {
            startForeground(256, j21Var.a(), 1073741824);
        } else {
            startForeground(256, j21Var.a());
        }
        return super.onStartCommand(intent, i, i2);
    }
}
