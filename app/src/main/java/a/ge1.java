package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ge1 extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ java.util.List h;
    public final /* synthetic */ a.me1 i;
    public final /* synthetic */ long j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ge1(java.util.List list, a.me1 me1Var, long j, a.ey eyVar) {
        super(2, eyVar);
        this.h = list;
        this.i = me1Var;
        this.j = j;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.ge1(this.h, this.i, this.j, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        if (i == 0) {
            a.b20.q1(obj);
            a.tg1 tg1Var = a.me1.m;
            this.g = 1;
            obj = a.tg1.a(tg1Var, this);
            if (obj == dzVar) {
                return dzVar;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.b20.q1(obj);
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) obj;
        for (a.ee1 ee1Var : (Iterable<a.ee1>) this.h) {
            if (arrayList.contains(ee1Var.b)) {
                ee1Var.f121a = this.j;
            } else {
                a.tg1 tg1Var2 = a.me1.m;
                a.me1 me1Var = this.i;
                me1Var.getClass();
                if (me1Var.b.c(ee1Var.b).freeze) {
                    a.cp cpVar = com.omarea.Scene.c;
                    boolean s = a.fs1.s("freeze_suspend", android.os.Build.VERSION.SDK_INT >= 28);
                    a.tg1 tg1Var3 = a.me1.m;
                    if (s) {
                        a.tg1.q(ee1Var.b);
                    } else {
                        a.tg1.e(ee1Var.b);
                    }
                }
                me1Var.e.remove(ee1Var);
            }
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.ge1) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
