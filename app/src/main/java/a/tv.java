package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class tv extends a.uu0 implements a.fp0 {
    public static final a.tv e = new a.tv(0);
    public static final a.tv f = new a.tv(1);
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tv(int i) {
        super(2);
        this.d = i;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.uv uvVar;
        switch (this.d) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                java.lang.String str = (java.lang.String) obj;
                a.ry ryVar = (a.ry) obj2;
                a.wv.w(str, "acc");
                a.wv.w(ryVar, "element");
                if (str.length() == 0) {
                    return ryVar.toString();
                }
                return str + ", " + ryVar;
            default:
                a.ty tyVar = (a.ty) obj;
                a.ry ryVar2 = (a.ry) obj2;
                a.wv.w(tyVar, "acc");
                a.wv.w(ryVar2, "element");
                a.ty d = tyVar.d(ryVar2.getKey());
                a.ob0 ob0Var = a.ob0.c;
                if (d == ob0Var) {
                    return ryVar2;
                }
                a.gy gyVar = a.gy.c;
                a.hy hyVar = (a.hy) d.g(gyVar);
                if (hyVar == null) {
                    uvVar = new a.uv(ryVar2, d);
                } else {
                    a.ty d2 = d.d(gyVar);
                    if (d2 == ob0Var) {
                        return new a.uv(hyVar, ryVar2);
                    }
                    uvVar = new a.uv(hyVar, new a.uv(ryVar2, d2));
                }
                return uvVar;
        }
    }
}
