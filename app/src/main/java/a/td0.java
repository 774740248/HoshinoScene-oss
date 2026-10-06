package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class td0 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ android.graphics.drawable.Drawable g;
    public final /* synthetic */ android.widget.ImageView h;
    public final /* synthetic */ java.lang.String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public td0(android.graphics.drawable.Drawable drawable, android.widget.ImageView imageView, java.lang.String str, a.ey eyVar) {
        super(2, eyVar);
        this.g = drawable;
        this.h = imageView;
        this.i = str;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.td0(this.g, this.h, this.i, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        android.graphics.drawable.Drawable drawable = this.g;
        if (drawable != null) {
            android.widget.ImageView imageView = this.h;
            if (a.wv.e(imageView.getTag(), this.i)) {
                imageView.setImageDrawable(drawable);
            }
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.td0 td0Var = (a.td0) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        td0Var.e(no1Var);
        return no1Var;
    }
}
