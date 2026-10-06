package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class qc extends a.jq {
    public final /* synthetic */ int e = 2;
    public final /* synthetic */ java.lang.Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qc(com.omarea.vtools.activities.ActivityPerfBench activityPerfBench, android.app.Application application) {
        super(application, "CoreCount");
        this.f = activityPerfBench;
    }

    @Override // a.jq
    public final java.lang.String o() {
        java.lang.Object obj = this.f;
        switch (this.e) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                ((com.omarea.vtools.activities.ActivityPerfBench) obj).v.getClass();
                int f = a.ls.f();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(f);
                return sb.toString();
            case 1:
                ((com.omarea.vtools.activities.ActivityPowerBench) obj).F.getClass();
                int f2 = a.ls.f();
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(f2);
                return sb2.toString();
            default:
                ((a.pl0) obj).I0.getClass();
                int f3 = a.ls.f();
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                sb3.append(f3);
                return sb3.toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qc(com.omarea.vtools.activities.ActivityPowerBench activityPowerBench, android.app.Application application) {
        super(application, "CoreCount");
        this.f = activityPowerBench;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qc(a.pl0 pl0Var, android.app.Application application) {
        super(application, "CoreCount");
        this.f = pl0Var;
    }
    public java.lang.Object k(int p0, java.lang.Object p1) {
        throw new UnsupportedOperationException("Method not decompiled: qc.k");
    }
    public void j(int p0) {
        throw new UnsupportedOperationException("Method not decompiled: qc.j");
    }
    public void i(java.lang.Object p0, java.lang.Object p1) {
        throw new UnsupportedOperationException("Method not decompiled: qc.i");
    }
    public int h(java.lang.Object p0) {
        throw new UnsupportedOperationException("Method not decompiled: qc.h");
    }
    public int g(java.lang.Object p0) {
        throw new UnsupportedOperationException("Method not decompiled: qc.g");
    }
    public int f() {
        throw new UnsupportedOperationException("Method not decompiled: qc.f");
    }
    public a.kp e() {
        throw new UnsupportedOperationException("Method not decompiled: qc.e");
    }
    public java.lang.Object d(int p0, int p1) {
        throw new UnsupportedOperationException("Method not decompiled: qc.d");
    }
    public void c() {
        throw new UnsupportedOperationException("Method not decompiled: qc.c");
    }
}
