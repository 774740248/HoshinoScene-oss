package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ji extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ android.content.pm.ComponentInfo h;
    public final /* synthetic */ a.ki i;
    public final /* synthetic */ a.hi j;
    public final /* synthetic */ java.lang.String k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ji(android.content.pm.ComponentInfo componentInfo, a.ki kiVar, a.hi hiVar, java.lang.String str, a.ey eyVar) {
        super(2, eyVar);
        this.h = componentInfo;
        this.i = kiVar;
        this.j = hiVar;
        this.k = str;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.ji(this.h, this.i, this.j, this.k, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        if (i == 0) {
            a.b20.q1(obj);
            android.graphics.drawable.Drawable loadIcon = this.h.loadIcon(this.i.i);
            a.hi hiVar = this.j;
            android.widget.ImageView imageView = hiVar.d;
            a.wv.s(imageView);
            if (loadIcon != null && a.wv.e(hiVar.f205a, this.k)) {
                a.u20 u20Var = a.z80.f728a;
                a.zx0 zx0Var = a.by0.f57a;
                a.ii iiVar = new a.ii(imageView, loadIcon, null);
                this.g = 1;
                if (a.wv.S1(zx0Var, iiVar, this) == dzVar) {
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
        return ((a.ji) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
