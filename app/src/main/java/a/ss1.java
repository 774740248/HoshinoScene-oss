package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ss1 implements a.j41 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f538a = 0;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public ss1(a.vs1 vs1Var, java.lang.String str) {
        this.c = vs1Var;
        this.b = str;
    }

    @Override // a.j41
    public final void a(java.lang.String str) {
        int i = this.f538a;
        java.lang.Object obj = this.c;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                try {
                    a.lt0 lt0Var = new a.lt0();
                    if (str != null && !str.isEmpty()) {
                        lt0Var.m(str, "absPath");
                        ((android.webkit.WebView) ((a.vs1) obj).c.d).post(new a.g2(this, 7, lt0Var));
                        return;
                    }
                    lt0Var.m(null, "absPath");
                    ((android.webkit.WebView) ((a.vs1) obj).c.d).post(new a.g2(this, 7, lt0Var));
                    return;
                } catch (java.lang.Exception unused) {
                    return;
                }
            default:
                if (str != null) {
                    com.omarea.vtools.activities.ActivityActionPage activityActionPage = (com.omarea.vtools.activities.ActivityActionPage) this.b;
                    activityActionPage.g.post(new a.ua0(activityActionPage, (com.omarea.krscript.model.PageMenuOption) obj, str, 8));
                    return;
                }
                return;
        }
    }

    @Override // a.j41
    public final java.lang.String b() {
        switch (this.f538a) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                return "*/*";
            default:
                com.omarea.krscript.model.PageMenuOption pageMenuOption = (com.omarea.krscript.model.PageMenuOption) this.c;
                if (pageMenuOption.getMime().length() == 0) {
                    return null;
                }
                return pageMenuOption.getMime();
        }
    }

    @Override // a.j41
    public final java.lang.String c() {
        switch (this.f538a) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                return null;
            default:
                com.omarea.krscript.model.PageMenuOption pageMenuOption = (com.omarea.krscript.model.PageMenuOption) this.c;
                if (pageMenuOption.getSuffix().length() == 0) {
                    return null;
                }
                return pageMenuOption.getSuffix();
        }
    }

    @Override // a.j41
    public final int d() {
        switch (this.f538a) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                return 0;
            default:
                java.lang.String type = ((com.omarea.krscript.model.PageMenuOption) this.c).getType();
                if (a.wv.e(type, "folder")) {
                    return 1;
                }
                a.wv.e(type, "file");
                return 0;
        }
    }

    public ss1(com.omarea.krscript.model.PageMenuOption pageMenuOption, com.omarea.vtools.activities.ActivityActionPage activityActionPage) {
        this.b = activityActionPage;
        this.c = pageMenuOption;
    }
}
