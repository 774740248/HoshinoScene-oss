package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ot1 {

    /* renamed from: a, reason: collision with root package name */
    public a.nt1 f423a;

    public ot1(int i, android.view.animation.Interpolator interpolator, long j) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            this.f423a = new a.mt1(a.b0.j(i, interpolator, j));
        } else {
            this.f423a = new a.kt1(i, interpolator, j);
        }
    }
}
