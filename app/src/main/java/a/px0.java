package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class px0 extends java.io.Writer {
    public final java.lang.StringBuilder d = new java.lang.StringBuilder(128);
    public final java.lang.String c = "FragmentManager";

    public final void a() {
        java.lang.StringBuilder sb = this.d;
        if (sb.length() > 0) {
            android.util.Log.d(this.c, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        a();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                a();
            } else {
                this.d.append(c);
            }
        }
    }
}
