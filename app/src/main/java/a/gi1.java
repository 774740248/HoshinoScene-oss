package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class gi1 implements java.lang.Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ a.hi1 d;
    public final /* synthetic */ a.ji1 e;

    public /* synthetic */ gi1(a.ji1 ji1Var, a.hi1 hi1Var, int i) {
        this.c = i;
        this.e = ji1Var;
        this.d = hi1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        a.hi1 hi1Var = this.d;
        a.ji1 ji1Var = this.e;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                if (ji1Var.b.contains(hi1Var)) {
                    a.ii1.a(hi1Var.f206a, hi1Var.c.H);
                    return;
                }
                return;
            default:
                ji1Var.b.remove(hi1Var);
                ji1Var.c.remove(hi1Var);
                return;
        }
    }
}
