package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class wh1 implements android.os.Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a.yh1 f663a;

    public wh1(a.yh1 yh1Var) {
        this.f663a = yh1Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message message) {
        if (message.what != 0) {
            return false;
        }
        a.yh1 yh1Var = this.f663a;
        a.xh1 xh1Var = (a.xh1) message.obj;
        synchronized (yh1Var.f710a) {
            try {
                if (yh1Var.c != xh1Var) {
                    if (yh1Var.d == xh1Var) {
                    }
                }
                yh1Var.a(xh1Var, 2);
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return true;
    }
}
