package a;

import android.content.Context;
/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ri0 implements a.sa0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f497a;
    public final a.ol b;
    public final a.fa0 c;
    public final java.lang.Object d;
    public android.os.Handler e;
    public java.util.concurrent.Executor f;
    public java.util.concurrent.ThreadPoolExecutor g;
    public a.b20 h;
    public a.uz i;

    public ri0(android.content.Context context, a.ol olVar) {
        a.fa0 fa0Var = a.si0.d;
        this.d = new java.lang.Object();
        if (context == null) {
            throw new java.lang.NullPointerException("Context cannot be null");
        }
        this.f497a = context.getApplicationContext();
        this.b = olVar;
        this.c = fa0Var;
    }

    @Override // a.sa0
    public final void a(a.b20 b20Var) {
        synchronized (this.d) {
            this.h = b20Var;
        }
        c();
    }

    public final void b() {
        synchronized (this.d) {
            try {
                this.h = null;
                a.uz uzVar = this.i;
                if (uzVar != null) {
                    a.fa0 fa0Var = this.c;
                    android.content.Context context = this.f497a;
                    fa0Var.getClass();
                    context.getContentResolver().unregisterContentObserver(uzVar);
                    this.i = null;
                }
                android.os.Handler handler = this.e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.e = null;
                java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = this.g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f = null;
                this.g = null;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this.d) {
            try {
                if (this.h == null) {
                    return;
                }
                if (this.f == null) {
                    java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(0, 1, 15L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingDeque(), new a.rw("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.g = threadPoolExecutor;
                    this.f = threadPoolExecutor;
                }
                final int i = 0;
                this.f.execute(new a.qi0(this));
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final a.cj0 d() {
        try {
            a.fa0 fa0Var = this.c;
            android.content.Context context = this.f497a;
            a.ol olVar = this.b;
            fa0Var.getClass();
            a.tk a0 = a.b20.a0(context, olVar);
            if (a0.d != 0) {
                throw new java.lang.RuntimeException("fetchFonts failed (" + a0.d + ")");
            }
            a.cj0[] cj0VarArr = (a.cj0[]) a0.e;
            if (cj0VarArr == null || cj0VarArr.length == 0) {
                throw new java.lang.RuntimeException("fetchFonts failed (empty result)");
            }
            return cj0VarArr[0];
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            throw new java.lang.RuntimeException("provider not found", e);
        }
    }
}
