package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class sm {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.ImageView f530a;
    public a.nm1 b;
    public int c = 0;

    public sm(android.widget.ImageView imageView) {
        this.f530a = imageView;
    }

    public final void a() {
        a.nm1 nm1Var;
        android.widget.ImageView imageView = this.f530a;
        android.graphics.drawable.Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            a.m90.a(drawable);
        }
        if (drawable == null || (nm1Var = this.b) == null) {
            return;
        }
        a.nm.e(drawable, nm1Var, imageView.getDrawableState());
    }

    public final void b(android.util.AttributeSet attributeSet, int i) {
        int x;
        android.widget.ImageView imageView = this.f530a;
        android.content.Context context = imageView.getContext();
        int[] iArr = a.u81.f;
        a.nk G = a.nk.G(context, attributeSet, iArr, i);
        a.jq1.n(imageView, imageView.getContext(), iArr, attributeSet, (android.content.res.TypedArray) G.e, i);
        try {
            android.graphics.drawable.Drawable drawable = imageView.getDrawable();
            if (drawable == null && (x = G.x(1, -1)) != -1 && (drawable = a.b20.Y(imageView.getContext(), x)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                a.m90.a(drawable);
            }
            if (G.C(2)) {
                a.yr0.c(imageView, G.i(2));
            }
            if (G.C(3)) {
                a.yr0.d(imageView, a.m90.b(G.o(3, -1), null));
            }
            G.K();
        } catch (java.lang.Throwable th) {
            G.K();
            throw th;
        }
    }

    public final void c(int i) {
        android.widget.ImageView imageView = this.f530a;
        if (i != 0) {
            android.graphics.drawable.Drawable Y = a.b20.Y(imageView.getContext(), i);
            if (Y != null) {
                a.m90.a(Y);
            }
            imageView.setImageDrawable(Y);
        } else {
            imageView.setImageDrawable(null);
        }
        a();
    }
}
