package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class f71 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ com.omarea.ui.procs.ProcessGroupView g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f71(com.omarea.ui.procs.ProcessGroupView processGroupView, a.ey eyVar) {
        super(2, eyVar);
        this.g = processGroupView;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.f71(this.g, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        com.omarea.ui.procs.ProcessGroupView processGroupView = this.g;
        if (!processGroupView.h.isEmpty()) {
            processGroupView.f();
            processGroupView.g();
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.f71 f71Var = (a.f71) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        f71Var.e(no1Var);
        return no1Var;
    }
}
