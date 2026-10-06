package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ia extends java.lang.Thread {
    public final android.content.Context c;
    public final java.util.List d;
    public final java.lang.Runnable e;
    public final boolean f;
    public final android.content.pm.PackageManager g;

    public ia(android.content.Context context, java.util.List list, a.da daVar, boolean z) {
        a.wv.w(context, "context");
        a.wv.w(list, "selectedItems");
        this.c = context;
        this.d = list;
        this.e = daVar;
        this.f = z;
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        a.wv.v(packageManager, "context.packageManager");
        this.g = packageManager;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        android.graphics.drawable.Drawable drawable;
        a.au auVar = new a.au(this.c, 2);
        a.rx0 rx0Var = new a.rx0(this.c, false, 6);
        for (java.lang.String str : (Iterable<java.lang.String>) this.d) {
            com.omarea.model.SceneConfigInfo c = auVar.c(str);
            c.freeze = true;
            if (auVar.o(c)) {
                try {
                    drawable = this.g.getApplicationIcon(str);
                } catch (java.lang.Exception unused) {
                    drawable = null;
                }
                if (drawable != null) {
                    rx0Var.N1(drawable, str);
                }
                if (this.f) {
                    a.tg1 tg1Var = a.me1.m;
                    a.tg1.q(str);
                } else {
                    a.tg1 tg1Var2 = a.me1.m;
                    a.tg1.e(str);
                }
            }
        }
        auVar.close();
        this.e.run();
    }
}
