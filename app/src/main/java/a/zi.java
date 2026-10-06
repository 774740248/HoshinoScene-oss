package a;

import android.content.Context;
/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class zi extends android.widget.BaseAdapter implements android.widget.Filterable {
    public static final /* synthetic */ int k = 0;
    public final android.content.Context c;
    public final java.util.List d;
    public final boolean e;
    public a.xz f;
    public java.util.ArrayList g;
    public final java.lang.Object h;
    public final java.util.ArrayList i;
    public a.bp0 j;

    public zi(android.content.Context context, java.util.List list, java.util.List list2, boolean z) {
        a.wv.w(list, "items");
        a.wv.w(list2, "selectedItems");
        this.c = context;
        this.d = list;
        this.e = z;
        this.g = new java.util.ArrayList(list);
        this.h = new java.lang.Object();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add((a.ng1) it.next());
        }
        this.i = arrayList;
        this.j = a.xi.f;
    }

    public final boolean[] a() {
        java.util.List list = this.d;
        java.util.ArrayList arrayList = new java.util.ArrayList(a.op.J1(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Boolean.valueOf(this.i.contains((a.ng1) it.next())));
        }
        return a.qv.u2(arrayList);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.g.size();
    }

    @Override // android.widget.Filterable
    public final android.widget.Filter getFilter() {
        if (this.f == null) {
            this.f = new a.xz(this);
        }
        a.xz xzVar = this.f;
        a.wv.s(xzVar);
        return xzVar;
    }

    @Override // android.widget.Adapter
    public final java.lang.Object getItem(int i) {
        java.lang.Object obj = this.g.get(i);
        a.wv.v(obj, "filterItems[position]");
        return (a.ng1) obj;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final android.view.View getView(int i, android.view.View view, android.view.ViewGroup viewGroup) {
        a.wv.w(viewGroup, "parent");
        if (view == null) {
            view = android.view.View.inflate(this.c, this.e ? 2131558582 : 2131558583, null);
        }
        a.wv.s(view);
        java.lang.Object obj = this.g.get(i);
        a.wv.v(obj, "filterItems[position]");
        a.ng1 ng1Var = (a.ng1) obj;
        a.yi yiVar = new a.yi((Context) this);
        yiVar.f711a = (android.widget.TextView) view.findViewById(2131361825);
        yiVar.b = (android.widget.TextView) view.findViewById(2131361806);
        yiVar.c = (android.widget.ImageView) view.findViewById(2131361811);
        yiVar.d = (android.widget.CompoundButton) view.findViewById(2131361801);
        view.setOnClickListener(new a.sg(this, ng1Var, yiVar, 2));
        android.widget.TextView textView = (android.widget.TextView) yiVar.f711a;
        if (textView != null) {
            textView.setText(ng1Var.f381a);
        }
        android.widget.TextView textView2 = (android.widget.TextView) yiVar.b;
        if (textView2 != null) {
            java.lang.CharSequence charSequence = ng1Var.b;
            if (charSequence == null || charSequence.length() == 0) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(ng1Var.b);
            }
        }
        android.widget.CompoundButton compoundButton = (android.widget.CompoundButton) yiVar.d;
        if (compoundButton != null) {
            compoundButton.setChecked(this.i.contains(ng1Var));
        }
        return view;
    }
}
