package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class vu extends a.b20 {
    public final /* synthetic */ int E;
    public final /* synthetic */ java.lang.Object F;

    public /* synthetic */ vu(int i, java.lang.Object obj) {
        this.E = i;
        this.F = obj;
    }

    @Override // a.b20
    public final void K0(int i) {
        switch (this.E) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                return;
            default:
                a.yk1 yk1Var = (a.yk1) this.F;
                yk1Var.d = true;
                a.xk1 xk1Var = (a.xk1) yk1Var.e.get();
                if (xk1Var != null) {
                    xk1Var.a();
                    return;
                }
                return;
        }
    }

    @Override // a.b20
    public final void M0(android.graphics.Typeface typeface, boolean z) {
        int i = this.E;
        java.lang.Object obj = this.F;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                com.google.android.material.chip.Chip chip = (com.google.android.material.chip.Chip) obj;
                a.zu zuVar = chip.insetBackgroundDrawable;
                chip.setText(zuVar.F0 ? zuVar.G : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                return;
            default:
                if (z) {
                    return;
                }
                a.yk1 yk1Var = (a.yk1) obj;
                yk1Var.d = true;
                a.xk1 xk1Var = (a.xk1) yk1Var.e.get();
                if (xk1Var != null) {
                    xk1Var.a();
                    return;
                }
                return;
        }
    }
    public boolean q(a.q p0, a.p p1, a.p p2) {
        throw new UnsupportedOperationException("Method not decompiled: vu.q");
    }
    public boolean p(a.q p0, java.lang.Object p1, java.lang.Object p2) {
        throw new UnsupportedOperationException("Method not decompiled: vu.p");
    }
    public boolean o(a.q p0, a.m p1) {
        throw new UnsupportedOperationException("Method not decompiled: vu.o");
    }
    public void U0(a.p p0, java.lang.Thread p1) {
        throw new UnsupportedOperationException("Method not decompiled: vu.U0");
    }
    public void U(float p0, float p1, a.gh1 p2) {
        throw new UnsupportedOperationException("Method not decompiled: vu.U");
    }
    public void T0(a.p p0, a.p p1) {
        throw new UnsupportedOperationException("Method not decompiled: vu.T0");
    }
    public void N0(a.ej1 p0) {
        throw new UnsupportedOperationException("Method not decompiled: vu.N0");
    }
    public void L0(android.graphics.Typeface p0) {
        throw new UnsupportedOperationException("Method not decompiled: vu.L0");
    }
    public void J0(java.lang.Throwable p0) {
        throw new UnsupportedOperationException("Method not decompiled: vu.J0");
    }
}
