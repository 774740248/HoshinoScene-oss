package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class me1 {
    public static a.me1 p;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f348a;
    public final a.au b;
    public java.lang.String c = "com.android.systemui";
    public final android.content.ContentResolver d;
    public final java.util.ArrayList e;
    public final a.ej1 f;
    public int g;
    public int h;
    public com.omarea.model.SceneConfigInfo i;
    public java.lang.String j;
    public boolean k;
    public int l;
    public static final a.tg1 m = new a.tg1(16, 0);
    public static java.lang.String n = "";
    public static final a.ab1 o = new a.ab1("^[A-Za-z0-9._]+$");
    public static final a.ab1 q = new a.ab1(" +");

    public me1(android.content.Context context, a.au auVar) {
        this.f348a = context;
        this.b = auVar;
        android.content.ContentResolver contentResolver = context.getContentResolver();
        a.wv.v(contentResolver, "context.contentResolver");
        this.d = contentResolver;
        this.e = new java.util.ArrayList();
        this.f = new a.ej1(context, 15);
        this.g = -1;
        this.h = -1;
        this.j = "none";
        this.l = -1;
    }

    public final void a(int i) {
        android.content.ContentResolver contentResolver = this.d;
        try {
            if (android.provider.Settings.System.putInt(contentResolver, "screen_brightness_mode", 0)) {
                contentResolver.notifyChange(android.provider.Settings.System.getUriFor("screen_brightness_mode"), null);
                if (i <= -1 || !android.provider.Settings.System.putInt(contentResolver, "screen_brightness", i)) {
                    return;
                }
                contentResolver.notifyChange(android.provider.Settings.System.getUriFor("screen_brightness"), null);
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public final void b() {
        android.content.ContentResolver contentResolver = this.d;
        if (this.g == -1) {
            try {
                this.g = android.provider.Settings.System.getInt(contentResolver, "screen_brightness_mode");
                this.h = android.provider.Settings.System.getInt(contentResolver, "screen_brightness");
            } catch (android.provider.Settings.SettingNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    public final void c() {
        java.lang.String string;
        if (a.wv.e(this.j, "none")) {
            int i = android.os.Build.VERSION.SDK_INT;
            android.content.ContentResolver contentResolver = this.d;
            if (i >= 30) {
                string = a.wv.e(android.provider.Settings.Secure.getString(contentResolver, "location_mode"), "3") ? "gps" : "";
            } else {
                string = android.provider.Settings.Secure.getString(contentResolver, "location_providers_allowed");
                a.wv.v(string, "{\n                Settin…RS_ALLOWED)\n            }");
            }
            this.j = string;
        }
    }

    public final boolean d() {
        int i = android.os.Build.VERSION.SDK_INT;
        android.content.ContentResolver contentResolver = this.d;
        if (i >= 30) {
            return a.wv.e(android.provider.Settings.Secure.getString(contentResolver, "location_mode"), "3");
        }
        java.lang.String string = android.provider.Settings.Secure.getString(contentResolver, "location_providers_allowed");
        a.wv.v(string, "getString(contentResolve…CATION_PROVIDERS_ALLOWED)");
        return a.yi1.g2(string, "gps");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r0v3, types: [a.fp0, a.lj1] */
    /* JADX WARN: Type inference failed for: r9v23, types: [a.fp0, a.lj1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(boolean r9, int r10, a.ey r11) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.me1.e(boolean, int, a.ey):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable f(a.ey r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof a.le1
            if (r0 == 0) goto L13
            r0 = r7
            a.le1 r0 = (a.le1) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            a.le1 r0 = new a.le1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.i
            a.dz r1 = a.dz.c
            int r2 = r0.k
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.util.ArrayList r1 = r0.h
            java.util.ArrayList r2 = r0.g
            a.me1 r0 = r0.f
            a.b20.q1(r7)
            goto L83
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            a.b20.q1(r7)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r7 = r6.e
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = a.op.J1(r7, r5)
            r4.<init>(r5)
            java.util.Iterator r7 = r7.iterator()
        L4e:
            boolean r5 = r7.hasNext()
            if (r5 == 0) goto L60
            java.lang.Object r5 = r7.next()
            a.ee1 r5 = (a.ee1) r5
            java.lang.String r5 = r5.b
            r4.add(r5)
            goto L4e
        L60:
            r2.addAll(r4)
            a.au r7 = new a.au
            android.content.Context r4 = r6.f348a
            r5 = 2
            r7.<init>(r4, r5)
            java.util.ArrayList r7 = r7.d()
            a.tg1 r4 = a.me1.m
            r0.f = r6
            r0.g = r2
            r0.h = r7
            r0.k = r3
            java.io.Serializable r0 = a.tg1.a(r4, r0)
            if (r0 != r1) goto L80
            return r1
        L80:
            r1 = r7
            r7 = r0
            r0 = r6
        L83:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L89:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto La8
            java.lang.Object r3 = r7.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r4 = r1.contains(r3)
            if (r4 == 0) goto L89
            boolean r4 = r2.contains(r3)
            if (r4 != 0) goto L89
            r2.add(r3)
            r0.n(r3)
            goto L89
        La8:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: a.me1.f(a.ey):java.io.Serializable");
    }

    public final void g(java.lang.String str, boolean z) {
        a.wv.w(str, "packageName");
        if (!a.wv.e(this.c, str) || z) {
            synchronized (this) {
                try {
                    try {
                        this.c = str;
                        com.omarea.model.SceneConfigInfo sceneConfigInfo = this.i;
                        if (sceneConfigInfo != null && !a.wv.e(sceneConfigInfo.packageName, str)) {
                            com.omarea.model.SceneConfigInfo sceneConfigInfo2 = this.i;
                            a.wv.s(sceneConfigInfo2);
                            h(sceneConfigInfo2);
                        }
                        com.omarea.model.SceneConfigInfo c = this.b.c(str);
                        this.i = c;
                        if (c == null) {
                            k();
                            l();
                            j();
                        } else {
                            if (c.aloneLight) {
                                b();
                                com.omarea.model.SceneConfigInfo sceneConfigInfo3 = this.i;
                                a.wv.s(sceneConfigInfo3);
                                a(sceneConfigInfo3.aloneLightValue);
                            } else {
                                l();
                            }
                            com.omarea.model.SceneConfigInfo sceneConfigInfo4 = this.i;
                            a.wv.s(sceneConfigInfo4);
                            final int i = 1;
                            if (sceneConfigInfo4.showMonitor) {
                                if (!a.wv.e(a.fg0.z.q(), java.lang.Boolean.TRUE)) {
                                    a.cp cpVar = com.omarea.Scene.c;
                                    a.fs1.L(new a.ce1(this));
                                }
                            } else if (this.k) {
                                a.cp cpVar2 = com.omarea.Scene.c;
                                a.fs1.L(new a.ce1(this));
                                this.k = false;
                            }
                            com.omarea.model.SceneConfigInfo sceneConfigInfo5 = this.i;
                            a.wv.s(sceneConfigInfo5);
                            if (sceneConfigInfo5.gpsOn) {
                                c();
                                if (!d()) {
                                    if (android.os.Build.VERSION.SDK_INT > 28) {
                                        a.q10 q10Var = a.q10.f457a;
                                        a.q10.k(2000L, "settings put secure location_mode 3");
                                    } else {
                                        a.q10 q10Var2 = a.q10.f457a;
                                        a.q10.k(2000L, "settings put secure location_providers_allowed +gps");
                                    }
                                }
                            } else {
                                k();
                            }
                            com.omarea.model.SceneConfigInfo sceneConfigInfo6 = this.i;
                            a.wv.s(sceneConfigInfo6);
                            if (sceneConfigInfo6.disNotice) {
                                try {
                                    int i2 = android.provider.Settings.Global.getInt(this.d, "heads_up_notifications_enabled");
                                    if (this.l < 0) {
                                        try {
                                            this.l = android.provider.Settings.Global.getInt(this.d, "heads_up_notifications_enabled");
                                        } catch (java.lang.Exception unused) {
                                        }
                                    }
                                    if (i2 != 0) {
                                        android.provider.Settings.Global.putInt(this.d, "heads_up_notifications_enabled", 0);
                                        this.d.notifyChange(android.provider.Settings.System.getUriFor("heads_up_notifications_enabled"), null);
                                    }
                                } catch (java.lang.Exception unused2) {
                                }
                            } else {
                                j();
                            }
                            com.omarea.model.SceneConfigInfo sceneConfigInfo7 = this.i;
                            a.wv.s(sceneConfigInfo7);
                            if (sceneConfigInfo7.freeze) {
                                n(str);
                            }
                            android.content.Context context = this.f348a;
                            a.wv.w(context, "context");
                            android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("scene_actions", 0);
                            java.util.ArrayList f = new a.l1(context, 11).f();
                            java.util.ArrayList arrayList = new java.util.ArrayList(a.op.J1(f, 10));
                            java.util.Iterator it = f.iterator();
                            while (it.hasNext()) {
                                a.s10 s10Var = (a.s10) it.next();
                                a.s10 s10Var2 = new a.s10();
                                s10Var2.b(s10Var.c);
                                s10Var2.a(s10Var.d);
                                arrayList.add(s10Var2);
                            }
                            java.util.Set<java.lang.String> stringSet = sharedPreferences.getStringSet(str, null);
                            if (stringSet == null) {
                                stringSet = new android.util.ArraySet<>();
                            }
                            java.util.Set<java.lang.String> set = stringSet;
                            if (!set.isEmpty()) {
                                java.lang.String j2 = a.qv.j2(set, "\n", null, null, a.ta1.f, 30);
                                a.q10 q10Var3 = a.q10.f457a;
                                a.ty tyVar = a.z80.b;
                                a.k00 k00Var = new a.k00(j2, null);
                                if ((2 & 1) != 0) {
                                    tyVar = a.ob0.c;
                                }
                                this.c = (2 & 2) != 0 ? 1 : 0;
                                a.ty W = a.wv.W(a.ob0.c, tyVar, true);
                                a.u20 u20Var = a.z80.f728a;
                                if (W != u20Var && W.g(a.gy.c) == null) {
                                    W = W.c(u20Var);
                                }
                                a.f av0Var = this.c == 2 ? new a.av0(W, k00Var) : new a.f(W, true);
                                av0Var.S(this.c, av0Var, k00Var);
                            }
                        }
                        o();
                    } catch (java.lang.Exception e) {
                        android.util.Log.e(">>>>", e.getMessage());
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void h(com.omarea.model.SceneConfigInfo sceneConfigInfo) {
        if (sceneConfigInfo.freeze) {
            java.lang.String str = sceneConfigInfo.packageName;
            a.wv.v(str, "sceneConfigInfo.packageName");
            m(str);
        }
        if (sceneConfigInfo.aloneLight) {
            try {
                int i = android.provider.Settings.System.getInt(this.d, "screen_brightness");
                if (i != sceneConfigInfo.aloneLightValue) {
                    sceneConfigInfo.aloneLightValue = i;
                    this.b.o(sceneConfigInfo);
                }
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public final a.ee1 i(java.lang.String str) {
        a.wv.w(str, "packageName");
        java.util.ArrayList arrayList = this.e;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a.ee1 ee1Var = (a.ee1) it.next();
            if (a.wv.e(ee1Var.b, str)) {
                arrayList.remove(ee1Var);
                return ee1Var;
            }
        }
        return null;
    }

    public final void j() {
        android.content.ContentResolver contentResolver = this.d;
        try {
            int i = this.l;
            if (i > -1) {
                android.provider.Settings.Global.putInt(contentResolver, "heads_up_notifications_enabled", i);
                contentResolver.notifyChange(android.provider.Settings.System.getUriFor("heads_up_notifications_enabled"), null);
                this.l = -1;
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public final void k() {
        if (a.wv.e(this.j, "none")) {
            return;
        }
        if (!a.yi1.g2(this.j, "gps")) {
            if (a.yi1.g2(this.j, "network")) {
                if (android.os.Build.VERSION.SDK_INT > 28) {
                    a.q10 q10Var = a.q10.f457a;
                    a.q10.k(2000L, "settings put secure location_mode 0");
                } else {
                    a.q10 q10Var2 = a.q10.f457a;
                    a.q10.k(2000L, "settings put secure location_providers_allowed -gps");
                }
            } else if (android.os.Build.VERSION.SDK_INT > 28) {
                a.q10 q10Var3 = a.q10.f457a;
                a.q10.k(2000L, "settings put secure location_mode 0");
            } else {
                a.q10 q10Var4 = a.q10.f457a;
                a.q10.k(2000L, "settings put secure location_providers_allowed -gps,-network");
            }
        }
        this.j = "none";
    }

    public final void l() {
        try {
            int i = this.g;
            android.content.ContentResolver contentResolver = this.d;
            if (i > -1) {
                android.provider.Settings.System.putInt(contentResolver, "screen_brightness_mode", i);
                contentResolver.notifyChange(android.provider.Settings.System.getUriFor("screen_brightness_mode"), null);
            }
            this.g = -1;
            int i2 = this.h;
            if (i2 > -1 && i == 0) {
                android.provider.Settings.System.putInt(contentResolver, "screen_brightness", i2);
                contentResolver.notifyChange(android.provider.Settings.System.getUriFor("screen_brightness"), null);
            }
            this.h = -1;
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public final void m(java.lang.String str) {
        a.wv.w(str, "packageName");
        a.ee1 i = i(str);
        if (i == null) {
            i = new a.ee1();
        }
        i.f121a = java.lang.System.currentTimeMillis();
        i.b = str;
        this.e.add(i);
    }

    public final void n(java.lang.String str) {
        a.wv.w(str, "packageName");
        i(str);
        a.ee1 ee1Var = new a.ee1();
        java.lang.System.currentTimeMillis();
        ee1Var.f121a = -1L;
        ee1Var.b = str;
        this.e.add(ee1Var);
    }

    public final void o() {
        com.omarea.model.SceneConfigInfo sceneConfigInfo = this.i;
        if (sceneConfigInfo != null) {
            a.ej1 ej1Var = this.f;
            ej1Var.getClass();
            int i = sceneConfigInfo.screenOrientation;
            android.view.WindowManager.LayoutParams layoutParams = (android.view.WindowManager.LayoutParams) ej1Var.e;
            if (i != layoutParams.screenOrientation || ((android.view.View) ej1Var.c) == null) {
                layoutParams.screenOrientation = i;
                a.cp cpVar = com.omarea.Scene.c;
                a.fs1.L(new a.tb1(i, 7, ej1Var));
            }
        }
    }
}
