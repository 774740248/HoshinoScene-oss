package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class vd extends a.lj1 implements a.fp0 {
    public final /* synthetic */ java.util.ArrayList g;
    public final /* synthetic */ a.rx0 h;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityPowerStat i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vd(java.util.ArrayList arrayList, a.rx0 rx0Var, com.omarea.vtools.activities.ActivityPowerStat activityPowerStat, a.ey eyVar) {
        super(2, eyVar);
        this.g = arrayList;
        this.h = rx0Var;
        this.i = activityPowerStat;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.vd(this.g, this.h, this.i, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        java.util.ArrayList arrayList = this.g;
        a.wv.v(arrayList, "data");
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.String str = ((com.omarea.model.PowerStatAVG) it.next()).packageName;
            a.wv.v(str, "it.packageName");
            this.h.M1(str);
        }
        a.cp cpVar = com.omarea.Scene.c;
        a.fs1.L(new a.ya(2, this.i));
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.vd vdVar = (a.vd) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        vdVar.e(no1Var);
        return no1Var;
    }
}
