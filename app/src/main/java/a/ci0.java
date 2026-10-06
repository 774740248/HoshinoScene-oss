package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class ci0 extends android.animation.AnimatorListenerAdapter implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public boolean f71a;
    public float b;
    public float c;
    public final /* synthetic */ a.di0 d;

    public ci0(a.fi0 fi0Var) {
        this.d = fi0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        float f = (int) this.c;
        a.gz0 gz0Var = this.d.b;
        if (gz0Var != null) {
            gz0Var.k(f);
        }
        this.f71a = false;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float f;
        float f2;
        boolean z = this.f71a;
        a.di0 di0Var = this.d;
        if (!z) {
            a.gz0 gz0Var = di0Var.b;
            float f3 = 0.0f;
            this.b = gz0Var == null ? 0.0f : gz0Var.c.n;
            a.bi0 bi0Var = (a.bi0) this;
            int i = bi0Var.e;
            a.di0 di0Var2 = bi0Var.f;
            switch (i) {
                case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                    break;
                case 1:
                    f = di0Var2.h;
                    f2 = di0Var2.i;
                    f3 = f + f2;
                    break;
                case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                    f = di0Var2.h;
                    f2 = di0Var2.j;
                    f3 = f + f2;
                    break;
                default:
                    f3 = di0Var2.h;
                    break;
            }
            this.c = f3;
            this.f71a = true;
        }
        float f4 = this.b;
        float animatedFraction = (int) ((valueAnimator.getAnimatedFraction() * (this.c - f4)) + f4);
        a.gz0 gz0Var2 = di0Var.b;
        if (gz0Var2 != null) {
            gz0Var2.k(animatedFraction);
        }
    }
}
