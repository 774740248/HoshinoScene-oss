package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class um0 extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ a.re1 h;
    public final /* synthetic */ java.lang.String i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ a.bn0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public um0(a.re1 re1Var, java.lang.String str, boolean z, boolean z2, a.bn0 bn0Var, a.ey eyVar) {
        super(2, eyVar);
        this.h = re1Var;
        this.i = str;
        this.j = z;
        this.k = z2;
        this.l = bn0Var;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.um0(this.h, this.i, this.j, this.k, this.l, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        int i;
        a.dz dzVar = a.dz.c;
        int i2 = this.g;
        a.bn0 bn0Var = this.l;
        if (i2 == 0) {
            a.b20.q1(obj);
            a.re1 re1Var = this.h;
            re1Var.getClass();
            java.lang.String str = this.i;
            a.wv.w(str, "type");
            a.lv lvVar = new a.lv();
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            java.lang.String str2 = "lp";
            if (!a.wv.e(str, "lp")) {
                str2 = "ep";
                if (!a.wv.e(str, "ep")) {
                    str2 = "hp";
                }
            }
            java.lang.String concat = "sceneN1/1.0/".concat(str2);
            android.content.Context context = re1Var.e;
            android.content.pm.PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            try {
                a.q10 q10Var = a.q10.f457a;
                java.lang.String n = a.q10.n();
                java.lang.String concat2 = a.tg1.i().concat("/cloud-scheduler2");
                a.pe1 pe1Var = new a.pe1(concat, n, packageInfo, re1Var);
                a.lt0 lt0Var = new a.lt0();
                pe1Var.i(lt0Var);
                a.lt0 lt0Var2 = new a.lt0(re1Var.f(re1Var.g(lt0Var, concat2)));
                lvVar.d = 0L;
                if (lt0Var2.f329a.containsKey("files") && !a.wv.e(lt0Var2.a("files"), a.lt0.c)) {
                    a.lt0 f = lt0Var2.f("files");
                    java.util.Iterator i3 = f.i();
                    a.wv.v(i3, "files.keys()");
                    while (i3.hasNext()) {
                        java.lang.String str3 = (java.lang.String) i3.next();
                        java.lang.String K = a.gy.K(f.h(str3));
                        a.wv.v(str3, "key");
                        linkedHashMap.put(str3, K);
                    }
                }
                if (linkedHashMap.containsKey("powercfg.sh") && linkedHashMap.containsKey("manifest.json")) {
                    new a.u71().a();
                    for (java.util.Map.Entry entry : (Iterable<java.util.Map.Entry>) linkedHashMap.entrySet()) {
                        if (a.wv.e(entry.getKey(), "manifest.json")) {
                            try {
                                lvVar.c(new a.lt0((java.lang.String) entry.getValue()));
                                a.b11.g = null;
                                a.b11.f = null;
                                a.q10 q10Var2 = a.q10.f457a;
                                a.q10.A("version-update");
                            } catch (java.lang.Exception unused) {
                            }
                        }
                        java.lang.String str4 = a.pe0.f434a;
                        byte[] bytes = ((java.lang.String) entry.getValue()).getBytes(a.bu.f53a);
                        a.wv.v(bytes, "this as java.lang.String).getBytes(charset)");
                        if (!a.pe0.i(context, (java.lang.String) entry.getKey(), bytes)) {
                            a.cp cpVar = com.omarea.Scene.c;
                            a.fs1.X("Unable to save the profile: " + entry.getKey(), 0);
                        }
                    }
                }
                i = 0;
            } catch (java.lang.Exception unused2) {
                i = 0;
                a.q10 q10Var3 = a.q10.f457a;
                a.wv.w(concat, "branchDir");
                try {
                    lvVar.c(new a.lt0(a.q10.L("download-profile", concat, 15000L)));
                } catch (java.lang.Exception unused3) {
                }
            }
            long j = lvVar.d;
            boolean z = this.j;
            if (j > 0) {
                a.cp cpVar2 = com.omarea.Scene.c;
                a.fs1.D().edit().putString("scene_profile_source", "SOURCE_SCENE_ONLINE").putLong("CLOUD_PROFILE_VERSION", lvVar.d).putString("CLOUD_PROFILE_BRANCH", str).putString("machine", a.gy.u()).apply();
                if (!a.wv.e(str, "normal")) {
                    a.wc0 wc0Var = new a.wc0();
                    if (a.wc0.e()) {
                        wc0Var.a();
                    } else {
                        java.lang.String[] a2 = new a.yi(a.fs1.t()).a();
                        a.wv.v(((java.util.HashMap) wc0Var.b.e).keySet(), "blackListFile.keys");
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        int length = a2.length;
                        while (i < length) {
                            java.lang.String str5 = a2[i];
                            if (!a.q10.a.contains(str5)) {
                                arrayList.add(str5);
                            }
                            i++;
                        }
                        a.qv.y2(arrayList);
                    }
                }
                if (!z && this.k && !bn0Var.C) {
                    bn0Var.u0.getClass();
                    a.lv b = a.b11.b();
                    if (b != null && b.c) {
                        a.u20 u20Var = a.z80.f728a;
                        a.zx0 zx0Var = a.by0.f57a;
                        a.rm0 rm0Var = new a.rm0(bn0Var, null);
                        this.g = 1;
                        if (a.wv.S1(zx0Var, rm0Var, this) == dzVar) {
                            return dzVar;
                        }
                    }
                }
                a.gu0[] gu0VarArr = a.bn0.x0;
                bn0Var.getClass();
                a.u20 u20Var2 = a.z80.f728a;
                a.wv.M0(a.wv.b(a.by0.f57a), null, new a.qm0(bn0Var, null), 3);
                java.util.ArrayList arrayList2 = a.dc0.f93a;
                a.dc0.a(a.kc0.u, null);
            } else if (j == 0) {
                if (!bn0Var.C && !z) {
                    a.u20 u20Var3 = a.z80.f728a;
                    a.zx0 zx0Var2 = a.by0.f57a;
                    a.sm0 sm0Var = new a.sm0(bn0Var, null);
                    this.g = 2;
                    if (a.wv.S1(zx0Var2, sm0Var, this) == dzVar) {
                        return dzVar;
                    }
                }
            } else if (!bn0Var.C && !z) {
                a.u20 u20Var4 = a.z80.f728a;
                a.zx0 zx0Var3 = a.by0.f57a;
                a.tm0 tm0Var = new a.tm0(bn0Var, null);
                this.g = 3;
                if (a.wv.S1(zx0Var3, tm0Var, this) == dzVar) {
                    return dzVar;
                }
            }
        } else if (i2 == 1) {
            a.b20.q1(obj);
            a.gu0[] gu0VarArr2 = a.bn0.x0;
            bn0Var.getClass();
            a.u20 u20Var22 = a.z80.f728a;
            a.wv.M0(a.wv.b(a.by0.f57a), null, new a.qm0(bn0Var, null), 3);
            java.util.ArrayList arrayList22 = a.dc0.f93a;
            a.dc0.a(a.kc0.u, null);
        } else {
            if (i2 != 2 && i2 != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.b20.q1(obj);
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.um0) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
