package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class in0 implements android.transition.Transition.TransitionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f234a;
    public final /* synthetic */ java.util.ArrayList b;

    public in0(android.view.View view, java.util.ArrayList arrayList) {
        this.f234a = view;
        this.b = arrayList;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(android.transition.Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(android.transition.Transition transition) {
        transition.removeListener(this);
        this.f234a.setVisibility(8);
        java.util.ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((android.view.View) arrayList.get(i)).setVisibility(0);
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(android.transition.Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(android.transition.Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(android.transition.Transition transition) {
        transition.removeListener(this);
        transition.addListener(this);
    }
}
