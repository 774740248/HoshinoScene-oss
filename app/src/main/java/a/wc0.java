package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class wc0 {
    public static final a.vj1 i = new a.vj1(a.vk.f);

    /* renamed from: a, reason: collision with root package name */
    public final a.vj1 f657a = new a.vj1(a.vk.g);
    public final a.nk b;
    public final a.nk c;
    public final a.nk d;
    public final a.nk e;
    public final a.nk f;
    public final a.nk g;
    public final a.vj1 h;

    public wc0() {
        a.cp cpVar = com.omarea.Scene.c;
        this.b = new a.nk(a.fs1.t(), "features/fas_blacklist.conf");
        this.c = new a.nk(a.fs1.t(), "features/fas_whitelist.conf");
        this.d = new a.nk(a.fs1.t(), "features/fas_fps_offset.conf");
        this.e = new a.nk(a.fs1.t(), "features/fas_middle_offset.conf");
        this.f = new a.nk(a.fs1.t(), "fas_offset.conf");
        this.g = new a.nk(a.fs1.t(), "features/fas_fps_levels.conf");
        this.h = new a.vj1(new a.cd1(3, this));
    }

    public static java.lang.Integer[] c() {
        return new java.lang.Integer[]{240, 185, 165, 144, 120, 90, 72, 60, 50, 48, 45, 40, 30, 24};
    }

    public static boolean e() {
        a.cp cpVar = com.omarea.Scene.c;
        return !a.wv.e(a.fs1.E("CLOUD_PROFILE_BRANCH", ""), "lp");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean g() {
        /*
            a.cp r0 = com.omarea.Scene.c
            java.lang.String r0 = "CLOUD_PROFILE_BRANCH"
            java.lang.String r1 = ""
            java.lang.String r0 = a.fs1.E(r0, r1)
            java.lang.String r1 = "lp"
            boolean r0 = a.wv.e(r0, r1)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L24
            a.nk r0 = a.b11.c
            java.lang.String r0 = a.tg1.k()
            java.lang.String r3 = "SOURCE_SCENE_ONLINE"
            boolean r0 = a.wv.e(r0, r3)
            if (r0 == 0) goto L24
            r0 = r2
            goto L25
        L24:
            r0 = r1
        L25:
            a.b11 r3 = new a.b11
            a.lv r3 = a.b11.b()
            if (r3 == 0) goto L30
            java.lang.Boolean r3 = r3.l
            goto L31
        L30:
            r3 = 0
        L31:
            if (r0 == 0) goto L3b
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r0 = a.wv.e(r3, r0)
            if (r0 == 0) goto L43
        L3b:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = a.wv.e(r3, r0)
            if (r0 == 0) goto L52
        L43:
            a.vj1 r0 = a.wc0.i
            java.lang.Object r0 = r0.a()
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r0.length()
            if (r0 <= 0) goto L52
            r1 = r2
        L52:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a.wc0.g():boolean");
    }

    public final java.util.Set a() {
        a.nk nkVar = this.c;
        java.lang.String str = (java.lang.String) nkVar.d;
        a.wv.w(str, "path");
        if (!new java.io.File(str).exists()) {
            a.q10 q10Var = a.q10.f457a;
            java.lang.String L = a.q10.L("path-basic-info", str, 10000L);
            if (!a.yi1.B2(L, "dir") && !a.yi1.B2(L, "file")) {
                a.cp cpVar = com.omarea.Scene.c;
                java.lang.String[] stringArray = a.fs1.t().getResources().getStringArray(2130903048);
                a.wv.v(stringArray, "Scene.context.resources.…ray.config_fas_whitelist)");
                for (java.lang.String str2 : stringArray) {
                    nkVar.M(str2, "1");
                }
            }
        }
        java.util.Set keySet = ((java.util.HashMap) nkVar.e).keySet();
        a.wv.v(keySet, "whiteListFile.exists().r…teListFile.keys\n        }");
        return keySet;
    }

    public final java.util.ArrayList b(java.lang.String str) {
        a.wv.w(str, "app");
        java.lang.String B = this.g.B(str, a.op.P1(c(), ","));
        a.wv.v(B, "fasFPSLevels.getValue(ap…vels().joinToString(\",\"))");
        java.util.List y2 = a.yi1.y2(B, new java.lang.String[]{","});
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = y2.iterator();
        while (it.hasNext()) {
            java.lang.Integer c2 = a.wi1.c2((java.lang.String) it.next());
            if (c2 != null) {
                arrayList.add(c2);
            }
        }
        return arrayList;
    }

    public final boolean d() {
        return ((java.lang.Boolean) this.f657a.a()).booleanValue();
    }

    public final boolean f(java.lang.String str) {
        return e() ? a().contains(str) : !this.b.B(str, "0").equals("1");
    }

    public final void h(java.lang.String str, boolean z) {
        if (e()) {
            a.nk nkVar = this.c;
            if (z) {
                nkVar.getClass();
                nkVar.M(str, "1");
                return;
            } else {
                ((java.util.HashMap) nkVar.e).remove(str);
                nkVar.L();
                return;
            }
        }
        boolean z2 = !z;
        a.nk nkVar2 = this.b;
        if (z2) {
            nkVar2.getClass();
            nkVar2.M(str, "1");
        } else {
            ((java.util.HashMap) nkVar2.e).remove(str);
            nkVar2.L();
        }
    }
}
