package a;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;



/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class os1 extends XC_MethodHook {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f421a;

    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        switch (this.f421a) {
            case 1:
                super.afterHookedMethod(methodHookParam);
                XposedHelpers.callMethod(methodHookParam.thisObject, "setLayerType", new java.lang.Object[]{2, null});
                return;
            default:
                super.afterHookedMethod(methodHookParam);
                return;
        }
    }

    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        switch (this.f421a) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                methodHookParam.args[0] = java.lang.Boolean.TRUE;
                return;
            case 1:
                try {
                    XposedHelpers.callStaticMethod(android.webkit.WebView.class, "setWebContentsDebuggingEnabled", new java.lang.Object[]{java.lang.Boolean.TRUE});
                    return;
                } catch (java.lang.Exception unused) {
                    return;
                }
            default:
                methodHookParam.args[0] = 2;
                return;
        }
    }
}
