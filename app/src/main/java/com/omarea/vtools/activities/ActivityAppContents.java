package com.omarea.vtools.activities;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ActivityAppContents extends a.p5 {
    public static final /* synthetic */ a.gu0[] q;
    public final a.yq1 d = a.b20.i(this, 2131361998);
    public final a.yq1 e = a.b20.i(this, 2131362035);
    public final a.yq1 f = a.b20.i(this, 2131362260);
    public final a.yq1 g = a.b20.i(this, 2131362261);
    public final a.yq1 h = a.b20.i(this, 2131362748);
    public final a.d4 i = new a.d4(this, 0);
    public final java.util.ArrayList j;
    public java.lang.String k;
    public boolean l;
    public a.b81 m;
    public a.po n;
    public java.util.ArrayList o;
    public java.lang.String p;

    static {
        a.d81 d81Var = new a.d81(com.omarea.vtools.activities.ActivityAppContents.class, "app_list", "getApp_list()Landroid/widget/ListView;");
        a.na1.f375a.getClass();
        q = new a.gu0[]{d81Var, new a.d81(com.omarea.vtools.activities.ActivityAppContents.class, "apps_search_box", "getApps_search_box()Landroid/widget/EditText;"), new a.d81(com.omarea.vtools.activities.ActivityAppContents.class, "contents_filter", "getContents_filter()Lcom/omarea/ui/SelectView;"), new a.d81(com.omarea.vtools.activities.ActivityAppContents.class, "contents_show_all", "getContents_show_all()Landroid/widget/CheckBox;"), new a.d81(com.omarea.vtools.activities.ActivityAppContents.class, "loading_view", "getLoading_view()Landroid/widget/LinearLayout;")};
    }

    public ActivityAppContents() {
        java.util.ArrayList f = a.b20.f("activity", "service", "receiver", "provider");
        this.j = f;
        this.k = (java.lang.String) a.qv.e2(f);
        this.l = true;
        this.p = "";
    }

    public final android.widget.ListView o() {
        return (android.widget.ListView) this.d.a(q[0]);
    }

    @Override // a.p5, a.kk0, androidx.activity.ComponentActivity, a.nw, android.app.Activity
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131558435);
        this.m = new a.b81(this, null);
        this.n = new a.po(this, true);
        setBackArrow();
        a.gu0[] gu0VarArr = q;
        int i = 0;
        ((android.widget.LinearLayout) this.h.a(gu0VarArr[4])).setVisibility(0);
        a.wv.M0(a.wv.b(a.z80.b), null, new a.f4(this, null), 3);
        int i2 = 2;
        a.gu0 gu0Var = gu0VarArr[2];
        a.yq1 yq1Var = this.f;
        com.omarea.ui.SelectView selectView = (com.omarea.ui.SelectView) yq1Var.a(gu0Var);
        java.lang.String[] stringArray = getResources().getStringArray(2130903045);
        a.wv.v(stringArray, "resources.getStringArray…y.config_contents_filter)");
        java.util.ArrayList arrayList = new java.util.ArrayList(stringArray.length);
        int length = stringArray.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            java.lang.String str = stringArray[i3];
            a.wv.v(str, "label");
            java.lang.Object obj = this.j.get(i4);
            a.wv.v(obj, "types[index]");
            arrayList.add(new a.mg1(str, (java.lang.String) obj));
            i3++;
            i4++;
        }
        selectView.setItems(arrayList);
        ((com.omarea.ui.SelectView) yq1Var.a(gu0VarArr[2])).setValue(this.k);
        ((com.omarea.ui.SelectView) yq1Var.a(gu0VarArr[2])).setOnItemSelected(new a.g4(i, this));
        this.l = getSharedPreferences("app_contents", 0).getBoolean("show_all", true);
        a.gu0 gu0Var2 = gu0VarArr[3];
        a.yq1 yq1Var2 = this.g;
        ((android.widget.CheckBox) yq1Var2.a(gu0Var2)).setChecked(this.l);
        ((android.widget.CheckBox) yq1Var2.a(gu0VarArr[3])).setOnCheckedChangeListener(new a.uu(3, this));
        p().setOnEditorActionListener(new a.uf1(this, 4));
        p().addTextChangedListener(new a.xf1(new a.so(new java.lang.Object(), 16, this)));
        o().setOnItemLongClickListener(new a.o3(i2, this));
        q();
    }

    @Override // a.p5, a.kk0, android.app.Activity
    public final void onResume() {
        super.onResume();
        setTitle(getString(2131952887));
    }

    public final android.widget.EditText p() {
        return (android.widget.EditText) this.e.a(q[1]);
    }

    public final void q() {
        a.b81 b81Var = this.m;
        if (b81Var == null) {
            a.wv.M1("processBarDialog");
            throw null;
        }
        a.b81.c(b81Var);
        a.wv.M0(a.wv.b(a.z80.f728a), null, new a.i4(this, null), 3);
    }

    public final void r(java.util.ArrayList arrayList, android.widget.ListView listView) {
        java.util.ArrayList arrayList2;
        a.rg rgVar;
        java.lang.String str;
        android.database.Cursor rawQuery;
        java.util.ArrayList arrayList3;
        java.lang.Object obj;
        if (arrayList == null) {
            return;
        }
        java.lang.String str2 = this.k;
        if (this.l) {
            arrayList2 = arrayList;
        } else {
            rawQuery = new a.e3(getContext(), 0).getReadableDatabase().rawQuery("select distinct package_name from ".concat(a.e3.a(str2)), null);
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            while (rawQuery.moveToNext()) {
                try {
                    arrayList4.add(rawQuery.getString(0));
                } finally {
                }
            }
            rawQuery.close();
            java.util.HashSet hashSet = new java.util.HashSet(a.b20.B0(a.op.J1(arrayList4, 12)));
            a.qv.v2(arrayList4, hashSet);
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            for (java.lang.Object obj2 : arrayList) {
                if (hashSet.contains(((com.omarea.model.AppInfo) obj2).getPackageName())) {
                    arrayList5.add(obj2);
                }
            }
            arrayList2 = new java.util.ArrayList(arrayList5);
        }
        if (this.p.length() > 0) {
            if (a.wv.e(str2, "activity")) {
                a.e3 e3Var = new a.e3(getContext(), 0);
                java.lang.String str3 = this.p;
                rawQuery = e3Var.getReadableDatabase().rawQuery("select name, package_name, exported, enabled, label from activities where name like ? or package_name like ? or label like ?", new java.lang.String[]{a.ai1.h("%", str3, "%"), a.ai1.h("%", str3, "%"), a.ai1.h("%", str3, "%")});
                arrayList3 = new java.util.ArrayList();
                while (rawQuery.moveToNext()) {
                    try {
                        arrayList3.add(new a.d3(rawQuery, 0));
                    } finally {
                    }
                }
                rawQuery.close();
            } else {
                a.e3 e3Var2 = new a.e3(getContext(), 0);
                java.lang.String str4 = this.p;
                str2.getClass();
                str2.hashCode();
                char c = 65535;
                switch (str2.hashCode()) {
                    case -987494927:
                        if (str2.equals("provider")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -808719889:
                        if (str2.equals("receiver")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 1984153269:
                        if (str2.equals("service")) {
                            c = 2;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                        str = "providers";
                        break;
                    case 1:
                        str = "receivers";
                        break;
                    case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                        str = "services";
                        break;
                    default:
                        str = "activities";
                        break;
                }
                android.database.sqlite.SQLiteDatabase readableDatabase = e3Var2.getReadableDatabase();
                java.lang.String h = a.ai1.h("%", str4, "%");
                rawQuery = readableDatabase.rawQuery(a.ai1.h("select name, package_name, exported, enabled from ", str, " where name like ? or package_name like ?"), new java.lang.String[]{h, h});
                arrayList3 = new java.util.ArrayList();
                while (rawQuery.moveToNext()) {
                    try {
                        arrayList3.add(new a.d3(rawQuery, 2));
                    } finally {
                    }
                }
            }
            java.util.ArrayList arrayList6 = new java.util.ArrayList(arrayList3);
            java.lang.String str5 = this.p;
            java.util.Locale locale = java.util.Locale.ENGLISH;
            java.lang.String k = a.ai1.k(locale, "ENGLISH", str5, locale, "this as java.lang.String).toLowerCase(locale)");
            android.content.Context context = getContext();
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            for (java.lang.Object obj3 : arrayList2) {
                com.omarea.model.AppInfo appInfo = (com.omarea.model.AppInfo) obj3;
                java.util.Iterator it = arrayList6.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (a.wv.e(((com.omarea.model.ActivityCacheInfo) obj).packageName, appInfo.getPackageName())) {
                        }
                    } else {
                        obj = null;
                    }
                }
                if (obj == null) {
                    java.lang.String appName = appInfo.getAppName();
                    java.util.Locale locale2 = java.util.Locale.ENGLISH;
                    if (a.yi1.g2(a.ai1.k(locale2, "ENGLISH", appName, locale2, "this as java.lang.String).toLowerCase(locale)"), k)) {
                    }
                }
                arrayList7.add(obj3);
            }
            rgVar = new a.rg(context, new java.util.ArrayList(arrayList7), this.p);
        } else {
            rgVar = new a.rg(getContext(), arrayList2, this.p);
        }
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(rgVar);
        a.cp cpVar = com.omarea.Scene.c;
        a.fs1.L(new a.q1(listView, rgVar, weakReference, this, str2, 1));
    }
}
