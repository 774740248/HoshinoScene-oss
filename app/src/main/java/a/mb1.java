package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class mb1 extends a.uu0 implements a.qo0 {
    public static final a.mb1 e = new a.mb1(0);
    public static final a.mb1 f = new a.mb1(1);
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mb1(int i) {
        super(0);
        this.d = i;
    }

    @Override // a.qo0
    public final java.lang.Object b() {
        switch (this.d) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                return new a.nb1();
            default:
                java.lang.String str = a.pe0.f434a;
                a.cp cpVar = com.omarea.Scene.c;
                return a.pe0.d(a.fs1.t(), "translate.xml");
        }
    }
}
