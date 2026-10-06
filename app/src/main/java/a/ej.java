package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ej extends a.e91 implements android.widget.Filterable {
    public final android.content.Context f;
    public final java.util.ArrayList g;
    public final java.lang.String h;
    public java.util.ArrayList i;
    public final a.xz j;
    public a.cj k;

    public ej(android.content.Context context, java.util.ArrayList arrayList) {
        a.wv.w(context, "context");
        this.f = context;
        this.g = arrayList;
        this.h = "";
        this.i = arrayList;
        this.j = new a.xz(this);
    }

    @Override // a.e91
    public final int c() {
        return this.i.size();
    }

    @Override // a.e91
    public final long d(int i) {
        return i;
    }

    @Override // android.widget.Filterable
    public final android.widget.Filter getFilter() {
        return this.j;
    }

    @Override // a.e91
    public final void i(a.da1 da1Var, final int i) {
        java.lang.String id;
        a.dj djVar = (a.dj) da1Var;
        final android.widget.Button button = djVar.z;
        if (button != null) {
            button.setOnClickListener(new a.xh(this, button, i));
            button.setOnLongClickListener(new a.bj(button, i));
        }
        java.lang.Object obj = this.i.get(i);
        a.wv.v(obj, "result[position]");
        a.d11 d11Var = (a.d11) obj;
        java.lang.String name = d11Var.getName();
        if (name == null || name.length() == 0) {
            id = d11Var.getId();
        } else {
            id = d11Var.getName();
            a.wv.s(id);
        }
        android.view.View view = djVar.u;
        if (view != null) {
            view.setVisibility((a.wv.e(d11Var.getSource(), "official") || d11Var.getPraise() > 100) ? 0 : 8);
        }
        android.widget.TextView textView = djVar.v;
        if (textView != null) {
            textView.setText(p(id));
        }
        android.widget.TextView textView2 = djVar.w;
        if (textView2 != null) {
            java.lang.String description = d11Var.getDescription();
            if (description == null) {
                description = "";
            }
            textView2.setText(p(description));
        }
        android.widget.TextView textView3 = djVar.x;
        if (textView3 != null) {
            textView3.setText(a.ai1.i("Version: ", d11Var.getVersionName(), " (", d11Var.getVersionCode(), ")"));
        }
        android.widget.TextView textView4 = djVar.y;
        if (textView4 != null) {
            java.lang.String author = d11Var.getAuthor();
            textView4.setText("Author: " + ((java.lang.Object) p(author != null ? author : "")));
        }
        android.widget.Button button2 = djVar.z;
        if (button2 != null) {
            button2.setText((a.wv.e(d11Var.getSource(), "share") || (d11Var instanceof com.omarea.model.MagiskModuleUnofficial)) ? button2.getContext().getString(2131952140) : button2.getContext().getString(2131952205));
        }
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [a.da1, a.dj] */
    @Override // a.e91
    public final a.da1 k(androidx.recyclerview.widget.RecyclerView recyclerView, int i) {
        a.wv.w(recyclerView, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(this.f).inflate(2131558646, (android.view.ViewGroup) recyclerView, false);
        a.wv.v(inflate, "convertView");
        dj da1Var = new dj(inflate);
        da1Var.u = inflate.findViewById(2131361804);
        da1Var.v = (android.widget.TextView) inflate.findViewById(2131361825);
        da1Var.w = (android.widget.TextView) inflate.findViewById(2131361823);
        da1Var.x = (android.widget.TextView) inflate.findViewById(2131361828);
        da1Var.y = (android.widget.TextView) inflate.findViewById(2131361818);
        da1Var.z = (android.widget.Button) inflate.findViewById(2131362427);
        return da1Var;
    }

    public final android.text.SpannableString p(java.lang.String str) {
        android.text.SpannableString spannableString = new android.text.SpannableString(str);
        java.lang.String str2 = this.h;
        if (str2.length() == 0) {
            return spannableString;
        }
        java.util.Locale locale = java.util.Locale.getDefault();
        a.wv.v(locale, "getDefault()");
        java.lang.String lowerCase = str.toLowerCase(locale);
        a.wv.v(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        java.util.Locale locale2 = java.util.Locale.getDefault();
        a.wv.v(locale2, "getDefault()");
        java.lang.String lowerCase2 = str2.toLowerCase(locale2);
        a.wv.v(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
        int m2 = a.yi1.m2(lowerCase, lowerCase2, 0, false, 6);
        if (m2 < 0) {
            return spannableString;
        }
        spannableString.setSpan(new android.text.style.ForegroundColorSpan(android.graphics.Color.parseColor("#0094ff")), m2, str2.length() + m2, 33);
        return spannableString;
    }
}
