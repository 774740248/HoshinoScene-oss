package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class or extends com.omarea.krscript.model.ShellHandlerBase {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f418a;
    public final com.omarea.krscript.model.RunnableNode b;
    public final int c;
    public final android.app.NotificationManager d;
    public final java.lang.String e;
    public final java.util.ArrayList f;
    public java.lang.String g;
    public int h;
    public int i;
    public boolean j;
    public java.lang.Runnable k;
    public boolean l;
    public final java.lang.String m;
    public final android.app.PendingIntent n;
    public final a.gm o;

    public or(android.content.Context context, com.omarea.krscript.model.RunnableNode runnableNode, int i) {
        a.wv.w(runnableNode, "runnableNode");
        this.f418a = context;
        this.b = runnableNode;
        this.c = i;
        java.lang.Object systemService = context.getSystemService("notification");
        a.wv.t(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        this.d = (android.app.NotificationManager) systemService;
        this.e = runnableNode.getTitle();
        this.f = new java.util.ArrayList();
        this.g = "";
        java.lang.String str = context.getPackageName() + ".TaskStop.N" + i;
        this.m = str;
        android.content.Intent intent = new android.content.Intent(str);
        intent.putExtra("id", i);
        this.n = android.app.PendingIntent.getBroadcast(context, 0, intent, 201326592);
        this.o = new a.gm(1, this);
    }

    public final void a() {
        int i = 8;
        if (this.f.size() > 8) {
            synchronized (this.f) {
                java.util.ArrayList arrayList = this.f;
                arrayList.remove(a.qv.e2(arrayList));
                this.j = true;
            }
        }
        android.widget.RemoteViews remoteViews = new android.widget.RemoteViews(this.f418a.getPackageName(), 2131558609);
        remoteViews.setTextViewText(2131362724, this.e + "(" + this.c + ")");
        remoteViews.setTextViewText(2131362721, a.yi1.F2(a.qv.j2(this.f, "", this.j ? "……\n" : "", null, null, 60)).toString());
        int i2 = this.i;
        remoteViews.setProgressBar(2131362722, i2, this.h, i2 < 0);
        remoteViews.setViewVisibility(2131362722, this.i == this.h ? 8 : 0);
        if ((this.k != null || this.b.getInterruptable()) && !this.l) {
            i = 0;
        }
        remoteViews.setViewVisibility(2131362723, i);
        if (this.b.getInterruptable() && this.k != null && !this.l) {
            remoteViews.setOnClickPendingIntent(2131362723, this.n);
        }
        android.app.Notification.Builder when = new android.app.Notification.Builder(this.f418a).setContentTitle(this.e + "(" + this.c + ")").setContentText(this.g + " >> " + a.qv.m2(this.f)).setSmallIcon(2131231103).setAutoCancel(true).setWhen(java.lang.System.currentTimeMillis());
        a.wv.v(when, "Builder(context)\n       …stem.currentTimeMillis())");
        int i3 = this.i;
        int i4 = this.h;
        if (i3 != i4) {
            when.setProgress(i3, i4, i3 < 0);
        }
        when.setCustomBigContentView(remoteViews);
        if (!a.pr.d) {
            android.app.NotificationChannel notificationChannel = new android.app.NotificationChannel("kr_script_task_notification", this.f418a.getString(2131952725), 3);
            notificationChannel.enableLights(false);
            notificationChannel.enableVibration(false);
            notificationChannel.setSound(null, null);
            this.d.createNotificationChannel(notificationChannel);
        }
        a.pr.d = true;
        when.setChannelId("kr_script_task_notification");
        android.app.Notification build = when.build();
        a.wv.v(build, "notificationBuilder.build()");
        if (!this.l) {
            build.flags = 34;
        }
        this.d.notify(this.c, build);
    }

    @Override // com.omarea.krscript.model.ShellHandlerBase
    public final void onError(java.lang.Object obj) {
        java.lang.String string = this.f418a.getString(2131952724);
        a.wv.v(string, "context.getString(R.stri…kr_script_task_has_error)");
        this.g = string;
        synchronized (this.f) {
            try {
                this.f.add(new a.ob1(this.f418a).a((obj != null ? obj.toString() : null), false));
                a();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.omarea.krscript.model.ShellHandlerBase
    public final void onExit(java.lang.Object obj) {
        this.l = true;
        java.lang.String string = this.f418a.getString(2131952723);
        a.wv.v(string, "context.getString(R.stri….kr_script_task_finished)");
        this.g = string;
        synchronized (this.f) {
            try {
                if (a.wv.e(obj, 0)) {
                    this.f.add("\n" + this.f418a.getString(2131952732));
                } else {
                    this.f.add("\n" + this.f418a.getString(2131952733) + " " + (obj != null ? obj.toString() : null));
                }
                a();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.omarea.krscript.model.ShellHandlerBase
    public final void onProgress(int i, int i2) {
        this.h = i;
        this.i = i2;
        a();
    }

    @Override // com.omarea.krscript.model.ShellHandlerBase
    public final void onReader(java.lang.Object obj) {
        synchronized (this.f) {
            try {
                this.f.add((obj != null ? obj.toString() : null));
                a();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.omarea.krscript.model.ShellHandlerBase
    public final void onStart(java.lang.Runnable runnable) {
        this.k = runnable;
        this.f418a.registerReceiver(this.o, new android.content.IntentFilter(this.m));
        a();
    }

    @Override // com.omarea.krscript.model.ShellHandlerBase
    public final void onWrite(java.lang.Object obj) {
    }

    @Override // com.omarea.krscript.model.ShellHandlerBase
    public final void updateLog(android.text.SpannableString spannableString) {
    }

    @Override // com.omarea.krscript.model.ShellHandlerBase
    public final void onStart(java.lang.Object obj) {
        java.lang.String string = this.f418a.getString(2131952726);
        a.wv.v(string, "context.getString(R.string.kr_script_task_running)");
        this.g = string;
    }
}
