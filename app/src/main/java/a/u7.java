package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class u7 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ com.omarea.vtools.activities.ActivityFastShare g;
    public final /* synthetic */ java.lang.String h;
    public final /* synthetic */ a.y21 i;
    public final /* synthetic */ java.lang.String j;
    public final /* synthetic */ java.lang.String k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7(com.omarea.vtools.activities.ActivityFastShare activityFastShare, java.lang.String str, a.y21 y21Var, java.lang.String str2, java.lang.String str3, a.ey eyVar) {
        super(2, eyVar);
        this.g = activityFastShare;
        this.h = str;
        this.i = y21Var;
        this.j = str2;
        this.k = str3;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.u7(this.g, this.h, this.i, this.j, this.k, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        int i = a.x60.f681a;
        com.omarea.vtools.activities.ActivityFastShare activityFastShare = this.g;
        java.lang.String string = activityFastShare.getString(2131952398);
        a.wv.v(string, "getString(R.string.fs_confirm_title)");
        a.y21 y21Var = this.i;
        java.lang.String string2 = activityFastShare.getString(2131952397, this.h, new java.lang.Integer(y21Var.b), this.j, this.k);
        a.wv.v(string2, "getString(R.string.fs_co… offer.files, size, dest)");
        a.v60 i2 = a.fs1.i(activityFastShare, string, string2, new a.so(activityFastShare, 21, y21Var), new a.s7(activityFastShare, 0));
        i2.b(false);
        return i2;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.u7) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
