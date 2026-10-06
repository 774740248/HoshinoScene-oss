package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ii0 implements java.util.Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Rect f230a = new android.graphics.Rect();
    public final android.graphics.Rect b = new android.graphics.Rect();
    public final boolean c;
    public final a.fa0 d;

    public ii0(boolean z, a.fa0 fa0Var) {
        this.c = z;
        this.d = fa0Var;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        this.d.getClass();
        android.graphics.Rect rect = this.f230a;
        ((a.g0) obj).e(rect);
        android.graphics.Rect rect2 = this.b;
        ((a.g0) obj2).e(rect2);
        int i = rect.top;
        int i2 = rect2.top;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        int i3 = rect.left;
        int i4 = rect2.left;
        boolean z = this.c;
        if (i3 < i4) {
            return z ? 1 : -1;
        }
        if (i3 > i4) {
            return z ? -1 : 1;
        }
        int i5 = rect.bottom;
        int i6 = rect2.bottom;
        if (i5 < i6) {
            return -1;
        }
        if (i5 > i6) {
            return 1;
        }
        int i7 = rect.right;
        int i8 = rect2.right;
        if (i7 < i8) {
            return z ? 1 : -1;
        }
        if (i7 > i8) {
            return z ? -1 : 1;
        }
        return 0;
    }
}
