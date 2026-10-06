package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class hh0 {
    public static android.view.WindowManager d;
    public static java.lang.Boolean e = java.lang.Boolean.FALSE;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f204a;
    public android.view.View b;
    public final a.vj1 c;

    public hh0(android.content.Context context) {
        android.content.Context applicationContext = context.getApplicationContext();
        a.wv.v(applicationContext, "context.applicationContext");
        this.f204a = applicationContext;
        this.c = new a.vj1(a.ff0.j);
    }

    public final void a() {
        java.lang.Boolean bool = e;
        a.wv.s(bool);
        if (!bool.booleanValue() || this.b == null) {
            return;
        }
        android.view.WindowManager windowManager = d;
        a.wv.s(windowManager);
        windowManager.removeView(this.b);
        e = java.lang.Boolean.FALSE;
    }
}
