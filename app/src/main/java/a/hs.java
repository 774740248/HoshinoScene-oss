package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class hs implements java.lang.Runnable {
    public final /* synthetic */ int c;

    public /* synthetic */ hs(int i) {
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.c) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                android.os.Process.killProcess(android.os.Process.myPid());
                return;
            case 1:
                a.wk wkVar = a.wk.c;
                a.wk.b(true);
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
            case 3:
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityActionPage.o;
                return;
            case 5:
                a.gu0[] gu0VarArr2 = com.omarea.vtools.activities.ActivityCommandList.f;
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                a.gu0[] gu0VarArr3 = com.omarea.vtools.activities.ActivityCommandList.f;
                return;
            case 7:
                return;
            case 8:
                a.gu0[] gu0VarArr4 = com.omarea.vtools.activities.ActivityCustomCommand.h;
                return;
            case 9:
                a.gu0[] gu0VarArr5 = com.omarea.vtools.activities.ActivityCustomCommand.h;
                return;
            case 10:
                a.gu0[] gu0VarArr6 = com.omarea.vtools.activities.ActivityPerfBench.z;
                return;
            case 11:
                a.gu0[] gu0VarArr7 = com.omarea.vtools.activities.ActivityPerfBench.z;
                return;
            case 12:
                return;
            case 13:
                a.gu0[] gu0VarArr8 = com.omarea.vtools.activities.ActivitySwap.W;
                return;
            case 14:
                a.gu0[] gu0VarArr9 = com.omarea.vtools.activities.ActivitySwap.W;
                return;
            case 15:
            case 16:
            case 17:
            case 18:
                return;
            default:
                android.view.WindowManager windowManager = a.hh0.d;
                return;
        }
    }
}
