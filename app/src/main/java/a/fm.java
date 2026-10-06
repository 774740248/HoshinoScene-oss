package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class fm extends a.hm {
    public final /* synthetic */ int c = 1;
    public final /* synthetic */ a.km d;
    public final java.lang.Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fm(a.km kmVar, a.nk nkVar) {
        super(kmVar);
        this.d = kmVar;
        this.e = nkVar;
    }

    @Override // a.hm
    public final android.content.IntentFilter c() {
        switch (this.c) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                android.content.IntentFilter intentFilter = new android.content.IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                android.content.IntentFilter intentFilter2 = new android.content.IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ea, code lost:
    
        if (r1 < 22) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x00d1, code lost:
    
        if (r1 != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object, a.bo1] */
    @Override // a.hm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d() {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.fm.d():int");
    }

    @Override // a.hm
    public final void f() {
        int i = this.c;
        a.km kmVar = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                kmVar.p(true, true);
                return;
            default:
                kmVar.p(true, true);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fm(a.km kmVar, android.content.Context context) {
        super(kmVar);
        this.d = kmVar;
        this.e = (android.os.PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
