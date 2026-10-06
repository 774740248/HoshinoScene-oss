package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ve0 implements java.lang.Comparable {

    public ve0() {
    }

    public int c;
    public int d;

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object obj) {
        a.ve0 ve0Var = (a.ve0) obj;
        int i = this.d;
        int i2 = ve0Var.d;
        return i != i2 ? i - i2 : this.c - ve0Var.c;
    }

    public final java.lang.String toString() {
        return "Order{order=" + this.d + ", index=" + this.c + '}';
    }
}
