package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class uy extends a.uu0 implements a.fp0 {
    public static final a.uy e = new a.uy(0);
    public static final a.uy f = new a.uy(1);
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uy(int i) {
        super(2);
        this.d = i;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.d) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                return ((a.ty) obj).c((a.ry) obj2);
            default:
                return java.lang.Boolean.valueOf(((java.lang.Boolean) obj).booleanValue());
        }
    }
}
