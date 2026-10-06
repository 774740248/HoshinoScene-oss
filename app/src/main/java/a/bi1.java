package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class bi1 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f42a;
    public float e;
    public int l;
    public int b = -1;
    public int c = -1;
    public int d = 0;
    public boolean f = false;
    public final float[] g = new float[9];
    public final float[] h = new float[9];
    public a.mp[] i = new a.mp[16];
    public int j = 0;
    public int k = 0;

    public bi1(int i) {
        this.l = i;
    }

    public final void a(a.mp mpVar) {
        int i = 0;
        while (true) {
            int i2 = this.j;
            if (i >= i2) {
                a.mp[] mpVarArr = this.i;
                if (i2 >= mpVarArr.length) {
                    this.i = (a.mp[]) java.util.Arrays.copyOf(mpVarArr, mpVarArr.length * 2);
                }
                a.mp[] mpVarArr2 = this.i;
                int i3 = this.j;
                mpVarArr2[i3] = mpVar;
                this.j = i3 + 1;
                return;
            }
            if (this.i[i] == mpVar) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void b(a.mp mpVar) {
        int i = this.j;
        int i2 = 0;
        while (i2 < i) {
            if (this.i[i2] == mpVar) {
                while (i2 < i - 1) {
                    a.mp[] mpVarArr = this.i;
                    int i3 = i2 + 1;
                    mpVarArr[i2] = mpVarArr[i3];
                    i2 = i3;
                }
                this.j--;
                return;
            }
            i2++;
        }
    }

    public final void c() {
        this.l = 5;
        this.d = 0;
        this.b = -1;
        this.c = -1;
        this.e = 0.0f;
        this.f = false;
        int i = this.j;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2] = null;
        }
        this.j = 0;
        this.k = 0;
        this.f42a = false;
        java.util.Arrays.fill(this.h, 0.0f);
    }

    public final void d(a.mp mpVar) {
        int i = this.j;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2].h(mpVar, false);
        }
        this.j = 0;
    }

    public final java.lang.String toString() {
        return "" + this.b;
    }
}
