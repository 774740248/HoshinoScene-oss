package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class wl1 extends a.uu0 implements a.fp0 {
    public static final a.wl1 e = new a.wl1(0);
    public static final a.wl1 f = new a.wl1(1);
    public static final a.wl1 g = new a.wl1(2);
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wl1(int i) {
        super(2);
        this.d = i;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.d) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                return obj;
            case 1:
                a.ai1.t(obj);
                return null;
            default:
                return (a.zl1) obj;
        }
    }
}
