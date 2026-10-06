package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class og1 implements android.widget.AdapterView.OnItemClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ og1(int i, java.lang.Object obj) {
        this.c = i;
        this.d = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i, long j) {
        a.nh nhVar;
        a.nh nhVar2;
        int i2 = this.c;
        java.lang.Object obj = this.d;
        switch (i2) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                com.omarea.ui.SelectView selectView = (com.omarea.ui.SelectView) obj;
                int i3 = com.omarea.ui.SelectView.k;
                a.wv.w(selectView, "this$0");
                if (i != selectView.f && i >= 0 && i < selectView.e.size()) {
                    selectView.f = i;
                    selectView.d();
                    a.fp0 fp0Var = selectView.c;
                    if (fp0Var != null) {
                        fp0Var.g(selectView.e.get(i), java.lang.Integer.valueOf(i));
                    }
                }
                selectView.b();
                return;
            case 1:
                com.omarea.vtools.activities.ActivityAppActivities activityAppActivities = (com.omarea.vtools.activities.ActivityAppActivities) obj;
                a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityAppActivities.f;
                a.wv.w(activityAppActivities, "this$0");
                android.widget.Adapter adapter = adapterView.getAdapter();
                a.wv.t(adapter, "null cannot be cast to non-null type com.omarea.ui.contents.AdapterActivities");
                android.content.pm.ActivityInfo item = ((a.pg) adapter).getItem(i);
                android.content.Intent intent = new android.content.Intent(activityAppActivities.getContext(), (java.lang.Class<?>) com.omarea.vtools.activities.ActivityAppActivity.class);
                intent.putExtra("packageName", item.packageName);
                intent.putExtra("activity", item.name);
                activityAppActivities.startActivity(intent);
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                com.omarea.vtools.activities.ActivityAppConfig2 activityAppConfig2 = (com.omarea.vtools.activities.ActivityAppConfig2) obj;
                a.gu0[] gu0VarArr2 = com.omarea.vtools.activities.ActivityAppConfig2.s;
                a.wv.w(activityAppConfig2, "this$0");
                try {
                    java.lang.Object item2 = adapterView.getAdapter().getItem(i);
                    a.wv.t(item2, "null cannot be cast to non-null type com.omarea.model.AppInfo");
                    android.content.Intent intent2 = new android.content.Intent(activityAppConfig2.getContext(), (java.lang.Class<?>) com.omarea.vtools.activities.ActivityAppDetails.class);
                    intent2.putExtra("app", ((com.omarea.model.AppInfo) item2).getPackageName());
                    activityAppConfig2.startActivityForResult(intent2, 0);
                    activityAppConfig2.q = view;
                    return;
                } catch (java.lang.Exception unused) {
                    return;
                }
            case 3:
                com.omarea.vtools.activities.ActivityAppRetrieve activityAppRetrieve = (com.omarea.vtools.activities.ActivityAppRetrieve) obj;
                if (i != 0) {
                    android.view.View findViewById = view.findViewById(2131363080);
                    a.wv.t(findViewById, "null cannot be cast to non-null type android.widget.CheckBox");
                    ((android.widget.CheckBox) findViewById).setChecked(!r6.isChecked());
                    a.gu0[] gu0VarArr3 = com.omarea.vtools.activities.ActivityAppRetrieve.k;
                    android.widget.CheckBox checkBox = (android.widget.CheckBox) activityAppRetrieve.q().findViewById(2131363081);
                    java.lang.ref.WeakReference weakReference = activityAppRetrieve.h;
                    checkBox.setChecked((weakReference == null || (nhVar = (a.nh) weakReference.get()) == null || !nhVar.a()) ? false : true);
                    com.omarea.vtools.activities.ActivityAppRetrieve.o(activityAppRetrieve);
                    return;
                }
                android.view.View findViewById2 = adapterView.findViewById(2131363081);
                a.wv.v(findViewById2, "parentView.findViewById(R.id.select_state_all)");
                android.widget.CheckBox checkBox2 = (android.widget.CheckBox) findViewById2;
                checkBox2.setChecked(!checkBox2.isChecked());
                java.lang.ref.WeakReference weakReference2 = activityAppRetrieve.h;
                if (weakReference2 != null && (nhVar2 = (a.nh) weakReference2.get()) != null) {
                    nhVar2.e(checkBox2.isChecked());
                    nhVar2.notifyDataSetChanged();
                }
                com.omarea.vtools.activities.ActivityAppRetrieve.o(activityAppRetrieve);
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                com.omarea.vtools.activities.ActivityAppXposedConfig activityAppXposedConfig = (com.omarea.vtools.activities.ActivityAppXposedConfig) obj;
                a.gu0[] gu0VarArr4 = com.omarea.vtools.activities.ActivityAppXposedConfig.o;
                a.wv.w(activityAppXposedConfig, "this$0");
                try {
                    java.lang.Object item3 = adapterView.getAdapter().getItem(i);
                    a.wv.t(item3, "null cannot be cast to non-null type com.omarea.model.AppInfo");
                    android.content.Intent intent3 = new android.content.Intent(activityAppXposedConfig.getContext(), (java.lang.Class<?>) com.omarea.vtools.activities.ActivityAppXposedDetails.class);
                    intent3.putExtra("app", ((com.omarea.model.AppInfo) item3).getPackageName());
                    activityAppXposedConfig.startActivityForResult(intent3, 0);
                    activityAppXposedConfig.m = view;
                    return;
                } catch (java.lang.Exception unused2) {
                    return;
                }
            default:
                a.pl0 pl0Var = (a.pl0) obj;
                a.gu0[] gu0VarArr5 = a.pl0.W0;
                a.wv.w(pl0Var, "this$0");
                pl0Var.I0.getClass();
                java.util.HashMap l = a.ls.l(i);
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                for (java.util.Map.Entry entry : (Iterable<java.util.Map.Entry>) l.entrySet()) {
                    sb.append("\n");
                    java.lang.Object key = entry.getKey();
                    a.wv.v(key, "param.key");
                    java.lang.Object key2 = entry.getKey();
                    a.wv.v(key2, "param.key");
                    java.lang.String substring = ((java.lang.String) key).substring(a.yi1.q2((java.lang.CharSequence) key2, "/", 6) + 1);
                    a.wv.v(substring, "this as java.lang.String).substring(startIndex)");
                    sb.append(substring);
                    sb.append("：");
                    sb.append((java.lang.String) entry.getValue());
                    sb.append("\n");
                }
                int i4 = a.x60.f681a;
                a.kk0 K = pl0Var.K();
                java.lang.String sb2 = sb.toString();
                a.wv.v(sb2, "msg.toString()");
                a.fs1.F(K, "Governor Params", sb2, null);
                return;
        }
    }
}
