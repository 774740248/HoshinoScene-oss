package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
/* [修复] 从 smali 还原：lj1 原为 Kotlin suspend lambda（抽象类），
   但 L1 代码以 new lj1(2, null) 实例化（jadx 丢失匿名类体），
   为保编译：去 abstract、补 e(Object) 占位、补无参构造。 */
public class lj1 extends a.fy implements a.op0, a.fp0 {
    public final int f;

    public lj1(int i, a.ey eyVar) {
        super(eyVar);
        this.f = i;
    }

    /* [修复] 保编译：子类隐式 super() 需要无参构造 */
    protected lj1() {
        this(0, null);
    }

    @Override // a.op0
    public final int d() {
        return this.f;
    }

    /* [修复] 保编译：抽象方法 e(Object) 占位实现 */
    @Override
    public java.lang.Object e(java.lang.Object obj) {
        throw new UnsupportedOperationException("Method not decompiled: a.lj1.e");
    }

    /* [修复] 保编译：fp0.g(Object,Object) 占位实现（L1 以 fp0 接收 lambda） */
    @Override
    public java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        throw new UnsupportedOperationException("Method not decompiled: a.lj1.g");
    }

    @Override // a.iq
    public final java.lang.String toString() {
        if (this.c != null) {
            return super.toString();
        }
        a.na1.f375a.getClass();
        java.lang.String a2 = a.oa1.a(this);
        a.wv.v(a2, "renderLambdaToString(this)");
        return a2;
    }
}
