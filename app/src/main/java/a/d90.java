package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class d90 extends a.ws {
    public final /* synthetic */ int c;
    public final java.lang.Object d;

    public d90(int i, java.lang.Object obj) {
        this.c = i;
        this.d = obj;
    }

    @Override // a.ws
    public final void a(java.lang.Throwable th) {
        int i = this.c;
        java.lang.Object obj = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                ((a.c90) obj).c();
                return;
            default:
                ((a.bp0) obj).i(th);
                return;
        }
    }

    @Override // a.bp0
    public final /* bridge */ /* synthetic */ java.lang.Object i(java.lang.Object obj) {
        a.no1 no1Var = a.no1.f387a;
        switch (this.c) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a((java.lang.Throwable) obj);
                return no1Var;
            default:
                a((java.lang.Throwable) obj);
                return no1Var;
        }
    }

    public final java.lang.String toString() {
        int i = this.c;
        java.lang.Object obj = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                return "DisposeOnCancel[" + ((a.c90) obj) + ']';
            default:
                return "InvokeOnCancel[" + ((a.bp0) obj).getClass().getSimpleName() + '@' + a.b20.b0(this) + ']';
        }
    }
}
