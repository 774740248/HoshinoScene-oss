package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class on0 implements a.kn1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f413a;
    public final /* synthetic */ java.util.ArrayList b;

    public on0(android.view.View view, java.util.ArrayList arrayList) {
        this.f413a = view;
        this.b = arrayList;
    }

    @Override // a.kn1
    public final void a() {
    }

    @Override // a.kn1
    public final void b() {
    }

    @Override // a.kn1
    public final void c() {
    }

    @Override // a.kn1
    public final void d(a.ln1 ln1Var) {
        ln1Var.v(this);
        this.f413a.setVisibility(8);
        java.util.ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((android.view.View) arrayList.get(i)).setVisibility(0);
        }
    }

    @Override // a.kn1
    public final void e() {
    }
}
