package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class w10 extends a.lj1 implements a.bp0 {
    public int g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w10(int i, a.ey eyVar) {
        super(1, eyVar);
        this.h = i;
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        if (i == 0) {
            a.b20.q1(obj);
            a.q10 q10Var = a.q10.f457a;
            this.g = 1;
            obj = q10Var.y(this.h, "", this);
            if (obj == dzVar) {
                return dzVar;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.b20.q1(obj);
        }
        return obj;
    }

    @Override // a.bp0
    public final java.lang.Object i(java.lang.Object obj) {
        return new a.w10(this.h, (a.ey) obj).e(a.no1.f387a);
    }
}
