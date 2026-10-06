package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class lc1 extends a.uu0 implements a.bp0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ java.lang.Object e;
    public final /* synthetic */ java.lang.Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lc1(java.lang.Object obj, int i, java.lang.Object obj2) {
        super(1);
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    public final void a(int i) {
        android.content.res.Resources c;
        int i2 = this.d;
        int i3 = 2;
        java.lang.Object obj = this.f;
        java.lang.Object obj2 = this.e;
        switch (i2) {
            case 8:
                a.ja1 ja1Var = (a.ja1) obj2;
                float f = (i / 100.0f) + 1;
                ja1Var.c = f;
                a.cp cpVar = com.omarea.Scene.c;
                a.fs1.D().edit().putFloat("monitor_general2_scale", f).commit();
                com.omarea.vtools.activities.ActivityMonitorDesigner activityMonitorDesigner = (com.omarea.vtools.activities.ActivityMonitorDesigner) obj;
                a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityMonitorDesigner.m;
                activityMonitorDesigner.p().setScaleX(ja1Var.c);
                activityMonitorDesigner.p().setScaleY(ja1Var.c);
                return;
            case 9:
                a.ka1 ka1Var = (a.ka1) obj2;
                int i4 = i * 100;
                ka1Var.c = i4;
                a.cp cpVar2 = com.omarea.Scene.c;
                a.fs1.D().edit().putInt("monitor_general2_refresh", i4).commit();
                a.gu0[] gu0VarArr2 = com.omarea.vtools.activities.ActivityMonitorDesigner.m;
                ((com.omarea.vtools.activities.ActivityMonitorDesigner) obj).p().setRefreshInterval(ka1Var.c);
                return;
            case 10:
                if (i == 1) {
                    a.vj1 vj1Var = a.nb1.d;
                    a.nb1 x = a.gy.x();
                    android.content.Context context = ((com.omarea.vtools.activities.ActivityOtherSettings) obj).getContext();
                    java.util.Locale locale = java.util.Locale.ENGLISH;
                    a.wv.v(locale, "ENGLISH");
                    x.getClass();
                    c = a.nb1.c(context, locale);
                } else if (i != 2) {
                    a.vj1 vj1Var2 = a.nb1.d;
                    a.nb1 x2 = a.gy.x();
                    android.content.Context context2 = ((com.omarea.vtools.activities.ActivityOtherSettings) obj).getContext();
                    java.util.Locale locale2 = java.util.Locale.CHINESE;
                    a.wv.v(locale2, "CHINESE");
                    x2.getClass();
                    c = a.nb1.c(context2, locale2);
                } else {
                    c = ((com.omarea.vtools.activities.ActivityOtherSettings) obj).getResources();
                }
                java.lang.String str = ((a.ng1) ((java.util.ArrayList) obj2).get(i)).c;
                a.vj1 vj1Var3 = a.nb1.d;
                a.nb1 x3 = a.gy.x();
                a.wv.s(str);
                x3.getClass();
                if (a.nb1.a(c, str)) {
                    a.cp cpVar3 = com.omarea.Scene.c;
                    a.fs1.X("^_^\n".concat(str), 0);
                    return;
                } else {
                    a.cp cpVar4 = com.omarea.Scene.c;
                    a.fs1.X(">_<", 0);
                    return;
                }
            case 11:
                if (i != 0) {
                    int i5 = a.x60.f681a;
                    com.omarea.vtools.activities.ActivityPowerBench activityPowerBench = (com.omarea.vtools.activities.ActivityPowerBench) obj2;
                    java.lang.String string = activityPowerBench.getString(2131952295);
                    a.wv.v(string, "getString(R.string.fps_export_csv)");
                    java.lang.String string2 = activityPowerBench.getString(2131952294);
                    a.wv.v(string2, "getString(R.string.fps_export_confirm)");
                    a.fs1.i(activityPowerBench, string, a.ai1.l(new java.lang.Object[]{(java.lang.String) obj}, 1, string2, "format(format, *args)"), new a.wc(activityPowerBench, i3), null);
                    return;
                }
                com.omarea.vtools.activities.ActivityPowerBench activityPowerBench2 = (com.omarea.vtools.activities.ActivityPowerBench) obj2;
                a.ej1 ej1Var = new a.ej1(activityPowerBench2, activityPowerBench2.getThemeMode());
                a.gu0[] gu0VarArr3 = com.omarea.vtools.activities.ActivityPowerBench.U;
                ej1Var.l(activityPowerBench2.D(), ((java.lang.String) obj) + ".jpg");
                return;
            default:
                if (i > -1) {
                    java.lang.String str2 = ((java.lang.String[]) obj2)[i];
                    android.view.View view = (android.view.View) obj;
                    a.wv.t(view, "null cannot be cast to non-null type android.widget.TextView");
                    ((android.widget.TextView) view).setText(str2);
                    return;
                }
                return;
        }
    }

    public final void c(a.zt0 zt0Var) {
        int i = this.d;
        java.lang.Object obj = this.f;
        java.lang.Object obj2 = this.e;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.wv.w(zt0Var, "$this$$receiver");
                zt0Var.t("files", (java.util.ArrayList) obj2);
                zt0Var.m((java.lang.String) obj, "dst");
                return;
            case 1:
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
            default:
                a.wv.w(zt0Var, "$this$$receiver");
                zt0Var.v("fields", (java.lang.String[]) obj2);
                zt0Var.m((a.jt0) obj, "rows");
                return;
            case 3:
                a.wv.w(zt0Var, "$this$$receiver");
                int i2 = 1;
                zt0Var.m(1, "formatVersion");
                java.lang.String[] strArr = (java.lang.String[]) obj2;
                a.l1 l1Var = (a.l1) obj;
                java.util.ArrayList arrayList = new java.util.ArrayList(strArr.length);
                for (java.lang.String str : strArr) {
                    java.lang.String name = new java.io.File(str).getName();
                    a.wv.v(name, "name");
                    l1Var.getClass();
                    a.hc1 hc1Var = new a.hc1(name, a.l1.l(name), l1Var, i2);
                    a.lt0 lt0Var = new a.lt0();
                    hc1Var.i(lt0Var);
                    arrayList.add(lt0Var);
                }
                zt0Var.t("splits", arrayList);
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                a.wv.w(zt0Var, "$this$$receiver");
                zt0Var.m("sceneN1/threads", "branch");
                zt0Var.m(((android.content.pm.PackageInfo) obj2).versionName, "versionName");
                zt0Var.m(java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT), "osVersion");
                a.re1 re1Var = (a.re1) obj;
                zt0Var.m(a.re1.m(re1Var), "platform");
                zt0Var.m(a.gy.u(), "machine");
                zt0Var.m(a.re1.n(re1Var), "scheme");
                return;
        }
    }

    public final void e(a.ng1 ng1Var) {
        int i = this.d;
        java.lang.Object obj = this.f;
        java.lang.Object obj2 = this.e;
        switch (i) {
            case 1:
                a.wv.w(ng1Var, "it");
                a.b70 b70Var = (a.b70) obj2;
                if (b70Var.p0 || b70Var.v0) {
                    return;
                }
                b70Var.W((android.view.View) obj);
                return;
            default:
                a.wv.w(ng1Var, "<anonymous parameter 0>");
                a.e70 e70Var = (a.e70) obj2;
                if (e70Var.d || e70Var.m) {
                    return;
                }
                android.widget.ListAdapter T = a.b20.T((android.view.View) obj);
                a.wv.t(T, "null cannot be cast to non-null type com.omarea.common.ui.AdapterItemChooser2");
                a.zi ziVar = (a.zi) T;
                java.util.ArrayList arrayList = ziVar.i;
                boolean[] a2 = ziVar.a();
                a.c70 c70Var = e70Var.l;
                if (c70Var != null) {
                    c70Var.a(arrayList, a2);
                }
                a.v60 v60Var = e70Var.i;
                if (v60Var != null) {
                    v60Var.a();
                    return;
                }
                return;
        }
    }

    @Override // a.bp0
    public final java.lang.Object i(java.lang.Object obj) {
        a.no1 no1Var = a.no1.f387a;
        int i = this.d;
        java.lang.Object obj2 = this.f;
        java.lang.Object obj3 = this.e;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                c((a.zt0) obj);
                return no1Var;
            case 1:
                e((a.ng1) obj);
                return no1Var;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                e((a.ng1) obj);
                return no1Var;
            case 3:
                c((a.zt0) obj);
                return no1Var;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                c((a.zt0) obj);
                return no1Var;
            case 5:
                c((a.zt0) obj);
                return no1Var;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                a.mc1 mc1Var = (a.mc1) obj;
                a.wv.w(mc1Var, "changedDir");
                com.omarea.vtools.activities.ActivityFiles activityFiles = (com.omarea.vtools.activities.ActivityFiles) obj3;
                a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityFiles.C;
                a.i8 i8Var = (a.i8) a.qv.h2(activityFiles.w, activityFiles.x);
                a.xj xjVar = (a.xj) obj2;
                if ((i8Var != null ? i8Var.f226a : null) == xjVar) {
                    activityFiles.u().setPath(mc1Var.c);
                }
                java.util.Iterator it = activityFiles.w.iterator();
                int i2 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i2 = -1;
                    } else if (((a.i8) it.next()).f226a != xjVar) {
                        i2++;
                    }
                }
                if (i2 >= 0) {
                    com.omarea.ui.TabBarView z = activityFiles.z();
                    java.lang.String F = activityFiles.F(mc1Var.c);
                    if (i2 >= 0 && i2 < z.getTabCount()) {
                        android.view.View childAt = z.m.getChildAt(i2);
                        a.wv.v(childAt, "tabsContainer.getChildAt(index)");
                        android.widget.TextView e = com.omarea.ui.TabBarView.e(childAt);
                        if (e != null) {
                            e.setText(F);
                        }
                    }
                }
                return no1Var;
            case 7:
                java.lang.String str = (java.lang.String) obj;
                a.wv.w(str, "id2");
                a.wv.M0(a.wv.b(a.z80.b), null, new a.m9((java.lang.String) obj2, str, (com.omarea.vtools.activities.ActivityFpsSession) obj3, null), 3);
                return no1Var;
            case 8:
                a(((java.lang.Number) obj).intValue());
                return no1Var;
            case 9:
                a(((java.lang.Number) obj).intValue());
                return no1Var;
            case 10:
                a(((java.lang.Number) obj).intValue());
                return no1Var;
            case 11:
                a(((java.lang.Number) obj).intValue());
                return no1Var;
            case 12:
                a(((java.lang.Number) obj).intValue());
                return no1Var;
            default:
                ((a.cr0) obj3).e.removeCallbacks((java.lang.Runnable) obj2);
                return no1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lc1(java.lang.Object obj, java.lang.Object obj2, int i) {
        super(1);
        this.d = i;
        this.f = obj;
        this.e = obj2;
    }
}
