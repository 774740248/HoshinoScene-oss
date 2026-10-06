package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class jl0 extends a.uu0 implements a.qo0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ a.pl0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jl0(a.pl0 pl0Var, int i) {
        super(0);
        this.d = i;
        this.e = pl0Var;
    }

    @Override // a.qo0
    public final java.lang.Object b() {
        int i = this.d;
        a.pl0 pl0Var = this.e;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                pl0Var.I0.getClass();
                return a.ls.o("+");
            default:
                return new a.pj1(pl0Var.L());
        }
    }
}
