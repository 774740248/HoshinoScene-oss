package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class be1 extends a.qr0 {
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0023. Please report as an issue. */
    public static com.omarea.model.MagiskModuleUnofficial q(a.lt0 lt0Var) {
        try {
            com.omarea.model.MagiskModuleUnofficial magiskModuleUnofficial = new com.omarea.model.MagiskModuleUnofficial();
            java.util.Iterator i = lt0Var.i();
            a.wv.v(i, "item.keys()");
            while (i.hasNext()) {
                java.lang.String str = (java.lang.String) i.next();
                if (str != null) {
                    switch (str.hashCode()) {
                        case -1973090466:
                            if (!str.equals("detailUrl")) {
                                break;
                            } else {
                                magiskModuleUnofficial.setDetailUrl(lt0Var.h(str));
                                break;
                            }
                        case -1724546052:
                            if (!str.equals("description")) {
                                break;
                            } else {
                                magiskModuleUnofficial.setDescription(lt0Var.h(str));
                                break;
                            }
                        case -1406328437:
                            if (!str.equals("author")) {
                                break;
                            } else {
                                magiskModuleUnofficial.setAuthor(lt0Var.h(str));
                                break;
                            }
                        case -1211148345:
                            if (!str.equals("downloadUrl")) {
                                break;
                            } else {
                                magiskModuleUnofficial.setDownloadUrl(lt0Var.h(str));
                                break;
                            }
                        case -980226692:
                            if (!str.equals("praise")) {
                                break;
                            } else {
                                magiskModuleUnofficial.setPraise(lt0Var.d(str));
                                break;
                            }
                        case -896505829:
                            if (!str.equals("source")) {
                                break;
                            } else {
                                magiskModuleUnofficial.setSource(lt0Var.h(str));
                                break;
                            }
                        case -815589143:
                            if (!str.equals("targetSDK")) {
                                break;
                            } else {
                                magiskModuleUnofficial.setTargetSDK(java.lang.Integer.valueOf(lt0Var.d("targetSDK")));
                                break;
                            }
                        case 3355:
                            if (!str.equals("id")) {
                                break;
                            } else {
                                magiskModuleUnofficial.setId(lt0Var.h(str));
                                break;
                            }
                        case 115792:
                            if (!str.equals("uid")) {
                                break;
                            } else {
                                magiskModuleUnofficial.setUid(lt0Var.h(str));
                                break;
                            }
                        case 3075641:
                            if (!str.equals("dbId")) {
                                break;
                            } else {
                                magiskModuleUnofficial.setDbId(lt0Var.h(str));
                                break;
                            }
                        case 3321751:
                            if (!str.equals("like")) {
                                break;
                            } else {
                                magiskModuleUnofficial.setLike(lt0Var.d(str));
                                break;
                            }
                        case 3373707:
                            if (!str.equals("name")) {
                                break;
                            } else {
                                magiskModuleUnofficial.setName(lt0Var.h(str));
                                break;
                            }
                        case 3492908:
                            if (!str.equals("rank")) {
                                break;
                            } else {
                                magiskModuleUnofficial.setRank(lt0Var.c(str));
                                break;
                            }
                        case 688591589:
                            if (!str.equals("versionCode")) {
                                break;
                            } else {
                                try {
                                    magiskModuleUnofficial.setVersionCode(java.lang.String.valueOf(lt0Var.g(str)));
                                    break;
                                } catch (java.lang.Exception unused) {
                                    magiskModuleUnofficial.setVersionCode(lt0Var.h(str));
                                    break;
                                }
                            }
                        case 688906115:
                            if (!str.equals("versionName")) {
                                break;
                            } else {
                                magiskModuleUnofficial.setVersionName(lt0Var.h(str));
                                break;
                            }
                        case 1312704747:
                            if (!str.equals("downloads")) {
                                break;
                            } else {
                                magiskModuleUnofficial.setDownloads(lt0Var.d(str));
                                break;
                            }
                        case 1671642405:
                            if (!str.equals("dislike")) {
                                break;
                            } else {
                                magiskModuleUnofficial.setDislike(lt0Var.d(str));
                                break;
                            }
                        case 2059003624:
                            if (!str.equals("detailContent")) {
                                break;
                            } else {
                                magiskModuleUnofficial.setDetailContent(lt0Var.h(str));
                                break;
                            }
                    }
                }
            }
            if (a.wv.e(magiskModuleUnofficial.getUid(), "helloklf@outlook.com")) {
                magiskModuleUnofficial.setSource("official");
            }
            if (magiskModuleUnofficial.getTargetSDK() != null) {
                java.lang.Integer targetSDK = magiskModuleUnofficial.getTargetSDK();
                int i2 = android.os.Build.VERSION.SDK_INT;
                if (targetSDK != null) {
                    if (targetSDK.intValue() != i2) {
                    }
                }
                return null;
            }
            return magiskModuleUnofficial;
        } catch (java.lang.Exception unused2) {
            return null;
        }
    }

    public void m(boolean z) {
        if (!z) {
            a.cp cpVar = com.omarea.Scene.c;
            java.lang.String E = a.fs1.E("area", "");
            if (E != null && E.length() != 0) {
                return;
            }
        }
        a.wv.M0(a.wv.b(a.z80.b), null, new a.te1(this, null), 3);
    }

    public boolean n(java.lang.String str, java.lang.String str2) {
        java.lang.String concat = a.tg1.i().concat("/scene-magisk-delete");
        a.lt0 lt0Var = new a.lt0();
        lt0Var.m(str, "dbId");
        lt0Var.m(str2, "uid");
        a.lt0 h = a.qr0.h(this, concat, lt0Var);
        return h != null && h.b("success");
    }

    public com.omarea.model.MagiskModuleUnofficial o(java.lang.String str) {
        a.wv.w(str, "dbId");
        java.lang.String concat = a.tg1.i().concat("/scene-magisk-detail");
        a.lt0 lt0Var = new a.lt0();
        lt0Var.m(str, "dbId");
        a.lt0 h = a.qr0.h(this, concat, lt0Var);
        if (h != null) {
            return q(h);
        }
        return null;
    }

    public boolean p(java.lang.String str, java.lang.String str2, int i) {
        a.wv.w(str, "dbId");
        a.wv.w(str2, "uid");
        java.lang.String concat = a.tg1.i().concat("/scene-magisk-like");
        a.lt0 lt0Var = new a.lt0();
        lt0Var.m(str, "moduleId");
        lt0Var.m(str2, "uid");
        lt0Var.n("rank", i);
        lt0Var.m("", "message");
        a.lt0 h = a.qr0.h(this, concat, lt0Var);
        return h != null && h.b("success");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object r(java.lang.String r7, a.ey r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof a.ve1
            if (r0 == 0) goto L13
            r0 = r8
            a.ve1 r0 = (a.ve1) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            a.ve1 r0 = new a.ve1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f
            a.dz r1 = a.dz.c
            int r2 = r0.h
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            a.b20.q1(r8)
            goto L43
        L28:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L30:
            a.b20.q1(r8)
            a.we1 r8 = new a.we1
            r8.<init>(r6, r7, r3)
            r0.h = r4
            r4 = 3000(0xbb8, double:1.482E-320)
            java.lang.Object r8 = a.wv.T1(r4, r8, r0)
            if (r8 != r1) goto L43
            return r1
        L43:
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L4f
            java.lang.CharSequence r7 = a.yi1.F2(r8)
            java.lang.String r3 = r7.toString()
        L4f:
            java.lang.String r7 = "OK"
            boolean r7 = a.wv.e(r3, r7)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.be1.r(java.lang.String, a.ey):java.lang.Object");
    }

    public void s(java.lang.Runnable runnable) {
        a.wv.M0(a.wv.b(a.z80.b), null, new a.ue1(this, runnable, null), 3);
    }
}
