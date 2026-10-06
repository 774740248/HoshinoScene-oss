package com.omarea.xposed;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.XSharedPreferences;
import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.IXposedHookZygoteInit;
import de.robv.android.xposed.callbacks.XC_LoadPackage;



/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class XposedInterface implements IXposedHookLoadPackage, IXposedHookZygoteInit {
    private static XSharedPreferences prefs;

    public a.pu1 getAppConfig(java.lang.String str) {
        char c;
        try {
            a.lt0 lt0Var = new a.lt0(prefs.getString(str, "{}"));
            a.pu1 pu1Var = new a.pu1(str);
            java.util.Iterator i = lt0Var.i();
            while (i.hasNext()) {
                java.lang.String str2 = (java.lang.String) i.next();
                switch (str2.hashCode()) {
                    case -743846049:
                        if (str2.equals("webDebug")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 99677:
                        if (str2.equals("dpi")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 539018453:
                        if (str2.equals("excludeRecent")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 848088603:
                        if (str2.equals("smoothScroll")) {
                            c = 2;
                            break;
                        }
                        break;
                }
                c = 65535;
                if (c == 0) {
                    pu1Var.b = lt0Var.d(str2);
                } else if (c == 1) {
                    pu1Var.c = lt0Var.b(str2);
                } else if (c == 2) {
                    pu1Var.d = lt0Var.b(str2);
                } else if (c == 3) {
                    pu1Var.e = lt0Var.b(str2);
                }
            }
            return pu1Var;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007b, code lost:
    
        if (android.hardware.Camera.getNumberOfCameras() > 2) goto L29;
     */
    /* JADX WARN: Type inference failed for: r1v19, types: [a.gy, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam r20) {
        /*
            Method dump skipped, instructions count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.omarea.xposed.XposedInterface.handleLoadPackage(XC_LoadPackage$LoadPackageParam):void");
    }

    public void initZygote(IXposedHookZygoteInit.StartupParam startupParam) {
        XSharedPreferences xSharedPreferences = new XSharedPreferences("com.omarea.vaddin", "xposed");
        prefs = xSharedPreferences;
        xSharedPreferences.makeWorldReadable();
        boolean z = prefs.getBoolean("android_dis_service_foreground", false);
        XposedHelpers.findAndHookMethod(android.app.Service.class, "setForeground", new java.lang.Object[]{java.lang.Boolean.TYPE, new a.su1(z, 0)});
        XposedHelpers.findAndHookMethod(android.app.Service.class, "startForeground", new java.lang.Object[]{java.lang.Integer.TYPE, android.app.Notification.class, new a.su1(z, 1)});
    }
}
