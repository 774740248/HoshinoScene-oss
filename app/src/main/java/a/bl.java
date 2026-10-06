package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class bl extends android.graphics.drawable.Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public a.cp1 f45a;
    public android.animation.AnimatorSet b;
    public java.util.ArrayList c;
    public a.kp d;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final android.graphics.drawable.Drawable newDrawable() {
        throw new java.lang.IllegalStateException("No constant state support for SDK < 24.");
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final android.graphics.drawable.Drawable newDrawable(android.content.res.Resources resources) {
        throw new java.lang.IllegalStateException("No constant state support for SDK < 24.");
    }
}
