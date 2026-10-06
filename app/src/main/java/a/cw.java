package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class cw implements a.ey {

    public cw() {
    }

    public static final a.cw c = new a.cw();

    @Override // a.ey
    public final a.ty h() {
        throw new java.lang.IllegalStateException("This continuation is already complete".toString());
    }

    @Override // a.ey
    public final void j(java.lang.Object obj) {
        throw new java.lang.IllegalStateException("This continuation is already complete".toString());
    }

    public final java.lang.String toString() {
        return "This continuation is already complete";
    }
}
