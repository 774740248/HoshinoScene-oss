package a;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.omarea.model.ProcessInfo;

/* loaded from: /tmp/jadx-9051527860862319108.dex */
public final /* synthetic */ class mh0 implements AdapterView.OnItemLongClickListener {

    public mh0() {
        this(null, null);
    }

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ListView f10a;
    public final /* synthetic */ ph0 b;

    public /* synthetic */ mh0(ListView listView, ph0 ph0Var) {
        this.f10a = listView;
        this.b = ph0Var;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
        ListView listView = this.f10a;
        wv.w(listView, "$process_list");
        ph0 ph0Var = this.b;
        wv.w(ph0Var, "this$0");
        rj adapter = listView.getAdapter();
        wv.t(adapter, "null cannot be cast to non-null type com.omarea.ui.procs.AdapterProcessMini");
        Object obj = adapter.l.get(i);
        wv.v(obj, "list[position]");
        ProcessInfo processInfo = (ProcessInfo) obj;
        rg0 rg0Var = new rg0(ph0Var.f435a);
        rg0Var.b();
        int i2 = processInfo.pid;
        String str = processInfo.name;
        wv.v(str, "processInfo.name");
        rg0Var.c(str, i2);
        return true;
    }
}
