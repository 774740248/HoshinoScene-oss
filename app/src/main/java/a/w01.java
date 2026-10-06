package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class w01 {

    /* renamed from: a, reason: collision with root package name */
    public final android.util.SparseArray f646a;
    public a.eb0 b;

    public w01(int i) {
        this.f646a = new android.util.SparseArray(i);
    }

    public final void a(a.eb0 eb0Var, int i, int i2) {
        int a2 = eb0Var.a(i);
        android.util.SparseArray sparseArray = this.f646a;
        a.w01 w01Var = sparseArray == null ? null : (a.w01) sparseArray.get(a2);
        if (w01Var == null) {
            w01Var = new a.w01(1);
            sparseArray.put(eb0Var.a(i), w01Var);
        }
        if (i2 > i) {
            w01Var.a(eb0Var, i + 1, i2);
        } else {
            w01Var.b = eb0Var;
        }
    }
}
