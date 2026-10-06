package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ld0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f316a = 0;
    public boolean b = false;
    public final java.lang.Object c;

    public ld0(android.view.View view) {
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator animator) {
        switch (this.f316a) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                this.b = true;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        int i = this.f316a;
        java.lang.Object obj = this.c;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                if (this.b) {
                    this.b = false;
                    return;
                }
                a.nd0 nd0Var = (a.nd0) obj;
                if (((java.lang.Float) nd0Var.z.getAnimatedValue()).floatValue() == 0.0f) {
                    nd0Var.A = 0;
                    nd0Var.j(0);
                    return;
                } else {
                    nd0Var.A = 2;
                    nd0Var.s.invalidate();
                    return;
                }
            default:
                android.view.View view = (android.view.View) obj;
                a.yr1.f718a.b0(view, 1.0f);
                if (this.b) {
                    view.setLayerType(0, null);
                    return;
                }
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
        switch (this.f316a) {
            case 1:
                android.view.View view = (android.view.View) this.c;
                java.util.WeakHashMap weakHashMap = a.jq1.f264a;
                if (a.rp1.h(view) && view.getLayerType() == 0) {
                    this.b = true;
                    view.setLayerType(2, null);
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public ld0(a.nd0 nd0Var) {
        this.c = nd0Var;
    }
}
