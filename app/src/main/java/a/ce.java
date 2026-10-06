package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ce extends a.uu0 implements a.bp0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityProcess e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ce(com.omarea.vtools.activities.ActivityProcess activityProcess, int i) {
        super(1);
        this.d = i;
        this.e = activityProcess;
    }

    @Override // a.bp0
    public final java.lang.Object i(java.lang.Object obj) {
        a.no1 no1Var = a.no1.f387a;
        com.omarea.vtools.activities.ActivityProcess activityProcess = this.e;
        int i = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                com.omarea.model.ProcessInfo processInfo = (com.omarea.model.ProcessInfo) obj;
                switch (i) {
                    case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                        a.wv.w(processInfo, "process");
                        a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityProcess.x;
                        activityProcess.getClass();
                        a.wv.M0(a.wv.b(a.z80.b), null, new a.ee(processInfo, activityProcess, null), 3);
                        return no1Var;
                    default:
                        a.wv.w(processInfo, "process");
                        a.gu0[] gu0VarArr2 = com.omarea.vtools.activities.ActivityProcess.x;
                        activityProcess.getClass();
                        a.wv.M0(a.wv.b(a.z80.b), null, new a.ee(processInfo, activityProcess, null), 3);
                        return no1Var;
                }
            default:
                com.omarea.model.ProcessInfo processInfo2 = (com.omarea.model.ProcessInfo) obj;
                switch (i) {
                    case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                        a.wv.w(processInfo2, "process");
                        a.gu0[] gu0VarArr3 = com.omarea.vtools.activities.ActivityProcess.x;
                        activityProcess.getClass();
                        a.wv.M0(a.wv.b(a.z80.b), null, new a.ee(processInfo2, activityProcess, null), 3);
                        return no1Var;
                    default:
                        a.wv.w(processInfo2, "process");
                        a.gu0[] gu0VarArr4 = com.omarea.vtools.activities.ActivityProcess.x;
                        activityProcess.getClass();
                        a.wv.M0(a.wv.b(a.z80.b), null, new a.ee(processInfo2, activityProcess, null), 3);
                        return no1Var;
                }
        }
    }
}
