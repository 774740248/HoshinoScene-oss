package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class gi extends a.e91 {
    public final android.content.Context f;
    public final java.util.ArrayList g;
    public a.ei h;
    public a.ei i;

    public gi(android.content.Context context, java.util.ArrayList arrayList) {
        a.wv.w(context, "context");
        this.f = context;
        this.g = arrayList;
    }

    @Override // a.e91
    public final int c() {
        return this.g.size();
    }

    @Override // a.e91
    public final void i(a.da1 da1Var, int i) {
        a.fi fiVar = (a.fi) da1Var;
        java.lang.Object obj = this.g.get(i);
        a.wv.v(obj, "items[position]");
        a.s10 s10Var = (a.s10) obj;
        android.widget.TextView textView = fiVar.u;
        a.wv.s(textView);
        textView.setText(s10Var.c);
        android.widget.TextView textView2 = fiVar.v;
        a.wv.s(textView2);
        textView2.setText(s10Var.d);
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [a.da1, a.fi] */
    @Override // a.e91
    public final a.da1 k(androidx.recyclerview.widget.RecyclerView recyclerView, int i) {
        a.wv.w(recyclerView, "parent");
        final int i2 = 0;
        android.view.View inflate = android.view.LayoutInflater.from(this.f).inflate(2131558639, (android.view.ViewGroup) recyclerView, false);
        a.wv.v(inflate, "convertView");
        final a.da1 da1Var = new a.da1(inflate);
        da1Var.u = (android.widget.TextView) inflate.findViewById(2131361825);
        da1Var.v = (android.widget.TextView) inflate.findViewById(2131361823);
        android.view.View findViewById = inflate.findViewById(2131361914);
        if (findViewById != null) {
            findViewById.setOnClickListener(new a.di(this));
        }
        final int i3 = 1;
        inflate.setOnClickListener(new a.di(this));
        return da1Var;
    }
}
