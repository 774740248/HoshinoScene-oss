package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class bd0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f39a;
    public final /* synthetic */ android.view.View b;

    public bd0(boolean z, android.view.View view) {
        this.f39a = z;
        this.b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        if (this.f39a) {
            return;
        }
        this.b.setVisibility(4);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
        if (this.f39a) {
            this.b.setVisibility(0);
        }
    }
}
