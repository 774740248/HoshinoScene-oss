package a;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;



/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class su1 extends XC_MethodHook {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f539a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ su1(boolean z, int i) {
        this.f539a = i;
        this.b = z;
    }

    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        switch (this.f539a) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                super.afterHookedMethod(methodHookParam);
                try {
                    if (((java.lang.Boolean) methodHookParam.args[0]).booleanValue()) {
                        XposedHelpers.callMethod(methodHookParam.thisObject, "setForeground", new java.lang.Object[]{java.lang.Boolean.FALSE});
                        return;
                    }
                    return;
                } catch (java.lang.Exception unused) {
                    return;
                }
            default:
                super.afterHookedMethod(methodHookParam);
                if (this.b) {
                    XposedHelpers.callMethod(methodHookParam.thisObject, "stopForeground", new java.lang.Object[]{java.lang.Boolean.TRUE});
                    return;
                }
                return;
        }
    }

    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        switch (this.f539a) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                if (this.b) {
                    methodHookParam.args[0] = java.lang.Boolean.FALSE;
                }
                super.afterHookedMethod(methodHookParam);
                return;
            default:
                super.beforeHookedMethod(methodHookParam);
                return;
        }
    }
}
