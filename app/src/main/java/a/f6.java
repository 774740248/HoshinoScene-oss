package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class f6 implements a.ei {
    public final /* synthetic */ com.omarea.vtools.activities.ActivityCommandList c;

    public f6(com.omarea.vtools.activities.ActivityCommandList activityCommandList) {
        this.c = activityCommandList;
    }

    @Override // a.ei
    public final void a(android.view.View view, int i) {
        a.wv.w(view, "view");
        a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityCommandList.f;
        com.omarea.vtools.activities.ActivityCommandList activityCommandList = this.c;
        a.e91 adapter = activityCommandList.o().getAdapter();
        a.wv.t(adapter, "null cannot be cast to non-null type com.omarea.ui.AdapterCommandList");
        java.lang.Object obj = ((a.gi) adapter).g.get(i);
        a.wv.v(obj, "items[position]");
        a.s10 s10Var = (a.s10) obj;
        int i2 = a.x60.f681a;
        java.lang.String str = s10Var.c;
        java.lang.String str2 = "# " + s10Var.d + "\n\n" + a.wv.i1(new java.io.File(s10Var.d), a.bu.f53a);
        java.lang.String string = activityCommandList.getString(2131952100);
        a.wv.v(string, "getString(R.string.btn_test_run)");
        a.u60 u60Var = new a.u60(string, new a.so(activityCommandList, 19, s10Var), 4);
        java.lang.String string2 = activityCommandList.getString(2131952075);
        a.wv.v(string2, "getString(R.string.btn_back)");
        a.fs1.f(activityCommandList, str, str2, u60Var, new a.u60(string2, (java.lang.Runnable) null, 6));
    }
}
