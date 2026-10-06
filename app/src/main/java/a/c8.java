package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class c8 extends a.uu0 implements a.bp0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityFileSelector e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c8(com.omarea.vtools.activities.ActivityFileSelector activityFileSelector, int i) {
        super(1);
        this.d = i;
        this.e = activityFileSelector;
    }

    @Override // a.bp0
    public final java.lang.Object i(java.lang.Object obj) {
        a.no1 no1Var = a.no1.f387a;
        int i = this.d;
        com.omarea.vtools.activities.ActivityFileSelector activityFileSelector = this.e;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                java.lang.String str = (java.lang.String) obj;
                a.wv.w(str, "path");
                a.fa0 fa0Var = com.omarea.vtools.activities.ActivityFileSelector.m;
                if (((java.lang.Boolean) activityFileSelector.l.a()).booleanValue()) {
                    a.xj xjVar = activityFileSelector.h;
                    a.wv.s(xjVar);
                    xjVar.v(a.fs1.r(str));
                } else {
                    a.ti tiVar = activityFileSelector.g;
                    a.wv.s(tiVar);
                    tiVar.q(new java.io.File(a.fs1.r(str).c));
                }
                return no1Var;
            default:
                a.mc1 mc1Var = (a.mc1) obj;
                a.wv.w(mc1Var, "file");
                activityFileSelector.setResult(-1, new android.content.Intent().putExtra("file", mc1Var.c));
                activityFileSelector.finish();
                return no1Var;
        }
    }
}
