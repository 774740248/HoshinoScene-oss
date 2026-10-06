package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class uk0 extends a.uu0 implements a.qo0 {
    public static final a.uk0 e = new a.uk0(0);
    public static final a.uk0 f = new a.uk0(1);
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uk0(int i) {
        super(0);
        this.d = i;
    }

    public final java.lang.Boolean a() {
        switch (this.d) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.q10 q10Var = a.q10.f457a;
                return java.lang.Boolean.valueOf(!a.wv.e(a.q10.t(), "basic"));
            default:
                a.cp cpVar = com.omarea.Scene.c;
                return java.lang.Boolean.valueOf(a.fs1.D().getBoolean("kernel_mem", true));
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
