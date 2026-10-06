package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class rg extends android.widget.BaseAdapter {
    public static final /* synthetic */ int h = 0;
    public final java.lang.String c;
    public final java.util.ArrayList d;
    public final a.mo e;
    public final java.util.HashMap f;
    public a.qg g;

    public rg(android.content.Context context, java.util.ArrayList arrayList, java.lang.String str) {
        a.wv.w(context, "context");
        a.wv.w(str, "keywords");
        this.c = str;
        this.e = new a.mo(context, 256, 4, 0);
        this.f = new java.util.HashMap();
        a.ov.Z1(arrayList, new a.oi0(1));
        this.d = arrayList;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.f.put(java.lang.Integer.valueOf(i), java.lang.Boolean.valueOf(((com.omarea.model.AppInfo) this.d.get(i)).stateTags != null && ((com.omarea.model.AppInfo) this.d.get(i)).getSelected()));
        }
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final com.omarea.model.AppInfo getItem(int i) {
        java.util.ArrayList arrayList = this.d;
        a.wv.s(arrayList);
        java.lang.Object obj = arrayList.get(i);
        a.wv.v(obj, "list!![position]");
        return (com.omarea.model.AppInfo) obj;
    }

    public final android.text.SpannableString b(java.lang.String str) {
        android.text.SpannableString spannableString = new android.text.SpannableString(str);
        java.lang.String str2 = this.c;
        if (str2.length() == 0) {
            return spannableString;
        }
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.String lowerCase = str.toLowerCase(locale);
        a.wv.v(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        java.lang.String lowerCase2 = str2.toLowerCase(locale);
        a.wv.v(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        int m2 = a.yi1.m2(lowerCase, lowerCase2, 0, false, 6);
        if (m2 < 0) {
            return spannableString;
        }
        spannableString.setSpan(new android.text.style.ForegroundColorSpan(android.graphics.Color.parseColor("#0094ff")), m2, str2.length() + m2, 33);
        return spannableString;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        java.util.ArrayList arrayList = this.d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, a.qg] */
    @Override // android.widget.Adapter
    public final android.view.View getView(int i, android.view.View view, android.view.ViewGroup viewGroup) {
        a.wv.w(viewGroup, "parent");
        android.content.Context context = viewGroup.getContext();
        if (view == null) {
            this.g = new a.qg();
            view = android.view.View.inflate(context, 2131558628, null);
            a.qg qgVar = this.g;
            if (qgVar != null) {
                a.wv.s(view);
                qgVar.f467a = (android.widget.TextView) view.findViewById(2131361825);
                qgVar.c = (android.widget.TextView) view.findViewById(2131361823);
                qgVar.b = (android.widget.ImageView) view.findViewById(2131361811);
            }
            view.setTag(this.g);
        } else {
            a.qg tag = (qg) view.getTag();
            a.wv.t(tag, "null cannot be cast to non-null type com.omarea.ui.apps.AdapterAppBasic.ViewHolder");
            this.g = (a.qg) tag;
        }
        a.qg qgVar2 = this.g;
        if (qgVar2 != null) {
            com.omarea.model.AppInfo item = getItem(i);
            android.widget.TextView textView = qgVar2.f467a;
            if (textView != null) {
                textView.setText(b(item.getAppName()));
            }
            android.widget.TextView textView2 = qgVar2.c;
            if (textView2 != null) {
                textView2.setText(b(item.getPackageName()));
            }
            android.graphics.drawable.Drawable L1 = this.e.L1(item);
            android.widget.ImageView imageView = qgVar2.b;
            a.wv.s(imageView);
            if (L1 != null) {
                imageView.setImageDrawable(L1);
            }
        }
        return view;
    }
}
