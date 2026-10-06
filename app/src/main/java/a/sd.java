package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class sd extends a.lj1 implements a.fp0 {
    public final /* synthetic */ com.omarea.vtools.activities.ActivityPowerStat g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sd(com.omarea.vtools.activities.ActivityPowerStat activityPowerStat, a.ey eyVar) {
        super(2, eyVar);
        this.g = activityPowerStat;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.sd(this.g, eyVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        if (a.mr.a() != false) goto L10;
     */
    @Override // a.iq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.Object r6) {
        /*
            r5 = this;
            a.b20.q1(r6)
            a.q10 r6 = a.q10.f457a
            java.lang.String r6 = a.q10.t()
            java.lang.String r0 = "root"
            boolean r6 = a.wv.e(r6, r0)
            if (r6 == 0) goto L51
            com.omarea.vtools.activities.ActivityPowerStat r6 = r5.g
            a.mr r0 = r6.B
            boolean r0 = r0.f()
            if (r0 != 0) goto L2e
            a.mr r0 = r6.B
            boolean r0 = r0.e()
            if (r0 != 0) goto L2e
            a.mr r0 = r6.B
            r0.getClass()
            boolean r0 = a.mr.a()
            if (r0 == 0) goto L51
        L2e:
            a.gu0[] r0 = com.omarea.vtools.activities.ActivityPowerStat.D
            r1 = 7
            r2 = r0[r1]
            a.yq1 r3 = r6.k
            android.view.View r2 = r3.a(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r4 = 0
            r2.setVisibility(r4)
            r0 = r0[r1]
            android.view.View r0 = r3.a(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            a.qd r1 = new a.qd
            r2 = 10
            r1.<init>(r6, r2)
            r0.setOnClickListener(r1)
        L51:
            a.no1 r6 = a.no1.f387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.sd.e(java.lang.Object):java.lang.Object");
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.sd sdVar = (a.sd) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        sdVar.e(no1Var);
        return no1Var;
    }
}
