package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class yj extends a.lj1 implements a.fp0 {
    public final /* synthetic */ a.zj g;
    public final /* synthetic */ com.omarea.model.AppInfo h;
    public final /* synthetic */ android.widget.ImageView i;
    public final /* synthetic */ int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yj(a.zj zjVar, com.omarea.model.AppInfo appInfo, android.widget.ImageView imageView, int i, a.ey eyVar) {
        super(2, eyVar);
        this.g = zjVar;
        this.h = appInfo;
        this.i = imageView;
        this.j = i;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.yj(this.g, this.h, this.i, this.j, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        android.graphics.drawable.Drawable L1 = this.g.e.L1(this.h);
        if (L1 != null) {
            android.widget.ImageView imageView = this.i;
            if (a.wv.e(imageView.getTag(), new java.lang.Integer(this.j))) {
                imageView.post(new a.hh(imageView, L1, 2));
            }
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.yj yjVar = (a.yj) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        yjVar.e(no1Var);
        return no1Var;
    }
}
