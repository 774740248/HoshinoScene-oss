package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class cd0 extends a.mn1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f68a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ cd0(java.lang.Object obj, int i, java.lang.Object obj2) {
        this.f68a = i;
        this.c = obj;
        this.b = obj2;
    }

    @Override // a.kn1
    public final void d(a.ln1 ln1Var) {
        int i = this.f68a;
        java.lang.Object obj = this.b;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.ds1 ds1Var = a.yr1.f718a;
                ds1Var.b0((android.view.View) obj, 1.0f);
                ds1Var.getClass();
                ln1Var.v(this);
                return;
            case 1:
                ((java.util.ArrayList) ((a.kp) obj).getOrDefault(((a.nn1) this.c).d, null)).remove(ln1Var);
                ln1Var.v(this);
                return;
            default:
                ((a.ln1) obj).y();
                ln1Var.v(this);
                return;
        }
    }
}
