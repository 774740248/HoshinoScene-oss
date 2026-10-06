package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class q11 {

    public q11() {
        this(0L);
    }

    /* renamed from: a, reason: collision with root package name */
    public long f458a;
    public android.animation.TimeInterpolator c = null;
    public int d = 0;
    public int e = 1;
    public long b = 150;

    public q11(long j) {
        this.f458a = j;
    }

    public final void a(android.animation.ObjectAnimator objectAnimator) {
        objectAnimator.setStartDelay(this.f458a);
        objectAnimator.setDuration(this.b);
        objectAnimator.setInterpolator(b());
        objectAnimator.setRepeatCount(this.d);
        objectAnimator.setRepeatMode(this.e);
    }

    public final android.animation.TimeInterpolator b() {
        android.animation.TimeInterpolator timeInterpolator = this.c;
        return timeInterpolator != null ? timeInterpolator : a.el.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a.q11)) {
            return false;
        }
        a.q11 q11Var = (a.q11) obj;
        if (this.f458a == q11Var.f458a && this.b == q11Var.b && this.d == q11Var.d && this.e == q11Var.e) {
            return b().getClass().equals(q11Var.b().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f458a;
        long j2 = this.b;
        return ((((b().getClass().hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31)) * 31) + this.d) * 31) + this.e;
    }

    public final java.lang.String toString() {
        return "\n" + a.q11.class.getName() + '{' + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " delay: " + this.f458a + " duration: " + this.b + " interpolator: " + b().getClass() + " repeatCount: " + this.d + " repeatMode: " + this.e + "}\n";
    }
}
