package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class lz extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ com.omarea.ui.fps.CpuFrequencyStat h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lz(com.omarea.ui.fps.CpuFrequencyStat cpuFrequencyStat, a.ey eyVar) {
        super(2, eyVar);
        this.h = cpuFrequencyStat;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.lz(this.h, eyVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0317, code lost:
    
        if ((r12 - r28) > 100) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:75:0x037a A[LOOP:5: B:68:0x02f7->B:75:0x037a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0395 A[EDGE_INSN: B:76:0x0395->B:77:0x0395 BREAK  A[LOOP:5: B:68:0x02f7->B:75:0x037a], SYNTHETIC] */
    @Override // a.iq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.Object r48) {
        /*
            Method dump skipped, instructions count: 1261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.lz.e(java.lang.Object):java.lang.Object");
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.lz) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
