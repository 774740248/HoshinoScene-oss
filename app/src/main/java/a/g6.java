package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class g6 implements java.lang.Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ android.app.Activity d;

    public /* synthetic */ g6(android.app.Activity activity, int i) {
        this.c = i;
        this.d = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object obj;
        int i = this.c;
        android.app.Activity activity = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                if (activity.isFinishing()) {
                    return;
                }
                int i2 = android.os.Build.VERSION.SDK_INT;
                if (i2 >= 28) {
                    java.lang.Class cls = a.le.f317a;
                    activity.recreate();
                    return;
                }
                java.lang.Class cls2 = a.le.f317a;
                boolean z = i2 == 26 || i2 == 27;
                java.lang.reflect.Method method = a.le.f;
                if ((!z || method != null) && (a.le.e != null || a.le.d != null)) {
                    try {
                        java.lang.Object obj2 = a.le.c.get(activity);
                        if (obj2 != null && (obj = a.le.b.get(activity)) != null) {
                            android.app.Application application = activity.getApplication();
                            a.ke keVar = new a.ke(activity);
                            application.registerActivityLifecycleCallbacks(keVar);
                            android.os.Handler handler = a.le.g;
                            handler.post(new a.g2(keVar, obj2, 1));
                            try {
                                if (i2 == 26 || i2 == 27) {
                                    java.lang.Boolean bool = java.lang.Boolean.FALSE;
                                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                } else {
                                    activity.recreate();
                                }
                                handler.post(new a.g2(application, keVar, 2));
                                return;
                            } finally {
                                handler.post(new a.g2(application, keVar, 2));
                            }
                        }
                    } catch (java.lang.Throwable unused) {
                    }
                }
                activity.recreate();
                return;
            default:
                a.wv.w(activity, "$activity");
                try {
                    activity.startActivity(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse("https://omarea.com/#/platform")));
                    return;
                } catch (android.content.ActivityNotFoundException unused2) {
                    a.cp cpVar = com.omarea.Scene.c;
                    a.fs1.X("未找到可打开链接的应用", 0);
                    return;
                }
        }
    }
}
