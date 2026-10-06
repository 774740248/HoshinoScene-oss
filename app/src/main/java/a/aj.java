package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class aj extends android.widget.BaseAdapter implements android.widget.Filterable {
    public static final /* synthetic */ int l = 0;
    public final android.content.Context c;
    public final java.util.ArrayList d;
    public final boolean e;
    public a.z60 f;
    public a.xz g;
    public java.util.ArrayList h;
    public final java.lang.Object i = new java.lang.Object();
    public a.bp0 j = a.xi.e;
    public a.bp0 k;

    public aj(android.content.Context context, java.util.ArrayList arrayList, boolean z) {
        this.c = context;
        this.d = arrayList;
        this.e = z;
        this.h = arrayList;
    }

    public final java.util.ArrayList a() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : this.d) {
            if (((a.ng1) obj).d) {
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
        a.wv.v(obj, "filterItems[position]");
        return (a.ng1) obj;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [a.mm, java.lang.Object] */
    @Override // android.widget.Adapter
    public final android.view.View getView(int i, android.view.View view, android.view.ViewGroup viewGroup) {
        a.wv.w(viewGroup, "parent");
        if (view == null) {
            view = android.view.View.inflate(this.c, this.e ? 2131558582 : 2131558583, null);
        }
        a.wv.s(view);
        a.mm obj = (mm) this.h.get(i);
        a.wv.v(obj, "filterItems[position]");
        a.ng1 ng1Var = (a.ng1) obj;
        a.mm obj2 = new a.mm();
        obj2.f = this;
        obj2.f356a = (android.widget.TextView) view.findViewById(2131361825);
        obj2.b = (android.widget.TextView) view.findViewById(2131361806);
        obj2.c = (android.widget.ImageView) view.findViewById(2131361811);
        obj2.d = (android.widget.CompoundButton) view.findViewById(2131361801);
        obj2.e = view.findViewById(2131361805);
        view.setOnClickListener(new a.sg(this, ng1Var, obj2, 1));
        android.widget.TextView textView = (android.widget.TextView) obj2.f356a;
        if (textView != null) {
            textView.setText(ng1Var.f381a);
        }
        android.widget.TextView textView2 = (android.widget.TextView) obj2.b;
        if (textView2 != null) {
            java.lang.CharSequence charSequence = ng1Var.b;
            if (charSequence == null || charSequence.length() == 0) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(ng1Var.b);
            }
        }
        android.widget.CompoundButton compoundButton = (android.widget.CompoundButton) obj2.d;
        if (compoundButton != null) {
            compoundButton.setChecked(ng1Var.d);
        }
        android.view.View view2 = (android.view.View) obj2.e;
        if (view2 != null) {
            view2.setOnClickListener(new a.wi(this, 0, ng1Var));
            view2.setVisibility(this.k != null ? 0 : 8);
        }
        return view;
    }
}
