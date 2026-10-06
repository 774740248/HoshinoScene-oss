package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class zo extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ a.cp h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zo(a.cp cpVar, a.ey eyVar) {
        super(2, eyVar);
        this.h = cpVar;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.zo(this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        a.cp cpVar = this.h;
        if (i == 0) {
            a.b20.q1(obj);
            this.g = 1;
            if (a.wv.Q(1000L, this) == dzVar) {
                return dzVar;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a.b20.q1(obj);
                int i2 = a.cp.E;
                cpVar.getClass();
                if (a.cp.g() && cpVar.u.length() > 0) {
                    java.lang.String str = a.b11.i;
                    cpVar.u = str;
                    cpVar.e(str, "standby", "dynamic");
                }
                return a.no1.f387a;
            }
            a.b20.q1(obj);
        }
        if (!cpVar.y) {
            a.wk wkVar = a.wk.c;
            if (a.wk.e != null) {
                a.wk.i.cancel(256);
                a.wk.e = null;
            }
            cpVar.k();
            this.g = 2;
            if (cpVar.A.e(true, 30, this) == dzVar) {
                return dzVar;
            }
            int i22 = a.cp.E;
            cpVar.getClass();
            if (a.cp.g()) {
                java.lang.String str2 = a.b11.i;
                cpVar.u = str2;
                cpVar.e(str2, "standby", "dynamic");
            }
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.zo) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
