package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class n0 extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ long h;
    public final /* synthetic */ com.omarea.vtools.AccessibilitySceneMode i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(long j, com.omarea.vtools.AccessibilitySceneMode accessibilitySceneMode, a.ey eyVar) {
        super(2, eyVar);
        this.h = j;
        this.i = accessibilitySceneMode;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.n0(this.h, this.i, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        if (i == 0) {
            a.b20.q1(obj);
            a.ki0 ki0Var = new a.ki0();
            this.g = 1;
            obj = ki0Var.a(this);
            if (obj == dzVar) {
                return dzVar;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.b20.q1(obj);
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) obj;
        if ((!arrayList.isEmpty()) && com.omarea.vtools.AccessibilitySceneMode.D == this.h && !arrayList.contains(a.oq0.j)) {
            this.i.c((java.lang.String) a.qv.e2(arrayList));
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.n0) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
