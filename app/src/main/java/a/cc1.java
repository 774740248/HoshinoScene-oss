package a;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;



/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class cc1 extends XC_MethodHook {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f67a;

    /* [修复] 从 smali 还原：cc1.smali 存在 synthetic <init>(I)V，jadx 未生成，此处补齐 */
    public /* synthetic */ cc1(int i) {
        this.f67a = i;
    }

    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        switch (this.f67a) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                XposedHelpers.callMethod(methodHookParam.thisObject, "setItemViewCacheSize", new java.lang.Object[]{0});
                return;
            case 1:
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                XposedHelpers.setObjectField(methodHookParam.thisObject, "mHardwareAccelerated", java.lang.Boolean.FALSE);
                return;
            default:
                super.afterHookedMethod(methodHookParam);
                return;
        }
    }

    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        switch (this.f67a) {
            case 1:
                methodHookParam.args[0] = 0;
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
            default:
                super.beforeHookedMethod(methodHookParam);
                return;
            case 3:
                methodHookParam.args[3] = java.lang.Boolean.FALSE;
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                methodHookParam.args[0] = java.lang.Integer.valueOf(((java.lang.Integer) methodHookParam.args[0]).intValue() & (-16777217));
                return;
        }
    }
}
