package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class f5 extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityApplications h;
    public final /* synthetic */ java.util.List i;
    public final /* synthetic */ a.w60 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5(com.omarea.vtools.activities.ActivityApplications activityApplications, java.util.List list, a.w60 w60Var, a.ey eyVar) {
        super(2, eyVar);
        this.h = activityApplications;
        this.i = list;
        this.j = w60Var;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.f5(this.h, this.i, this.j, eyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00bb A[RETURN] */
    @Override // a.iq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.Object r14) {
        /*
            r13 = this;
            a.dz r0 = a.dz.c
            int r1 = r13.g
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L26
            if (r1 == r5) goto L22
            if (r1 == r4) goto L1d
            if (r1 != r3) goto L15
            a.b20.q1(r14)
            goto Lbc
        L15:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L1d:
            a.b20.q1(r14)
            goto La8
        L22:
            a.b20.q1(r14)
            goto L36
        L26:
            a.b20.q1(r14)
            a.q10 r14 = a.q10.f457a
            r13.g = r5
            r1 = 5000(0x1388, float:7.006E-42)
            java.lang.Object r14 = r14.I(r1, r13)
            if (r14 != r0) goto L36
            return r0
        L36:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            com.omarea.vtools.activities.ActivityApplications r1 = r13.h
            java.lang.String r5 = "user"
            java.lang.Object r1 = r1.getSystemService(r5)
            android.os.UserManager r1 = (android.os.UserManager) r1
            android.os.UserHandle r5 = android.os.Process.myUserHandle()
            if (r1 == 0) goto L55
            long r5 = r1.getSerialNumberForUser(r5)
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r5)
            goto L56
        L55:
            r1 = r2
        L56:
            java.util.List r5 = r13.i
            java.util.Iterator r5 = r5.iterator()
        L5c:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L8e
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = "pm uninstall "
            java.lang.String r8 = "\n"
            a.ai1.u(r7, r6, r8, r14)
            if (r1 == 0) goto L5c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r9 = "pm uninstall --user "
            r7.<init>(r9)
            r7.append(r1)
            java.lang.String r9 = " "
            r7.append(r9)
            r7.append(r6)
            r7.append(r8)
            java.lang.String r6 = r7.toString()
            r14.append(r6)
            goto L5c
        L8e:
            a.q10 r7 = a.q10.f457a
            java.lang.String r9 = r14.toString()
            java.lang.String r14 = "builder.toString()"
            a.wv.v(r9, r14)
            r13.g = r4
            java.lang.String r8 = "exec-shell"
            r10 = 0
            r12 = 12
            r11 = r13
            java.lang.Object r14 = a.q10.K(r7, r8, r9, r10, r11, r12)
            if (r14 != r0) goto La8
            return r0
        La8:
            a.u20 r14 = a.z80.f728a
            a.zx0 r14 = a.by0.f57a
            a.e5 r1 = new a.e5
            a.w60 r4 = r13.j
            r1.<init>(r4, r2)
            r13.g = r3
            java.lang.Object r14 = a.wv.S1(r14, r1, r13)
            if (r14 != r0) goto Lbc
            return r0
        Lbc:
            a.no1 r14 = a.no1.f387a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: a.f5.e(java.lang.Object):java.lang.Object");
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.f5) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
