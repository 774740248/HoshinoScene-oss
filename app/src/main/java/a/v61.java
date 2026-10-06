package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class v61 implements java.lang.Comparable {
    public a.bi1 c;
    public final /* synthetic */ a.w61 d;

    public v61(a.w61 w61Var) {
        this.d = w61Var;
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object obj) {
        return this.c.b - ((a.bi1) obj).b;
    }

    public final java.lang.String toString() {
        java.lang.String str = "[ ";
        if (this.c != null) {
            for (int i = 0; i < 9; i++) {
                str = str + this.c.h[i] + " ";
            }
        }
        return str + "] " + this.c;
    }
}
