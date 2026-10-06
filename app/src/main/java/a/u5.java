package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class u5 implements a.x70 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f576a;
    public final int b;
    public final int c;
    public final int d;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityChargeControl e;

    public u5(com.omarea.vtools.activities.ActivityChargeControl activityChargeControl, int i) {
        this.f576a = i;
        if (i != 1) {
            this.e = activityChargeControl;
            this.b = 1000;
            this.c = 20000;
            activityChargeControl.G.getClass();
            this.d = a.mr.c();
            return;
        }
        this.e = activityChargeControl;
        this.b = -1;
        this.c = 100;
        activityChargeControl.G.getClass();
        this.d = a.mr.b();
    }
}
