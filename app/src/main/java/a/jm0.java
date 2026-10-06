package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class jm0 implements java.lang.Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ a.bn0 d;

    public /* synthetic */ jm0(a.bn0 bn0Var, int i) {
        this.c = i;
        this.d = bn0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        a.bn0 bn0Var = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.gu0[] gu0VarArr = a.bn0.x0;
                a.wv.w(bn0Var, "this$0");
                bn0Var.d0();
                return;
            case 1:
                a.gu0[] gu0VarArr2 = a.bn0.x0;
                a.wv.w(bn0Var, "this$0");
                bn0Var.R(new android.content.Intent(bn0Var.f(), (java.lang.Class<?>) com.omarea.vtools.activities.ActivityAppConfig2.class));
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                a.gu0[] gu0VarArr3 = a.bn0.x0;
                a.wv.w(bn0Var, "this$0");
                bn0Var.c0("https://github.com/yinwanxi/Uperf-Game-Turbo/releases");
                return;
            case 3:
                a.gu0[] gu0VarArr4 = a.bn0.x0;
                a.wv.w(bn0Var, "this$0");
                bn0Var.c0("https://github.com/shadow3aaa/fas-rs/releases/");
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                a.gu0[] gu0VarArr5 = a.bn0.x0;
                a.wv.w(bn0Var, "this$0");
                bn0Var.c0("https://github.com/yc9559/uperf");
                return;
            default:
                java.lang.String m = bn0Var.m(2131952130);
                a.wv.v(m, "getString(R.string.cmd_power_reboot)");
                a.q10 q10Var = a.q10.f457a;
                a.ty tyVar = a.z80.b;
                a.k00 k00Var = new a.k00(m, null);
                int i2 = 2 & 1;
                a.ty tyVar2 = a.ob0.c;
                if (i2 != 0) {
                    tyVar = tyVar2;
                }
                int i3 = (2 & 2) != 0 ? 1 : 0;
                a.ty W = a.wv.W(tyVar2, tyVar, true);
                a.u20 u20Var = a.z80.f728a;
                if (W != u20Var && W.g(a.gy.c) == null) {
                    W = W.c(u20Var);
                }
                a.f av0Var = i3 == 2 ? new a.av0(W, k00Var) : new a.f(W, true);
                av0Var.S(i3, av0Var, k00Var);
                return;
        }
    }
}
