package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class no0 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ com.omarea.ui.fps.FrameTimeView2 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public no0(com.omarea.ui.fps.FrameTimeView2 frameTimeView2, a.ey eyVar) {
        super(2, eyVar);
        this.g = frameTimeView2;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.no0(this.g, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        this.g.invalidate();
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.no0 no0Var = (a.no0) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        no0Var.e(no1Var);
        return no1Var;
    }
}
