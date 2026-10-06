package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class hb extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityMain h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hb(com.omarea.vtools.activities.ActivityMain activityMain, a.ey eyVar) {
        super(2, eyVar);
        this.h = activityMain;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.hb(this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        java.util.List list;
        java.lang.String str;
        java.util.List list2;
        a.dz dzVar = a.dz.c;
        int i = this.g;
        com.omarea.vtools.activities.ActivityMain activityMain = this.h;
        if (i == 0) {
            a.b20.q1(obj);
            a.q10 q10Var = a.q10.f457a;
            java.lang.String t = a.q10.t();
            if (!a.wv.e(t, "basic")) {
                android.content.Context applicationContext = activityMain.getApplicationContext();
                a.wv.v(applicationContext, "applicationContext");
                a.xe1 xe1Var = new a.xe1(applicationContext);
                a.cp cpVar = com.omarea.Scene.c;
                android.content.SharedPreferences D = a.fs1.D();
                java.lang.String str2 = xe1Var.b;
                if (!D.contains(str2)) {
                    a.fs1.O(str2, a.op.P1(new java.lang.String[]{xe1Var.c, com.omarea.vtools.activities.ActivityApplications.class.getName(), com.omarea.vtools.activities.ActivityProcess.class.getName(), null}, ","));
                    java.util.Iterator it = xe1Var.a().iterator();
                    int i2 = 0;
                    while (it.hasNext()) {
                        java.lang.Object next = it.next();
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            a.b20.p1();
                            throw null;
                        }
                        xe1Var.d(i2, (a.ng1) next);
                        i2 = i3;
                    }
                }
            }
            a.q10 q10Var2 = a.q10.f457a;
            if (a.q10.r() && a.wv.e(t, "root")) {
                this.g = 1;
                obj = q10Var2.x(this);
                if (obj == dzVar) {
                    return dzVar;
                }
            }
            return a.no1.f387a;
        }
        if (i != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        a.b20.q1(obj);
        if (!((java.lang.Boolean) obj).booleanValue()) {
            a.q10 q10Var3 = a.q10.f457a;
            a.q10.h();
        }
        a.b11.c.U();
        a.cp cpVar2 = com.omarea.Scene.c;
        java.lang.String str3 = "";
        java.lang.String string = a.fs1.D().getString("random_id2", "");
        if (string != null && string.length() > 0) {
            a.q10 q10Var4 = a.q10.f457a;
            java.lang.String g = a.q10.g(string);
            int hashCode = g.hashCode();
            if (hashCode == -1309235419 ? g.equals("expired") : hashCode == 1959784951 ? g.equals("invalid") : !(hashCode != 2127581733 || !g.equals("not-you"))) {
                a.fs1.X(activityMain.getString(2131952780) + " [" + g + "]", 0);
                a.b20.e1(null);
                a.b20.f1(null);
            }
        }
        if (a.b20.E0() && a.b20.D0()) {
            a.cp cpVar3 = com.omarea.Scene.c;
            android.app.Application t2 = a.fs1.t();
            try {
                java.lang.String str4 = a.b20.f0() + "module.prop";
                a.wv.w(str4, "path");
                a.nu0 nu0Var = a.nu0.f395a;
                java.lang.String d = a.nu0.d(str4);
                java.util.regex.Pattern compile = java.util.regex.Pattern.compile("\n");
                a.wv.v(compile, "compile(pattern)");
                a.wv.w(d, "input");
                a.yi1.w2(0);
                java.util.regex.Matcher matcher = compile.matcher(d);
                if (matcher.find()) {
                    java.util.ArrayList arrayList = new java.util.ArrayList(10);
                    int i4 = 0;
                    do {
                        arrayList.add(d.subSequence(i4, matcher.start()).toString());
                        i4 = matcher.end();
                    } while (matcher.find());
                    arrayList.add(d.subSequence(i4, d.length()).toString());
                    list = arrayList;
                } else {
                    list = a.b20.y0(d.toString());
                }
                java.lang.String[] strArr = (java.lang.String[]) list.toArray(new java.lang.String[0]);
                int length = strArr.length;
                int i5 = 0;
                while (true) {
                    if (i5 >= length) {
                        break;
                    }
                    java.lang.String str5 = strArr[i5];
                    if (a.yi1.B2(str5, "versionCode")) {
                        java.util.regex.Pattern compile2 = java.util.regex.Pattern.compile("=");
                        a.wv.v(compile2, "compile(pattern)");
                        a.yi1.w2(0);
                        java.util.regex.Matcher matcher2 = compile2.matcher(str5);
                        if (matcher2.find()) {
                            java.util.ArrayList arrayList2 = new java.util.ArrayList(10);
                            int i6 = 0;
                            do {
                                arrayList2.add(str5.subSequence(i6, matcher2.start()).toString());
                                i6 = matcher2.end();
                            } while (matcher2.find());
                            arrayList2.add(str5.subSequence(i6, str5.length()).toString());
                            list2 = arrayList2;
                        } else {
                            list2 = a.b20.y0(str5.toString());
                        }
                        if (java.lang.Integer.parseInt(((java.lang.String[]) list2.toArray(new java.lang.String[0]))[1]) < 140) {
                        }
                    } else {
                        i5++;
                    }
                }
                a.b20.D1("id=scene_systemless\nname=Scene的附加模块\nversion=v1.4.0\nversionCode=140\nauthor=嘟嘟ski\ndescription=Scene的辅助模块，使用Scene部分功能时可免于直接操作系统文件\nminMagisk=17000\n", "module.prop");
                byte[] a2 = a.pe0.a(t2, "addin/magisk_mount.sh");
                java.nio.charset.Charset defaultCharset = java.nio.charset.Charset.defaultCharset();
                a.wv.v(defaultCharset, "defaultCharset()");
                a.gy.W(a.b20.f0() + "magisk_mount.sh", new java.lang.String(a2, defaultCharset));
                if (a.b20.D0()) {
                    java.lang.String str6 = a.b20.f0() + "post-fs-data.sh";
                    a.wv.w(str6, "path");
                    a.nu0 nu0Var2 = a.nu0.f395a;
                    str3 = a.nu0.d(str6);
                }
                if (!a.yi1.g2(str3, "magisk_mount.sh")) {
                    if (a.yi1.B2(str3, "#!/system/bin/sh")) {
                        str = a.yi1.v2(str3, "#!/system/bin/sh", "#!/system/bin/sh\nsh ${0%/*}/magisk_mount.sh\n");
                    } else {
                        str = "sh ${0%/*}/magisk_mount.sh\n" + str3;
                    }
                    str3 = str;
                }
                java.lang.String str7 = a.b20.f0() + "post-fs-data.sh";
                a.wv.s(str3);
                a.gy.W(str7, str3);
            } catch (java.lang.Exception unused) {
            }
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.hb) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
