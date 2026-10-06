package a;

/* loaded from: /tmp/jadx-9051527860862319108.dex */
public final /* synthetic */ class br0 implements c90 {

    public br0() {
        this(null, null);
    }
    public final /* synthetic */ cr0 c;
    public final /* synthetic */ Runnable d;

    public /* synthetic */ br0(cr0 cr0Var, Runnable runnable) {
        this.c = cr0Var;
        this.d = runnable;
    }

    public final void c() {
        this.c.e.removeCallbacks(this.d);
    }
}
