package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class z71 {

    /* renamed from: a, reason: collision with root package name */
    public final int f727a;
    public final int b;
    public final long c;
    public final long d;

    public z71(int i, int i2, long j, long j2) {
        this.f727a = i;
        this.b = i2;
        this.c = j;
        this.d = j2;
    }

    public static a.z71 a(java.io.File file) {
        java.io.DataInputStream dataInputStream = new java.io.DataInputStream(new java.io.FileInputStream(file));
        try {
            a.z71 z71Var = new a.z71(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return z71Var;
        } catch (java.lang.Throwable th) {
            try {
                dataInputStream.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void b(java.io.File file) {
        file.delete();
        java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(new java.io.FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f727a);
            dataOutputStream.writeInt(this.b);
            dataOutputStream.writeLong(this.c);
            dataOutputStream.writeLong(this.d);
            dataOutputStream.close();
        } catch (java.lang.Throwable th) {
            try {
                dataOutputStream.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof a.z71)) {
            return false;
        }
        a.z71 z71Var = (a.z71) obj;
        return this.b == z71Var.b && this.c == z71Var.c && this.f727a == z71Var.f727a && this.d == z71Var.d;
    }

    public final int hashCode() {
        return java.util.Objects.hash(java.lang.Integer.valueOf(this.b), java.lang.Long.valueOf(this.c), java.lang.Integer.valueOf(this.f727a), java.lang.Long.valueOf(this.d));
    }
}
