package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class cv0 {

    public cv0() {
    }

    public static a.ev0 a(a.fv0 fv0Var) {
        a.wv.w(fv0Var, "state");
        int ordinal = fv0Var.ordinal();
        if (ordinal == 2) {
            return a.ev0.ON_DESTROY;
        }
        if (ordinal == 3) {
            return a.ev0.ON_STOP;
        }
        if (ordinal != 4) {
            return null;
        }
        return a.ev0.ON_PAUSE;
    }

    public static a.ev0 b(a.fv0 fv0Var) {
        a.wv.w(fv0Var, "state");
        int ordinal = fv0Var.ordinal();
        if (ordinal == 1) {
            return a.ev0.ON_CREATE;
        }
        if (ordinal == 2) {
            return a.ev0.ON_START;
        }
        if (ordinal != 3) {
            return null;
        }
        return a.ev0.ON_RESUME;
    }

    public static a.ev0 c(a.fv0 fv0Var) {
        a.wv.w(fv0Var, "state");
        int ordinal = fv0Var.ordinal();
        if (ordinal == 2) {
            return a.ev0.ON_CREATE;
        }
        if (ordinal == 3) {
            return a.ev0.ON_START;
        }
        if (ordinal != 4) {
            return null;
        }
        return a.ev0.ON_RESUME;
    }
}
