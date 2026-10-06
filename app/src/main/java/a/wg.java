package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class wg extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ a.xg h;
    public final /* synthetic */ a.tg i;
    public final /* synthetic */ android.widget.ImageView j;
    public final /* synthetic */ java.lang.String k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wg(a.xg xgVar, a.tg tgVar, android.widget.ImageView imageView, java.lang.String str, a.ey eyVar) {
        super(2, eyVar);
        this.h = xgVar;
        this.i = tgVar;
        this.j = imageView;
        this.k = str;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.wg(this.h, this.i, this.j, this.k, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        if (i == 0) {
            a.b20.q1(obj);
            int i2 = a.xg.l;
            a.xg xgVar = this.h;
            xgVar.getClass();
            a.tg tgVar = this.i;
            java.lang.String packageName = tgVar.getPackageName();
            android.util.LruCache lruCache = xgVar.k;
            android.graphics.drawable.Drawable drawable = (android.graphics.drawable.Drawable) lruCache.get(packageName);
            if (drawable == null && !tgVar.getNotFound()) {
                try {
                    android.graphics.drawable.Drawable applicationIcon = xgVar.c.getPackageManager().getApplicationIcon(packageName);
                    a.wv.v(applicationIcon, "context.packageManager.g…licationIcon(packageName)");
                    lruCache.put(packageName, applicationIcon);
                } catch (java.lang.Exception unused) {
                    tgVar.setNotFound(true);
                }
                drawable = (android.graphics.drawable.Drawable) lruCache.get(packageName);
            }
            if (drawable != null) {
                android.widget.ImageView imageView = this.j;
                if (a.wv.e(imageView.getTag(), this.k)) {
                    a.u20 u20Var = a.z80.f728a;
                    a.zx0 zx0Var = a.by0.f57a;
                    a.vg vgVar = new a.vg(imageView, drawable, null);
                    this.g = 1;
                    if (a.wv.S1(zx0Var, vgVar, this) == dzVar) {
                        return dzVar;
                    }
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
        return ((a.wg) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
