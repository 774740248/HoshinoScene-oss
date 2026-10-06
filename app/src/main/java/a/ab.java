package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ab extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ a.ng1 h;
    public final /* synthetic */ a.b81 i;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityImg j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab(a.ng1 ng1Var, a.b81 b81Var, com.omarea.vtools.activities.ActivityImg activityImg, a.ey eyVar) {
        super(2, eyVar);
        this.h = ng1Var;
        this.i = b81Var;
        this.j = activityImg;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.ab(this.h, this.i, this.j, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        if (i == 0) {
            a.b20.q1(obj);
            a.ng1 ng1Var = this.h;
            java.lang.String str = "dd if='" + ng1Var.c + "' of='/sdcard/" + ((java.lang.Object) ng1Var.f381a) + ".img'\necho $?";
            a.wv.w(str, "shell");
            a.q10 q10Var = a.q10.f457a;
            java.lang.String l = a.q10.l(str);
            a.u20 u20Var = a.z80.f728a;
            a.zx0 zx0Var = a.by0.f57a;
            a.za zaVar = new a.za(this.i, this.j, l, null);
            this.g = 1;
            if (a.wv.S1(zx0Var, zaVar, this) == dzVar) {
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
        return ((a.ab) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
