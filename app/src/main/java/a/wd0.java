package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class wd0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f658a;
    public java.lang.String b;
    public boolean c;
    public java.io.Serializable d;

    public wd0(a.lt0 lt0Var) {
        this.f658a = "";
        this.b = "";
        this.d = new java.util.ArrayList();
        java.util.LinkedHashMap linkedHashMap = lt0Var.f329a;
        if (linkedHashMap.containsKey("success")) {
            this.c = lt0Var.b("success");
        }
        if (linkedHashMap.containsKey("error")) {
            this.f658a = lt0Var.h("error");
        }
        if (linkedHashMap.containsKey("absPath")) {
            this.b = lt0Var.h("absPath");
        }
        if (linkedHashMap.containsKey("files")) {
            a.jt0 e = lt0Var.e("files");
            int size = e.f269a.size();
            for (int i = 0; i < size; i++) {
                ((java.util.ArrayList) this.d).add(new a.mc1(e.c(i)));
            }
        }
    }

    public wd0() {
        this.f658a = "";
        this.b = "";
        this.d = "";
    }
}
