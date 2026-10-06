package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ja0 extends a.uu0 implements a.qo0 {
    public static final a.ja0 e = new a.ja0(0);
    public static final a.ja0 f = new a.ja0(1);
    public static final a.ja0 g = new a.ja0(2);
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ja0(int i) {
        super(0);
        this.d = i;
    }

    public final java.lang.String a() {
        switch (this.d) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.cp cpVar = com.omarea.Scene.c;
                return a.ii1.e((java.lang.String) com.omarea.Scene.i.a(), "_current_double");
            case 1:
                a.cp cpVar2 = com.omarea.Scene.c;
                return a.ii1.e((java.lang.String) com.omarea.Scene.i.a(), "_current_convert");
            default:
                a.cp cpVar3 = com.omarea.Scene.c;
                return a.ii1.e((java.lang.String) com.omarea.Scene.i.a(), "_current_convert_l");
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
