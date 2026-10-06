package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ss0 extends a.qs0 {
    public static final a.ss0 f = (ss0) new a.qs0(1, 0, 1);

    @Override // a.qs0
    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof a.ss0) {
            if (!isEmpty() || !((a.ss0) obj).isEmpty()) {
                a.ss0 ss0Var = (a.ss0) obj;
                if (this.c == ss0Var.c) {
                    if (this.d == ss0Var.d) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // a.qs0
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.c * 31) + this.d;
    }

    @Override // a.qs0
    public final boolean isEmpty() {
        return this.c > this.d;
    }

    @Override // a.qs0
    public final java.lang.String toString() {
        return this.c + ".." + this.d;
    }
}
