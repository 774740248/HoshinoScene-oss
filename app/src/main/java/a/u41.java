package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class u41 implements a.ij0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ a.v41 d;
    public final /* synthetic */ com.omarea.sysmbol.PerfOptionsRender e;
    public final /* synthetic */ a.tj1 f;

    public /* synthetic */ u41(a.v41 v41Var, com.omarea.sysmbol.PerfOptionsRender perfOptionsRender, a.tj1 tj1Var, int i) {
        this.c = i;
        this.d = v41Var;
        this.e = perfOptionsRender;
        this.f = tj1Var;
    }

    @Override // a.ij0
    public final java.lang.Object getValue() {
        int i = this.c;
        a.v41 v41Var = this.d;
        a.tj1 tj1Var = this.f;
        com.omarea.sysmbol.PerfOptionsRender perfOptionsRender = this.e;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                java.lang.String a2 = v41Var.a(com.omarea.sysmbol.PerfOptionsRender.a(perfOptionsRender, tj1Var));
                a.wv.s(a2);
                return java.lang.Integer.valueOf(java.lang.Integer.parseInt(a2));
            case 1:
                java.lang.String a3 = v41Var.a(com.omarea.sysmbol.PerfOptionsRender.a(perfOptionsRender, tj1Var));
                a.wv.s(a3);
                return java.lang.Double.valueOf(java.lang.Double.parseDouble(a3));
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                return java.lang.Boolean.valueOf(a.wv.e(v41Var.a(com.omarea.sysmbol.PerfOptionsRender.a(perfOptionsRender, tj1Var)), tj1Var.j));
            case 3:
                java.lang.String a4 = v41Var.a(com.omarea.sysmbol.PerfOptionsRender.a(perfOptionsRender, tj1Var));
                return a4 != null ? a.qv.w2(a.yi1.y2(a4, new java.lang.String[]{","})) : a.qb0.c;
            default:
                return v41Var.a(com.omarea.sysmbol.PerfOptionsRender.a(perfOptionsRender, tj1Var));
        }
    }

    @Override // a.ij0
    public final void setValue(java.lang.Object obj) {
        int i = this.c;
        com.omarea.sysmbol.PerfOptionsRender perfOptionsRender = this.e;
        a.v41 v41Var = this.d;
        a.tj1 tj1Var = this.f;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                int intValue = ((java.lang.Number) obj).intValue();
                java.lang.String str = tj1Var.c;
                java.lang.String b = v41Var.b(java.lang.String.valueOf(intValue));
                a.wv.s(b);
                com.omarea.sysmbol.PerfOptionsRender.b(perfOptionsRender, str, b);
                return;
            case 1:
                java.lang.String str2 = tj1Var.c;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append((java.lang.Double) obj);
                java.lang.String b2 = v41Var.b(sb.toString());
                a.wv.s(b2);
                com.omarea.sysmbol.PerfOptionsRender.b(perfOptionsRender, str2, b2);
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
                java.lang.String str3 = tj1Var.c;
                java.lang.String b3 = v41Var.b(booleanValue ? tj1Var.j : tj1Var.k);
                a.wv.s(b3);
                com.omarea.sysmbol.PerfOptionsRender.b(perfOptionsRender, str3, b3);
                return;
            case 3:
                java.util.List list = (java.util.List) obj;
                a.wv.w(list, "value");
                java.lang.String str4 = tj1Var.c;
                java.lang.String b4 = v41Var.b(a.qv.j2(list, ",", null, null, null, 62));
                a.wv.s(b4);
                com.omarea.sysmbol.PerfOptionsRender.b(perfOptionsRender, str4, b4);
                return;
            default:
                java.lang.String str5 = tj1Var.c;
                java.lang.String b5 = v41Var.b((java.lang.String) obj);
                a.wv.s(b5);
                com.omarea.sysmbol.PerfOptionsRender.b(perfOptionsRender, str5, b5);
                return;
        }
    }

    public u41(com.omarea.sysmbol.PerfOptionsRender perfOptionsRender, a.tj1 tj1Var, a.v41 v41Var) {
        this.c = 2;
        this.e = perfOptionsRender;
        this.f = tj1Var;
        this.d = v41Var;
    }
}
