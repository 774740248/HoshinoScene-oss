package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class kq extends android.animation.AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f299a;
    public final /* synthetic */ a.vq b;

    public /* synthetic */ kq(a.vq vqVar, int i, int i2) {
        this.f299a = i2;
        this.b = vqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        int i = this.f299a;
        a.vq vqVar = this.b;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                vqVar.b();
                return;
            default:
                vqVar.b();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
        switch (this.f299a) {
            case 1:
                a.vq vqVar = this.b;
                com.google.android.material.snackbar.SnackbarContentLayout snackbarContentLayout = (com.google.android.material.snackbar.SnackbarContentLayout) vqVar.j;
                snackbarContentLayout.messageView.setAlpha(1.0f);
                android.view.ViewPropertyAnimator alpha = snackbarContentLayout.messageView.animate().alpha(0.0f);
                long j = vqVar.b;
                android.view.ViewPropertyAnimator duration = alpha.setDuration(j);
                android.animation.TimeInterpolator timeInterpolator = snackbarContentLayout.contentInterpolator;
                long j2 = 0;
                duration.setInterpolator(timeInterpolator).setStartDelay(j2).start();
                if (snackbarContentLayout.actionView.getVisibility() == 0) {
                    snackbarContentLayout.actionView.setAlpha(1.0f);
                    snackbarContentLayout.actionView.animate().alpha(0.0f).setDuration(j).setInterpolator(timeInterpolator).setStartDelay(j2).start();
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
