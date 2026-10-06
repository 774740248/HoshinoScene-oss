package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class xh0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f688a = false;
    public final /* synthetic */ a.pm b = null;
    public final /* synthetic */ a.di0 c;

    public xh0(a.di0 di0Var) {
        this.c = di0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        a.di0 di0Var = this.c;
        di0Var.r = 0;
        di0Var.l = null;
        a.pm pmVar = this.b;
        if (pmVar == null) {
            return;
        }
        a.ai1.t(pmVar.d);
        throw null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
        a.di0 di0Var = this.c;
        di0Var.s.a(0, this.f688a);
        di0Var.r = 2;
        di0Var.l = animator;
    }
}
