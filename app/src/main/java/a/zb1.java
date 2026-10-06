package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class zb1 extends a.yb1 implements a.op0 {
    public final int d;

    public zb1(a.ey eyVar) {
        super(eyVar);
        this.d = 2;
    }

    @Override // a.op0
    public final int d() {
        return this.d;
    }

    @Override // a.iq
    public final java.lang.String toString() {
        if (this.c != null) {
            return super.toString();
        }
        a.na1.f375a.getClass();
        java.lang.String a2 = a.oa1.a(this);
        a.wv.v(a2, "renderLambdaToString(this)");
        return a2;
    }
}
