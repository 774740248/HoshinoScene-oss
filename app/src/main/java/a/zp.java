package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class zp extends a.rt0 {
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater j = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(a.zp.class, java.lang.Object.class, "_disposer");
    private volatile java.lang.Object _disposer;
    public final a.zs g;
    public a.c90 h;
    public final /* synthetic */ a.bq i;

    public zp(a.bq bqVar, a.at atVar) {
        this.i = bqVar;
        this.g = atVar;
    }

    @Override // a.bp0
    public final /* bridge */ /* synthetic */ java.lang.Object i(java.lang.Object obj) {
        o((java.lang.Throwable) obj);
        return a.no1.f387a;
    }

    @Override // a.rt0
    public final void o(java.lang.Throwable th) {
        a.qm1 qm1Var;
        a.zs zsVar = this.g;
        if (th == null) {
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = a.bq.b;
            a.bq bqVar = this.i;
            if (atomicIntegerFieldUpdater.decrementAndGet(bqVar) == 0) {
                a.d30[] d30VarArr = bqVar.f50a;
                java.util.ArrayList arrayList = new java.util.ArrayList(d30VarArr.length);
                for (a.d30 d30Var : d30VarArr) {
                    arrayList.add(d30Var.e());
                }
                ((a.at) zsVar).j(arrayList);
                return;
            }
            return;
        }
        a.at atVar = (a.at) zsVar;
        atVar.getClass();
        a.dw dwVar = new a.dw(th, false);
        while (true) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a.at.i;
            java.lang.Object obj = atomicReferenceFieldUpdater.get(atVar);
            boolean z = obj instanceof a.f21;
            qm1Var = a.wv.j;
            if (!z) {
                boolean z2 = obj instanceof a.bw;
                qm1Var = null;
                break;
            }
            java.lang.Object y = a.at.y((a.f21) obj, dwVar, atVar.e, null);
            while (!atomicReferenceFieldUpdater.compareAndSet(atVar, obj, y)) {
                if (atomicReferenceFieldUpdater.get(atVar) != obj) {
                    break;
                }
            }
            if (!atVar.s()) {
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = a.at.j;
                a.c90 c90Var = (a.c90) atomicReferenceFieldUpdater2.get(atVar);
                if (c90Var != null) {
                    c90Var.c();
                    atomicReferenceFieldUpdater2.set(atVar, a.e21.c);
                }
            }
        }
        if (qm1Var != null) {
            atVar.m(atVar.e);
            a.aq aqVar = (a.aq) j.get(this);
            if (aqVar != null) {
                aqVar.c();
            }
        }
    }
}
