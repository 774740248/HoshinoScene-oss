package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class k8 extends a.uu0 implements a.bp0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityFiles e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k8(com.omarea.vtools.activities.ActivityFiles activityFiles, int i) {
        super(1);
        this.d = i;
        this.e = activityFiles;
    }

    public final void a(java.lang.String str) {
        int i = this.d;
        com.omarea.vtools.activities.ActivityFiles activityFiles = this.e;
        switch (i) {
            case 1:
                a.wv.w(str, "keyword");
                a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityFiles.C;
                a.xj t = activityFiles.t();
                if (t != null) {
                    t.h = a.yi1.F2(str).toString();
                    t.p();
                    t.f();
                    return;
                }
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                a.wv.w(str, "keyword");
                a.gu0[] gu0VarArr2 = com.omarea.vtools.activities.ActivityFiles.C;
                a.xj t2 = activityFiles.t();
                if (t2 != null) {
                    t2.h = a.yi1.F2(str).toString();
                    t2.p();
                    t2.f();
                    return;
                }
                return;
            case 3:
                a.wv.w(str, "path");
                a.gu0[] gu0VarArr3 = com.omarea.vtools.activities.ActivityFiles.C;
                activityFiles.s();
                a.xj t3 = activityFiles.t();
                if (t3 != null) {
                    t3.v(a.fs1.r(str));
                    return;
                }
                return;
            default:
                a.wv.w(str, "path");
                a.gu0[] gu0VarArr4 = com.omarea.vtools.activities.ActivityFiles.C;
                a.xj t4 = activityFiles.t();
                if (t4 != null) {
                    t4.v(a.fs1.r(str));
                    return;
                }
                return;
        }
    }

    @Override // a.bp0
    public final java.lang.Object i(java.lang.Object obj) {
        a.no1 no1Var = a.no1.f387a;
        com.omarea.vtools.activities.ActivityFiles activityFiles = this.e;
        int i = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.mc1 mc1Var = (a.mc1) obj;
                a.wv.w(mc1Var, "file");
                a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityFiles.C;
                ((a.f60) activityFiles.z.a()).d(mc1Var);
                return no1Var;
            case 1:
                a((java.lang.String) obj);
                return no1Var;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                a((java.lang.String) obj);
                return no1Var;
            case 3:
                a((java.lang.String) obj);
                return no1Var;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                int intValue = ((java.lang.Number) obj).intValue();
                switch (i) {
                    case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                        a.gu0[] gu0VarArr2 = com.omarea.vtools.activities.ActivityFiles.C;
                        activityFiles.E(intValue);
                        return no1Var;
                    default:
                        com.omarea.vtools.activities.ActivityFiles.o(activityFiles, intValue);
                        return no1Var;
                }
            case 5:
                int intValue2 = ((java.lang.Number) obj).intValue();
                switch (i) {
                    case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                        a.gu0[] gu0VarArr3 = com.omarea.vtools.activities.ActivityFiles.C;
                        activityFiles.E(intValue2);
                        return no1Var;
                    default:
                        com.omarea.vtools.activities.ActivityFiles.o(activityFiles, intValue2);
                        return no1Var;
                }
            default:
                a((java.lang.String) obj);
                return no1Var;
        }
    }
}
