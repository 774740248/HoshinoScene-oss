package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class og extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ android.content.pm.ActivityInfo h;
    public final /* synthetic */ a.pg i;
    public final /* synthetic */ a.mg j;
    public final /* synthetic */ java.lang.String k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public og(android.content.pm.ActivityInfo activityInfo, a.pg pgVar, a.mg mgVar, java.lang.String str, a.ey eyVar) {
        super(2, eyVar);
        this.h = activityInfo;
        this.i = pgVar;
        this.j = mgVar;
        this.k = str;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.og(this.h, this.i, this.j, this.k, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        if (i == 0) {
            a.b20.q1(obj);
            android.graphics.drawable.Drawable loadIcon = this.h.loadIcon(this.i.h);
            a.mg mgVar = this.j;
            android.widget.ImageView imageView = mgVar.d;
            a.wv.s(imageView);
            if (loadIcon != null && a.wv.e(mgVar.f349a, this.k)) {
                a.u20 u20Var = a.z80.f728a;
                a.zx0 zx0Var = a.by0.f57a;
                a.ng ngVar = new a.ng(imageView, loadIcon, null);
                this.g = 1;
                if (a.wv.S1(zx0Var, ngVar, this) == dzVar) {
                    return dzVar;
                }
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.b20.q1(obj);
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.og) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
