package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class m20 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f337a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ android.view.View c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;

    public /* synthetic */ m20(a.r20 r20Var, java.lang.Object obj, android.view.View view, android.view.ViewPropertyAnimator viewPropertyAnimator, int i) {
        this.f337a = i;
        this.e = r20Var;
        this.b = obj;
        this.c = view;
        this.d = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator animator) {
        switch (this.f337a) {
            case 1:
                this.c.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        int i = this.f337a;
        java.lang.Object obj = this.e;
        android.view.View view = this.c;
        java.lang.Object obj2 = this.d;
        java.lang.Object obj3 = this.b;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                ((android.view.ViewPropertyAnimator) obj2).setListener(null);
                view.setAlpha(1.0f);
                a.r20 r20Var = (a.r20) obj;
                a.da1 da1Var = (a.da1) obj3;
                r20Var.c(da1Var);
                r20Var.q.remove(da1Var);
                r20Var.i();
                return;
            case 1:
                ((android.view.ViewPropertyAnimator) obj2).setListener(null);
                a.r20 r20Var2 = (a.r20) obj;
                a.da1 da1Var2 = (a.da1) obj3;
                r20Var2.c(da1Var2);
                r20Var2.o.remove(da1Var2);
                r20Var2.i();
                return;
            default:
                ((android.view.ViewGroup) obj3).endViewTransition(view);
                animator.removeListener(this);
                a.gk0 gk0Var = (a.gk0) obj2;
                android.view.View view2 = gk0Var.H;
                if (view2 == null || !gk0Var.B) {
                    return;
                }
                view2.setVisibility(8);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
        int i = this.f337a;
        java.lang.Object obj = this.e;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                ((a.r20) obj).getClass();
                return;
            case 1:
                ((a.r20) obj).getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public m20(a.r20 r20Var, a.da1 da1Var, android.view.ViewPropertyAnimator viewPropertyAnimator, android.view.View view) {
        this.f337a = 0;
        this.e = r20Var;
        this.b = da1Var;
        this.d = viewPropertyAnimator;
        this.c = view;
    }
}
