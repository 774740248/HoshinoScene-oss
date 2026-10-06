package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class jo extends a.uu0 implements a.qo0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ a.mo e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jo(a.mo moVar, int i) {
        super(0);
        this.d = i;
        this.e = moVar;
    }

    public final android.graphics.drawable.Drawable a() {
        switch (this.d) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                android.content.Context context = this.e.E;
                java.lang.Object obj = a.zx.f748a;
                return a.xx.b(context, 2131231235);
            case 1:
                return a.b20.Y(this.e.E, 2131231060);
            default:
                return a.b20.Y(this.e.E, 2131231026);
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
