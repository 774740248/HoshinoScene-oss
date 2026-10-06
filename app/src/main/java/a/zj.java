package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class zj extends android.widget.BaseAdapter {
    public final android.content.Context c;
    public final java.lang.String d;
    public final a.mo e;
    public final java.util.ArrayList f;
    public final java.util.HashMap g;

    public zj(com.omarea.vtools.activities.ActivityAppConfig2 activityAppConfig2, java.util.ArrayList arrayList, java.lang.String str) {
        this.c = activityAppConfig2;
        this.d = str;
        this.e = new a.mo(activityAppConfig2, 300, 4, 0);
        java.util.Locale locale = java.util.Locale.getDefault();
        a.wv.v(locale, "getDefault()");
        java.lang.String lowerCase = "".toLowerCase(locale);
        a.wv.v(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        if (lowerCase.length() != 0) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : arrayList) {
                com.omarea.model.AppInfo appInfo = (com.omarea.model.AppInfo) obj;
                java.lang.String packageName = appInfo.getPackageName();
                java.util.Locale locale2 = java.util.Locale.getDefault();
                a.wv.v(locale2, "getDefault()");
                java.lang.String lowerCase2 = packageName.toLowerCase(locale2);
                a.wv.v(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                if (!a.yi1.g2(lowerCase2, lowerCase)) {
                    java.lang.String appName = appInfo.getAppName();
                    java.util.Locale locale3 = java.util.Locale.getDefault();
                    a.wv.v(locale3, "getDefault()");
                    java.lang.String lowerCase3 = appName.toLowerCase(locale3);
                    a.wv.v(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
                    if (!a.yi1.g2(lowerCase3, lowerCase)) {
                        java.lang.String obj2 = appInfo.path.toString();
                        java.util.Locale locale4 = java.util.Locale.getDefault();
                        a.wv.v(locale4, "getDefault()");
                        java.lang.String lowerCase4 = obj2.toLowerCase(locale4);
                        a.wv.v(lowerCase4, "this as java.lang.String).toLowerCase(locale)");
                        if (a.yi1.g2(lowerCase4, lowerCase)) {
                        }
                    }
                }
                arrayList2.add(obj);
            }
            arrayList = new java.util.ArrayList(arrayList2);
        }
        this.f = arrayList;
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String str2 = a.b11.i;
        android.content.Context context = this.c;
        hashMap.put(str2, java.lang.Integer.valueOf(context.getResources().getColor(2131099726, context.getTheme())));
        java.lang.String str3 = a.b11.l;
        android.content.Context context2 = this.c;
        hashMap.put(str3, java.lang.Integer.valueOf(context2.getResources().getColor(2131099707, context2.getTheme())));
        java.lang.String str4 = a.b11.j;
        android.content.Context context3 = this.c;
        hashMap.put(str4, java.lang.Integer.valueOf(context3.getResources().getColor(2131099723, context3.getTheme())));
        java.lang.String str5 = a.b11.k;
        android.content.Context context4 = this.c;
        hashMap.put(str5, java.lang.Integer.valueOf(context4.getResources().getColor(2131099710, context4.getTheme())));
        hashMap.put(a.b11.o, -7829368);
        this.g = hashMap;
    }

    public final void a(android.view.View view, int i) {
        int i2;
        java.util.ArrayList arrayList = this.f;
        a.wv.s(arrayList);
        java.lang.Object obj = arrayList.get(i);
        a.wv.v(obj, "list!![position]");
        com.omarea.model.AppInfo appInfo = (com.omarea.model.AppInfo) obj;
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(2131361825);
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(2131361821);
        android.widget.TextView textView3 = (android.widget.TextView) view.findViewById(2131361806);
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(2131361811);
        if (textView != null) {
            textView.setText(appInfo.getAppName());
        }
        a.wv.s(imageView);
        imageView.setTag(java.lang.Integer.valueOf(i));
        a.wv.M0(a.wv.b(a.z80.b), null, new a.yj(this, appInfo, imageView, i, null), 3);
        java.lang.CharSequence charSequence = appInfo.stateTags;
        if (charSequence != null) {
            if (textView2 != null) {
                java.lang.String obj2 = charSequence.toString();
                java.util.HashMap hashMap = this.g;
                if (hashMap.containsKey(obj2)) {
                    java.lang.Object obj3 = hashMap.get(obj2);
                    a.wv.s(obj3);
                    i2 = ((java.lang.Number) obj3).intValue();
                } else {
                    if (obj2.length() == 0) {
                        java.lang.String str = this.d;
                        if (hashMap.containsKey(str)) {
                            java.lang.Object obj4 = hashMap.get(str);
                            a.wv.s(obj4);
                            i2 = ((java.lang.Number) obj4).intValue();
                        }
                    }
                    i2 = -7829368;
                }
                textView2.setTextColor(i2);
                textView2.setVisibility(0);
                a.nk nkVar = a.b11.c;
                textView2.setText(a.tg1.n(obj2));
            }
        } else if (textView2 != null) {
            textView2.setVisibility(8);
        }
        if (textView3 != null) {
            textView3.setText(appInfo.desc);
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        java.util.ArrayList arrayList = this.f;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public final java.lang.Object getItem(int i) {
        java.util.ArrayList arrayList = this.f;
        a.wv.s(arrayList);
        java.lang.Object obj = arrayList.get(i);
        a.wv.v(obj, "list!![position]");
        return (com.omarea.model.AppInfo) obj;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final android.view.View getView(int i, android.view.View view, android.view.ViewGroup viewGroup) {
        a.wv.w(viewGroup, "parent");
        if (view == null) {
            view = android.view.View.inflate(this.c, 2131558651, null);
        }
        a.wv.s(view);
        a(view, i);
        return view;
    }
}
