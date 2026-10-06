package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class zr implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f743a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ zr(int i, java.lang.Object obj) {
        this.f743a = i;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        int i = this.f743a;
        java.lang.Object obj = this.b;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
                a.gz0 gz0Var = ((com.google.android.material.bottomsheet.BottomSheetBehavior) obj).materialShapeDrawable;
                if (gz0Var != null) {
                    a.fz0 fz0Var = gz0Var.c;
                    if (fz0Var.j != floatValue) {
                        fz0Var.j = floatValue;
                        gz0Var.g = true;
                        gz0Var.invalidateSelf();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ((com.google.android.material.tabs.TabLayout) obj).scrollTo(((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                return;
            default:
                ((com.google.android.material.textfield.TextInputLayout) obj).collapsingTextHelper.k(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
