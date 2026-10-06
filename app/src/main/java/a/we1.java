package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class we1 extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ a.be1 h;
    public final /* synthetic */ java.lang.String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public we1(a.be1 be1Var, java.lang.String str, a.ey eyVar) {
        super(2, eyVar);
        this.h = be1Var;
        this.i = str;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.we1(this.h, this.i, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        if (i == 0) {
            a.b20.q1(obj);
            a.be1 be1Var = this.h;
            java.lang.String str = this.i;
            this.g = 1;
            a.at atVar = new a.at(a.wv.B0(this));
            atVar.p();
            java.lang.String str2 = "";
            if (str == null) {
                try {
                    str = a.tg1.i();
                } catch (java.lang.Exception unused) {
                }
            }
            str2 = be1Var.k(str.concat("/ping"), "");
            atVar.j(str2);
            obj = atVar.o();
            if (obj == dzVar) {
                return dzVar;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.b20.q1(obj);
        }
        return obj;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.we1) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
