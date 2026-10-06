package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ur1 {
    public android.view.animation.Interpolator c;
    public a.vr1 d;
    public boolean e;
    public long b = -1;
    public final a.tr1 f = new a.tr1(this);

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f605a = new java.util.ArrayList();

    public final void a() {
        if (this.e) {
            java.util.Iterator it = this.f605a.iterator();
            while (it.hasNext()) {
                ((a.sr1) it.next()).b();
            }
            this.e = false;
        }
    }

    public final void b() {
        android.view.View view;
        if (this.e) {
            return;
        }
        java.util.Iterator it = this.f605a.iterator();
        while (it.hasNext()) {
            a.sr1 sr1Var = (a.sr1) it.next();
            long j = this.b;
            if (j >= 0) {
                sr1Var.c(j);
            }
            android.view.animation.Interpolator interpolator = this.c;
            if (interpolator != null && (view = (android.view.View) sr1Var.f537a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.d != null) {
                sr1Var.d(this.f);
            }
            android.view.View view2 = (android.view.View) sr1Var.f537a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.e = true;
    }
}
