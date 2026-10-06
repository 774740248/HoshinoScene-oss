package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ef extends a.lj1 implements a.fp0 {
    public final /* synthetic */ com.omarea.vtools.activities.ActivityStartSplash g;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityStartSplash h;
    public final /* synthetic */ java.lang.Runnable i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ef(com.omarea.vtools.activities.ActivityStartSplash activityStartSplash, com.omarea.vtools.activities.ActivityStartSplash activityStartSplash2, java.lang.Runnable runnable, a.ey eyVar) {
        super(2, eyVar);
        this.g = activityStartSplash;
        this.h = activityStartSplash2;
        this.i = runnable;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.ef(this.g, this.h, this.i, eyVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x025c, code lost:
    
        if (android.provider.Settings.System.canWrite(r2) == false) goto L107;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0138  */
    @Override // a.iq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 661
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ef.e(java.lang.Object):java.lang.Object");
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.ef efVar = (a.ef) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        efVar.e(no1Var);
        return no1Var;
    }
}
