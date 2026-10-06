package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class oc extends a.uu0 implements a.qo0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityOtherSettings e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oc(int i, com.omarea.vtools.activities.ActivityOtherSettings activityOtherSettings) {
        super(0);
        this.d = i;
        this.e = activityOtherSettings;
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [a.ng1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v11, types: [a.ng1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [a.ng1, java.lang.Object] */
    @Override // a.qo0
    public final java.lang.Object b() {
        int i = this.d;
        com.omarea.vtools.activities.ActivityOtherSettings activityOtherSettings = this.e;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                android.content.pm.PackageManager packageManager = activityOtherSettings.getPackageManager();
                a.cp cpVar = com.omarea.Scene.c;
                java.lang.String str = packageManager.getPackageInfo(a.fs1.t().getPackageName(), 0).versionName;
                java.lang.String str2 = a.pe0.f434a + "/scene_" + str + "_strings_%s.xml";
                a.ng1 obj = new a.ng1();
                obj.f381a = java.util.Locale.SIMPLIFIED_CHINESE.getDisplayName();
                java.lang.String l = a.ai1.l(new java.lang.Object[]{"zh"}, 1, str2, "format(this, *args)");
                obj.c = l;
                obj.b = l;
                a.ng1 obj2 = new a.ng1();
                java.util.Locale locale = java.util.Locale.ENGLISH;
                obj2.f381a = locale.getDisplayName(locale);
                java.lang.String l2 = a.ai1.l(new java.lang.Object[]{"en"}, 1, str2, "format(this, *args)");
                obj2.c = l2;
                obj2.b = l2;
                java.util.ArrayList f = a.b20.f(obj, obj2);
                a.vj1 vj1Var = a.nb1.d;
                if (a.gy.x().b()) {
                    a.ng1 obj3 = new a.ng1();
                    obj3.f381a = activityOtherSettings.getString(2131953493);
                    java.lang.String l3 = a.ai1.l(new java.lang.Object[]{"override"}, 1, str2, "format(this, *args)");
                    obj3.c = l3;
                    obj3.b = l3;
                    f.add(obj3);
                }
                a.e70 S = a.fs1.S(activityOtherSettings, f, 0, new a.lc1(activityOtherSettings, f, 10));
                java.lang.String string = activityOtherSettings.getString(2131953495);
                a.wv.v(string, "getString(R.string.setti…_language_package_export)");
                S.j = string;
                S.e();
                S.c();
                return a.no1.f387a;
            default:
                return new a.xe1(activityOtherSettings);
        }
    }
}
