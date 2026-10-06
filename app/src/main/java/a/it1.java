package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class it1 implements java.lang.Runnable {
    public final /* synthetic */ android.view.View c;
    public final /* synthetic */ a.pm d;
    public final /* synthetic */ android.animation.ValueAnimator e;

    public it1(android.view.View view, a.ot1 ot1Var, a.pm pmVar, android.animation.ValueAnimator valueAnimator) {
        this.c = view;
        this.d = pmVar;
        this.e = valueAnimator;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a.kt1.h(this.c, this.d);
        this.e.start();
    }
}
