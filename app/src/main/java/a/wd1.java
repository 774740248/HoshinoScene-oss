package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class wd1 extends a.uu0 implements a.qo0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ a.xd1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wd1(a.xd1 xd1Var, int i) {
        super(0);
        this.d = i;
        this.e = xd1Var;
    }

    public final java.lang.Integer a() {
        int i = this.d;
        a.xd1 xd1Var = this.e;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                return java.lang.Integer.valueOf(xd1Var.getResources().getColor(2131099704));
            case 1:
                return java.lang.Integer.valueOf(xd1Var.getResources().getColor(2131099705));
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                return java.lang.Integer.valueOf(xd1Var.getResources().getColor(2131099706));
            case 3:
                return java.lang.Integer.valueOf(xd1Var.getResources().getColor(2131099714));
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                return java.lang.Integer.valueOf(xd1Var.getResources().getColor(2131099715));
            case 5:
                return java.lang.Integer.valueOf(xd1Var.getResources().getColor(2131099716));
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                return java.lang.Integer.valueOf(xd1Var.getResources().getColor(2131099717));
            case 7:
                return java.lang.Integer.valueOf(xd1Var.getResources().getColor(2131099718));
            default:
                return java.lang.Integer.valueOf(xd1Var.getResources().getColor(2131099719));
        }
    }

    @Override // a.qo0
    public final /* bridge */ /* synthetic */ java.lang.Object b() {
        switch (this.d) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                return a();
            case 1:
                return a();
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                return a();
            case 3:
                return a();
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                return a();
            case 5:
                return a();
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                return a();
            case 7:
                return a();
            default:
                return a();
        }
    }
}
