package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class cu extends a.uu0 implements a.qo0 {
    public static final a.cu e = new a.cu(0);
    public static final a.cu f = new a.cu(1);
    public static final a.cu g = new a.cu(2);
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cu(int i) {
        super(0);
        this.d = i;
    }

    public final java.lang.Integer a() {
        switch (this.d) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.cp cpVar = com.omarea.Scene.c;
                return java.lang.Integer.valueOf(a.fs1.t().getColor(2131099701));
            case 1:
                a.cp cpVar2 = com.omarea.Scene.c;
                return java.lang.Integer.valueOf(a.fs1.t().getColor(2131099702));
            default:
                a.cp cpVar3 = com.omarea.Scene.c;
                return java.lang.Integer.valueOf(a.fs1.t().getColor(2131099703));
        }
    }

    @Override // a.qo0
    public final /* bridge */ /* synthetic */ java.lang.Object b() {
        switch (this.d) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                return a();
            case 1:
                return a();
            default:
                return a();
        }
    }
}
