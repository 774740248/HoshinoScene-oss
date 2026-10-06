package a;

import android.view.View;
/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class vk0 extends a.gk0 {
    public static final a.fa0 g0;
    public static final /* synthetic */ a.gu0[] h0;
    public static final a.rk0[] i0;
    public a.a5 a0;
    public a.po c0;
    public java.util.ArrayList d0;
    public final a.yq1 W = a.b20.h(2131361998, this);
    public final a.yq1 X = a.b20.h(2131362473, this);
    public final a.yq1 Y = a.b20.h(2131363073, this);
    public final a.yq1 Z = a.b20.h(2131363081, this);
    public int b0 = 1;
    public a.rk0 e0 = a.rk0.c;
    public java.lang.String f0 = "";

    static {
        a.d81 d81Var = new a.d81(a.vk0.class, "app_list", "getApp_list()Landroid/widget/ListView;");
        a.na1.f375a.getClass();
        h0 = new a.gu0[]{d81Var, new a.d81(a.vk0.class, "fab_apps", "getFab_apps()Landroid/view/View;"), new a.d81(a.vk0.class, "select_all", "getSelect_all()Landroid/widget/LinearLayout;"), new a.d81(a.vk0.class, "select_state_all", "getSelect_state_all()Landroid/widget/CheckBox;")};
        g0 = new a.fa0(15, 0);
        i0 = new a.rk0[]{a.rk0.c, a.rk0.d, a.rk0.e, a.rk0.f, a.rk0.g};
    }

    @Override // a.gk0
    public final void C(android.view.View view, android.os.Bundle bundle) {
        a.wv.w(view, "view");
        T().setOnItemLongClickListener(new a.o3(3, this));
        final int i = 0;
        U().setOnClickListener(new a.pk0(this));
        final int i2 = 1;
        V().setOnClickListener(new a.pk0(this));
        a.q10 q10Var = a.q10.f457a;
        if (a.wv.e(a.q10.t(), "basic")) {
            ((android.widget.LinearLayout) this.Y.a(h0[2])).setVisibility(8);
        }
        W();
    }

    public final java.util.ArrayList S() {
        int ordinal = this.e0.ordinal();
        if (ordinal == 1) {
            java.util.ArrayList arrayList = this.d0;
            if (arrayList == null) {
                return null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : arrayList) {
                com.omarea.model.AppInfo appInfo = (com.omarea.model.AppInfo) obj;
                if (appInfo.enabled.booleanValue()) {
                    java.lang.Boolean bool = appInfo.suspended;
                    a.wv.v(bool, "it.suspended");
                    if (bool.booleanValue()) {
                    }
                }
                arrayList2.add(obj);
            }
            return arrayList2;
        }
        if (ordinal == 2) {
            java.util.ArrayList arrayList3 = this.d0;
            if (arrayList3 == null) {
                return null;
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            for (java.lang.Object obj2 : arrayList3) {
                java.lang.Boolean bool2 = ((com.omarea.model.AppInfo) obj2).updated;
                a.wv.v(bool2, "it.updated");
                if (bool2.booleanValue()) {
                    arrayList4.add(obj2);
                }
            }
            return arrayList4;
        }
        if (ordinal != 3) {
            return this.d0;
        }
        java.util.ArrayList arrayList5 = this.d0;
        if (arrayList5 == null) {
            return null;
        }
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        for (java.lang.Object obj3 : arrayList5) {
            com.omarea.model.AppInfo appInfo2 = (com.omarea.model.AppInfo) obj3;
            java.lang.Boolean bool3 = appInfo2.enabled;
            a.wv.v(bool3, "it.enabled");
            if (bool3.booleanValue() && !appInfo2.suspended.booleanValue()) {
                arrayList6.add(obj3);
            }
        }
        return arrayList6;
    }

    public final android.widget.ListView T() {
        return (android.widget.ListView) this.W.a(h0[0]);
    }

    public final android.view.View U() {
        return this.X.a(h0[1]);
    }

    public final android.widget.CheckBox V() {
        return (android.widget.CheckBox) this.Z.a(h0[3]);
    }

    public final void W() {
        if (this.v == null || !this.n) {
            return;
        }
        int i = a.x60.f681a;
        a.wv.M0(a.wv.b(a.z80.b), null, new a.tk0(a.fs1.J(K(), null), this, null), 3);
    }

    public final void X(java.lang.String str) {
        java.util.ArrayList S;
        a.wv.w(str, "value");
        if (a.wv.e(this.f0, str)) {
            return;
        }
        this.f0 = str;
        android.view.View view = this.H;
        android.widget.ListView listView = view != null ? (android.widget.ListView) view.findViewById(2131361998) : null;
        if (listView == null || (S = S()) == null) {
            return;
        }
        a.cp cpVar = com.omarea.Scene.c;
        a.fs1.L(new a.ua0(this, S, listView, 27));
    }

    @Override // a.gk0
    public final android.view.View s(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup) {
        a.wv.w(layoutInflater, "inflater");
        this.c0 = new a.po(L(), true);
        return layoutInflater.inflate(2131558563, viewGroup, false);
    }
}
