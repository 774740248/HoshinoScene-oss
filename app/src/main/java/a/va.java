package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class va extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ java.lang.String h;
    public final /* synthetic */ java.lang.String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va(java.lang.String str, java.lang.String str2, a.ey eyVar) {
        super(2, eyVar);
        this.h = str;
        this.i = str2;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.va(this.h, this.i, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        if (i == 0) {
            a.b20.q1(obj);
            a.q10 q10Var = a.q10.f457a;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("am start -n ");
            sb.append(this.h);
            sb.append("/");
            java.lang.String j = a.ai1.j(sb, this.i, " -f 0x10200000");
            this.g = 1;
            if (a.q10.K(q10Var, "exec-shell", j, null, this, 12) == dzVar) {
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
        return ((a.va) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
