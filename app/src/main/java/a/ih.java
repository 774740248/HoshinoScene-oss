package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ih extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ a.jh h;
    public final /* synthetic */ com.omarea.model.AppInfo i;
    public final /* synthetic */ java.lang.String j;
    public final /* synthetic */ a.gh k;
    public final /* synthetic */ android.widget.ImageView l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ih(a.jh jhVar, com.omarea.model.AppInfo appInfo, java.lang.String str, a.gh ghVar, android.widget.ImageView imageView, a.ey eyVar) {
        super(2, eyVar);
        this.h = jhVar;
        this.i = appInfo;
        this.j = str;
        this.k = ghVar;
        this.l = imageView;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.ih(this.h, this.i, this.j, this.k, this.l, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        a.jh jhVar = this.h;
        if (i == 0) {
            a.b20.q1(obj);
            a.e30 N1 = jhVar.h.N1(this.i.getPackageName());
            this.g = 1;
            obj = N1.o(this);
            if (obj == dzVar) {
                return dzVar;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.b20.q1(obj);
        }
        android.graphics.drawable.Drawable drawable = (android.graphics.drawable.Drawable) obj;
        java.lang.String str = this.j;
        if (drawable == null && (drawable = jhVar.m.K1(str)) == null) {
            drawable = jhVar.j;
        }
        if (a.wv.e(this.k.u, str)) {
            android.widget.ImageView imageView = this.l;
            imageView.post(new a.hh(imageView, drawable, 0));
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.ih) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
