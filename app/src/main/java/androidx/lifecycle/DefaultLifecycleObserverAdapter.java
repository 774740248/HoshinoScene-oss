package androidx.lifecycle;
import a.ev0;
import a.kv0;
import a.mv0;
import a.s20;
import a.t20;
import a.wv;


/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class DefaultLifecycleObserverAdapter implements kv0 {
    public final s20 c;
    public final kv0 d;

    public DefaultLifecycleObserverAdapter(s20 s20Var, kv0 kv0Var) {
        wv.w(s20Var, "defaultLifecycleObserver");
        this.c = s20Var;
        this.d = kv0Var;
    }

    @Override // kv0
    public final void c(mv0 mv0Var, ev0 ev0Var) {
        int i = t20.f546a[ev0Var.ordinal()];
        s20 s20Var = this.c;
        switch (i) {
            case 1:
                s20Var.getClass();
                break;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                s20Var.getClass();
                break;
            case 3:
                s20Var.a();
                break;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                s20Var.getClass();
                break;
            case 5:
                s20Var.getClass();
                break;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                s20Var.getClass();
                break;
            case 7:
                throw new java.lang.IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        kv0 kv0Var = this.d;
        if (kv0Var != null) {
            kv0Var.c(mv0Var, ev0Var);
        }
    }
}
