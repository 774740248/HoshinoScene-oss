package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class gh1 {

    /* renamed from: a, reason: collision with root package name */
    public float f176a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public final java.util.ArrayList g = new java.util.ArrayList();
    public final java.util.ArrayList h = new java.util.ArrayList();

    public gh1() {
        d(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f) {
        float f2 = this.e;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 > 180.0f) {
            return;
        }
        float f4 = this.c;
        float f5 = this.d;
        a.ch1 ch1Var = new a.ch1(f4, f5, f4, f5);
        ch1Var.f = this.e;
        ch1Var.g = f3;
        this.h.add(new a.ah1(ch1Var));
        this.e = f;
    }

    public final void b(android.graphics.Matrix matrix, android.graphics.Path path) {
        java.util.ArrayList arrayList = this.g;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((a.eh1) arrayList.get(i)).a(matrix, path);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, a.eh1, a.dh1] */
    public final void c(float f, float f2) {
        dh1 eh1Var = new a.dh1();
        eh1Var.b = f;
        eh1Var.c = f2;
        this.g.add(eh1Var);
        a.bh1 bh1Var = new a.bh1(eh1Var, this.c, this.d);
        float b = bh1Var.b() + 270.0f;
        float b2 = bh1Var.b() + 270.0f;
        a(b);
        this.h.add(bh1Var);
        this.e = b2;
        this.c = f;
        this.d = f2;
    }

    public final void d(float f, float f2, float f3) {
        this.f176a = 0.0f;
        this.b = f;
        this.c = 0.0f;
        this.d = f;
        this.e = f2;
        this.f = (f2 + f3) % 360.0f;
        this.g.clear();
        this.h.clear();
    }
}
