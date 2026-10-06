package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class tf implements a.n70 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f555a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ tf(int i, java.lang.Object obj) {
        this.f555a = i;
        this.b = obj;
    }

    public final java.lang.Object a(java.lang.String str, a.ey eyVar, boolean z) {
        a.no1 no1Var = a.no1.f387a;
        a.dz dzVar = a.dz.c;
        int i = this.f555a;
        java.lang.Object obj = this.b;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                if (str == null) {
                    a.cp cpVar = com.omarea.Scene.c;
                    a.fs1.D().edit().remove("user_name").apply();
                } else {
                    a.cp cpVar2 = com.omarea.Scene.c;
                    a.fs1.D().edit().putString("user_name", str).apply();
                }
                a.u20 u20Var = a.z80.f728a;
                java.lang.Object S1 = a.wv.S1(a.by0.f57a, new a.sf((com.omarea.vtools.activities.ActivityStartSplash) obj, null, z), eyVar);
                return S1 == dzVar ? S1 : no1Var;
            case 1:
                if (str == null) {
                    a.cp cpVar3 = com.omarea.Scene.c;
                    a.fs1.D().edit().remove("user_name").apply();
                } else {
                    a.cp cpVar4 = com.omarea.Scene.c;
                    a.fs1.D().edit().putString("user_name", str).apply();
                }
                a.u20 u20Var2 = a.z80.f728a;
                java.lang.Object S12 = a.wv.S1(a.by0.f57a, new a.h50((a.i50) obj, null), eyVar);
                return S12 == dzVar ? S12 : no1Var;
            default:
                if (str == null) {
                    a.cp cpVar5 = com.omarea.Scene.c;
                    a.fs1.D().edit().remove("user_name").apply();
                } else {
                    a.cp cpVar6 = com.omarea.Scene.c;
                    a.fs1.D().edit().putString("user_name", str).apply();
                }
                a.u20 u20Var3 = a.z80.f728a;
                java.lang.Object S13 = a.wv.S1(a.by0.f57a, new a.yn0((a.jo0) obj, null), eyVar);
                return S13 == dzVar ? S13 : no1Var;
        }
    }
}
