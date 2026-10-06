package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class j3 implements android.widget.AdapterView.OnItemClickListener {
    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i, long j) {
        a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityAddin.f;
        java.lang.Object item = adapterView.getAdapter().getItem(i);
        a.wv.t(item, "null cannot be cast to non-null type java.util.HashMap<*, *>{ kotlin.collections.TypeAliasesKt.HashMap<*, *> }");
        java.lang.Object obj = ((java.util.HashMap) item).get("Action");
        a.wv.t(obj, "null cannot be cast to non-null type java.lang.Runnable");
        ((java.lang.Runnable) obj).run();
    }
}
