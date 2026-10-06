package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class is extends a.uu0 implements a.bp0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ com.omarea.model.CpuStatus e;
    public final /* synthetic */ a.ka1 f;
    public final /* synthetic */ a.ka1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ is(com.omarea.model.CpuStatus cpuStatus, a.ka1 ka1Var, a.ka1 ka1Var2, int i) {
        super(1);
        this.d = i;
        this.e = cpuStatus;
        this.f = ka1Var;
        this.g = ka1Var2;
    }

    public final void a(a.zt0 zt0Var) {
        int i = this.d;
        a.ka1 ka1Var = this.f;
        a.ka1 ka1Var2 = this.g;
        com.omarea.model.CpuStatus cpuStatus = this.e;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.wv.w(zt0Var, "$this$null");
                zt0Var.m("whitelist", "use");
                zt0Var.m(cpuStatus.clusters.get(ka1Var.c).min_freq, "big_min_freq");
                zt0Var.m(cpuStatus.clusters.get(ka1Var.c).min_freq, "middle_min_freq");
                zt0Var.v("freq", new java.lang.String[]{cpuStatus.clusters.get(ka1Var.c).max_freq, cpuStatus.clusters.get(ka1Var2.c).max_freq});
                return;
            case 1:
                a.wv.w(zt0Var, "$this$$receiver");
                zt0Var.v("mode", new java.lang.String[]{"powersave"});
                if (cpuStatus != null) {
                    zt0Var.s("fas", new a.is(cpuStatus, ka1Var, ka1Var2, 0));
                    return;
                }
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                a.wv.w(zt0Var, "$this$null");
                zt0Var.m("whitelist", "use");
                zt0Var.m(cpuStatus.clusters.get(ka1Var.c).min_freq, "big_min_freq");
                zt0Var.m(cpuStatus.clusters.get(ka1Var.c).min_freq, "middle_min_freq");
                zt0Var.v("freq", new java.lang.String[]{cpuStatus.clusters.get(ka1Var.c).max_freq, cpuStatus.clusters.get(ka1Var2.c).max_freq});
                return;
            case 3:
                a.wv.w(zt0Var, "$this$$receiver");
                zt0Var.v("mode", new java.lang.String[]{"balance"});
                if (cpuStatus != null) {
                    zt0Var.s("fas", new a.is(cpuStatus, ka1Var, ka1Var2, 2));
                    return;
                }
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                a.wv.w(zt0Var, "$this$null");
                zt0Var.m("whitelist", "use");
                zt0Var.m(cpuStatus.clusters.get(ka1Var.c).min_freq, "big_min_freq");
                zt0Var.m(cpuStatus.clusters.get(ka1Var.c).min_freq, "middle_min_freq");
                zt0Var.v("freq", new java.lang.String[]{cpuStatus.clusters.get(ka1Var.c).max_freq, cpuStatus.clusters.get(ka1Var2.c).max_freq});
                return;
            case 5:
                a.wv.w(zt0Var, "$this$$receiver");
                zt0Var.v("mode", new java.lang.String[]{"performance"});
                if (cpuStatus != null) {
                    zt0Var.s("fas", new a.is(cpuStatus, ka1Var, ka1Var2, 4));
                    return;
                }
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                a.wv.w(zt0Var, "$this$null");
                zt0Var.m("whitelist", "use");
                zt0Var.m(cpuStatus.clusters.get(ka1Var.c).min_freq, "big_min_freq");
                zt0Var.m(cpuStatus.clusters.get(ka1Var.c).min_freq, "middle_min_freq");
                zt0Var.v("freq", new java.lang.String[]{cpuStatus.clusters.get(ka1Var.c).max_freq, cpuStatus.clusters.get(ka1Var2.c).max_freq});
                return;
            default:
                a.wv.w(zt0Var, "$this$$receiver");
                zt0Var.v("mode", new java.lang.String[]{"*"});
                if (cpuStatus != null) {
                    zt0Var.s("fas", new a.is(cpuStatus, ka1Var, ka1Var2, 6));
                    return;
                }
                return;
        }
    }

    @Override // a.bp0
    public final /* bridge */ /* synthetic */ java.lang.Object i(java.lang.Object obj) {
        a.no1 no1Var = a.no1.f387a;
        switch (this.d) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a((a.zt0) obj);
                return no1Var;
            case 1:
                a((a.zt0) obj);
                return no1Var;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                a((a.zt0) obj);
                return no1Var;
            case 3:
                a((a.zt0) obj);
                return no1Var;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                a((a.zt0) obj);
                return no1Var;
            case 5:
                a((a.zt0) obj);
                return no1Var;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                a((a.zt0) obj);
                return no1Var;
            default:
                a((a.zt0) obj);
                return no1Var;
        }
    }
}
