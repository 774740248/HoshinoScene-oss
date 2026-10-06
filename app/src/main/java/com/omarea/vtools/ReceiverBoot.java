package com.omarea.vtools;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ReceiverBoot extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f765a;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        a.wv.w(context, "context");
        a.wv.w(intent, "intent");
        if (f765a) {
            return;
        }
        f765a = true;
        if (true ^ new a.ep1(context).a()) {
            return;
        }
        try {
            context.startService(new android.content.Intent(context, (java.lang.Class<?>) com.omarea.vtools.services.BootService.class));
        } catch (java.lang.Exception unused) {
        }
    }
}
