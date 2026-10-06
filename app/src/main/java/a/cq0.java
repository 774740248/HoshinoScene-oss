package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class cq0 {

    public cq0() {
    }


    /* renamed from: a, reason: collision with root package name */
    public int f78a;
    public int b;
    public int[] c;
    public int d;

    public final void a(int i, int i2) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i2 < 0) {
            throw new java.lang.IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i3 = this.d;
        int i4 = i3 * 2;
        int[] iArr = this.c;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.c = iArr2;
            java.util.Arrays.fill(iArr2, -1);
        } else if (i4 >= iArr.length) {
            int[] iArr3 = new int[i3 * 4];
            this.c = iArr3;
            java.lang.System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = this.c;
        iArr4[i4] = i;
        iArr4[i4 + 1] = i2;
        this.d++;
    }

    public final void b(androidx.recyclerview.widget.RecyclerView recyclerView, boolean z) {
        this.d = 0;
        int[] iArr = this.c;
        if (iArr != null) {
            java.util.Arrays.fill(iArr, -1);
        }
        androidx.recyclerview.widget.a aVar = recyclerView.p;
        if (recyclerView.o == null || aVar == null || !aVar.k) {
            return;
        }
        if (z) {
            if (!recyclerView.g.g()) {
                aVar.t(recyclerView.o.c(), this);
            }
        } else if (!recyclerView.P()) {
            aVar.s(this.f78a, this.b, recyclerView.j0, this);
        }
        int i = this.d;
        if (i > aVar.l) {
            aVar.l = i;
            aVar.m = z;
            recyclerView.e.m();
        }
    }
}
