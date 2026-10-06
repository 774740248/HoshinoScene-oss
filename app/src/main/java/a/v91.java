package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class v91 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f628a;

    public v91(androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.f628a = recyclerView;
    }

    public final void a() {
        boolean z = androidx.recyclerview.widget.RecyclerView.I0;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f628a;
        if (z && recyclerView.v && recyclerView.u) {
            java.util.WeakHashMap weakHashMap = a.jq1.f264a;
            a.rp1.m(recyclerView, recyclerView.k);
        } else {
            recyclerView.C = true;
            recyclerView.requestLayout();
        }
    }
}
