package com.omarea.vtools.activities;

import android.view.View;
/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ActivityAutoClick extends a.p5 {
    public static final /* synthetic */ a.gu0[] m;
    public final a.yq1 d = a.b20.i(this, 2131361946);
    public final a.yq1 e = a.b20.i(this, 2131362906);
    public final a.yq1 f = a.b20.i(this, 2131363087);
    public final a.yq1 g = a.b20.i(this, 2131363088);
    public final a.yq1 h = a.b20.i(this, 2131363111);
    public final a.yq1 i = a.b20.i(this, 2131363112);
    public final a.yq1 j = a.b20.i(this, 2131363113);
    public final a.yq1 k = a.b20.i(this, 2131363114);
    public a.b81 l;

    static {
        a.d81 d81Var = new a.d81(com.omarea.vtools.activities.ActivityAutoClick.class, "ad_skip_blacklist", "getAd_skip_blacklist()Landroid/widget/LinearLayout;");
        a.na1.f375a.getClass();
        m = new a.gu0[]{d81Var, new a.d81(com.omarea.vtools.activities.ActivityAutoClick.class, "nav_scene_service_not_active", "getNav_scene_service_not_active()Landroid/view/View;"), new a.d81(com.omarea.vtools.activities.ActivityAutoClick.class, "settings_auto_allow", "getSettings_auto_allow()Landroid/widget/Switch;"), new a.d81(com.omarea.vtools.activities.ActivityAutoClick.class, "settings_auto_install", "getSettings_auto_install()Landroid/widget/Switch;"), new a.d81(com.omarea.vtools.activities.ActivityAutoClick.class, "settings_quickly_grant", "getSettings_quickly_grant()Landroid/widget/Switch;"), new a.d81(com.omarea.vtools.activities.ActivityAutoClick.class, "settings_skip_ad", "getSettings_skip_ad()Landroid/widget/Switch;"), new a.d81(com.omarea.vtools.activities.ActivityAutoClick.class, "settings_skip_ad_panel", "getSettings_skip_ad_panel()Lcom/omarea/ui/BlurViewLinearLayout;"), new a.d81(com.omarea.vtools.activities.ActivityAutoClick.class, "settings_skip_ad_precise", "getSettings_skip_ad_precise()Landroid/widget/Switch;")};
    }

    public static void o(android.widget.Switch r2, android.content.SharedPreferences sharedPreferences, java.lang.String str) {
        r2.setChecked(sharedPreferences.getBoolean(str, false));
        r2.setOnClickListener(new a.wi(sharedPreferences, 17, str));
    }

    @Override // a.p5, a.kk0, androidx.activity.ComponentActivity, a.nw, android.app.Activity
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131558441);
        setBackArrow();
        this.l = new a.b81(this, null);
        a.gu0[] gu0VarArr = m;
        android.widget.Switch r0 = (android.widget.Switch) this.g.a(gu0VarArr[3]);
        a.cp cpVar = com.omarea.Scene.c;
        o(r0, a.fs1.D(), "is_auto_install");
        o((android.widget.Switch) this.f.a(gu0VarArr[2]), a.fs1.D(), "is_auto_allow");
        a.gu0 gu0Var = gu0VarArr[5];
        a.yq1 yq1Var = this.i;
        o((android.widget.Switch) yq1Var.a(gu0Var), a.fs1.D(), "is_skip_ad");
        a.gu0 gu0Var2 = gu0VarArr[7];
        a.yq1 yq1Var2 = this.k;
        o((android.widget.Switch) yq1Var2.a(gu0Var2), a.fs1.D(), "is_skip_ad_precise2");
        o((android.widget.Switch) this.h.a(gu0VarArr[4]), a.fs1.D(), "quickly_grant");
        ((android.widget.Switch) yq1Var.a(gu0VarArr[5])).setOnCheckedChangeListener(new a.j5(this));
        final int i = 1;
        ((android.widget.Switch) yq1Var2.a(gu0VarArr[7])).setOnCheckedChangeListener(new a.j5(this));
        ((android.widget.LinearLayout) this.d.a(gu0VarArr[0])).setOnClickListener(new a.k5(this));
        com.omarea.ui.BlurViewLinearLayout blurViewLinearLayout = (com.omarea.ui.BlurViewLinearLayout) this.j.a(gu0VarArr[6]);
        java.util.Locale locale = a.fs1.t().getResources().getConfiguration().getLocales().get(0);
        a.wv.v(locale, "{\n                contex…ales.get(0)\n            }");
        java.lang.String language = locale.getLanguage();
        a.wv.v(language, "locale.language");
        blurViewLinearLayout.setVisibility(a.yi1.B2(language, "zh") ? 0 : 8);
        this.e.a(gu0VarArr[1]).setOnClickListener(new a.k5(this));
    }

    @Override // a.p5, a.kk0, android.app.Activity
    public final void onResume() {
        super.onResume();
        setTitle(getString(2131952891));
        p();
    }

    public final void p() {
        boolean z;
        android.content.Context context = getContext();
        a.wv.w(context, "context");
        java.lang.Object systemService = context.getSystemService("accessibility");
        a.wv.t(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        java.util.Iterator<android.accessibilityservice.AccessibilityServiceInfo> it = ((android.view.accessibility.AccessibilityManager) systemService).getEnabledAccessibilityServiceList(-1).iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            java.lang.String id = it.next().getId();
            a.wv.v(id, "serviceInfo.id");
            if (a.yi1.h2(id, "AccessibilitySceneMode", false)) {
                z = true;
                break;
            }
        }
        this.e.a(m[1]).setVisibility(z ? 8 : 0);
    }
}
