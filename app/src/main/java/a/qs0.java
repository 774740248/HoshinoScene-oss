package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class qs0 implements java.lang.Iterable, a.du0 {

    public qs0() {
        this(0, 0, 0);
    }
    public final int c;
    public final int d;
    public final int e;

    public qs0(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new java.lang.IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new java.lang.IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.c = i;
        this.d = a.wv.m0(i, i2, i3);
        this.e = i3;
    }

    @Override // java.lang.Iterable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final a.rs0 iterator() {
        return new a.rs0(this.c, this.d, this.e);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof a.qs0) {
            if (!isEmpty() || !((a.qs0) obj).isEmpty()) {
                a.qs0 qs0Var = (a.qs0) obj;
                if (this.c != qs0Var.c || this.d != qs0Var.d || this.e != qs0Var.e) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.c * 31) + this.d) * 31) + this.e;
    }

    public boolean isEmpty() {
        int i = this.e;
        int i2 = this.d;
        int i3 = this.c;
        if (i > 0) {
            if (i3 <= i2) {
                return false;
            }
        } else if (i3 >= i2) {
            return false;
        }
        return true;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb;
        int i = this.d;
        int i2 = this.c;
        int i3 = this.e;
        if (i3 > 0) {
            sb = new java.lang.StringBuilder();
            sb.append(i2);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i3);
        } else {
            sb = new java.lang.StringBuilder();
            sb.append(i2);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i3);
        }
        return sb.toString();
    }
}
