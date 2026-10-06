package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class la0 {
    public static boolean b;
    public static final a.vj1 c = new a.vj1(a.ja0.f);
    public static final a.vj1 d = new a.vj1(a.ja0.g);
    public static final a.vj1 e = new a.vj1(a.ja0.e);

    /* renamed from: a, reason: collision with root package name */
    public final android.os.BatteryManager f313a;

    public la0(android.app.Application application) {
        java.lang.Object systemService = application.getSystemService("batterymanager");
        a.wv.t(systemService, "null cannot be cast to non-null type android.os.BatteryManager");
        this.f313a = (android.os.BatteryManager) systemService;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [a.la1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [a.ka1, java.lang.Object] */
    public final void a(boolean z) {
        if (!z) {
            a.cp cpVar = com.omarea.Scene.c;
            if (a.fs1.D().contains((java.lang.String) d.a())) {
                return;
            }
        }
        if (b) {
            return;
        }
        b = true;
        a.ka1 obj = new a.ka1();
        obj.c = b();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        a.wv.M0(a.wv.b(a.z80.b), null, new a.ka0(this, (la1) obj, new java.lang.Object(), arrayList, null), 3);
    }

    public final long b() {
        return this.f313a.getLongProperty(2);
    }
}
