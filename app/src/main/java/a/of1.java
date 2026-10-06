package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class of1 implements a.wr0 {
    public final android.content.Context c;
    public final boolean[] d = {false, false, false, false, false, false, false};

    public of1(android.app.Application application) {
        this.c = application;
    }

    @Override // a.wr0
    public final boolean eventFilter(a.kc0 kc0Var) {
        return kc0Var == a.kc0.k || kc0Var == a.kc0.j || kc0Var == a.kc0.o;
    }

    @Override // a.wr0
    public final boolean isAsync() {
        return false;
    }

    @Override // a.wr0
    public final void onReceive(a.kc0 kc0Var, java.util.HashMap hashMap) {
        a.cp cpVar = com.omarea.Scene.c;
        if (a.fs1.s("layer_always_on", false)) {
            return;
        }
        a.fs1.L(new a.so(kc0Var, 4, this));
    }

    @Override // a.wr0
    public final void onSubscribe() {
    }

    @Override // a.wr0
    public final void onUnsubscribe() {
    }
}
