package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class vy extends a.uu0 implements a.bp0 {
    public static final a.vy e = new a.vy(0);
    public static final a.vy f = new a.vy(1);
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vy(int i) {
        super(1);
        this.d = i;
    }

    @Override // a.bp0
    public final java.lang.Object i(java.lang.Object obj) {
        switch (this.d) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.ry ryVar = (a.ry) obj;
                if (ryVar instanceof a.xy) {
                    return (a.xy) ryVar;
                }
                return null;
            default:
                a.ry ryVar2 = (a.ry) obj;
                if (ryVar2 instanceof a.lc0) {
                    return (a.lc0) ryVar2;
                }
                return null;
        }
    }
}
