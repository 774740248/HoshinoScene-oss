package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class j21 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f244a;
    public java.lang.CharSequence e;
    public java.lang.CharSequence f;
    public android.app.PendingIntent g;
    public int h;
    public int j;
    public int k;
    public boolean l;
    public java.lang.String m;
    public android.os.Bundle n;
    public final java.lang.String p;
    public final boolean q;
    public final android.app.Notification r;
    public boolean s;
    public final java.util.ArrayList t;
    public final java.util.ArrayList b = new java.util.ArrayList();
    public final java.util.ArrayList c = new java.util.ArrayList();
    public final java.util.ArrayList d = new java.util.ArrayList();
    public boolean i = true;
    public int o = 0;

    public j21(android.content.Context context, java.lang.String str) {
        android.app.Notification notification = new android.app.Notification();
        this.r = notification;
        this.f244a = context;
        this.p = str;
        notification.when = java.lang.System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.h = 0;
        this.t = new java.util.ArrayList();
        this.q = true;
    }

    public static java.lang.CharSequence c(java.lang.CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v40, types: [java.util.List] */
    public final android.app.Notification a() {
        java.util.ArrayList arrayList;
        new java.util.ArrayList();
        android.os.Bundle bundle = new android.os.Bundle();
        android.content.Context context = this.f244a;
        int i = android.os.Build.VERSION.SDK_INT;
        java.lang.String str = this.p;
        android.app.Notification.Builder a2 = a.q21.a(context, str);
        android.app.Notification notification = this.r;
        a2.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(this.e).setContentText(this.f).setContentInfo(null).setContentIntent(this.g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setLargeIcon((android.graphics.Bitmap) null).setNumber(0).setProgress(this.j, this.k, this.l);
        a.k21.b(a.k21.d(a.k21.c(a2, null), false), this.h);
        java.util.Iterator it = this.b.iterator();
        if (it.hasNext()) {
            a.ai1.t(it.next());
            throw null;
        }
        android.os.Bundle bundle2 = this.n;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        a.l21.a(a2, this.i);
        a.n21.i(a2, false);
        a.n21.g(a2, null);
        a.n21.j(a2, null);
        a.n21.h(a2, false);
        a.o21.b(a2, this.m);
        a.o21.c(a2, 0);
        a.o21.f(a2, this.o);
        a.o21.d(a2, null);
        a.o21.e(a2, notification.sound, notification.audioAttributes);
        java.util.ArrayList arrayList2 = this.c;
        java.util.ArrayList arrayList3 = this.t;
        java.util.ArrayList arrayList4 = arrayList3;
        if (i < 28) {
            if (arrayList2 == null) {
                arrayList = null;
            } else {
                arrayList = new java.util.ArrayList(arrayList2.size());
                java.util.Iterator it2 = arrayList2.iterator();
                if (it2.hasNext()) {
                    a.ai1.t(it2.next());
                    throw null;
                }
            }
            arrayList4 = a.b20.y(arrayList, arrayList3);
        }
        if (arrayList4 != null && !arrayList4.isEmpty()) {
            java.util.Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                a.o21.a(a2, (java.lang.String) it3.next());
            }
        }
        java.util.ArrayList arrayList5 = this.d;
        if (arrayList5.size() > 0) {
            android.os.Bundle bundle3 = b().getBundle("android.car.EXTENSIONS");
            if (bundle3 == null) {
                bundle3 = new android.os.Bundle();
            }
            android.os.Bundle bundle4 = new android.os.Bundle(bundle3);
            android.os.Bundle bundle5 = new android.os.Bundle();
            if (arrayList5.size() > 0) {
                java.lang.Integer.toString(0);
                a.ai1.t(arrayList5.get(0));
                java.lang.Object obj = a.s21.f512a;
                new android.os.Bundle();
                throw null;
            }
            bundle3.putBundle("invisible_actions", bundle5);
            bundle4.putBundle("invisible_actions", bundle5);
            b().putBundle("android.car.EXTENSIONS", bundle3);
            bundle.putBundle("android.car.EXTENSIONS", bundle4);
        }
        int i2 = android.os.Build.VERSION.SDK_INT;
        a.m21.a(a2, this.n);
        a.p21.e(a2, null);
        a.q21.b(a2, 0);
        a.q21.e(a2, null);
        a.q21.f(a2, null);
        a.q21.g(a2, 0L);
        a.q21.d(a2, 0);
        if (!android.text.TextUtils.isEmpty(str)) {
            a2.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        if (i2 >= 28) {
            java.util.Iterator it4 = arrayList2.iterator();
            if (it4.hasNext()) {
                a.ai1.t(it4.next());
                throw null;
            }
        }
        if (i2 >= 29) {
            a.r21.a(a2, this.q);
            a.r21.b(a2, null);
        }
        if (this.s) {
            a2.setVibrate(null);
            a2.setSound(null);
            int i3 = notification.defaults & (-4);
            notification.defaults = i3;
            a2.setDefaults(i3);
            if (android.text.TextUtils.isEmpty(null)) {
                a.n21.g(a2, "silent");
            }
            a.q21.d(a2, 1);
        }
        return a.k21.a(a2);
    }

    public final android.os.Bundle b() {
        if (this.n == null) {
            this.n = new android.os.Bundle();
        }
        return this.n;
    }

    public final void d(int i, boolean z) {
        android.app.Notification notification = this.r;
        if (z) {
            notification.flags = i | notification.flags;
        } else {
            notification.flags = (~i) & notification.flags;
        }
    }
}
