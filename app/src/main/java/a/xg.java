package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class xg extends android.widget.BaseAdapter implements android.widget.Filterable {
    public static final /* synthetic */ int l = 0;
    public final android.content.Context c;
    public final java.util.ArrayList d;
    public final boolean e;
    public a.y30 f;
    public a.xz g;
    public java.util.ArrayList h;
    public final java.lang.Object i = new java.lang.Object();
    public final a.ay j = a.wv.b(new a.qt0(null).c(a.z80.b));
    public final android.util.LruCache k = new android.util.LruCache(100);

    public xg(android.content.Context context, java.util.ArrayList arrayList, boolean z) {
        this.c = context;
        this.d = arrayList;
        this.e = z;
        this.h = arrayList;
        java.util.ArrayList arrayList2 = this.h;
        if (arrayList2.size() > 1) {
            a.ov.Z1(arrayList2, new a.py(6));
        }
    }

    public final java.util.ArrayList a() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : this.d) {
            if (((a.tg) obj).getSelected()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.h.size();
    }

    @Override // android.widget.Filterable
    public final android.widget.Filter getFilter() {
        if (this.g == null) {
            this.g = new a.xz(this);
        }
        a.xz xzVar = this.g;
        a.wv.s(xzVar);
        return xzVar;
    }

    @Override // android.widget.Adapter
    public final java.lang.Object getItem(int i) {
        java.lang.Object obj = this.h.get(i);
        a.wv.v(obj, "filterApps[position]");
        return (a.tg) obj;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        java.lang.Object r3 = null;
        a.wv.v(this.h.get(i), "filterApps[position]");
        return ((a.tg) r3).getPackageName().hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v3, types: [a.ug, java.lang.Object] */
    @Override // android.widget.Adapter
    public final android.view.View getView(int i, android.view.View view, android.view.ViewGroup viewGroup) {
        a.ug ugVar;
        a.wv.w(viewGroup, "parent");
        int i2 = 0;
        android.view.View view2 = view;
        if (view == null) {
            view2 = android.view.LayoutInflater.from(this.c).inflate(this.e ? 2131558476 : 2131558477, viewGroup, false);
        }
        a.wv.s(view2);
        a.ug obj = (ug) this.h.get(i);
        a.wv.v(obj, "filterApps[position]");
        a.tg tgVar = (a.tg) obj;
        if (view2.getTag() != null) {
            a.ug tag = (ug) view2.getTag();
            a.wv.t(tag, "null cannot be cast to non-null type com.omarea.common.ui.AdapterAppChooser.ViewHolder");
            ugVar = (a.ug) tag;
        } else {
            a.ug obj2 = new a.ug();
            obj2.f592a = (android.widget.TextView) view2.findViewById(2131361825);
            obj2.b = (android.widget.TextView) view2.findViewById(2131361806);
            obj2.c = (android.widget.ImageView) view2.findViewById(2131361811);
            obj2.d = (android.widget.CompoundButton) view2.findViewById(2131361801);
            view2.setTag(obj2);
            ugVar = obj2;
        }
        java.lang.String packageName = tgVar.getPackageName();
        view2.setOnClickListener(new a.sg(this, tgVar, ugVar, i2));
        android.widget.TextView textView = ugVar.f592a;
        if (textView != null) {
            textView.setText(tgVar.getAppName());
        }
        android.widget.TextView textView2 = ugVar.b;
        if (textView2 != null) {
            textView2.setText(tgVar.getPackageName());
        }
        android.widget.CompoundButton compoundButton = ugVar.d;
        if (compoundButton != null) {
            compoundButton.setChecked(tgVar.getSelected());
        }
        android.widget.ImageView imageView = ugVar.c;
        a.wv.s(imageView);
        imageView.setTag(packageName);
        a.wv.M0(this.j, null, new a.wg(this, tgVar, imageView, packageName, null), 3);
        return view2;
    }
}
