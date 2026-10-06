package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class rd1 {

    /* renamed from: a, reason: collision with root package name */
    public android.app.NotificationManager f493a;

    public final void a(java.lang.String str, java.lang.String str2) {
        a.wv.w(str, "title");
        a.wv.w(str2, "message");
        android.app.NotificationManager notificationManager = this.f493a;
        if (notificationManager.getNotificationChannel("vtools-task") == null) {
            a.cp cpVar = com.omarea.Scene.c;
            notificationManager.createNotificationChannel(new android.app.NotificationChannel("vtools-task", a.fs1.t().getString(2131953077), 2));
        }
        a.cp cpVar2 = com.omarea.Scene.c;
        a.j21 j21Var = new a.j21(a.fs1.t(), "vtools-task");
        j21Var.r.icon = 2131230966;
        j21Var.r.when = java.lang.System.currentTimeMillis();
        j21Var.e = a.j21.c(str);
        j21Var.f = a.j21.c(str2);
        notificationManager.notify(920, j21Var.a());
    }
}
