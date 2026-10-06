package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class a4 extends a.uu0 implements a.fp0 {
    public static final a.a4 e = new a.a4(0);
    public static final a.a4 f = new a.a4(1);
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a4(int i) {
        super(2);
        this.d = i;
    }

    public final java.lang.Integer a(com.omarea.model.AppInfo appInfo, com.omarea.model.AppInfo appInfo2) {
        java.lang.String obj;
        java.lang.String obj2;
        java.lang.String obj3;
        java.lang.String obj4;
        int i = 1;
        int i2 = 0;
        switch (this.d) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                try {
                    obj = appInfo.stateTags.toString();
                    obj2 = appInfo2.stateTags.toString();
                } catch (java.lang.Exception unused) {
                }
                if (obj.compareTo(obj2) >= 0) {
                    if (obj.compareTo(obj2) <= 0) {
                        java.lang.String packageName = appInfo.getPackageName();
                        java.lang.String packageName2 = appInfo2.getPackageName();
                        if (packageName.compareTo(packageName2) >= 0) {
                            if (packageName.compareTo(packageName2) <= 0) {
                                i = 0;
                            }
                        }
                    }
                    i2 = i;
                    return java.lang.Integer.valueOf(i2);
                }
                i = -1;
                i2 = i;
                return java.lang.Integer.valueOf(i2);
            default:
                try {
                    obj3 = appInfo.stateTags.toString();
                    obj4 = appInfo2.stateTags.toString();
                } catch (java.lang.Exception unused2) {
                }
                if (obj3.compareTo(obj4) >= 0) {
                    if (obj3.compareTo(obj4) <= 0) {
                        java.lang.String packageName3 = appInfo.getPackageName();
                        java.lang.String packageName4 = appInfo2.getPackageName();
                        if (packageName3.compareTo(packageName4) >= 0) {
                            if (packageName3.compareTo(packageName4) <= 0) {
                                i = 0;
                            }
                        }
                    }
                    i2 = i;
                    return java.lang.Integer.valueOf(i2);
                }
                i = -1;
                i2 = i;
                return java.lang.Integer.valueOf(i2);
        }
    }

    @Override // a.fp0
    public final /* bridge */ /* synthetic */ java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.d) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                return a((com.omarea.model.AppInfo) obj, (com.omarea.model.AppInfo) obj2);
            default:
                return a((com.omarea.model.AppInfo) obj, (com.omarea.model.AppInfo) obj2);
        }
    }
}
