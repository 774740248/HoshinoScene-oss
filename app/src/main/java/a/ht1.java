package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ht1 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a.ot1 f217a;
    public final /* synthetic */ a.du1 b;
    public final /* synthetic */ a.du1 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ android.view.View e;

    public ht1(a.ot1 ot1Var, a.du1 du1Var, a.du1 du1Var2, int i, android.view.View view) {
        this.f217a = ot1Var;
        this.b = du1Var;
        this.c = du1Var2;
        this.d = i;
        this.e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        a.ot1 ot1Var = this.f217a;
        ot1Var.f423a.d(animatedFraction);
        float b = ot1Var.f423a.b();
        android.view.animation.PathInterpolator pathInterpolator = a.kt1.e;
        int i = android.os.Build.VERSION.SDK_INT;
        a.du1 du1Var = this.b;
        a.ut1 tt1Var = i >= 30 ? new a.tt1(du1Var) : i >= 29 ? new a.st1(du1Var) : new a.qt1(du1Var);
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((this.d & i2) == 0) {
                tt1Var.c(i2, du1Var.f107a.f(i2));
            } else {
                a.ns0 f = du1Var.f107a.f(i2);
                a.ns0 f2 = this.c.f107a.f(i2);
                float f3 = 1.0f - b;
                tt1Var.c(i2, a.du1.e(f, (int) (((f.f391a - f2.f391a) * f3) + 0.5d), (int) (((f.b - f2.b) * f3) + 0.5d), (int) (((f.c - f2.c) * f3) + 0.5d), (int) (((f.d - f2.d) * f3) + 0.5d)));
            }
        }
        a.kt1.g(this.e, tt1Var.b(), java.util.Collections.singletonList(ot1Var));
    }
}
