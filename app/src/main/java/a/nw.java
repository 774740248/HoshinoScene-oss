package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class nw extends android.app.Activity implements a.mv0, a.ou0 {
    private a.rh1 mExtraDataMap = new a.rh1();
    private androidx.lifecycle.a mLifecycleRegistry = new androidx.lifecycle.a(this);

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        android.view.View decorView = getWindow().getDecorView();
        if (decorView == null || !a.wv.R(decorView, keyEvent)) {
            return a.wv.S(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(android.view.KeyEvent keyEvent) {
        android.view.View decorView = getWindow().getDecorView();
        if (decorView == null || !a.wv.R(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @java.lang.Deprecated
    public <T extends a.lw> T getExtraData(java.lang.Class<T> cls) {
        a.ai1.t(this.mExtraDataMap.getOrDefault(cls, null));
        return null;
    }

    @Override // a.mv0
    public a.gv0 getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Override // android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        int i = a.fb1.d;
        a.fa0.w(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(android.os.Bundle bundle) {
        androidx.lifecycle.a aVar = this.mLifecycleRegistry;
        aVar.getClass();
        aVar.d("markState");
        aVar.g();
        super.onSaveInstanceState(bundle);
    }

    @java.lang.Deprecated
    public void putExtraData(a.lw lwVar) {
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 29) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0061, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 31) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean shouldDumpInternalState(java.lang.String[] r5) {
        /*
            r4 = this;
            r0 = 0
            r1 = 1
            if (r5 == 0) goto L64
            int r2 = r5.length
            if (r2 <= 0) goto L64
            r5 = r5[r0]
            r5.getClass()
            int r2 = r5.hashCode()
            r3 = -1
            switch(r2) {
                case -645125871: goto L41;
                case 100470631: goto L36;
                case 472614934: goto L2b;
                case 1159329357: goto L20;
                case 1455016274: goto L15;
                default: goto L14;
            }
        L14:
            goto L4b
        L15:
            java.lang.String r2 = "--autofill"
            boolean r5 = r5.equals(r2)
            if (r5 != 0) goto L1e
            goto L4b
        L1e:
            r3 = 4
            goto L4b
        L20:
            java.lang.String r2 = "--contentcapture"
            boolean r5 = r5.equals(r2)
            if (r5 != 0) goto L29
            goto L4b
        L29:
            r3 = 3
            goto L4b
        L2b:
            java.lang.String r2 = "--list-dumpables"
            boolean r5 = r5.equals(r2)
            if (r5 != 0) goto L34
            goto L4b
        L34:
            r3 = 2
            goto L4b
        L36:
            java.lang.String r2 = "--dump-dumpable"
            boolean r5 = r5.equals(r2)
            if (r5 != 0) goto L3f
            goto L4b
        L3f:
            r3 = r1
            goto L4b
        L41:
            java.lang.String r2 = "--translation"
            boolean r5 = r5.equals(r2)
            if (r5 != 0) goto L4a
            goto L4b
        L4a:
            r3 = r0
        L4b:
            switch(r3) {
                case 0: goto L5d;
                case 1: goto L58;
                case 2: goto L58;
                case 3: goto L51;
                case 4: goto L4f;
                default: goto L4e;
            }
        L4e:
            goto L64
        L4f:
            r0 = r1
            goto L64
        L51:
            int r5 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r5 < r2) goto L64
            goto L4f
        L58:
            boolean r0 = a.es.a()
            goto L64
        L5d:
            int r5 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r5 < r2) goto L64
            goto L4f
        L64:
            r5 = r0 ^ 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a.nw.shouldDumpInternalState(java.lang.String[]):boolean");
    }

    @Override // a.ou0
    public boolean superDispatchKeyEvent(android.view.KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public void supportInvalidateOptionsMenu() {
        invalidateOptionsMenu();
    }
}
