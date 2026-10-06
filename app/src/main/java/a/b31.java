package a;

/* [修复] 从 smali 重建（b31.smali）。原为 R8 合成类，实现 a.lx，转发 OnBackInvoked 回调 */
public final class b31 implements a.lx {
    public final /* synthetic */ androidx.activity.a a;

    public b31(androidx.activity.a aVar) {
        this.a = aVar;
    }

    @Override
    public void a(java.lang.Object obj) {
        androidx.activity.a aVar = this.a;
        aVar.getClass();
        if (a.es.a()) {
            aVar.c();
        }
    }
}
