package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class fs {
    public static final void a(android.os.Bundle bundle, java.lang.String str, android.os.IBinder iBinder) {
        a.wv.w(bundle, "bundle");
        a.wv.w(str, "key");
        bundle.putBinder(str, iBinder);
    }
}
