package com.omarea.vtools.activities;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ActivityScreenTest extends a.p5 {
    public static final /* synthetic */ a.gu0[] g;
    public final a.yq1 d = a.b20.i(this, 2131362424);
    public final a.yq1 e = a.b20.i(this, 2131362425);
    public final a.yq1 f = a.b20.i(this, 2131362426);

    static {
        a.d81 d81Var = new a.d81(com.omarea.vtools.activities.ActivityScreenTest.class, "display_go", "getDisplay_go()Landroid/widget/Button;");
        a.na1.f375a.getClass();
        g = new a.gu0[]{d81Var, new a.d81(com.omarea.vtools.activities.ActivityScreenTest.class, "display_info", "getDisplay_info()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityScreenTest.class, "display_test", "getDisplay_test()Lcom/omarea/ui/ScreenTest;")};
    }

    public final com.omarea.ui.ScreenTest o() {
        return (com.omarea.ui.ScreenTest) this.f.a(g[2]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x009e, code lost:
    
        r2 = r0.getCutout();
     */
    @Override // a.p5, a.kk0, androidx.activity.ComponentActivity, a.nw, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r11) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.omarea.vtools.activities.ActivityScreenTest.onCreate(android.os.Bundle):void");
    }

    @Override // a.ml, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, android.view.KeyEvent keyEvent) {
        if (i == 4) {
            return super.onKeyDown(i, keyEvent);
        }
        if (o().getVisibility() == 0) {
            o().setVisibility(8);
            return true;
        }
        getOnBackPressedDispatcher().onBackPressed();
        return true;
    }

    @Override // a.p5, a.kk0, android.app.Activity
    public final void onResume() {
        super.onResume();
        setTitle(getString(2131952922));
        a.ju1 h = a.jq1.h(getWindow().getDecorView());
        if (h != null) {
            h.f271a.v(7);
        }
        a.h21.b.a(this);
    }
}
