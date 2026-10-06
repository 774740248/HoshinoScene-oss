package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class kk1 {

    /* renamed from: a, reason: collision with root package name */
    public int f295a;
    public java.nio.ByteBuffer b;
    public int c;
    public int d;

    public kk1() {
        if (a.fa0.d == null) {
            a.fa0.d = new a.fa0(12);
        }
    }

    public final int a(int i) {
        if (i < this.d) {
            return this.b.getShort(this.c + i);
        }
        return 0;
    }
}
