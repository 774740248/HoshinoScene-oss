package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class hq0 implements a.qg1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f213a;
    public final a.bp0 b;
    public final java.lang.Object c;

    public hq0(a.qg1 qg1Var, a.b10 b10Var) {
        this.f213a = 1;
        this.c = qg1Var;
        this.b = b10Var;
    }

    @Override // a.qg1
    public final java.util.Iterator iterator() {
        switch (this.f213a) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                return new a.gq0(this);
            default:
                return new a.hn1(this);
        }
    }

    public hq0(a.ya1 ya1Var) {
        a.za1 za1Var = a.za1.k;
        this.f213a = 0;
        this.c = ya1Var;
        this.b = za1Var;
    }
}
