package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class eb extends a.uu0 implements a.bp0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityMagisk e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eb(com.omarea.vtools.activities.ActivityMagisk activityMagisk, int i) {
        super(1);
        this.d = i;
        this.e = activityMagisk;
    }

    public final void a(a.mc1 mc1Var) {
        int i = this.d;
        com.omarea.vtools.activities.ActivityMagisk activityMagisk = this.e;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.wv.w(mc1Var, "file");
                android.content.Intent intent = new android.content.Intent(activityMagisk, (java.lang.Class<?>) com.omarea.vtools.activities.ActivityEditor.class);
                intent.putExtra("file", mc1Var.c);
                intent.putExtra("rootMode", true);
                activityMagisk.startActivity(intent);
                return;
            default:
                a.wv.w(mc1Var, "file");
                a.gy.h(mc1Var.c);
                a.xj xjVar = activityMagisk.e;
                a.wv.s(xjVar);
                xjVar.w();
                return;
        }
    }

    @Override // a.bp0
    public final /* bridge */ /* synthetic */ java.lang.Object i(java.lang.Object obj) {
        a.no1 no1Var = a.no1.f387a;
        switch (this.d) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a((a.mc1) obj);
                return no1Var;
            default:
                a((a.mc1) obj);
                return no1Var;
        }
    }
}
