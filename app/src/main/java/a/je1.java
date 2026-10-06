package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class je1 extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ java.lang.StringBuilder h;
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public je1(java.lang.StringBuilder sb, int i, a.ey eyVar) {
        super(2, eyVar);
        this.h = sb;
        this.i = i;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.je1(this.h, this.i, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        if (i == 0) {
            a.b20.q1(obj);
            a.tg1 tg1Var = a.me1.m;
            a.q10 q10Var = a.q10.f457a;
            java.lang.String sb = this.h.toString();
            a.wv.v(sb, "cmds.toString()");
            int i2 = this.i * 1000;
            this.g = 1;
            a.lt0 lt0Var = new a.lt0();
            lt0Var.m(sb, "shell");
            lt0Var.n("delay", i2);
            java.lang.String lt0Var2 = lt0Var.toString();
            a.wv.v(lt0Var2, "task.toString()");
            obj = a.q10.K(q10Var, "shell-delayed-add", lt0Var2, new java.lang.Long(1000L), this, 8);
            if (obj == dzVar) {
                return dzVar;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.b20.q1(obj);
        }
        a.me1.n = (java.lang.String) obj;
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.je1) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
