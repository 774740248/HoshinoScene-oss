package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class mh extends a.lj1 implements a.fp0 {
    public final /* synthetic */ a.nh g;
    public final /* synthetic */ com.omarea.model.AppInfo h;
    public final /* synthetic */ android.widget.ImageView i;
    public final /* synthetic */ int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mh(a.nh nhVar, com.omarea.model.AppInfo appInfo, android.widget.ImageView imageView, int i, a.ey eyVar) {
        super(2, eyVar);
        this.g = nhVar;
        this.h = appInfo;
        this.i = imageView;
        this.j = i;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.mh(this.g, this.h, this.i, this.j, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        android.graphics.drawable.Drawable L1 = this.g.f.L1(this.h);
        if (L1 != null) {
            android.widget.ImageView imageView = this.i;
            if (a.wv.e(imageView.getTag(), new java.lang.Integer(this.j))) {
                imageView.post(new a.hh(imageView, L1, 1));
            }
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.mh mhVar = (a.mh) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        mhVar.e(no1Var);
        return no1Var;
    }
}
