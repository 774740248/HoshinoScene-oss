package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class jc0 extends a.xy {
    public static final /* synthetic */ int h = 0;
    public long e;
    public boolean f;
    public a.hp g;

    public final void l(boolean z) {
        long j = this.e - (z ? 4294967296L : 1L);
        this.e = j;
        if (j <= 0 && this.f) {
            r();
        }
    }

    public abstract java.lang.Thread m();

    public final void n(boolean z) {
        this.e = (z ? 4294967296L : 1L) + this.e;
        if (z) {
            return;
        }
        this.f = true;
    }

    public abstract long o();

    public final boolean p() {
        a.hp hpVar = this.g;
        if (hpVar == null) {
            return false;
        }
        a.y80 y80Var = (a.y80) (hpVar.isEmpty() ? null : hpVar.removeFirst());
        if (y80Var == null) {
            return false;
        }
        y80Var.run();
        return true;
    }

    public void q(long j, a.gc0 gc0Var) {
        a.h20.l.v(j, gc0Var);
    }

    public abstract void r();
}
