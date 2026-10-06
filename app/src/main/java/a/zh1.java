package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class zh1 extends a.q91 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f736a = false;
    public final /* synthetic */ a.v31 b;

    public zh1(a.v31 v31Var) {
        this.b = v31Var;
    }

    @Override // a.q91
    public final void a(androidx.recyclerview.widget.RecyclerView recyclerView, int i) {
        if (i == 0 && this.f736a) {
            this.f736a = false;
            this.b.f();
        }
    }

    @Override // a.q91
    public final void b(androidx.recyclerview.widget.RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.f736a = true;
    }
}
