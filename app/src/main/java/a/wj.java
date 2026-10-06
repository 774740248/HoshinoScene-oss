package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class wj extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ a.mc1 h;
    public final /* synthetic */ a.xj i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wj(a.mc1 mc1Var, a.xj xjVar, a.ey eyVar) {
        super(2, eyVar);
        this.h = mc1Var;
        this.i = xjVar;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.wj(this.h, this.i, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        if (i == 0) {
            a.b20.q1(obj);
            a.mc1 mc1Var = this.h;
            a.mc1 r = a.fs1.r(mc1Var.a());
            java.lang.String str = r.c;
            boolean z = r.e;
            a.xj xjVar = this.i;
            xjVar.r = z && (xjVar.t || !a.yi1.B2(xjVar.s, str) || xjVar.s.length() <= str.length());
            if (mc1Var.e) {
                a.ux0 ux0Var = xjVar.y;
                java.util.ArrayList arrayList = (java.util.ArrayList) ux0Var.a(mc1Var.c);
                if (arrayList == null) {
                    java.lang.String str2 = xjVar.o;
                    if (str2 == null) {
                        str2 = "";
                    }
                    arrayList = mc1Var.b(str2, xjVar.f == 2);
                }
                xjVar.A(arrayList);
                xjVar.g = arrayList;
                if (xjVar.f == 2) {
                    ux0Var.b(mc1Var.c, arrayList);
                }
            }
            xjVar.m = mc1Var;
            xjVar.p();
            a.u20 u20Var = a.z80.f728a;
            a.zx0 zx0Var = a.by0.f57a;
            a.vj vjVar = new a.vj(mc1Var, xjVar, null);
            this.g = 1;
            if (a.wv.S1(zx0Var, vjVar, this) == dzVar) {
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
        return ((a.wj) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
