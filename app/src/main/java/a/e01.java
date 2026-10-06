package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class e01 implements a.nh1, a.o01, android.widget.AdapterView.OnItemClickListener {
    public android.graphics.Rect c;

    public static int m(a.mz0 mz0Var, android.content.Context context, int i) {
        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = mz0Var.getCount();
        int i2 = 0;
        int i3 = 0;
        android.widget.FrameLayout frameLayout = null;
        android.view.View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = mz0Var.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new android.widget.FrameLayout(context);
            }
            view = mz0Var.getView(i4, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    public static boolean u(a.pz0 pz0Var) {
        int size = pz0Var.f.size();
        for (int i = 0; i < size; i++) {
            android.view.MenuItem item = pz0Var.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // a.o01
    public final void h(android.content.Context context, a.pz0 pz0Var) {
    }

    @Override // a.o01
    public final boolean i(a.xz0 xz0Var) {
        return false;
    }

    @Override // a.o01
    public final boolean j(a.xz0 xz0Var) {
        return false;
    }

    public abstract void l(a.pz0 pz0Var);

    public abstract void n(android.view.View view);

    public abstract void o(boolean z);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i, long j) {
        android.widget.ListAdapter listAdapter = (android.widget.ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof android.widget.HeaderViewListAdapter ? (a.mz0) ((android.widget.HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (a.mz0) listAdapter).c.q((android.view.MenuItem) listAdapter.getItem(i), this, (this instanceof a.kt) ^ true ? 0 : 4);
    }

    public abstract void p(int i);

    public abstract void q(int i);

    public abstract void r(android.widget.PopupWindow.OnDismissListener onDismissListener);

    public abstract void s(boolean z);

    public abstract void t(int i);
}
