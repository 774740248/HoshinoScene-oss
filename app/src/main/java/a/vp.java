package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class vp {

    public vp() {
    }


    /* renamed from: a, reason: collision with root package name */
    public int f638a;
    public int b;
    public float c;
    public float d;
    public long e;
    public long f;
    public long g;
    public float h;
    public int i;

    public final float a(long j) {
        long j2 = this.e;
        if (j < j2) {
            return 0.0f;
        }
        long j3 = this.g;
        if (j3 < 0 || j < j3) {
            return a.xw0.b(((float) (j - j2)) / this.f638a, 0.0f, 1.0f) * 0.5f;
        }
        float f = this.h;
        return (a.xw0.b(((float) (j - j3)) / this.i, 0.0f, 1.0f) * f) + (1.0f - f);
    }
}
