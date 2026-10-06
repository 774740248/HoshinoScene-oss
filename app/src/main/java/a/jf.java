package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class jf extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityStartSplash h;
    public final /* synthetic */ a.a3 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jf(a.a3 a3Var, com.omarea.vtools.activities.ActivityStartSplash activityStartSplash, a.ey eyVar) {
        super(2, eyVar);
        this.h = activityStartSplash;
        this.i = a3Var;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.jf(this.i, this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        if (i == 0) {
            a.b20.q1(obj);
            this.g = 1;
            if (com.omarea.vtools.activities.ActivityStartSplash.j(this.h, this) == dzVar) {
                return dzVar;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a.b20.q1(obj);
                return a.no1.f387a;
            }
            a.b20.q1(obj);
        }
        this.g = 2;
        if (this.i.a(null, this) == dzVar) {
            return dzVar;
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.jf) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
