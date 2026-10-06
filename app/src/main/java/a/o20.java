package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class o20 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f400a;
    public final /* synthetic */ a.p20 b;
    public final /* synthetic */ android.view.ViewPropertyAnimator c;
    public final /* synthetic */ android.view.View d;
    public final /* synthetic */ a.r20 e;

    public /* synthetic */ o20(a.r20 r20Var, a.p20 p20Var, android.view.ViewPropertyAnimator viewPropertyAnimator, android.view.View view, int i) {
        this.f400a = i;
        this.e = r20Var;
        this.b = p20Var;
        this.c = viewPropertyAnimator;
        this.d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        int i = this.f400a;
        a.r20 r20Var = this.e;
        a.p20 p20Var = this.b;
        android.view.View view = this.d;
        android.view.ViewPropertyAnimator viewPropertyAnimator = this.c;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                viewPropertyAnimator.setListener(null);
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                r20Var.c(p20Var.f429a);
                r20Var.r.remove(p20Var.f429a);
                r20Var.i();
                return;
            default:
                viewPropertyAnimator.setListener(null);
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                r20Var.c(p20Var.b);
                r20Var.r.remove(p20Var.b);
                r20Var.i();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
        int i = this.f400a;
        a.r20 r20Var = this.e;
        a.p20 p20Var = this.b;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.da1 da1Var = p20Var.f429a;
                r20Var.getClass();
                return;
            default:
                a.da1 da1Var2 = p20Var.b;
                r20Var.getClass();
                return;
        }
    }
}
