package com.google.android.material.appbar;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class a implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.coordinatorlayout.widget.CoordinatorLayout f756a;
    public final /* synthetic */ com.google.android.material.appbar.AppBarLayout b;
    public final /* synthetic */ com.google.android.material.appbar.AppBarLayout.BaseBehavior c;

    public a(com.google.android.material.appbar.AppBarLayout.BaseBehavior baseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.appbar.AppBarLayout appBarLayout) {
        this.c = baseBehavior;
        this.f756a = coordinatorLayout;
        this.b = appBarLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        int intValue = ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue();
        this.c.w(this.f756a, this.b, intValue);
    }
}
