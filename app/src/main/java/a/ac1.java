package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ac1 implements java.io.Serializable {
    public final java.lang.Throwable c;

    public ac1(java.lang.Throwable th) {
        a.wv.w(th, "exception");
        this.c = th;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof a.ac1) {
            if (a.wv.e(this.c, ((a.ac1) obj).c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "Failure(" + this.c + ')';
    }
}
