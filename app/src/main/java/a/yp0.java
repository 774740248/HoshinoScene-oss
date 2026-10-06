package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class yp0 implements a.bh {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f715a = 1;
    public final /* synthetic */ a.fh b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ android.view.KeyEvent.Callback d;

    public yp0(a.fh fhVar, com.omarea.ui.BlurViewRecyclerView blurViewRecyclerView, com.omarea.vtools.activities.ActivityFreezeApps activityFreezeApps) {
        this.b = fhVar;
        this.c = blurViewRecyclerView;
        this.d = activityFreezeApps;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
    
        if (r7.booleanValue() != false) goto L10;
     */
    @Override // a.bh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.view.View r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.f715a
            android.view.KeyEvent$Callback r1 = r5.d
            java.lang.Object r2 = r5.c
            a.fh r3 = r5.b
            java.lang.String r4 = "view"
            switch(r0) {
                case 0: goto L61;
                default: goto Ld;
            }
        Ld:
            a.wv.w(r6, r4)
            com.omarea.model.AppInfo r6 = r3.p(r7)
            a.q10 r7 = a.q10.f457a
            java.lang.String r7 = a.q10.t()
            java.lang.String r0 = "basic"
            boolean r7 = a.wv.e(r7, r0)
            if (r7 == 0) goto L49
            java.lang.Boolean r7 = r6.enabled
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L37
            java.lang.Boolean r7 = r6.suspended
            java.lang.String r0 = "appInfo.suspended"
            a.wv.v(r7, r0)
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L49
        L37:
            com.omarea.ui.BlurViewRecyclerView r2 = (com.omarea.ui.BlurViewRecyclerView) r2
            android.content.Context r6 = r2.getContext()
            r7 = 2131953083(0x7f1305bb, float:1.9542627E38)
            r0 = 0
            android.widget.Toast r6 = android.widget.Toast.makeText(r6, r7, r0)
            r6.show()
            goto L60
        L49:
            java.lang.String r7 = r6.getPackageName()
            java.lang.String r0 = "plus"
            boolean r7 = a.wv.e(r7, r0)
            if (r7 == 0) goto L5b
            com.omarea.vtools.activities.ActivityFreezeApps r1 = (com.omarea.vtools.activities.ActivityFreezeApps) r1
            com.omarea.vtools.activities.ActivityFreezeApps.access$addFreezeAppDialog(r1)
            goto L60
        L5b:
            com.omarea.vtools.activities.ActivityFreezeApps r1 = (com.omarea.vtools.activities.ActivityFreezeApps) r1     // Catch: java.lang.Exception -> L60
            com.omarea.vtools.activities.ActivityFreezeApps.access$startApp(r1, r6)     // Catch: java.lang.Exception -> L60
        L60:
            return
        L61:
            a.wv.w(r6, r4)
            a.at0 r2 = (a.at0) r2
            a.th1 r2 = (a.th1) r2
            a.sh1 r6 = r2.e
            if (r6 == 0) goto L71
            boolean r6 = r6.a()
            goto L73
        L71:
            boolean r6 = r2.f
        L73:
            if (r6 != 0) goto Lb6
            com.omarea.model.AppInfo r6 = r3.p(r7)
            com.omarea.ui.apps.Games r1 = (com.omarea.ui.apps.Games) r1
            a.gu0[] r7 = com.omarea.ui.apps.Games.l
            r1.getClass()
            int r7 = a.x60.f681a
            android.content.Context r7 = r1.getContext()
            java.lang.String r0 = "context"
            a.wv.v(r7, r0)
            android.content.Context r0 = r1.getContext()
            r2 = 2131953188(0x7f130624, float:1.954284E38)
            java.lang.String r0 = r0.getString(r2)
            java.lang.String r2 = "context.getString(R.string.perf_game_remove)"
            a.wv.v(r0, r2)
            android.content.Context r2 = r1.getContext()
            r3 = 2131953189(0x7f130625, float:1.9542842E38)
            java.lang.String r2 = r2.getString(r3)
            java.lang.String r3 = "context.getString(R.string.perf_game_remove_desc)"
            a.wv.v(r2, r3)
            a.so r3 = new a.so
            r4 = 8
            r3.<init>(r1, r4, r6)
            r6 = 0
            a.fs1.i(r7, r0, r2, r3, r6)
        Lb6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.yp0.a(android.view.View, int):void");
    }

    public yp0(a.th1 th1Var, a.fh fhVar, com.omarea.ui.apps.Games games) {
        this.c = th1Var;
        this.b = fhVar;
        this.d = games;
    }
}
