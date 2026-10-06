package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class f4 extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityAppContents h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(com.omarea.vtools.activities.ActivityAppContents activityAppContents, a.ey eyVar) {
        super(2, eyVar);
        this.h = activityAppContents;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.f4(this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        if (i == 0) {
            a.b20.q1(obj);
            a.q10 q10Var = a.q10.f457a;
            this.g = 1;
            if (q10Var.I(5000, this) == dzVar) {
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
        com.omarea.vtools.activities.ActivityAppContents activityAppContents = this.h;
        a.nk nkVar = new a.nk(activityAppContents, 12);
        java.util.List<android.content.pm.PackageInfo> installedPackages = ((android.content.pm.PackageManager) nkVar.e).getInstalledPackages(0);
        a.wv.v(installedPackages, "packageManager.getInstalledPackages(0)");
        a.wv.v1(new a.ho(installedPackages, nkVar, 527, null));
        a.u20 u20Var = a.z80.f728a;
        a.zx0 zx0Var = a.by0.f57a;
        a.e4 e4Var = new a.e4(activityAppContents, null);
        this.g = 2;
        if (a.wv.S1(zx0Var, e4Var, this) == dzVar) {
            return dzVar;
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.f4) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
