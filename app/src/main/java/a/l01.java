package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class l01 extends a.y90 {
    public final int o;
    public final int p;
    public a.wz0 q;
    public a.xz0 r;

    public l01(android.content.Context context, boolean z) {
        super(context, z);
        if (1 == a.k01.a(context.getResources().getConfiguration())) {
            this.o = 21;
            this.p = 22;
        } else {
            this.o = 22;
            this.p = 21;
        }
    }

    @Override // a.y90, android.view.View
    public final boolean onHoverEvent(android.view.MotionEvent motionEvent) {
        a.mz0 mz0Var;
        int i;
        int pointToPosition;
        int i2;
        if (this.q != null) {
            android.widget.ListAdapter adapter = getAdapter();
            if (adapter instanceof android.widget.HeaderViewListAdapter) {
                android.widget.HeaderViewListAdapter headerViewListAdapter = (android.widget.HeaderViewListAdapter) adapter;
                i = headerViewListAdapter.getHeadersCount();
                mz0Var = (a.mz0) headerViewListAdapter.getWrappedAdapter();
            } else {
                mz0Var = (a.mz0) adapter;
                i = 0;
            }
            a.xz0 item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i2 = pointToPosition - i) < 0 || i2 >= mz0Var.getCount()) ? null : mz0Var.getItem(i2);
            a.xz0 xz0Var = this.r;
            if (xz0Var != item) {
                a.pz0 pz0Var = mz0Var.c;
                if (xz0Var != null) {
                    this.q.q(pz0Var, xz0Var);
                }
                this.r = item;
                if (item != null) {
                    this.q.h(pz0Var, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, android.view.KeyEvent keyEvent) {
        androidx.appcompat.view.menu.ListMenuItemView listMenuItemView = (androidx.appcompat.view.menu.ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.o) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.p) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        android.widget.ListAdapter adapter = getAdapter();
        (adapter instanceof android.widget.HeaderViewListAdapter ? (a.mz0) ((android.widget.HeaderViewListAdapter) adapter).getWrappedAdapter() : (a.mz0) adapter).c.c(false);
        return true;
    }

    public void setHoverListener(a.wz0 wz0Var) {
        this.q = wz0Var;
    }

    @Override // a.y90, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(android.graphics.drawable.Drawable drawable) {
        super.setSelector(drawable);
    }
}
