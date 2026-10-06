package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class mc1 {

    public mc1() {
    }


    /* renamed from: a, reason: collision with root package name */
    public final boolean f343a;
    public java.lang.String b;
    public java.lang.String c;
    public final long d;
    public boolean e;
    public final java.lang.String f;
    public final int g;
    public final long h;

    public mc1(a.lt0 lt0Var) {
        this.b = "";
        this.c = "";
        java.util.LinkedHashMap linkedHashMap = lt0Var.f329a;
        if (linkedHashMap.containsKey("isDir")) {
            this.f343a = lt0Var.b("isDir");
        }
        if (linkedHashMap.containsKey("name")) {
            this.b = lt0Var.h("name");
        }
        if (linkedHashMap.containsKey("absPath")) {
            this.c = lt0Var.h("absPath");
        }
        if (linkedHashMap.containsKey("size")) {
            this.d = lt0Var.g("size");
        }
        if (linkedHashMap.containsKey("exist")) {
            this.e = lt0Var.b("exist");
        }
        if (linkedHashMap.containsKey("items")) {
            lt0Var.d("items");
        }
        if (linkedHashMap.containsKey("symlinkPath")) {
            this.f = lt0Var.h("symlinkPath");
        }
        if (linkedHashMap.containsKey("childCount")) {
            this.g = lt0Var.d("childCount");
        }
        if (linkedHashMap.containsKey("fileMode")) {
            lt0Var.d("fileMode");
        }
        if (linkedHashMap.containsKey("modTime")) {
            this.h = lt0Var.g("modTime");
        }
    }

    public final java.lang.String a() {
        int q2 = a.yi1.q2(this.c, "/", 6);
        if (q2 <= 0) {
            return (q2 != 0 || this.c.length() <= 1) ? "" : "/";
        }
        java.lang.String str = this.c;
        java.lang.String substring = str.substring(0, a.yi1.q2(str, "/", 6));
        a.wv.v(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final java.util.ArrayList b(java.lang.String str, boolean z) {
        java.util.ArrayList arrayList;
        a.wv.w(str, "suffix");
        if (!this.f343a) {
            return new java.util.ArrayList();
        }
        a.wd0 L = a.gy.L(this.c, str, z);
        return (L == null || (arrayList = (java.util.ArrayList) L.d) == null) ? new java.util.ArrayList() : arrayList;
    }
}
