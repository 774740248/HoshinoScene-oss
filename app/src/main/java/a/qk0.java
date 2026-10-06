package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class qk0 implements android.widget.AdapterView.OnItemClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;

    public /* synthetic */ qk0(java.lang.Object obj, int i, java.lang.Object obj2) {
        this.c = i;
        this.d = obj;
        this.e = obj2;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i, long j) {
        int i2 = this.c;
        java.lang.Object obj = this.e;
        java.lang.Object obj2 = this.d;
        switch (i2) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.vk0 vk0Var = (a.vk0) obj2;
                java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) obj;
                a.fa0 fa0Var = a.vk0.g0;
                a.wv.w(vk0Var, "this$0");
                a.wv.w(weakReference, "$adapterAppList");
                a.q10 q10Var = a.q10.f457a;
                if (a.wv.e(a.q10.t(), "basic")) {
                    android.widget.ListAdapter adapter = vk0Var.T().getAdapter();
                    a.wv.t(adapter, "null cannot be cast to non-null type com.omarea.ui.apps.AdapterAppList");
                    com.omarea.model.AppInfo item = ((a.nh) adapter).getItem(i);
                    a.kk0 K = vk0Var.K();
                    a.a5 a5Var = vk0Var.a0;
                    if (a5Var != null) {
                        new a.p80(K, item, a5Var).w();
                        return;
                    } else {
                        a.wv.M1("myHandler");
                        throw null;
                    }
                }
                ((android.widget.CheckBox) view.findViewById(2131363080)).setChecked(!r4.isChecked());
                if (weakReference.get() != null) {
                    android.widget.CheckBox V = vk0Var.V();
                    java.lang.Object obj3 = weakReference.get();
                    a.wv.s(obj3);
                    V.setChecked(((a.nh) obj3).a());
                }
                android.view.View U = vk0Var.U();
                a.nh nhVar = (a.nh) weakReference.get();
                U.setVisibility((nhVar == null || !nhVar.d()) ? 8 : 0);
                return;
            default:
                android.widget.ListView listView = (android.widget.ListView) obj2;
                a.pl0 pl0Var = (a.pl0) obj;
                a.gu0[] gu0VarArr = a.pl0.W0;
                a.wv.w(listView, "$this_run");
                a.wv.w(pl0Var, "this$0");
                com.omarea.model.ProcessInfo processInfo = (com.omarea.model.ProcessInfo) adapterView.getItemAtPosition(i);
                android.content.Intent intent = new android.content.Intent(listView.getContext(), (java.lang.Class<?>) com.omarea.vtools.activities.ActivityProcess.class);
                intent.addFlags(268435456);
                intent.putExtra("name", processInfo != null ? processInfo.name : null);
                pl0Var.R(intent);
                return;
        }
    }
}
