package a;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;



/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class tu1 extends XC_MethodHook {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f566a;
    public final /* synthetic */ int b;

    public /* synthetic */ tu1(int i, int i2) {
        this.f566a = i2;
        this.b = i;
    }

    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        int i = this.f566a;
        int i2 = this.b;
        switch (i) {
            case 1:
                XposedHelpers.setIntField(XposedHelpers.getObjectField(methodHookParam.thisObject, "mDisplayInfo"), "logicalDensityDpi", i2);
                android.util.DisplayMetrics displayMetrics = (android.util.DisplayMetrics) methodHookParam.args[0];
                float f = i2 / 160.0f;
                displayMetrics.scaledDensity = f;
                displayMetrics.densityDpi = i2;
                displayMetrics.density = f;
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                android.util.DisplayMetrics displayMetrics2 = (android.util.DisplayMetrics) XposedHelpers.getObjectField(methodHookParam.thisObject, "mMetrics");
                if (displayMetrics2 != null) {
                    float f2 = i2 / 160.0f;
                    displayMetrics2.scaledDensity = f2;
                    displayMetrics2.densityDpi = i2;
                    displayMetrics2.density = f2;
                    return;
                }
                return;
            case 3:
                methodHookParam.setResult(java.lang.Integer.valueOf(i2));
                return;
            default:
                super.afterHookedMethod(methodHookParam);
                return;
        }
    }

    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        int i = this.f566a;
        int i2 = this.b;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                super.beforeHookedMethod(methodHookParam);
                android.content.Context context = (android.content.Context) methodHookParam.args[0];
                if (context == null) {
                    return;
                }
                try {
                    android.content.res.Configuration configuration = context.getResources().getConfiguration();
                    configuration.densityDpi = i2;
                    context.getResources().updateConfiguration(configuration, context.getResources().getDisplayMetrics());
                    float f = i2 / 160.0f;
                    context.getResources().getDisplayMetrics().density = f;
                    context.getResources().getDisplayMetrics().densityDpi = i2;
                    context.getResources().getDisplayMetrics().scaledDensity = f;
                    return;
                } catch (java.lang.Exception e) {
                    XposedBridge.log(e);
                    return;
                }
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                android.util.DisplayMetrics displayMetrics = (android.util.DisplayMetrics) methodHookParam.getResult();
                if (displayMetrics != null) {
                    float f2 = i2 / 160.0f;
                    displayMetrics.scaledDensity = f2;
                    displayMetrics.densityDpi = i2;
                    displayMetrics.density = f2;
                    return;
                }
                return;
            case 5:
                super.beforeHookedMethod(methodHookParam);
                try {
                    android.content.res.Resources resources = ((android.app.Activity) methodHookParam.thisObject).getWindow().getDecorView().getResources();
                    android.util.DisplayMetrics displayMetrics2 = resources.getDisplayMetrics();
                    android.content.res.Configuration configuration2 = resources.getConfiguration();
                    configuration2.densityDpi = i2;
                    resources.updateConfiguration(configuration2, displayMetrics2);
                    float f3 = i2 / 160.0f;
                    displayMetrics2.density = f3;
                    displayMetrics2.densityDpi = i2;
                    displayMetrics2.scaledDensity = f3;
                    return;
                } catch (java.lang.Exception e2) {
                    XposedBridge.log(e2);
                    return;
                }
            default:
                super.beforeHookedMethod(methodHookParam);
                return;
        }
    }
}
