package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class v7 extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityFastShare h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7(com.omarea.vtools.activities.ActivityFastShare activityFastShare, a.ey eyVar) {
        super(2, eyVar);
        this.h = activityFastShare;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.v7(this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        if (i == 0) {
            a.b20.q1(obj);
            a.gy gyVar = a.gy.e;
            this.g = 1;
            obj = gyVar.M(this);
            if (obj == dzVar) {
                return dzVar;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a.b20.q1(obj);
                return a.no1.f387a;
            }
            a.b20.q1(obj);
        }
        a.y21 y21Var = (a.y21) obj;
        com.omarea.vtools.activities.ActivityFastShare activityFastShare = this.h;
        if (y21Var != null) {
            a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityFastShare.P;
            long j = y21Var.c;
            activityFastShare.getClass();
            java.lang.String s = com.omarea.vtools.activities.ActivityFastShare.s(j);
            java.lang.String str = y21Var.f701a;
            boolean z = y21Var.e;
            java.lang.String g = z ? a.ai1.g("🤖 ", str) : a.ai1.g("📂 ", str);
            java.lang.String str2 = y21Var.d;
            java.lang.String string = (str2.length() <= 0 || z) ? "" : activityFastShare.getString(2131952469, str2);
            a.wv.v(string, "if (offer.dest.isNotEmpt…                } else \"\"");
            a.u20 u20Var = a.z80.f728a;
            a.zx0 zx0Var = a.by0.f57a;
            a.u7 u7Var = new a.u7(this.h, g, y21Var, s, string, null);
            this.g = 2;
            if (a.wv.S1(zx0Var, u7Var, this) == dzVar) {
                return dzVar;
            }
        } else {
            a.cp cpVar = com.omarea.Scene.c;
            java.lang.String string2 = activityFastShare.getString(2131952439);
            a.wv.v(string2, "getString(R.string.fs_offer_failed)");
            a.fs1.X(string2, 0);
            activityFastShare.O = false;
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.v7) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
