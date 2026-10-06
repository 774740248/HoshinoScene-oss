package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class n4 implements a.m40 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.SharedPreferences f370a;
    public final /* synthetic */ android.view.View b;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityAppDetails c;

    public n4(android.content.SharedPreferences sharedPreferences, android.view.View view, com.omarea.vtools.activities.ActivityAppDetails activityAppDetails) {
        this.f370a = sharedPreferences;
        this.b = view;
        this.c = activityAppDetails;
    }

    @Override // a.m40
    public final void a(java.lang.String str) {
        android.content.SharedPreferences.Editor edit = this.f370a.edit();
        com.omarea.vtools.activities.ActivityAppDetails activityAppDetails = this.c;
        ((str == null || str.length() == 0) ? edit.remove(activityAppDetails.L) : edit.putString(activityAppDetails.L, str)).apply();
        android.view.View view = this.b;
        a.wv.t(view, "null cannot be cast to non-null type android.widget.TextView");
        a.nk nkVar = a.b11.c;
        ((android.widget.TextView) view).setText(a.tg1.n(str));
        activityAppDetails.P = -1;
        java.lang.String str2 = activityAppDetails.L;
        java.lang.String str3 = str;
        if (((java.lang.Boolean) activityAppDetails.W.a()).booleanValue()) {
            java.util.ArrayList arrayList = a.dc0.f93a;
            a.kc0 kc0Var = a.kc0.v;
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("app", str2);
            if (str3 != null) {
                hashMap.put("mode", str3);
            }
            a.dc0.a(kc0Var, hashMap);
        }
    }
}
