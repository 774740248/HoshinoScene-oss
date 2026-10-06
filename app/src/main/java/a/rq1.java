package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class rq1 implements a.qg1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f501a;
    public final java.lang.Object b;

    public /* synthetic */ rq1(int i, java.lang.Object obj) {
        this.f501a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [a.rg1, java.util.Iterator, java.lang.Object, a.ey] */
    @Override // a.qg1
    public final java.util.Iterator iterator() {
        int i = this.f501a;
        java.lang.Object obj = this.b;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) obj;
                a.wv.w(viewGroup, "<this>");
                return new a.tq1(viewGroup);
            case 1:
                return ((java.lang.Iterable) obj).iterator();
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                return new a.aw0(this);
            case 3:
                a.fp0 fp0Var = (a.fp0) obj;
                a.wv.w(fp0Var, "block");
                a.rg1 obj2 = new a.rg1();
                obj2.f = a.wv.K(obj2, obj2, fp0Var);
                return obj2;
            default:
                return (java.util.Iterator) obj;
        }
    }

    public rq1(java.io.BufferedReader bufferedReader) {
        this.f501a = 2;
        this.b = bufferedReader;
    }
}
