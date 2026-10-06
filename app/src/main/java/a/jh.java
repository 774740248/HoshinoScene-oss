package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class jh extends a.e91 implements a.dt0 {
    public final android.content.Context f;
    public final java.util.ArrayList g;
    public final a.mo h;
    public final java.util.ArrayList i;
    public final android.graphics.drawable.Drawable j;
    public boolean k;
    public java.lang.String l;
    public final a.rx0 m;
    public a.ba n;

    public jh(android.content.Context context, java.util.ArrayList arrayList) {
        a.wv.w(context, "context");
        this.f = context;
        this.g = arrayList;
        this.h = new a.mo(context, 0, 6, 0);
        this.i = arrayList;
        java.lang.Object obj = a.zx.f748a;
        this.j = a.xx.b(context, 2131231235);
        android.graphics.ColorMatrix colorMatrix = new android.graphics.ColorMatrix();
        colorMatrix.setSaturation(0.05f);
        new android.graphics.ColorMatrixColorFilter(colorMatrix);
        this.l = "android";
        this.m = new a.rx0(context, false, 6);
    }

    @Override // a.dt0
    public final void a(int i) {
        this.g.remove(i);
        this.c.f(i, 1);
    }

    @Override // a.dt0
    public final void b(int i, int i2) {
        java.util.ArrayList arrayList = this.g;
        java.lang.Object remove = arrayList.remove(i);
        a.wv.v(remove, "apps.removeAt(fromPosition)");
        arrayList.add(i2, (com.omarea.model.AppInfo) remove);
        this.c.c(i, i2);
    }

    @Override // a.e91
    public final int c() {
        return this.g.size();
    }

    @Override // a.e91
    public final void i(a.da1 da1Var, int i) {
        a.gh ghVar = (a.gh) da1Var;
        com.omarea.model.AppInfo p = p(i);
        java.lang.String packageName = p.getPackageName();
        ghVar.u = packageName;
        android.widget.ImageView imageView = ghVar.v;
        if (imageView != null) {
            if (a.wv.e(p.getPackageName(), this.l) || this.k) {
                imageView.setAlpha(1.0f);
            } else {
                imageView.setAlpha(0.2f);
            }
        }
        int i2 = 1;
        if (a.wv.e(p.getPackageName(), "plus")) {
            android.widget.ImageView imageView2 = ghVar.v;
            a.wv.s(imageView2);
            android.content.Context context = this.f;
            java.lang.Object obj = a.zx.f748a;
            imageView2.setImageDrawable(a.xx.b(context, 2131231028));
        } else {
            android.widget.ImageView imageView3 = ghVar.v;
            a.wv.s(imageView3);
            a.ty tyVar = a.z80.b;
            a.ih ihVar = new a.ih(this, p, packageName, ghVar, imageView3, null);
            if ((2 & 1) != 0) {
                tyVar = a.ob0.c;
            }
            int i3 = (2 & 2) != 0 ? 1 : 0;
            a.ty W = a.wv.W(a.ob0.c, tyVar, true);
            a.u20 u20Var = a.z80.f728a;
            if (W != u20Var && W.g(a.gy.c) == null) {
                W = W.c(u20Var);
            }
            a.f av0Var = i3 == 2 ? new a.av0(W, ihVar) : new a.f(W, true);
            av0Var.S(i3, av0Var, ihVar);
        }
        ghVar.f91a.setOnClickListener(new a.yg(i, i2, this));
        ghVar.f91a.setOnLongClickListener(new a.zg(this, i, 1));
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [a.gh, a.da1] */
    @Override // a.e91
    public final a.da1 k(androidx.recyclerview.widget.RecyclerView recyclerView, int i) {
        a.wv.w(recyclerView, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(this.f).inflate(2131558634, (android.view.ViewGroup) recyclerView, false);
        a.wv.v(inflate, "convertView");
        a.gh da1Var = (gh) new a.da1(inflate);
        da1Var.v = (android.widget.ImageView) inflate.findViewById(2131361811);
        return da1Var;
    }

    public final com.omarea.model.AppInfo p(int i) {
        java.util.ArrayList arrayList = this.i;
        if (i < arrayList.size()) {
            java.lang.Object obj = arrayList.get(i);
            a.wv.v(obj, "filterApps[position]");
            return (com.omarea.model.AppInfo) obj;
        }
        com.omarea.model.AppInfo item = com.omarea.model.AppInfo.getItem();
        item.setPackageName("plus");
        java.lang.String string = this.f.getString(2131952350);
        a.wv.v(string, "context.getString(R.string.freezer_add)");
        item.setAppName(string);
        return item;
    }
}
