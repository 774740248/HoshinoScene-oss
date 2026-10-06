package com.omarea.krscript.model;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public interface KrScriptActionHandler {

    /* loaded from: /tmp/jadx-10340276197810293799.dex */
    public interface AddToFavoritesHandler {
        void onAddToFavorites(com.omarea.krscript.model.ClickableNode clickableNode, android.content.Intent intent);
    }

    /* loaded from: /tmp/jadx-10340276197810293799.dex */
    public static final class DefaultImpls {
        public static boolean openParamsPage(com.omarea.krscript.model.KrScriptActionHandler krScriptActionHandler, com.omarea.krscript.model.ActionNode actionNode, android.view.View view, java.lang.Runnable runnable) {
            a.wv.w(actionNode, "actionNode");
            a.wv.w(view, "view");
            a.wv.w(runnable, "onCompleted");
            return false;
        }
    }

    void addToFavorites(com.omarea.krscript.model.ClickableNode clickableNode, com.omarea.krscript.model.KrScriptActionHandler.AddToFavoritesHandler addToFavoritesHandler);

    void onActionCompleted(com.omarea.krscript.model.RunnableNode runnableNode);

    void onSubPageClick(com.omarea.krscript.model.PageNode pageNode);

    boolean openFileChooser(a.j41 j41Var);

    boolean openParamsPage(com.omarea.krscript.model.ActionNode actionNode, android.view.View view, java.lang.Runnable runnable);
}
