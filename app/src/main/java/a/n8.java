package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class n8 extends a.uu0 implements a.qo0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityFiles e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n8(com.omarea.vtools.activities.ActivityFiles activityFiles, int i) {
        super(0);
        this.d = i;
        this.e = activityFiles;
    }

    @Override // a.qo0
    public final java.lang.Object b() {
        a.no1 no1Var = a.no1.f387a;
        int i = this.d;
        int i2 = 0;
        com.omarea.vtools.activities.ActivityFiles activityFiles = this.e;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                switch (i) {
                    case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                        activityFiles.B(null, false, null);
                        return no1Var;
                    default:
                        java.lang.String str = a.pe0.f434a;
                        a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityFiles.C;
                        activityFiles.A(str);
                        return no1Var;
                }
            case 1:
                a.f60 f60Var = new a.f60(activityFiles, new a.vt(2, activityFiles), new a.w00(5, activityFiles));
                f60Var.d = new a.m8(activityFiles, 0);
                f60Var.e = new a.m8(activityFiles, 1);
                f60Var.f = new a.n8(activityFiles, i2);
                return f60Var;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                a.gu0[] gu0VarArr2 = com.omarea.vtools.activities.ActivityFiles.C;
                a.xj t = activityFiles.t();
                return java.lang.Boolean.valueOf(t != null && t.z);
            default:
                switch (i) {
                    case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                        activityFiles.B(null, false, null);
                        return no1Var;
                    default:
                        java.lang.String str2 = a.pe0.f434a;
                        a.gu0[] gu0VarArr3 = com.omarea.vtools.activities.ActivityFiles.C;
                        activityFiles.A(str2);
                        return no1Var;
                }
        }
    }
}
