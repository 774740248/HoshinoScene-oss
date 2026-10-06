package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ed extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityPowerBench h;
    public final /* synthetic */ a.w60 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ed(com.omarea.vtools.activities.ActivityPowerBench activityPowerBench, a.w60 w60Var, a.ey eyVar) {
        super(2, eyVar);
        this.h = activityPowerBench;
        this.i = w60Var;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.ed(this.h, this.i, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        java.lang.Object I;
        a.dz dzVar = a.dz.c;
        int i = this.g;
        if (i == 0) {
            a.b20.q1(obj);
            com.omarea.vtools.activities.ActivityPowerBench activityPowerBench = this.h;
            a.h61 h61Var = activityPowerBench.I;
            if (h61Var == null) {
                a.wv.M1("session");
                throw null;
            }
            java.lang.String C = activityPowerBench.C(h61Var);
            a.i61 F = activityPowerBench.F();
            java.util.ArrayList arrayList = activityPowerBench.H;
            boolean[] zArr = activityPowerBench.S;
            a.h61 h61Var2 = activityPowerBench.I;
            if (h61Var2 == null) {
                a.wv.M1("session");
                throw null;
            }
            int i2 = h61Var2.g;
            F.getClass();
            a.wv.w(arrayList, "records");
            a.wv.w(zArr, "targetCPU");
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            int size = ((a.g61) a.qv.e2(arrayList)).b().size();
            for (int i3 = 0; i3 < size; i3++) {
                sb.append("CPU" + i3 + "(M Cycles),");
            }
            sb.append("CPU(℃),Power(mW),-#I(mW),Efficiency by cycles(%),Efficiency by score(%)");
            java.util.ArrayList arrayList2 = new java.util.ArrayList(zArr.length);
            int length = zArr.length;
            int i4 = 0;
            int i5 = 0;
            while (i4 < length) {
                int i6 = i5 + 1;
                arrayList2.add(zArr[i4] ? java.lang.Integer.valueOf(i5) : null);
                i4++;
                i5 = i6;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                if (next != null) {
                    arrayList3.add(next);
                }
            }
            java.util.Iterator it2 = arrayList.iterator();
            double d = 0.0d;
            double d2 = 0.0d;
            while (it2.hasNext()) {
                a.g61 g61Var = (a.g61) it2.next();
                java.util.ArrayList a2 = g61Var.a();
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                int i7 = 0;
                for (java.lang.Object obj2 : a2) {
                    int i8 = i7 + 1;
                    if (i7 < 0) {
                        a.b20.p1();
                        throw null;
                    }
                    ((java.lang.Number) obj2).intValue();
                    java.util.Iterator it3 = it2;
                    if (arrayList3.contains(java.lang.Integer.valueOf(i7))) {
                        arrayList4.add(obj2);
                    }
                    i7 = i8;
                    it2 = it3;
                }
                java.util.Iterator it4 = it2;
                java.util.Iterator it5 = arrayList4.iterator();
                int i9 = 0;
                while (it5.hasNext()) {
                    i9 += ((java.lang.Number) it5.next()).intValue();
                }
                int i10 = g61Var.c - i2;
                if (i10 > 0) {
                    a.dz dzVar2 = dzVar;
                    double d3 = i10;
                    double d4 = i9 / d3;
                    com.omarea.vtools.activities.ActivityPowerBench activityPowerBench2 = activityPowerBench;
                    double d5 = g61Var.f / d3;
                    if (d4 > d) {
                        d = d4;
                    }
                    if (d5 > d2) {
                        d2 = d5;
                        activityPowerBench = activityPowerBench2;
                        dzVar = dzVar2;
                        it2 = it4;
                    } else {
                        activityPowerBench = activityPowerBench2;
                        dzVar = dzVar2;
                        it2 = it4;
                    }
                } else {
                    it2 = it4;
                }
            }
            a.dz dzVar3 = dzVar;
            com.omarea.vtools.activities.ActivityPowerBench activityPowerBench3 = activityPowerBench;
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                a.g61 g61Var2 = (a.g61) it6.next();
                sb.append("\n");
                java.util.Iterator it7 = g61Var2.a().iterator();
                while (it7.hasNext()) {
                    java.lang.Integer num = (java.lang.Integer) it7.next();
                    a.wv.v(num, "cpu");
                    sb.append(num.intValue());
                    sb.append(",");
                }
                sb.append(g61Var2.e);
                sb.append(",");
                sb.append(g61Var2.c);
                sb.append(",");
                sb.append(g61Var2.c - i2);
                sb.append(",");
                java.util.ArrayList a3 = g61Var2.a();
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                int i11 = 0;
                for (java.lang.Object obj3 : a3) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        a.b20.p1();
                        throw null;
                    }
                    ((java.lang.Number) obj3).intValue();
                    if (arrayList3.contains(java.lang.Integer.valueOf(i11))) {
                        arrayList5.add(obj3);
                    }
                    i11 = i12;
                }
                java.util.Iterator it8 = arrayList5.iterator();
                int i13 = 0;
                while (it8.hasNext()) {
                    i13 += ((java.lang.Number) it8.next()).intValue();
                }
                int i14 = g61Var2.c - i2;
                if (i14 > 0) {
                    double d6 = i14;
                    java.util.Iterator it9 = it6;
                    com.omarea.vtools.activities.ActivityPowerBench activityPowerBench4 = activityPowerBench3;
                    double d7 = 100;
                    sb.append((int) (((i13 / d6) * d7) / d));
                    sb.append(",");
                    sb.append((int) (((g61Var2.f / d6) * d7) / d2));
                    it6 = it9;
                    i2 = i2;
                    activityPowerBench3 = activityPowerBench4;
                } else {
                    sb.append(",");
                }
            }
            com.omarea.vtools.activities.ActivityPowerBench activityPowerBench5 = activityPowerBench3;
            java.lang.String sb2 = sb.toString();
            a.wv.v(sb2, "builder.toString()");
            try {
                java.io.File file = new java.io.File(a.pe0.f434a + "/" + C + ".csv");
                byte[] bytes = sb2.getBytes(a.bu.f53a);
                a.wv.v(bytes, "this as java.lang.String).getBytes(charset)");
                a.pe0.f(file, bytes);
                I = java.lang.Boolean.TRUE;
            } catch (java.lang.Throwable th) {
                I = a.b20.I(th);
            }
            java.lang.Object obj4 = I;
            if (obj4 instanceof a.ac1) {
                obj4 = null;
            }
            if (a.wv.e(obj4, java.lang.Boolean.TRUE)) {
                a.cp cpVar = com.omarea.Scene.c;
                java.lang.String string = activityPowerBench5.getString(2131952297);
                a.wv.v(string, "getString(R.string.fps_export_success)");
                a.fs1.X(string, 0);
            } else {
                a.cp cpVar2 = com.omarea.Scene.c;
                java.lang.String string2 = activityPowerBench5.getString(2131952296);
                a.wv.v(string2, "getString(R.string.fps_export_fail)");
                a.fs1.X(string2, 0);
            }
            a.u20 u20Var = a.z80.f728a;
            a.zx0 zx0Var = a.by0.f57a;
            a.dd ddVar = new a.dd(this.i, null);
            this.g = 1;
            if (a.wv.S1(zx0Var, ddVar, this) == dzVar3) {
                return dzVar3;
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
        return ((a.ed) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
