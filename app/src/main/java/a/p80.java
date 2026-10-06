package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class p80 extends a.k40 {
    public final com.omarea.model.AppInfo e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p80(a.kk0 kk0Var, com.omarea.model.AppInfo appInfo, a.a5 a5Var) {
        super(kk0Var, a.b20.f(appInfo), a5Var);
        a.wv.w(appInfo, "app");
        a.wv.w(a5Var, "handler");
        this.e = appInfo;
    }

    public final void r() {
        android.app.Activity activity = this.f281a;
        java.lang.Object systemService = activity.getSystemService("clipboard");
        a.wv.t(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        com.omarea.model.AppInfo appInfo = this.e;
        ((android.content.ClipboardManager) systemService).setText(appInfo.path);
        android.widget.Toast.makeText(activity, activity.getString(2131951907) + ((java.lang.Object) appInfo.path), 1).show();
    }

    public final void s() {
        android.app.Activity activity = this.f281a;
        java.lang.Object systemService = activity.getSystemService("clipboard");
        a.wv.t(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        com.omarea.model.AppInfo appInfo = this.e;
        ((android.content.ClipboardManager) systemService).setText(appInfo.getPackageName());
        android.widget.Toast.makeText(activity, activity.getString(2131951907) + appInfo.getPackageName(), 1).show();
    }

    public final android.graphics.drawable.Drawable t(com.omarea.model.AppInfo appInfo) {
        android.app.Activity activity = this.f281a;
        try {
            android.content.pm.ApplicationInfo applicationInfo = activity.getPackageManager().getPackageInfo(appInfo.getPackageName().toString(), 0).applicationInfo;
            if (applicationInfo != null) {
                return applicationInfo.loadIcon(activity.getPackageManager());
            }
            return null;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public final void u() {
        android.content.Intent intent = new android.content.Intent();
        intent.addFlags(268435456);
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(android.net.Uri.fromParts("package", this.e.getPackageName().toString(), null));
        this.f281a.startActivity(intent);
    }

    public final void v() {
        java.lang.String g = a.ai1.g("market://details?id=", this.e.getPackageName());
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
        intent.setData(android.net.Uri.parse(g));
        this.f281a.startActivity(intent);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0297  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w() {
        /*
            Method dump skipped, instructions count: 1133
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.p80.w():void");
    }
}
