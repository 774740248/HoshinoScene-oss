package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class w7 extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityFastShare h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7(com.omarea.vtools.activities.ActivityFastShare activityFastShare, a.ey eyVar) {
        super(2, eyVar);
        this.h = activityFastShare;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.w7(this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        if (i == 0) {
            a.b20.q1(obj);
            java.lang.String str = a.pe0.b;
            a.wv.v(str, "FileWrite.Downloads");
            a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityFastShare.P;
            com.omarea.vtools.activities.ActivityFastShare activityFastShare = this.h;
            activityFastShare.getClass();
            java.lang.String value = ((com.omarea.ui.SelectView) activityFastShare.g.a(com.omarea.vtools.activities.ActivityFastShare.P[3])).getValue();
            if (value == null) {
                value = "direct";
            }
            boolean z = !a.wv.e(value, "lan");
            a.cp cpVar = com.omarea.Scene.c;
            java.lang.String string = a.fs1.D().getString("pull_key", "");
            a.wv.s(string);
            this.g = 1;
            a.lt0 lt0Var = new a.lt0();
            lt0Var.m(str, "dest");
            lt0Var.m("", "addr");
            lt0Var.m(java.lang.Boolean.valueOf(z), "direct");
            lt0Var.m(8, "workers");
            lt0Var.m(string, "passphrase");
            a.q10 q10Var = a.q10.f457a;
            java.lang.String lt0Var2 = lt0Var.toString();
            a.wv.v(lt0Var2, "request.toString()");
            if (a.q10.K(q10Var, "pull-start", lt0Var2, null, this, 12) == dzVar) {
                return dzVar;
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
        return ((a.w7) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
