package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ts implements java.lang.Runnable {
    public final /* synthetic */ int c;
    public final java.lang.Object d;
    public final java.lang.Object e;
    public final java.lang.Object f;

    public /* synthetic */ ts(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i) {
        this.c = i;
        this.f = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a.fr0 fr0Var;
        android.widget.OverScroller overScroller;
        java.lang.Object obj = null;
        switch (this.c) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.vu0 vu0Var = (a.vu0) this.d;
                android.graphics.Typeface typeface = (android.graphics.Typeface) this.e;
                a.b20 b20Var = (a.b20) vu0Var.d;
                if (b20Var != null) {
                    b20Var.L0(typeface);
                    return;
                }
                return;
            case 1:
                ((a.lx) this.d).a(this.e);
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                try {
                    obj = ((java.util.concurrent.Callable) this.d).call();
                } catch (java.lang.Exception unused) {
                }
                ((android.os.Handler) this.f).post(new a.ts(this, (a.lx) this.e, obj, 1));
                return;
            case 3:
                android.view.View view = (android.view.View) this.e;
                if (view == null || (overScroller = (fr0Var = (a.fr0) this.f).d) == null) {
                    return;
                }
                boolean computeScrollOffset = overScroller.computeScrollOffset();
                java.lang.Object obj2 = this.d;
                if (computeScrollOffset) {
                    fr0Var.w((androidx.coordinatorlayout.widget.CoordinatorLayout) obj2, view, fr0Var.d.getCurrY());
                    a.rp1.m(view, this);
                    return;
                }
                androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout = (androidx.coordinatorlayout.widget.CoordinatorLayout) obj2;
                com.google.android.material.appbar.AppBarLayout appBarLayout = (com.google.android.material.appbar.AppBarLayout) view;
                fr0Var.C(coordinatorLayout, appBarLayout);
                if (appBarLayout.liftOnScroll) {
                    appBarLayout.e(appBarLayout.shouldLift(a.gr1.z(coordinatorLayout)));
                    return;
                }
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                ((a.eq) this.f).e((android.view.View) this.d, (android.widget.FrameLayout) this.e);
                return;
            case 5:
                boolean[] zArr = (boolean[]) this.d;
                a.q10 q10Var = a.q10.f457a;
                zArr[0] = a.q10.v((a.u10) this.f, ((java.lang.StringBuilder) this.e).toString());
                synchronized (((a.u10) this.f)) {
                    ((a.u10) this.f).notify();
                }
                return;
            default:
                a.u20 u20Var = a.z80.f728a;
                a.wv.M0(a.wv.b(a.by0.f57a), null, new a.t50((a.f60) this.d, (a.mc1) this.e, (a.ma1) this.f, null), 3);
                return;
        }
    }

    public /* synthetic */ ts(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, int i2) {
        this.c = i;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
    }
}
