package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ou1 extends android.widget.BaseAdapter {
    public final android.content.Context c;
    public final a.mo d;
    public final java.lang.String e = "";
    public final java.util.ArrayList f;

    public ou1(com.omarea.vtools.activities.ActivityAppXposedConfig activityAppXposedConfig, java.util.ArrayList arrayList) {
        this.c = activityAppXposedConfig;
        this.d = new a.mo(activityAppXposedConfig, 300, 4, 0);
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
    }

    public final void a(android.view.View view, int i) {
        java.util.ArrayList arrayList = this.f;
        a.wv.s(arrayList);
        java.lang.Object obj = arrayList.get(i);
        a.wv.v(obj, "list!![position]");
        com.omarea.model.AppInfo appInfo = (com.omarea.model.AppInfo) obj;
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(2131361825);
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(2131361806);
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(2131361811);
        if (textView != null) {
            java.lang.String appName = appInfo.getAppName();
            android.text.SpannableString spannableString = new android.text.SpannableString(appName);
            java.lang.String str = this.e;
            if (str.length() != 0) {
                java.util.Locale locale = java.util.Locale.getDefault();
                a.wv.v(locale, "getDefault()");
                java.lang.String lowerCase = appName.toLowerCase(locale);
                a.wv.v(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                java.util.Locale locale2 = java.util.Locale.getDefault();
                a.wv.v(locale2, "getDefault()");
                java.lang.String lowerCase2 = str.toLowerCase(locale2);
                a.wv.v(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                int m2 = a.yi1.m2(lowerCase, lowerCase2, 0, false, 6);
                if (m2 >= 0) {
                    spannableString.setSpan(new android.text.style.ForegroundColorSpan(android.graphics.Color.parseColor("#0094ff")), m2, str.length() + m2, 33);
                }
            }
            textView.setText(spannableString);
        }
        android.graphics.drawable.Drawable L1 = this.d.L1(appInfo);
        a.wv.s(imageView);
        if (L1 != null) {
            imageView.setImageDrawable(L1);
        }
        java.lang.CharSequence charSequence = appInfo.desc;
        if (charSequence == null || charSequence.length() == 0) {
            if (textView2 == null) {
                return;
            }
            textView2.setVisibility(8);
        } else {
            if (textView2 != null) {
                textView2.setText(appInfo.desc);
            }
            if (textView2 == null) {
                return;
            }
            textView2.setVisibility(0);
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
            view = android.view.View.inflate(this.c, 2131558658, null);
        }
        a.wv.s(view);
        a(view, i);
        return view;
    }
}
