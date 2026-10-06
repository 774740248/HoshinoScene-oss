package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ah extends android.widget.Filter {

    /* renamed from: a, reason: collision with root package name */
    public a.fh f11a;
    public java.lang.CharSequence b;

    @Override // android.widget.Filter
    public final android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence charSequence) {
        java.util.ArrayList arrayList;
        java.util.List list;
        java.util.Collection collection;
        java.util.ArrayList arrayList2;
        android.widget.Filter.FilterResults filterResults = new android.widget.Filter.FilterResults();
        java.lang.String obj = charSequence == null ? "" : charSequence.toString();
        if (obj.length() == 0) {
            synchronized (this.f11a.k) {
                arrayList2 = new java.util.ArrayList(this.f11a.g);
            }
            filterResults.values = arrayList2;
            filterResults.count = arrayList2.size();
        } else {
            java.util.Locale locale = java.util.Locale.getDefault();
            a.wv.v(locale, "getDefault()");
            java.lang.String lowerCase = obj.toLowerCase(locale);
            a.wv.v(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            synchronized (this.f11a.k) {
                arrayList = new java.util.ArrayList(this.f11a.g);
            }
            int size = arrayList.size();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (int i = 0; i < size; i++) {
                java.lang.Object obj2 = arrayList.get(i);
                a.wv.v(obj2, "values[i]");
                com.omarea.model.AppInfo appInfo = (com.omarea.model.AppInfo) obj2;
                java.lang.String appName = appInfo.getAppName();
                java.util.Locale locale2 = java.util.Locale.getDefault();
                a.wv.v(locale2, "getDefault()");
                java.lang.String lowerCase2 = appName.toLowerCase(locale2);
                a.wv.v(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                if (a.yi1.g2(lowerCase2, lowerCase)) {
                    arrayList3.add(appInfo);
                } else {
                    java.util.regex.Pattern compile = java.util.regex.Pattern.compile(" ");
                    a.wv.v(compile, "compile(pattern)");
                    a.yi1.w2(0);
                    java.util.regex.Matcher matcher = compile.matcher(lowerCase2);
                    if (matcher.find()) {
                        java.util.ArrayList arrayList4 = new java.util.ArrayList(10);
                        int i2 = 0;
                        do {
                            arrayList4.add(lowerCase2.subSequence(i2, matcher.start()).toString());
                            i2 = matcher.end();
                        } while (matcher.find());
                        arrayList4.add(lowerCase2.subSequence(i2, lowerCase2.length()).toString());
                        list = arrayList4;
                    } else {
                        list = a.b20.y0(lowerCase2.toString());
                    }
                    if (!list.isEmpty()) {
                        java.util.ListIterator listIterator = list.listIterator(list.size());
                        while (listIterator.hasPrevious()) {
                            if (((java.lang.String) listIterator.previous()).length() != 0) {
                                collection = a.qv.t2(list, listIterator.nextIndex() + 1);
                                break;
                            }
                        }
                    }
                    collection = a.qb0.c;
                    java.lang.String[] strArr = (java.lang.String[]) collection.toArray(new java.lang.String[0]);
                    int length = strArr.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            break;
                        }
                        if (a.yi1.g2(strArr[i3], lowerCase)) {
                            arrayList3.add(appInfo);
                            break;
                        }
                        i3++;
                    }
                }
            }
            filterResults.values = arrayList3;
            filterResults.count = arrayList3.size();
        }
        this.b = charSequence;
        return filterResults;
    }

    @Override // android.widget.Filter
    public final void publishResults(java.lang.CharSequence charSequence, android.widget.Filter.FilterResults filterResults) {
        a.wv.s(filterResults);
        java.lang.Object obj = filterResults.values;
        a.wv.t(obj, "null cannot be cast to non-null type java.util.ArrayList<com.omarea.model.AppInfo>{ kotlin.collections.TypeAliasesKt.ArrayList<com.omarea.model.AppInfo> }");
        a.fh fhVar = this.f11a;
        fhVar.getClass();
        fhVar.j = (java.util.ArrayList) obj;
        fhVar.f();
    }
}
