package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class te1 extends a.lj1 implements a.fp0 {
    public int g;
    public /* synthetic */ java.lang.Object h;
    public final /* synthetic */ a.be1 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public te1(a.be1 be1Var, a.ey eyVar) {
        super(2, eyVar);
        this.i = be1Var;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        a.te1 te1Var = new a.te1(this.i, eyVar);
        te1Var.h = obj;
        return te1Var;
    }

    /* JADX WARN: Type inference failed for: r12v0, types: [a.zv, a.wt0] */
    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        java.lang.Object o;
        java.util.List list;
        a.dz dzVar = a.dz.c;
        int i = this.g;
        if (i == 0) {
            a.b20.q1(obj);
            a.cz czVar = (a.cz) this.h;
            java.util.List<a.y31> z0 = a.b20.z0(new a.y31("cn", "https://omarea.com"), new a.y31("cn2", "http://scene7.omarea.com:8080"), new a.y31("gb", "https://vtools.online"));
            a.zv wt0Var = (zv) new a.wt0(true);
            wt0Var.F(null);
            java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(z0.size());
            a.be1 be1Var = this.i;
            java.util.ArrayList arrayList = new java.util.ArrayList(a.op.J1(z0, 10));
            for (a.y31 y31Var : z0) {
                java.util.ArrayList arrayList2 = arrayList;
                arrayList2.add(a.wv.M0(czVar, null, new a.se1(wt0Var, (java.lang.String) y31Var.c, atomicInteger, be1Var, (java.lang.String) y31Var.d, null), 3));
                arrayList = arrayList2;
            }
            java.util.ArrayList arrayList3 = arrayList;
            this.h = arrayList3;
            this.g = 1;
            o = wt0Var.o(this);
            if (o == dzVar) {
                return dzVar;
            }
            list = arrayList3;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (java.util.List) this.h;
            a.b20.q1(obj);
            o = obj;
        }
        java.lang.String str = (java.lang.String) o;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            a.wv.p((a.nt0) it.next());
        }
        if (str != null && str.length() != 0) {
            a.cp cpVar = com.omarea.Scene.c;
            a.fs1.O("area", str);
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.te1) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
