package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class kn0 implements android.transition.Transition.TransitionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f297a;

    public kn0(java.lang.Runnable runnable) {
        this.f297a = runnable;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(android.transition.Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(android.transition.Transition transition) {
        this.f297a.run();
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(android.transition.Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(android.transition.Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(android.transition.Transition transition) {
    }
}
