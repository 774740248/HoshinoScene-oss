package com.omarea.scene_mode;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class ReceiverShortcut extends android.content.BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        java.lang.String stringExtra;
        if (intent == null || !intent.hasExtra("packageName") || (stringExtra = intent.getStringExtra("packageName")) == null || stringExtra.equals(context.getPackageName())) {
            return;
        }
        a.cp cpVar = com.omarea.Scene.c;
        if (a.fs1.s("freeze_suspend", android.os.Build.VERSION.SDK_INT >= 28)) {
            a.tg1 tg1Var = a.me1.m;
            a.tg1.q(stringExtra);
        } else {
            a.tg1 tg1Var2 = a.me1.m;
            a.tg1.e(stringExtra);
        }
    }
}
