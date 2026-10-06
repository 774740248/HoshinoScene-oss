package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class jn0 implements android.transition.Transition.TransitionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f260a;
    public final /* synthetic */ java.util.ArrayList b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.util.ArrayList d;
    public final /* synthetic */ java.lang.Object e;
    public final /* synthetic */ java.util.ArrayList f;
    public final /* synthetic */ a.ln0 g;

    public jn0(a.ln0 ln0Var, java.lang.Object obj, java.util.ArrayList arrayList, java.lang.Object obj2, java.util.ArrayList arrayList2, java.lang.Object obj3, java.util.ArrayList arrayList3) {
        this.g = ln0Var;
        this.f260a = obj;
        this.b = arrayList;
        this.c = obj2;
        this.d = arrayList2;
        this.e = obj3;
        this.f = arrayList3;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(android.transition.Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(android.transition.Transition transition) {
        transition.removeListener(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(android.transition.Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(android.transition.Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(android.transition.Transition transition) {
        a.ln0 ln0Var = this.g;
        java.lang.Object obj = this.f260a;
        if (obj != null) {
            ln0Var.v(obj, this.b, null);
        }
        java.lang.Object obj2 = this.c;
        if (obj2 != null) {
            ln0Var.v(obj2, this.d, null);
        }
        java.lang.Object obj3 = this.e;
        if (obj3 != null) {
            ln0Var.v(obj3, this.f, null);
        }
    }
}
