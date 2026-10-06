package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class fm0 extends a.gk0 implements android.view.View.OnClickListener {
    public static final a.fa0 Z;
    public static final /* synthetic */ a.gu0[] a0;
    public final a.yq1 W = a.b20.h(2131362885, this);
    public final java.lang.String X;
    public final java.util.ArrayList Y;

    static {
        a.d81 d81Var = new a.d81(a.fm0.class, "nav_auto_click", "getNav_auto_click()Lcom/omarea/ui/NavItem;");
        a.na1.f375a.getClass();
        a0 = new a.gu0[]{d81Var};
        Z = new a.fa0(16, 0);
    }

    public fm0() {
        a.q10 q10Var = a.q10.f457a;
        this.X = a.q10.t();
        this.Y = a.b20.f("basic", "adb", "root");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089 A[SYNTHETIC] */
    @Override // a.gk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(android.view.View r17, android.os.Bundle r18) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.fm0.C(android.view.View, android.os.Bundle):void");
    }

    public final void S(java.lang.Runnable runnable) {
        int i = 1;
        try {
            if (L().getPackageManager().getPackageInfo("com.omarea.vaddin", 0) != null) {
                if (com.omarea.xposed.XposedCheck.xposedIsRunning()) {
                    runnable.run();
                    return;
                } else {
                    android.widget.Toast.makeText(f(), m(2131953322), 1).show();
                    return;
                }
            }
        } catch (java.lang.Exception unused) {
        }
        int i2 = a.x60.f681a;
        android.content.Context L = L();
        java.lang.String m = m(2131953323);
        a.wv.v(m, "getString(R.string.scene_addin_miss)");
        java.lang.String m2 = m(2131953324);
        a.wv.v(m2, "getString(R.string.scene_addin_miss_desc)");
        a.fs1.Z(L, m, m2, new a.em0(this, i), null, 16);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r10) {
        /*
            Method dump skipped, instructions count: 1117
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.fm0.onClick(android.view.View):void");
    }

    @Override // a.gk0
    public final android.view.View s(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup) {
        a.wv.w(layoutInflater, "inflater");
        a.q10 q10Var = a.q10.f457a;
        java.lang.String t = a.q10.t();
        int hashCode = t.hashCode();
        int i = 2131558567;
        if (hashCode != 96415) {
            if (hashCode != 3506402) {
                if (hashCode == 93508654) {
                    t.equals("basic");
                }
            } else if (t.equals("root")) {
                i = 2131558565;
            }
        } else if (t.equals("adb")) {
            i = 2131558566;
        }
        return layoutInflater.inflate(i, viewGroup, false);
    }

    @Override // a.gk0
    public final void y() {
        this.F = true;
        if (this.C) {
            return;
        }
        K().setTitle(m(2131951876));
    }
}
