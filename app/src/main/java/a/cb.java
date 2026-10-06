package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class cb extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityImg h;
    public final /* synthetic */ java.lang.String i;
    public final /* synthetic */ a.ng1 j;
    public final /* synthetic */ a.b81 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cb(com.omarea.vtools.activities.ActivityImg activityImg, java.lang.String str, a.ng1 ng1Var, a.b81 b81Var, a.ey eyVar) {
        super(2, eyVar);
        this.h = activityImg;
        this.i = str;
        this.j = ng1Var;
        this.k = b81Var;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.cb(this.h, this.i, this.j, this.k, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        if (i == 0) {
            a.b20.q1(obj);
            com.omarea.vtools.activities.ActivityImg activityImg = this.h;
            java.lang.String str = a.b20.m0(activityImg.getContext(), 2131886085) + "\nflash_image '" + this.i + "' '" + this.j.c + "'\necho $?";
            a.wv.w(str, "shell");
            a.q10 q10Var = a.q10.f457a;
            java.lang.String l = a.q10.l(str);
            a.u20 u20Var = a.z80.f728a;
            a.zx0 zx0Var = a.by0.f57a;
            a.bb bbVar = new a.bb(this.k, activityImg, l, null);
            this.g = 1;
            if (a.wv.S1(zx0Var, bbVar, this) == dzVar) {
                return dzVar;
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
        return ((a.cb) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
