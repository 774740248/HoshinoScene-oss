package com.omarea.vtools.activities;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ActivityPowerModeTile extends a.ml {
    public final a.vj1 c = new a.vj1(a.b4.j);
    public final a.vj1 d = new a.vj1(new a.cd1(24, this));

    @Override // a.kk0, androidx.activity.ComponentActivity, a.nw, android.app.Activity
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (a.b11.d()) {
            if (((java.lang.Boolean) this.d.a()).booleanValue()) {
                a.vj1 vj1Var = a.oq0.c;
                if (a.oq0.b().length() > 0) {
                    a.cp cpVar = com.omarea.Scene.c;
                    sendBroadcast(new android.content.Intent(a.fs1.t(), (java.lang.Class<?>) com.omarea.scene_mode.ReceiverSceneMode.class));
                }
            }
            a.cp cpVar2 = com.omarea.Scene.c;
            a.fs1.X("性能调节未启用", 0);
        } else {
            android.widget.Toast.makeText(this, getString(2131953074), 0).show();
        }
        finish();
    }

    @Override // a.ml, a.kk0, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        finishAffinity();
    }
}
