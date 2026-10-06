package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class qf0 extends a.uu0 implements a.qo0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ java.lang.Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qf0(int i, java.lang.Object obj) {
        super(0);
        this.d = i;
        this.e = obj;
    }

    public final java.util.Iterator a() {
        int i = this.d;
        java.lang.Object obj = this.e;
        switch (i) {
            case 1:
                java.lang.Object[] objArr = (java.lang.Object[]) obj;
                a.wv.w(objArr, "array");
                return new a.tq1(objArr);
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                boolean[] zArr = (boolean[]) obj;
                a.wv.w(zArr, "array");
                return new a.gp(zArr);
            default:
                return ((java.lang.Iterable) obj).iterator();
        }
    }

    @Override // a.qo0
    public final java.lang.Object b() {
        switch (this.d) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                return java.lang.Boolean.valueOf(((android.view.View) this.e).performHapticFeedback(4));
            case 1:
                return a();
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                return a();
            default:
                return a();
        }
    }
}
