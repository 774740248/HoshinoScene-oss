package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ks1 extends android.animation.AnimatorListenerAdapter implements a.kn1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f303a;
    public final int b;
    public final android.view.ViewGroup c;
    public boolean e;
    public boolean f = false;
    public final boolean d = true;

    public ks1(android.view.View view, int i) {
        this.f303a = view;
        this.b = i;
        this.c = (android.view.ViewGroup) view.getParent();
        f(true);
    }

    @Override // a.kn1
    public final void a() {
    }

    @Override // a.kn1
    public final void b() {
    }

    @Override // a.kn1
    public final void c() {
        f(false);
    }

    @Override // a.kn1
    public final void d(a.ln1 ln1Var) {
        if (!this.f) {
            a.yr1.f718a.Q(this.f303a, this.b);
            android.view.ViewGroup viewGroup = this.c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        f(false);
        ln1Var.v(this);
    }

    @Override // a.kn1
    public final void e() {
        f(true);
    }

    public final void f(boolean z) {
        android.view.ViewGroup viewGroup;
        if (!this.d || this.e == z || (viewGroup = this.c) == null) {
            return;
        }
        this.e = z;
        a.uq1.a(viewGroup, z);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator animator) {
        this.f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        if (!this.f) {
            a.yr1.f718a.Q(this.f303a, this.b);
            android.view.ViewGroup viewGroup = this.c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        f(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(android.animation.Animator animator) {
        if (this.f) {
            return;
        }
        a.yr1.f718a.Q(this.f303a, this.b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(android.animation.Animator animator) {
        if (this.f) {
            return;
        }
        a.yr1.f718a.Q(this.f303a, 0);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
    }
}
