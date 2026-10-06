package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class em1 {
    public java.lang.String b;

    /* renamed from: a, reason: collision with root package name */
    public int f128a = 1;
    public final java.util.HashMap c = new java.util.HashMap();

    /* JADX WARN: Removed duplicated region for block: B:13:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable a(int r6, a.ey r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof a.cm1
            if (r0 == 0) goto L13
            r0 = r7
            a.cm1 r0 = (a.cm1) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            a.cm1 r0 = new a.cm1
            r0.<init>(r5, r7)
        L18:
            a.jt0 r7 = r0.h
            a.dz r1 = a.dz.c
            int r2 = r0.j
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            int r6 = r0.g
            a.em1 r0 = r0.f
            a.b20.q1(r7)
            goto L74
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            int r6 = r0.g
            a.em1 r0 = r0.f
            a.b20.q1(r7)
            goto L5b
        L3e:
            a.b20.q1(r7)
            java.lang.String r7 = r5.b
            if (r7 == 0) goto L5e
            a.q10 r2 = a.q10.f457a
            r0.f = r5
            r0.g = r6
            r0.j = r4
            java.lang.String r0 = "pkg:"
            java.lang.String r7 = r0.concat(r7)
            a.jt0 r7 = a.q10.o(r7)
            if (r7 != r1) goto L5a
            return r1
        L5a:
            r0 = r5
        L5b:
            a.jt0 r7 = (a.jt0) r7
            goto L76
        L5e:
            a.q10 r7 = a.q10.f457a
            int r7 = r5.f128a
            r0.f = r5
            r0.g = r6
            r0.j = r3
            java.lang.String r7 = java.lang.String.valueOf(r7)
            a.jt0 r7 = a.q10.o(r7)
            if (r7 != r1) goto L73
            return r1
        L73:
            r0 = r5
        L74:
            a.jt0 r7 = (a.jt0) r7
        L76:
            if (r7 == 0) goto L7d
            java.util.ArrayList r6 = r0.b(r7, r6)
            return r6
        L7d:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.em1.a(int, a.ey):java.io.Serializable");
    }

    public final java.util.ArrayList b(a.jt0 jt0Var, int i) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int size = jt0Var.f269a.size();
        for (int i2 = 0; i2 < size; i2++) {
            a.lt0 c = jt0Var.c(i2);
            double c2 = ((int) (c.c("load") * 10)) / 10.0d;
            if (i2 > i || (i2 > 14 && c2 < 0.1d)) {
                break;
            }
            a.am1 am1Var = new a.am1();
            am1Var.f19a = c.j("pid", 0);
            am1Var.c = c.l("cpus");
            am1Var.d = c.j("cpu", -1);
            am1Var.f = c2;
            am1Var.g = c.l("comm");
            am1Var.e = c.k("duration");
            am1Var.h = c.k("start_time");
            java.util.HashMap hashMap = this.c;
            a.am1 am1Var2 = (a.am1) hashMap.get(java.lang.Integer.valueOf(am1Var.f19a));
            if (am1Var2 != null && am1Var2.h == am1Var.h) {
                java.lang.String str = am1Var2.g;
                if (str == null) {
                    a.wv.M1("comm");
                    throw null;
                }
                am1Var.g = str;
            }
            hashMap.put(java.lang.Integer.valueOf(am1Var.f19a), am1Var);
            arrayList.add(am1Var);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(a.ey r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof a.dm1
            if (r0 == 0) goto L13
            r0 = r5
            a.dm1 r0 = (a.dm1) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            a.dm1 r0 = new a.dm1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.g
            a.dz r1 = a.dz.c
            int r2 = r0.i
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            a.em1 r0 = r0.f
            a.b20.q1(r5)
            goto L48
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            a.b20.q1(r5)
            a.q10 r5 = a.q10.f457a
            r0.f = r4
            r0.i = r3
            r5 = 65536(0x10000, float:9.1835E-41)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            a.jt0 r5 = a.q10.o(r5)
            if (r5 != r1) goto L47
            return r1
        L47:
            r0 = r4
        L48:
            java.util.HashMap r5 = r0.c
            r5.clear()
            a.no1 r5 = a.no1.f387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a.em1.c(a.ey):java.lang.Object");
    }
}
