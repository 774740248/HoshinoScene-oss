package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class m0 extends a.uu0 implements a.qo0 {
    public static final a.m0 d = (m0) new a.uu0(0);

    @Override // a.qo0
    public final java.lang.Object b() {
        a.cp cpVar = com.omarea.Scene.c;
        android.app.Application t = a.fs1.t();
        try {
            android.content.Intent intent = new android.content.Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            android.content.pm.ResolveInfo resolveActivity = t.getPackageManager().resolveActivity(intent, 0);
            a.wv.s(resolveActivity);
            android.content.pm.ActivityInfo activityInfo = resolveActivity.activityInfo;
            if (activityInfo != null && !a.wv.e(activityInfo.packageName, "android")) {
                return resolveActivity.activityInfo.packageName;
            }
            return null;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
