package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class qr1 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f477a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ qr1(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i) {
        this.f477a = i;
        this.d = obj;
        this.c = obj2;
        this.b = obj3;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator animator) {
        switch (this.f477a) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                ((a.vr1) this.c).b((android.view.View) this.b);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        int i = this.f477a;
        java.lang.Object obj = this.c;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                ((a.vr1) obj).a();
                return;
            default:
                ((a.ot1) obj).f423a.d(1.0f);
                a.kt1.e((android.view.View) this.b);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
        switch (this.f477a) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                ((a.vr1) this.c).c();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
