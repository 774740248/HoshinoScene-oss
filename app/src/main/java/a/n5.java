package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class n5 implements android.view.ViewGroup.OnHierarchyChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a.p5 f372a;
    public final /* synthetic */ android.view.View b;

    public n5(a.p5 p5Var, android.view.View view) {
        this.f372a = p5Var;
        this.b = view;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(android.view.View view, android.view.View view2) {
        a.p5.access$refreshScrollableInsets(this.f372a, this.b);
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(android.view.View view, android.view.View view2) {
    }
}
