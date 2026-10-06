package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class mb0 implements a.as0 {
    public final boolean c;

    public mb0(boolean z) {
        this.c = z;
    }

    @Override // a.as0
    public final boolean a() {
        return this.c;
    }

    @Override // a.as0
    public final a.d21 f() {
        return null;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Empty{");
        sb.append(this.c ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
