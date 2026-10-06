package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class y6 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ android.widget.TextView g;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityCpuControl h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6(android.widget.TextView textView, com.omarea.vtools.activities.ActivityCpuControl activityCpuControl, a.ey eyVar) {
        super(2, eyVar);
        this.g = textView;
        this.h = activityCpuControl;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.y6(this.g, this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        boolean B2;
        a.b20.q1(obj);
        java.io.File file = new java.io.File("/dev/cpuctl");
        if (file.exists() && file.isDirectory()) {
            B2 = true;
        } else {
            a.q10 q10Var = a.q10.f457a;
            B2 = a.yi1.B2(a.q10.L("path-basic-info", "/dev/cpuctl", 10000L), "dir");
        }
        android.widget.TextView textView = this.g;
        if (B2) {
            textView.setOnClickListener(new a.x6(textView, this.h, 0));
        } else {
            textView.setVisibility(8);
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.y6 y6Var = (a.y6) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        y6Var.e(no1Var);
        return no1Var;
    }
}
