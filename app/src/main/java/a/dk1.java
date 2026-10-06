package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class dk1 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f100a;
    public final /* synthetic */ android.view.View b;
    public final /* synthetic */ a.ek1 c;

    public dk1(a.ek1 ek1Var, android.view.View view, android.view.View view2) {
        this.c = ek1Var;
        this.f100a = view;
        this.b = view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        this.c.c(valueAnimator.getAnimatedFraction(), this.f100a, this.b);
    }
}
