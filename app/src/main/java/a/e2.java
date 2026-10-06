package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class e2 extends a.h01 {
    public final /* synthetic */ int m = 1;
    public final /* synthetic */ a.j2 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(a.j2 j2Var, android.content.Context context, a.pz0 pz0Var, a.i2 i2Var) {
        super(2130968608, 0, context, i2Var, pz0Var, true);
        this.n = j2Var;
        this.g = 8388613;
        a.vu0 vu0Var = j2Var.y;
        this.i = vu0Var;
        a.e01 e01Var = this.j;
        if (e01Var != null) {
            e01Var.e(vu0Var);
        }
    }

    @Override // a.h01
    public final void c() {
        int i = this.m;
        a.j2 j2Var = this.n;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                j2Var.v = null;
                super.c();
                return;
            default:
                a.pz0 pz0Var = j2Var.e;
                if (pz0Var != null) {
                    pz0Var.c(true);
                }
                j2Var.u = null;
                super.c();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(a.j2 j2Var, android.content.Context context, a.zi1 zi1Var, android.view.View view) {
        super(2130968608, 0, context, view, zi1Var, false);
        this.n = j2Var;
        if (!zi1Var.A.f()) {
            android.view.View view2 = j2Var.k;
            this.f = view2 == null ? (android.view.View) j2Var.j : view2;
        }
        a.vu0 vu0Var = j2Var.y;
        this.i = vu0Var;
        a.e01 e01Var = this.j;
        if (e01Var != null) {
            e01Var.e(vu0Var);
        }
    }
}
