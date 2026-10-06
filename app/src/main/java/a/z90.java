package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class z90 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f729a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ z90(int i, java.lang.Object obj) {
        this.f729a = i;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        int i = this.f729a;
        java.lang.Object obj = this.b;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.ca0 ca0Var = (a.ca0) obj;
                ca0Var.getClass();
                ca0Var.d.setAlpha(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                com.omarea.ui.CpuChartView cpuChartView = (com.omarea.ui.CpuChartView) obj;
                int i2 = com.omarea.ui.CpuChartView.t;
                a.wv.w(cpuChartView, "this$0");
                a.wv.w(valueAnimator, "animation");
                java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
                a.wv.t(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                cpuChartView.m = ((java.lang.Integer) animatedValue).intValue();
                cpuChartView.invalidate();
                return;
            default:
                com.omarea.ui.SearchInput searchInput = (com.omarea.ui.SearchInput) obj;
                int i3 = com.omarea.ui.SearchInput.m;
                a.wv.w(searchInput, "this$0");
                a.wv.w(valueAnimator, "it");
                android.view.ViewGroup.LayoutParams layoutParams = searchInput.getLayoutParams();
                java.lang.Object animatedValue2 = valueAnimator.getAnimatedValue();
                a.wv.t(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
                layoutParams.width = ((java.lang.Integer) animatedValue2).intValue();
                searchInput.setLayoutParams(layoutParams);
                return;
        }
    }
}
