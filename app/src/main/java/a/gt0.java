package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class gt0 extends a.v51 {
    @Override // a.v51
    public final void a(java.lang.Throwable th, java.lang.Throwable th2) {
        a.wv.w(th, "cause");
        a.wv.w(th2, "exception");
        java.lang.Integer num = a.ft0.f158a;
        if (num == null || num.intValue() >= 19) {
            th.addSuppressed(th2);
        } else {
            super.a(th, th2);
        }
    }
}
