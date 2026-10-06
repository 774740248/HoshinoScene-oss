package com.omarea.vtools.activities;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ActivityMagisk extends a.p5 {
    public static final /* synthetic */ a.gu0[] f;
    public final a.yq1 d = a.b20.i(this, 2131362753);
    public a.xj e;

    static {
        a.d81 d81Var = new a.d81(com.omarea.vtools.activities.ActivityMagisk.class, "magisk_files", "getMagisk_files()Landroidx/recyclerview/widget/RecyclerView;");
        a.na1.f375a.getClass();
        f = new a.gu0[]{d81Var};
    }

    @Override // a.p5, a.kk0, androidx.activity.ComponentActivity, a.nw, android.app.Activity
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131558456);
        setBackArrow();
        final int i = 1;
        if (a.b20.E0()) {
            final int i2 = 0;
            if (!a.b20.D0()) {
                int i3 = a.x60.f681a;
                java.lang.String string = getString(2131952859);
                a.wv.v(string, "getString(R.string.magisk_install_title)");
                java.lang.String string2 = getString(2131952858);
                a.wv.v(string2, "getString(R.string.magisk_install_desc)");
                a.fs1.i(this, string, string2, new a.db(this), new a.db(this));
            }
            a.xj xjVar = new a.xj(a.fs1.r(a.b20.f0()), new a.eb(this, 0), new a.b81(this, null), null, false);
            xjVar.k = new a.eb(this, 1);
            this.e = xjVar;
            a.gu0[] gu0VarArr = f;
            a.gu0 gu0Var = gu0VarArr[0];
            a.yq1 yq1Var = this.d;
            ((androidx.recyclerview.widget.RecyclerView) yq1Var.a(gu0Var)).setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(1));
            ((androidx.recyclerview.widget.RecyclerView) yq1Var.a(gu0VarArr[0])).setAdapter(this.e);
        } else {
            android.widget.Toast.makeText(getContext(), getString(2131952861), 1).show();
        }
        getOnBackPressedDispatcher().addCallback(this, new a.tl0(this, 8));
    }

    @Override // a.p5, a.kk0, android.app.Activity
    public final void onResume() {
        super.onResume();
        setTitle(getString(2131952888));
    }
}
