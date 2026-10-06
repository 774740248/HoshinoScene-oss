package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class g2 implements java.lang.Runnable {
    public final /* synthetic */ int c;
    public java.lang.Object d;
    public final java.lang.Object e;

    public /* synthetic */ g2(java.lang.Object obj, int i, java.lang.Object obj2) {
        this.c = i;
        this.e = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a.nz0 nz0Var;
        int i = 4;
        int i2 = 3;
        int i3 = 0;
        switch (this.c) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.pz0 pz0Var = ((a.j2) this.e).e;
                if (pz0Var != null && (nz0Var = pz0Var.e) != null) {
                    nz0Var.r(pz0Var);
                }
                android.view.View view = (android.view.View) ((a.j2) this.e).j;
                if (view != null && view.getWindowToken() != null) {
                    a.e2 e2Var = (a.e2) this.d;
                    if (!e2Var.b()) {
                        if (e2Var.f != null) {
                            e2Var.d(0, 0, false, false);
                        }
                    }
                    ((a.j2) this.e).u = (a.e2) this.d;
                }
                ((a.j2) this.e).w = null;
                return;
            case 1:
                ((a.ke) this.d).f287a = this.e;
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                ((android.app.Application) this.d).unregisterActivityLifecycleCallbacks((a.ke) this.e);
                return;
            case 3:
                try {
                    java.lang.reflect.Method method = a.le.d;
                    if (method != null) {
                        method.invoke(this.d, this.e, java.lang.Boolean.FALSE, "AppCompat recreation");
                    } else {
                        a.le.e.invoke(this.d, this.e, java.lang.Boolean.FALSE);
                    }
                    return;
                } catch (java.lang.RuntimeException e) {
                    if (e.getClass() == java.lang.RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                        throw e;
                    }
                    return;
                } catch (java.lang.Throwable th) {
                    android.util.Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
                    return;
                }
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                a.gn0.b((java.util.ArrayList) this.d, 4);
                return;
            case 5:
                ((a.z20) this.d).b();
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                ((a.ji1) this.d).c();
                return;
            case 7:
                ((android.webkit.WebView) ((a.vs1) ((a.ss1) this.e).c).c.d).evaluateJavascript(((java.lang.String) ((a.ss1) this.e).b) + "(" + ((a.lt0) this.d) + ")", new a.rs1(0));
                return;
            case 8:
                ((android.webkit.WebView) ((a.ts1) this.e).f.c.d).evaluateJavascript(((a.ts1) this.e).e + "(" + ((a.lt0) this.d) + ")", new a.rs1(1));
                return;
            case 9:
                ((android.webkit.WebView) ((a.ts1) this.e).f.c.d).evaluateJavascript(((a.ts1) this.e).e + "(" + ((a.lt0) this.d) + ")", new a.rs1(2));
                return;
            case 10:
                ((android.webkit.WebView) ((a.us1) this.e).h.c.d).evaluateJavascript(((a.us1) this.e).d + "(" + ((a.lt0) this.d) + ")", new a.rs1(3));
                return;
            case 11:
                android.widget.Toast.makeText(((a.vc0) this.e).b, "ExtractFail " + ((java.lang.String) this.d), 1).show();
                return;
            case 12:
                a.n00 n00Var = (a.n00) this.d;
                n00Var.getClass();
                a.wv.M0(a.wv.b(a.z80.b), null, new a.m00(n00Var.f365a, null), 3);
                return;
            case 13:
                a.ej1 ej1Var = (a.ej1) this.e;
                ((android.view.ViewGroup) ej1Var.c).removeView((a.sq0) ej1Var.d);
                ((a.rq0) ((a.ej1) this.e).e).c((a.pq0) this.d);
                return;
            case 14:
                com.omarea.vtools.activities.ActivityQuickStart activityQuickStart = (com.omarea.vtools.activities.ActivityQuickStart) ((java.lang.ref.WeakReference) this.e).get();
                if (activityQuickStart != null) {
                    a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityQuickStart.f;
                    a.cp cpVar = com.omarea.Scene.c;
                    a.fs1.L(new a.ya(i2, activityQuickStart));
                }
                a.tg1 tg1Var = a.me1.m;
                a.tg1.t((java.lang.String) this.d);
                a.cp cpVar2 = com.omarea.Scene.c;
                a.fs1.L(new a.ya(i, this));
                return;
            case 15:
                ((a.at) ((a.zs) this.d)).x((a.cr0) this.e);
                return;
        }
        while (true) {
            try {
                ((java.lang.Runnable) this.d).run();
            } catch (java.lang.Throwable th2) {
                a.wv.v0(a.ob0.c, th2);
            }
            a.pv0 pv0Var = (a.pv0) this.e;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = a.pv0.j;
            java.lang.Runnable l = pv0Var.l();
            if (l == null) {
                return;
            }
            this.d = l;
            i3++;
            if (i3 >= 16 && ((a.pv0) this.e).e.j()) {
                a.pv0 pv0Var2 = (a.pv0) this.e;
                pv0Var2.e.h(pv0Var2, this);
                return;
            }
        }
    }

    public /* synthetic */ g2(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.c = i;
        this.d = obj;
        this.e = obj2;
    }

    public g2(com.omarea.vtools.activities.ActivityQuickStart activityQuickStart, java.lang.String str) {
        this.c = 14;
        a.wv.w(activityQuickStart, "context");
        this.d = str;
        this.e = new java.lang.ref.WeakReference(activityQuickStart);
    }
}
