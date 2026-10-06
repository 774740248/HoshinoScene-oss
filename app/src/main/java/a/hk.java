package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class hk extends a.e91 {
    public final android.content.Context f;
    public java.util.ArrayList g;
    public final a.bp0 h;

    public hk(android.content.Context context, a.b10 b10Var) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        a.wv.w(context, "context");
        this.f = context;
        this.g = arrayList;
        this.h = b10Var;
    }

    @Override // a.e91
    public final int c() {
        return this.g.size();
    }

    @Override // a.e91
    public final long d(int i) {
        return i;
    }

    @Override // a.e91
    public final void i(a.da1 da1Var, int i) {
        a.gk gkVar = (a.gk) da1Var;
        java.lang.Object obj = this.g.get(i);
        a.wv.v(obj, "list[position]");
        a.am1 am1Var = (a.am1) obj;
        double d = am1Var.f;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(d);
        gkVar.u.setText(sb.toString());
        int i2 = am1Var.f19a;
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(i2);
        gkVar.v.setText(sb2.toString());
        gkVar.w.setText(am1Var.c);
        java.lang.String str = am1Var.g;
        if (str == null) {
            a.wv.M1("comm");
            throw null;
        }
        gkVar.x.setText(str);
        gkVar.f91a.setOnClickListener(new a.wi(gkVar, 6, this));
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [a.da1, a.gk] */
    @Override // a.e91
    public final a.da1 k(androidx.recyclerview.widget.RecyclerView recyclerView, int i) {
        a.wv.w(recyclerView, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(this.f).inflate(2131558656, (android.view.ViewGroup) recyclerView, false);
        a.wv.v(inflate, "convertView");
        gk da1Var = new gk(inflate);
        android.view.View findViewById = inflate.findViewById(2131363283);
        a.wv.v(findViewById, "itemView.findViewById(R.id.thread_load)");
        da1Var.u = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = inflate.findViewById(2131363284);
        a.wv.v(findViewById2, "itemView.findViewById(R.id.thread_pid)");
        da1Var.v = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = inflate.findViewById(2131362670);
        a.wv.v(findViewById3, "itemView.findViewById(R.id.item_cpus)");
        da1Var.w = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = inflate.findViewById(2131362669);
        a.wv.v(findViewById4, "itemView.findViewById(R.id.item_comm)");
        da1Var.x = (android.widget.TextView) findViewById4;
        return da1Var;
    }
}
