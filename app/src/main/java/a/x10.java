package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class x10 implements a.wr0 {
    @Override // a.wr0
    public final boolean eventFilter(a.kc0 kc0Var) {
        int ordinal = kc0Var.ordinal();
        return ordinal == 0 || ordinal == 1 || ordinal == 2 || ordinal == 3 || ordinal == 5 || ordinal == 10 || ordinal == 7 || ordinal == 8;
    }

    @Override // a.wr0
    public final boolean isAsync() {
        return true;
    }

    @Override // a.wr0
    public final void onReceive(a.kc0 kc0Var, java.util.HashMap hashMap) {
        a.q10 q10Var = a.q10.f457a;
        if (a.q10.r()) {
            int ordinal = kc0Var.ordinal();
            int i = 1;
            if (ordinal != 0) {
                int i2 = 2;
                if (ordinal != 1) {
                    i = 3;
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            i = 4;
                        } else if (ordinal == 5) {
                            i = 6;
                        } else if (ordinal != 10) {
                            i2 = 8;
                            if (ordinal != 7) {
                                if (ordinal != 8) {
                                    return;
                                } else {
                                    i = 9;
                                }
                            }
                        } else {
                            i = 11;
                        }
                    }
                }
                i = i2;
            }
            a.cp cpVar = com.omarea.Scene.c;
            a.fs1.c(new a.w10(i, null));
        }
    }

    @Override // a.wr0
    public final void onSubscribe() {
    }

    @Override // a.wr0
    public final void onUnsubscribe() {
    }
}
