package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class di0 {

    public di0() {
        this(null, null);
    }

    /* renamed from: a, reason: collision with root package name */
    public a.wg1 f99a;
    public a.gz0 b;
    public android.graphics.drawable.Drawable c;
    public a.yr d;
    public android.graphics.drawable.LayerDrawable e;
    public boolean f;
    public float h;
    public float i;
    public float j;
    public int k;
    public android.animation.Animator l;
    public a.p11 m;
    public a.p11 n;
    public float o;
    public int q;
    public final com.google.android.material.floatingactionbutton.FloatingActionButton s;
    public final a.pe t;
    public a.ny y;
    public static final a.gd0 z = a.el.c;
    public static final int A = 2130969353;
    public static final int B = 2130969369;
    public static final int C = 2130969356;
    public static final int D = 2130969367;
    public static final int[] E = {android.R.attr.state_pressed, android.R.attr.state_enabled};
    public static final int[] F = {android.R.attr.state_hovered, android.R.attr.state_focused, android.R.attr.state_enabled};
    public static final int[] G = {android.R.attr.state_focused, android.R.attr.state_enabled};
    public static final int[] H = {android.R.attr.state_hovered, android.R.attr.state_enabled};
    public static final int[] I = {android.R.attr.state_enabled};
    public static final int[] J = new int[0];
    public boolean g = true;
    public float p = 1.0f;
    public int r = 0;
    public final android.graphics.Rect u = new android.graphics.Rect();
    public final android.graphics.RectF v = new android.graphics.RectF();
    public final android.graphics.RectF w = new android.graphics.RectF();
    public final android.graphics.Matrix x = new android.graphics.Matrix();

    public di0(com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton, a.pe peVar) {
        int i = 1;
        this.s = floatingActionButton;
        this.t = peVar;
        a.ej1 ej1Var = new a.ej1(6);
        a.fi0 fi0Var = (a.fi0) this;
        ej1Var.i(E, d(new a.bi0(fi0Var, 2)));
        ej1Var.i(F, d(new a.bi0(fi0Var, i)));
        ej1Var.i(G, d(new a.bi0(fi0Var, i)));
        ej1Var.i(H, d(new a.bi0(fi0Var, i)));
        ej1Var.i(I, d(new a.bi0(fi0Var, 3)));
        ej1Var.i(J, d(new a.bi0(fi0Var, 0)));
        this.o = floatingActionButton.getRotation();
    }

    public static android.animation.ValueAnimator d(a.bi0 bi0Var) {
        android.animation.ValueAnimator valueAnimator = new android.animation.ValueAnimator();
        valueAnimator.setInterpolator(z);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(bi0Var);
        valueAnimator.addUpdateListener(bi0Var);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    public final void a(float f, android.graphics.Matrix matrix) {
        matrix.reset();
        if (this.s.getDrawable() == null || this.q == 0) {
            return;
        }
        android.graphics.RectF rectF = this.v;
        android.graphics.RectF rectF2 = this.w;
        rectF.set(0.0f, 0.0f, this.s.getIntrinsicWidth(), this.s.getIntrinsicHeight());
        int i = this.q;
        rectF2.set(0.0f, 0.0f, i, i);
        matrix.setRectToRect(rectF, rectF2, android.graphics.Matrix.ScaleToFit.CENTER);
        int i2 = this.q;
        matrix.postScale(f, f, i2 / 2.0f, i2 / 2.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [android.animation.TypeEvaluator, a.ai0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.animation.TypeEvaluator, a.ai0, java.lang.Object] */
    public final android.animation.AnimatorSet b(a.p11 p11Var, float f, float f2, float f3) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.util.Property property = android.view.View.ALPHA;
        float[] fArr = {f};
        com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton = this.s;
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(floatingActionButton, (android.util.Property<android.view.View, java.lang.Float>) property, fArr);
        p11Var.d("opacity").a(ofFloat);
        arrayList.add(ofFloat);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(floatingActionButton, (android.util.Property<android.view.View, java.lang.Float>) android.view.View.SCALE_X, f2);
        p11Var.d("scale").a(ofFloat2);
        int i = android.os.Build.VERSION.SDK_INT;
        if (i == 26) {
            ai0 obj = new ai0();
            obj.f12a = new android.animation.FloatEvaluator();
            ofFloat2.setEvaluator(obj);
        }
        arrayList.add(ofFloat2);
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(floatingActionButton, (android.util.Property<android.view.View, java.lang.Float>) android.view.View.SCALE_Y, f2);
        p11Var.d("scale").a(ofFloat3);
        if (i == 26) {
            ai0 obj2 = new ai0();
            obj2.f12a = new android.animation.FloatEvaluator();
            ofFloat3.setEvaluator(obj2);
        }
        arrayList.add(ofFloat3);
        android.graphics.Matrix matrix = this.x;
        a(f3, matrix);
        android.animation.ObjectAnimator ofObject = android.animation.ObjectAnimator.ofObject(floatingActionButton, new a.nt(), new a.yh0(this), new android.graphics.Matrix(matrix));
        p11Var.d("iconScale").a(ofObject);
        arrayList.add(ofObject);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        a.wv.Y0(animatorSet, arrayList);
        return animatorSet;
    }

    public final android.animation.AnimatorSet c(float f, float f2, float f3, int i, int i2) {
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton = this.s;
        ofFloat.addUpdateListener(new a.zh0(this, floatingActionButton.getAlpha(), f, floatingActionButton.getScaleX(), f2, floatingActionButton.getScaleY(), this.p, f3, new android.graphics.Matrix(this.x)));
        arrayList.add(ofFloat);
        a.wv.Y0(animatorSet, arrayList);
        animatorSet.setDuration(a.wv.o1(floatingActionButton.getContext(), i, floatingActionButton.getContext().getResources().getInteger(2131427366)));
        animatorSet.setInterpolator(a.wv.p1(floatingActionButton.getContext(), i2, a.el.b));
        return animatorSet;
    }

    public abstract float e();

    public void f(android.graphics.Rect rect) {
        int sizeDimension = this.f ? (this.k - this.s.getSizeDimension()) / 2 : 0;
        int max = java.lang.Math.max(sizeDimension, (int) java.lang.Math.ceil(this.g ? e() + this.j : 0.0f));
        int max2 = java.lang.Math.max(sizeDimension, (int) java.lang.Math.ceil(this.s * 1.5f));
        rect.set(max, max2, max, max2);
    }

    public abstract void g(android.content.res.ColorStateList colorStateList, android.graphics.PorterDuff.Mode mode, android.content.res.ColorStateList colorStateList2, int i);

    public abstract void h();

    public abstract void i();

    public abstract void j(int[] iArr);

    public abstract void k(float f, float f2, float f3);

    public final void l() {
    }

    public void m(android.content.res.ColorStateList colorStateList) {
        android.graphics.drawable.Drawable drawable = this.c;
        if (drawable != null) {
            a.i90.h(drawable, a.dc1.b(colorStateList));
        }
    }

    public final void n(a.wg1 wg1Var) {
        this.f99a = wg1Var;
        a.gz0 gz0Var = this.b;
        if (gz0Var != null) {
            gz0Var.setShapeAppearanceModel(wg1Var);
        }
        java.lang.Object obj = this.c;
        if (obj instanceof a.hh1) {
            ((a.hh1) obj).setShapeAppearanceModel(wg1Var);
        }
        a.yr yrVar = this.d;
        if (yrVar != null) {
            yrVar.o = wg1Var;
            yrVar.invalidateSelf();
        }
    }

    public abstract boolean o();

    public abstract void p();

    public final void q() {
        android.graphics.Rect rect = this.u;
        f(rect);
        a.wv.u(this.e, "Didn't initialize content background");
        boolean o = o();
        a.pe peVar = this.t;
        if (o) {
            super/*android.view.View*/.setBackgroundDrawable(new android.graphics.drawable.InsetDrawable((android.graphics.drawable.Drawable) this.e, rect.left, rect.top, rect.right, rect.bottom));
        } else {
            android.graphics.drawable.LayerDrawable layerDrawable = this.e;
            if (layerDrawable != null) {
                super/*android.view.View*/.setBackgroundDrawable(layerDrawable);
            } else {
                peVar.getClass();
            }
        }
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        ((com.google.android.material.floatingactionbutton.FloatingActionButton) peVar.c).shadowPadding.set(i, i2, i3, i4);
        com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton = (com.google.android.material.floatingactionbutton.FloatingActionButton) peVar.c;
        int i5 = floatingActionButton.customSize;
        floatingActionButton.setPadding(i + i5, i2 + i5, i3 + i5, i4 + i5);
    }
}
