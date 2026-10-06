package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class u71 {
    public static java.lang.Boolean b;

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Application f581a;

    public u71() {
        a.cp cpVar = com.omarea.Scene.c;
        this.f581a = a.fs1.t();
    }

    public static void c(a.u71 u71Var) {
        java.lang.String str = a.pe0.f434a;
        if (new java.io.File(a.pe0.d(u71Var.f581a, "threads.json")).exists()) {
            return;
        }
        a.wv.M0(a.wv.b(a.z80.b), null, new a.t71(u71Var, "threads.json", null), 3);
    }

    public final void a() {
        java.lang.String str = a.pe0.f434a;
        java.io.File[] listFiles = new java.io.File(a.pe0.c(this.f581a)).listFiles();
        if (listFiles != null) {
            for (java.io.File file : listFiles) {
                java.lang.String name = file.getName();
                a.wv.v(name, "name");
                java.util.Locale locale = java.util.Locale.ENGLISH;
                java.lang.String k = a.ai1.k(locale, "ENGLISH", name, locale, "this as java.lang.String).toLowerCase(locale)");
                if ((a.yi1.h2(k, ".json", false) && (a.yi1.B2(k, "manifest") || a.yi1.B2(k, "profile_init") || a.yi1.B2(k, "profile") || a.yi1.B2(k, "_"))) || ((a.yi1.h2(k, ".sh", false) && (a.yi1.B2(k, "powercfg") || a.yi1.B2(k, "_"))) || (a.yi1.h2(k, ".conf", false) && (a.yi1.B2(k, "ddr_") || a.yi1.B2(k, "fas_") || a.yi1.B2(k, "l3_") || a.yi1.B2(k, "fps_"))))) {
                    new java.io.File(file.getAbsolutePath()).delete();
                }
            }
        }
        a.b11.g = null;
        a.b11.f = null;
        a.q10 q10Var = a.q10.f457a;
        a.q10.A("version-update");
    }

    public final boolean b() {
        java.lang.String str = a.pe0.f434a;
        return new java.io.File(a.pe0.d(this.f581a, "profile.json")).exists();
    }
}
