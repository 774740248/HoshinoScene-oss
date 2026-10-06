package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class t3 extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityAppComponents h;
    public final /* synthetic */ android.content.pm.ComponentInfo i;
    public final /* synthetic */ java.lang.String j;
    public final /* synthetic */ java.lang.String k;
    public final /* synthetic */ a.ki l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(com.omarea.vtools.activities.ActivityAppComponents activityAppComponents, android.content.pm.ComponentInfo componentInfo, java.lang.String str, java.lang.String str2, a.ki kiVar, a.ey eyVar) {
        super(2, eyVar);
        this.h = activityAppComponents;
        this.i = componentInfo;
        this.j = str;
        this.k = str2;
        this.l = kiVar;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.t3(this.h, this.i, this.j, this.k, this.l, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        if (i == 0) {
            a.b20.q1(obj);
            com.omarea.vtools.activities.ActivityAppComponents activityAppComponents = this.h;
            android.content.pm.PackageManager packageManager = activityAppComponents.getPackageManager();
            android.content.pm.ComponentInfo componentInfo = this.i;
            int componentEnabledSetting = packageManager.getComponentEnabledSetting(new android.content.ComponentName(componentInfo.packageName, componentInfo.name));
            if (componentEnabledSetting == 0 || componentEnabledSetting == 1) {
                java.lang.String str = "pm disable " + componentInfo.packageName + "/" + componentInfo.name;
                a.wv.w(str, "cmd");
                a.q10 q10Var = a.q10.f457a;
                a.q10.k(2000L, str);
            } else {
                java.lang.String str2 = "pm enable " + componentInfo.packageName + "/" + componentInfo.name;
                a.wv.w(str2, "cmd");
                a.q10 q10Var2 = a.q10.f457a;
                a.q10.k(2000L, str2);
            }
            java.lang.String str3 = this.j;
            a.wv.v(str3, "packageName");
            java.util.ArrayList q = activityAppComponents.q(str3, this.k);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = q.iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                if (((android.content.pm.ComponentInfo) next).isEnabled()) {
                    arrayList.add(next);
                }
            }
            a.u20 u20Var = a.z80.f728a;
            a.zx0 zx0Var = a.by0.f57a;
            a.s3 s3Var = new a.s3(this.l, q, null);
            this.g = 1;
            if (a.wv.S1(zx0Var, s3Var, this) == dzVar) {
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
        return ((a.t3) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
