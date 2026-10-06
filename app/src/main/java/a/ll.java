package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ll implements a.g31 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a.ml f323a;

    public ll(a.ml mlVar) {
        this.f323a = mlVar;
    }

    @Override // a.g31
    public final void a(android.content.Context context) {
        a.ml mlVar = this.f323a;
        a.xl delegate = mlVar.getDelegate();
        delegate.a();
        mlVar.getSavedStateRegistry().a("androidx:appcompat");
        delegate.d();
    }
}
