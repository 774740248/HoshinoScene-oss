package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class k71 implements a.mv0 {
    public static final a.k71 k = new a.k71();
    public int c;
    public int d;
    public android.os.Handler g;
    public boolean e = true;
    public boolean f = true;
    public final androidx.lifecycle.a h = new androidx.lifecycle.a(this);
    public final a.fw i = new a.fw(3, this);
    public final a.j71 j = new a.j71(this);

    public final void a() {
        int i = this.d + 1;
        this.d = i;
        if (i == 1) {
            if (this.e) {
                this.h.e(a.ev0.ON_RESUME);
                this.e = false;
            } else {
                android.os.Handler handler = this.g;
                a.wv.s(handler);
                handler.removeCallbacks(this.i);
            }
        }
    }

    @Override // a.mv0
    public final a.gv0 getLifecycle() {
        return this.h;
    }
}
