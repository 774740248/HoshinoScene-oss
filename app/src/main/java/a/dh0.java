package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class dh0 {
    public static android.view.WindowManager n;
    public static java.lang.Boolean o = java.lang.Boolean.FALSE;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f98a;
    public final android.content.Context b;
    public android.view.View c;
    public final a.b11 d;
    public final a.vj1 e;
    public final a.vj1 f;
    public final a.vj1 g;
    public final android.content.SharedPreferences h;
    public final java.lang.String i;
    public final a.xa1 j;
    public final a.wc0 k;
    public final a.vj1 l;
    public final a.vj1 m;

    /* JADX WARN: Type inference failed for: r0v1, types: [a.b11, java.lang.Object] */
    public dh0(android.content.Context context) {
        this.f98a = context;
        android.content.Context applicationContext = context.getApplicationContext();
        a.wv.v(applicationContext, "context.applicationContext");
        this.b = applicationContext;
        this.d = new a.b11();
        this.e = new a.vj1(new a.xg0(this, 4));
        this.f = new a.vj1(new a.xg0(this, 3));
        this.g = new a.vj1(new a.xg0(this, 0));
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("powercfg", 0);
        this.h = sharedPreferences;
        this.i = sharedPreferences.getString("*", a.b11.l);
        this.j = new a.xa1();
        this.k = new a.wc0();
        this.l = new a.vj1(new a.xg0(this, 1));
        this.m = new a.vj1(new a.xg0(this, 2));
    }

    public static void e(java.lang.String str) {
        java.util.ArrayList arrayList = a.dc0.f93a;
        a.kc0 kc0Var = a.kc0.v;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("app", str);
        a.dc0.a(kc0Var, hashMap);
    }

    public final void a() {
        java.lang.Boolean bool = o;
        a.wv.s(bool);
        if (!bool.booleanValue() || this.c == null) {
            return;
        }
        android.view.WindowManager windowManager = n;
        a.wv.s(windowManager);
        windowManager.removeView(this.c);
        o = java.lang.Boolean.FALSE;
    }

    public final java.lang.String b() {
        return (java.lang.String) this.g.a();
    }

    public final float c() {
        return ((java.lang.Number) this.m.a()).floatValue();
    }

    public final boolean d() {
        this.d.getClass();
        a.lv b = a.b11.b();
        if (!(b != null ? b.b : false)) {
            return false;
        }
        a.cp cpVar = com.omarea.Scene.c;
        return a.fs1.D().getBoolean("pedestal_mode", false);
    }
}
