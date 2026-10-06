package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class m8 extends a.uu0 implements a.fp0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityFiles e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m8(com.omarea.vtools.activities.ActivityFiles activityFiles, int i) {
        super(2);
        this.d = i;
        this.e = activityFiles;
    }

    public final void a(a.mc1 mc1Var, a.bp0 bp0Var) {
        int i = this.d;
        com.omarea.vtools.activities.ActivityFiles activityFiles = this.e;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.wv.w(mc1Var, "file");
                a.wv.w(bp0Var, "confirm");
                a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityFiles.C;
                activityFiles.B(mc1Var, false, bp0Var);
                return;
            default:
                a.wv.w(mc1Var, "file");
                a.wv.w(bp0Var, "confirm");
                a.gu0[] gu0VarArr2 = com.omarea.vtools.activities.ActivityFiles.C;
                activityFiles.B(mc1Var, true, bp0Var);
                return;
        }
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.no1 no1Var = a.no1.f387a;
        switch (this.d) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a((a.mc1) obj, (a.bp0) obj2);
                return no1Var;
            case 1:
                a((a.mc1) obj, (a.bp0) obj2);
                return no1Var;
            default:
                int intValue = ((java.lang.Number) obj).intValue();
                boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
                a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityFiles.C;
                a.xj t = this.e.t();
                if (t != null) {
                    t.x(intValue, booleanValue);
                }
                return no1Var;
        }
    }
}
