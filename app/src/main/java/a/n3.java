package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.omarea.vtools.activities.ActivityAddinOnline f367a;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityAddinOnline b;

    public n3(com.omarea.vtools.activities.ActivityAddinOnline activityAddinOnline, com.omarea.vtools.activities.ActivityAddinOnline activityAddinOnline2) {
        this.f367a = activityAddinOnline;
        this.b = activityAddinOnline2;
    }

    @android.webkit.JavascriptInterface
    public final boolean setNavigationBarColor(java.lang.String str) {
        com.omarea.vtools.activities.ActivityAddinOnline activityAddinOnline = this.f367a;
        a.wv.w(str, "colorStr");
        try {
            int parseColor = android.graphics.Color.parseColor(str);
            a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityAddinOnline.g;
            activityAddinOnline.o().post(new a.m3(activityAddinOnline, parseColor, 1));
            return true;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    @android.webkit.JavascriptInterface
    public final boolean setStatusBarColor(java.lang.String str) {
        com.omarea.vtools.activities.ActivityAddinOnline activityAddinOnline = this.f367a;
        a.wv.w(str, "colorStr");
        int i = 0;
        try {
            int parseColor = android.graphics.Color.parseColor(str);
            a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityAddinOnline.g;
            activityAddinOnline.o().post(new a.m3(activityAddinOnline, parseColor, i));
            return true;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    @android.webkit.JavascriptInterface
    public final void showToast(java.lang.String str) {
        a.wv.w(str, "str");
        try {
            com.omarea.vtools.activities.ActivityAddinOnline activityAddinOnline = this.f367a;
            a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityAddinOnline.g;
            activityAddinOnline.o().post(new a.so(this.b, 13, str));
        } catch (java.lang.Exception unused) {
        }
    }
}
