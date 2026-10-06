package com.omarea.vtools.activities;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ActivityAppComponents extends a.p5 {
    public static final /* synthetic */ a.gu0[] f;
    public final a.yq1 d = a.b20.i(this, 2131361944);
    public final a.yq1 e = a.b20.i(this, 2131362035);

    static {
        a.d81 d81Var = new a.d81(com.omarea.vtools.activities.ActivityAppComponents.class, "activities", "getActivities()Landroid/widget/ListView;");
        a.na1.f375a.getClass();
        f = new a.gu0[]{d81Var, new a.d81(com.omarea.vtools.activities.ActivityAppComponents.class, "apps_search_box", "getApps_search_box()Landroid/widget/EditText;")};
    }

    public final android.widget.ListView o() {
        return (android.widget.ListView) this.d.a(f[0]);
    }

    @Override // a.p5, a.kk0, androidx.activity.ComponentActivity, a.nw, android.app.Activity
    public final void onCreate(android.os.Bundle bundle) {
        java.lang.String obj;
        super.onCreate(bundle);
        setContentView(2131558432);
        setBackArrow();
        p().setOnEditorActionListener(new a.uf1(this, 2));
        android.content.Intent intent = getIntent();
        java.lang.String str = "";
        int i = 1;
        java.lang.String valueOf = (intent == null || !intent.hasExtra("keyword")) ? "" : java.lang.String.valueOf(getIntent().getStringExtra("keyword"));
        java.lang.Object obj2 = new java.lang.Object();
        if (valueOf.length() > 0) {
            p().setText(valueOf);
        }
        p().addTextChangedListener(new a.xf1(new a.so(obj2, 15, this)));
        android.content.Intent intent2 = getIntent();
        java.lang.String packageName = (intent2 == null || !intent2.hasExtra("packageName")) ? getPackageName() : java.lang.String.valueOf(getIntent().getStringExtra("packageName"));
        android.content.Intent intent3 = getIntent();
        java.lang.String stringExtra = (intent3 == null || !intent3.hasExtra("type")) ? "activity" : getIntent().getStringExtra("type");
        a.wv.v(packageName, "packageName");
        java.util.ArrayList q = q(packageName, stringExtra);
        android.widget.ListView o = o();
        android.content.Context context = getContext();
        java.lang.String str2 = stringExtra == null ? "" : stringExtra;
        android.text.Editable text = p().getText();
        if (text != null && (obj = text.toString()) != null) {
            str = obj;
        }
        o.setAdapter((android.widget.ListAdapter) new a.ki(context, q, str2, str));
        o().setOnItemLongClickListener(new a.o3(i, this));
        o().setOnItemClickListener(new a.r3(this, packageName, stringExtra, 0));
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final java.util.ArrayList q(java.lang.String str, java.lang.String str2) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        if (str2 != null) {
            switch (str2.hashCode()) {
                case -1655966961:
                    if (str2.equals("activity")) {
                        android.content.Context context = getContext();
                        a.wv.w(context, "context");
                        android.content.pm.PackageManager packageManager = context.getPackageManager();
                        new a.e3(context, 0);
                        android.content.pm.ActivityInfo[] activityInfoArr = packageManager.getPackageInfo(str, 513).activities;
                        if (activityInfoArr != null) {
                            arrayList = new java.util.ArrayList(a.op.W1(activityInfoArr));
                            arrayList2 = arrayList;
                            break;
                        } else {
                            arrayList2 = new java.util.ArrayList();
                            break;
                        }
                    }
                    break;
                case -987494927:
                    if (str2.equals("provider")) {
                        android.content.Context context2 = getContext();
                        a.wv.w(context2, "context");
                        android.content.pm.PackageManager packageManager2 = context2.getPackageManager();
                        new a.e3(context2, 0);
                        android.content.pm.ProviderInfo[] providerInfoArr = packageManager2.getPackageInfo(str, 520).providers;
                        if (providerInfoArr != null) {
                            arrayList = new java.util.ArrayList(a.op.W1(providerInfoArr));
                            arrayList2 = arrayList;
                            break;
                        } else {
                            arrayList2 = new java.util.ArrayList();
                            break;
                        }
                    }
                    break;
                case -808719889:
                    if (str2.equals("receiver")) {
                        android.content.Context context3 = getContext();
                        a.wv.w(context3, "context");
                        android.content.pm.PackageManager packageManager3 = context3.getPackageManager();
                        new a.e3(context3, 0);
                        android.content.pm.ActivityInfo[] activityInfoArr2 = packageManager3.getPackageInfo(str, 514).receivers;
                        if (activityInfoArr2 != null) {
                            arrayList = new java.util.ArrayList(a.op.W1(activityInfoArr2));
                            arrayList2 = arrayList;
                            break;
                        } else {
                            arrayList2 = new java.util.ArrayList();
                            break;
                        }
                    }
                    break;
                case 1984153269:
                    if (str2.equals("service")) {
                        android.content.Context context4 = getContext();
                        a.wv.w(context4, "context");
                        android.content.pm.PackageManager packageManager4 = context4.getPackageManager();
                        new a.e3(context4, 0);
                        android.content.pm.ServiceInfo[] serviceInfoArr = packageManager4.getPackageInfo(str, 516).services;
                        if (serviceInfoArr != null) {
                            arrayList = new java.util.ArrayList(a.op.W1(serviceInfoArr));
                            arrayList2 = arrayList;
                            break;
                        } else {
                            arrayList2 = new java.util.ArrayList();
                            break;
                        }
                    }
                    break;
            }
            return new java.util.ArrayList(arrayList2);
        }
        android.content.Context context5 = getContext();
        a.wv.w(context5, "context");
        android.content.pm.PackageManager packageManager5 = context5.getPackageManager();
        new a.e3(context5, 0);
        android.content.pm.ActivityInfo[] activityInfoArr3 = packageManager5.getPackageInfo(str, 513).activities;
        if (activityInfoArr3 == null) {
            arrayList2 = new java.util.ArrayList();
            return new java.util.ArrayList(arrayList2);
        }
        arrayList = new java.util.ArrayList(a.op.W1(activityInfoArr3));
        arrayList2 = arrayList;
        return new java.util.ArrayList(arrayList2);
    }
}
