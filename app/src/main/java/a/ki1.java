package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ki1 {

    /* renamed from: a, reason: collision with root package name */
    public int f294a;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public int[] f;
    public final /* synthetic */ androidx.recyclerview.widget.StaggeredGridLayoutManager g;

    public ki1(androidx.recyclerview.widget.StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.f294a = -1;
        this.b = Integer.MIN_VALUE;
        this.c = false;
        this.d = false;
        this.e = false;
        int[] iArr = this.f;
        if (iArr != null) {
            java.util.Arrays.fill(iArr, -1);
        }
    }
}
