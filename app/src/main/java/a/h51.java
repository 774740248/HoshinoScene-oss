package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class h51 extends a.uu0 implements a.qo0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ a.k51 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h51(a.k51 k51Var, int i) {
        super(0);
        this.d = i;
        this.e = k51Var;
    }

    public final android.widget.TextView a() {
        int i = this.d;
        a.k51 k51Var = this.e;
        switch (i) {
            case 1:
                return (android.widget.TextView) k51Var.findViewById(2131362166);
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                return (android.widget.TextView) k51Var.findViewById(2131362167);
            default:
                return (android.widget.TextView) k51Var.findViewById(2131362186);
        }
    }

    @Override // a.qo0
    public final java.lang.Object b() {
        int i = this.d;
        a.k51 k51Var = this.e;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                return (com.omarea.ui.fps.PerfStallDimensionChart) k51Var.findViewById(2131362154);
            case 1:
                return a();
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                return a();
            case 3:
                return k51Var.findViewById(2131362171);
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                return a();
            default:
                return new a.r51(k51Var.getContext());
        }
    }
}
