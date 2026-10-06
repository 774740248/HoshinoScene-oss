package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class wh0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f662a;
    public final /* synthetic */ boolean b = false;
    public final /* synthetic */ a.pm c = null;
    public final /* synthetic */ a.di0 d;

    public wh0(a.di0 di0Var) {
        this.d = di0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator animator) {
        this.f662a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        a.di0 di0Var = this.d;
        di0Var.r = 0;
        di0Var.l = null;
        if (this.f662a) {
            return;
        }
        boolean z = this.b;
        di0Var.s.a(z ? 8 : 4, z);
        a.pm pmVar = this.c;
        if (pmVar == null) {
            return;
        }
        a.ai1.t(pmVar.d);
        throw null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
        a.di0 di0Var = this.d;
        di0Var.s.a(0, this.b);
        di0Var.r = 1;
        di0Var.l = animator;
        this.f662a = false;
    }
}
