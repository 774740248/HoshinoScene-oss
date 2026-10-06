package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class y50 extends a.uu0 implements a.bp0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ a.f60 e;
    public final /* synthetic */ a.mc1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y50(a.f60 f60Var, a.mc1 mc1Var, int i) {
        super(1);
        this.d = i;
        this.e = f60Var;
        this.f = mc1Var;
    }

    public final java.lang.Boolean a(java.lang.String str) {
        boolean z;
        boolean z2;
        boolean z3;
        int i = this.d;
        a.f60 f60Var = this.e;
        a.mc1 mc1Var = this.f;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.wv.w(str, "value");
                java.lang.String obj = a.yi1.F2(str).toString();
                boolean c = f60Var.g.c(obj);
                a.ml mlVar = f60Var.f145a;
                if (!c) {
                    if (!a.wv.e(obj, mc1Var.b)) {
                        if (a.gy.H(mc1Var.a() + "/" + obj)) {
                            a.cp cpVar = com.omarea.Scene.c;
                            a.ai1.o(mlVar, 2131952433, "activity.getString(R.string.fs_name_conflict)", 0);
                        } else {
                            if (a.gy.J(mc1Var.c, mc1Var.a() + "/" + obj)) {
                                a.qo0 qo0Var = f60Var.b;
                                if (qo0Var != null) {
                                    qo0Var.b();
                                }
                            } else {
                                a.cp cpVar2 = com.omarea.Scene.c;
                                a.ai1.o(mlVar, 2131952441, "activity.getString(R.string.fs_op_failed)", 0);
                            }
                        }
                    }
                    z = true;
                    return java.lang.Boolean.valueOf(z);
                }
                a.cp cpVar3 = com.omarea.Scene.c;
                a.ai1.o(mlVar, 2131952422, "activity.getString(R.string.fs_invalid_file_name)", 0);
                z = false;
                return java.lang.Boolean.valueOf(z);
            case 3:
                a.wv.w(str, "value");
                java.lang.String f = a.ii1.f(mc1Var.a(), "/", str);
                boolean c2 = f60Var.g.c(str);
                a.ml mlVar2 = f60Var.f145a;
                if (c2) {
                    a.cp cpVar4 = com.omarea.Scene.c;
                    a.ai1.o(mlVar2, 2131952422, "activity.getString(R.string.fs_invalid_file_name)", 0);
                } else {
                    a.wv.w(f, "path");
                    if (!new java.io.File(f).exists()) {
                        a.q10 q10Var = a.q10.f457a;
                        java.lang.String L = a.q10.L("path-basic-info", f, 10000L);
                        if (!a.yi1.B2(L, "dir") && !a.yi1.B2(L, "file")) {
                            java.lang.String str2 = mc1Var.c;
                            int i2 = a.x60.f681a;
                            a.wv.M0(a.wv.b(a.z80.b), null, new a.c60(str2, f, a.fs1.J(mlVar2, null), f60Var, null), 3);
                            z2 = true;
                            return java.lang.Boolean.valueOf(z2);
                        }
                    }
                    a.cp cpVar5 = com.omarea.Scene.c;
                    a.ai1.o(mlVar2, 2131952449, "activity.getString(R.string.fs_path_exists)", 0);
                }
                z2 = false;
                return java.lang.Boolean.valueOf(z2);
            default:
                a.wv.w(str, "value");
                java.lang.String f2 = a.ii1.f(mc1Var.a(), "/", str);
                boolean c3 = f60Var.g.c(str);
                a.ml mlVar3 = f60Var.f145a;
                if (c3) {
                    a.cp cpVar6 = com.omarea.Scene.c;
                    a.ai1.o(mlVar3, 2131952422, "activity.getString(R.string.fs_invalid_file_name)", 0);
                } else {
                    a.wv.w(f2, "path");
                    if (!new java.io.File(f2).exists()) {
                        a.q10 q10Var2 = a.q10.f457a;
                        java.lang.String L2 = a.q10.L("path-basic-info", f2, 10000L);
                        if (!a.yi1.B2(L2, "dir") && !a.yi1.B2(L2, "file")) {
                            java.util.ArrayList f3 = a.b20.f(mc1Var.c);
                            int i3 = a.x60.f681a;
                            a.wv.M0(a.wv.b(a.z80.b), null, new a.e60(a.fs1.J(mlVar3, null), f60Var, f2, f3, null), 3);
                            z3 = true;
                            return java.lang.Boolean.valueOf(z3);
                        }
                    }
                    a.cp cpVar7 = com.omarea.Scene.c;
                    a.ai1.o(mlVar3, 2131952496, "activity.getString(R.string.fs_zip_exists)", 0);
                }
                z3 = false;
                return java.lang.Boolean.valueOf(z3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, a.ma1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.y50.c(java.lang.String):void");
    }

    @Override // a.bp0
    public final /* bridge */ /* synthetic */ java.lang.Object i(java.lang.Object obj) {
        a.no1 no1Var = a.no1.f387a;
        switch (this.d) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                return a((java.lang.String) obj);
            case 1:
                c((java.lang.String) obj);
                return no1Var;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                c((java.lang.String) obj);
                return no1Var;
            case 3:
                return a((java.lang.String) obj);
            default:
                return a((java.lang.String) obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y50(a.mc1 mc1Var, a.f60 f60Var, int i) {
        super(1);
        this.d = i;
        this.f = mc1Var;
        this.e = f60Var;
    }
}
