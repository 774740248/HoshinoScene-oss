package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class vk extends a.uu0 implements a.qo0 {
    public static final a.vk e = new a.vk(0);
    public static final a.vk f = new a.vk(1);
    public static final a.vk g = new a.vk(2);
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vk(int i) {
        super(0);
        this.d = i;
    }

    @Override // a.qo0
    public final java.lang.Object b() {
        java.lang.String str = null;
        switch (this.d) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.cp cpVar = com.omarea.Scene.c;
                return a.fs1.t().getPackageManager();
            case 1:
                a.q10 q10Var = a.q10.f457a;
                java.lang.String L = a.q10.L("fas-supported", "", 1000L);
                if (L.length() > 0 && !a.wv.e(L, "error")) {
                    str = L;
                }
                return str == null ? "" : str;
            default:
                a.q10 q10Var2 = a.q10.f457a;
                java.lang.String L2 = a.q10.L("fas-supported", "", 1000L);
                if (L2.length() > 0 && !a.wv.e(L2, "error")) {
                    str = L2;
                }
                return java.lang.Boolean.valueOf(a.wv.e(str != null ? str : "", "FASLite"));
        }
    }
}
