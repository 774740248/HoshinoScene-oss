package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ap1 extends android.graphics.drawable.Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public int f21a;
    public a.zo1 b;
    public android.content.res.ColorStateList c;
    public android.graphics.PorterDuff.Mode d;
    public boolean e;
    public android.graphics.Bitmap f;
    public android.content.res.ColorStateList g;
    public android.graphics.PorterDuff.Mode h;
    public int i;
    public boolean j;
    public boolean k;
    public android.graphics.Paint l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f21a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final android.graphics.drawable.Drawable newDrawable() {
        return new a.cp1(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final android.graphics.drawable.Drawable newDrawable(android.content.res.Resources resources) {
        return new a.cp1(this);
    }
}
