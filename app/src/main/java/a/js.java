package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class js extends a.uu0 implements a.qo0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ a.gb0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ js(a.gb0 gb0Var, int i) {
        super(0);
        this.d = i;
        this.e = gb0Var;
    }

    public final java.lang.Boolean a() {
        int i = this.d;
        a.gb0 gb0Var = this.e;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                ((a.ls) gb0Var.c).getClass();
                return java.lang.Boolean.valueOf(a.gy.F());
            default:
                ((a.ls) gb0Var.c).getClass();
                return java.lang.Boolean.valueOf(a.gy.G());
        }
    }

    @Override // a.qo0
    public final /* bridge */ /* synthetic */ java.lang.Object b() {
        switch (this.d) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                return a();
            default:
                return a();
        }
    }
}
