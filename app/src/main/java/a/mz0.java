package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class mz0 extends android.widget.BaseAdapter {
    public final a.pz0 c;
    public int d = -1;
    public boolean e;
    public final boolean f;
    public final android.view.LayoutInflater g;
    public final int h;

    public mz0(a.pz0 pz0Var, android.view.LayoutInflater layoutInflater, boolean z, int i) {
        this.f = z;
        this.g = layoutInflater;
        this.c = pz0Var;
        this.h = i;
        a();
    }

    public final void a() {
        a.pz0 pz0Var = this.c;
        a.xz0 xz0Var = pz0Var.v;
        if (xz0Var != null) {
            pz0Var.i();
            java.util.ArrayList arrayList = pz0Var.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((a.xz0) arrayList.get(i)) == xz0Var) {
                    this.d = i;
                    return;
                }
            }
        }
        this.d = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final a.xz0 getItem(int i) {
        java.util.ArrayList l;
        boolean z = this.f;
        a.pz0 pz0Var = this.c;
        if (z) {
            pz0Var.i();
            l = pz0Var.j;
        } else {
            l = pz0Var.l();
        }
        int i2 = this.d;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (a.xz0) l.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        java.util.ArrayList l;
        boolean z = this.f;
        a.pz0 pz0Var = this.c;
        if (z) {
            pz0Var.i();
            l = pz0Var.j;
        } else {
            l = pz0Var.l();
        }
        return this.d < 0 ? l.size() : l.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final android.view.View getView(int i, android.view.View view, android.view.ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.g.inflate(this.h, viewGroup, false);
        }
        int i2 = getItem(i).b;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).b : i2;
        androidx.appcompat.view.menu.ListMenuItemView listMenuItemView = (androidx.appcompat.view.menu.ListMenuItemView) view;
        if (this.c.m() && i2 != i4) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        a.q01 q01Var = (a.q01) view;
        if (this.e) {
            listMenuItemView.setForceShowIcon(true);
        }
        q01Var.a(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
