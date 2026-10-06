package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class y3 implements a.m40 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.omarea.vtools.activities.ActivityAppConfig2 f702a;
    public final /* synthetic */ com.omarea.model.AppInfo b;
    public final /* synthetic */ android.widget.AdapterView c;
    public final /* synthetic */ int d;
    public final /* synthetic */ android.view.View e;
    public final /* synthetic */ java.lang.String f;

    public y3(com.omarea.vtools.activities.ActivityAppConfig2 activityAppConfig2, com.omarea.model.AppInfo appInfo, android.widget.AdapterView adapterView, int i, android.view.View view, java.lang.String str) {
        this.f702a = activityAppConfig2;
        this.b = appInfo;
        this.c = adapterView;
        this.d = i;
        this.e = view;
        this.f = str;
    }

    @Override // a.m40
    public final void a(java.lang.String str) {
        a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityAppConfig2.s;
        com.omarea.vtools.activities.ActivityAppConfig2 activityAppConfig2 = this.f702a;
        android.content.SharedPreferences.Editor edit = activityAppConfig2.s().edit();
        java.lang.String str2 = this.f;
        ((str == null || str.length() == 0) ? edit.remove(str2) : edit.putString(str2, str)).apply();
        activityAppConfig2.u(this.b);
        android.widget.Adapter adapter = this.c.getAdapter();
        a.wv.t(adapter, "null cannot be cast to non-null type com.omarea.ui.apps.AdapterSceneMode");
        android.view.View view = this.e;
        a.wv.v(view, "view");
        ((a.zj) adapter).a(view, this.d);
        java.util.ArrayList arrayList = a.dc0.f93a;
        a.kc0 kc0Var = a.kc0.v;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("app", str2);
        hashMap.put("mode", str);
        a.dc0.a(kc0Var, hashMap);
    }
}
