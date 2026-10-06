package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class i3 extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityActionPage h;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityActionPage i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(com.omarea.vtools.activities.ActivityActionPage activityActionPage, com.omarea.vtools.activities.ActivityActionPage activityActionPage2, a.ey eyVar) {
        super(2, eyVar);
        this.h = activityActionPage;
        this.i = activityActionPage2;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.i3(this.h, this.i, eyVar);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, a.ma1] */
    /* JADX WARN: Type inference failed for: r5v24, types: [a.ej1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.lang.Object, a.q31] */
    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        java.util.ArrayList arrayList;
        a.dz dzVar = a.dz.c;
        int i = this.g;
        if (i == 0) {
            a.b20.q1(obj);
            a.q10 q10Var = a.q10.f457a;
            this.g = 1;
            if (q10Var.I(3000, this) == dzVar) {
                return dzVar;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a.b20.q1(obj);
                return a.no1.f387a;
            }
            a.b20.q1(obj);
        }
        com.omarea.vtools.activities.ActivityActionPage activityActionPage = this.h;
        com.omarea.krscript.model.PageNode pageNode = activityActionPage.h;
        if (pageNode == null) {
            a.wv.M1("currentPageConfig");
            throw null;
        }
        int length = pageNode.getBeforeRead().length();
        com.omarea.vtools.activities.ActivityActionPage activityActionPage2 = this.i;
        if (length > 0) {
            java.lang.String string = activityActionPage.getString(2131952707);
            a.wv.v(string, "getString(R.string.kr_page_before_load)");
            com.omarea.vtools.activities.ActivityActionPage.o(activityActionPage, string);
            java.lang.String beforeRead = pageNode.getBeforeRead();
            com.omarea.krscript.model.PageNode pageNode2 = activityActionPage.h;
            if (pageNode2 == null) {
                a.wv.M1("currentPageConfig");
                throw null;
            }
            a.wv.V(activityActionPage2, beforeRead, pageNode2);
        }
        java.lang.String string2 = activityActionPage.getString(2131952710);
        a.wv.v(string2, "getString(R.string.kr_page_loading)");
        com.omarea.vtools.activities.ActivityActionPage.o(activityActionPage, string2);
        ma1 obj2 = (ma1) new q31();
        if (pageNode.getPageConfigSh().length() > 0) {
            java.lang.String pageConfigSh = pageNode.getPageConfigSh();
            a.wv.w(pageConfigSh, "pageConfigSh");
            ej1 obj3 = new ej1();
            obj3.c = activityActionPage;
            obj3.d = pageConfigSh;
            obj3.e = pageNode;
            obj3.f = new android.os.Handler(android.os.Looper.getMainLooper());
            java.lang.String V = a.wv.V((android.app.Activity) obj3.c, (java.lang.String) obj3.d, (com.omarea.krscript.model.PageNode) obj3.e);
            java.lang.String obj4 = V != null ? a.yi1.F2(V).toString() : null;
            if (obj4 != null) {
                if (a.yi1.h2(obj4, ".xml", false)) {
                    android.app.Activity activity = (android.app.Activity) obj3.c;
                    com.omarea.krscript.model.PageNode pageNode3 = (com.omarea.krscript.model.PageNode) obj3.e;
                    arrayList = new a.q31(activity, obj4, pageNode3 != null ? pageNode3.getPageConfigDir() : null).h();
                    if (arrayList == null) {
                        ((android.os.Handler) obj3.f).post(new a.fw(15, obj3));
                    }
                } else if (a.yi1.B2(obj4, "<?xml") && a.yi1.h2(obj4, ">", false)) {
                    byte[] bytes = obj4.getBytes(a.bu.f53a);
                    a.wv.v(bytes, "this as java.lang.String).getBytes(charset)");
                    java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bytes);
                    android.app.Activity activity2 = (android.app.Activity) obj3.c;
                    a.wv.w(activity2, "context");
                    q31 obj5 = new q31();
                    /* TODO: jadx type unresolved, defaulted to Object */
                    obj5.b = "";
                    obj5.d = "";
                    obj5.f = "";
                    obj5.f461a = activity2;
                    obj5.e = byteArrayInputStream;
                    obj5.c = new a.ob1(activity2);
                    arrayList = obj5.h();
                } else if (obj4.length() > 0) {
                    ((android.os.Handler) obj3.f).post(new a.so(obj3, 5, obj4));
                }
                obj2.c = arrayList;
            }
            arrayList = null;
            obj2.c = arrayList;
        }
        if (obj2.c == null && pageNode.getPageConfigPath().length() > 0) {
            obj2.c = new a.q31(activityActionPage, pageNode.getPageConfigPath(), pageNode.getPageConfigDir()).h();
        }
        if (pageNode.getAfterRead().length() > 0) {
            java.lang.String string3 = activityActionPage.getString(2131952706);
            a.wv.v(string3, "getString(R.string.kr_page_after_load)");
            com.omarea.vtools.activities.ActivityActionPage.o(activityActionPage, string3);
            a.wv.V(activityActionPage2, pageNode.getAfterRead(), pageNode);
        }
        java.lang.Object obj6 = obj2.c;
        if (obj6 == null || ((java.util.ArrayList) obj6).size() == 0) {
            if (pageNode.getLoadFail().length() > 0) {
                java.lang.String string4 = activityActionPage.getString(2131952708);
                a.wv.v(string4, "getString(R.string.kr_page_load_fail)");
                com.omarea.vtools.activities.ActivityActionPage.o(activityActionPage, string4);
                a.wv.V(activityActionPage2, pageNode.getLoadFail(), pageNode);
                activityActionPage.g.post(new a.fw(24, activityActionPage));
            }
            a.cp cpVar = com.omarea.Scene.c;
            java.lang.String string5 = activityActionPage.getString(2131952708);
            a.wv.v(string5, "getString(R.string.kr_page_load_fail)");
            a.fs1.X(string5, 0);
            activityActionPage.g.post(new a.fw(24, activityActionPage));
            activityActionPage.finish();
        } else {
            if (pageNode.getLoadSuccess().length() > 0) {
                java.lang.String string6 = activityActionPage.getString(2131952709);
                a.wv.v(string6, "getString(R.string.kr_page_load_success)");
                com.omarea.vtools.activities.ActivityActionPage.o(activityActionPage, string6);
                a.wv.V(activityActionPage2, pageNode.getLoadSuccess(), pageNode);
            }
            a.u20 u20Var = a.z80.f728a;
            a.zx0 zx0Var = a.by0.f57a;
            a.h3 h3Var = new a.h3(activityActionPage, obj2, null);
            this.g = 2;
            if (a.wv.S1(zx0Var, h3Var, this) == dzVar) {
                return dzVar;
            }
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.i3) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
