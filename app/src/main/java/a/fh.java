package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class fh extends a.e91 implements a.dt0, android.widget.Filterable {
    public final android.content.Context f;
    public final java.util.ArrayList g;
    public final a.mo h;
    public a.ah i;
    public java.util.ArrayList j;
    public final java.lang.Object k;
    public boolean l;
    public a.bh m;
    public a.bh n;

    public fh(android.content.Context context, java.util.ArrayList arrayList) {
        a.wv.w(arrayList, "apps");
        this.f = context;
        this.g = arrayList;
        int i = 0;
        this.h = new a.mo(context, i, 6, i);
        this.j = arrayList;
        this.k = new java.lang.Object();
    }

    @Override // a.dt0
    public final void a(int i) {
        this.g.remove(i);
        this.c.f(i, 1);
    }

    @Override // a.dt0
    public final void b(int i, int i2) {
        try {
            if (i < c() && i2 < c()) {
                java.lang.Object remove = this.j.remove(i);
                a.wv.v(remove, "filterApps.removeAt(fromPosition)");
                this.j.add(i2, (com.omarea.model.AppInfo) remove);
                this.c.c(i, i2);
            }
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // a.e91
    public final int c() {
        return this.l ? this.g.size() : this.j.size() + 1;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [a.ah, android.widget.Filter] */
    @Override // android.widget.Filterable
    public final android.widget.Filter getFilter() {
        if (this.i == null) {
            a.ah filter = new a.ah();
            filter.f11a = this;
            filter.b = "";
            this.i = filter;
        }
        a.ah ahVar = this.i;
        a.wv.s(ahVar);
        return ahVar;
    }

    @Override // a.e91
    public final void i(a.da1 da1Var, int i) {
        a.ch chVar = (a.ch) da1Var;
        com.omarea.model.AppInfo p = p(i);
        java.lang.String packageName = p.getPackageName();
        chVar.u = packageName;
        android.widget.TextView textView = chVar.v;
        a.wv.s(textView);
        textView.setText(p.getAppName());
        android.widget.ImageView imageView = chVar.w;
        if (imageView != null) {
            java.lang.Boolean bool = p.enabled;
            a.wv.v(bool, "item.enabled");
            imageView.setAlpha((!bool.booleanValue() || p.suspended.booleanValue()) ? 0.3f : 1.0f);
        }
        int i2 = 0;
        if (a.wv.e(p.getPackageName(), "plus")) {
            android.widget.ImageView imageView2 = chVar.w;
            a.wv.s(imageView2);
            android.content.Context context = this.f;
            java.lang.Object obj = a.zx.f748a;
            imageView2.setImageDrawable(a.xx.b(context, 2131231028));
        } else {
            a.ty tyVar = a.z80.b;
            a.eh ehVar = new a.eh(this, p, chVar, chVar, packageName, null);
            if ((2 & 1) != 0) {
                tyVar = a.ob0.c;
            }
            int i3 = (2 & 2) != 0 ? 1 : 0;
            a.ty W = a.wv.W(a.ob0.c, tyVar, true);
            a.u20 u20Var = a.z80.f728a;
            if (W != u20Var && W.g(a.gy.c) == null) {
                W = W.c(u20Var);
            }
            a.f av0Var = i3 == 2 ? new a.av0(W, ehVar) : new a.f(W, true);
            av0Var.S(i3, av0Var, ehVar);
        }
        chVar.f91a.setOnClickListener(new a.yg(i, i2, this));
        chVar.f91a.setOnLongClickListener(new a.zg(this, i, i2));
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [a.da1, a.ch] */
    @Override // a.e91
    public final a.da1 k(androidx.recyclerview.widget.RecyclerView recyclerView, int i) {
        a.wv.w(recyclerView, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(this.f).inflate(2131558645, (android.view.ViewGroup) recyclerView, false);
        a.wv.v(inflate, "convertView");
        ch da1Var = new ch(inflate);
        da1Var.v = (android.widget.TextView) inflate.findViewById(2131361825);
        da1Var.w = (android.widget.ImageView) inflate.findViewById(2131361811);
        return da1Var;
    }

    public final com.omarea.model.AppInfo p(int i) {
        if (this.l) {
            java.lang.Object obj = this.g.get(i);
            a.wv.v(obj, "apps.get(position)");
            return (com.omarea.model.AppInfo) obj;
        }
        if (i < this.j.size()) {
            java.lang.Object obj2 = this.j.get(i);
            a.wv.v(obj2, "filterApps[position]");
            return (com.omarea.model.AppInfo) obj2;
        }
        com.omarea.model.AppInfo item = com.omarea.model.AppInfo.getItem();
        item.setPackageName("plus");
        java.lang.String string = this.f.getString(2131952350);
        a.wv.v(string, "context.getString(R.string.freezer_add)");
        item.setAppName(string);
        return item;
    }

    public final void q(boolean z) {
        a.ah ahVar;
        if (this.l != z) {
            this.l = z;
            if (!z && (ahVar = this.i) != null) {
                ahVar.filter(ahVar.b);
            }
            f();
        }
    }
}
