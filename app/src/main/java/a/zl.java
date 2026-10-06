package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class zl implements a.z21, a.re0, a.mx, a.g1, a.n01 {
    public final /* synthetic */ int c;
    public final /* synthetic */ a.km d;

    public /* synthetic */ zl(a.km kmVar, int i) {
        this.c = i;
        this.d = kmVar;
    }

    @Override // a.n01
    public final void a(a.pz0 pz0Var, boolean z) {
        a.jm jmVar;
        int i = this.c;
        a.km kmVar = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                kmVar.u(pz0Var);
                return;
            default:
                a.pz0 k = pz0Var.k();
                int i2 = 0;
                boolean z2 = k != pz0Var;
                if (z2) {
                    pz0Var = k;
                }
                a.jm[] jmVarArr = kmVar.N;
                int length = jmVarArr != null ? jmVarArr.length : 0;
                while (true) {
                    if (i2 >= length) {
                        jmVar = null;
                    } else {
                        jmVar = jmVarArr[i2];
                        if (jmVar == null || jmVar.h != pz0Var) {
                            i2++;
                        }
                    }
                }
                if (jmVar != null) {
                    if (!z2) {
                        kmVar.v(jmVar, z);
                        return;
                    } else {
                        kmVar.t(jmVar.f259a, jmVar, k);
                        kmVar.v(jmVar, true);
                        return;
                    }
                }
                return;
        }
    }

    @Override // a.n01
    public final boolean o(a.pz0 pz0Var) {
        android.view.Window.Callback callback;
        int i = this.c;
        a.km kmVar = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                android.view.Window.Callback callback2 = kmVar.n.getCallback();
                if (callback2 != null) {
                    callback2.onMenuOpened(108, pz0Var);
                }
                return true;
            default:
                if (pz0Var == pz0Var.k() && kmVar.H && (callback = kmVar.n.getCallback()) != null && !kmVar.S) {
                    callback.onMenuOpened(108, pz0Var);
                }
                return true;
        }
    }

    @Override // a.z21
    public final a.du1 u(android.view.View view, a.du1 du1Var) {
        int d = du1Var.d();
        int M = this.d.M(du1Var, null);
        if (d != M) {
            du1Var = du1Var.f(du1Var.b(), M, du1Var.c(), du1Var.a());
        }
        return a.jq1.j(view, du1Var);
    }
}
