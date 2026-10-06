package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class uc0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f588a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public uc0(boolean z, android.view.View view, android.view.View view2) {
        this.f588a = z;
        this.b = view;
        this.c = view2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator animator) {
        super.onAnimationCancel(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        if (this.f588a) {
            return;
        }
        ((android.view.View) this.b).setVisibility(4);
        android.view.View view = (android.view.View) this.c;
        view.setAlpha(1.0f);
        view.setVisibility(0);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
        if (this.f588a) {
            ((android.view.View) this.b).setVisibility(0);
            android.view.View view = (android.view.View) this.c;
            view.setAlpha(0.0f);
            view.setVisibility(4);
        }
    }
}
