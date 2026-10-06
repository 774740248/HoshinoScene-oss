package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class qt extends a.mn1 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f480a = false;
    public final /* synthetic */ android.view.ViewGroup b;

    public qt(android.view.ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    @Override // a.mn1, a.kn1
    public final void a() {
        a.uq1.a(this.b, false);
        this.f480a = true;
    }

    @Override // a.mn1, a.kn1
    public final void c() {
        a.uq1.a(this.b, false);
    }

    @Override // a.kn1
    public final void d(a.ln1 ln1Var) {
        if (!this.f480a) {
            a.uq1.a(this.b, false);
        }
        ln1Var.v(this);
    }

    @Override // a.mn1, a.kn1
    public final void e() {
        a.uq1.a(this.b, true);
    }
}
