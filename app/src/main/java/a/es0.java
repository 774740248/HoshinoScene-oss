package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class es0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f134a;
    public final /* synthetic */ android.widget.TextView b;
    public final /* synthetic */ int c;
    public final /* synthetic */ android.widget.TextView d;
    public final /* synthetic */ a.gs0 e;

    public es0(a.gs0 gs0Var, int i, android.widget.TextView textView, int i2, android.widget.TextView textView2) {
        this.e = gs0Var;
        this.f134a = i;
        this.b = textView;
        this.c = i2;
        this.d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        a.vn vnVar;
        int i = this.f134a;
        a.gs0 gs0Var = this.e;
        gs0Var.n = i;
        gs0Var.l = null;
        android.widget.TextView textView = this.b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.c == 1 && (vnVar = gs0Var.r) != null) {
                vnVar.setText((java.lang.CharSequence) null);
            }
        }
        android.widget.TextView textView2 = this.d;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
        android.widget.TextView textView = this.d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
