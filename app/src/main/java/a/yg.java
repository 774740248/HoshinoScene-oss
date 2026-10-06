package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class yg implements android.view.View.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ java.lang.Object e;

    public /* synthetic */ yg(int i, int i2, java.lang.Object obj) {
        this.c = i2;
        this.e = obj;
        this.d = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String appName;
        int i = this.c;
        int i2 = this.d;
        java.lang.Object obj = this.e;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.fh fhVar = (a.fh) obj;
                a.wv.w(fhVar, "this$0");
                a.bh bhVar = fhVar.m;
                if (bhVar != null) {
                    a.wv.v(view, "it");
                    bhVar.a(view, i2);
                    return;
                }
                return;
            case 1:
                a.jh jhVar = (a.jh) obj;
                a.wv.w(jhVar, "this$0");
                a.ba baVar = jhVar.n;
                if (baVar != null) {
                    a.wv.v(view, "it");
                    a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityFpsSessions.t;
                    com.omarea.vtools.activities.ActivityFpsSessions activityFpsSessions = baVar.c;
                    a.e91 adapter = activityFpsSessions.r().getAdapter();
                    a.wv.t(adapter, "null cannot be cast to non-null type com.omarea.ui.apps.AdapterAppIconList");
                    a.jh jhVar2 = (a.jh) adapter;
                    com.omarea.model.AppInfo p = jhVar2.p(i2);
                    java.lang.String packageName = p.getPackageName();
                    if (activityFpsSessions.r) {
                        if (a.wv.e(p.getPackageName(), "android")) {
                            appName = activityFpsSessions.getString(2131952286);
                            a.wv.v(appName, "getString(R.string.fps_all_apps)");
                        } else {
                            appName = p.getAppName().length() > 0 ? p.getAppName() : p.getPackageName();
                        }
                        int i3 = a.x60.f681a;
                        java.lang.String string = activityFpsSessions.getString(2131952289);
                        a.wv.v(string, "getString(R.string.fps_delete)");
                        java.lang.String string2 = activityFpsSessions.getString(2131952292);
                        a.wv.v(string2, "getString(R.string.fps_delete_desc)");
                        a.fs1.i(activityFpsSessions, string, a.ai1.l(new java.lang.Object[]{appName}, 1, string2, "format(format, *args)"), new a.so(activityFpsSessions, 26, p), new a.u9(activityFpsSessions, 0));
                        return;
                    }
                    a.wv.w(packageName, "selected");
                    if (!a.wv.e(packageName, jhVar2.l)) {
                        java.lang.String str = jhVar2.l;
                        jhVar2.l = packageName;
                        java.util.ArrayList arrayList = jhVar2.g;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(a.op.J1(arrayList, 10));
                        java.util.Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((com.omarea.model.AppInfo) it.next()).getPackageName());
                        }
                        int indexOf = arrayList2.indexOf(str);
                        if (indexOf > -1) {
                            jhVar2.g(indexOf);
                        }
                        java.util.ArrayList arrayList3 = new java.util.ArrayList(a.op.J1(arrayList, 10));
                        java.util.Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            arrayList3.add(((com.omarea.model.AppInfo) it2.next()).getPackageName());
                        }
                        int indexOf2 = arrayList3.indexOf(packageName);
                        if (indexOf2 > -1) {
                            jhVar2.g(indexOf2);
                        }
                    }
                    a.e91 adapter2 = activityFpsSessions.s().getAdapter();
                    a.wv.t(adapter2, "null cannot be cast to non-null type com.omarea.ui.fps.AdapterSessions");
                    a.dk dkVar = (a.dk) adapter2;
                    int length = packageName.length();
                    java.util.ArrayList arrayList4 = dkVar.g;
                    if (length == 0 || a.wv.e(packageName, "android")) {
                        dkVar.j = arrayList4;
                    } else {
                        java.util.ArrayList arrayList5 = new java.util.ArrayList();
                        for (java.lang.Object obj2 : arrayList4) {
                            com.omarea.model.FpsWatchSession fpsWatchSession = (com.omarea.model.FpsWatchSession) obj2;
                            if (a.wv.e(fpsWatchSession.packageName, packageName) || a.wv.e(fpsWatchSession.appName, packageName)) {
                                arrayList5.add(obj2);
                            }
                        }
                        dkVar.j = new java.util.ArrayList(arrayList5);
                    }
                    dkVar.f();
                    return;
                }
                return;
            default:
                com.omarea.ui.fw.FloatMonitorRender.b((com.omarea.ui.fw.FloatMonitorRender) obj, i2);
                return;
        }
    }
}
