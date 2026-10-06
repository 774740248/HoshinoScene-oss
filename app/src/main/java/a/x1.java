package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class x1 implements com.omarea.krscript.model.KrScriptActionHandler.AddToFavoritesHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a.a2 f678a;

    public x1(a.a2 a2Var) {
        this.f678a = a2Var;
    }

    @Override // com.omarea.krscript.model.KrScriptActionHandler.AddToFavoritesHandler
    public final void onAddToFavorites(com.omarea.krscript.model.ClickableNode clickableNode, android.content.Intent intent) {
        a.wv.w(clickableNode, "clickableNode");
        if (intent != null) {
            int i = a.x60.f681a;
            a.a2 a2Var = this.f678a;
            a.kk0 K = a2Var.K();
            java.lang.String m = a2Var.m(2131952734);
            a.wv.v(m, "getString(R.string.kr_shortcut_create)");
            java.lang.String m2 = a2Var.m(2131952735);
            a.wv.v(m2, "getString(R.string.kr_shortcut_create_desc)");
            a.fs1.i(K, m, a.ai1.l(new java.lang.Object[]{clickableNode.getTitle()}, 1, m2, "format(format, *args)"), new a.ua0(a2Var, intent, clickableNode, 1), null);
        }
    }
}
