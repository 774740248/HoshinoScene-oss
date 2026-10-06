package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ho extends a.lj1 implements a.fp0 {
    public int g;
    public /* synthetic */ java.lang.Object h;
    public final /* synthetic */ java.util.List i;
    public final /* synthetic */ a.nk j;
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ho(java.util.List list, a.nk nkVar, int i, a.ey eyVar) {
        super(2, eyVar);
        this.i = list;
        this.j = nkVar;
        this.k = i;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        a.ho hoVar = new a.ho(this.i, this.j, this.k, eyVar);
        hoVar.h = obj;
        return hoVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        java.lang.Object o;
        int P;
        a.dz dzVar = a.dz.c;
        int i = this.g;
        a.nk nkVar = this.j;
        if (i == 0) {
            a.b20.q1(obj);
            a.cz czVar = (a.cz) this.h;
            java.util.List list = this.i;
            java.util.ArrayList arrayList = new java.util.ArrayList(a.op.J1(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(a.wv.g(czVar, null, new a.go(nkVar, (android.content.pm.PackageInfo) it.next(), this.k, null), 3));
            }
            this.g = 1;
            if (arrayList.isEmpty()) {
                o = a.qb0.c;
            } else {
                a.d30[] d30VarArr = (a.d30[]) arrayList.toArray(new a.d30[0]);
                a.bq bqVar = new a.bq(d30VarArr);
                a.at atVar = new a.at(a.wv.B0(this));
                atVar.p();
                int length = d30VarArr.length;
                a.zp[] zpVarArr = new a.zp[length];
                for (int i2 = 0; i2 < length; i2++) {
                    a.wt0 wt0Var = (a.wt0) d30VarArr[i2];
                    do {
                        P = wt0Var.P(wt0Var.C());
                        if (P != 0) {
                        }
                        a.zp zpVar = new a.zp(bqVar, atVar);
                        zpVar.h = wt0Var.G(false, true, zpVar);
                        zpVarArr[i2] = zpVar;
                    } while (P != 1);
                    a.zp zpVar2 = new a.zp(bqVar, atVar);
                    zpVar2.h = wt0Var.G(false, true, zpVar2);
                    zpVarArr[i2] = zpVar2;
                }
                a.aq aqVar = new a.aq(zpVarArr);
                for (int i3 = 0; i3 < length; i3++) {
                    a.zp zpVar3 = zpVarArr[i3];
                    zpVar3.getClass();
                    a.zp.j.set(zpVar3, aqVar);
                }
                if (!(a.at.i.get(atVar) instanceof a.f21)) {
                    aqVar.c();
                } else {
                    atVar.r(aqVar);
                }
                o = atVar.o();
            }
            if (o == dzVar) {
                return dzVar;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.b20.q1(obj);
        }
        android.database.sqlite.SQLiteDatabase writableDatabase = ((a.e3) nkVar.f).getWritableDatabase();
        writableDatabase.delete("activities", "package_name NOT IN (SELECT package_name FROM apps)", new java.lang.String[0]);
        writableDatabase.delete("providers", "package_name NOT IN (SELECT package_name FROM apps)", new java.lang.String[0]);
        writableDatabase.delete("services", "package_name NOT IN (SELECT package_name FROM apps)", new java.lang.String[0]);
        writableDatabase.delete("receivers", "package_name NOT IN (SELECT package_name FROM apps)", new java.lang.String[0]);
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.ho) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
