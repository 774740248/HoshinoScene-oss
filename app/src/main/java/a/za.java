package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class za extends a.lj1 implements a.fp0 {
    public final /* synthetic */ a.b81 g;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityImg h;
    public final /* synthetic */ java.lang.String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public za(a.b81 b81Var, com.omarea.vtools.activities.ActivityImg activityImg, java.lang.String str, a.ey eyVar) {
        super(2, eyVar);
        this.g = b81Var;
        this.h = activityImg;
        this.i = str;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.za(this.g, this.h, this.i, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        this.g.a();
        int i = a.x60.f681a;
        boolean e = a.wv.e(this.i, "0");
        com.omarea.vtools.activities.ActivityImg activityImg = this.h;
        java.lang.String string = e ? activityImg.getString(2131952541) : activityImg.getString(2131952530);
        a.wv.v(string, "if (r == \"0\") {\n        …il)\n                    }");
        a.fs1.F(activityImg, string, "", null);
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.za zaVar = (a.za) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        zaVar.e(no1Var);
        return no1Var;
    }
}
