package com.omarea.krscript.model;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class PageNode extends com.omarea.krscript.model.ClickableNode {
    private java.lang.String activity;
    private java.lang.String afterRead;
    private java.lang.String beforeRead;
    private java.lang.String link;
    private java.lang.String loadFail;
    private java.lang.String loadSuccess;
    private java.lang.String onlineHtmlPage;
    private java.lang.String pageConfigPath;
    private java.lang.String pageConfigSh;
    private java.lang.String pageHandlerSh;
    private java.util.ArrayList<com.omarea.krscript.model.PageMenuOption> pageMenuOptions;
    private java.lang.String pageMenuOptionsSh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageNode(java.lang.String str) {
        super(str);
        a.wv.w(str, "currentConfigXml");
        this.pageConfigPath = "";
        this.pageConfigSh = "";
        this.onlineHtmlPage = "";
        this.link = "";
        this.activity = "";
        this.beforeRead = "";
        this.afterRead = "";
        this.pageMenuOptionsSh = "";
        this.pageHandlerSh = "";
        this.loadSuccess = "";
        this.loadFail = "";
    }

    public final java.lang.String getActivity() {
        return this.activity;
    }

    public final java.lang.String getAfterRead() {
        return this.afterRead;
    }

    public final java.lang.String getBeforeRead() {
        return this.beforeRead;
    }

    public final java.lang.String getLink() {
        return this.link;
    }

    public final java.lang.String getLoadFail() {
        return this.loadFail;
    }

    public final java.lang.String getLoadSuccess() {
        return this.loadSuccess;
    }

    public final java.lang.String getOnlineHtmlPage() {
        return this.onlineHtmlPage;
    }

    public final java.lang.String getPageConfigPath() {
        return this.pageConfigPath;
    }

    public final java.lang.String getPageConfigSh() {
        return this.pageConfigSh;
    }

    public final java.lang.String getPageHandlerSh() {
        return this.pageHandlerSh;
    }

    public final java.util.ArrayList<com.omarea.krscript.model.PageMenuOption> getPageMenuOptions() {
        return this.pageMenuOptions;
    }

    public final java.lang.String getPageMenuOptionsSh() {
        return this.pageMenuOptionsSh;
    }

    public final void setActivity(java.lang.String str) {
        a.wv.w(str, "<set-?>");
        this.activity = str;
    }

    public final void setAfterRead(java.lang.String str) {
        a.wv.w(str, "<set-?>");
        this.afterRead = str;
    }

    public final void setBeforeRead(java.lang.String str) {
        a.wv.w(str, "<set-?>");
        this.beforeRead = str;
    }

    public final void setLink(java.lang.String str) {
        a.wv.w(str, "<set-?>");
        this.link = str;
    }

    public final void setLoadFail(java.lang.String str) {
        a.wv.w(str, "<set-?>");
        this.loadFail = str;
    }

    public final void setLoadSuccess(java.lang.String str) {
        a.wv.w(str, "<set-?>");
        this.loadSuccess = str;
    }

    public final void setOnlineHtmlPage(java.lang.String str) {
        a.wv.w(str, "<set-?>");
        this.onlineHtmlPage = str;
    }

    public final void setPageConfigPath(java.lang.String str) {
        a.wv.w(str, "<set-?>");
        this.pageConfigPath = str;
    }

    public final void setPageConfigSh(java.lang.String str) {
        a.wv.w(str, "<set-?>");
        this.pageConfigSh = str;
    }

    public final void setPageHandlerSh(java.lang.String str) {
        a.wv.w(str, "<set-?>");
        this.pageHandlerSh = str;
    }

    public final void setPageMenuOptions(java.util.ArrayList<com.omarea.krscript.model.PageMenuOption> arrayList) {
        this.pageMenuOptions = arrayList;
    }

    public final void setPageMenuOptionsSh(java.lang.String str) {
        a.wv.w(str, "<set-?>");
        this.pageMenuOptionsSh = str;
    }
}
