package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class e80 extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ a.x01 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e80(a.x01 x01Var, a.ey eyVar) {
        super(2, eyVar);
        this.h = x01Var;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.e80(this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        if (i == 0) {
            a.b20.q1(obj);
            a.x01 x01Var = this.h;
            java.util.concurrent.FutureTask futureTask = new java.util.concurrent.FutureTask(new a.cf1(new a.kf1((android.app.Activity) x01Var.e), 1));
            a.wv.M0(a.wv.b(a.z80.b), null, new a.jf1(futureTask, null), 3);
            java.lang.String str = (java.lang.String) futureTask.get(3L, java.util.concurrent.TimeUnit.SECONDS);
            if (str == null || str.length() == 0) {
                a.cp cpVar = com.omarea.Scene.c;
                a.fs1.X("请截图保存上方二维码，然后使用微信扫码（在扫一扫界面右下角从相册选择图片）", 1);
            } else {
                a.zx0 zx0Var = a.by0.f57a;
                a.d80 d80Var = new a.d80(x01Var, str, null);
                this.g = 1;
                if (a.wv.S1(zx0Var, d80Var, this) == dzVar) {
                    return dzVar;
                }
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.b20.q1(obj);
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.e80) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
