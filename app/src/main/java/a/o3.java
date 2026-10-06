package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class o3 implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f401a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ o3(int i, java.lang.Object obj) {
        this.f401a = i;
        this.b = obj;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i, long j) {
        int i2 = this.f401a;
        java.lang.Object obj = this.b;
        switch (i2) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                com.omarea.vtools.activities.ActivityAppActivities activityAppActivities = (com.omarea.vtools.activities.ActivityAppActivities) obj;
                a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityAppActivities.f;
                a.wv.w(activityAppActivities, "this$0");
                android.widget.Adapter adapter = adapterView.getAdapter();
                a.wv.t(adapter, "null cannot be cast to non-null type com.omarea.ui.contents.AdapterActivities");
                android.content.pm.ActivityInfo item = ((a.pg) adapter).getItem(i);
                java.lang.String f = a.ii1.f(item.packageName, "/", item.name);
                java.lang.Object systemService = activityAppActivities.getSystemService("clipboard");
                a.wv.t(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                ((android.content.ClipboardManager) systemService).setPrimaryClip(android.content.ClipData.newPlainText("text", f));
                android.widget.Toast.makeText(activityAppActivities, activityAppActivities.getString(2131952139) + "\n" + f, 0).show();
                return true;
            case 1:
                com.omarea.vtools.activities.ActivityAppComponents activityAppComponents = (com.omarea.vtools.activities.ActivityAppComponents) obj;
                a.gu0[] gu0VarArr2 = com.omarea.vtools.activities.ActivityAppComponents.f;
                a.wv.w(activityAppComponents, "this$0");
                android.widget.Adapter adapter2 = adapterView.getAdapter();
                a.wv.t(adapter2, "null cannot be cast to non-null type com.omarea.ui.contents.AdapterComponents");
                android.content.pm.ComponentInfo item2 = ((a.ki) adapter2).getItem(i);
                java.lang.String f2 = a.ii1.f(item2.packageName, "/", item2.name);
                java.lang.Object systemService2 = activityAppComponents.getSystemService("clipboard");
                a.wv.t(systemService2, "null cannot be cast to non-null type android.content.ClipboardManager");
                ((android.content.ClipboardManager) systemService2).setPrimaryClip(android.content.ClipData.newPlainText("text", f2));
                android.widget.Toast.makeText(activityAppComponents, activityAppComponents.getString(2131952139) + "\n" + f2, 0).show();
                return true;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                com.omarea.vtools.activities.ActivityAppContents activityAppContents = (com.omarea.vtools.activities.ActivityAppContents) obj;
                a.gu0[] gu0VarArr3 = com.omarea.vtools.activities.ActivityAppContents.q;
                a.wv.w(activityAppContents, "this$0");
                android.widget.ListAdapter adapter3 = activityAppContents.o().getAdapter();
                a.wv.t(adapter3, "null cannot be cast to non-null type com.omarea.ui.apps.AdapterAppBasic");
                new a.p80(activityAppContents, ((a.rg) adapter3).getItem(i), activityAppContents.i).w();
                return true;
            default:
                a.vk0 vk0Var = (a.vk0) obj;
                a.fa0 fa0Var = a.vk0.g0;
                a.wv.w(vk0Var, "this$0");
                android.widget.ListAdapter adapter4 = vk0Var.T().getAdapter();
                a.wv.t(adapter4, "null cannot be cast to non-null type com.omarea.ui.apps.AdapterAppList");
                com.omarea.model.AppInfo item3 = ((a.nh) adapter4).getItem(i);
                a.kk0 K = vk0Var.K();
                a.a5 a5Var = vk0Var.a0;
                if (a5Var != null) {
                    new a.p80(K, item3, a5Var).w();
                    return true;
                }
                a.wv.M1("myHandler");
                throw null;
        }
    }
}
