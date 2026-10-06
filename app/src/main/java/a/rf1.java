package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class rf1 extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public android.content.Context f494a;
    public long b;

    public static final boolean a(a.rf1 rf1Var) {
        java.lang.Object systemService = rf1Var.f494a.getSystemService("keyguard");
        a.wv.t(systemService, "null cannot be cast to non-null type android.app.KeyguardManager");
        android.app.KeyguardManager keyguardManager = (android.app.KeyguardManager) systemService;
        try {
            if (keyguardManager.isKeyguardLocked() || keyguardManager.inKeyguardRestrictedInputMode()) {
                return true;
            }
            java.util.ArrayList arrayList = a.dc0.f93a;
            a.dc0.a(a.kc0.j, null);
            a.oq0.l = true;
            return true;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0042, code lost:
    
        r2 = java.lang.System.currentTimeMillis();
        r6.b = java.lang.System.currentTimeMillis();
        a.wv.M0(a.wv.b(a.z80.b), null, new a.qf1(r2, r6, null), 3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
    
        if (r8.equals("android.intent.action.SCREEN_ON") == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        if (r8.equals("android.intent.action.USER_UNLOCKED") == false) goto L24;
     */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onReceive(android.content.Context r7, android.content.Intent r8) {
        /*
            r6 = this;
            if (r8 != 0) goto L3
            return
        L3:
            android.content.BroadcastReceiver$PendingResult r7 = r6.goAsync()
            java.lang.String r8 = r8.getAction()
            if (r8 == 0) goto L75
            int r0 = r8.hashCode()
            r1 = 0
            switch(r0) {
                case -2128145023: goto L5c;
                case -1454123155: goto L39;
                case 823795052: goto L1f;
                case 833559602: goto L16;
                default: goto L15;
            }
        L15:
            goto L75
        L16:
            java.lang.String r0 = "android.intent.action.USER_UNLOCKED"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L42
            goto L75
        L1f:
            java.lang.String r0 = "android.intent.action.USER_PRESENT"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L28
            goto L75
        L28:
            long r2 = java.lang.System.currentTimeMillis()
            r6.b = r2
            java.util.ArrayList r8 = a.dc0.f93a
            a.kc0 r8 = a.kc0.j
            a.dc0.a(r8, r1)
            r8 = 1
            a.oq0.l = r8
            goto L75
        L39:
            java.lang.String r0 = "android.intent.action.SCREEN_ON"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L42
            goto L75
        L42:
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = java.lang.System.currentTimeMillis()
            r6.b = r4
            a.k20 r8 = a.z80.b
            a.ay r8 = a.wv.b(r8)
            a.qf1 r0 = new a.qf1
            r0.<init>(r2, r6, r1)
            r2 = 3
            a.wv.M0(r8, r1, r0, r2)
            goto L75
        L5c:
            java.lang.String r0 = "android.intent.action.SCREEN_OFF"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L65
            goto L75
        L65:
            long r2 = java.lang.System.currentTimeMillis()
            r6.b = r2
            java.util.ArrayList r8 = a.dc0.f93a
            a.kc0 r8 = a.kc0.k
            a.dc0.a(r8, r1)
            r8 = 0
            a.oq0.l = r8
        L75:
            r7.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.rf1.onReceive(android.content.Context, android.content.Intent):void");
    }
}
