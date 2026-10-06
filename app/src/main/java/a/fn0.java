package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class fn0 implements java.lang.Runnable {
    public final /* synthetic */ int c = 2;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;
    public final /* synthetic */ java.lang.Object f;

    public fn0(a.a30 a30Var, java.util.ArrayList arrayList, a.hi1 hi1Var) {
        this.f = a30Var;
        this.d = arrayList;
        this.e = hi1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        java.lang.Object obj = this.f;
        java.lang.Object obj2 = this.e;
        java.lang.Object obj3 = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                ((a.sl0) obj3).c((a.gk0) obj2, (a.ct) obj);
                return;
            case 1:
                ((a.sl0) obj3).c((a.gk0) obj2, (a.ct) obj);
                return;
            default:
                java.util.List list = (java.util.List) obj3;
                a.hi1 hi1Var = (a.hi1) obj2;
                if (list.contains(hi1Var)) {
                    list.remove(hi1Var);
                    ((a.a30) obj).getClass();
                    a.ii1.a(hi1Var.f206a, hi1Var.c.H);
                    return;
                }
                return;
        }
    }
}
