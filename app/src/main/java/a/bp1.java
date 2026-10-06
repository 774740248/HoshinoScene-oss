package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class bp1 extends android.graphics.drawable.Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.drawable.Drawable.ConstantState f49a;

    public bp1(android.graphics.drawable.Drawable.ConstantState constantState) {
        this.f49a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f49a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f49a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final android.graphics.drawable.Drawable newDrawable() {
        a.cp1 cp1Var = new a.cp1();
        cp1Var.c = (android.graphics.drawable.VectorDrawable) this.f49a.newDrawable();
        return cp1Var;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final android.graphics.drawable.Drawable newDrawable(android.content.res.Resources resources) {
        a.cp1 cp1Var = new a.cp1();
        cp1Var.c = (android.graphics.drawable.VectorDrawable) this.f49a.newDrawable(resources);
        return cp1Var;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final android.graphics.drawable.Drawable newDrawable(android.content.res.Resources resources, android.content.res.Resources.Theme theme) {
        a.cp1 cp1Var = new a.cp1();
        cp1Var.c = (android.graphics.drawable.VectorDrawable) this.f49a.newDrawable(resources, theme);
        return cp1Var;
    }
}
