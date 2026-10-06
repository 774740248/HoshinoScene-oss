package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class yh1 {
    public static a.yh1 e;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f710a = new java.lang.Object();
    public final android.os.Handler b = new android.os.Handler(android.os.Looper.getMainLooper(), new a.wh1(this));
    public a.xh1 c;
    public a.xh1 d;

    public static a.yh1 b() {
        if (e == null) {
            e = new a.yh1();
        }
        return e;
    }

    public final boolean a(a.xh1 xh1Var, int i) {
        a.sq sqVar = (a.sq) xh1Var.f689a.get();
        if (sqVar == null) {
            return false;
        }
        this.b.removeCallbacksAndMessages(xh1Var);
        android.os.Handler handler = a.vq.x;
        handler.sendMessage(handler.obtainMessage(1, i, 0, sqVar.f534a));
        return true;
    }

    public final boolean c(a.sq sqVar) {
        a.xh1 xh1Var = this.c;
        return (xh1Var == null || sqVar == null || xh1Var.f689a.get() != sqVar) ? false : true;
    }

    public final void d(a.sq sqVar) {
        synchronized (this.f710a) {
            try {
                if (c(sqVar)) {
                    a.xh1 xh1Var = this.c;
                    if (!xh1Var.c) {
                        xh1Var.c = true;
                        this.b.removeCallbacksAndMessages(xh1Var);
                    }
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void e(a.sq sqVar) {
        synchronized (this.f710a) {
            try {
                if (c(sqVar)) {
                    a.xh1 xh1Var = this.c;
                    if (xh1Var.c) {
                        xh1Var.c = false;
                        f(xh1Var);
                    }
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void f(a.xh1 xh1Var) {
        int i = xh1Var.b;
        if (i == -2) {
            return;
        }
        if (i <= 0) {
            i = i == -1 ? 1500 : 2750;
        }
        android.os.Handler handler = this.b;
        handler.removeCallbacksAndMessages(xh1Var);
        handler.sendMessageDelayed(android.os.Message.obtain(handler, 0, xh1Var), i);
    }

    public final void g() {
        a.xh1 xh1Var = this.d;
        if (xh1Var != null) {
            this.c = xh1Var;
            this.d = null;
            a.sq sqVar = (a.sq) xh1Var.f689a.get();
            if (sqVar == null) {
                this.c = null;
            } else {
                android.os.Handler handler = a.vq.x;
                handler.sendMessage(handler.obtainMessage(0, sqVar.f534a));
            }
        }
    }
}
