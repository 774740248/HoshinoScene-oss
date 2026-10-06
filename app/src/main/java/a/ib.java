package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ib extends a.a31 {
    public final /* synthetic */ int d;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityMain e;

    /* [修复] 从 smali 还原：super 只能调用一次，i==1→super(false)，否则 super(true) */
    public ib(com.omarea.vtools.activities.ActivityMain activityMain, int i) {
        super(i != 1);
        this.d = i;
        this.e = activityMain;
    }

    @Override // a.a31
    public final void a() {
        int i = this.d;
        com.omarea.vtools.activities.ActivityMain activityMain = this.e;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.p5.excludeFromRecent$default(activityMain, false, 1, null);
                activityMain.finishAfterTransition();
                return;
            default:
                try {
                    a.am0 supportFragmentManager = activityMain.getSupportFragmentManager();
                    supportFragmentManager.getClass();
                    supportFragmentManager.s(new a.zl0(supportFragmentManager, -1, 0), false);
                    return;
                } catch (java.lang.Exception unused) {
                    return;
                }
        }
    }
}
