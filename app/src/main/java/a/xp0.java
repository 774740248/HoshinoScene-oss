package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class xp0 implements a.bh {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a.fh f691a;
    public final /* synthetic */ com.omarea.ui.apps.Games b;

    public xp0(a.fh fhVar, com.omarea.ui.apps.Games games) {
        this.f691a = fhVar;
        this.b = games;
    }

    @Override // a.bh
    public final void a(android.view.View view, int i) {
        a.wv.w(view, "view");
        com.omarea.model.AppInfo p = this.f691a.p(i);
        boolean e = a.wv.e(p.getPackageName(), "plus");
        com.omarea.ui.apps.Games games = this.b;
        if (!e) {
            try {
                com.omarea.ui.apps.Games.f(games, p);
                return;
            } catch (java.lang.Exception unused) {
                return;
            }
        }
        a.b81 b81Var = games.k;
        if (b81Var == null) {
            a.wv.M1("processBarDialog");
            throw null;
        }
        a.b81.c(b81Var);
        a.wv.M0(a.wv.b(a.z80.b), null, new a.vp0(games, null), 3);
    }
}
