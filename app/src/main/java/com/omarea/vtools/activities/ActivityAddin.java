package com.omarea.vtools.activities;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ActivityAddin extends a.p5 {
    public static final /* synthetic */ a.gu0[] f;
    public final a.yq1 d = a.b20.i(this, 2131361954);
    public final a.j3 e = new a.j3();

    static {
        a.d81 d81Var = new a.d81(com.omarea.vtools.activities.ActivityAddin.class, "addin_system_listview", "getAddin_system_listview()Landroid/widget/ListView;");
        a.na1.f375a.getClass();
        f = new a.gu0[]{d81Var};
    }

    public static java.util.HashMap o(java.lang.String str, java.lang.String str2, java.lang.Runnable runnable) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("Title", str);
        hashMap.put("Desc", str2);
        hashMap.put("Action", runnable);
        return hashMap;
    }

    @Override // a.p5, a.kk0, androidx.activity.ComponentActivity, a.nw, android.app.Activity
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131558430);
        setBackArrow();
        a.gu0[] gu0VarArr = f;
        final int i = 0;
        a.gu0 gu0Var = gu0VarArr[0];
        a.yq1 yq1Var = this.d;
        android.widget.ListView listView = (android.widget.ListView) yq1Var.a(gu0Var);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (android.os.Build.VERSION.SDK_INT <= 29) {
            java.lang.String string = getString(2131951838);
            a.wv.v(string, "getString(R.string.addin_fullscreen_on)");
            java.lang.String string2 = getString(2131951839);
            a.wv.v(string2, "getString(R.string.addin_fullscreen_on_desc)");
            arrayList.add(o(string, string2, new a.k3(this)));
        }
        java.lang.String string3 = getString(2131951844);
        a.wv.v(string3, "getString(R.string.addin_wifi)");
        java.lang.String string4 = getString(2131951845);
        a.wv.v(string4, "getString(R.string.addin_wifi_desc)");
        final int i2 = 1;
        arrayList.add(o(string3, string4, new a.k3(this)));
        java.lang.String string5 = getString(2131951834);
        a.wv.v(string5, "getString(R.string.addin_dpi)");
        java.lang.String string6 = getString(2131951835);
        a.wv.v(string6, "getString(R.string.addin_dpi_desc)");
        arrayList.add(o(string5, string6, new a.so(this, 12, this)));
        java.lang.String string7 = getString(2131951831);
        a.wv.v(string7, "getString(R.string.addin_deviceinfo)");
        java.lang.String string8 = getString(2131951832);
        a.wv.v(string8, "getString(\n             …ng.addin_deviceinfo_desc)");
        final int i3 = 2;
        arrayList.add(o(string7, string8, new a.k3(this)));
        java.lang.String string9 = getString(2131951840);
        a.wv.v(string9, "getString(R.string.addin_mac)");
        java.lang.String string10 = getString(2131951842);
        a.wv.v(string10, "getString(R.string.addin_mac_desc)");
        final int i4 = 3;
        arrayList.add(o(string9, string10, new a.k3(this)));
        java.lang.String string11 = getString(2131951841);
        a.wv.v(string11, "getString(R.string.addin_mac_2)");
        java.lang.String string12 = getString(2131951843);
        a.wv.v(string12, "getString(R.string.addin_mac_desc_2)");
        final int i5 = 4;
        arrayList.add(o(string11, string12, new a.k3(this)));
        java.lang.String string13 = getString(2131951836);
        a.wv.v(string13, "getString(R.string.addin_force_dex_compile)");
        java.lang.String string14 = getString(2131951837);
        a.wv.v(string14, "getString(R.string.addin_force_dex_compile_desc)");
        final int i6 = 5;
        arrayList.add(o(string13, string14, new a.k3(this)));
        ((android.widget.ListView) yq1Var.a(gu0VarArr[0])).setAdapter((android.widget.ListAdapter) new android.widget.SimpleAdapter(listView.getContext(), arrayList, 2131558632, new java.lang.String[]{"Title", "Desc"}, new int[]{2131361865, 2131361797}));
        ((android.widget.ListView) yq1Var.a(gu0VarArr[0])).setOnItemClickListener(this.e);
    }

    @Override // a.p5, a.kk0, android.app.Activity
    public final void onResume() {
        super.onResume();
        setTitle(getString(2131952924));
    }
}
