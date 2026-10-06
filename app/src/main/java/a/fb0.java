package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class fb0 {

    /* renamed from: a, reason: collision with root package name */
    public int f147a = 1;
    public final a.w01 b;
    public a.w01 c;
    public a.w01 d;
    public int e;
    public int f;
    public final boolean g;
    public final int[] h;

    public fb0(a.w01 w01Var, boolean z, int[] iArr) {
        this.b = w01Var;
        this.c = w01Var;
        this.g = z;
        this.h = iArr;
    }

    public final int a(int i) {
        android.util.SparseArray sparseArray = this.c.f646a;
        a.w01 w01Var = sparseArray == null ? null : (a.w01) sparseArray.get(i);
        int i2 = 1;
        int i3 = 2;
        if (this.f147a == 2) {
            if (w01Var != null) {
                this.c = w01Var;
                this.f++;
            } else if (i == 65038) {
                b();
            } else if (i != 65039) {
                a.w01 w01Var2 = this.c;
                if (w01Var2.b != null) {
                    i3 = 3;
                    if (this.f != 1) {
                        this.d = w01Var2;
                        b();
                    } else if (c()) {
                        this.d = this.c;
                        b();
                    } else {
                        b();
                    }
                } else {
                    b();
                }
            }
            i2 = i3;
        } else if (w01Var == null) {
            b();
        } else {
            this.f147a = 2;
            this.c = w01Var;
            this.f = 1;
            i2 = i3;
        }
        this.e = i;
        return i2;
    }

    public final void b() {
        this.f147a = 1;
        this.c = this.b;
        this.f = 0;
    }

    public final boolean c() {
        int[] iArr;
        a.t01 c = this.c.b.c();
        int a2 = c.a(6);
        if ((a2 == 0 || c.b.get(a2 + c.f295a) == 0) && this.e != 65039) {
            return this.g && ((iArr = this.h) == null || java.util.Arrays.binarySearch(iArr, this.c.b.a(0)) < 0);
        }
        return true;
    }
}
