package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class w3 implements java.util.Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f650a;
    public final /* synthetic */ a.fp0 b;

    public /* synthetic */ w3(a.a4 a4Var, int i) {
        this.f650a = i;
        this.b = a4Var;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.f650a;
        a.fp0 fp0Var = this.b;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityAppConfig2.s;
                a.wv.w(fp0Var, "$tmp0");
                return ((java.lang.Number) fp0Var.g(obj, obj2)).intValue();
            default:
                a.gu0[] gu0VarArr2 = com.omarea.vtools.activities.ActivityAppXposedConfig.o;
                a.wv.w(fp0Var, "$tmp0");
                return ((java.lang.Number) fp0Var.g(obj, obj2)).intValue();
        }
    }
}
