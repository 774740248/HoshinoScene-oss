package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class gr extends a.uu0 implements a.qo0 {
    public static final a.gr e = new a.gr(0);
    public static final a.gr f = new a.gr(1);
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gr(int i) {
        super(0);
        this.d = i;
    }

    @Override // a.qo0
    public final java.lang.Object b() {
        int i = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                switch (i) {
                    case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                        return java.lang.Integer.valueOf(a.oq0.c() / 8);
                    default:
                        return java.lang.Integer.valueOf(a.oq0.c() / 4);
                }
            default:
                switch (i) {
                    case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                        return java.lang.Integer.valueOf(a.oq0.c() / 8);
                    default:
                        return java.lang.Integer.valueOf(a.oq0.c() / 4);
                }
        }
    }
}
