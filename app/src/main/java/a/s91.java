package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class s91 {

    public s91() {
    }


    /* renamed from: a, reason: collision with root package name */
    public android.util.SparseArray f523a;
    public int b;
    public java.util.Set c;

    public final a.r91 a(int i) {
        android.util.SparseArray sparseArray = this.f523a;
        a.r91 r91Var = (a.r91) sparseArray.get(i);
        if (r91Var != null) {
            return r91Var;
        }
        a.r91 r91Var2 = new a.r91();
        sparseArray.put(i, r91Var2);
        return r91Var2;
    }
}
