package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class rb extends a.lj1 implements a.fp0 {
    public final /* synthetic */ java.lang.String g;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityModuleDetail h;
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rb(java.lang.String str, com.omarea.vtools.activities.ActivityModuleDetail activityModuleDetail, int i, a.ey eyVar) {
        super(2, eyVar);
        this.g = str;
        this.h = activityModuleDetail;
        this.i = i;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.rb(this.g, this.h, this.i, eyVar);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [a.be1, a.qr0] */
    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        java.lang.String str;
        com.omarea.vtools.activities.ActivityModuleDetail activityModuleDetail = this.h;
        a.b20.q1(obj);
        try {
            boolean p = new a.qr0().p(this.g, activityModuleDetail.s, this.i);
            a.cp cpVar = com.omarea.Scene.c;
            if (p) {
                activityModuleDetail.setResult(-1);
                str = "感谢参与评价";
            } else {
                str = "评分失败";
            }
            a.fs1.X(str, 0);
        } catch (java.lang.Exception unused) {
            a.cp cpVar2 = com.omarea.Scene.c;
            a.fs1.X("评分失败", 0);
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.rb rbVar = (a.rb) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        rbVar.e(no1Var);
        return no1Var;
    }
}
