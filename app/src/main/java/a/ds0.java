package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ds0 implements java.lang.Iterable, a.du0 {
    public final /* synthetic */ int c = 1;
    public final java.lang.Object d;

    public ds0(a.h30 h30Var) {
        this.d = h30Var;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        int i = this.c;
        java.lang.Object obj = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                return new a.tq1((java.util.Iterator) ((a.qo0) obj).b());
            default:
                return ((a.qg1) obj).iterator();
        }
    }

    public ds0(a.qf0 qf0Var) {
        this.d = qf0Var;
    }
}
