package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class md0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f344a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ md0(int i, java.lang.Object obj) {
        this.f344a = i;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        int i = this.f344a;
        java.lang.Object obj = this.b;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                int floatValue = (int) (((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                a.nd0 nd0Var = (a.nd0) obj;
                nd0Var.c.setAlpha(floatValue);
                nd0Var.d.setAlpha(floatValue);
                nd0Var.s.invalidate();
                return;
            default:
                ((a.zs0) obj).m = valueAnimator.getAnimatedFraction();
                return;
        }
    }
}
