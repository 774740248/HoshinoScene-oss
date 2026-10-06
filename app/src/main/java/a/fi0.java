package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class fi0 extends a.di0 {
    public android.animation.StateListAnimator K;
    public a.yr backgroundTint;
    public android.graphics.drawable.Drawable backgroundTintMode;
    public boolean imageTint;
    public int customSize;

    @Override // a.di0
    public final float e() {
        return this.s.getElevation();
    }

    @Override // a.di0
    public final void f(android.graphics.Rect rect) {
        if (((com.google.android.material.floatingactionbutton.FloatingActionButton) this.t.c).compatPadding) {
            super.f(rect);
            return;
        }
        if (this.imageTint) {
            com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton = this.s;
            int sizeDimension = floatingActionButton.getSizeDimension();
            int i = this.customSize;
            if (sizeDimension < i) {
                int sizeDimension2 = (i - floatingActionButton.getSizeDimension()) / 2;
                rect.set(sizeDimension2, sizeDimension2, sizeDimension2, sizeDimension2);
                return;
            }
        }
        rect.set(0, 0, 0, 0);
    }

    @Override // a.di0
    public final void g(android.content.res.ColorStateList colorStateList, android.graphics.PorterDuff.Mode mode, android.content.res.ColorStateList colorStateList2, int i) {
        android.graphics.drawable.Drawable drawable;
        a.gz0 s = s();
        this.b = s;
        s.setTintList(colorStateList);
        if (mode != null) {
            this.b.setTintMode(mode);
        }
        a.gz0 gz0Var = this.b;
        com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton = this.s;
        gz0Var.j(floatingActionButton.getContext());
        if (i > 0) {
            android.content.Context context = floatingActionButton.getContext();
            a.wg1 wg1Var = this.f99a;
            wg1Var.getClass();
            a.yr yrVar = new a.yr(wg1Var);
            java.lang.Object obj = a.zx.f748a;
            int a2 = a.yx.a(context, 2131099767);
            int a3 = a.yx.a(context, 2131099766);
            int a4 = a.yx.a(context, 2131099764);
            int a5 = a.yx.a(context, 2131099765);
            yrVar.i = a2;
            yrVar.j = a3;
            yrVar.k = a4;
            yrVar.l = a5;
            float f = i;
            if (yrVar.h != f) {
                yrVar.h = f;
                yrVar.b.setStrokeWidth(f * 1.3333f);
                yrVar.n = true;
                yrVar.invalidateSelf();
            }
            if (colorStateList != null) {
                yrVar.m = colorStateList.getColorForState(yrVar.getState(), yrVar.m);
            }
            yrVar.p = colorStateList;
            yrVar.n = true;
            yrVar.invalidateSelf();
            this.backgroundTint = yrVar;
            a.yr yrVar2 = this.backgroundTint;
            yrVar2.getClass();
            a.gz0 gz0Var2 = this.b;
            gz0Var2.getClass();
            drawable = new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{yrVar2, gz0Var2});
        } else {
            this.backgroundTint = null;
            drawable = this.b;
        }
        android.graphics.drawable.RippleDrawable rippleDrawable = new android.graphics.drawable.RippleDrawable(a.dc1.b(colorStateList2), drawable, null);
        this.c = rippleDrawable;
        this.backgroundTintMode = rippleDrawable;
    }

    @Override // a.di0
    public final void h() {
    }

    @Override // a.di0
    public final void i() {
        q();
    }

    @Override // a.di0
    public final void j(int[] iArr) {
    }

    @Override // a.di0
    public final void k(float f, float f2, float f3) {
        com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton = this.s;
        if (floatingActionButton.getStateListAnimator() == this.K) {
            android.animation.StateListAnimator stateListAnimator = new android.animation.StateListAnimator();
            stateListAnimator.addState(a.di0.E, r(f, f3));
            stateListAnimator.addState(a.di0.F, r(f, f2));
            stateListAnimator.addState(a.di0.G, r(f, f2));
            stateListAnimator.addState(a.di0.H, r(f, f2));
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(android.animation.ObjectAnimator.ofFloat(floatingActionButton, "elevation", f).setDuration(0L));
            arrayList.add(android.animation.ObjectAnimator.ofFloat(floatingActionButton, (android.util.Property<android.view.View, java.lang.Float>) android.view.View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((android.animation.Animator[]) arrayList.toArray(new android.animation.Animator[0]));
            animatorSet.setInterpolator(a.di0.z);
            stateListAnimator.addState(a.di0.I, animatorSet);
            stateListAnimator.addState(a.di0.J, r(0.0f, 0.0f));
            this.K = stateListAnimator;
            floatingActionButton.setStateListAnimator(stateListAnimator);
        }
        if (o()) {
            q();
        }
    }

    @Override // a.di0
    public final void m(android.content.res.ColorStateList colorStateList) {
        android.graphics.drawable.Drawable drawable = this.c;
        if (drawable instanceof android.graphics.drawable.RippleDrawable) {
            ((android.graphics.drawable.RippleDrawable) drawable).setColor(a.dc1.b(colorStateList));
        } else {
            super.m(colorStateList);
        }
    }

    @Override // a.di0
    public final boolean o() {
        return ((com.google.android.material.floatingactionbutton.FloatingActionButton) this.t.c).compatPadding || (this.imageTint && this.s.getSizeDimension() < this.customSize);
    }

    @Override // a.di0
    public final void p() {
    }

    public final android.animation.AnimatorSet r(float f, float f2) {
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton = this.s;
        animatorSet.play(android.animation.ObjectAnimator.ofFloat(floatingActionButton, "elevation", f).setDuration(0L)).with(android.animation.ObjectAnimator.ofFloat(floatingActionButton, (android.util.Property<android.view.View, java.lang.Float>) android.view.View.TRANSLATION_Z, f2).setDuration(100L));
        animatorSet.setInterpolator(a.di0.z);
        return animatorSet;
    }

    public final a.gz0 s() {
        a.wg1 wg1Var = this.f99a;
        wg1Var.getClass();
        return new a.gz0(wg1Var);
    }
}
