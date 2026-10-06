package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class gt implements android.view.View.OnAttachStateChangeListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ gt(int i, java.lang.Object obj) {
        this.c = i;
        this.d = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
        android.view.accessibility.AccessibilityManager accessibilityManager;
        int i = this.c;
        java.lang.Object obj = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
            case 1:
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                a.vb0 vb0Var = (a.vb0) obj;
                int i2 = a.vb0.y;
                if (vb0Var.w == null || (accessibilityManager = vb0Var.v) == null) {
                    return;
                }
                java.util.WeakHashMap weakHashMap = a.jq1.f264a;
                if (a.up1.b(vb0Var)) {
                    a.w.a(accessibilityManager, vb0Var.w);
                    return;
                }
                return;
            default:
                a.wv.w(view, "v");
                view.getViewTreeObserver().addOnPreDrawListener(((a.b91) obj).m);
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
        android.view.accessibility.AccessibilityManager accessibilityManager;
        switch (this.c) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.kt ktVar = (a.kt) this.d;
                android.view.ViewTreeObserver viewTreeObserver = ktVar.A;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        ktVar.A = view.getViewTreeObserver();
                    }
                    ktVar.A.removeGlobalOnLayoutListener(ktVar.l);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 1:
                a.ri1 ri1Var = (a.ri1) this.d;
                android.view.ViewTreeObserver viewTreeObserver2 = ri1Var.r;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        ri1Var.r = view.getViewTreeObserver();
                    }
                    ri1Var.r.removeGlobalOnLayoutListener(ri1Var.l);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                a.vb0 vb0Var = (a.vb0) this.d;
                int i = a.vb0.y;
                a.x xVar = vb0Var.w;
                if (xVar == null || (accessibilityManager = vb0Var.v) == null) {
                    return;
                }
                a.w.b(accessibilityManager, xVar);
                return;
            default:
                a.wv.w(view, "v");
                view.getViewTreeObserver().removeOnPreDrawListener(((a.b91) this.d).m);
                a.b91 b91Var = (a.b91) this.d;
                b91Var.l++;
                synchronized (b91Var.i) {
                    try {
                        a.pm pmVar = b91Var.j;
                        if (pmVar != null) {
                            pmVar.F();
                        }
                        b91Var.j = null;
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}
