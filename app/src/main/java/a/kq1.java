package a;
import de.robv.android.xposed.XC_MethodHook;



/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class kq1 extends XC_MethodHook {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f300a;
    public final /* synthetic */ a.gy b;

    public /* synthetic */ kq1(a.gy gyVar, int i) {
        this.f300a = i;
        this.b = gyVar;
    }

    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        switch (this.f300a) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                methodHookParam.setResult(4);
                return;
            case 1:
                java.lang.Object[] objArr = methodHookParam.args;
                if (objArr == null) {
                    return;
                }
                android.content.res.Resources resources = ((android.content.Context) objArr[0]).getResources();
                float f = resources.getDisplayMetrics().density;
                if (resources.getConfiguration().isLayoutSizeAtLeast(4)) {
                    a.gy.q = f * 1.5f;
                    return;
                } else {
                    a.gy.q = f;
                    return;
                }
            case 8:
                methodHookParam.setResult(200);
                return;
            case 9:
                methodHookParam.setResult(100);
                return;
            default:
                super.afterHookedMethod(methodHookParam);
                return;
        }
    }

    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        int i = this.f300a;
        a.gy gyVar = this.b;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                gyVar.getClass();
                methodHookParam.setResult(3000);
                return;
            case 3:
                methodHookParam.setResult(5);
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                gyVar.getClass();
                float f = a.gy.q;
                if (f == -1.0f) {
                    methodHookParam.setResult(3000);
                    return;
                } else {
                    methodHookParam.setResult(java.lang.Integer.valueOf((int) ((f * 3000.0f) + 0.5f)));
                    return;
                }
            case 5:
                gyVar.getClass();
                methodHookParam.setResult(java.lang.Float.valueOf(0.012f));
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                gyVar.getClass();
                float f2 = a.gy.q;
                if (f2 == -1.0f) {
                    methodHookParam.setResult(150);
                    return;
                } else {
                    methodHookParam.setResult(java.lang.Integer.valueOf((int) ((f2 * 150.0f) + 0.5f)));
                    return;
                }
            case 7:
                gyVar.getClass();
                float f3 = a.gy.q;
                if (f3 == -1.0f) {
                    methodHookParam.setResult(150);
                    return;
                } else {
                    methodHookParam.setResult(java.lang.Integer.valueOf((int) ((f3 * 150.0f) + 0.5f)));
                    return;
                }
            default:
                super.beforeHookedMethod(methodHookParam);
                return;
        }
    }
}
