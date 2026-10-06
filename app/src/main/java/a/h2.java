package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class h2 extends a.xj0 {
    public final /* synthetic */ int l;
    public final /* synthetic */ java.lang.Object m;
    public final /* synthetic */ android.view.View n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h2(android.view.View view, android.view.View view2, java.lang.Object obj, int i) {
        super(view2);
        this.l = i;
        this.n = view;
        this.m = obj;
    }

    @Override // a.xj0
    public final a.nh1 b() {
        switch (this.l) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.e2 e2Var = ((a.i2) this.n).f.u;
                if (e2Var == null) {
                    return null;
                }
                return e2Var.a();
            default:
                return (a.hn) this.m;
        }
    }

    @Override // a.xj0
    public final boolean c() {
        int i = this.l;
        android.view.View view = this.n;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                ((a.i2) view).f.l();
                return true;
            default:
                a.kn knVar = (a.kn) view;
                if (!knVar.getInternalPopup().b()) {
                    knVar.h.e(a.cn.b(knVar), a.cn.a(knVar));
                }
                return true;
        }
    }

    @Override // a.xj0
    public final boolean d() {
        switch (this.l) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.j2 j2Var = ((a.i2) this.n).f;
                if (j2Var.w != null) {
                    return false;
                }
                j2Var.f();
                return true;
            default:
                super.d();
                return true;
        }
    }
}
