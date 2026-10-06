package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class y40 extends a.uu0 implements a.qo0 {
    public final /* synthetic */ android.os.Handler d;
    public final /* synthetic */ a.la1 e;
    public final /* synthetic */ a.nk f;
    public final /* synthetic */ a.ka1 g;
    public final /* synthetic */ a.ha1 h;
    public final /* synthetic */ android.widget.TextView i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y40(android.os.Handler handler, a.la1 la1Var, a.nk nkVar, a.ka1 ka1Var, a.ha1 ha1Var, android.widget.TextView textView) {
        super(0);
        this.d = handler;
        this.e = la1Var;
        this.f = nkVar;
        this.g = ka1Var;
        this.h = ha1Var;
        this.i = textView;
    }

    @Override // a.qo0
    public final java.lang.Object b() {
        this.d.post(new a.q1(this.e, this.f, this.g, this.h, this.i, 2));
        return a.no1.f387a;
    }
}
