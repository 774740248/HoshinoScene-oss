package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ii extends a.lj1 implements a.fp0 {
    public final /* synthetic */ android.widget.ImageView g;
    public final /* synthetic */ android.graphics.drawable.Drawable h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ii(android.widget.ImageView imageView, android.graphics.drawable.Drawable drawable, a.ey eyVar) {
        super(2, eyVar);
        this.g = imageView;
        this.h = drawable;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.ii(this.g, this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        this.g.setImageDrawable(this.h);
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.ii iiVar = (a.ii) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        iiVar.e(no1Var);
        return no1Var;
    }
}
