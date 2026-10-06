package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class tg {
    private boolean notFound;
    private boolean selected;
    private java.lang.String appName = "";
    private java.lang.String packageName = "";

    public final java.lang.String getAppName() {
        return this.appName;
    }

    public final boolean getNotFound() {
        return this.notFound;
    }

    public final java.lang.String getPackageName() {
        return this.packageName;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final void setAppName(java.lang.String str) {
        a.wv.w(str, "<set-?>");
        this.appName = str;
    }

    public final void setNotFound(boolean z) {
        this.notFound = z;
    }

    public final void setPackageName(java.lang.String str) {
        a.wv.w(str, "<set-?>");
        this.packageName = str;
    }

    public final void setSelected(boolean z) {
        this.selected = z;
    }
}
