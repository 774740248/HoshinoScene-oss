package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class mk0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f354a;
    public final /* synthetic */ android.view.View b;
    public final /* synthetic */ a.gk0 c;
    public final /* synthetic */ a.sl0 d;
    public final /* synthetic */ a.ct e;

    public mk0(android.view.ViewGroup viewGroup, android.view.View view, a.gk0 gk0Var, a.sl0 sl0Var, a.ct ctVar) {
        this.f354a = viewGroup;
        this.b = view;
        this.c = gk0Var;
        this.d = sl0Var;
        this.e = ctVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        android.view.ViewGroup viewGroup = this.f354a;
        android.view.View view = this.b;
        viewGroup.endViewTransition(view);
        a.gk0 gk0Var = this.c;
        a.ek0 ek0Var = gk0Var.K;
        android.animation.Animator animator2 = ek0Var == null ? null : ek0Var.b;
        gk0Var.c().b = null;
        if (animator2 == null || viewGroup.indexOfChild(view) >= 0) {
            return;
        }
        this.d.c(gk0Var, this.e);
    }
}
