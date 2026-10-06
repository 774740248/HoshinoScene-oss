package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class v20 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f618a;
    public final /* synthetic */ android.view.View b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ a.hi1 d;
    public final /* synthetic */ a.y20 e;

    public v20(android.view.ViewGroup viewGroup, android.view.View view, boolean z, a.hi1 hi1Var, a.y20 y20Var) {
        this.f618a = viewGroup;
        this.b = view;
        this.c = z;
        this.d = hi1Var;
        this.e = y20Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        android.view.ViewGroup viewGroup = this.f618a;
        android.view.View view = this.b;
        viewGroup.endViewTransition(view);
        if (this.c) {
            a.ii1.a(this.d.f206a, view);
        }
        this.e.b();
    }
}
