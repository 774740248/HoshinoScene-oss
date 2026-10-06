package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class yb extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ com.omarea.model.MagiskModuleUnofficial h;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityModuleUpload i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yb(com.omarea.model.MagiskModuleUnofficial magiskModuleUnofficial, com.omarea.vtools.activities.ActivityModuleUpload activityModuleUpload, a.ey eyVar) {
        super(2, eyVar);
        this.h = magiskModuleUnofficial;
        this.i = activityModuleUpload;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.yb(this.h, this.i, eyVar);
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [a.be1, a.qr0] */
    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        com.omarea.vtools.activities.ActivityModuleUpload activityModuleUpload = this.i;
        a.dz dzVar = a.dz.c;
        int i = this.g;
        try {
            if (i == 0) {
                a.b20.q1(obj);
                a.be1 qr0Var = (be1) new a.qr0();
                java.lang.String dbId = this.h.getDbId();
                a.wv.s(dbId);
                java.lang.String str = activityModuleUpload.o;
                a.wv.s(str);
                boolean n = qr0Var.n(dbId, str);
                a.zx0 zx0Var = a.by0.f57a;
                a.xb xbVar = new a.xb(n, activityModuleUpload, null);
                this.g = 1;
                if (a.wv.S1(zx0Var, xbVar, this) == dzVar) {
                    return dzVar;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a.b20.q1(obj);
            }
        } catch (java.lang.Exception unused) {
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.yb) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
