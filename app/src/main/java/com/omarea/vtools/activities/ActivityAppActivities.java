package com.omarea.vtools.activities;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ActivityAppActivities extends a.p5 {
    public static final /* synthetic */ a.gu0[] f;
    public final a.yq1 d = a.b20.i(this, 2131361944);
    public final a.yq1 e = a.b20.i(this, 2131362035);

    static {
        a.d81 d81Var = new a.d81(com.omarea.vtools.activities.ActivityAppActivities.class, "activities", "getActivities()Landroid/widget/ListView;");
        a.na1.f375a.getClass();
        f = new a.gu0[]{d81Var, new a.d81(com.omarea.vtools.activities.ActivityAppActivities.class, "apps_search_box", "getApps_search_box()Landroid/widget/EditText;")};
    }

    public final android.widget.ListView o() {
        return (android.widget.ListView) this.d.a(f[0]);
    }

    @Override // a.p5, a.kk0, androidx.activity.ComponentActivity, a.nw, android.app.Activity
    public final void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        android.content.ComponentName component;
        super.onCreate(bundle);
        setContentView(2131558432);
        setBackArrow();
        p().setOnEditorActionListener(new a.uf1(this, 1));
        android.content.Intent intent = getIntent();
        java.lang.String valueOf = (intent == null || !intent.hasExtra("keyword")) ? "" : java.lang.String.valueOf(getIntent().getStringExtra("keyword"));
        java.lang.Object obj = new java.lang.Object();
        if (valueOf.length() > 0) {
            p().setText(valueOf);
        }
        p().addTextChangedListener(new a.xf1(new a.so(obj, 14, this)));
        android.content.Intent intent2 = getIntent();
        java.lang.String packageName = (intent2 == null || !intent2.hasExtra("packageName")) ? getPackageName() : java.lang.String.valueOf(getIntent().getStringExtra("packageName"));
        android.content.Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(packageName);
        java.lang.String className = (launchIntentForPackage == null || (component = launchIntentForPackage.getComponent()) == null) ? null : component.getClassName();
        android.content.Context context = getContext();
        a.wv.w(context, "context");
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        new a.e3(context, 0);
        a.wv.v(packageName, "packageName");
        android.content.pm.ActivityInfo[] activityInfoArr = packageManager.getPackageInfo(packageName, 513).activities;
        java.util.ArrayList arrayList = activityInfoArr == null ? new java.util.ArrayList() : new java.util.ArrayList(a.op.W1(activityInfoArr));
        android.widget.ListView o = o();
        android.content.Context context2 = getContext();
        android.text.Editable text = p().getText();
        if (text == null || (str = text.toString()) == null) {
            str = "";
        }
        a.pg pgVar = new a.pg(context2, arrayList, str, className != null ? className : "");
        if (className != null) {
            pgVar.f = className;
            pgVar.g = pgVar.a(pgVar.e, pgVar.d);
            pgVar.notifyDataSetChanged();
        }
        o.setAdapter((android.widget.ListAdapter) pgVar);
        o().setOnItemLongClickListener(new a.o3(0, this));
        o().setOnItemClickListener(new a.og1(1, this));
    }

    @Override // a.p5, a.kk0, android.app.Activity
    public final void onResume() {
        super.onResume();
        android.content.Intent intent = getIntent();
        setTitle((intent == null || !intent.hasExtra("appName")) ? "" : getIntent().getStringExtra("appName"));
    }

    public final android.widget.EditText p() {
        return (android.widget.EditText) this.e.a(f[1]);
    }

    public final void q(android.text.Editable editable) {
        java.lang.String obj = editable.toString();
        android.widget.ListAdapter adapter = o().getAdapter();
        a.wv.t(adapter, "null cannot be cast to non-null type com.omarea.ui.contents.AdapterActivities");
        a.pg pgVar = (a.pg) adapter;
        a.wv.w(obj, "text");
        pgVar.e = obj;
        pgVar.g = pgVar.a(obj, pgVar.d);
        pgVar.notifyDataSetChanged();
    }
}
