package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class h21 {
    public static final a.h21 b = new a.h21();

    /* renamed from: a, reason: collision with root package name */
    public final a.fa0 f199a;

    public h21() {
        this.f199a = android.os.Build.VERSION.SDK_INT >= 28 ? new a.fa0(4) : "huawei".equals((java.lang.String) a.wv.o0().d) ? new a.fa0(5) : "oppo".equals((java.lang.String) a.wv.o0().d) ? new a.fa0(7) : "vivo".equals((java.lang.String) a.wv.o0().d) ? new a.fa0(5) : "xiaomi".equals((java.lang.String) a.wv.o0().d) ? new a.fa0(6) : null;
    }

    public final void a(android.app.Activity activity) {
        a.fa0 fa0Var = this.f199a;
        if (fa0Var != null) {
            switch (fa0Var.c) {
                case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                    android.view.Window window = activity.getWindow();
                    android.view.WindowManager.LayoutParams attributes = window.getAttributes();
                    attributes.layoutInDisplayCutoutMode = 1;
                    window.setAttributes(attributes);
                    window.getDecorView().setSystemUiVisibility(1280);
                    return;
                case 5:
                    android.view.Window window2 = activity.getWindow();
                    android.view.WindowManager.LayoutParams attributes2 = window2.getAttributes();
                    java.lang.Class<?> cls = java.lang.Class.forName("com.huawei.android.view.LayoutParamsEx");
                    cls.getMethod("addHwFlags", java.lang.Integer.TYPE).invoke(cls.getConstructor(android.view.WindowManager.LayoutParams.class).newInstance(attributes2), 65536);
                    window2.getWindowManager().updateViewLayout(window2.getDecorView(), window2.getDecorView().getLayoutParams());
                    return;
                case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                    try {
                        android.view.Window.class.getMethod("addExtraFlags", java.lang.Integer.TYPE).invoke(activity.getWindow(), 1792);
                        return;
                    } catch (java.lang.Throwable unused) {
                        return;
                    }
                default:
                    return;
            }
        }
    }
}
