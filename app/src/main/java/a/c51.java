package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class c51 extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ a.d51 h;
    public final /* synthetic */ long i;
    public final /* synthetic */ java.lang.String j;
    public final /* synthetic */ a.z41 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c51(a.d51 d51Var, long j, java.lang.String str, a.z41 z41Var, a.ey eyVar) {
        super(2, eyVar);
        this.h = d51Var;
        this.i = j;
        this.j = str;
        this.k = z41Var;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.c51(this.h, this.i, this.j, this.k, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.r51 storage;
        boolean z;
        java.util.ArrayList arrayList;
        a.r51 storage2;
        a.dz dzVar = a.dz.c;
        int i = this.g;
        if (i == 0) {
            a.b20.q1(obj);
            a.d51 d51Var = this.h;
            storage = d51Var.getStorage();
            long j = this.i;
            java.util.ArrayList E = storage.E(j, this.j);
            int i2 = 0;
            if (!E.isEmpty()) {
                java.util.Iterator it = E.iterator();
                loop3: while (it.hasNext()) {
                    java.util.ArrayList arrayList2 = (java.util.ArrayList) it.next();
                    if (!(arrayList2 instanceof java.util.Collection) || !arrayList2.isEmpty()) {
                        java.util.Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            if (((java.lang.Number) it2.next()).intValue() > 0) {
                                z = true;
                                break loop3;
                            }
                        }
                    }
                }
            }
            z = false;
            if (this.k == a.z41.CacheMisses) {
                storage2 = d51Var.getStorage();
                java.util.ArrayList E2 = storage2.E(j, "cache_references");
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                int size = E.size() < E2.size() ? E.size() : E2.size();
                while (i2 < size) {
                    java.util.Iterator it3 = ((java.util.ArrayList) E.get(i2)).iterator();
                    long j2 = 0;
                    while (it3.hasNext()) {
                        a.wv.v((java.lang.Integer) it3.next(), "value");
                        j2 += a.z41.f.intValue();
                        arrayList3 = arrayList3;
                    }
                    java.util.ArrayList arrayList4 = arrayList3;
                    long j3 = 0;
                    for (java.util.Iterator it4 = ((java.util.ArrayList) E2.get(i2)).iterator(); it4.hasNext(); it4 = it4) {
                        a.wv.v((java.lang.Integer) it4.next(), "value");
                        j3 += a.z41.f.intValue();
                        E2 = E2;
                    }
                    java.util.ArrayList arrayList5 = E2;
                    float f = 0.0f;
                    if (j3 > 0) {
                        float f2 = (((float) j2) * 100.0f) / ((float) j3);
                        if (f2 > 100.0f) {
                            f = 100.0f;
                        } else if (f2 >= 0.0f) {
                            f = f2;
                        }
                    }
                    arrayList4.add(java.lang.Float.valueOf(f));
                    i2++;
                    arrayList3 = arrayList4;
                    E2 = arrayList5;
                }
                arrayList = arrayList3;
            } else {
                arrayList = new java.util.ArrayList();
            }
            a.u20 u20Var = a.z80.f728a;
            a.zx0 zx0Var = a.by0.f57a;
            a.b51 b51Var = new a.b51(this.h, this.i, this.k, z, arrayList, E, null);
            this.g = 1;
            if (a.wv.S1(zx0Var, b51Var, this) == dzVar) {
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
        return ((a.c51) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
