package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class gq1 implements android.view.OnReceiveContentListener {

    /* renamed from: a, reason: collision with root package name */
    public final a.i31 f188a;

    public gq1(a.i31 i31Var) {
        this.f188a = i31Var;
    }

    public final android.view.ContentInfo onReceiveContent(android.view.View view, android.view.ContentInfo contentInfo) {
        a.sx sxVar = new a.sx(new a.vu0(contentInfo));
        a.sx a2 = ((a.nl1) this.f188a).a(view, sxVar);
        if (a2 == null) {
            return null;
        }
        if (a2 == sxVar) {
            return contentInfo;
        }
        android.view.ContentInfo j = a2.f543a.j();
        java.util.Objects.requireNonNull(j);
        return a.nx.f(j);
    }
}
