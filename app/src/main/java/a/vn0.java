package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class vn0 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ a.jo0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vn0(a.jo0 jo0Var, a.ey eyVar) {
        super(2, eyVar);
        this.g = jo0Var;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.vn0(this.g, eyVar);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [a.ng1, java.lang.Object] */
    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        a.cp cpVar = com.omarea.Scene.c;
        java.lang.String string = a.fs1.D().getString("user_name", "");
        java.lang.String str = string == null ? "" : string;
        a.jo0 jo0Var = this.g;
        java.util.concurrent.FutureTask futureTask = new java.util.concurrent.FutureTask(new a.df1(new a.kf1(jo0Var.L()), str, 0));
        a.wv.M0(a.wv.b(a.z80.b), null, new a.if1(futureTask, null), 3);
        java.util.ArrayList<com.omarea.model.DeviceBindInfo> arrayList = (java.util.ArrayList) futureTask.get();
        a.no1 no1Var = a.no1.f387a;
        if (arrayList == null) {
            return no1Var;
        }
        if (arrayList.size() > 1) {
            a.ov.Z1(arrayList, new a.py(28));
        }
        a.kk0 d = jo0Var.d();
        a.wv.t(d, "null cannot be cast to non-null type com.omarea.vtools.activities.ActivityBase");
        a.p5 p5Var = (a.p5) d;
        a.pl1 themeMode = p5Var.getThemeMode();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (com.omarea.model.DeviceBindInfo deviceBindInfo : arrayList) {
            a.ng1 obj2 = new a.ng1();
            obj2.f381a = deviceBindInfo.getCurrent() ? a.ii1.e(deviceBindInfo.getName(), jo0Var.m(2131953668)) : deviceBindInfo.getName();
            obj2.c = deviceBindInfo.getId();
            arrayList2.add(obj2);
        }
        a.cp cpVar2 = com.omarea.Scene.c;
        a.fs1.L(new a.t1(themeMode, arrayList2, this.g, p5Var, arrayList, str));
        return no1Var;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.vn0) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
