package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class d70 implements a.c70 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f89a;
    public final /* synthetic */ a.bp0 b;

    public /* synthetic */ d70(a.bp0 bp0Var, int i) {
        this.f89a = i;
        this.b = bp0Var;
    }

    @Override // a.c70
    public final void a(java.util.ArrayList arrayList, boolean[] zArr) {
        java.lang.String str;
        int i = 0;
        int i2 = this.f89a;
        a.bp0 bp0Var = this.b;
        switch (i2) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.wv.w(arrayList, "selected");
                int length = zArr.length;
                while (true) {
                    if (i >= length) {
                        i = -1;
                    } else if (true != zArr[i]) {
                        i++;
                    }
                }
                bp0Var.i(java.lang.Integer.valueOf(i));
                return;
            default:
                a.wv.w(arrayList, "selected");
                a.ng1 ng1Var = (a.ng1) a.qv.g2(arrayList);
                if (ng1Var == null || (str = ng1Var.c) == null) {
                    return;
                }
                if (str.length() == 0) {
                    bp0Var.i(0);
                    return;
                } else {
                    bp0Var.i(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str)));
                    return;
                }
        }
    }
}
