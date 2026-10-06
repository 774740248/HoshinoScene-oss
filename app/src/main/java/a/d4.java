package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class d4 implements a.a5, a.ij0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ a.p5 d;

    public /* synthetic */ d4(a.p5 p5Var, int i) {
        this.c = i;
        this.d = p5Var;
    }

    @Override // a.a5
    public void a() {
        int i = this.c;
        a.p5 p5Var = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.u20 u20Var = a.z80.f728a;
                a.wv.M0(a.wv.b(a.by0.f57a), null, new a.c4((com.omarea.vtools.activities.ActivityAppContents) p5Var, null), 3);
                return;
            default:
                a.u20 u20Var2 = a.z80.f728a;
                a.wv.M0(a.wv.b(a.by0.f57a), null, new a.b5((com.omarea.vtools.activities.ActivityApplications) p5Var, null), 3);
                return;
        }
    }

    public java.lang.String b() {
        switch (this.c) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                android.content.SharedPreferences sharedPreferences = ((com.omarea.vtools.activities.ActivityChargeControl) this.d).H;
                if (sharedPreferences != null) {
                    return a.ai1.c(sharedPreferences.getInt("charge_limit_ma", 3000), "mA");
                }
                a.wv.M1("spf");
                throw null;
            default:
                return "";
        }
    }

    public void c(java.lang.String str) {
        int i = this.c;
        a.p5 p5Var = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.wv.w(str, "value");
                java.lang.String obj = a.yi1.F2(str).toString();
                java.util.Locale locale = java.util.Locale.ENGLISH;
                java.lang.String v2 = a.yi1.v2(a.ai1.k(locale, "ENGLISH", obj, locale, "this as java.lang.String).toLowerCase(locale)"), "ma", "");
                try {
                    int parseInt = java.lang.Integer.parseInt(v2);
                    android.content.SharedPreferences sharedPreferences = ((com.omarea.vtools.activities.ActivityChargeControl) p5Var).H;
                    if (sharedPreferences == null) {
                        a.wv.M1("spf");
                        throw null;
                    }
                    sharedPreferences.edit().putInt("charge_limit_ma", java.lang.Integer.parseInt(v2)).apply();
                    android.content.SharedPreferences sharedPreferences2 = ((com.omarea.vtools.activities.ActivityChargeControl) p5Var).H;
                    if (sharedPreferences2 == null) {
                        a.wv.M1("spf");
                        throw null;
                    }
                    if (sharedPreferences2.getBoolean("qc_booster", false)) {
                        a.wv.M0(a.wv.b(a.z80.b), null, new a.y5((com.omarea.vtools.activities.ActivityChargeControl) p5Var, parseInt, null), 3);
                    }
                    ((com.omarea.vtools.activities.ActivityChargeControl) p5Var).p().setProgress(parseInt / 100);
                    ((com.omarea.vtools.activities.ActivityChargeControl) p5Var).getClass();
                    com.omarea.vtools.activities.ActivityChargeControl.r();
                    return;
                } catch (java.lang.Exception unused) {
                    return;
                }
            default:
                a.wv.w(str, "value");
                java.util.Locale locale2 = java.util.Locale.ENGLISH;
                java.lang.String k = a.ai1.k(locale2, "ENGLISH", str, locale2, "this as java.lang.String).toLowerCase(locale)");
                a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityModules.o;
                a.e91 adapter = ((com.omarea.vtools.activities.ActivityModules) p5Var).o().getAdapter();
                a.wv.t(adapter, "null cannot be cast to non-null type com.omarea.ui.AdapterModules");
                ((a.ej) adapter).j.filter(k);
                return;
        }
    }

    @Override // a.ij0
    public /* bridge */ /* synthetic */ java.lang.Object getValue() {
        switch (this.c) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                return b();
            default:
                return b();
        }
    }

    @Override // a.ij0
    public /* bridge */ /* synthetic */ void setValue(java.lang.Object obj) {
        switch (this.c) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                c((java.lang.String) obj);
                return;
            default:
                c((java.lang.String) obj);
                return;
        }
    }
}
