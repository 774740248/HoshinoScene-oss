package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ta1 extends a.uu0 implements a.bp0 {
    public static final a.ta1 e = new a.ta1(0);
    public static final a.ta1 f = new a.ta1(1);
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ta1(int i) {
        super(1);
        this.d = i;
    }

    @Override // a.bp0
    public final java.lang.Object i(java.lang.Object obj) {
        switch (this.d) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.zt0 zt0Var = (a.zt0) obj;
                a.wv.w(zt0Var, "$this$null");
                zt0Var.m("display_modes", "path");
                zt0Var.m("text", "type");
                zt0Var.m("-1 -1 -1", "default");
                zt0Var.m("High - Middle - Low", "hint");
                return a.no1.f387a;
            default:
                java.lang.String str = (java.lang.String) obj;
                a.wv.w(str, "it");
                return "'" + str + "'";
        }
    }
}
