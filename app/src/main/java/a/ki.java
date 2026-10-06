package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ki extends android.widget.BaseAdapter {
    public final android.content.Context c;
    public final java.util.ArrayList d;
    public final java.lang.String e;
    public java.lang.String f;
    public final java.lang.String g;
    public java.util.ArrayList h;
    public final android.content.pm.PackageManager i;
    public a.hi j;

    public ki(android.content.Context context, java.util.ArrayList arrayList, java.lang.String str, java.lang.String str2) {
        a.wv.w(context, "context");
        this.c = context;
        this.d = arrayList;
        this.e = str;
        this.f = str2;
        this.g = "";
        this.i = context.getPackageManager();
        new java.util.HashMap();
        this.h = a(this.f, arrayList);
    }

    public final java.util.ArrayList a(java.lang.String str, java.util.ArrayList arrayList) {
        java.lang.Object obj;
        java.util.Locale locale = java.util.Locale.ENGLISH;
        java.lang.String k = a.ai1.k(locale, "ENGLISH", str, locale, "this as java.lang.String).toLowerCase(locale)");
        int i = 3;
        if (k.length() != 0) {
            a.e3 e3Var = new a.e3(this.c, 0);
            android.content.pm.ComponentInfo componentInfo = (android.content.pm.ComponentInfo) a.qv.g2(arrayList);
            java.lang.String str2 = componentInfo != null ? componentInfo.packageName : null;
            if (str2 == null) {
                str2 = "";
            }
            android.database.Cursor rawQuery = e3Var.getReadableDatabase().rawQuery(a.ai1.h("select name, package_name, exported, enabled from ", a.e3.a(this.e), " where package_name = ? and name like ?"), new java.lang.String[]{str2, a.ai1.h("%", k, "%")});
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            while (rawQuery.moveToNext()) {
                try {
                    arrayList2.add(new a.d3(rawQuery, 3));
                } catch (java.lang.Exception unused) {
                } catch (java.lang.Throwable th) {
                    rawQuery.close();
                    throw th;
                }
            }
            rawQuery.close();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj2 : arrayList) {
                android.content.pm.ComponentInfo componentInfo2 = (android.content.pm.ComponentInfo) obj2;
                java.util.Iterator it = arrayList2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (a.wv.e(((com.omarea.model.ActivityCacheInfo) obj).name, componentInfo2.name)) {
                        break;
                    }
                }
                if (obj != null) {
                    arrayList3.add(obj2);
                }
            }
            arrayList = arrayList3;
        }
        return new java.util.ArrayList(a.qv.s2(arrayList, new a.u61(i, this)));
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final android.content.pm.ComponentInfo getItem(int i) {
        java.util.ArrayList arrayList = this.h;
        a.wv.s(arrayList);
        java.lang.Object obj = arrayList.get(i);
        a.wv.v(obj, "list!![position]");
        return (android.content.pm.ComponentInfo) obj;
    }

    public final android.text.SpannableString c(java.lang.String str) {
        android.text.SpannableString spannableString = new android.text.SpannableString(str);
        if (this.f.length() == 0) {
            return spannableString;
        }
        java.util.Locale locale = java.util.Locale.ENGLISH;
        java.lang.String k = a.ai1.k(locale, "ENGLISH", str, locale, "this as java.lang.String).toLowerCase(locale)");
        java.lang.String lowerCase = this.f.toLowerCase(locale);
        a.wv.v(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        int m2 = a.yi1.m2(k, lowerCase, 0, false, 6);
        if (m2 < 0) {
            return spannableString;
        }
        spannableString.setSpan(new android.text.style.ForegroundColorSpan(android.graphics.Color.parseColor("#0094ff")), m2, this.f.length() + m2, 33);
        return spannableString;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        java.util.ArrayList arrayList = this.h;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    /* JADX WARN: Type inference failed for: r11v2, types: [a.hi, java.lang.Object] */
    @Override // android.widget.Adapter
    public final android.view.View getView(int i, android.view.View view, android.view.ViewGroup viewGroup) {
        a.wv.w(viewGroup, "parent");
        android.content.Context context = viewGroup.getContext();
        if (view == null) {
            this.j = new a.hi();
            view = android.view.View.inflate(context, 2131558630, null);
            a.hi hiVar = this.j;
            if (hiVar != null) {
                a.wv.s(view);
                hiVar.c = (android.widget.TextView) view.findViewById(2131361825);
                hiVar.e = (android.widget.TextView) view.findViewById(2131361823);
                hiVar.d = (android.widget.ImageView) view.findViewById(2131361811);
                hiVar.f = (android.widget.CompoundButton) view.findViewById(2131361822);
                hiVar.b = view;
            }
            view.setTag(this.j);
        } else {
            a.hi tag = (hi) view.getTag();
            a.wv.t(tag, "null cannot be cast to non-null type com.omarea.ui.contents.AdapterComponents.ViewHolder");
            this.j = (a.hi) tag;
        }
        a.hi hiVar2 = this.j;
        if (hiVar2 != null) {
            android.content.pm.ComponentInfo item = getItem(i);
            android.content.pm.PackageManager packageManager = this.i;
            java.lang.String obj = item.loadLabel(packageManager).toString();
            int componentEnabledSetting = packageManager.getComponentEnabledSetting(new android.content.ComponentName(item.packageName, item.name));
            boolean z = componentEnabledSetting == 0 || componentEnabledSetting == 1;
            android.view.View view2 = hiVar2.b;
            if (view2 == null) {
                a.wv.M1("currentView");
                throw null;
            }
            view2.setAlpha((!(item.exported && z) && a.wv.e(this.e, "activity")) ? 0.3f : 1.0f);
            android.widget.TextView textView = hiVar2.c;
            if (textView != null) {
                textView.setText(c(obj));
            }
            android.widget.TextView textView2 = hiVar2.e;
            if (textView2 != null) {
                java.lang.String str = item.name;
                a.wv.v(str, "item.name");
                textView2.setText(c(str));
            }
            android.widget.CompoundButton compoundButton = hiVar2.f;
            if (compoundButton != null) {
                compoundButton.setChecked(z);
            }
            java.lang.String str2 = item.name;
            hiVar2.f205a = str2;
            a.ty tyVar = a.z80.b;
            a.ji jiVar = new a.ji(item, this, hiVar2, str2, null);
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
            a.f av0Var = i3 == 2 ? new a.av0(W, jiVar) : new a.f(W, true);
            av0Var.S(i3, av0Var, jiVar);
        }
        return view;
    }
}
