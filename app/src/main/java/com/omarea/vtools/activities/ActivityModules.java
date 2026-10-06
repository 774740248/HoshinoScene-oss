package com.omarea.vtools.activities;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ActivityModules extends a.p5 implements a.cj {
    public static final /* synthetic */ a.gu0[] o;
    public a.pm j;
    public java.util.ArrayList k;
    public boolean n;
    public final a.yq1 d = a.b20.i(this, 2131362748);
    public final a.yq1 e = a.b20.i(this, 2131362825);
    public final a.yq1 f = a.b20.i(this, 2131362827);
    public final a.yq1 g = a.b20.i(this, 2131362828);
    public final a.yq1 h = a.b20.i(this, 2131362830);
    public final a.yq1 i = a.b20.i(this, 2131362832);
    public final java.lang.String[] l = {"*", "official", "share", "magisk-repo"};
    public java.lang.String m = "*";

    static {
        a.d81 d81Var = new a.d81(com.omarea.vtools.activities.ActivityModules.class, "loading_view", "getLoading_view()Landroid/widget/LinearLayout;");
        a.na1.f375a.getClass();
        o = new a.gu0[]{d81Var, new a.d81(com.omarea.vtools.activities.ActivityModules.class, "module_list", "getModule_list()Landroidx/recyclerview/widget/RecyclerView;"), new a.d81(com.omarea.vtools.activities.ActivityModules.class, "module_refresh", "getModule_refresh()Landroid/widget/ImageView;"), new a.d81(com.omarea.vtools.activities.ActivityModules.class, "module_search", "getModule_search()Landroid/widget/EditText;"), new a.d81(com.omarea.vtools.activities.ActivityModules.class, "module_source", "getModule_source()Lcom/omarea/ui/SelectView;"), new a.d81(com.omarea.vtools.activities.ActivityModules.class, "module_upload", "getModule_upload()Landroid/widget/ImageView;")};
    }

    public final androidx.recyclerview.widget.RecyclerView o() {
        return (androidx.recyclerview.widget.RecyclerView) this.e.a(o[1]);
    }

    @Override // a.kk0, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, android.content.Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            q();
        }
    }

    @Override // a.p5, a.kk0, androidx.activity.ComponentActivity, a.nw, android.app.Activity
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131558474);
        setBackArrow();
        int i = 1;
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(1);
        linearLayoutManager.n1(1);
        o().setLayoutManager(linearLayoutManager);
        a.gu0[] gu0VarArr = o;
        ((android.widget.ImageView) this.i.a(gu0VarArr[5])).setOnClickListener(new a.wi(this, 22, this));
        ((android.widget.ImageView) this.f.a(gu0VarArr[2])).setOnClickListener(new a.gv(22, this));
        a.pm pmVar = new a.pm(this, 18);
        this.j = pmVar;
        java.util.ArrayList z = pmVar.z();
        q();
        if (z.size() < 1) {
            p();
        }
        int i2 = 3;
        new a.vj0().a((android.widget.EditText) this.g.a(gu0VarArr[3]), new a.d4(this, i));
        a.gu0 gu0Var = gu0VarArr[4];
        a.yq1 yq1Var = this.h;
        com.omarea.ui.SelectView selectView = (com.omarea.ui.SelectView) yq1Var.a(gu0Var);
        java.lang.String[] stringArray = getResources().getStringArray(2130903065);
        a.wv.v(stringArray, "resources.getStringArray…ay.modules_source_filter)");
        java.util.ArrayList arrayList = new java.util.ArrayList(stringArray.length);
        int length = stringArray.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            java.lang.String str = stringArray[i3];
            a.wv.v(str, "label");
            arrayList.add(new a.mg1(str, this.l[i4]));
            i3++;
            i4++;
        }
        selectView.setItems(arrayList);
        ((com.omarea.ui.SelectView) yq1Var.a(gu0VarArr[4])).setValue(this.m);
        ((com.omarea.ui.SelectView) yq1Var.a(gu0VarArr[4])).setOnItemSelected(new a.g4(i2, this));
        r();
    }

    @Override // a.p5, a.kk0, android.app.Activity
    public final void onResume() {
        super.onResume();
        setTitle(getString(2131952915));
    }

    public final void p() {
        if (this.n) {
            a.cp cpVar = com.omarea.Scene.c;
            a.fs1.X("Loading…", 0);
            return;
        }
        o().setAdapter(new a.ej(getContext(), new java.util.ArrayList()));
        this.n = true;
        ((android.widget.LinearLayout) this.d.a(o[0])).setVisibility(0);
        a.ty tyVar = a.z80.b;
        a.bc bcVar = new a.bc(this, null);
        int i = 2 & 1;
        a.ty tyVar2 = a.ob0.c;
        if (i != 0) {
            tyVar = tyVar2;
        }
        int i2 = (2 & 2) != 0 ? 1 : 0;
        a.ty W = a.wv.W(tyVar2, tyVar, true);
        a.u20 u20Var = a.z80.f728a;
        if (W != u20Var && W.g(a.gy.c) == null) {
            W = W.c(u20Var);
        }
        a.f av0Var = i2 == 2 ? new a.av0(W, bcVar) : new a.f(W, true);
        av0Var.S(i2, av0Var, bcVar);
    }

    public final void q() {
        a.ty tyVar = a.z80.b;
        a.dc dcVar = new a.dc(this, null);
        int i = 2 & 1;
        a.ty tyVar2 = a.ob0.c;
        if (i != 0) {
            tyVar = tyVar2;
        }
        int i2 = (2 & 2) != 0 ? 1 : 0;
        a.ty W = a.wv.W(tyVar2, tyVar, true);
        a.u20 u20Var = a.z80.f728a;
        if (W != u20Var && W.g(a.gy.c) == null) {
            W = W.c(u20Var);
        }
        a.f av0Var = i2 == 2 ? new a.av0(W, dcVar) : new a.f(W, true);
        av0Var.S(i2, av0Var, dcVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r() {
        /*
            r6 = this;
            java.lang.String r0 = r6.m
            int r1 = r0.hashCode()
            r2 = -1261785199(0xffffffffb4caaf91, float:-3.7753173E-7)
            if (r1 == r2) goto L5b
            r2 = -765289749(0xffffffffd2629aeb, float:-2.4331543E11)
            if (r1 == r2) goto L1f
            r2 = 109400031(0x6854fdf, float:5.01464E-35)
            if (r1 == r2) goto L16
            goto L63
        L16:
            java.lang.String r1 = "share"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L28
            goto L63
        L1f:
            java.lang.String r1 = "official"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L28
            goto L63
        L28:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = r6.k
            if (r1 == 0) goto L7e
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L3a:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L57
            java.lang.Object r3 = r1.next()
            r4 = r3
            com.omarea.model.MagiskModuleUnofficial r4 = (com.omarea.model.MagiskModuleUnofficial) r4
            java.lang.String r4 = r4.getSource()
            java.lang.String r5 = r6.m
            boolean r4 = a.wv.e(r4, r5)
            if (r4 == 0) goto L3a
            r2.add(r3)
            goto L3a
        L57:
            r0.addAll(r2)
            goto L7e
        L5b:
            java.lang.String r1 = "magisk-repo"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L75
        L63:
            a.pm r0 = r6.j
            a.wv.s(r0)
            java.util.ArrayList r0 = r0.z()
            java.util.ArrayList r1 = r6.k
            if (r1 == 0) goto L7e
            r2 = 0
            r0.addAll(r2, r1)
            goto L7e
        L75:
            a.pm r0 = r6.j
            a.wv.s(r0)
            java.util.ArrayList r0 = r0.z()
        L7e:
            int r1 = r0.size()
            r2 = 1
            if (r1 <= r2) goto L8f
            a.py r1 = new a.py
            r2 = 22
            r1.<init>(r2)
            a.ov.Z1(r0, r1)
        L8f:
            androidx.recyclerview.widget.RecyclerView r1 = r6.o()
            a.ej r2 = new a.ej
            android.content.Context r3 = r6.getContext()
            r2.<init>(r3, r0)
            a.gu0[] r0 = com.omarea.vtools.activities.ActivityModules.o
            r3 = 3
            r0 = r0[r3]
            a.yq1 r3 = r6.g
            android.view.View r0 = r3.a(r0)
            android.widget.EditText r0 = (android.widget.EditText) r0
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            int r3 = r0.length()
            if (r3 <= 0) goto Lbc
            a.xz r3 = r2.j
            r3.filter(r0)
        Lbc:
            r2.k = r6
            r1.setAdapter(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.omarea.vtools.activities.ActivityModules.r():void");
    }
}
