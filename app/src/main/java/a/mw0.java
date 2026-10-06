package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class mw0 extends android.widget.BaseAdapter {
    public final /* synthetic */ int c;
    public int d;
    public final /* synthetic */ java.lang.Object e;

    public mw0(a.nw0 nw0Var) {
        this.c = 0;
        this.e = nw0Var;
        this.d = -1;
        a();
    }

    public final void a() {
        java.lang.Object obj = this.e;
        a.xz0 xz0Var = ((a.nw0) obj).e.v;
        if (xz0Var != null) {
            a.pz0 pz0Var = ((a.nw0) obj).e;
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

    public final a.xz0 b(int i) {
        java.lang.Object obj = this.e;
        a.pz0 pz0Var = ((a.nw0) obj).e;
        pz0Var.i();
        java.util.ArrayList arrayList = pz0Var.j;
        ((a.nw0) obj).getClass();
        int i2 = this.d;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (a.xz0) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        int i = this.c;
        java.lang.Object obj = this.e;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.pz0 pz0Var = ((a.nw0) obj).e;
                pz0Var.i();
                int size = pz0Var.j.size();
                return this.d < 0 ? size : size - 1;
            default:
                return ((com.omarea.ui.SelectView) obj).e.size();
        }
    }

    @Override // android.widget.Adapter
    public final java.lang.Object getItem(int i) {
        switch (this.c) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                return b(i);
            default:
                return (a.mg1) ((com.omarea.ui.SelectView) this.e).e.get(i);
        }
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        switch (this.c) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                return i;
            default:
                return i;
        }
    }

    @Override // android.widget.Adapter
    public final android.view.View getView(int i, android.view.View view, android.view.ViewGroup viewGroup) {
        int i2 = this.c;
        java.lang.Object obj = this.e;
        android.view.View view2 = view;
        android.view.View view3 = view;
        switch (i2) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                if (view == null) {
                    view3 = ((a.nw0) obj).d.inflate(2131558416, viewGroup, false);
                }
                ((a.q01) view3).a(b(i));
                return view3;
            default:
                if (view == null) {
                    view2 = android.view.LayoutInflater.from(((com.omarea.ui.SelectView) obj).getContext()).inflate(2131558728, viewGroup, false);
                }
                com.omarea.ui.SelectView selectView = (com.omarea.ui.SelectView) obj;
                a.mg1 mg1Var = (a.mg1) selectView.e.get(i);
                boolean z = i == selectView.f;
                android.widget.TextView textView = (android.widget.TextView) view2.findViewById(2131363079);
                android.widget.ImageView imageView = (android.widget.ImageView) view2.findViewById(2131363078);
                java.lang.Object tag = view2.getTag();
                android.content.res.ColorStateList colorStateList = tag instanceof android.content.res.ColorStateList ? (android.content.res.ColorStateList) tag : null;
                if (colorStateList == null) {
                    colorStateList = textView.getTextColors();
                    view2.setTag(colorStateList);
                }
                textView.setText(mg1Var.f350a);
                if (z) {
                    colorStateList = android.content.res.ColorStateList.valueOf(this.d);
                }
                textView.setTextColor(colorStateList);
                imageView.setVisibility(z ? 0 : 4);
                return view2;
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        switch (this.c) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a();
                super.notifyDataSetChanged();
                return;
            default:
                super.notifyDataSetChanged();
                return;
        }
    }

    public mw0(com.omarea.ui.SelectView selectView) {
        this.c = 1;
        this.e = selectView;
        int i = com.omarea.ui.SelectView.k;
        android.util.TypedValue typedValue = new android.util.TypedValue();
        selectView.getContext().getTheme().resolveAttribute(2130968793, typedValue, true);
        this.d = typedValue.data;
    }
}
