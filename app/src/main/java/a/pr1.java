package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class pr1 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f449a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ pr1(java.lang.Object obj, int i, java.lang.Object obj2) {
        this.f449a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        int i = this.f449a;
        java.lang.Object obj = this.b;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                ((android.view.View) ((a.et1) ((a.vu0) obj).d).d.getParent()).invalidate();
                return;
            default:
                com.omarea.common.ui.RippleLoadingView rippleLoadingView = (com.omarea.common.ui.RippleLoadingView) obj;
                android.animation.ValueAnimator valueAnimator2 = (android.animation.ValueAnimator) this.c;
                int i2 = com.omarea.common.ui.RippleLoadingView.k;
                a.wv.w(rippleLoadingView, "this$0");
                a.wv.w(valueAnimator, "it");
                java.lang.Object animatedValue = valueAnimator2.getAnimatedValue();
                a.wv.t(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                rippleLoadingView.j = ((java.lang.Float) animatedValue).floatValue();
                rippleLoadingView.invalidate();
                return;
        }
    }
}
