package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class lv {

    /* renamed from: a, reason: collision with root package name */
    public boolean f332a;
    public boolean b;
    public boolean c;
    public long d = -1;
    public java.lang.String e = "";
    public java.lang.String f = "";
    public java.lang.String g = "";
    public java.lang.String h = "";
    public java.lang.String i = "";
    public java.lang.String j = "";
    public java.lang.String k = "";
    public java.lang.Boolean l;
    public java.lang.Boolean m;

    public static boolean a(a.lt0 lt0Var, java.lang.String str) {
        if (!lt0Var.f329a.containsKey(str) || a.wv.e(lt0Var.a(str), a.lt0.c)) {
            return false;
        }
        return lt0Var.b(str);
    }

    public static java.lang.String b(a.lv lvVar, a.lt0 lt0Var, java.lang.String str) {
        lvVar.getClass();
        return (!lt0Var.f329a.containsKey(str) || a.wv.e(lt0Var.a(str), a.lt0.c)) ? "" : lt0Var.h(str);
    }

    public final void c(a.lt0 lt0Var) {
        java.util.LinkedHashMap linkedHashMap = lt0Var.f329a;
        if (linkedHashMap.containsKey("versionCode") && !a.wv.e(lt0Var.a("versionCode"), a.lt0.c)) {
            this.d = lt0Var.g("versionCode");
        }
        this.e = b(this, lt0Var, "version");
        this.f = b(this, lt0Var, "name");
        this.g = b(this, lt0Var, "author");
        this.h = b(this, lt0Var, "module");
        this.i = b(this, lt0Var, "state");
        this.j = b(this, lt0Var, "executor");
        this.k = b(this, lt0Var, "buildTime");
        if (!linkedHashMap.containsKey("features") || a.wv.e(lt0Var.a("features"), a.lt0.c)) {
            return;
        }
        a.lt0 f = lt0Var.f("features");
        this.f332a = a(f, "strict");
        this.b = a(f, "pedestal");
        this.c = a(f, "reboot");
        java.util.LinkedHashMap linkedHashMap2 = f.f329a;
        if (linkedHashMap2.containsKey("fas")) {
            this.l = java.lang.Boolean.valueOf(a(f, "fas"));
        }
        if (linkedHashMap2.containsKey("limiter")) {
            this.m = java.lang.Boolean.valueOf(a(f, "limiter"));
        }
    }
}
