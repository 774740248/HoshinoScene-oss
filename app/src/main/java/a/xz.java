package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class xz extends android.widget.Filter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f697a = 2;
    public final java.lang.Object b;

    public xz(a.xg xgVar) {
        a.wv.w(xgVar, "adapter");
        this.b = xgVar;
    }

    private android.widget.Filter.FilterResults a(java.lang.CharSequence charSequence) {
        java.lang.String str;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        android.widget.Filter.FilterResults filterResults = new android.widget.Filter.FilterResults();
        if (charSequence == null || (str = charSequence.toString()) == null) {
            str = "";
        }
        if (str.length() == 0) {
            synchronized (((a.xg) this.b).i) {
                arrayList2 = new java.util.ArrayList(((a.xg) this.b).d);
            }
            filterResults.values = arrayList2;
            filterResults.count = arrayList2.size();
        } else {
            java.util.Locale locale = java.util.Locale.ROOT;
            java.lang.String k = a.ai1.k(locale, "ROOT", str, locale, "this as java.lang.String).toLowerCase(locale)");
            synchronized (((a.xg) this.b).i) {
                arrayList = new java.util.ArrayList(((a.xg) this.b).d);
            }
            java.util.ArrayList a2 = ((a.xg) this.b).a();
            int size = arrayList.size();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (int i = 0; i < size; i++) {
                java.lang.Object obj = arrayList.get(i);
                a.wv.v(obj, "values[i]");
                a.tg tgVar = (a.tg) obj;
                if (a2.contains(tgVar)) {
                    arrayList3.add(tgVar);
                } else {
                    java.lang.String appName = tgVar.getAppName();
                    java.util.Locale locale2 = java.util.Locale.ROOT;
                    java.lang.String k2 = a.ai1.k(locale2, "ROOT", appName, locale2, "this as java.lang.String).toLowerCase(locale)");
                    java.lang.String lowerCase = tgVar.getPackageName().toLowerCase(locale2);
                    a.wv.v(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    if (b(k2, k)) {
                        arrayList3.add(tgVar);
                    } else if (b(lowerCase, k)) {
                        arrayList3.add(tgVar);
                    }
                }
            }
            filterResults.values = arrayList3;
            filterResults.count = arrayList3.size();
        }
        return filterResults;
    }

    public static boolean b(java.lang.String str, java.lang.String str2) {
        java.util.List list;
        java.util.Collection collection;
        if (a.yi1.g2(str, str2)) {
            return true;
        }
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile(" ");
        a.wv.v(compile, "compile(pattern)");
        a.yi1.w2(0);
        java.util.regex.Matcher matcher = compile.matcher(str);
        if (matcher.find()) {
            java.util.ArrayList arrayList = new java.util.ArrayList(10);
            int i = 0;
            do {
                arrayList.add(str.subSequence(i, matcher.start()).toString());
                i = matcher.end();
            } while (matcher.find());
            arrayList.add(str.subSequence(i, str.length()).toString());
            list = arrayList;
        } else {
            list = a.b20.y0(str.toString());
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
        for (java.lang.String str3 : (java.lang.String[]) collection.toArray(new java.lang.String[0])) {
            if (a.yi1.g2(str3, str2)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.Filter
    public final java.lang.CharSequence convertResultToString(java.lang.Object obj) {
        switch (this.f697a) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                return ((a.bj1) ((a.wz) this.b)).c((android.database.Cursor) obj);
            default:
                return super.convertResultToString(obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01b8  */
    @Override // android.widget.Filter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r17) {
        /*
            Method dump skipped, instructions count: 894
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.xz.performFiltering(java.lang.CharSequence):android.widget.Filter$FilterResults");
    }

    @Override // android.widget.Filter
    public final void publishResults(java.lang.CharSequence charSequence, android.widget.Filter.FilterResults filterResults) {
        switch (this.f697a) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.wz wzVar = (a.wz) this.b;
                android.database.Cursor cursor = ((a.vz) wzVar).e;
                java.lang.Object obj = filterResults.values;
                if (obj == null || obj == cursor) {
                    return;
                }
                ((a.bj1) wzVar).b((android.database.Cursor) obj);
                return;
            case 1:
                a.xg xgVar = (a.xg) this.b;
                a.wv.s(filterResults);
                java.lang.Object obj2 = filterResults.values;
                a.wv.t(obj2, "null cannot be cast to non-null type java.util.ArrayList<com.omarea.common.ui.AdapterAppChooser.AppInfo>");
                xgVar.getClass();
                xgVar.h = (java.util.ArrayList) obj2;
                if (filterResults.count > 0) {
                    ((a.xg) this.b).notifyDataSetChanged();
                    return;
                } else {
                    ((a.xg) this.b).notifyDataSetInvalidated();
                    return;
                }
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                a.aj ajVar = (a.aj) this.b;
                a.wv.s(filterResults);
                java.lang.Object obj3 = filterResults.values;
                a.wv.t(obj3, "null cannot be cast to non-null type java.util.ArrayList<com.omarea.common.model.SelectItem>{ kotlin.collections.TypeAliasesKt.ArrayList<com.omarea.common.model.SelectItem> }");
                ajVar.getClass();
                ajVar.h = (java.util.ArrayList) obj3;
                if (filterResults.count > 0) {
                    ((a.aj) this.b).notifyDataSetChanged();
                    return;
                } else {
                    ((a.aj) this.b).notifyDataSetInvalidated();
                    return;
                }
            case 3:
                a.zi ziVar = (a.zi) this.b;
                a.wv.s(filterResults);
                java.lang.Object obj4 = filterResults.values;
                a.wv.t(obj4, "null cannot be cast to non-null type java.util.ArrayList<com.omarea.common.model.SelectItem>{ kotlin.collections.TypeAliasesKt.ArrayList<com.omarea.common.model.SelectItem> }");
                ziVar.getClass();
                ziVar.g = (java.util.ArrayList) obj4;
                if (filterResults.count > 0) {
                    ((a.zi) this.b).notifyDataSetChanged();
                    return;
                } else {
                    ((a.zi) this.b).notifyDataSetInvalidated();
                    return;
                }
            default:
                a.ej ejVar = (a.ej) this.b;
                java.lang.Object obj5 = filterResults != null ? filterResults.values : null;
                if (obj5 == null) {
                    obj5 = new java.util.ArrayList();
                }
                ejVar.i = (java.util.ArrayList) obj5;
                ((a.ej) this.b).f();
                return;
        }
    }

    public xz(a.zi ziVar) {
        a.wv.w(ziVar, "adapter");
        this.b = ziVar;
    }

    public xz(a.aj ajVar) {
        a.wv.w(ajVar, "adapter");
        this.b = ajVar;
    }

    public xz(a.ej ejVar) {
        this.b = ejVar;
    }

    public xz(a.wz wzVar) {
        this.b = wzVar;
    }
}
