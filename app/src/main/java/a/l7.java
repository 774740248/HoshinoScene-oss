package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class l7 extends a.uu0 implements a.bp0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityFastShare e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l7(com.omarea.vtools.activities.ActivityFastShare activityFastShare, int i) {
        super(1);
        this.d = i;
        this.e = activityFastShare;
    }

    public final void a(java.lang.String str) {
        int i = this.d;
        com.omarea.vtools.activities.ActivityFastShare activityFastShare = this.e;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.wv.w(str, "it");
                com.omarea.vtools.activities.ActivityFastShare.p(activityFastShare, new a.w00(2, activityFastShare), false);
                return;
            case 1:
                a.wv.w(str, "it");
                com.omarea.vtools.activities.ActivityFastShare.p(activityFastShare, new a.w00(3, activityFastShare), true);
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                a.wv.w(str, "it");
                a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityFastShare.P;
                activityFastShare.D();
                activityFastShare.A(true);
                activityFastShare.L = a.wv.M0(a.wv.b(a.z80.b), null, new a.w7(activityFastShare, null), 3);
                return;
            default:
                a.wv.w(str, "it");
                a.tg tgVar = new a.tg();
                java.lang.String str2 = activityFastShare.D;
                a.wv.s(str2);
                tgVar.setPackageName(str2);
                com.omarea.vtools.activities.ActivityFastShare.o(activityFastShare, tgVar);
                return;
        }
    }

    @Override // a.bp0
    public final /* bridge */ /* synthetic */ java.lang.Object i(java.lang.Object obj) {
        a.no1 no1Var = a.no1.f387a;
        switch (this.d) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a((java.lang.String) obj);
                return no1Var;
            case 1:
                a((java.lang.String) obj);
                return no1Var;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                a((java.lang.String) obj);
                return no1Var;
            default:
                a((java.lang.String) obj);
                return no1Var;
        }
    }
}
