package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class h1 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f198a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ h1(int i, java.lang.Object obj) {
        this.f198a = i;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator animator) {
        switch (this.f198a) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout = (androidx.appcompat.widget.ActionBarOverlayLayout) this.b;
                actionBarOverlayLayout.mCurrentActionBarTopAnimator = null;
                actionBarOverlayLayout.mAnimatingForFling = false;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        int i = this.f198a;
        java.lang.Object obj = this.b;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout = (androidx.appcompat.widget.ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.mCurrentActionBarTopAnimator = null;
                actionBarOverlayLayout.mAnimatingForFling = false;
                return;
            case 1:
                ((a.ln1) obj).m();
                animator.removeListener(this);
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                a.dl dlVar = (a.dl) obj;
                java.util.ArrayList arrayList = new java.util.ArrayList(dlVar.g);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    android.content.res.ColorStateList colorStateList = ((a.yy0) arrayList.get(i2)).b.q;
                    if (colorStateList != null) {
                        a.i90.h(dlVar, colorStateList);
                    }
                }
                return;
            case 3:
                ((com.google.android.material.behavior.HideBottomViewOnScrollBehavior) obj).currentAnimator= null;
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
            default:
                super.onAnimationEnd(animator);
                return;
            case 5:
                a.ai1.t(obj);
                throw null;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                a.ej1 ej1Var = (a.ej1) obj;
                if (((android.animation.ValueAnimator) ej1Var.d) == animator) {
                    ej1Var.d = null;
                    return;
                }
                return;
            case 7:
                a.ca0 ca0Var = (a.ca0) obj;
                ca0Var.q();
                ca0Var.r.start();
                return;
            case 8:
                ((com.google.android.material.transformation.ExpandableTransformationBehavior) obj).currentAnimation= null;
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
        int i = this.f198a;
        java.lang.Object obj = this.b;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                a.dl dlVar = (a.dl) obj;
                java.util.ArrayList arrayList = new java.util.ArrayList(dlVar.g);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    a.az0 az0Var = ((a.yy0) arrayList.get(i2)).b;
                    android.content.res.ColorStateList colorStateList = az0Var.q;
                    if (colorStateList != null) {
                        a.i90.g(dlVar, colorStateList.getColorForState(az0Var.u, colorStateList.getDefaultColor()));
                    }
                }
                return;
            case 3:
            default:
                super.onAnimationStart(animator);
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                a.ai1.t(obj);
                throw null;
            case 5:
                a.ai1.t(obj);
                throw null;
        }
    }
}
