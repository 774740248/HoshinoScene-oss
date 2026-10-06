package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class gs {
    public static final void a(android.os.Bundle bundle, java.lang.String str, android.util.Size size) {
        a.wv.w(bundle, "bundle");
        a.wv.w(str, "key");
        bundle.putSize(str, size);
    }

    public static final void b(android.os.Bundle bundle, java.lang.String str, android.util.SizeF sizeF) {
        a.wv.w(bundle, "bundle");
        a.wv.w(str, "key");
        bundle.putSizeF(str, sizeF);
    }
}
