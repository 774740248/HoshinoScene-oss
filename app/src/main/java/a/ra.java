package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ra implements a.bh {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.omarea.ui.BlurViewRecyclerView f489a;
    public final /* synthetic */ a.at0 b;
    public final /* synthetic */ a.fh c;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityFreezeApps d;

    public ra(com.omarea.ui.BlurViewRecyclerView blurViewRecyclerView, a.th1 th1Var, a.fh fhVar, com.omarea.vtools.activities.ActivityFreezeApps activityFreezeApps) {
        this.f489a = blurViewRecyclerView;
        this.b = th1Var;
        this.c = fhVar;
        this.d = activityFreezeApps;
    }

    @Override // a.bh
    public final void a(android.view.View view, int i) {
        a.wv.w(view, "view");
        a.q10 q10Var = a.q10.f457a;
        if (a.wv.e(a.q10.t(), "basic")) {
            android.widget.Toast.makeText(this.f489a.getContext(), 2131953083, 0).show();
            return;
        }
        a.th1 th1Var = (a.th1) this.b;
        a.sh1 sh1Var = th1Var.e;
        if (sh1Var != null ? sh1Var.a() : th1Var.f) {
            return;
        }
        this.d.showOptions(this.c.p(i));
    }
}
