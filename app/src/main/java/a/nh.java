package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class nh extends android.widget.BaseAdapter {
    public static final /* synthetic */ int j = 0;
    public final java.lang.String c;
    public final boolean d;
    public final java.util.ArrayList e;
    public final a.mo f;
    public final a.gy g;
    public final java.util.HashMap h;
    public a.lh i;

    /* JADX WARN: Type inference failed for: r6v1, types: [a.gy, java.lang.Object] */
    public nh(android.content.Context context, java.util.ArrayList arrayList, java.lang.String str, boolean z) {
        a.wv.w(context, "context");
        a.wv.w(arrayList, "apps");
        a.wv.w(str, "keywords");
        this.c = str;
        this.d = z;
        this.f = new a.mo(context, 256, 4, 0);
        this.g = new a.gy();
        this.h = new java.util.HashMap();
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
        a.wv.v(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        if (lowerCase.length() != 0) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : arrayList) {
                com.omarea.model.AppInfo appInfo = (com.omarea.model.AppInfo) obj;
                java.lang.String packageName = appInfo.getPackageName();
                java.util.Locale locale = java.util.Locale.ROOT;
                java.lang.String lowerCase2 = packageName.toLowerCase(locale);
                a.wv.v(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                if (!a.yi1.g2(lowerCase2, lowerCase)) {
                    java.lang.String lowerCase3 = appInfo.getAppName().toLowerCase(locale);
                    a.wv.v(lowerCase3, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    if (!a.yi1.g2(lowerCase3, lowerCase)) {
                        java.lang.String lowerCase4 = appInfo.path.toString().toLowerCase(locale);
                        a.wv.v(lowerCase4, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        if (a.yi1.g2(lowerCase4, lowerCase)) {
                        }
                    }
                }
                arrayList2.add(obj);
            }
            arrayList = new java.util.ArrayList(arrayList2);
        }
        a.ov.Z1(arrayList, new a.oi0(2));
        this.e = arrayList;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.h.put(java.lang.Integer.valueOf(i), java.lang.Boolean.valueOf(((com.omarea.model.AppInfo) this.e.get(i)).stateTags != null && ((com.omarea.model.AppInfo) this.e.get(i)).getSelected()));
        }
    }

    public final boolean a() {
        java.util.Iterator it = this.h.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((java.lang.Boolean) ((java.util.Map.Entry) it.next()).getValue()).booleanValue()) {
                i++;
            }
        }
        java.util.ArrayList arrayList = this.e;
        a.wv.s(arrayList);
        return i == arrayList.size();
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final com.omarea.model.AppInfo getItem(int i) {
        java.util.ArrayList arrayList = this.e;
        a.wv.s(arrayList);
        java.lang.Object obj = arrayList.get(i);
        a.wv.v(obj, "list!![position]");
        return (com.omarea.model.AppInfo) obj;
    }

    public final java.util.ArrayList c() {
        java.util.HashMap hashMap = this.h;
        java.util.Set keySet = hashMap.keySet();
        a.wv.v(keySet, "states.keys");
        java.util.ArrayList<java.lang.Integer> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : keySet) {
            if (a.wv.e(hashMap.get((java.lang.Integer) obj), java.lang.Boolean.TRUE)) {
                arrayList.add((Integer) (obj));
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Integer num : arrayList) {
            a.wv.v(num, "it");
            arrayList2.add(getItem(num.intValue()));
        }
        return arrayList2.isEmpty() ? new java.util.ArrayList() : arrayList2;
    }

    public final boolean d() {
        java.util.HashMap hashMap = this.h;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry : (Iterable<java.util.Map.Entry>) hashMap.entrySet()) {
            if (((java.lang.Boolean) entry.getValue()).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return !linkedHashMap.isEmpty();
    }

    public final void e(boolean z) {
        java.util.HashMap hashMap = this.h;
        for (java.util.Map.Entry entry : (Iterable<java.util.Map.Entry>) hashMap.entrySet()) {
            hashMap.put(entry.getKey(), java.lang.Boolean.valueOf(z));
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        java.util.ArrayList arrayList = this.e;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    /* JADX WARN: Type inference failed for: r12v2, types: [a.lh, java.lang.Object] */
    @Override // android.widget.Adapter
    public final android.view.View getView(int i, android.view.View view, android.view.ViewGroup viewGroup) {
        android.widget.CheckBox checkBox;
        a.wv.w(viewGroup, "parent");
        android.content.Context context = viewGroup.getContext();
        if (view == null) {
            this.i = new a.lh();
            view = android.view.View.inflate(context, 2131558633, null);
            a.lh lhVar = this.i;
            if (lhVar != null) {
                a.wv.s(view);
                lhVar.f320a = (android.widget.TextView) view.findViewById(2131361825);
                lhVar.e = (android.widget.TextView) view.findViewById(2131361809);
                lhVar.d = (android.widget.TextView) view.findViewById(2131361823);
                lhVar.c = (android.widget.ImageView) view.findViewById(2131361811);
                lhVar.b = (android.widget.CheckBox) view.findViewById(2131363080);
                android.widget.ImageView imageView = lhVar.c;
                a.wv.s(imageView);
                imageView.setTag(getItem(i).getPackageName());
            }
            view.setTag(this.i);
        } else {
            a.lh tag = (lh) view.getTag();
            a.wv.t(tag, "null cannot be cast to non-null type com.omarea.ui.apps.AdapterAppList.ViewHolder");
            this.i = (a.lh) tag;
        }
        a.lh lhVar2 = this.i;
        if (lhVar2 != null) {
            com.omarea.model.AppInfo item = getItem(i);
            android.widget.TextView textView = lhVar2.f320a;
            java.lang.String str = this.c;
            a.gy gyVar = this.g;
            if (textView != null) {
                java.lang.String appName = item.getAppName();
                gyVar.getClass();
                textView.setText(a.gy.D(appName, str));
            }
            android.widget.TextView textView2 = lhVar2.d;
            if (textView2 != null) {
                java.lang.String packageName = item.getPackageName();
                gyVar.getClass();
                textView2.setText(a.gy.D(packageName, str));
            }
            android.widget.ImageView imageView2 = lhVar2.c;
            a.wv.s(imageView2);
            imageView2.setTag(java.lang.Integer.valueOf(i));
            a.wv.M0(a.wv.b(a.z80.b), null, new a.mh(this, item, imageView2, i, null), 3);
            android.widget.TextView textView3 = lhVar2.e;
            if (textView3 != null) {
                java.lang.CharSequence charSequence = item.stateTags;
                if (charSequence == null || charSequence.length() == 0) {
                    textView3.setText("");
                    textView3.setVisibility(8);
                } else {
                    textView3.setText(item.stateTags);
                    textView3.setVisibility(0);
                }
            }
            android.widget.CheckBox checkBox2 = lhVar2.b;
            if (checkBox2 != null) {
                checkBox2.setOnCheckedChangeListener(new a.kh(i, 0, this));
            }
            android.widget.CheckBox checkBox3 = lhVar2.b;
            if (checkBox3 != null) {
                checkBox3.setChecked(a.wv.e(this.h.get(java.lang.Integer.valueOf(i)), java.lang.Boolean.TRUE));
            }
            if (this.d && (checkBox = lhVar2.b) != null) {
                checkBox.setVisibility(8);
            }
        }
        return view;
    }
}
