package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class in1 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f235a = 2;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ in1(java.lang.Object obj, a.kp kpVar) {
        this.c = obj;
        this.b = kpVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        int i = this.f235a;
        java.lang.Object obj = this.c;
        java.lang.Object obj2 = this.b;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                ((a.kp) obj2).remove(animator);
                ((a.ln1) obj).o.remove(animator);
                return;
            default:
                a.wv.w(animator, "animation");
                ((com.omarea.ui.SearchInput) obj2).j = false;
                ((a.qo0) obj).b();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
        switch (this.f235a) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                ((a.ln1) this.c).o.add(animator);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public in1(com.omarea.ui.SearchInput searchInput, a.vf1 vf1Var) {
        this.b = searchInput;
        this.c = vf1Var;
    }
}
