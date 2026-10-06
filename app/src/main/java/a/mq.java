package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class mq extends android.animation.AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f359a;
    public final /* synthetic */ a.vq b;

    public /* synthetic */ mq(a.vq vqVar, int i) {
        this.f359a = i;
        this.b = vqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        int i = this.f359a;
        a.vq vqVar = this.b;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                vqVar.c();
                return;
            default:
                vqVar.c();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
        switch (this.f359a) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.vq vqVar = this.b;
                a.tx txVar = vqVar.j;
                int i = vqVar.c;
                int i2 = vqVar.f639a;
                int i3 = i - i2;
                com.google.android.material.snackbar.SnackbarContentLayout snackbarContentLayout = (com.google.android.material.snackbar.SnackbarContentLayout) txVar;
                snackbarContentLayout.messageView.setAlpha(0.0f);
                long j = i2;
                android.view.ViewPropertyAnimator duration = snackbarContentLayout.messageView.animate().alpha(1.0f).setDuration(j);
                android.animation.TimeInterpolator timeInterpolator = snackbarContentLayout.contentInterpolator;
                long j2 = i3;
                duration.setInterpolator(timeInterpolator).setStartDelay(j2).start();
                if (snackbarContentLayout.actionView.getVisibility() == 0) {
                    snackbarContentLayout.actionView.setAlpha(0.0f);
                    snackbarContentLayout.actionView.animate().alpha(1.0f).setDuration(j).setInterpolator(timeInterpolator).setStartDelay(j2).start();
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
