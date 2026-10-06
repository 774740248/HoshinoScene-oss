package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class f3 implements com.omarea.krscript.model.KrScriptActionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.omarea.vtools.activities.ActivityActionPage f143a;

    public f3(com.omarea.vtools.activities.ActivityActionPage activityActionPage) {
        this.f143a = activityActionPage;
    }

    @Override // com.omarea.krscript.model.KrScriptActionHandler
    public final void addToFavorites(com.omarea.krscript.model.ClickableNode clickableNode, com.omarea.krscript.model.KrScriptActionHandler.AddToFavoritesHandler addToFavoritesHandler) {
        com.omarea.krscript.model.PageNode pageNode;
        a.wv.w(clickableNode, "clickableNode");
        a.wv.w(addToFavoritesHandler, "addToFavoritesHandler");
        boolean z = clickableNode instanceof com.omarea.krscript.model.PageNode;
        com.omarea.vtools.activities.ActivityActionPage activityActionPage = this.f143a;
        if (z) {
            pageNode = (com.omarea.krscript.model.PageNode) clickableNode;
        } else {
            if (!(clickableNode instanceof com.omarea.krscript.model.RunnableNode)) {
                return;
            }
            pageNode = activityActionPage.h;
            if (pageNode == null) {
                a.wv.M1("currentPageConfig");
                throw null;
            }
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setComponent(new android.content.ComponentName(activityActionPage.getApplicationContext(), (java.lang.Class<?>) com.omarea.vtools.activities.ActivityActionPage.class));
        intent.addFlags(8388608);
        intent.addFlags(1073741824);
        if (clickableNode instanceof com.omarea.krscript.model.RunnableNode) {
            intent.putExtra("autoRunItemId", clickableNode.getKey());
        }
        intent.putExtra("page", pageNode);
        addToFavoritesHandler.onAddToFavorites(clickableNode, intent);
    }

    @Override // com.omarea.krscript.model.KrScriptActionHandler
    public final void onActionCompleted(com.omarea.krscript.model.RunnableNode runnableNode) {
        a.wv.w(runnableNode, "runnableNode");
        boolean autoFinish = runnableNode.getAutoFinish();
        com.omarea.vtools.activities.ActivityActionPage activityActionPage = this.f143a;
        if (autoFinish && activityActionPage.i.length() > 0 && a.wv.e(runnableNode.getKey(), activityActionPage.i)) {
            activityActionPage.finishAndRemoveTask();
        } else if (runnableNode.getReloadPage()) {
            a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityActionPage.o;
            activityActionPage.getClass();
            a.wv.M0(a.wv.b(a.z80.b), null, new a.i3(activityActionPage, activityActionPage, null), 3);
        }
    }

    @Override // com.omarea.krscript.model.KrScriptActionHandler
    public final void onSubPageClick(com.omarea.krscript.model.PageNode pageNode) {
        a.wv.w(pageNode, "pageNode");
        com.omarea.vtools.activities.ActivityActionPage activityActionPage = this.f143a;
        activityActionPage.getClass();
        new a.pm(activityActionPage).D(pageNode, null);
    }

    @Override // com.omarea.krscript.model.KrScriptActionHandler
    public final boolean openFileChooser(a.j41 j41Var) {
        a.wv.w(j41Var, "fileSelectedInterface");
        a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityActionPage.o;
        return this.f143a.p(j41Var);
    }

    @Override // com.omarea.krscript.model.KrScriptActionHandler
    public final boolean openParamsPage(com.omarea.krscript.model.ActionNode actionNode, android.view.View view, java.lang.Runnable runnable) {
        return com.omarea.krscript.model.KrScriptActionHandler.DefaultImpls.openParamsPage(this, actionNode, view, runnable);
    }
}
