package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
/* [修复] 从 smali 还原：uu0 无抽象方法，abstract 为 R8 冗余标志，去 abstract 保编译 */
public class uu0 implements a.op0, java.io.Serializable {

    public uu0() {
        this(0);
    }
    public final int c;

    public uu0(int i) {
        this.c = i;
    }

    @Override // a.op0
    public final int d() {
        return this.c;
    }

    public final java.lang.String toString() {
        a.na1.f375a.getClass();
        java.lang.String a2 = a.oa1.a(this);
        a.wv.v(a2, "renderLambdaToString(this)");
        return a2;
    }
}
