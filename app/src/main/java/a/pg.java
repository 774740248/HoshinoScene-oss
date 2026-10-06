package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class pg extends android.widget.BaseAdapter {
    public final android.content.Context c;
    public final java.util.ArrayList d;
    public java.lang.String e;
    public java.lang.String f;
    public java.util.ArrayList g;
    public final android.content.pm.PackageManager h;
    public a.mg i;

    public pg(android.content.Context context, java.util.ArrayList arrayList, java.lang.String str, java.lang.String str2) {
        a.wv.w(context, "context");
        this.c = context;
        this.d = arrayList;
        this.e = str;
        this.f = str2;
        this.h = context.getPackageManager();
        new java.util.HashMap();
        this.g = a(this.e, arrayList);
    }

    public final java.util.ArrayList a(java.lang.String str, java.util.ArrayList arrayList) {
        java.lang.Object obj;
        java.util.Locale locale = java.util.Locale.ENGLISH;
        java.lang.String k = a.ai1.k(locale, "ENGLISH", str, locale, "this as java.lang.String).toLowerCase(locale)");
        if (k.length() != 0) {
            a.e3 e3Var = new a.e3(this.c, 0);
            android.content.pm.ActivityInfo activityInfo = (android.content.pm.ActivityInfo) a.qv.g2(arrayList);
            java.lang.String str2 = activityInfo != null ? activityInfo.packageName : null;
            if (str2 == null) {
                str2 = "";
            }
            android.database.Cursor rawQuery = e3Var.getReadableDatabase().rawQuery("select name, package_name, exported, enabled, label from activities where package_name = ? and (name like ? or label like ?)", new java.lang.String[]{str2, a.ai1.h("%", k, "%"), a.ai1.h("%", k, "%")});
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            while (rawQuery.moveToNext()) {
                try {
                    arrayList2.add(new a.d3(rawQuery, 1));
                } catch (java.lang.Throwable th) {
                    rawQuery.close();
                    throw th;
                }
            }
            rawQuery.close();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj2 : arrayList) {
                android.content.pm.ActivityInfo activityInfo2 = (android.content.pm.ActivityInfo) obj2;
                java.util.Iterator it = arrayList2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (a.wv.e(((com.omarea.model.ActivityCacheInfo) obj).name, activityInfo2.name)) {
                        break;
                    }
                }
                if (obj != null) {
                    arrayList3.add(obj2);
                }
            }
            arrayList = arrayList3;
        }
        return new java.util.ArrayList(a.qv.s2(arrayList, new a.u61(2, this)));
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final android.content.pm.ActivityInfo getItem(int i) {
        java.util.ArrayList arrayList = this.g;
        a.wv.s(arrayList);
        java.lang.Object obj = arrayList.get(i);
        a.wv.v(obj, "list!![position]");
        return (android.content.pm.ActivityInfo) obj;
    }

    public final android.text.SpannableString c(java.lang.String str) {
        android.text.SpannableString spannableString = new android.text.SpannableString(str);
        if (this.e.length() == 0) {
            return spannableString;
        }
        java.util.Locale locale = java.util.Locale.ENGLISH;
        java.lang.String k = a.ai1.k(locale, "ENGLISH", str, locale, "this as java.lang.String).toLowerCase(locale)");
        java.lang.String lowerCase = this.e.toLowerCase(locale);
        a.wv.v(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        int m2 = a.yi1.m2(k, lowerCase, 0, false, 6);
        if (m2 < 0) {
            return spannableString;
        }
        spannableString.setSpan(new android.text.style.ForegroundColorSpan(android.graphics.Color.parseColor("#0094ff")), m2, this.e.length() + m2, 33);
        return spannableString;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        java.util.ArrayList arrayList = this.g;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, a.mg] */
    @Override // android.widget.Adapter
    public final android.view.View getView(int i, android.view.View view, android.view.ViewGroup viewGroup) {
        a.wv.w(viewGroup, "parent");
        android.content.Context context = viewGroup.getContext();
        if (view == null) {
            this.i = new a.mg();
            view = android.view.View.inflate(context, 2131558628, null);
            a.mg mgVar = this.i;
            if (mgVar != null) {
                a.wv.s(view);
                mgVar.c = (android.widget.TextView) view.findViewById(2131361825);
                mgVar.e = (android.widget.TextView) view.findViewById(2131361823);
                mgVar.d = (android.widget.ImageView) view.findViewById(2131361811);
                mgVar.b = view;
            }
            view.setTag(this.i);
        } else {
            a.mg tag = (mg) view.getTag();
            a.wv.t(tag, "null cannot be cast to non-null type com.omarea.ui.contents.AdapterActivities.ViewHolder");
            this.i = (a.mg) tag;
        }
        a.mg mgVar2 = this.i;
        if (mgVar2 != null) {
            android.content.pm.ActivityInfo item = getItem(i);
            java.lang.String obj = item.loadLabel(this.h).toString();
            android.view.View view2 = mgVar2.b;
            if (view2 == null) {
                a.wv.M1("currentView");
                throw null;
            }
            view2.setAlpha((item.exported && item.enabled) ? 1.0f : 0.3f);
            android.widget.TextView textView = mgVar2.c;
            if (textView != null) {
                textView.setText(c(obj));
            }
            android.widget.TextView textView2 = mgVar2.e;
            if (textView2 != null) {
                java.lang.String str = item.name;
                a.wv.v(str, "item.name");
                textView2.setText(c(str));
            }
            java.lang.String str2 = item.name;
            mgVar2.f349a = str2;
            a.ty tyVar = a.z80.b;
            a.og ogVar = new a.og(item, this, mgVar2, str2, null);
            int i2 = 2 & 1;
            a.ty tyVar2 = a.ob0.c;
            if (i2 != 0) {
                tyVar = tyVar2;
            }
            int i3 = (2 & 2) != 0 ? 1 : 0;
            a.ty W = a.wv.W(tyVar2, tyVar, true);
            a.u20 u20Var = a.z80.f728a;
            if (W != u20Var && W.g(a.gy.c) == null) {
                W = W.c(u20Var);
            }
            a.f av0Var = i3 == 2 ? new a.av0(W, ogVar) : new a.f(W, true);
            av0Var.S(i3, av0Var, ogVar);
        }
        return view;
    }
}
