package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class mt1 extends a.nt1 {
    public final android.view.WindowInsetsAnimation e;

    public mt1(android.view.WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.e = windowInsetsAnimation;
    }

    @Override // a.nt1
    public final long a() {
        long durationMillis;
        durationMillis = this.e.getDurationMillis();
        return durationMillis;
    }

    @Override // a.nt1
    public final float b() {
        float interpolatedFraction;
        interpolatedFraction = this.e.getInterpolatedFraction();
        return interpolatedFraction;
    }

    @Override // a.nt1
    public final int c() {
        int typeMask;
        typeMask = this.e.getTypeMask();
        return typeMask;
    }

    @Override // a.nt1
    public final void d(float f) {
        this.e.setFraction(f);
    }
}
