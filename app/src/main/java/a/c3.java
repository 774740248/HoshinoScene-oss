package a;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;



/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class c3 extends XC_MethodHook {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f61a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ c3(int i, java.lang.Object obj) {
        this.f61a = i;
        this.b = obj;
    }

    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        android.app.ActivityManager activityManager;
        switch (this.f61a) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                super.afterHookedMethod(methodHookParam);
                methodHookParam.setResult(java.lang.Boolean.TRUE);
                return;
            case 1:
            default:
                super.afterHookedMethod(methodHookParam);
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                super.afterHookedMethod(methodHookParam);
                android.app.Activity activity = (android.app.Activity) methodHookParam.thisObject;
                if (activity == null || (activityManager = (android.app.ActivityManager) activity.getSystemService("activity")) == null) {
                    return;
                }
                for (android.app.ActivityManager.AppTask appTask : activityManager.getAppTasks()) {
                    if (appTask.getTaskInfo().id == activity.getTaskId()) {
                        appTask.setExcludeFromRecents(true);
                    }
                }
                return;
        }
    }

    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        java.lang.Object obj;
        switch (this.f61a) {
            case 1:
                java.lang.Object[] objArr = methodHookParam.args;
                if (objArr.length <= 0 || (obj = objArr[4]) == null) {
                    return;
                }
                android.content.Intent intent = (android.content.Intent) obj;
                java.lang.String str = intent.getPackage();
                android.content.ComponentName component = intent.getComponent();
                if (str == null && component != null) {
                    str = component.getPackageName();
                }
                android.content.Context context = (android.content.Context) methodHookParam.args[0];
                if (str == null || str.equals(context.getPackageName())) {
                    return;
                }
                a.pe peVar = (a.pe) this.b;
                peVar.getClass();
                try {
                    if (((android.content.pm.PackageManager) peVar.c) == null) {
                        peVar.c = context.getApplicationContext().getPackageManager();
                    }
                    if (((java.lang.Boolean) ((android.content.pm.PackageManager) peVar.c).getClass().getMethod("isPackageSuspended", java.lang.String.class).invoke((android.content.pm.PackageManager) peVar.c, str)).booleanValue()) {
                        try {
                            android.net.Uri parse = android.net.Uri.parse("content://com.omarea.vtools.SceneFreezeProvider");
                            android.content.ContentResolver contentResolver = context.getContentResolver();
                            android.content.ContentValues contentValues = new android.content.ContentValues();
                            contentValues.put("packageName", str);
                            if (contentResolver.insert(parse, contentValues) != null) {
                                android.widget.Toast.makeText(context, context.getString(2131952349) + str, 0).show();
                                return;
                            }
                        } catch (java.lang.Exception e) {
                            XposedBridge.log(e);
                        }
                        android.widget.Toast.makeText(context, "Fail to unfreeze: ".concat(str), 0).show();
                        return;
                    }
                    return;
                } catch (java.lang.Exception unused) {
                    return;
                }
            default:
                super.beforeHookedMethod(methodHookParam);
                return;
        }
    }
}
