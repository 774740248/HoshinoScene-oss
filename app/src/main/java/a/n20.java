package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class n20 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a.da1 f366a;
    public final /* synthetic */ int b;
    public final /* synthetic */ android.view.View c;
    public final /* synthetic */ int d;
    public final /* synthetic */ android.view.ViewPropertyAnimator e;
    public final /* synthetic */ a.r20 f;

    public n20(a.r20 r20Var, a.da1 da1Var, int i, android.view.View view, int i2, android.view.ViewPropertyAnimator viewPropertyAnimator) {
        this.f = r20Var;
        this.f366a = da1Var;
        this.b = i;
        this.c = view;
        this.d = i2;
        this.e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator animator) {
        int i = this.b;
        android.view.View view = this.c;
        if (i != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        this.e.setListener(null);
        a.r20 r20Var = this.f;
        a.da1 da1Var = this.f366a;
        r20Var.c(da1Var);
        r20Var.p.remove(da1Var);
        r20Var.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
        this.f.getClass();
    }
}
