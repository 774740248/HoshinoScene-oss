package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class od extends a.uu0 implements a.qo0 {
    public final /* synthetic */ a.ka1 d;
    public final /* synthetic */ a.ka1 e;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityPowerBench f;
    public final /* synthetic */ java.util.ArrayList g;
    public final /* synthetic */ java.util.HashSet h;
    public final /* synthetic */ int[] i;
    public final /* synthetic */ int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public od(a.ka1 ka1Var, a.ka1 ka1Var2, com.omarea.vtools.activities.ActivityPowerBench activityPowerBench, java.util.ArrayList arrayList, java.util.HashSet hashSet, int[] iArr, int i) {
        super(0);
        this.d = ka1Var;
        this.e = ka1Var2;
        this.f = activityPowerBench;
        this.g = arrayList;
        this.h = hashSet;
        this.i = iArr;
        this.j = i;
    }

    @Override // a.qo0
    public final java.lang.Object b() {
        int[] iArr;
        int i;
        java.lang.Integer valueOf;
        a.ka1 ka1Var = this.d;
        int i2 = ka1Var.c;
        while (i2 <= ka1Var.c) {
            a.ka1 ka1Var2 = this.e;
            int i3 = ka1Var2.c;
            com.omarea.vtools.activities.ActivityPowerBench activityPowerBench = this.f;
            if (i3 > ((java.lang.Number) activityPowerBench.M.a()).intValue()) {
                break;
            }
            java.util.ArrayList arrayList = this.g;
            a.wv.v(arrayList, "clusters");
            java.util.Iterator it = a.qv.z2(arrayList).iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                iArr = this.i;
                i = 0;
                if (!hasNext) {
                    break;
                }
                a.cs0 cs0Var = (a.cs0) it.next();
                if (this.h.contains(java.lang.Integer.valueOf(cs0Var.f80a))) {
                    activityPowerBench.F.getClass();
                    int i4 = cs0Var.f80a;
                    java.lang.String[] c = a.ls.c(i4);
                    a.wv.v(c, "cpuUtil.getAvailableFrequencies(cluster.index)");
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(c.length);
                    int length = c.length;
                    while (i < length) {
                        java.lang.String str = c[i];
                        a.wv.v(str, "it");
                        arrayList2.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str)));
                        i++;
                    }
                    java.util.List s2 = a.qv.s2(arrayList2, new a.py(24));
                    iArr[i4] = ((java.lang.Number) a.qv.l2(s2)).intValue();
                    java.util.Iterator it2 = s2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        int intValue = ((java.lang.Number) it2.next()).intValue();
                        if (intValue >= ka1Var2.c && intValue <= this.j) {
                            iArr[i4] = intValue;
                            break;
                        }
                    }
                }
            }
            a.wv.w(iArr, "<this>");
            int i5 = 0;
            for (int i6 : iArr) {
                i5 += i6;
            }
            int i7 = ka1Var2.c;
            if (iArr.length == 0) {
                valueOf = null;
            } else {
                int i8 = iArr[0];
                a.rs0 it3 = new a.qs0(1, iArr.length - 1, 1).iterator();
                while (it3.e) {
                    int i9 = iArr[it3.b()];
                    if (i8 > i9) {
                        i8 = i9;
                    }
                }
                valueOf = java.lang.Integer.valueOf(i8);
            }
            if (valueOf != null) {
                i = valueOf.intValue();
            }
            ka1Var2.c = java.lang.Math.max(i7, i) + 100000;
            i2 = i5;
        }
        ka1Var.c = i2;
        return a.no1.f387a;
    }
}
