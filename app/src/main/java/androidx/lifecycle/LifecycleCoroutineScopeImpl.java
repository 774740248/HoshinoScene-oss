package androidx.lifecycle;
import a.cz;
import a.ev0;
import a.fv0;
import a.gv0;
import a.kv0;
import a.mv0;
import a.ty;
import a.wv;


/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class LifecycleCoroutineScopeImpl implements kv0, cz {
    public final gv0 c;
    public final ty d;

    public LifecycleCoroutineScopeImpl(gv0 gv0Var, ty tyVar) {
        wv.w(tyVar, "coroutineContext");
        this.c = gv0Var;
        this.d = tyVar;
        if (((androidx.lifecycle.a) gv0Var).d == fv0.c) {
            wv.o(tyVar, null);
        }
    }

    @Override // cz
    public final ty b() {
        return this.d;
    }

    @Override // kv0
    public final void c(mv0 mv0Var, ev0 ev0Var) {
        gv0 gv0Var = this.c;
        if (((androidx.lifecycle.a) gv0Var).d.compareTo(fv0.c) <= 0) {
            gv0Var.b(this);
            wv.o(this.d, null);
        }
    }
}
