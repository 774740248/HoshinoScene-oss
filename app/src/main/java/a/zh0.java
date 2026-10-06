package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class zh0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f735a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float g;
    public final /* synthetic */ android.graphics.Matrix h;
    public final /* synthetic */ a.di0 i;

    public zh0(a.di0 di0Var, float f, float f2, float f3, float f4, float f5, float f6, float f7, android.graphics.Matrix matrix) {
        this.i = di0Var;
        this.f735a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = f7;
        this.h = matrix;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        a.di0 di0Var = this.i;
        di0Var.s.setAlpha(a.el.b(this.f735a, this.b, 0.0f, 0.2f, floatValue));
        com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton = di0Var.s;
        float f = this.c;
        float f2 = this.d;
        floatingActionButton.setScaleX(a.el.a(f, f2, floatValue));
        di0Var.s.setScaleY(a.el.a(this.e, f2, floatValue));
        float f3 = this.f;
        float f4 = this.g;
        di0Var.p = a.el.a(f3, f4, floatValue);
        float a2 = a.el.a(f3, f4, floatValue);
        android.graphics.Matrix matrix = this.h;
        di0Var.a(a2, matrix);
        di0Var.s.setImageMatrix(matrix);
    }
}
