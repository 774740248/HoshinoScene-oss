package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class of extends a.uu0 implements a.qo0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityStartSplash e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ of(com.omarea.vtools.activities.ActivityStartSplash activityStartSplash, int i) {
        super(0);
        this.d = i;
        this.e = activityStartSplash;
    }

    @Override // a.qo0
    public final java.lang.Object b() {
        int i = this.d;
        com.omarea.vtools.activities.ActivityStartSplash activityStartSplash = this.e;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.w1 w1Var = new a.w1(0, activityStartSplash);
                a.fa0 fa0Var = com.omarea.vtools.activities.ActivityStartSplash.q;
                return new a.i50(activityStartSplash, w1Var, (a.b81) activityStartSplash.k.a());
            case 1:
                return new a.tf(0, activityStartSplash);
            default:
                return new a.b81(activityStartSplash, null);
        }
    }
}
