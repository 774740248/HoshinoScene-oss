package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class zs0 implements android.animation.Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    public final float f745a;
    public final float b;
    public final float c;
    public final float d;
    public final a.da1 e;
    public final int f;
    public final android.animation.ValueAnimator g;
    public boolean h;
    public float i;
    public float j;
    public boolean k = false;
    public boolean l = false;
    public float m;
    public final /* synthetic */ int n;
    public final /* synthetic */ a.da1 o;
    public final /* synthetic */ a.ct0 p;

    public zs0(a.ct0 ct0Var, a.da1 da1Var, int i, float f, float f2, float f3, float f4, int i2, a.da1 da1Var2) {
        this.p = ct0Var;
        this.n = i2;
        this.o = da1Var2;
        this.f = i;
        this.e = da1Var;
        this.f745a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        this.g = ofFloat;
        ofFloat.addUpdateListener(new a.md0(1, this));
        ofFloat.setTarget(da1Var.f91a);
        ofFloat.addListener(this);
        this.m = 0.0f;
    }

    public final void a(android.animation.Animator animator) {
        if (!this.l) {
            this.e.r(true);
        }
        this.l = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator animator) {
        this.m = 1.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        a(animator);
        if (this.k) {
            return;
        }
        int i = this.n;
        a.da1 da1Var = this.o;
        a.ct0 ct0Var = this.p;
        if (i <= 0) {
            ct0Var.m.a(ct0Var.q, da1Var);
        } else {
            ct0Var.f82a.add(da1Var.f91a);
            this.h = true;
            if (i > 0) {
                ct0Var.q.post(new a.iw(ct0Var, this, i, 5));
            }
        }
        android.view.View view = ct0Var.v;
        android.view.View view2 = da1Var.f91a;
        if (view == view2) {
            ct0Var.p(view2);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final /* bridge */ /* synthetic */ void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final /* bridge */ /* synthetic */ void onAnimationStart(android.animation.Animator animator) {
    }
}
