package com.omarea.vtools.activities;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ActivityCommandList extends a.p5 implements a.ei {
    public static final /* synthetic */ a.gu0[] f;
    public final a.yq1 d = a.b20.i(this, 2131362738);
    public final a.yq1 e = a.b20.i(this, 2131362739);

    static {
        a.d81 d81Var = new a.d81(com.omarea.vtools.activities.ActivityCommandList.class, "list_add_command", "getList_add_command()Lcom/google/android/material/floatingactionbutton/FloatingActionButton;");
        a.na1.f375a.getClass();
        f = new a.gu0[]{d81Var, new a.d81(com.omarea.vtools.activities.ActivityCommandList.class, "list_commands", "getList_commands()Lcom/omarea/ui/BlurViewRecyclerView;")};
    }

    @Override // a.ei
    public final void a(android.view.View view, final int i) {
        a.wv.w(view, "view");
        a.e91 adapter = o().getAdapter();
        a.wv.t(adapter, "null cannot be cast to non-null type com.omarea.ui.AdapterCommandList");
        final a.gi giVar = (a.gi) adapter;
        java.lang.Object obj = giVar.g.get(i);
        a.wv.v(obj, "items[position]");
        final a.s10 s10Var = (a.s10) obj;
        int i2 = a.x60.f681a;
        java.lang.String str = s10Var.c;
        java.lang.String str2 = s10Var.d;
        java.lang.String string = getString(2131952080);
        a.wv.v(string, "getString(R.string.btn_delete)");
        a.fs1.f(this, str, str2, new a.u60(string, new a.e6(this, s10Var, giVar, 4), 4), null);
    }

    public final com.omarea.ui.BlurViewRecyclerView o() {
        return (com.omarea.ui.BlurViewRecyclerView) this.e.a(f[1]);
    }

    @Override // a.p5, a.kk0, androidx.activity.ComponentActivity, a.nw, android.app.Activity
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131558444);
        setBackArrow();
        ((com.google.android.material.floatingactionbutton.FloatingActionButton) this.d.a(f[0])).setOnClickListener(new a.gv(19, this));
    }

    @Override // a.kk0, android.app.Activity
    public final void onPause() {
        super.onPause();
    }

    @Override // a.p5, a.kk0, android.app.Activity
    public final void onResume() {
        super.onResume();
        setTitle(getString(2131952894));
        java.util.ArrayList f2 = new a.l1(this, 11).f();
        o().setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(1));
        com.omarea.ui.BlurViewRecyclerView o = o();
        a.gi giVar = new a.gi(this, f2);
        giVar.h = this;
        giVar.i = new a.f6(this);
        o.setAdapter(giVar);
    }
}
