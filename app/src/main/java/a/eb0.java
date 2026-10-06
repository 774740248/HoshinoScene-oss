package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class eb0 {
    public static final java.lang.ThreadLocal d = new java.lang.ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final int f119a;
    public final a.ej1 b;
    public volatile int c = 0;

    public eb0(a.ej1 ej1Var, int i) {
        this.b = ej1Var;
        this.f119a = i;
    }

    public final int a(int i) {
        a.t01 c = c();
        int a2 = c.a(16);
        if (a2 == 0) {
            return 0;
        }
        java.nio.ByteBuffer byteBuffer = c.b;
        int i2 = a2 + c.f295a;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final int b() {
        a.t01 c = c();
        int a2 = c.a(16);
        if (a2 == 0) {
            return 0;
        }
        int i = a2 + c.f295a;
        return c.b.getInt(c.b.getInt(i) + i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [a.kk1, java.lang.Object] */
    public final a.t01 c() {
        java.lang.ThreadLocal threadLocal = d;
        a.t01 t01Var = (a.t01) threadLocal.get();
        a.t01 t01Var2 = t01Var;
        if (t01Var == null) {
            a.kk1 kk1Var = new a.t01();
            threadLocal.set(kk1Var);
            t01Var2 = (t01) kk1Var;
        }
        a.u01 u01Var = (a.u01) this.b.c;
        int a2 = u01Var.a(6);
        if (a2 != 0) {
            int i = a2 + u01Var.f295a;
            int i2 = (this.f119a * 4) + u01Var.b.getInt(i) + i + 4;
            int i3 = u01Var.b.getInt(i2) + i2;
            java.nio.ByteBuffer byteBuffer = u01Var.b;
            t01Var2.b = byteBuffer;
            if (byteBuffer != null) {
                t01Var2.f295a = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                t01Var2.c = i4;
                t01Var2.d = t01Var2.b.getShort(i4);
            } else {
                t01Var2.f295a = 0;
                t01Var2.c = 0;
                t01Var2.d = 0;
            }
        }
        return t01Var2;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        a.t01 c = c();
        int a2 = c.a(4);
        sb.append(java.lang.Integer.toHexString(a2 != 0 ? c.b.getInt(a2 + c.f295a) : 0));
        sb.append(", codepoints:");
        int b = b();
        for (int i = 0; i < b; i++) {
            sb.append(java.lang.Integer.toHexString(a(i)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
