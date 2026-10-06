package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class nt1 {

    public nt1() {
        this(0, null, 0L);
    }

    /* renamed from: a, reason: collision with root package name */
    public final int f394a;
    public float b;
    public final android.view.animation.Interpolator c;
    public final long d;

    public nt1(int i, android.view.animation.Interpolator interpolator, long j) {
        this.f394a = i;
        this.c = interpolator;
        this.d = j;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        android.view.animation.Interpolator interpolator = this.c;
        return interpolator != null ? interpolator.getInterpolation(this.b) : this.b;
    }

    public int c() {
        return this.f394a;
    }

    public void d(float f) {
        this.b = f;
    }
}
