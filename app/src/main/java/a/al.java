package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class al extends android.graphics.drawable.Animatable2.AnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a.yy0 f16a;

    public al(a.yy0 yy0Var) {
        this.f16a = yy0Var;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(android.graphics.drawable.Drawable drawable) {
        android.content.res.ColorStateList colorStateList = this.f16a.b.q;
        if (colorStateList != null) {
            a.i90.h(drawable, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(android.graphics.drawable.Drawable drawable) {
        a.az0 az0Var = this.f16a.b;
        android.content.res.ColorStateList colorStateList = az0Var.q;
        if (colorStateList != null) {
            a.i90.g(drawable, colorStateList.getColorForState(az0Var.u, colorStateList.getDefaultColor()));
        }
    }
}
