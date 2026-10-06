package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class n30 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.Executor f368a;
    public final a.s71 b;
    public final byte[] c;
    public final java.io.File d;
    public final java.lang.String e;
    public boolean f = false;
    public a.q30[] g;
    public byte[] h;

    public n30(android.content.res.AssetManager assetManager, a.dp dpVar, a.s71 s71Var, java.lang.String str, java.io.File file) {
        this.f368a = dpVar;
        this.b = s71Var;
        this.e = str;
        this.d = file;
        int i = android.os.Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i <= 33) {
            switch (i) {
                case 26:
                    bArr = a.b20.q;
                    break;
                case 27:
                    bArr = a.b20.p;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = a.b20.o;
                    break;
                case 31:
                case 32:
                case 33:
                    bArr = a.b20.n;
                    break;
            }
        }
        this.c = bArr;
    }

    public final java.io.FileInputStream a(android.content.res.AssetManager assetManager, java.lang.String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (java.io.FileNotFoundException e) {
            java.lang.String message = e.getMessage();
            if (message != null && message.contains("compressed")) {
                this.b.i();
            }
            return null;
        }
    }

    public final void b(int i, java.io.Serializable serializable) {
        this.f368a.execute(new a.m30(this, i, serializable, 0));
    }
}
