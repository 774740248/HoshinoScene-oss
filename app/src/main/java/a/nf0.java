package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class nf0 extends a.uu0 implements a.qo0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ a.ag0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nf0(a.ag0 ag0Var, int i) {
        super(0);
        this.d = i;
        this.e = ag0Var;
    }

    @Override // a.qo0
    public final java.lang.Object b() {
        int i = this.d;
        a.ag0 ag0Var = this.e;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                ag0Var.s.getClass();
                return a.ls.d();
            default:
                ag0Var.s.getClass();
                return java.lang.Integer.valueOf(a.ls.f());
        }
    }
}
