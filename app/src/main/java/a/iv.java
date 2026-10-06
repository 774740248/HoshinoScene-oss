package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class iv extends android.animation.AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f240a;
    public final /* synthetic */ a.jv b;

    public /* synthetic */ iv(a.jv jvVar, int i) {
        this.f240a = i;
        this.b = jvVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        switch (this.f240a) {
            case 1:
                this.b.b.g(false);
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
        switch (this.f240a) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                this.b.b.g(true);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
