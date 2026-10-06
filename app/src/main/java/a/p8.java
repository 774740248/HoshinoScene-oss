package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class p8 extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ java.util.ArrayList h;
    public final /* synthetic */ a.w60 i;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityFiles j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p8(java.util.ArrayList arrayList, a.w60 w60Var, com.omarea.vtools.activities.ActivityFiles activityFiles, a.ey eyVar) {
        super(2, eyVar);
        this.h = arrayList;
        this.i = w60Var;
        this.j = activityFiles;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.p8(this.h, this.i, this.j, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        if (i == 0) {
            a.b20.q1(obj);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : this.h) {
                if (!a.gy.h((java.lang.String) obj2)) {
                    arrayList.add(obj2);
                }
            }
            a.u20 u20Var = a.z80.f728a;
            a.zx0 zx0Var = a.by0.f57a;
            a.o8 o8Var = new a.o8(this.i, arrayList, this.j, null);
            this.g = 1;
            if (a.wv.S1(zx0Var, o8Var, this) == dzVar) {
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
        return ((a.p8) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
