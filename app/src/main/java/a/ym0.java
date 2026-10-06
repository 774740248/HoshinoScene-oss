package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ym0 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ a.re1 g;
    public final /* synthetic */ a.bn0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ym0(a.re1 re1Var, a.bn0 bn0Var, a.ey eyVar) {
        super(2, eyVar);
        this.g = re1Var;
        this.h = bn0Var;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.ym0(this.g, this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        long j;
        a.b20.q1(obj);
        a.cp cpVar = com.omarea.Scene.c;
        java.lang.String E = a.fs1.E("CLOUD_PROFILE_BRANCH", null);
        if (E == null) {
            E = "normal";
        }
        a.re1 re1Var = this.g;
        re1Var.getClass();
        android.content.Context context = re1Var.e;
        android.content.pm.PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        try {
            a.q10 q10Var = a.q10.f457a;
            java.lang.String n = a.q10.n();
            java.lang.String concat = a.tg1.i().concat("/cloud-scheduler-v2");
            a.pe1 pe1Var = new a.pe1(re1Var, E, n, packageInfo);
            a.lt0 lt0Var = new a.lt0();
            pe1Var.i(lt0Var);
            a.lt0 lt0Var2 = new a.lt0(re1Var.f(re1Var.g(lt0Var, concat)));
            a.lv lvVar = new a.lv();
            lvVar.c(lt0Var2);
            if (lvVar.j.length() > 0) {
                a.wv.M0(a.wv.b(a.z80.b), null, new a.qe1(re1Var, lvVar, null), 3);
            }
            j = lvVar.d;
        } catch (java.lang.Exception unused) {
            j = -1;
        }
        if (j > 0) {
            a.cp cpVar2 = com.omarea.Scene.c;
            if (j != a.fs1.D().getLong("CLOUD_PROFILE_VERSION", 0L)) {
                boolean z = !a.fs1.D().getBoolean("dynamic_control", false);
                a.gu0[] gu0VarArr = a.bn0.x0;
                this.h.Z(E, z);
            }
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.ym0 ym0Var = (a.ym0) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        ym0Var.e(no1Var);
        return no1Var;
    }
}
