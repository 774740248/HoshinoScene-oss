package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ap extends a.lj1 implements a.fp0 {
    public final /* synthetic */ a.cp g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ap(a.cp cpVar, a.ey eyVar) {
        super(2, eyVar);
        this.g = cpVar;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.ap(this.g, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        a.me1 me1Var = this.g.A;
        me1Var.getClass();
        a.cp cpVar = com.omarea.Scene.c;
        int i = a.fs1.D().getInt("freeze_suspend_time_limit", 2) * 60000;
        if (i > 0) {
            java.util.ArrayList arrayList = me1Var.e;
            if (!arrayList.isEmpty()) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    java.lang.Object next = it.next();
                    a.ee1 ee1Var = (a.ee1) next;
                    long j = ee1Var.f121a;
                    if (j > -1 && currentTimeMillis - j > i && !a.wv.e(ee1Var.b, me1Var.c)) {
                        arrayList2.add(next);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    a.wv.M0(a.wv.b(a.z80.b), null, new a.ge1(arrayList2, me1Var, currentTimeMillis, null), 3);
                }
            }
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.ap apVar = (a.ap) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        apVar.e(no1Var);
        return no1Var;
    }
}
