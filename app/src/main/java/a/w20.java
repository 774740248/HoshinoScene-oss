package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class w20 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f648a = 0;
    public final /* synthetic */ android.view.ViewGroup b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;

    public w20(android.view.ViewGroup viewGroup, a.gk0 gk0Var, a.sl0 sl0Var, a.ct ctVar) {
        this.b = viewGroup;
        this.c = gk0Var;
        this.d = sl0Var;
        this.e = ctVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(android.view.animation.Animation animation) {
        int i = this.f648a;
        android.view.ViewGroup viewGroup = this.b;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                viewGroup.post(new a.lk0(1, this));
                return;
            default:
                viewGroup.post(new a.lk0(0, this));
                return;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(android.view.animation.Animation animation) {
    }

    public w20(a.a30 a30Var, android.view.ViewGroup viewGroup, android.view.View view, a.y20 y20Var) {
        this.e = a30Var;
        this.b = viewGroup;
        this.c = view;
        this.d = y20Var;
    }
}
