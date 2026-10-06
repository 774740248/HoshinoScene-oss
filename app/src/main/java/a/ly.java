package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ly implements android.view.ViewGroup.OnHierarchyChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.coordinatorlayout.widget.CoordinatorLayout f334a;

    public ly(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout) {
        this.f334a = coordinatorLayout;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(android.view.View view, android.view.View view2) {
        android.view.ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f334a.s;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(android.view.View view, android.view.View view2) {
        androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout = this.f334a;
        coordinatorLayout.onChildViewsChanged(2);
        android.view.ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = coordinatorLayout.mOnHierarchyChangeListener;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
