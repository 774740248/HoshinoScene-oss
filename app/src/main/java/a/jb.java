package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class jb extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityMain h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jb(com.omarea.vtools.activities.ActivityMain activityMain, a.ey eyVar) {
        super(2, eyVar);
        this.h = activityMain;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.jb(this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        try {
            if (i == 0) {
                a.b20.q1(obj);
                this.g = 1;
                if (a.wv.Q(3000L, this) == dzVar) {
                    return dzVar;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a.b20.q1(obj);
            }
            new a.re1(this.h.getContext()).o();
        } catch (java.lang.Exception unused) {
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.jb) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
